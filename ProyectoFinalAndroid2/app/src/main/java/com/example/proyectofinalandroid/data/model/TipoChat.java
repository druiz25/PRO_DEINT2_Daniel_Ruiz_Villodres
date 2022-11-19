package com.example.proyectofinalandroid.data.model;

import java.util.Objects;

public class TipoChat implements Comparable<TipoChat> {
    private int icon;
    private String name;

    public TipoChat(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoChat)) return false;
        TipoChat tipoChat = (TipoChat) o;
        return getName().equals(tipoChat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(TipoChat tipoChat) {
        return this.getName().compareTo(tipoChat.getName());
    }
}
