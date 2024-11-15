package me.dio.claro.dev.bootcamp.domain.repository;

import me.dio.claro.dev.bootcamp.domain.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    List<Aluno> findByNomeContaining(String nome);
    List<Aluno> findByCpf(String cpf);

}
