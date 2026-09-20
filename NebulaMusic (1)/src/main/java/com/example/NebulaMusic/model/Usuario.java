package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private int txt_pseudonimo;
    private String rad_genero;
    private String sel_suscripcion;
    private String fecha_nacimiento;
    private String chk_terminos;
    private String comentarios;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String contrasenia, int txt_pseudonimo, String rad_genero, String sel_suscripcion, String fecha_nacimiento, String chk_terminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.txt_pseudonimo = txt_pseudonimo;
        this.rad_genero = rad_genero;
        this.sel_suscripcion = sel_suscripcion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.chk_terminos = chk_terminos;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(int txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getSel_suscripcion() {
        return sel_suscripcion;
    }

    public void setSel_suscripcion(String sel_suscripcion) {
        this.sel_suscripcion = sel_suscripcion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getChk_terminos() {
        return chk_terminos;
    }

    public void setChk_terminos(String chk_terminos) {
        this.chk_terminos = chk_terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
