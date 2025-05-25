# 🧩 Juego: Cáliz de los Códigos Perdidos
 Proyecto grupal actividad 2 de Kodigo 
 
## 👥 Integrantes del Grupo 9
- Haydee Abigail Bonilla Reyes – haydeebonillareyes@gmail.com  
- Dimas Eduardo Monge González – mongedimas730@gmail.com  
- Ricardo Daniel Alvarenga Cuadra – alvarenga409@gmail.com

## 📌 Descripción
Este proyecto es un juego interactivo desarrollado en Java que combina algoritmos de ordenamiento y búsqueda para encontrar un número mágico oculto por un oráculo. Si el usuario acierta, se revela un mensaje secreto.

## 📁 Estructura del Proyecto
src
├── GameEngine.java           // Lógica principal del juego y menú
├── MainApp.java              // Clase con el método main
├── InputValidator.java       // Valida entradas del usuario
├── NumberGenerator.java      // Genera números aleatorios
├── OracleMessage.java        // Selecciona el número mágico y mensaje
├── ResultPresenter.java      // Muestra los resultados
├── Searcher.java             // Implementa búsqueda binaria
├── Sorter.java               // Implementa Merge Sort
└── Timer.java                // Mide tiempos de ejecución

## ▶️ Instrucciones para Ejecutar

1. Abre el proyecto en tu IDE Java (recomendado: IntelliJ, Eclipse o NetBeans).
2. Asegúrate de tener el JDK instalado (Java 8 o superior).
3. Ejecuta la clase `MainApp.java`.
4. Interactua con el menu desde consola.


## 🎮 Cómo funciona el juego
Al ejecutar el programa, se muestra un menú principal con las siguientes opciones:

### Iniciar juego

- Se generan 10 números aleatorios entre 1000 y 9999.

- Se ordenan usando el algoritmo Merge Sort.

- El oráculo elige un número mágico oculto.

- El usuario tiene 3 intentos para adivinarlo mediante búsqueda binaria.

- Se muestran estadísticas como tiempo de ordenamiento y búsqueda..

### Historia: El Mensaje del Oráculo

- Muestra un texto narrativo que da contexto y ambientación al juego, motivando al jugador a buscar el número mágico como parte de una profecía.

### Acerca del programa

- Presenta una descripción breve del objetivo del juego y créditos del desarrollador.

### Salir

- Finaliza el juego con un mensaje de despedida.



## Requisitos Técnicos

- Java 8 o superior
- IDE para Java (IntelliJ IDEA, Eclipse, etc.)

##  💡 Conceptos aplicados
Este proyecto aplica varios principios clave de la programación:
Uso de clases, encapsulamiento, responsabilidades definidas por clase.

✅ Validación de entradas de usuario

✅ Algoritmo de ordenamiento: Merge Sort.

✅ Algoritmo de búsqueda: Búsqueda binaria.

✅ Medición de rendimiento: tiempos de ejecución de ordenamiento y búsqueda.

✅ Interacción en consola y control de flujo con estructuras condicionales y bucles.
