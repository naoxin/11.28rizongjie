import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Io {
	public static void main(String[] args) {
		
		// IO�������ݶ�ȡ������д��
		Io i = new Io();
		// �Ǿ�̬�ھ�̬�����еĵ���
		i.ioliu();
		i.yunsuan();
		//�ݹ�
		int m=7;
		
		System.out.println(i.di(m));
		int []array={1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
		System.out.println(i.searchloop(array, 99));
	}
	
	public int di(int m){
		if (m==0) {
			return 1;
		}else if (m<0) {
			return 0;
		}else 
			return m*di(m-1);
		
	}
	
	public static int searchloop(int []array,int findvaule){
		if (array==null) {
			return -1;
		}
		int start=0;
		int end=array.length-1;
		while(start<=end){
			int maddle=(start+end)/2;
			int maddlevele=array[maddle];
			if (findvaule==maddlevele) {
				return maddle;
			}else if(findvaule<maddlevele){
				end=maddle-1;
			}else {
				start=maddle+1;
			}
		}
		return -1;
	}

	// ����
	int a = 13000;
	float b = 0.1f;
	int c = 2;
    //ס��������ļ���
	public void yunsuan() {
		float d = a * b * c;
		long e = (long) (a * b * c);
		double f = a * b * c;
		System.out.println("�ҵ�ס���������У�" + d);
		System.out.println("�ҵ�ס���������У�" + e);
		System.out.println("�ҵ�ס���������У�" + f);
	}

	public void ioliu() {

		try {
			File file = new File("e://123.txt");
			BufferedReader br;
			br = new BufferedReader(new FileReader(file));
			String str = null;
			StringBuffer buf = new StringBuffer();

			while ((str = br.readLine()) != null) {
				buf.append(str);
			}
			// System.out.println(buf.toString());

			File file2 = new File("e://1234.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
			bw.write(buf.toString());
			bw.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}