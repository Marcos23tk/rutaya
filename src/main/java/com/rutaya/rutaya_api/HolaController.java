package com.rutaya.rutaya_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String inicio() {
        return "🌍 RUTAYA está en Internet 🚀";
    }

    @GetMapping("/info")
    public String info() {
        return "Sistema turístico inteligente - RUTAYA";
    }
}
