package student_info_sys;

public class Student {
String name;
String stuNo;
int classes;
Course mat;
Course fizik;
Course kimya;
double average;
boolean isPass;

Student(String name, int classes, String stuNo, Course mat,Course fizik, Course kimya){
	this.name=name;
	this.stuNo=stuNo;
	this.classes=classes;
	this.mat=mat;
	this.fizik=fizik;
	this.kimya=kimya;
	calcAverage();
	this.isPass=false;
}

public void addBulkExamNote(int mat, int fizik, int kimya) {
	if(mat>=0 && mat<=100) {
		this.mat.note=mat;
	}
	if (fizik>=0 && fizik<=100) {
		this.fizik.note=fizik;
	}
	if (kimya>=0 && kimya<=100) {
		this.kimya.note=kimya;
	}
}

public void addBulkVerbalNote(int mat, int fizik, int kimya) {
	if(mat>=0 && mat<=100) {
		this.mat.verbal=mat;
	}
	if (fizik>=0 && fizik<=100) {
		this.fizik.verbal=fizik;
	}
	if (kimya>=0 && kimya<=100) {
		this.kimya.verbal=kimya;
	}
}

public void isPass() {
	if(this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0 || 
			this.mat.verbal==0 || this.fizik.verbal==0 || this.kimya.verbal==0) {
		System.out.println("Notlar tam olarak girilmemiþ");
	}else {
		this.isPass=isCheckPass();
		printNote();
		System.out.println("Ortalama: "+this.average);
		if(this.isPass) {
			System.out.println("Sýnýfý Geçti. ");
		}else {
			System.out.println("Sýnýfta Kaldý.");
		}
	}
}
public void calcAverage() {
    this.average=((this.fizik.note*0.8+this.fizik.verbal*0.2)
    		+(this.mat.note*0.8+this.mat.verbal*0.2)
    		+(this.kimya.note*0.8+this.kimya.verbal*0.2))/3;
}

public boolean isCheckPass() {
    calcAverage();
    return this.average > 55;
}

public void printNote(){
    System.out.println("=========================");
    System.out.println("Öðrenci : " + this.name);
    System.out.println("Matematik Notu : " + this.mat.note);
    System.out.println("Fizik Notu : " + this.fizik.note);
    System.out.println("Kimya Notu : " + this.kimya.note);
}

}
