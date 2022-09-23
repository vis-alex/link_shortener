package com.alex.vis.link_shortener.service;

import com.alex.vis.link_shortener.model.Shortener;
import com.alex.vis.link_shortener.repository.ShortenerRepository;
import lombok.RequiredArgsConstructor;
import org.hashids.Hashids;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShortenerService {
    private final ShortenerRepository shortenerRepository;

    public String save(String longUrl) {

        Hashids hashids = new Hashids(longUrl);
        String token = hashids.encode(12345L);
        return "https://shortener.com/" + token;
    }
}
