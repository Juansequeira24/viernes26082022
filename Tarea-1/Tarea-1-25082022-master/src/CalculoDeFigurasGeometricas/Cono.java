package CalculoDeFigurasGeometricas;

public class Cono {

	public static void main(String[] args) {
		int r;
		double areaTotal, Volumen, h, areaLateral, a, g;
		
		
		h=10;
		r=4;
		g= Math.sqrt(Math.pow(h,2)+Math.pow(r,2));
		a=Math.PI*r;
		areaLateral= a*g;

		areaTotal= a*(g+r);
		
		Volumen = Math.PI*(Math.pow(r,2))*h/3;
		
		
		System.out.println("1.Datos del Cono:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Altura: "+h);
		System.out.println("4.Generatriz: " +String.format("%.2f",g));
		System.out.println("5.Area Lateral: "+String.format("%.2f",areaLateral));
		System.out.println("6.Area Total: "+String.format("%.2f",areaTotal));
		System.out.println("7.Volumen: "+String.format("%.2f",Volumen));
	}

}
