package com.example.Licencjat.Registeration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
@AllArgsConstructor
public class RegisterationController {

    private RegisterationService registerationService;

    @PostMapping
    public String register(@RequestBody RegisterationRequest request){
        return registerationService.register(request);
    }

}
