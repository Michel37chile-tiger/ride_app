package cl.rideapp.demo.model;

//import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    //Contructor vacío
    public Rol() {}

    //Constructor con parámetro
    public Rol(String nombre) {
        this.nombre = nombre;
    }

    // ---------Getters------------
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // ---------Setters------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
