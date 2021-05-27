package ejercmanana;

public class Libro {
    private String titulo;
    private String jsbn;
    private String autor;
    private String status;

    public Libro() {
    }

    public Libro(String titulo, String jsbn, String autor, String status) {
        this.titulo = titulo;
        this.jsbn = jsbn;
        this.autor = autor;
        this.status = status;
    }

    public void prestamo(Libro libro){
        this.status = "Prestado";
    }

    public void devolucion(){
        this.status = "Devuelto";
    }

    public String toString(){
        return this.getTitulo() + " " + this.getJsbn() + " " + this.getAutor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getJsbn() {
        return jsbn;
    }

    public void setJsbn(String jsbn) {
        this.jsbn = jsbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
