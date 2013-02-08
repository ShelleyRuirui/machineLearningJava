package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataUtil {
	
	public static ArrayList<HousingData> importHousingData(){
		ArrayList<HousingData> result= new ArrayList<HousingData>();
				
		try {
			File file=new File("src/util/housing.data");
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line=null;
			int lineNum=1;
			while((line=reader.readLine()) != null && lineNum<=10){
				String[] values=line.trim().split("\\s+");
				
				if(values.length != 14){
					System.err.println("Line: "+lineNum+" contains less than 14 attributes");
					System.exit(1);
				}
				lineNum ++;
				
				double[] dataItems=new double[14];				
				for(int i=0;i<14;i++){
					dataItems[i] = Double.parseDouble(values[i]);
				}
				HousingData item=new HousingData(dataItems);
				result.add(item);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	private static void printHouseData(ArrayList<HousingData> data){
		for(HousingData d:data){
			double[] values=d.getData();
			for(double value:values){
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 String sample=" 0.02731   0.00   7.070  0  0.4690  6.4210  78.90  4.9671   2  242.0  17.80 396.90   9.14  21.60";
//		 String[] values=sample.trim().split("\\s+");
//		 System.out.println(values.length);
//		 for(String value:values)
//			 System.out.println(value);
//		for(int i=0;i<14;i++){
//			System.out.print("Double.parseDouble(values["+i+"]),");
//		}
		printHouseData(importHousingData());
	}

}
