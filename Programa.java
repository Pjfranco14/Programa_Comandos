import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		
		ListadoComandos comando = new ListadoComandos();
		DefinicionComandos Defcomandos = new DefinicionComandos();
		
		
		System.out.println("                                  ");
		System.out.println("            COMANDOS");
		System.out.println("***************************************");
		System.out.println("                                  ");
		System.out.print("Ingresa el nombre del comando: ");
		
		boolean programaEncendido = true;
		do {
			
		Scanner preguntaComando = new Scanner(System.in);
		
		String datoUsuario = preguntaComando.nextLine();
		
		if (datoUsuario.equals("")) {
			System.out.print("Ingresa el nombre del comando: ");
			
			}else if (datoUsuario.equals("exit")) {
			programaEncendido = false;
				} else {
					for(int i = 0;i<comando.comandos.length;i++) {
				
						if(datoUsuario.equals(comando.comandos [i])) {
					
							System.out.println("Comando:     "+comando.comandos [i]);
							System.out.println("Definición:  "+comando.DefinicionComandos [i]);
					}
				}
			}
		}while (programaEncendido);
		
		}
	}
