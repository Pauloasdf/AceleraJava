package LocadoraDeCarros;

public enum CarType {

    COMUN(1), SUV(2), CAMINHONETE(3), MOTO(4);

    private final int type;

    CarType(int type){
        this.type = type;
    }
    public int getType(){
        return type;
    }

    public static CarType validateType(int id) {
        for(CarType e : values()) {
            if (e.getType() == id)
                return e;
        }
        return null;
    }
}
