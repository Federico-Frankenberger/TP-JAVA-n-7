package Ejercicio1;
import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public static double promedioNotas(Alumno alumno) {
        double suma = 0;
        int contador =0;
        for(Nota nota:alumno.getNotas()){
            suma += nota.getNotaExamen();
            contador++;
        }
        double promedio = suma/contador;
        System.out.println("Promedio de notas: " + promedio);
        return promedio;
    }

    public Alumno() {
        this.notas = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(Nota nota) {
        notas.add(nota);
    }
}
