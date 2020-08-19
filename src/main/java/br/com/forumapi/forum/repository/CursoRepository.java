package br.com.forumapi.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forumapi.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
