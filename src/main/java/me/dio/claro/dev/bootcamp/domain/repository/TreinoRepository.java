package me.dio.claro.dev.bootcamp.domain.repository;

import me.dio.claro.dev.bootcamp.domain.model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Integer> {
    List<Treino> findByNomeContaining(String nome);

}
