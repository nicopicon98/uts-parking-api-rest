# Proyecto ParkingSoyUteista API RestFul con SpringBoot

Este proyecto es un sistema de gestión de estacionamiento desarrollado utilizando Spring Boot. El sistema permite a los usuarios gestionar reservas de plazas de estacionamiento y también permite a los administradores supervisar y gestionar todas las reservas.

## Tabla de Contenidos
1. [Funcionalidades](#Funcionalidades)
2. [Tecnologías](#Tecnologías)
3. [Cómo correr la aplicación](#Cómo-correr-la-aplicación)
4. [Contribución](#Contribución)
5. [Licencia](#Licencia)

## Funcionalidades

Las principales funcionalidades del sistema son:

1. Registro y actualización de usuarios.
2. Creación y gestión de reservas de estacionamiento.
3. Supervisión de las reservas de estacionamiento por parte del administrador.
4. Asignación de vehículos a usuarios.

## Tecnologías

El proyecto utiliza las siguientes tecnologías:

- Spring Boot: Framework de desarrollo para aplicaciones Java.
- JPA (Java Persistence API): Para interactuar con la base de datos.
- MySQL: Como sistema de gestión de bases de datos.

## Cómo correr la aplicación

Antes de ejecutar la aplicación, necesitarás tener instalado Java y Maven. Una vez que estén instalados, puedes clonar este repositorio y seguir los siguientes pasos:

1. Navega hasta el directorio raíz del proyecto en tu terminal.
2. Ejecuta `mvn clean install` para compilar el proyecto e instalar las dependencias.
3. Una vez que el build se haya completado correctamente, ejecuta `mvn spring-boot:run` para iniciar la aplicación.

La aplicación debería estar ahora corriendo en `http://localhost:8080`.

## Contribución

Las contribuciones son bienvenidas y apreciadas. Siente libre de hacer fork al proyecto y crear una pull request con tus cambios.

## Licencia

Este proyecto está bajo la licencia [MIT](https://opensource.org/licenses/MIT). Consulta el archivo `LICENSE` para más detalles.
