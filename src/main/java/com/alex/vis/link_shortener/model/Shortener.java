package com.alex.vis.link_shortener.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("shortener")
public class Shortener {
    @Id
    private int id;

    private String logUrl;

    private String shortUrl;
}
