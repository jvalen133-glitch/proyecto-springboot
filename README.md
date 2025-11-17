# 🛠 Proyecto Formativo - inventario, pedido ventas de WURGUER

Este proyecto fue desarrollado como parte del taller de formación en desarrollo de aplicaciones con Spring Boot y frontend. El objetivo es gestionar productos y proveedores mediante una API REST conectada a una base de datos MySQL, y mostrar los datos en una interfaz web.

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3.5.7
- MySQL
- HTML, CSS, JavaScript
- JPA (Java Persistence API)
- HikariCP
- Lombok

## 🧩 Estructura del proyecto

- **Backend:** API REST con Spring Boot
  - Entidades: `Producto`, `Proveedor`
  - Relaciones: `Producto` tiene un `@ManyToOne` con `Proveedor`
  - Validaciones: uso de `@NotNull`, `@Size`, `@Min` para asegurar integridad de datos
- **Frontend:** archivos HTML en `src/main/resources/static`
  - `index.html`: página de bienvenida
  - `dashboard.html`: muestra los productos en tabla
  - JavaScript para consumir la API con `fetch()`
  - CSS para estilos básicos

## 🗃 Base de datos

- Tabla `producto` con campos como nombre, precio, stock, descripción, fecha de vencimiento, tipo y medida
- Tabla `proveedor` relacionada con `producto` mediante clave foránea

## 📦 Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Configurar la conexión a MySQL en `application.properties`
3. Ejecutar el backend con:

   ```bash
   ./mvnw spring-boot:run