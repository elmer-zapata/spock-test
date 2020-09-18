

public  class ComercioBuild {
    String name;
    int descuento;

    public ComercioBuild(){
        this.name = "ketal";
        this.descuento = 10;
    }

    public ComercioBuild withDisccount(int disccount){
        this.descuento = disccount;
        return this;
    }
    public ComercioBuild name(String name){
        this.name = name;
        return this;
    }

    public Comercio build(){
        return new Comercio(this.name, this.descuento);
    }


}
