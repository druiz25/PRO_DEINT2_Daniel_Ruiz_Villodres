package com.example.proyectofinalandroid.data.model;

import java.util.Date;

public class Imagen {
    private String idMessageNote;
    private String idUserCreator;

    public Imagen() {
    }

    public Imagen(String idMessageNote, String idUserCreator) {
        this.idMessageNote = idMessageNote;
        this.idUserCreator = idUserCreator;
    }

    public String getIdMessageNote() {
        return idMessageNote;
    }

    public void setIdMessageNote(String idMessageNote) {
        this.idMessageNote = idMessageNote;
    }

    public String getIdUserCreator() {
        return idUserCreator;
    }

    public void setIdUserCreator(String idUserCreator) {
        this.idUserCreator = idUserCreator;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "idMessageNote='" + idMessageNote + '\'' +
                ", idUserCreator='" + idUserCreator + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imagen imagen = (Imagen) o;

        return getIdMessageNote().equals(imagen.getIdMessageNote());
    }

    @Override
    public int hashCode() {
        return getIdMessageNote().hashCode();
    }
}
