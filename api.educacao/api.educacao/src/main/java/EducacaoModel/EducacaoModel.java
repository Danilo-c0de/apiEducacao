package EducacaoModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data 
   // Lombok gera automaticamente getters, setters e outros métodos
public class EducacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}
	public void setDescricao(Object descricao2) {
		// TODO Auto-generated method stub
		
	}
}