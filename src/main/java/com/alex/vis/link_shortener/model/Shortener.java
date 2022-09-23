package com.alex.vis.link_shortener.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "urls")
public class Shortener {
    @Id
    @Column(name = "short_url")
    @NotNull
    private String logUrl;

    @Column(name = "long_url")
    @NotNull
    private String shortUrl;
}
