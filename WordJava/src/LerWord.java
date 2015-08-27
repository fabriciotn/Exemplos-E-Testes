import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


public class LerWord {

	public static void main(String[] args){
		try {
			FileInputStream arquivo = new FileInputStream("teste.docx");
			
			
			XWPFWordExtractor fs = new XWPFWordExtractor(new XWPFDocument(arquivo));
			//POIFSFileSystem fs = new POIFSFileSystem(arquivo);
			
			//HWPFDocument document = new HWPFDocument(fs);
			WordExtractor word = new WordExtractor(document);
			
			String[] paragrafos = word.getParagraphText();
			
			for (String string : paragrafos) {
				System.out.println(string);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
