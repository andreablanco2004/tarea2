package com.example.library.controller;

import com.example.library.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatronController {

    @Autowired
    private PatronRepository patronRepository;

    // Your controller methods here
}