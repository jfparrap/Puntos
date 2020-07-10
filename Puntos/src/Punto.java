import java.util.Scanner;
public class Punto{
  private double x;
  private double y;
  
  public double Distancia(Punto a){
   double res;
   res=Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2));
   return res;
  }
  
  public double Origen () {
	double res;
	res=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
	return res;	  
  }
  public void MoverPuntoHorizontal(double z) {
  this.x=this.x+z;
  }
  public void MoverPuntoVertical(double z) {
  this.y=this.y+z;
  }
  
  public void MoverPuntoDiagonal(double z, double w) {
  this.x=this.x+z;
  this.y=this.y+w;
  }
  
  public void leer(){
  Scanner s=new Scanner (System.in);
  this.x=s.nextDouble();
  this.y=s.nextDouble();
}
  public void imprimir(){
	    System.out.println("("+this.x+","+this.y+")");
	  }
}