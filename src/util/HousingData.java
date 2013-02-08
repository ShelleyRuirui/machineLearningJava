package util;

public class HousingData {
	
	private double[] data;

	//Describe the meaning of each field in the array
	private double CRIM;              // per capita crime rate by town
	private double ZN;                  // proportion of residential land zoned for lots over 25,000 sq.ft.
	private double INDUS;			// proportion of non-retail business acres per town
	private double CHAS;			//Charles River dummy variable (= 1 if tract bounds river; 0 otherwise)
	private double NOX;				//nitric oxides concentration (parts per 10 million)
	private double RM;					//average number of rooms per dwelling
	private double AGE;				//proportion of owner-occupied units built prior to 1940
	private double DIS;					//weighted distances to five Boston employment centres
	private double RAD;				//index of accessibility to radial highways
	private double TAX;				//full-value property-tax rate per $10,000
	private double PTRATIO;		//pupil-teacher ratio by town
	private double B;						//1000(Bk - 0.63)^2 where Bk is the proportion of blacks by town
	private double LSTAT;			//% lower status of the population
	private double MEDV;			//Median value of owner-occupied homes in $1000's		
	
	public HousingData(double[] data) {
		this.data = data;
	}
	
	public double[] getData() {
		return data;
	}
	public void setData(double[] data) {
		this.data = data;
	}

}
