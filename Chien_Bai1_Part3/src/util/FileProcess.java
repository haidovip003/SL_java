package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcess {
	
	public List<String> listInit() {
		// khởi tạo list
		List<String> list = new ArrayList<String>();
		
		// thêm phần tử vào list
		list.add("Bao Vo - Secure Logix - consultant - 01/01/1988 - 09123456754 - Que anh Bao - Nghiem tuc");
		list.add("Chien Nguyen Huu - Secure Logix - Senior Engineer - 07/03/1989 - 01228733284 - Daklak - Vui tinh");
		list.add("Pham Van Vuong Tu - Secure Logix - Senior Engineer - 08/03/1988 - 0909454564 - Que anh Tu - Map");
		list.add("Tran Manh Hung - Secure Logix - Senior Engineer - 03/01/1990 - 0903564285 - Nha Trang - Deo kinh");
		list.add("Le Thai Thuan - Secure Logix - Consultant - 06/03/1984 - 9876567653 - Que anh Thuan - im lang");
		list.add("Nguyen Thi Thanh Tuyen - Secure Logix - Senior Engineer - 12/09/1988 - 0987654343 - Phu Yen - Co bau");
		list.add("Hoang Le - Secure Logix - Consultant - 04/01/1982 - 5746383746 - Da Lat - Lay");
		list.add("Doan Bao Trung - Secure Logix - Consultant - 06/11/1989 - 6758475627 - Tien Giang - Pro");
		list.add("Nguyen Thai Phu - Secure Logix - Consultant - 22/06/1989 - 0908888877 - Da Lat - Lay");
		list.add("Le Thi Thuong - Secure Logix - Manager - 16/01/1980 - 0907333333 - Que chi Thuong - Handsome");
		list.add("Thang Tran - Secure Logix - Senior Consultant - 11/11/1977 - 1918374656 - Que anh Thang - work hard");
		list.add("Phan The Hung - Secure Logix - Engineer - 30/6/1992 - 9876546576 - Que thang Hung - Deo kinh");
		list.add("Vu Xuan Tuyen - Secure Logix - Engineer - 30/5/1992 - 1233211234 - Nha Trang - Benh");
		
		return list;
		
	}

	public void write(String filePath, List<String> content, boolean replace) {
		try {
			File file = new File(filePath);
			
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw = new FileWriter(file, replace);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String string : content) {
				bw.write(string);
				bw.write("\n");
			}
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			
		}		
	}

	public List<String> read(String filePath) {
		// Khai báo biến
		List<String> list = new ArrayList<String>();
		
		try {
			File file = new File(filePath);
			FileReader fr;
			
			fr = new FileReader(file);
		
			BufferedReader br = new BufferedReader(fr);
			
			// Đọc line đầu tiên
			String temp = br.readLine();
			
			// Đọc file line by line ghi vào list
			while(temp != null){
				list.add(temp);
				temp = br.readLine();
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}


}
