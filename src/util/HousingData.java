package util;

public class HousingData {

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
	public double getCRIM() {
		return CRIM;
	}
	public void setCRIM(double cRIM) {
		CRIM = cRIM;
	}
	public double getZN() {
		return ZN;
	}
	public void setZN(double zN) {
		ZN = zN;
	}
	public double getINDUS() {
		return INDUS;
	}
	public void setINDUS(double iNDUS) {
		INDUS = iNDUS;
	}
	public double getCHAS() {
		return CHAS;
	}
	public void setCHAS(double cHAS) {
		CHAS = cHAS;
	}
	public double getNOX() {
		return NOX;
	}
	public void setNOX(double nOX) {
		NOX = nOX;
	}
	public double getRM() {
		return RM;
	}
	public void setRM(double rM) {
		RM = rM;
	}
	public double getAGE() {
		return AGE;
	}
	public void setAGE(double aGE) {
		AGE = aGE;
	}
	public double getDIS() {
		return DIS;
	}
	public void setDIS(double dIS) {
		DIS = dIS;
	}
	public double getRAD() {
		return RAD;
	}
	public void setRAD(double rAD) {
		RAD = rAD;
	}
	public double getTAX() {
		return TAX;
	}
	public void setTAX(double tAX) {
		TAX = tAX;
	}
	public double getPTRATIO() {
		return PTRATIO;
	}
	public void setPTRATIO(double pTRATIO) {
		PTRATIO = pTRATIO;
	}
	public double getB() {
		return B;
	}
	public void setB(double b) {
		B = b;
	}
	public double getLSTAT() {
		return LSTAT;
	}
	public void setLSTAT(double lSTAT) {
		LSTAT = lSTAT;
	}
	public double getMEDV() {
		return MEDV;
	}
	public void setMEDV(double mEDV) {
		MEDV = mEDV;
	}

}
