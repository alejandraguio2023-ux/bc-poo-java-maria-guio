# Jerarquía de Clases - Semana 04

## 📌 Diagrama de la Jerarquía

        Empleado
           |
    +------+------+
    |             |

---

## 🧠 Justificación

La jerarquía se diseñó partiendo del hecho de que **Empleado** representa el concepto general: cualquier persona vinculada a la organización. A partir de ahí, se crean dos tipos específicos:

- **EmpleadoPlanta**: trabajadores con contrato fijo, beneficios estables y salario definido.
- **EmpleadoContrato**: trabajadores por prestación de servicios o acuerdos temporales.

Esta separación permite:

- Reutilizar atributos y comportamientos comunes en la clase base.
- Aplicar **polimorfismo** al sobrescribir métodos como `calcularSalario()`.
- Mantener el código más limpio, ordenado y fácil de escalar en el futuro.

En resumen: la clase padre define el “ADN” básico y las hijas afinan los detalles según el tipo de empleado.

---

## 🧬 Atributos Heredados (desde `Empleado`)

- nombre (String)
- identificacion (String)
- salarioBase (double)

Estos atributos son compartidos por cualquier tipo de empleado, por eso viven en la clase padre.

---

## 🔄 Métodos Sobrescritos

### `calcularSalario()`

Cada clase hija implementa su propia versión porque:

- **EmpleadoPlanta:**  
  Puede incluir bonos fijos, prestaciones, subsidios o incrementos adicionales.  
  Su salario tiende a ser más estable y puede sumar beneficios internos.

- **EmpleadoContrato:**  
  Generalmente cobra por horas trabajadas, por proyecto o sin prestaciones.  
  Su cálculo puede involucrar número de horas, valor por hora o descuentos específicos.

Este método es el ejemplo perfecto de **polimorfismo**, porque el mismo mensaje (`calcularSalario()`) produce comportamientos diferentes dependiendo del tipo de empleado.
