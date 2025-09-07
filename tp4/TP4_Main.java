package tp4;

/**
 *
 * @author Fernando
 */
public class TP4_Main {

    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Fernando Gomez", "Programador"); //Objeto instanciado con 2 argumentos
        Empleado e2 = new Empleado("Juan Perez", "Programador");
        Empleado e3 = new Empleado("Juancito Perez", "Tester");
        Empleado e4 = new Empleado("Juancito Gonzalez", "Tester");
        Empleado e5 = new Empleado(15,"Joaquin Gomez", "Programador",1000000);//Objeto instanciado con 4 argumentos
        Empleado e6 = new Empleado(16,"Pedro Perez", "Programador",159999);
        Empleado e7 = new Empleado(17,"Ana Perez", "Tester",200000);
        Empleado e8 = new Empleado(18,"Maria Gonzalez", "Tester",300000);
        
        
        e1.actualizarSalario(25); //Actualizar salario con porcentaje     
        e4.actualizarSalario(4000.0); //Actualizar salario con monto fijo
      
        
        
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());
        System.out.println(e6.toString());
        System.out.println(e7.toString());
        System.out.println(e8.toString());
        
        
        
        
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
