package me.dio.claro.dev.bootcamp.domain.repository;

import me.dio.claro.dev.bootcamp.domain.model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanoRepository extends JpaRepository<Plano, Integer> {
    List<Plano> findByNome(String nome);
}
