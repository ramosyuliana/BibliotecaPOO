package biblioteca;

public class Usuario {
    private String nombre;
    private String id;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void prestarLibro(Libro libro){
        System.out.println(nombre + " intenta prestar el libro");
        libro.prestar();
    }


}
