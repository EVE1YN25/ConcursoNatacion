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

# Sistema de Gestión de Concurso de Natación en Java

## Descripción
Este proyecto es un sistema de gestión de participantes para un concurso de natación, desarrollado en Java utilizando Programación Orientada a Objetos (POO). Permite registrar participantes, aplicar validaciones y listar elegibles.

## Requisitos del Sistema
* Java Development Kit (JDK) 8 o superior
* Entorno de desarrollo como Visual Studio Code

## Cómo Ejecutar el Programa

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/EVE1YN25/ConcursoNatacion.git](https://github.com/EVE1YN25/ConcursoNatacion.git)
    ```
2.  **Navegar al directorio del proyecto:**
    ```bash
    cd ConcursoNatacion
    ```
3.  **Compilar los archivos Java:**
    ```bash
    javac *.java
    ```
4.  **Ejecutar la aplicación principal:**
    ```bash
    java ConcursoNatacionApp
    ```
    Se mostrará un menú interactivo en la consola.

## Características Implementadas (Detalle de las indicaciones)

El sistema cumple con los siguientes requisitos de la tarea:
* **Clase `Participante` base:** Contiene atributos comunes (Nombre, Edad, Género, Condición de salud, Tipo de entidad) y el método `puedeParticipar()` para validar edad (18-25 años) y condición de salud ("buena").
* **Subclases de `Participante`:** Se han creado las siguientes subclases que heredan de `Participante` y que incluyen un atributo propio:
    * `ParticipanteColegio` (ej. nombre del colegio)
    * `ParticipanteUniversidad` (ej. nombre de la universidad)
    * `ParticipanteEmpresa` (indica si es pública o privada, ej. nombre de la empresa)
    * `ParticipanteSindicato` (ej. tipo de sindicato)
* **Método `getInfo()` sobrescrito:** Cada subclase sobrescribe este método para mostrar los datos completos del participante.
* **Getters y Setters:** Implementados según sea necesario en las clases.
* **Menú interactivo por consola:** Permite:
    * Registrar nuevos participantes.
    * Ver la lista de todos los participantes registrados.
    * Ver solo los participantes que sí cumplen los requisitos para participar.
* **Validaciones:**
    * Edad entre 18 y 25 años.
    * Condición de salud "buena".
* **Inclusión de participantes de ejemplo:** Se incluyen al menos dos participantes por tipo de entidad.
* **Código comentado:** (Asegúrate de que tu código Java tenga comentarios explicativos donde sea necesario).

---
**Autor:** Evelyn Hachi
**Enlace al Repositorio:** [https://github.com/EVE1YN25/ConcursoNatacion](https://github.com/EVE1YN25/ConcursoNatacion)