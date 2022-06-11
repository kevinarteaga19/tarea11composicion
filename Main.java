package tarea11.composicion;

public class Main {

    public static void main(String[] args) {
        Moto moto = new Moto(2,"Anaranjado","Grande");

        moto.agregar1("GLP");

        moto.agregar2("398cc",6);
        moto.agregar2("889cc", 6);

        System.out.println("------MOTO------");
        System.out.println("COLOR: "+ moto.getColor());
        System.out.println("MODELO: "+moto.getModelo());

        System.out.println("------GASOLINA------");
        moto.listar1();

        System.out.println("------MOTOR------");
        moto.listar2();
    }
}
