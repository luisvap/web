package br.uniso.web.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Livro")
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLivro", nullable = false)
    private Integer idLivro;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    public Livro setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
        return this;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public Livro setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "idLivro=" + idLivro + '\'' +
                "titulo=" + titulo + '\'' +
                "autor=" + autor + '\'' +
                '}';
    }
}
