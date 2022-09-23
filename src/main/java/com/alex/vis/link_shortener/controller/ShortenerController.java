package com.alex.vis.link_shortener.controller;

import com.alex.vis.link_shortener.service.ShortenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shortener")
@RequiredArgsConstructor
public class ShortenerController {

    private final ShortenerService shortenerService;

    @PostMapping("/shorten")
    public String save(@RequestParam(name = "long_url") String longUrl) {
        return shortenerService.save(longUrl);
    }
}
