class Trabajador extends Persona {
    float salario;

    public Trabajador(int edad, String nombre, int telefono, float salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }
}
