# Semana 06: Abstracción e Interfaces – Jardín Botánico

## Dominio
Jardín Botánico

## Descripción
Este proyecto implementa un Sistema de Gestión para un Jardín Botánico aplicando
los conceptos de abstracción e interfaces en Java. El sistema modela organismos
como plantas y personas como visitantes, definiendo comportamientos comunes a
través de clases abstractas y capacidades específicas mediante interfaces,
permitiendo un diseño flexible y escalable.

## Clases Abstractas Implementadas

### Organismo6
- Propósito:
  Representar un organismo general del jardín botánico, encapsulando información
  común como nombre científico, nombre común y origen.

- Métodos abstractos:
    - definirOrganismo(): Define el tipo de organismo.

- Métodos concretos:
    - mostrarInfo(): Muestra la información básica del organismo.
    - respirar(): Simula el proceso de respiración del organismo.

- Subclases:
    - Planta6

### Personas6
- Propósito:
  Representar una persona que interactúa con el jardín botánico, almacenando datos
  personales básicos.

- Métodos abstractos:
    - showRole(): Define el rol de la persona dentro del sistema.

- Métodos concretos:
    - showInfo(): Muestra la información personal.
    - Getters para los datos personales.

- Subclases:
    - Visitante

## Interfaces Implementadas

### Monitorizable
- Capacidad:
  Permite monitorear condiciones ambientales de un organismo.

- Métodos:
    - medirTemperatura(): Retorna la temperatura.
    - medirHumedad(): Retorna la humedad.
    - medirLuminosidad(): Retorna la luminosidad.

- Implementada por:
    - Planta6

### Registrable
- Capacidad:
  Permite registrar entradas y salidas dentro del sistema.

- Métodos:
    - registrarEntrada(): Registra el ingreso.
    - registrarSalida(): Registra la salida.

- Implementada por:
    - Visitante
    - VisitanteRegular6

## Jerarquía de Clases

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

## Principios SOLID Aplicados

1. SRP:
   Cada clase tiene una única responsabilidad claramente definida.

2. OCP:
   El sistema se puede extender creando nuevos organismos o personas sin modificar
   las clases existentes.

3. LSP:
   Las subclases pueden sustituir a sus clases base sin afectar el funcionamiento.

4. ISP:
   Las interfaces están correctamente separadas y no obligan a implementar métodos
   innecesarios.

5. DIP:
   El diseño depende de abstracciones y no de implementaciones concretas.

## Compilación y Ejecución

# Compilar
javac semana-06/**/*.java

# Ejecutar
java Main6

## Salida Esperada

=== Jardín Botánico ===
Nombre científico: Ficus benjamina
Nombre común: Ficus
Origen: Colombia
Ficus es una planta.
Ficus está realizando intercambio gaseoso 🌿
Temperatura: 22.5
Humedad: 60.0
Luminosidad: 800

=== Visitante ===
Entrada registrada para el visitante.
Salida registrada para el visitante.
Visitante Carlos Pérez guardado correctamente en el sistema.

## Cambios Respecto a Semana 05
- Uso de clases abstractas para organismos y personas.
- Implementación de interfaces para monitoreo y registro.
- Mejor estructura y reutilización del código.

## Mejoras Futuras
- Integración de manejo de excepciones.
- Inclusión de nuevos tipos de organismos.
- Persistencia de datos para visitantes y monitoreo ambiental.
