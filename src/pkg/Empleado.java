package pkg;

public class Empleado {
	public enum TipoEmpleado {VENDEDOR , ENCARGADO};
	TipoEmpleado tipo;
	float ventaMes;
	float horasExtra;
	
	 float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		 int salario = 0;
		 //salario base
		 if(tipo == TipoEmpleado.VENDEDOR) {
			 salario = 2000;
		 }else {
			 salario = 2500;
		 };
		 //primas
		 if(ventaMes >=1000) {
			 if(ventaMes >=1500) {
				 salario += 200;
			 }else {
				 salario += 100;	 
			 }
		 };
		 //horas extra
		 salario += horasExtra*30;
		 return salario;
	 }
	 float calculoNominaNeta(float nominaBruta) {
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
