
package taller_1_p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller_1_P3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String>Empleado=new ArrayList();
        ArrayList<String>Secretario=new ArrayList();
        ArrayList<String>Vendedor=new ArrayList();
        ArrayList<String>Carro=new ArrayList();
        ArrayList<String>Cliente=new ArrayList();
        ArrayList<String>jefeDeZona=new ArrayList();
        
        
        Carro  MyCarro = new  Carro("324-taz","TOYOTA","2023");
        Carro.add(MyCarro.toString());
        Secretario MySecretario = new Secretario ("320-55088-57", "Doris", "A-7", 1200000, "3200885535", "Pescadero", "Valderrama", "Secretario", "2-años");
        Secretario.add(MySecretario.toString());
        Cliente MyCliente= new Cliente("Orlando", "1193237853", "3206627768", "Pescadero");
        Cliente.add(MyCliente.toString());
        Vendedor MyVendedor = new Vendedor("3789521463", "A", Cliente,  MyCarro, "Sebastian", "A-5", 1600000, "3789521463", "Los Patios", "Valderrama","Vendedor", "5-años");
        Vendedor.add(MyVendedor.toString());
        JefeDeZona MyJefeDeZona = new JefeDeZona("Doris", Vendedor, MyCarro, "A-1", "Steven", "A-1", 14000000, "3208805535", "El Bosque ", "El Boss", "jefe de zona", "12-años");
        jefeDeZona.add(MyJefeDeZona.toString());
        
        
        String x="";
        int v=0, submenu;
        boolean infinity = true;
        
        while(infinity==true){
            
            
            System.out.println("\nBienvenido, con le gustaria trabajar el dia de hoy?");
            System.out.println("-1-Jefe De Zona");
            System.out.println("-2-Emoleados");
            System.out.println("-3-Secretari@s");
            System.out.println("-4-Vendedores");
            System.out.println("-5-Clientes");
            System.out.println("-6-Carro");
            
            
            v=sc.nextInt();
            
            if (v==6){
                System.out.println("\nMuchas gracias por usar este servicio");
              System.exit(0);
            }
            
            for(int a=0; a<v; a++){  

                  if(a==0 && a==(v-1)){ 
                   x="Empleado";
                  } else if(a==1 && a==(v-1)){
                   x="Pelicula";
                  }else if(a==2 && a==(v-1)){ 
                   x="Sala de cine";
                  }else if(a==3 && a==(v-1)){ 
                   x="Usuario";
                  }else if(a==4 && a==(v-1)){ 
                   x="Producto";
                  }
            }
            
            submenu=Submenu(sc,x);
            
            switch(submenu){
                 case 1:
                     if(x.equals("Jefe De Zona")){
                         jefeDeZona = Add (jefeDeZona,sc,x,Cliente,MyCarro,Vendedor);
                     }else if(x.equals("Empleado")){
                         Empleado = Add (Empleado,sc,x,Cliente,MyCarro,Vendedor);
                     }else if (x.equals("Secretari@")){
                         Secretario = Add (Secretario,sc,x,Cliente,MyCarro,Vendedor);
                     }else if (x.equals("Vendedores")){
                         Vendedor = Add(Vendedor,sc,x,Cliente,MyCarro,Vendedor);
                     }else if (x.equals("Clientes")){
                         Cliente = Add(Cliente,sc,x,Cliente,MyCarro,Vendedor);    
                    }else if (x.equals("Carros"))
                            Carro = AddCar(Carro,sc,x);
                    
                     
                     break;
                     
                  case 2:
                     if(x.equals("Jefe De Zona")){
                         jefeDeZona= Delete (jefeDeZona,sc,x);
                     }else if(x.equals("Empleado")){
                         Empleado= Delete(Empleado,sc,x);
                     }else if (x.equals("Secretari@")){
                         Secretario=Delete(Secretario,sc,x);
                     }else if (x.equals("Vendedor")){
                         Vendedor=Delete(Vendedor,sc,x);
                     }else if (x.equals("Cliente")){
                         Cliente=Delete(Cliente,sc,x);
                     }else if (x.equals("Carros"))
                         Carro=Delete(Carro,sc,x);
                     break;
                     
                  case 3:
                    if(x.equals("Jefe De Zona")){
                       Show(jefeDeZona); 
                    }else if(x.equals("Empleado")){
                        Show(Empleado);
                    }else if(x.equals("Secretari@")){
                        Show(Secretario);
                    }else if(x.equals("Vendedor")){
                        Show(Vendedor);
                    }else if(x.equals("Cliente")){
                        Show(Cliente); 
                    }else if (x.equals("Carros")){
                        Show(Carro);
                    }
             }
 
        }
        
        
    }
        public static int Submenu(Scanner sc, String x){
        System.out.println("\nBienvenido al submenu "+x);
        System.out.println("Que le gustaria hacer el dia de hoy?");
        System.out.println("1->Agregar "+x);
        System.out.println("2->Eliminar "+x);
        System.out.println("3->Ver "+x);
        System.out.println("4->Salir");
        return sc.nextInt();  
        
    }
        
        public static ArrayList Add(ArrayList storage,Scanner sc,String x,ArrayList Cliente,Carro MyCarro,ArrayList Vendedor){
           int cycles=0;
           System.out.println("cuantos"+x+" quieres agregar?");
           cycles =sc.nextInt();
           
           for(int i=0; i<cycles; i++){
              int aux = 0;
              
              String NumCli=" ",DirCli=" ";
              String telefono=" ", Direccion=" ",ZonaTravajo=" ", rol=" ",años=" ",fax=" ",NumMo=" ",AreVe=" ",Despacho=" " ; ArrayList lista; ArrayList carro;
              double salary=0;
              
              System.out.println("\nIngrese los siguientes datos: ");
              System.out.print("Nombre: ");
              String Name =sc.next();
              System.out.print("# Codigo: ");
              String Code = sc.next();
              
              if(x.equals("Empleado")){
                  System.out.print("Salario = ");
                  salary = sc.nextDouble();
                  System.out.println("# de telefono");
                  telefono = sc.next();
                  System.out.println("Direccion");
                  Direccion = sc.next();
                  System.out.println("Zona de travajo");
                  ZonaTravajo = sc.next();
                  System.out.println("Ingrese el Rol");
                  rol = sc.next();
                  System.out.println("Ingrese los años en la empresa");
                  años = sc.next();
                  
                  Empleado  MyEmpleado = new Empleado(Name, Code, salary, telefono, Direccion, ZonaTravajo, rol, años);
              }
              if(x.equals("Secretario")){
                  System.out.print("Salario = ");
                  salary = sc.nextDouble();
                  System.out.println("# de telefono");
                  telefono = sc.next();
                  System.out.println("Direccion");
                  Direccion = sc.next();
                  System.out.println("# de Fax");
                  fax=sc.next();
                  System.out.println("Zona de travajo");
                  ZonaTravajo = sc.next();
                  
                  Secretario MySecretario = new Secretario(fax, Name, Code, salary, telefono, Direccion, ZonaTravajo, rol, años);
              }
              if(x.equals("Vendedor") &&  !Cliente.isEmpty() ){
                  System.out.print("Salario = ");
                  salary = sc.nextDouble();
                  System.out.println("# de telefono");
                  telefono = sc.next();
                  System.out.println("Direccion");
                  Direccion = sc.next();
                  System.out.println("# de Telefono");
                  NumMo = sc.next();
                  System.out.println("Ingrese el aria de Ventas");
                  AreVe = sc.next();
                  System.out.println("Lista");
                  System.out.println("Carro");
                  System.out.println("Zona de travajo");
                  ZonaTravajo = sc.next();
                  
                  Vendedor MyVendedor = new Vendedor(NumMo, AreVe, Cliente, MyCarro, Name, Code, salary, telefono, Direccion, ZonaTravajo, rol, años);
              
              }else if(Cliente.isEmpty()){
                  System.out.println("Tienes que crear clientes para tener vendedor ");
              }
              
              if(x.equals("Cliente")){
                  System.out.println("# de celular");
                  NumCli = sc.next();
                  System.out.println("Direccion");
                  DirCli = sc.next();
                  
                  Cliente MyCliente = new Cliente (Name, Code, NumCli, DirCli);
              }
              if(x.equals("Jefe De Zona")){
                  System.out.print("Salario = ");
                  salary = sc.nextDouble();
                  System.out.println("# de telefono");
                  telefono = sc.next();
                  System.out.println("Direccion");
                  Direccion = sc.next();
                  System.out.println("Carro");
                  System.out.println("Despacho");
                  Despacho = sc.next();
                  System.out.println("Ingrese la cantidad de años que lleva travajando ");
                  años = sc.next();
                  
              }
              
              JefeDeZona MyJefeDeZona = new JefeDeZona("Doris", Vendedor, MyCarro, Despacho, Name, Code, salary, telefono, Direccion,"El Boss" , rol, años);
                           
           }
           
           return storage; 
           
        }
        public static ArrayList AddCar(ArrayList storage,Scanner sc,String x){
            
            int cycles=0;
           System.out.println("cuantos"+x+" quieres agregar?");
           cycles =sc.nextInt();
           
           for(int i=0; i<cycles; i++){
              int aux = 0;
            
            
            String Matriculo=" ",Modelo=" ",Marca=" ";
            
            if(x.equals("Carro")){
                  System.out.println("Marca");
                  Marca = sc.next();
                  System.out.println("Modelo");
                  Modelo = sc.next();
                  System.out.println("Matricula");
                  Matriculo = sc.next();
              }
            
            Carro MyCarro = new Carro(Matriculo, Marca, Modelo);
            
           }
           
           return storage; 
           
        }
        
     public static void Show(ArrayList storage){
       System.out.println("");
       for(int i=0; i<storage.size(); i++){
           System.out.println("En la poscicion "+i+" se encuentra: \n"+storage.get(i));
       }
   }
   
   public static ArrayList Delete(ArrayList storage, Scanner keyboard, String x){
       System.out.println("Que elemento deseas remover de los datos de "+x);
       System.out.println("Recuerda que los elementos van del 0 hasta N numero");
       int i=keyboard.nextInt();
       storage.remove(i);
       
       return storage;
   }
        

}
    

