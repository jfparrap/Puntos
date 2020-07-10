import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Punto a=new Punto ();
  Punto b=new Punto ();
  Linea l=new Linea();
  int opc;
  double z,w;
  double res;
  System.out.println("Ingrese el punto 1:");
  a.leer();
  System.out.println("Ingrese el punto 2:");
  b.leer();
  System.out.println("Ubicación punto 1:");
  a.imprimir();
  System.out.println("Ubicación punto 2:");
  b.imprimir();

do {
  System.out.println("--------------------------------------");	
  System.out.println("Digite para interactuar con los puntos");
  System.out.println("\nDigite 1 para mover horizontalmente punto 1"); 
  System.out.println("\nDigite 2 para mover horizontalmente punto 2");
  System.out.println("\nDigite 3 para mover verticalmente punto 1");
  System.out.println("\nDigite 4 para mover verticalmente punto 2");
  System.out.println("\nDigite 5 para mover diagonalmente punto 1");
  System.out.println("\nDigite 6 para mover diagonalmente punto 2"); 
  System.out.println("\nDigite 7 para conocer el origen de punto 1");  
  System.out.println("\nDigite 8 para conocer el origen de punto 2");
  System.out.println("\nDigite 9 para conocer la distancia entre los dos puntos");
  System.out.println("\nDigite 10 para mover horizontalmente la linea");
  System.out.println("\nDigite 11 para mover verticalmente la linea");  
  System.out.println("\nDigite 12 para mover diagonalmente la linea");
  System.out.println("\nDigite 13 para salir");
  Scanner q=new Scanner (System.in);
  opc = q.nextInt();
switch(opc){
  case 1:
	  System.out.println("Mover horizontalmente punto 1:");
	  Scanner s=new Scanner (System.in);
	  z=s.nextDouble();
	  a.MoverPuntoHorizontal(z);
	  a.imprimir();
    break;
  case 2:
	  System.out.println("Mover horizontalmente punto 2:");
	  Scanner c=new Scanner (System.in);
	  z=c.nextDouble();
	  b.MoverPuntoHorizontal(z);
	  b.imprimir();
    break;
  case 3:
	  System.out.println("Mover verticalmente punto 1:");
	  Scanner d=new Scanner (System.in);
	  z=d.nextDouble();
	  a.MoverPuntoVertical(z);
	  a.imprimir();
    break;
  case 4:   
	  System.out.println("Mover verticalmente punto 2:");
	  Scanner e=new Scanner (System.in);
	  z=e.nextDouble();
	  b.MoverPuntoVertical(z);
	  b.imprimir();
   break;   
  case 5:
	  System.out.println("Mover diagonalmente punto 1:");
	  Scanner f=new Scanner (System.in);
	  z=f.nextDouble();
	  w=f.nextDouble();
	  a.MoverPuntoDiagonal(z,w);
	  a.imprimir();
    break;
  case 6:
	  System.out.println("Mover diagonalmente punto 2:");
	  Scanner g=new Scanner (System.in);
	  z=g.nextDouble();
	  w=g.nextDouble();
	  b.MoverPuntoDiagonal(z,w);
	  b.imprimir();
	break;
  case 7:
	  res=a.Origen();
	  System.out.println("El origen del punto 1 es:	"+res);
	break;
  case 8:
	  res=b.Origen();
	  System.out.println("El origen del punto 2 es:	"+res);
	break;
  case 9:
	  res=b.Distancia(a);
	  System.out.println("distancia es:	"+res);
	 break;
  case 10:
	  System.out.println("Mover horizontalmente la línea:");
	  Scanner h=new Scanner (System.in);
	  z=h.nextDouble();
	  l.MoverLineaHorizontal( a,b, z);
	  l.imprimir(a,b);
	break;
  case 11:
	  System.out.println("Mover verticalmente la línea:");
	  Scanner i=new Scanner (System.in);
	  z=i.nextDouble();
	  l.MoverLineaVertical( a,b, z);
	  l.imprimir(a,b);
	break;
  case 12:
	  System.out.println("Mover diagonalmente la línea:");
	  Scanner j=new Scanner (System.in);
	  z=j.nextDouble();
	  w=j.nextDouble();
	  l.MoverLineaDiagonal( a,b, z, w);
	  l.imprimir(a,b); 
	break;
  case 13:
	  opc=0;
	break;
  }
 }while(opc!=0);
   
}
}