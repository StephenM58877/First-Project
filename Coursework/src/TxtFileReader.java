import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtFileReader {
	List<Contact> contactList=new ArrayList<>();
	 public void run() {

			String textFile = "C:/Users/CompUser/Desktop/Test.txt";
			BufferedReader br = null;
			String line = "";
			try {
				br = new BufferedReader(new FileReader(textFile));
				while ((line = br.readLine()) != null) {
					String[] LineData = line.split(",");
					Contact cOne = new ContactImpl(Integer.parseInt(LineData[0]),LineData[1],LineData[2]);
					contactList.add(cOne);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 }
}
