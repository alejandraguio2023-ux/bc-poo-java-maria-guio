package com.JardinBotanico.servicio;

import com.JardinBotanico.modelo.RegistroVisita8;
import com.JardinBotanico.excepciones.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase gestora de los registros de visitas del Jardín Botánico.
 * Maneja colecciones usando ArrayList y HashMap con Generics.
 */
public class GestorRegistros8 {

    // Historial ordenado
    private List<RegistroVisita8> historial;

    // Búsqueda rápida por código (O(1))
    private Map<String, RegistroVisita8> registrosPorCodigo;

    // Agrupación por visitante (BONUS)
    private Map<String, List<RegistroVisita8>> registrosPorVisitante;

    public GestorRegistros8() {
        this.historial = new ArrayList<>();
        this.registrosPorCodigo = new HashMap<>();
        this.registrosPorVisitante = new HashMap<>();
    }

    /**
     * Agrega un nuevo registro de visita.
     */
    public void agregarRegistro(RegistroVisita8 registro)
            throws RegistroDuplicadoException8, DatosInvalidosException8 {

        if (registro == null || registro.getCodigo() == null || registro.getCodigo().isEmpty()) {
            throw new DatosInvalidosException8("El registro o su código no pueden ser nulos o vacíos");
        }

        if (registrosPorCodigo.containsKey(registro.getCodigo())) {
            throw new RegistroDuplicadoException8(
                    "Ya existe un registro con código: " + registro.getCodigo()
            );
        }

        // Agregar a colecciones
        registrosPorCodigo.put(registro.getCodigo(), registro);
        historial.add(registro);

        // Agrupar por visitante
        String idVisitante = registro.getVisitante().getId();
        registrosPorVisitante
                .computeIfAbsent(idVisitante, k -> new ArrayList<>())
                .add(registro);
    }

    /**
     * Busca un registro por su código.
     */
    public RegistroVisita8 buscarPorCodigo(String codigo)
            throws RegistroNoEncontradoException8 {

        RegistroVisita8 registro = registrosPorCodigo.get(codigo);

        if (registro == null) {
            throw new RegistroNoEncontradoException8(
                    "No existe registro con código: " + codigo
            );
        }

        return registro;
    }

    /**
     * Elimina un registro por código.
     */
    public void eliminarRegistro(String codigo)
            throws RegistroNoEncontradoException8 {

        RegistroVisita8 registro = registrosPorCodigo.remove(codigo);

        if (registro == null) {
            throw new RegistroNoEncontradoException8(
                    "No se puede eliminar. Código no encontrado: " + codigo
            );
        }

        historial.remove(registro);

        String idVisitante = registro.getVisitante().getId();
        registrosPorVisitante.get(idVisitante).remove(registro);
    }

    /**
     * Retorna la cantidad total de registros.
     */
    public int cantidadRegistros() {
        return historial.size();
    }

    /**
     * Filtra registros por tipo de visita.
     */
    public List<RegistroVisita8> filtrarPorTipo(String tipo) {
        List<RegistroVisita8> resultado = new ArrayList<>();

        for (RegistroVisita8 r : historial) {
            if (r.getTipoVisita().equalsIgnoreCase(tipo)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    /**
     * Filtra registros por año.
     */
    public List<RegistroVisita8> filtrarPorAnio(int anio) {
        List<RegistroVisita8> resultado = new ArrayList<>();

        for (RegistroVisita8 r : historial) {
            if (r.getFecha().getYear() == anio) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    /**
     * Obtiene el total de visitas.
     */
    public int totalVisitas() {
        return historial.size();
    }

    /**
     * Cuenta visitas por tipo.
     */
    public Map<String, Integer> contarPorTipo() {
        Map<String, Integer> conteo = new HashMap<>();

        for (RegistroVisita8 r : historial) {
            String tipo = r.getTipoVisita();
            conteo.put(tipo, conteo.getOrDefault(tipo, 0) + 1);
        }
        return conteo;
    }

    /**
     * Obtiene los registros de un visitante específico.
     */
    public List<RegistroVisita8> obtenerRegistrosPorVisitante(String idVisitante) {
        return registrosPorVisitante.getOrDefault(idVisitante, new ArrayList<>());
    }

    /**
     * Retorna todo el historial.
     */
    public List<RegistroVisita8> listarTodos() {
        return new ArrayList<>(historial);
    }
}
