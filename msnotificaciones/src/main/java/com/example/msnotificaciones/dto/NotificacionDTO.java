package com.example.msnotificaciones.dto;

public class NotificacionDTO {
    private Long pedidoId;
    private String evento;
    private String mensaje;

    // Getters y Setters
    public Long getPedidoId() { return pedidoId; }
    public void setPedidoId(Long pedidoId) { this.pedidoId = pedidoId; }
    public String getEvento() { return evento; }
    public void setEvento(String evento) { this.evento = evento; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}