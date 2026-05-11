package com.example.msdelivery.controller;

import com.example.msdelivery.dto.DeliveryDTO;
import com.example.msdelivery.model.Delivery;
import com.example.msdelivery.service.DeliveryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/{pedidoId}")
    public ResponseEntity<Delivery> obtenerEstadoDelivery(@PathVariable Long pedidoId) {
        try {
            Delivery delivery = deliveryService.obtenerDeliveryPorPedido(pedidoId);
            return ResponseEntity.ok(delivery);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{pedidoId}")
    public ResponseEntity<Delivery> actualizarEstadoDelivery(@PathVariable Long pedidoId, @RequestBody DeliveryDTO deliveryDTO) {
        try {
            Delivery deliveryActualizado = deliveryService.actualizarEstadoDelivery(pedidoId, deliveryDTO.getEstado());
            return ResponseEntity.ok(deliveryActualizado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}