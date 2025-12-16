# 🌿 Semana 08: Colecciones y Generics – Jardín Botánico

## 👤 Información del Estudiante
- **Nombre**: Andres Gutierrez
- **Ficha**: [Número de ficha]
- **Dominio**: Sistema de Gestión de Jardín Botánico
- **Fecha**: [DD/MM/YYYY]

---

## 📝 Descripción del Proyecto

Este proyecto corresponde a la **Semana 08 del Bootcamp POO Java (SENA)** y representa la evolución del sistema del **Jardín Botánico**, incorporando **colecciones genéricas** para mejorar el rendimiento, la organización y la escalabilidad del código.

**Esta semana** se refactorizó el sistema para reemplazar el uso de arrays por **ArrayList y HashMap**, permitiendo:
- Búsquedas eficientes
- Filtrado de información
- Cálculo de estadísticas
- Manejo dinámico de datos

El sistema es **interactivo por consola**, permitiendo al usuario gestionar plantas, visitantes y registros de cuidado.

---

## 📦 Colecciones Utilizadas

### HashMap
- `Map<String, Planta8>` → Búsqueda rápida de plantas por código
- `Map<String, Visitante8>` → Búsqueda de visitantes por identificación
- `Map<String, List<RegistroCuidado8>>` → Registros de cuidado agrupados por planta

### ArrayList
- `List<Planta8>` → Lista general de plantas
- `List<Visitante8>` → Visitantes registrados
- `List<RegistroCuidado8>` → Historial de cuidados realizados

Todas las colecciones utilizan **Generics**, evitando tipos raw y warnings de compilación.

---

## 🔍 Operaciones Implementadas

### CRUD con Colecciones
- ✅ Agregar entidades con validación de duplicados
- ✅ Buscar por clave única usando `HashMap` (O(1))
- ✅ Actualizar información existente
- ✅ Eliminar registros por código

### Filtrado
- ✅ Filtrar plantas por tipo
- ✅ Filtrar registros por rango de fechas
- ✅ Filtrar cuidados por responsable o categoría

### Estadísticas
- ✅ Total de registros de cuidado
- ✅ Promedio de cuidados por planta
- ✅ Planta con mayor número de cuidados
- ✅ Conteo por tipo de planta

---

## 🚀 Cómo Ejecutar

### Desde terminal:
```bash
cd semana-08
javac -d bin src/com/[tudominio]/*/*.java src/com/[tudominio]/*.java
java -cp bin com.[tudominio].Main
```
## 🔤 Nomenclatura

### 📦 Colecciones

| Estructura | Convención | Ejemplo |
|-----------|-----------|--------|
| HashMap | `[entidades]Por[Clave]` | `plantasPorCodigo` |
| HashMap (agrupación) | `[entidades]Por[Atributo]` | `registrosPorPlanta` |
| ArrayList | `lista[Entidades]` | `listaPlantas` |
| ArrayList (historial) | `historial[Entidades]` | `historialCuidados` |
| Set | `[entidades]Unicas` | `tiposPlantaUnicos` |

---

### 🔠 Generics

```java
// ✅ CORRECTO – Uso de Generics
private Map<String, Planta8> plantasPorCodigo = new HashMap<>();
private Map<String, List<RegistroCuidado8>> registrosPorPlanta = new HashMap<>();
private List<Visitante8> listaVisitantes = new ArrayList<>();

// ❌ INCORRECTO – Tipos raw (NO permitido)
private Map plantasPorCodigo = new HashMap();
private List listaVisitantes = new ArrayList();
List visitantes = new ArrayList();