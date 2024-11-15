package me.dio.claro.dev.bootcamp.domain.repository;

import me.dio.claro.dev.bootcamp.domain.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {
    @Query()
    List<Exercicio> findByNomeContaining(String nome);
}
