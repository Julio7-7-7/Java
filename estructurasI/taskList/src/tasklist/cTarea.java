package tasklist;

public class cTarea {
    
    public String titulo;
    public String descripcion;
    public int prioridad;
    
    public cTarea(String titulo, String descripcion, int prioridad){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    
    public int getPrioridad(){
        return prioridad;
    }

    


}
