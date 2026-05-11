package com.example.msdelivery.model;

import jakarta.persistence.*;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long pedidoId;

    @Column(nullable = false)
    private String estado; // PENDIENTE, EN_CAMINO, ENTREGADO

    // Constructores, Getters y Setters
    public Delivery() {}

    public Delivery(Long pedidoId, String estado) {
        this.pedidoId = pedidoId;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getPedidoId() { return pedidoId; }
    public void setPedidoId(Long pedidoId) { this.pedidoId = pedidoId; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}