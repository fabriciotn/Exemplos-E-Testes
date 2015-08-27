package AjustaDiretorio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AjustaDiretorio {

	public static void main(String[] args) {
		
		List<String> unidades = new ArrayList<String>();
		unidades.add("ALP");
		unidades.add("BET");
		unidades.add("DIA");
		unidades.add("DIV");
		unidades.add("GOV");
		unidades.add("HJK");
		unidades.add("ITU");
		unidades.add("JFO");
		unidades.add("MCU");
		unidades.add("MOC");
		unidades.add("PAL");
		unidades.add("PAS");
		unidades.add("PMI");
		unidades.add("PNO");
		unidades.add("POC");
		unidades.add("SJR");
		unidades.add("SLA");
		unidades.add("UDI");
		unidades.add("URA");
		
		boolean funcionou;
		File arquivo;
		File destino;
		File novoFile;
		
		for (String unidade : unidades) {
			arquivo = new File("C:\\HMAFT02_UNIDADES\\" + unidade + "\\HMAFT02.XLS");
			destino = new File("C:\\HMAFT02_UNIDADES");
			novoFile = new File(destino, unidade + "_" + arquivo.getName());
			funcionou = arquivo.renameTo(novoFile);
			if(funcionou){
				System.out.println("funcionou");
			}else{
				System.out.println("não funcionou");
			}
				
		}
	}
}
