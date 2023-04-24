# BibliotecaBasica
## Aplicación rest biblioteca básica


Este es el proyecto API REST con Spring Boot, que permite hacer el inventario de una biblioteca


## Herramientas
- JAVA (versión 11)
- Spring Boot Initializer
- insomnia(probar el proyecto)

## Dependencias Spring Boot:
- Spring Web
- Lombok
- h2 Database
- Spring Data JPA

## Instalación

Para la instalación del proyecto, se debe seguir los siguientes pasos:

1. Clona el repositorio en tu máquina local: `git clone https://github.com/ClaudiaBetancur/BibliotecaBasica`
2. Instala las dependencias: `Dependencias spring Boot`



## Uso

Una vez que la aplicación esté en funcionamiento, puedes hacer lo siguiente:

- Acceder a la página principal en http://localhost:8080.


## Aplicando el CRUD y mostrando información en la base de datos
Este proyecto utiliza H2 Database, para aplicar el CRUD y mostrar información en la base de datos. 
A continuación, se muestran los endpoints para realizar la prueba en formato JSON.


La aplicación fue probada en el aplicativo Insomnia y con los siguientes endpoints:

## Base de datos:
http://localhost:8080/h2_console

### Endpoint Usuario:

FORMATO JSON
{
"id": 12345,
"name" : "Claudia",
"birthDate" : "1995-09-27"
}

GetMapping: http://localhost:8080/usuario
PostMapping: http://localhost:8080/usuario
DeleteMapping: http://localhost:8080/usuario/1

### Enpoint Libro:

FORMATO JSON
{
"author": "Megan Maxwell",
"datePublication" : "1990-10-27",
"bookName" : "AJAMMMM",
"numberOfTimeBorrowed" : 5
}

GetMapping: http://localhost:8080/libro
GetMapping: http://localhost:8080/prestado/1
PostMapping: http://localhost:8080/libro
DeleteMapping: http://localhost:8080/libro/1



## Estado del proyecto

El proyecto X se encuentra en desarrollo activo. 



