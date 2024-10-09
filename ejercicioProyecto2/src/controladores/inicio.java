package controladores;

import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class inicio {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean cerrarMenu = false;
		byte opcionUsuario = 0;
		
		MenuInterfaz mi = new MenuImplementacion();
		
		do {
			try {
				opcionUsuario = mi.mostrarMenu();
				
				switch(opcionUsuario) {
				
				case 0:
					cerrarMenu = true;
					break;
				case 1:
					mi.menuUsuario();
					break;
				case 2:
					mi.menuClub();
					break;
				}
				
			}catch(Exception e) {
				
				System.out.println("ERROR[]" + e.getMessage());
			}
		}while(!cerrarMenu);
	}
}
