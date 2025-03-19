package com.generation.crud_farmacia.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "Campo não pode ser nulo.")
    @Size(max = 255, message = "Limite de 255 caracteres.")
    private String nome;

    @NotBlank (message = "Campo não pode ser nulo.")
    @Size(max = 255, message = "Limite de 255 caracteres.")
    private String fabricante;
    
    @NotNull (message = "Campo não pode ser nulo.")
    private double quantidadeMg;
    
    @NotNull(message = "Campo não pode ser nulo.")
    private double preco;
    
    @NotNull (message = "Campo não pode ser nulo.")
    @Max(value = 500)
    private int quantidadeEstoque;
    
    @NotNull (message = "Campo não pode ser nulo.")
    private LocalDate dataValidade;
    
    @NotNull (message = "Campo não pode ser nulo.")
    @Column(nullable = false)
    private boolean necessitaReceita;
    
    @NotNull (message = "Campo não pode ser nulo.")
    private double avaliacaoMedia;
    
    @NotNull (message = "Campo não pode ser nulo.")
    private int quantidadeVendas;
    
    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getQuantidadeMg() {
		return quantidadeMg;
	}

	public void setQuantidadeMg(double quantidadeMg) {
		this.quantidadeMg = quantidadeMg;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public boolean isNecessitaReceita() {
		return necessitaReceita;
	}

	public void setNecessitaReceita(boolean necessitaReceita) {
		this.necessitaReceita = necessitaReceita;
	}

	public double getAvaliacaoMedia() {
		return avaliacaoMedia;
	}

	public void setAvaliacaoMedia(double avaliacaoMedia) {
		this.avaliacaoMedia = avaliacaoMedia;
	}

	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
    
}