/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Pilas;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author riosr
 */
public class GestorHistorialTest {
    
    public GestorHistorialTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of VisitarWeb method, of class GestorHistorial.
     */
    @Test
    public void testVisitarWeb() {
        System.out.println("VisitarWeb");
        PaginaWeb pagina = null;
        GestorHistorial instance = new GestorHistorial();
        instance.VisitarWeb(pagina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarWeb method, of class GestorHistorial.
     */
    @Test
    public void testCerrarWeb() {
        System.out.println("cerrarWeb");
        GestorHistorial instance = new GestorHistorial();
        instance.cerrarWeb();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUltimaWebVisitada method, of class GestorHistorial.
     */
    @Test
    public void testObtenerUltimaWebVisitada() {
        System.out.println("obtenerUltimaWebVisitada");
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerUltimaWebVisitada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerVisitaDispositivo method, of class GestorHistorial.
     */
    @Test
    public void testObtenerVisitaDispositivo() {
        System.out.println("obtenerVisitaDispositivo");
        int opcDispositivo = 0;
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerVisitaDispositivo(opcDispositivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historial method, of class GestorHistorial.
     */
    @Test
    public void testHistorial() {
        System.out.println("historial");
        GestorHistorial instance = new GestorHistorial();
        instance.historial();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPila method, of class GestorHistorial. 
     */
    @Test
    public void testGetPila() {
        System.out.println("getPila");
        GestorHistorial instance = new GestorHistorial();
        Stack expResult = null;
        Stack result = instance.getPila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPila method, of class GestorHistorial.
     */
    @Test
    public void testSetPila() {
        System.out.println("setPila");
        Stack pila = null;
        GestorHistorial instance = new GestorHistorial();
        instance.setPila(pila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
