import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String path = "E:\\SL.txt";
		DataInit datainit = new DataInit();
		datainit.fileInit(path);
		ArrayList<String> data = datainit.readFile(path);
		datainit.searchInfo(data);
	}

}
