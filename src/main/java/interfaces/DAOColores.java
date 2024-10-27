
package interfaces;

import java.util.List;
import models.colores;


public interface DAOColores {
       
    // metodo para obtener una lista de todos los colores disponibles
    public List<colores> getallColors ()throws Exception;
    
    public int obtenerIdPorNombre(String nombre_color) throws Exception ;
}
