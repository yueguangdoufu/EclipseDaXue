import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class D_FileIO {
	
	ArrayList<Integer> list = new ArrayList<>();
	
	public D_FileIO(){
		shengcheng();
		xieru();
	}
	
	public  void shengcheng() {
		Random random = new Random();
		int num = random.nextInt(100);
		num++;
		list.add(num);
		int count = 1;
		while(true) {
			int num1 = random.nextInt(100);
			num1++;
			int flag = 1;
			for(int l:list) {
				if(num1 == l) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				list.add(num1);
				count++;
			}
			if(count == 20) {
				break;
			}	
		}
		Collections.sort(list);
	}
	
	public void xieru() {
		try {
			File file = new File("H:\\wrokspace\\D_FileIO\\data.txt");
			FileOutputStream fos = new FileOutputStream(file);
			if(!file.exists()) {
				file.createNewFile();
			}	
			String s = list.toString();
			s = s.replace(",", " ");
			byte[] buffer = s.getBytes();
			fos.write(buffer);
			fos.flush();
			fos.close();
			
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String [] args) {
		new D_FileIO();
	}
}
