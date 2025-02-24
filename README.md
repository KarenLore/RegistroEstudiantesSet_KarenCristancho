# Taller de Programación en Java: Uso de Set

## 🚀 Ejercicio 1: Registro de Estudiantes con HashSet

### Descripción
Este programa permite registrar estudiantes utilizando un `HashSet<String>` para evitar registros duplicados. Los usuarios pueden agregar estudiantes, visualizar la lista y verificar si un estudiante específico está registrado.

### 📌 Funcionalidades
1. Solicita al usuario la cantidad de estudiantes a registrar.
2. Permite ingresar los nombres de los estudiantes y los almacena en un `HashSet`.
3. Muestra la lista de estudiantes registrados.
4. Permite verificar si un estudiante específico está en la lista.

### 📂 Estructura del Proyecto
```
/com.ejercicio1
│── src
│   ├── Main.java
│── README.md
```

### 🛠️ Requisitos
- Java 8 o superior
- Un entorno de desarrollo como IntelliJ IDEA, o VS Code con soporte para Java

### 🚀 Ejecución
1. Compila el código:
   ```sh
   javac Main.java
   ```
2. Ejecuta el programa:
   ```sh
   java Main
   ```

### 📝 Ejemplo de Uso
**Entrada:**
```
Ingrese la cantidad de estudiantes a registrar: 3
Ingrese el nombre del estudiante 1: Ana
Ingrese el nombre del estudiante 2: Pedro
Ingrese el nombre del estudiante 3: Ana
```

**Salida:**
```
Lista de estudiantes registrados: [Ana, Pedro]
Ingrese el nombre del estudiante a verificar: Ana
El estudiante Ana está en la lista.
```

### 📌 Notas
- Los nombres duplicados no se agregarán debido al uso de `HashSet`.

**Autor**
**Karen Cristancho**