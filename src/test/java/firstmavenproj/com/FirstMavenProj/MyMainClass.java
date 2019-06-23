package firstmavenproj.com.FirstMavenProj;

import workingwithtestng.AnotherPackageClass;

public class MyMainClass {

	public static void main(String[] args) {
		SamePackageClass sp=new SamePackageClass();
		sp.SameC();
		
		AnotherPackageClass ap=new AnotherPackageClass();
		ap.AnotherC();


	}

}
