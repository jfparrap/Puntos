
public class Linea{
  
  public void MoverLineaHorizontal(Punto a, Punto b, double z) {
	  a.MoverPuntoHorizontal(z);
	  b.MoverPuntoHorizontal(z);
  }
  
  public void MoverLineaVertical(Punto a, Punto b, double z) {
	  a.MoverPuntoVertical(z);
	  b.MoverPuntoVertical(z);
  }
  
  public void MoverLineaDiagonal(Punto a, Punto b, double z, double w) {
	  a.MoverPuntoDiagonal(z,w);
	  b.MoverPuntoDiagonal(z,w);
  }
  
  public void imprimir(Punto a, Punto b){
	    a.imprimir();
	    b.imprimir();
	  }
}

