package tp4;


public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    /*
    Constructores sobrecargados:
○ Uno que reciba todos los atributos como parámetros.
○ Otro que reciba solo nombre y puesto, asignando un id
automático y un salario por defecto.
○ Ambos deben incrementar totalEmpleados.
    */

    
    public Empleado(String nombre, String puesto){
        int contadorId = totalEmpleados + 1;
        this(contadorId,nombre,puesto,100000);
        
    }
    
    
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        totalEmpleados++;
    }
    
    
    private void setId(int id){
        
        if(id != 0 && id > 0){
            this.id = id;
        }
        
    }
     
    
    public int getId() {
        return id;
    }
    
    
    private void setNombre(String nombre){
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }
        

    
    private void setPuesto(String puesto){
        if(puesto != null && !puesto.isEmpty()){
            this.puesto = puesto;
        }
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    
    private void setSalario(double salario){
        if(salario != 0 && salario > 0){
            this.salario = salario;
        }
    }
    
    public double getSalario() {
        return salario;
    }
    

    
    /*
   Método estático mostrarTotalEmpleados():
○ Retornar el total de empleados creados hasta el momento.*/
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    
    /*
        Métodos sobrecargados actualizarSalario:
○ Uno que reciba un porcentaje de aumento.
○ Otro que reciba una cantidad fija a aumentar.
    */
    
    public void actualizarSalario(int porcentaje){
        this.salario += (this.salario * porcentaje) / 100;
    }
    
    public void actualizarSalario(double cantidadFija){
        this.salario += cantidadFija;
    }
    
    
    
    @Override
    public String toString() {
        return "Empleado{" + "id= " + this.id + ", nombre= " + this.nombre + ", puesto= " + this.puesto + ", salario= " + this.salario + '}';
    }
    
    
    
}
