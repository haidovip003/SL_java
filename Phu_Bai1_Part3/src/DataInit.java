import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class DataInit {
	
	public void fileInit(String path) {
		try {
			File file = new File(path);	
			
			//Delete file is it already existed
			if(file.exists())
				file.delete();
			
			//Create new file
			file.createNewFile();
			
			//Write data to file
			FileWriter out = new FileWriter(file);
			out.write("Nguyen Thai Phu - Secure Logix - Consultant - 01/01/1990 - 0933493429 - Dalat");
			out.write("\nLe Huy Hoang - Secure Logix - Consultant - 01/01/1982 - 0931234567 - Dalat");
			out.write("\nHo Cong Danh - Secure Logix - Manager - 09/01/1889 - 09123456789 - Binh Thuan");
			out.write("\nTran Manh Hung - Secure Logix - Director - 01/05/1996 - 0912654789 - Nha Trang");
			out.write("\nNguyen Huu Chien - Secure Logix - Chairman - 05/01/1992 - 01645789577 - Daklak");
			out.close();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public ArrayList<String> readFile(String path) {
		ArrayList<String> data = new ArrayList<String>();
		String line = "";
		
		try {
			File file = new File(path);	
			FileReader in = new FileReader(file);
			BufferedReader br = new BufferedReader(in);
			
			
			//Go through file and save data to arraylist						
			while ((line = br.readLine()) != null) {
				data.add(line);						
			}
			//Close object
			br.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	public void searchInfo(ArrayList<String> data) {
		String search="";
		Integer num=0;
		boolean found;
		String result="";
		Scanner scan = new Scanner(System.in);
		while (!search.contains("#") || num == 0){
			found = false;
			//Get user input
			System.out.println("Please enter the information (0 for end): ");
			System.out.println("\n 1 - Name");
			System.out.println("\n 2 - Project");
			System.out.println("\n 3 - Position");
			System.out.println("\n 4 - Date of Birth");
			System.out.println("\n 5 - Phone");
			System.out.println("\n 6 - Country");
				
			num = scan.nextInt();
			if (num > 0 && num < 7) {
				System.out.println("Please enter sepecific information (# for end): ");
				search = scan.next();
				
				for (String partdata : data) {
					if (partdata.toLowerCase().contains(search.toLowerCase())){
						Members member = new Members();
						member.setAll(partdata.split(" - ")[0], partdata.split(" - ")[1], partdata.split(" - ")[2], partdata.split(" - ")[3], partdata.split(" - ")[4], partdata.split(" - ")[5]);
						result=result + "\n" + member.getAll();
						found=true;
					}	
				}
								
				//Show log if unmatched
				if (found == false && !search.contains("#")){
					System.out.println("No matched information");
				}
				else {
					System.out.println(result);
				}
			}				
			
			else {
				System.out.println("Wrong searched type");
			}
		}
		scan.close();
		
	}

}
