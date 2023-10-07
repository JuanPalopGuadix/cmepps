package pkg;

public class Empleado {
	public enum TipoEmpleado {VENDEDOR , ENCARGADO};
	TipoEmpleado tipo;
	float ventaMes;
	float horasExtra;
	
	public static float  calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		 int salario = 0;
		 //salario base
		 if(tipo == TipoEmpleado.VENDEDOR) {
			 salario = 2000;
		 };
		 if(tipo == TipoEmpleado.ENCARGADO) {
			 salario = 2500;
		 };
		 //primas
		 if(ventasMes >=1000) {
			 if(ventasMes >=1500) {
				 salario += 200;
			 }else {
				 salario += 100;	 
			 }
		 };
		 //horas extra
		 if(horasExtra>0)
			 salario += horasExtra*30;
		 return salario;
	 }
	public static float calculoNominaNeta(float nominaBruta) {
		 if(nominaBruta <= 2100) {
			 return nominaBruta;
		 }else {
			 if(nominaBruta <= 2500) {
				 return nominaBruta*(1-0.15f);
			 }else {
				 return nominaBruta*(1-0.18f);
			 }
		 }
	 }
	 
	 
}
