package Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Plato> platos = new ArrayList<Plato>();

        System.out.println("--------CREADOR DE MENU--------");
        System.out.println("-----Ingrese los datos del plato-----");

        boolean salirPlato;
        String respuestaPlato;
        do {
            Plato plato = new Plato();
            System.out.print("Nombre: ");
            plato.setNombreCompleto(sc.nextLine());
            System.out.print("Precio: ");
            plato.setPrecio(sc.nextDouble());
            sc.nextLine();
            System.out.print("Es Bebida(true or false): ");
            plato.setEsBebida(sc.nextBoolean());
            sc.nextLine();
            if (plato.getEsBebida()==false){
                boolean salirIngrediente;
                String respuesta ;
                do {
                    Ingrediente ingrediente = new Ingrediente();
                    System.out.print("Nombre Ingrediente: ");
                    ingrediente.setNombre(sc.nextLine());
                    System.out.print("Cantidad: ");
                    ingrediente.setCantidad(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Unidad de medida: ");
                    ingrediente.setUnidaDemedida(sc.nextLine());
                    plato.setIngredientes(ingrediente);
                    System.out.println("Desea cargar otro ingrediente? \n SI O NO");
                    respuesta=sc.nextLine();
                    if (respuesta.toLowerCase().equals("si")){
                        salirIngrediente=true;
                    }else {
                        salirIngrediente=false;
                    }
                }while (salirIngrediente);
            }
            platos.add(plato);
            System.out.println("Desea cargar otro plato? \n SI O NO");
            respuestaPlato=sc.nextLine();
            if (respuestaPlato.toLowerCase().equals("si")){
                salirPlato=true;
            }else {
                salirPlato=false;
            }
        }while(salirPlato);
        System.out.println("-----------MENÚ----------------");
        for (Plato p : platos){
            System.out.println(p.getNombreCompleto());
            System.out.println("Precio: $ " + p.getPrecio());
            if(p.getEsBebida()==false){
                System.out.println("Ingredientes:");
                System.out.println("Nombre"+"\t"+"Cantidad"+"\t"+"Unidad de Medida");
                for (Ingrediente ingrediente : p.getIngredientes()){
                    System.out.println(ingrediente.getNombre()+"\t" + ingrediente.getCantidad()+"\t"+"\t"+"\t" + ingrediente.getUnidaDemedida());
                }
                System.out.println();
            }
            System.out.println("---------------------------------- ");
        }
    }
}
