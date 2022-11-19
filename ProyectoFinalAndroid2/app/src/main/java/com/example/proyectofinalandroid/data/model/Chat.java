package com.example.proyectofinalandroid.data.model;

import android.text.style.TtsSpan;

import java.util.Date;
import java.util.List;

public class Chat {

    private String nombreChat;
    private String idChat;
    private List<User> usuariosChat;
    private Date fechaCreacion;

    public Chat() {
    }

    public Chat(String nombreChat, List<User> usuariosChat) {
        this.nombreChat = nombreChat;
        this.usuariosChat = usuariosChat;
    }

    public String getNombreChat() {
        return nombreChat;
    }

    public void setNombreChat(String nombreChat) {
        this.nombreChat = nombreChat;
    }

    public String getIdChat() {
        return idChat;
    }

    public void setIdChat(String idChat) {
        this.idChat = idChat;
    }

    public List<User> getUsuariosChat() {
        return usuariosChat;
    }

    public void setUsuariosChat(List<User> usuariosChat) {
        this.usuariosChat = usuariosChat;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "nombreChat='" + nombreChat + '\'' +
                ", idChat='" + idChat + '\'' +
                ", usuariosChat=" + usuariosChat +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        return getIdChat().equals(chat.getIdChat());
    }

    @Override
    public int hashCode() {
        return getIdChat().hashCode();
    }
}
