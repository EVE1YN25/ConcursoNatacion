# Proyecto: Concurso de Natación (POO en Java - Consola)

## Descripción General

Este proyecto implementa un sistema de gestión de participantes para un concurso de natación, utilizando los principios de la Programación Orientada a Objetos (POO) en Java. La aplicación es una interfaz de consola que permite registrar participantes de diferentes tipos de entidades (colegios, universidades, empresas y sindicatos), ver listados y filtrar por elegibilidad.

## Requisitos del Sistema (según Enunciado de Tarea)

Los participantes comunes deben registrarse con los siguientes atributos:
* Nombre
* Edad
* Género
* Condición de salud (buena o no)
* Tipo de entidad (colegio, universidad, empresa pública, empresa privada o sindicato)

Solo podrán participar personas que cumplan con los siguientes requisitos:
* Tener entre 18 y 25 años
* Estar en buena condición de salud

### Estructura y Características Implementadas

1.  **Clase Base `Participante`**: Clase abstracta que contiene los atributos comunes (`nombre`, `edad`, `genero`, `condicionSalud`, `tipoEntidad`) y un método `puedeParticipar()` para validar la edad y condición de salud.
2.  **Subclases de `Participante`**: Se han implementado las siguientes subclases, cada una con su atributo adicional y sobrescribiendo el método `getInfo()` para mostrar datos completos:
    * `ParticipanteColegio`: Incluye el nombre del colegio.
    * `ParticipanteUniversidad`: Incluye el nombre de la universidad.
    * `ParticipanteEmpresa`: Incluye el nombre de la empresa y especifica si es pública o privada.
    * `ParticipanteSindicato`: Incluye el tipo de sindicato.
3.  **Getters y Setters**: Se han implementado los métodos `get` y `set` necesarios para los atributos de las clases.
4.  **Menú Interactivo por Consola**: La aplicación `ConcursoNatacionApp` ofrece un menú que permite:
    * Registrar nuevos participantes.
    * Ver la lista de todos los participantes registrados.
    * Ver solo los participantes que cumplen los requisitos (elegibles).
5.  **Validaciones**: La edad se valida para que esté entre 18 y 25 años, y la condición de salud se valida como "buena" o "no".
6.  **Participantes de Ejemplo**: El programa carga automáticamente al menos dos participantes por tipo de entidad al iniciar, para facilitar las pruebas.
7.  **Código Comentado**: El código fuente incluye comentarios para facilitar su comprensión.

## Cómo Compilar y Ejecutar

Asegúrate de tener instalado un **JDK (Java Development Kit)**, como Eclipse Temurin JDK 21 o superior, y **Visual Studio Code** con el "Extension Pack for Java".

1.  **Clonar/Descargar el Proyecto**:
    * Si el proyecto está en GitHub, clónalo usando `git clone <URL_DEL_REPOSITORIO>`.
    * Si lo descargaste como ZIP, descomprime la carpeta.

2.  **Abrir en Visual Studio Code**:
    * Abre la carpeta raíz del proyecto (`ConcursoNatacion`) en Visual Studio Code (`File > Open Folder...`).

3.  **Abrir la Terminal**:
    * En VS Code, ve a `Terminal > New Terminal`. Asegúrate de que la terminal esté en el directorio raíz del proyecto (`C:\Users\<TuUsuario>\Documents\ConcursoNatacion>`).

4.  **Compilar el Código**:
    * En la terminal, ejecuta el siguiente comando para compilar todos los archivos `.java`:
        ```bash
        javac *.java
        ```

5.  **Ejecutar la Aplicación**:
    * Después de una compilación exitosa, ejecuta la aplicación principal con el comando:
        ```bash
        java ConcursoNatacionApp
        ```

6.  **Interactuar con el Menú**:
    * Sigue las instrucciones en la consola para registrar participantes, ver listados o salir.

## Archivos del Proyecto

* `Participante.java`
* `ParticipanteColegio.java`
* `ParticipanteUniversidad.java`
* `ParticipanteEmpresa.java`
* `ParticipanteSindicato.java`
* `ConcursoNatacionApp.java`
* `README.md` (este archivo)

---

