package data.structure;

import util.Convert;

/**
 * Record contains valuable info about each record
 * 
 * @author Adam Barák
 * @version 30.08.2017
 */
public class Record {
	String identification;
	String imageFilePath;
	int age;
	boolean wearingGlasses;
	String emotionState;
	
	Point leftEye;
	Point rightEye;
	Point mouth;
	Point nose;
	
	public Record() {
		this(null, null);
	}
	
	public Record(String identification, String imageFilePath) {
		this(identification, imageFilePath, -1);
	}

	public Record(String identification, String imageFilePath, int age) {
		this(identification, imageFilePath, age, null, null, null, null);
	}
	
	public Record(String identification, String imageFilePath, int age, Point leftEye, Point rightEye, Point mouth,
			Point nose) {
		this(identification, imageFilePath, age, false, null, leftEye, rightEye, mouth, nose);
	}

	public Record(String identification, String imageFilePath, int age, boolean wearingGlasses, String emotionState,
			Point leftEye, Point rightEye, Point mouth, Point nose) {
		this.identification = identification;
		this.imageFilePath = imageFilePath;
		this.age = age;
		this.wearingGlasses = wearingGlasses;
		this.emotionState = emotionState;
		this.leftEye = leftEye;
		this.rightEye = rightEye;
		this.mouth = mouth;
		this.nose = nose;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isWearingGlasses() {
		return wearingGlasses;
	}

	public void setWearingGlasses(boolean wearingGlasses) {
		this.wearingGlasses = wearingGlasses;
	}

	public String getEmotionState() {
		return emotionState;
	}

	public void setEmotionState(String emotionState) {
		this.emotionState = emotionState;
	}

	public Point getLeftEye() {
		return leftEye;
	}

	public void setLeftEye(Point leftEye) {
		this.leftEye = leftEye;
	}

	public Point getRightEye() {
		return rightEye;
	}

	public void setRightEye(Point rightEye) {
		this.rightEye = rightEye;
	}

	public Point getMouth() {
		return mouth;
	}

	public void setMouth(Point mouth) {
		this.mouth = mouth;
	}

	public Point getNose() {
		return nose;
	}

	public void setNose(Point nose) {
		this.nose = nose;
	}

	
	
	public static class Point {
		double x;
		double y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public Point(String x, String y) {
			this.x = Convert.stringToDouble(x);
			this.y = Convert.stringToDouble(y);
		}
		
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		
		public boolean isSet() {
			return x != 0 && y != 0;
		}
	}
}
