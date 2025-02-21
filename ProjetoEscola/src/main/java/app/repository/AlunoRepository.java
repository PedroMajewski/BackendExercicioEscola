package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public List<Aluno> findByNomeStartingWith(String nome);
	
	//@Query("SELECT c FROM Carro c WHERE c.cor = :cor")
	//public List<Aluno> bucarCarroPelaCor(String Cor);
}