package domain;

public class Especie {
    private String nombre;
    private double porcentajePesoCarnivoro;
    private TipoAlimentacion tipoAlimentacion;

    public Especie(String nombre, TipoAlimentacion tipoAlimentacion, double porcentajePesoCarnivoro) {
        this.nombre = nombre;
        if(tipoAlimentacion.esCarnivoro()){
            this.porcentajePesoCarnivoro = porcentajePesoCarnivoro;
        }
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public static int asignarEspecie(String especie){
    int indiceEspecie=0;
        switch(especie){
            case "León":
                 indiceEspecie=0;
                break;
            case "Tigre":
                indiceEspecie=1;
                break;
            case "Elefante":
                indiceEspecie=3;
                break;
            case "Jirafa":
                indiceEspecie=2;
                break;
         
        
        }
     return indiceEspecie;   
    }
    
    public double getPorcentajePesoCarnivoro() {
        return porcentajePesoCarnivoro;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
