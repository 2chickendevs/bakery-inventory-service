package com.twochickendevs.bakeryinventoryservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@RestController
public class InventoryController {
    @GetMapping("ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}