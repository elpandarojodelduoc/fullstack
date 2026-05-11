# Sistema de Gestión de Pedidos - Arquitectura de Microservicios

## Estudiantes
* Renato Lobos
* Benjamín Tapia
* Nicolás
* Esteban

## Descripción del Proyecto
El proyecto consiste en un sistema distribuido basado en arquitectura de microservicios para gestionar de forma integral el flujo de una tienda online o aplicación de delivery. 
Permite el procesamiento escalable de compras, seguimiento de envíos y notificaciones, con persistencia de datos real y separación de responsabilidades bajo el patrón CSR.

## Funcionalidades Implementadas
En este repositorio se encuentran los microservicios correspondientes a:
* **ms-delivery:** Gestión y actualización de los estados de envío de los pedidos (ej. PENDIENTE, EN_CAMINO, ENTREGADO). Cuenta con validaciones JSR 380 y persistencia en base de datos.
* **ms-notificaciones:** Registro y simulación del envío de alertas a los usuarios ante distintos eventos del sistema.

## Pasos para ejecutar
1. Clonar este repositorio en el entorno local.
2. Iniciar el servidor de base de datos MySQL (por ejemplo, mediante Laragon).
3. Crear los entornos de base de datos vacíos ejecutando las siguientes consultas SQL:
   - `CREATE DATABASE delivery_db;`
   - `CREATE DATABASE notificaciones_db;`
4. Abrir los proyectos en un IDE (como IntelliJ IDEA) y sincronizar las dependencias de Maven (`pom.xml`).
5. Ejecutar las clases principales de Spring Boot (`MsDeliveryApplication` y `MsnotificacionesApplication`).
