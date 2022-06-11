package tarea11.composicion;

import java.security.PublicKey;

public class Moto {

    private String color;

    private String modelo;

    private Gasolina[] gasolina;

    private Motor[] motor;

    private int contador1;

    private int contador2;

    public Moto (int size, String color, String modelo)
    {
        this.color = color;
        this.modelo = modelo;

        this.gasolina = new Gasolina[size];
        this.contador1 = 0;

        this.motor = new Motor[size];
        this.contador2 = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void agregar1(String tipo)
    {
        this.gasolina[this.contador1] = new  Gasolina(tipo);
        this.contador1++;
    }

    public void agregar2(String cilingraje, int cambios)
    {
        this.motor[this.contador2] = new Motor(cilingraje, cambios);
        this.contador2++;
    }

    public void listar1()
    {
        for(int i = 0; i<this.contador1;i++)
        {
            System.out.println("TIPO: "+this.gasolina[i].getTipo());
        }
    }

    public void listar2()
    {
        for(int j = 1; j<this.contador2; j++)
        {
            System.out.println("NUMERO DE CAMBIO: "+this.motor[j].getCambios());
            System.out.println("CILINDRAJE: "+this.motor[j].getCilingraje());
        }
    }
}
