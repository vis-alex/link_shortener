package com.alex.vis.link_shortener.controller;

import com.alex.vis.link_shortener.service.ShortenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shortener")
@RequiredArgsConstructor
public class ShortenerController {

    private final ShortenerService shortenerService;

//    public String save(String longUrl) {
//
//    }
}
