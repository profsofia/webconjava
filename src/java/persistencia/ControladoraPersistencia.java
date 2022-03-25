
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    PersonaJpaController persoJpa = new PersonaJpaController();
    
    
    //métodos
    public void crearPersona (Persona pers){
        persoJpa.create(pers);
    }
    public void eliminarPersona (int id){
        try {
            persoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona(Persona pers){
        try {
            persoJpa.destroy(pers.getId());
                    } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> traerPersonas(){
    return persoJpa.findPersonaEntities();
    }
    
    
    
}
