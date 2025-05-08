package com.example.APIClassRoom.helpers;

public enum AppiMSG {
    DONT_FOUND_STUDENT("El estudiante que buscas no se encuentra en BD"),
    DONT_FOUND_COURSE("El curso que buscas no se encuentra en la BD"),
    DONT_FOUND_INSCRIPTION("La inscripcion que buscas no se encuentra en la BD"),
    DONT_FOUND_USER("El usuario que buscas no se encuentra en la BD"),
    DONT_FOUND_TEACHER("El docente que buscas no se encuentra en BD");

    private String texto;

    AppiMSG(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
