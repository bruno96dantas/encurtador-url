package br.com.bruno96dantas.encurtadorurl.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class UrlTest {

    @InjectMocks
    private Url url;

    @Test
    public void shouldGenerateUrlCurta() {

        Url url = new Url("http://wwww.backendbrasil.com.br");

    }
}
