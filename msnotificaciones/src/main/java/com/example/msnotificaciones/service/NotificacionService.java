package com.example.msnotificaciones.service;

import com.example.msnotificaciones.dto.NotificacionDTO;
import com.example.msnotificaciones.model.Notificacion;
import com.example.msnotificaciones.repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    public Notificacion procesarNotificacion(NotificacionDTO dto) {
        // Aquí simulamos el envío de un correo o SMS imprimiendo en la consola del servidor
        System.out.println("=========================================");
        System.out.println("SIMULANDO ENVÍO DE NOTIFICACIÓN...");
        System.out.println("Pedido ID: " + dto.getPedidoId());
        System.out.println("Evento: " + dto.getEvento());
        System.out.println("Mensaje: " + dto.getMensaje());
        System.out.println("=========================================");

        // Guardamos el registro en la base de datos
        Notificacion nuevaNotificacion = new Notificacion(dto.getPedidoId(), dto.getEvento(), dto.getMensaje());
        return notificacionRepository.save(nuevaNotificacion);
    }

    public List<Notificacion> obtenerTodasLasNotificaciones() {
        return notificacionRepository.findAll();
    }
}