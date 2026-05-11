package com.example.msdelivery.dto;

public class DeliveryDTO {
    private Long pedidoId;
    private String estado;

    // Getters y Setters
    public Long getPedidoId() { return pedidoId; }
    public void setPedidoId(Long pedidoId) { this.pedidoId = pedidoId; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}