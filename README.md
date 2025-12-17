# 📚 Sistema de Gestión de Biblioteca – Java (POO)

Este proyecto es un **Sistema de Información de Biblioteca** desarrollado en **Java**, aplicando los principios de **Programación Orientada a Objetos (POO)** y el uso de **excepciones personalizadas** para el manejo correcto de errores del negocio.

Permite gestionar **libros y revistas**, realizar operaciones CRUD y manejar errores de forma controlada y profesional.

---

## 🎯 Objetivo del Proyecto

Implementar un sistema de biblioteca que:

- Aplique **herencia, polimorfismo y abstracción**
- Separe la **lógica del negocio** de la **interfaz de usuario**
- Utilice **excepciones personalizadas (`extends Exception`)**
- Mantenga un código limpio, escalable y fácil de mantener

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java  
- **Paradigma:** Programación Orientada a Objetos (POO)  
- **IDE recomendado:** IntelliJ IDEA / Visual Estudio Code 
- **Estructuras usadas:** `Map`, `HashMap`, `Scanner`  

---

## 📂 Estructura del Proyecto

```
co.edu.sena
│
├── Main.java
├── Biblioteca.java
├── MenuBiblioteca.java
├── Publicacion.java
├── Libro.java
├── Revista.java
│
└── excepciones
    └── personalizadas
        ├── PublicacionNoEncontrada.java
        ├── PublicacionDuplicada.java
        └── PrecioInvalido.java
```

---

## 🧩 Descripción de Clases Principales

### 🔹 Publicacion (Clase Abstracta)
Define los atributos y métodos comunes para todas las publicaciones.

### 🔹 Libro
Extiende `Publicacion` y añade el año de publicación.

### 🔹 Revista
Extiende `Publicacion` y añade el número de edición.

### 🔹 Biblioteca
Clase que contiene la **lógica del negocio** y lanza excepciones personalizadas.

### 🔹 MenuBiblioteca
Clase encargada de la interacción con el usuario y manejo de excepciones.

---

## 🚨 Excepciones Personalizadas

Paquete: `co.edu.sena.excepciones.personalizadas`

- **PublicacionNoEncontrada**
- **PublicacionDuplicada**
- **PrecioInvalido**

Estas excepciones representan **reglas del negocio**, no errores del sistema.

---

## ▶️ Cómo Ejecutar el Proyecto

1. Abrir el proyecto en el IDE
2. Ejecutar la clase `Main.java`
3. Usar el menú por consola

---

## 👨‍🎓 Autor

**Angel Manuel Gomez Chivico**  
Proyecto académico – Java POO  
SENA
