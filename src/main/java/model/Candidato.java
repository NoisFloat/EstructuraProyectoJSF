package model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

//Para que pueda ser conocida por JSF
//Espeficicamos el alcance

@Named
@RequestScoped
public class Candidato {
    public String nombre = "Introduce tu nombre ";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
