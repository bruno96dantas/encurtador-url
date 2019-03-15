package br.com.bruno96dantas.encurtadorurl.repositories;

import br.com.bruno96dantas.encurtadorurl.models.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlReposiroty extends JpaRepository<Url, String> {
}
