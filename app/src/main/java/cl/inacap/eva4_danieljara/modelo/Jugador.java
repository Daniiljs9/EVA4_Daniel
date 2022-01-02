package cl.inacap.eva4_danieljara.modelo;

public class Jugador {
    private int idJugador;
    private String nombre;
    private String rut;
    private String altura;
    private String peso;
    private int edad;
    private String nacimiento;
    private String sexo;
    private String club ;
    private String discapacidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getAltura() {
        return altura;
    }

    public int getIdJugador() { return idJugador; }

    public void setIdJugador(int idJugador) { this.idJugador = idJugador; }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public Jugador(int idJugador, String nombre, String rut, String altura, String peso, int edad, String nacimiento, String sexo, String club, String discapacidad) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.rut = rut;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.club = club;
        this.discapacidad = discapacidad;
    }

    public Jugador() {
    }

    @Override
    public String toString() {
        return " nombre: " + nombre +
                "\n rut: " + rut +
                "\n club: " + club;
    }
}
