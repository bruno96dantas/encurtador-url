package br.com.bruno96dantas.encurtadorurl.services;

import br.com.bruno96dantas.encurtadorurl.exceptions.ShortUrlException;
import br.com.bruno96dantas.encurtadorurl.models.Url;
import br.com.bruno96dantas.encurtadorurl.repositories.UrlReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UrlService {

    @Autowired
    private UrlReposiroty urlReposiroty;

    @Transactional
    public Url create(Url url) {

        return urlReposiroty.save(url);
    }

    public String select(String shortUrl) {

        Url selectedUrl = urlReposiroty.findById(shortUrl)
                .orElseThrow(() -> new ShortUrlException("Short URL does not exist"));

        return selectedUrl.getOriginalUrl();
    }
}
