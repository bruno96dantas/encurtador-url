package br.com.bruno96dantas.encurtadorurl.controllers;

import br.com.bruno96dantas.encurtadorurl.dto.UrlAnswerDto;
import br.com.bruno96dantas.encurtadorurl.dto.UrlDto;
import br.com.bruno96dantas.encurtadorurl.models.Url;
import br.com.bruno96dantas.encurtadorurl.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping()
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping
    public ResponseEntity<UrlAnswerDto> createUrl(@RequestBody UrlDto urlDto) {

        Url url = urlService.create(urlDto.transformaParaUrl());

        return new ResponseEntity<>(UrlAnswerDto.transformaEmDto(url), HttpStatus.CREATED);
    }

    @GetMapping("/{shortUrl}")
    public ResponseEntity selectOriginalUrl(@PathVariable ("shortUrl") String shortUrl) throws URISyntaxException {
        String originalUrl = urlService.select(shortUrl);

        URI redirectUrl = new URI(originalUrl);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(redirectUrl);

        return new ResponseEntity(httpHeaders, HttpStatus.SEE_OTHER);

    }

}
