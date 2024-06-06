import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
      
        Set<String> colores = new HashSet<>();
        
     
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        
   
        System.out.println("Elementos en el conjunto: " + colores);
        
       
        System.out.println("¿El conjunto contiene 'Rojo'? " + colores.contains("Rojo"));
        System.out.println("¿El conjunto contiene 'Amarillo'? " + colores.contains("Amarillo"));
        
  
        colores.remove("Verde");
        System.out.println("Elementos en el conjunto después de eliminar 'Verde': " + colores);
        
    
        System.out.println("Tamaño del conjunto: " + colores.size());
        
    
        System.out.println("¿El conjunto está vacío? " + colores.isEmpty());
        

        colores.clear();
        System.out.println("Elementos en el conjunto después de limpiar: " + colores);
    }
}
