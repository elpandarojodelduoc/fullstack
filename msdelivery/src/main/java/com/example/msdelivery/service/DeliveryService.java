package com.example.msdelivery.service;

import com.example.msdelivery.model.Delivery;
import com.example.msdelivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public Delivery obtenerDeliveryPorPedido(Long pedidoId) {
        return deliveryRepository.findByPedidoId(pedidoId)
                .orElseThrow(() -> new RuntimeException("Delivery no encontrado para el pedido: " + pedidoId));
    }

    public Delivery actualizarEstadoDelivery(Long pedidoId, String nuevoEstado) {
        Optional<Delivery> deliveryExistente = deliveryRepository.findByPedidoId(pedidoId);

        if (deliveryExistente.isPresent()) {
            Delivery delivery = deliveryExistente.get();
            delivery.setEstado(nuevoEstado);
            return deliveryRepository.save(delivery);
        } else {
            // Si no existe, simulamos la creación inicial al cambiar el estado
            Delivery nuevoDelivery = new Delivery(pedidoId, nuevoEstado);
            return deliveryRepository.save(nuevoDelivery);
        }
    }
}