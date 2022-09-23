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
        Shortener alreadyExists = shortenerRepository.findByLongUrl(longUrl);

        if (alreadyExists == null) {
            Hashids hashids = new Hashids(longUrl);
            String token = hashids.encode(12345L);
            String shortUrl = "https://shortener.com/" + token;

            Shortener newShortener = new Shortener(shortUrl, longUrl);
            shortenerRepository.save(newShortener);
            return shortUrl;
        } else {
            return alreadyExists.getShortUrl();
        }
    }

    public String getLongUrl(String shortUrl) {
        Shortener alreadyExists = shortenerRepository.findById(shortUrl).orElse(null);

        if (alreadyExists != null) {
            return alreadyExists.getLongUrl();
        }
        return "Url for this short link does not exists";
    }
}
