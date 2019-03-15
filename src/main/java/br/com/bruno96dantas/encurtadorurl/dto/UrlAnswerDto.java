package br.com.bruno96dantas.encurtadorurl.dto;

import br.com.bruno96dantas.encurtadorurl.models.Url;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UrlAnswerDto {

    @JsonProperty("original_url")
    private String originalUrl;

    @JsonProperty("short_url")
    private String shortUrl;

    public static UrlAnswerDto transformaEmDto(Url url) {

        return new UrlAnswerDto(url.getOriginalUrl(), url.getShortUrl());
    }
}
