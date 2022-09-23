package com.alex.vis.link_shortener.controller;

import com.alex.vis.link_shortener.service.ShortenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shortener")
@RequiredArgsConstructor
public class ShortenerController {

    private final ShortenerService shortenerService;

    @PostMapping("/shorten")
    public String save(@RequestParam(name = "long_url") String longUrl) {
        return shortenerService.save(longUrl);
    }

    @GetMapping("/get_url")
    public String getLongUrl(@RequestParam(name = "short_url") String shortUrl) {
        return shortenerService.getLongUrl(shortUrl);
    }
}
