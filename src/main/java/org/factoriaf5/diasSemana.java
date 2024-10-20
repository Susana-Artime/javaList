package org.factoriaf5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DiasSemana {

    private List<String> diasSemana;

    
    public void crearListaDiasSemana(List<String> lista) {

        diasSemana = lista;

        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");
    }

    
    public List<String> obtenerDiasSemana() {

        return new ArrayList<>(diasSemana);
    }

    
    public int obtenerTamañoLista() {

        return diasSemana.size();
    }

    
    public boolean eliminarDia(String dia) {

        return diasSemana.remove(dia);
    }

    
    public String obtenerDia(String dia) {
        
        if (diasSemana.contains(dia)) {
            return dia;
        } else {
            return "El día no existe en la lista";
        }
    }

    public boolean existeDia(String dia) {

        return diasSemana.contains(dia);
    }

    
    public void ordenarDiasAlfabeticamente() {

        Collections.sort(diasSemana);
    }

    
    public void vaciarLista() {
        diasSemana.clear();
    }

}





    

