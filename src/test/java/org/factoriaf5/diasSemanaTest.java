package org.factoriaf5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class DiasSemanaTest{ 


    private DiasSemana pruebas;

    @BeforeEach
    public void inicializar() {
        pruebas = new DiasSemana();
        List<String> listaDias = new ArrayList<>();
        pruebas.crearListaDiasSemana(listaDias); 
    }
  
    
    @Test
    public void testObtenerDiasSemana() {

        List<String> diasSemana = pruebas.obtenerDiasSemana();
        assertEquals(7, diasSemana.size(), "La lista debe contener 7 días");
        assertEquals("Lunes", diasSemana.get(0), "El primer día debería ser Lunes");
        assertEquals("Domingo", diasSemana.get(6), "El último día debería ser Domingo");
    }
    
    @Test
    public void testObtenerTamañoLista() {
        assertEquals(7, pruebas.obtenerTamañoLista(), "El tamaño de la lista debería ser 7");
    }

    @Test
    public void testEliminarDia() {

        assertTrue(pruebas.eliminarDia("Martes"), "Martes debería ser eliminado exitosamente");
        assertEquals(6, pruebas.obtenerTamañoLista(), "El tamaño de la lista debería ser 6 tras eliminar Martes");
        assertFalse(pruebas.existeDia("Martes"), "Martes no debería existir en la lista después de eliminarlo");
    }

    @Test
    public void testObtenerDia() {
        assertEquals("Viernes", pruebas.obtenerDia("Viernes"), "Debería retornar 'Viernes' si existe en la lista");
        assertEquals("El día no existe en la lista", pruebas.obtenerDia("Lunesss"), "Debería retornar un mensaje de error si el día no existe");
    }

    

    @Test
    public void testExisteDia() {
        assertTrue(pruebas.existeDia("Viernes"), "Viernes debería existir en la lista");
        assertFalse(pruebas.existeDia("Lunesss"), "Lunesss no debería existir en la lista");
    }

    @Test
    public void testOrdenarDiasAlfabeticamente() {

        pruebas.ordenarDiasAlfabeticamente();
        List<String> diasSemana = pruebas.obtenerDiasSemana();
        assertEquals("Domingo", diasSemana.get(0), "El primer día debería ser Domingo tras ordenar");
        assertEquals("Viernes", diasSemana.get(6), "El último día debería ser Viernes tras ordenar");
    }

    @Test
    public void testVaciarLista() {

        pruebas.vaciarLista();
        assertEquals(0, pruebas.obtenerTamañoLista(), "La lista debería estar vacía después de vaciarla");
    }


}









    

