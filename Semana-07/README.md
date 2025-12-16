# Semana 07: Paquetes y Excepciones - Jardín Botánico

## 👤 Información del Estudiante

* **Nombre**: Maria Guio
* **Ficha**: 3228970A
* **Dominio**: Jardín Botánico
* **Fecha**: 15/12/2025

## 📝 Descripción del Proyecto

Este proyecto corresponde a un **Sistema de Gestión para un Jardín Botánico**, cuyo objetivo es administrar especímenes de plantas y sus respectivos horarios de cuidado. El sistema permite registrar plantas, asignar frecuencias de riego y validar reglas del negocio mediante el uso de excepciones.

Se implementa una arquitectura organizada en paquetes, validaciones con excepciones estándar de Java y excepciones personalizadas propias del dominio del jardín botánico.

## 📦 Estructura de Paquetes

```
src/
└── com/
    └── jardinbotanico/
        ├── modelo/
        │   ├── PlantSpecimen.java
        │   └── CareSchedule.java
        ├── servicio/
        │   └── GardenManager.java
        ├── excepciones/
        │   ├── InvalidPlantException.java
        │   └── CareScheduleException.java
        └── Main.java
```

## ⚠️ Excepciones Personalizadas

### 1. InvalidPlantException

* **Tipo**: Checked (extends Exception)
* **Cuándo se lanza**: Cuando un espécimen de planta no cumple con las reglas del jardín, como un nombre científico inválido.
* **Ejemplo**: Intentar registrar una planta cuyo nombre científico no sigue la nomenclatura binomial.

### 2. CareScheduleException

* **Tipo**: Checked (extends Exception)
* **Cuándo se lanza**: Cuando no es posible crear o asignar un horario de cuidado, por ejemplo, al superar la capacidad máxima del jardín.
* **Ejemplo**: Agregar más plantas de las permitidas en el jardín.

## 🚀 Cómo Ejecutar

### Desde terminal:

```bash
cd semana-07
javac -d bin src/com/jardinbotanico/*/*.java src/com/jardinbotanico/*.java
java -cp bin com.jardinbotanico.Main
```

## ✅ Casos Demostrados en el Main

* Registro exitoso de un espécimen y su cuidado
* Validación de datos inválidos (IllegalArgumentException)
* Lanzamiento de InvalidPlantException
* Lanzamiento de CareScheduleException
* Recuperación del sistema tras errores

