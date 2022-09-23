package com.alex.vis.link_shortener.repository;

import com.alex.vis.link_shortener.model.Shortener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortenerRepository extends JpaRepository<Shortener, String> {
    Shortener findByLongUrl(String longUrl);
}
