import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class InterficieTONTA {
public static void main(String[] args) {

		// ("fitxer_dades.csv");
		File arxiu1 = new File("C:\\Users\\DAM\\Documents\\NetBeansProjects\\generador_llistats\\fitxer_dades.csv");
                //C:\Users\DAM\Documents\NetBeansProjects\generador_llistats\fitxer_dades.csv
		try {
			processarCSV(arxiu1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void processarCSV(File a1) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(a1));
		String linia;
		String camp;
		boolean bandera=true;
		ArrayList<String> columna = new ArrayList<String>();
		while ((linia = input.readLine()) != null) {
			ArrayList<String> contingutFile = new ArrayList<String>();
			int mida = linia.length();
			int intAux = 0;
			char cadenaChar[] = new char [mida];
				cadenaChar = linia.toCharArray();

			for (int i = 0; i < mida; i++) {
				if (cadenaChar[i] == ',') {
					camp = linia.substring(intAux, i);
					intAux = i + 1;
					if (bandera) {
						columna.add(camp);
						System.out.println(camp);
					} else {
						contingutFile.add(camp);
						System.out.println(camp);
					}
				} 
				else if (i==mida -1){
					camp = linia.substring(intAux, i+1);
					if(bandera){
						columna.add(camp);
						for(int x=0;x<columna.size();x++){
							//modeloTabla.addColumn());
							System.out.println(columna.get(x).toString());
						}
					}else {
						contingutFile.add(camp);
						//modeloTabla.addRow(contingutFile.toArray());
						System.out.println(contingutFile.toArray().toString());
					}
					bandera = false;
				}
			}

		}
		input.close();

	}
}
