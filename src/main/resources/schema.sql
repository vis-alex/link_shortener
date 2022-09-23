CREATE TABLE urls
(
    short_url varchar PRIMARY KEY NOT NULL,
    long_url  varchar UNIQUE NOT NULL
);
CREATE INDEX url_long_idx ON urls (long_url);