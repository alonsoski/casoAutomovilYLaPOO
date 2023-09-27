public class Pokemon {
    private String nombre;
    private int edad;
    private String tipo;
    private boolean salvaje;
    public Pokemon(String nombre, int edad,String tipo){
        this.nombre=nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.salvaje = true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalvaje(boolean salvaje) {
        this.salvaje = salvaje;
    }
    public void acariciar(){
        if (this.salvaje){
            System.out.println("es salvaje, no puedes acariciarlo");
        }else {
            System.out.println("el pokemon sonrie");
        }
    }public void capturar(){
        if(!this.salvaje){
            System.out.println("ya fue capturado");
        }else {
            System.out.println("lo has capturado");
            setSalvaje(false);
        }
    }public void imprimir(){
        System.out.println("nombre:"+this.nombre);
        System.out.println("edad:"+this.edad);
        System.out.println("tipo:"+this.tipo);
        System.out.println("capturado:"+this.salvaje);
    }


}

