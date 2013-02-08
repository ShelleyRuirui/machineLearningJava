package regressionAlgo;

import java.util.ArrayList;

import util.DataUtil;
import util.HousingData;

public class GradientDescent {

	public static double[] calcThetas(ArrayList<HousingData> dataItems, int[] parameterIndexes,double stepSize){
		int paramCount=parameterIndexes.length;
		double[] thetas=new double[paramCount+1];
		for (int i = 0; i < thetas.length; i++) {
			 thetas[i]=0;   //thetas[paramCount] is just used for multiplying 1
		}
		double lastJTheta=0;
		double JTheta=calcJTheta(dataItems,parameterIndexes,thetas);
		double diffJTheta=0-JTheta;
		double[] lastThetas=thetas;
		
		while(diffJTheta<=0){
			lastThetas=thetas;
			
			for(int i=0;i<thetas.length;i++){
				double deriavativeSum=0;
				for(int j=0;j<dataItems.size();j++){
					double[] data=dataItems.get(j).getData();
					double tempSum=0;
					for(int k=0;k<parameterIndexes.length;k++){
						int index=parameterIndexes[k];
						tempSum += data[index]*thetas[k];
					}
					tempSum += thetas[thetas.length-1];
					if(i != thetas.length-1)
						deriavativeSum += (tempSum-data[13])*data[parameterIndexes[i]];
					else
						deriavativeSum += tempSum-data[13];
				}
				thetas[i]=thetas[i]-stepSize*deriavativeSum;
			}
			lastJTheta=JTheta;
			JTheta = calcJTheta(dataItems,parameterIndexes,thetas);
			diffJTheta = JTheta -  lastJTheta;
		}
		System.out.println("The least J(Theta) is "+lastJTheta);
		return lastThetas;
	}
	
	private static double calcJTheta(ArrayList<HousingData> dataItems,int[] indexes,double[] thetas){
		double result=0;
		double square=0;
		for(int i=0;i<dataItems.size();i++){
			HousingData dataItem=dataItems.get(i);
			double[] data=dataItem.getData();
			double hTheta=0;
			for(int j=0;j<indexes.length;j++){
				int index=indexes[j];
				hTheta += data[index]*thetas[j];
			}
			hTheta += thetas[thetas.length-1];
			square += (hTheta-data[13])*(hTheta-data[13]);			
		}
		result = square / 2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HousingData> data=DataUtil.importHousingData();
		int[] index={5};
		double stepSize=0.00001;
		double[] result=calcThetas(data, index, stepSize);
		for(int i=0;i<result.length;i++){
			System.out.println("Index:"+i+"  theta:"+result[i]);
		}
	}

}
