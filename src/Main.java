public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(22);
        cliente.setNombre("Ione");
        cliente.setTelefono(192837465);
        cliente.setCredito(1500);

        System.out.println(cliente.getNombre() + ", " + cliente.getEdad() + ", " + cliente.getTelefono() + ", " + cliente.getCredito());

        Trabajador trabajador = new Trabajador(31, "Abel", 99887766, 2600.66f);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());


    }

}

