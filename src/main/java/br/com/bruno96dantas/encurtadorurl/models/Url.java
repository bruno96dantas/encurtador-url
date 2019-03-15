package br.com.bruno96dantas.encurtadorurl.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table
public class Url {

    @Id
    @Getter
    private String shortUrl;

    @Getter
    private String originalUrl;
    @Getter
    private LocalDate validityData;

    @Builder
    public Url(String url_original) {
        this.shortUrl = generateShortUrl();
        this.originalUrl = "http://" + url_original;
        this.validityData = createValidityData();
    }


    private String generateShortUrl() {

        return RandomStringUtils.randomAlphanumeric(5, 10);

    }

    private LocalDate createValidityData() {

        LocalDate today = LocalDate.now();
        return today.plusDays(2);
    }


}
