package fabricadeprogramador.com.br.aulaandroid;

import java.io.Serializable;

/**
 * Created by crisnfp on 10/11/16.
 */

public class Pessoa implements Serializable {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Integer imagem;


    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String email, Integer imagem) {

        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
    }

    public Pessoa(String email) {
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getImagem() {

        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
