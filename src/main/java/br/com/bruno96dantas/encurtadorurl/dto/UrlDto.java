package br.com.bruno96dantas.encurtadorurl.dto;

import br.com.bruno96dantas.encurtadorurl.models.Url;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.persistence.Transient;

@Getter
public class UrlDto {

    @JsonProperty("original_url")
    private String originalUrl;

    @JsonProperty("short_url")
    private String shortUrl;

    @Transient
    public Url transformaParaUrl() {

        return new Url(originalUrl);
    }
}
