# 📄 Archivo ANALISIS.md

## Identificación de Abstracciones

En el sistema del Jardín Botánico se identificaron dos abstracciones principales:

1. Organismo6  
   Representa cualquier ser vivo dentro del jardín botánico. Esta abstracción
   encapsula atributos y comportamientos comunes como nombre científico,
   nombre común, origen y el proceso de respiración.

2. Personas6  
   Representa a las personas que interactúan con el sistema. Contiene información
   básica como nombre, identificación, teléfono, género y correo electrónico,
   además de definir el rol que cumple cada persona.

Estas abstracciones permiten reutilizar código y modelar correctamente el dominio.

---

## Interfaces Implementadas

1. Monitorizable  
   Define la capacidad de medir variables ambientales como temperatura, humedad
   y luminosidad. Esta interfaz es implementada por la clase Planta6, permitiendo
   monitorear condiciones ambientales sin depender del tipo concreto de organismo.

2. Registrable  
   Define el comportamiento de registrar entrada y salida dentro del sistema.
   Es implementada por la clase Visitante, permitiendo controlar el flujo de
   visitantes al jardín botánico.

---

## Decisiones de Diseño (Clase Abstracta vs Interface)

Se utilizó clase abstracta cuando fue necesario:
- Compartir atributos comunes.
- Proveer implementación parcial de métodos.
- Forzar la implementación de comportamientos específicos en las subclases.

Se utilizaron interfaces cuando:
- Se necesitó definir capacidades específicas.
- No todos los objetos del sistema debían compartir estado.
- Se buscó mayor flexibilidad y desacoplamiento.

Esta combinación permitió un diseño más limpio y extensible.

---

## Principios SOLID Aplicados

1. SRP (Single Responsibility Principle)  
   Cada clase tiene una única responsabilidad, como representar organismos,
   personas o definir capacidades específicas.

2. OCP (Open/Closed Principle)  
   El sistema puede extenderse agregando nuevos tipos de organismos o visitantes
   sin modificar las clases existentes.

3. LSP (Liskov Substitution Principle)  
   Las subclases pueden sustituir a sus clases abstractas sin alterar el
   comportamiento del sistema.

4. ISP (Interface Segregation Principle)  
   Las interfaces son específicas y no obligan a implementar métodos innecesarios.

5. DIP (Dependency Inversion Principle)  
   El diseño depende de abstracciones (clases abstractas e interfaces) y no de
   implementaciones concretas.

---

## Mejoras Logradas

- Mayor reutilización de código.
- Separación clara de responsabilidades.
- Diseño más flexible y mantenible.
- Código más legible y organizado.
- Facilidad para futuras extensiones del sistema.

---

## Diagrama de Clases

<<abstract>>
Organismo6
|
Planta6
|
implements Monitorizable


<<abstract>>
Personas6
|
Visitante
|
VisitanteRegular6
|
implements Registrable

---

## Desafíos y Soluciones

Desafío:
Diferenciar correctamente cuándo usar una clase abstracta y cuándo una interfaz.

Solución:
Se analizó si era necesario compartir estado o solo comportamiento, lo que permitió
tomar decisiones de diseño más acertadas.

Desafío:
Organizar correctamente los paquetes del proyecto.

Solución:
Se separaron las clases en paquetes de abstractas, implementaciones e interfaces,
mejorando la estructura del proyecto.

---

## Próximos Pasos

- Implementar manejo de excepciones.
- Agregar persistencia de datos.
- Incorporar más tipos de organismos.
- Integrar reportes de monitoreo ambiental.
