package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Aluno;
import app.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository AlunoRepository;
	
	public String save(Aluno aluno) {
		this.AlunoRepository.save(aluno);
		return "Aluno salvo com sucesso!";
	}
	
	public String update(long id,Aluno aluno) {
		aluno.setId(id);
		this.AlunoRepository.save(aluno);
		return "Aluno com o ID: " + id + " editado com sucesso!";
	}
	
	public String delete(long id) {
		this.AlunoRepository.deleteById(id);
		return "Aluno deletado com sucesso!";
	}
	
	public Aluno findById(long id) {
		return this.AlunoRepository.findById(id).get();
	}
	
	public List<Aluno> findAll() {
		return this.AlunoRepository.findAll();
	}
}