package br.com.estudo.projeto1.vo;

import java.io.Serializable;
import java.util.Date;
 
/**
 * 
 * @author Thallita 
 * Classe pessoa
 *
 */

public class PessoaVO implements Serializable {
  
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Date datanascimento;
	
	/**
	 * 
	 * @return integer
	 * retorno de Id de pessoa
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	
	/**
	 * 
	 * @param nome
	 * set nome de pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
 
	
	
	
}
