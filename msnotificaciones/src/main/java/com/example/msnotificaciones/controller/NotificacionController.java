package com.example.msnotificaciones.controller;

import com.example.msnotificaciones.dto.NotificacionDTO;
import com.example.msnotificaciones.model.Notificacion;
import com.example.msnotificaciones.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @PostMapping
    public ResponseEntity<Notificacion> crearNotificacion(@RequestBody NotificacionDTO notificacionDTO) {
        try {
            Notificacion notificacionGuardada = notificacionService.procesarNotificacion(notificacionDTO);
            return ResponseEntity.ok(notificacionGuardada);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Notificacion>> listarNotificaciones() {
        List<Notificacion> notificaciones = notificacionService.obtenerTodasLasNotificaciones();
        return ResponseEntity.ok(notificaciones);
    }
}