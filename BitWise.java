
public class BitWise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		System.out.println("Hello JavaLaunch");
		Integer cstmsStatCd = 512;
		cstmsStatCd |= 32;
		if (cstmsStatCd == 1024) { //Sent
			//Handling the Sent Accepted Scenario
			cstmsStatCd &= 559;
		} else if (cstmsStatCd == 512) { //Deleted
			//Handling the Delete Accepted Scenario
			cstmsStatCd &= 48;
		}
		  
		  System.out.println("Checking Is App Accept");
		  System.out.println(544 & 32);
		  System.out.println(1023 & 512);
*/		  
		  
		  // Demo of ~
		  int a = 7;
		  int b = 15;
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(a & b);
		  System.out.println(a | b);
		  System.out.println(a ^ b);
		  BitWise cc = new BitWise();
		  Integer[] inte = new Integer[10];
		  inte[0]=1;inte[9]=10;
		  inte[1]=2;inte[2]=3;inte[3]=4;inte[4]=5;inte[5]=6;inte[6]=7;inte[7]=8;inte[8]=9;
		  System.out.println(cc.getCommaSeperatedParam(null));

	}
	
	private String getCommaSeperatedParam(Integer[] admins) {
		// TODO Implementation
		StringBuffer retStr = new StringBuffer();
		int counter = 0;
		for(Integer admin: admins){
			retStr = retStr.append(((counter==0)?"": ", ") + admin);
			counter++;		
		}
		return retStr.toString();
	}

}
