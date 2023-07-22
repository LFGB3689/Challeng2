package mx.Conversor.Test;

import javax.swing.JOptionPane;

import mx.Conversor.Modelo.Moneda;

/*
- Convertir de la moneda de tu país a Dólar
- Convertir de la moneda de tu país  a Euros
- Convertir de la moneda de tu país  a Libras Esterlinas
- Convertir de la moneda de tu país  a Yen Japonés
- Convertir de la moneda de tu país  a Won sul-coreano
- Convertir de Dólar a la moneda de tu país
- Convertir de Euros a la moneda de tu país
- Convertir de Libras Esterlinas a la moneda de tu país
- Convertir de Yen Japonés a la moneda de tu país
- Convertir de Won sul-coreano a la moneda de tu país
*/

public class testmain {
	public static void main(String[] args) {
		menu();
		fin();
	}
	
	public static void menu() {
		int resp = JOptionPane.showInternalConfirmDialog(null,"Conversor", "Menú",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if(resp == 0) {
			seleccion();
		}
		else if(resp == -1) {
			fin();
		}
		else if(resp == 1) {
			fin();
		}
	}
	
	public static void seleccion() {
		Object resp = JOptionPane.showInputDialog
				(
					null, 
					"Escoge una opcion",
					"Tipo de conversion", 
					JOptionPane.INFORMATION_MESSAGE,
					null, 
					new Object[]
							{
								"Convertir de Peso a Dólar",
								"Convertir de Peso a Euros",
								"Convertir de Peso a Libras Esterlinas",
								"Convertir de Peso a Yen Japonés",
								"Convertir de Peso a Won sul-coreano",
								"Convertir de Dólar a Peso",
								"Convertir de Euros a Peso",
								"Convertir de Libras Esterlinas a Peso",
								"Convertir de Yen Japonés a Peso",
								"Convertir de Won sul-coreano a Peso"
							},	
					"-- Seleccion --"
				);
		if(resp.equals("Convertir de Peso a Dólar")) {
			float peso=1;
			float otro=0;
			float con=(float)17.11;
			String s1 = "Peso";
			String s2 = "Dolar";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);	
		}
		else if(resp.equals("Convertir de Peso a Euros")) {
			float peso=1;
			float otro=0;
			float con=(float)18.76;
			String s1 = "Peso";
			String s2 = "Euro";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Peso a Libras Esterlinas")) {
			float peso=1;
			float otro=0;
			float con=(float)21.96;
			String s1 = "Peso";
			String s2 = "Libras Esterlinas";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Peso a Yen Japonés")) {
			float peso=1;
			float otro=0;
			float con=(float)0.12;
			String s1 = "Peso";
			String s2 = "Yen Japonés";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Peso a Won sul-coreano")) {
			float peso=1;
			float otro=0;
			float con=(float)0.013;
			String s1 = "Peso";
			String s2 = "Won sul-coreano";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		
		else if(resp.equals("Convertir de Dólar a Peso")) {
			float peso=0;
			float otro=1;
			float con=17;
			String s1 = "peso";
			String s2 = "Dolar";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Euros a Peso")) {
			float peso=0;
			float otro=1;
			float con=(float)18.76;
			String s1 = "Peso";
			String s2 = "Euro";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Libras Esterlinas a Peso")) {
			float peso=0;
			float otro=1;
			float con=(float)21.96;
			String s1 = "Peso";
			String s2 = "Libras Esterlinas";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Yen Japonés a Peso")) {
			float peso=0;
			float otro=1;
			float con=(float)0.12;
			String s1 = "Peso";
			String s2 = "Yen Japonés";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
		else if(resp.equals("Convertir de Won sul-coreano a Peso")) {
			float peso=0;
			float otro=1;
			float con=(float)0.013;
			String s1 = "Peso";
			String s2 = "Won sul-coreano";
			String s3 = resp.toString();
			cantidad(peso, otro, con, s1, s2, s3);
		}
	}
	
	public static void cantidad(float peso, float otro, float con, String s1, String s2, String s3) {
		String can;
		String s4;
		Moneda moneda = new Moneda(peso,otro,con);
		if(peso != 0) {
			can = JOptionPane.showInputDialog("Ingrese la cantidad a convertir","0");
			peso = Float.valueOf(can);
			
			if(peso <= 0) {
				s4 = "Valor de 1 "+s1+" a "+s2+" es "+moneda.getOtro()+", Desea continuar?";
				resultado(s4,s3);
			} else {
				moneda.setPeso(peso);
				s4="Valor de "+peso+" "+s1+" a "+s2+" es "+moneda.getOtro()+", Desea continuar?";
				resultado(s4,s3);
			}
		} else if(otro != 0) {
			can = JOptionPane.showInputDialog("Ingrese la cantidad a convertir","0");
			otro = Float.valueOf(can);
			
			if(otro <= 0) {
				s4="valor de 1 "+s2+" a "+s1+" es "+moneda.getPeso()+", Desea continuar?";
				resultado(s4,s3);
			} else {
				moneda.setOtro(otro);
				s4="valor de "+otro+" "+s2+" a "+s1+" es "+moneda.getPeso()+", Desea continuar?";
				resultado(s4,s3);
			}
		}
	}
	
	public static void resultado(String s1, String s2) {
		int resp = JOptionPane.showInternalConfirmDialog(null,s1, s2,JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if(resp == 0) {
			menu();
		}
	}
	
	public static void fin(){
		JOptionPane.showInternalMessageDialog(null,"Gracias por usar el programa");
	}
}
