# Actividad 1: Identificación de Objetos

## Objetos Identificados

---

### 1. Planta.Planta (PlantSpecimen) 🌱
**Descripción:**  
Un espécimen vegetal registrado dentro del jardín botánico, parte de la colección viva.

**Características (Atributos):**
- código del espécimen
- nombre científico
- nombre común
- origen
- estado de conservación

**Comportamientos (Métodos):**
- registrarPlanta()
- actualizarEstado()
- regar()
- mostrarInformación()

---

### 2. Biólogo (Biologist) 🧑‍🔬
**Descripción:**  
Profesional encargado del estudio, clasificación y cuidado de las especies del jardín.

**Características (Atributos):**
- nombre
- identificación
- especialidad
- años de experiencia

**Comportamientos (Métodos):**
- clasificarPlanta()
- actualizarFichaBotánica()
- supervisarConservación()

---

### 3. Invernadero (Greenhouse) 🏡
**Descripción:**  
Espacio controlado dentro del jardín donde se mantienen plantas bajo condiciones específicas.

**Atributos:**
- String name – nombre del invernadero
- double temperature – temperatura actual en grados Celsius
- double humidity – porcentaje de humedad
- String plantType – tipo de plantas que alberga (tropicales, desérticas, orquídeas)
- List<Plant> plants – lista de plantas dentro del invernadero

**Métodos:**
- void controlarTemperatura(double nuevaTemperatura) – ajusta la temperatura del invernadero
- void mantenerHumedad(double nuevaHumedad) – regula la humedad interna
- void agregarPlanta(Plant plant) – añade una planta al invernadero
- void mostrarEstado() – muestra información general del invernadero

---

### 4. Evento o Exhibición (EventExhibition) 🎟️
**Descripción:**  
Actividad realizada en el jardín para promover la conservación y la educación ambiental.

**Atributos:**
- String name – nombre del evento o exhibición
- String date – fecha de realización
- String theme – tema central
- int durationHours – duración en horas
- List<Visitor> attendees – visitantes registrados

**Métodos:**
- void iniciar() – marca el inicio del evento
- void finalizar() – cierra el evento o exhibición
- void registrarAsistencia(Visitor visitor) – añade un visitante al evento
- void mostrarDetalles() – imprime la información completa del evento

---

### 5. Visitante (Visitor) 👩‍🎓
**Descripción:**  
Persona que asiste al jardín botánico para realizar un tour, participar en un evento o comprar plantas.

**Características (Atributos):**
- nombre
- tipo de visitante (estudiante, turista, investigador)
- edad
- ticketID

**Comportamientos (Métodos):**
- ingresarJardín()
- participarTour()
- comprarPlanta()
- dejarComentario()  

# Actividad 2: Comparación de Paradigmas


## 🔹 Diferencias entre Programación Estructurada y POO

| Característica | Programación Estructurada | Programación Orientada a Objetos (POO) |
|-----------------|---------------------------|----------------------------------------|
| **Enfoque principal** | Basado en funciones y procedimientos. | Basado en objetos que representan entidades del mundo real. |
| **Organización del código** | Secuencial y modular (por funciones). | Jerárquica y modular (por clases y objetos). |
| **Datos y comportamiento** | Los datos y funciones están separados. | Los datos (atributos) y comportamientos (métodos) se agrupan en una misma clase. |
| **Reutilización del código** | Limitada, depende del uso de funciones. | Alta, mediante herencia, polimorfismo y encapsulamiento. |
| **Ejemplo de uso** | Programas pequeños, simples y lineales. | Sistemas grandes, escalables y con múltiples entidades relacionadas. |
| **Seguridad de datos** | Poca, los datos son accesibles globalmente. | Alta, gracias al encapsulamiento y control de acceso. |


