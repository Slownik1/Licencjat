package com.example.Licencjat.Session;

import com.example.Licencjat.User.User;
import com.example.Licencjat.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SessionFilter extends OncePerRequestFilter {

    private final SessionRegister sessionRegister;
    private final UserService userService;

    @Autowired
    public SessionFilter(final SessionRegister sessionRegister, UserService userService) {
        this.sessionRegister = sessionRegister;
        this.userService = userService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

    String sessionId= request.getHeader(HttpHeaders.AUTHORIZATION);
    if(sessionId == null || sessionId.length()==0){
        filterChain.doFilter(request, response);
        return;
    }

    String username = sessionRegister.getUsernameFromSession(sessionId);
    if(username == null){
        filterChain.doFilter(request, response);
        return;
    }

        final User user = userService.loadUserByUsername(username);

        final UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user,null ,user.getAuthorities());

        auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(auth);
        filterChain.doFilter(request, response);

    }
}
