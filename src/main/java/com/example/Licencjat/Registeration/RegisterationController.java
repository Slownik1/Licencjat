package com.example.Licencjat.Registeration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/login")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterationController {

    private RegisterationService registerationService;

    @PostMapping
    public String register(@RequestBody RegisterationRequest request){
        return registerationService.register(request);
    }

    @GetMapping(path = "/confirmation")
    public String confirm(@RequestParam("token") String token) {
        return registerationService.confirmToken(token);
    }

}
