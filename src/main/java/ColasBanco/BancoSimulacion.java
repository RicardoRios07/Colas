/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColasBanco;
/**
 *
 * @author riosr
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class ColaClientes {

    private Queue<Cliente> cola;

    public ColaClientes() {
        cola = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        cola.add(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " ha llegado al banco.");
    }

    public Cliente atenderCliente() {
        Cliente cliente = cola.poll();
        if (cliente != null) {
            System.out.println("Atendiendo al cliente " + cliente.getNombre());
        } else {
            System.out.println("No hay clientes en la cola.");
        }
        return cliente;
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}

class SimuladorBanco {

    private ColaClientes colaClientes;
    private int clientesAtendidos;
    private int tiempoTotalEspera;

    public SimuladorBanco() {
        colaClientes = new ColaClientes();
        clientesAtendidos = 0;
        tiempoTotalEspera = 0;
    }

    public void ejecutarSimulacion(int tiempoSimulacion) {
        System.out.println("Simulación de atención al cliente en el banco durante " + tiempoSimulacion + " minutos:");
        for (int i = 1; i <= tiempoSimulacion; i++) {
            System.out.println("\nMinuto " + i);

            Random random = new Random();
            if (random.nextDouble() <= 0.3) {
                String nuevoCliente = "Cliente" + i;
                colaClientes.agregarCliente(new Cliente(nuevoCliente));
            }
            Cliente clienteAtendido = colaClientes.atenderCliente();
            if (clienteAtendido != null) {

                Random randomTiempo = new Random();
                int tiempoEspera = randomTiempo.nextInt(6) + 1;
                tiempoTotalEspera += tiempoEspera;
                clientesAtendidos++;
                System.out.println("Cliente " + clienteAtendido.getNombre() + " atendido en " + tiempoEspera + " minutos.");
            }
        }
        System.out.println("\nEstadísticas de la simulación:");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        double tiempoPromedioEspera = (double) tiempoTotalEspera / clientesAtendidos;
        System.out.println("Tiempo promedio de espera: " + tiempoPromedioEspera + " minutos.");
    }
}

public class BancoSimulacion {

    public static void main(String[] args) {
        SimuladorBanco simulador = new SimuladorBanco();
        simulador.ejecutarSimulacion(60);
    }
}
