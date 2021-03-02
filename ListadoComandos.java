public class ListadoComandos {
	
	String comandos [] = new String[7];
	String DefinicionComandos [] = new String [7];
		
	ListadoComandos() {
			
			comandos[0]="pwd";
			comandos[1]="cd";
			comandos[2]="ls";
			comandos[3]="cat";
			comandos[4]="cp";
			comandos[5]="sudo";
			comandos[6]="head";
			
	
			
			DefinicionComandos [0]= "Encontrar ruta del directorio";
			DefinicionComandos [1]= "Navegar entre directorios";
			DefinicionComandos [2]= "Ver contenido del directorio";
			DefinicionComandos [3]= "Concatenar";
			DefinicionComandos [4]= "Copiar archivos";
			DefinicionComandos [5]= "Permite realizar tareas que requiere permisos";
			DefinicionComandos [6]= "ver las primeras lines de cualquier archivo";
		}
}
