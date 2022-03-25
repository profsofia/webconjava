
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //métodos sin implementación
    
    public void crearPersona(Persona perso){
    controlPersis.crearPersona(perso);
    }
    public void eliminarPersona(Persona perso){
        controlPersis.eliminarPersona(perso);
    }
    public void eliminarPersona(int id){
    controlPersis.eliminarPersona(id);
    }
    public List <Persona> traerPersonas(){
    return controlPersis.traerPersonas();
    
    }
    
}
