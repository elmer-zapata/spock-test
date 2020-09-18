

class Comercio{
    String name;
    int descuento;
    boolean status;
    public Comercio(){

    }
    public Comercio(String name, int descuento) {
        this.name = name;
        this.descuento = descuento;
        this.status = true;
    }

    public int getDescuento() {
        return this.descuento;
    }
}