package main.java.entity.content;

import main.java.entity.member.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conteudo extends Post {

    private String conteudo;

    private List<Comentario> comentarios;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public Conteudo(int id, Date date, Usuario autor, String conteudo) {
        super(id, date, autor);
        this.conteudo = conteudo;
        comentarios = new ArrayList<>();
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {this.comentarios.remove(comentario);}

    public Conteudo withComentario(Comentario comentario) {
        addComentario(comentario);
        return this;
    }
}
