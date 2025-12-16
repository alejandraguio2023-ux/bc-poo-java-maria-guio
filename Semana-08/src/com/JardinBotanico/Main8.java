package com.JardinBotanico;

import com.JardinBotanico.modelo.*;
import com.JardinBotanico.servicio.GestorRegistros8;
import com.JardinBotanico.excepciones.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Main - Semana 08
 * Sistema de Gestión del Jardín Botánico
 */
public class Main8 {

    private static GestorRegistros8 gestor = new GestorRegistros8();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN - JARDÍN BOTÁNICO (SEMANA 08) ===");

        int opcion;
        int i = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            try {
                switch (opcion) {
                    case 1 -> agregarRegistro();
                    case 2 -> buscarRegistro();
                    case 3 -> listarRegistros();
                    case 4 -> filtrarPorTipo();
                    case 5 -> mostrarEstadisticas();
                    case 6 -> eliminarRegistro();
                    case 0 -> System.out.println("👋 Programa finalizado");
                    default -> System.out.println("❌ Opción inválida");
                }
            } catch (Exception e) {
                System.err.println("⚠️ Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Agregar registro de visita");
        System.out.println("2. Buscar registro por código");
        System.out.println("3. Listar todos los registros");
        System.out.println("4. Filtrar registros por tipo");
        System.out.println("5. Ver estadísticas");
        System.out.println("6. Eliminar registro");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    // ==========================
    // OPCIONES DEL MENÚ
    // ==========================

    private static void agregarRegistro()
            throws RegistroDuplicadoException8, DatosInvalidosException8 {

        System.out.print("Código del registro: ");
        String codigo = scanner.nextLine();

        System.out.print("ID visitante: ");
        String idVisitante = scanner.nextLine();

        System.out.print("Nombre visitante: ");
        String nombreVisitante = scanner.nextLine();

        System.out.print("Email visitante: ");
        String emailVisitante = scanner.nextLine();

        Visitante8 visitante = new Visitante8(idVisitante, nombreVisitante, emailVisitante);

        System.out.print("Código planta: ");
        String codigoPlanta = scanner.nextLine();

        System.out.print("Nombre común planta: ");
        String nombrePlanta = scanner.nextLine();

        System.out.print("Nombre científico planta: ");
        String nombreCientifico = scanner.nextLine();

        System.out.print("Origen planta: ");
        String origen = scanner.nextLine();

        Planta8 planta = new Planta8(codigoPlanta, nombrePlanta, nombreCientifico, origen);

        System.out.print("Tipo de visita (Guiada / Libre): ");
        String tipoVisita = scanner.nextLine();

        RegistroVisita8 registro = new RegistroVisita8(
                codigo,
                visitante,
                planta,
                LocalDate.now(),
                tipoVisita
        );

        gestor.agregarRegistro(registro);
        System.out.println("✅ Registro agregado correctamente");
    }

    private static void buscarRegistro()
            throws RegistroNoEncontradoException8 {

        System.out.print("Código a buscar: ");
        String codigo = scanner.nextLine();

        RegistroVisita8 registro = gestor.buscarPorCodigo(codigo);
        System.out.println("🔍 Registro encontrado:");
        System.out.println(registro);
    }

    private static void listarRegistros() {

        List<RegistroVisita8> registros = gestor.listarTodos();

        if (registros.isEmpty()) {
            System.out.println("📭 No hay registros");
            return;
        }

        System.out.println("\n📋 LISTADO DE REGISTROS:");
        for (RegistroVisita8 r : registros) {
            System.out.println(r);
        }
    }

    private static void filtrarPorTipo() {

        System.out.print("Tipo de visita a filtrar: ");
        String tipo = scanner.nextLine();

        List<RegistroVisita8> filtrados = gestor.filtrarPorTipo(tipo);

        if (filtrados.isEmpty()) {
            System.out.println("❌ No se encontraron registros");
            return;
        }

        System.out.println("\n🔎 REGISTROS FILTRADOS:");
        for (RegistroVisita8 r : filtrados) {
            System.out.println(r);
        }
    }

    private static void mostrarEstadisticas() {

        System.out.println("\n📊 ESTADÍSTICAS DEL SISTEMA");
        System.out.println("Total de visitas: " + gestor.totalVisitas());

        System.out.println("\nConteo por tipo de visita:");
        Map<String, Integer> conteo = gestor.contarPorTipo();
        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void eliminarRegistro()
            throws RegistroNoEncontradoException8 {

        System.out.print("Código a eliminar: ");
        String codigo = scanner.nextLine();

        gestor.eliminarRegistro(codigo);
        System.out.println("🗑️ Registro eliminado correctamente");
    }
}
