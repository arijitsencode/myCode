package leetCode;

public class RollerCoasterBribe {
    static void minimumBribes(int[] q) {
    	//TODO not fully working.
        int bribes = 0;
        for(int idx=0; idx<q.length; idx++){
            if(q[idx]-1 != idx){
               bribes++; 
            }
        }
        
        if(bribes==0) {System.out.println(0); return;}
        else{bribes = 0;}
        
        for(int idx=0; idx<q.length; idx++){
            if(q[idx] - (idx+1) > 0){
                if(q[idx] - (idx+1) > 2){
                    System.out.println("Too chaotic");
                    return;
                }
                bribes += q[idx] - (idx+1);
            }
        }
        System.out.println(bribes);
        
    }
    
    public static void main(String[] args) {
    	int[] line = {1,2,5,3,7,8,6,4};
    	minimumBribes(line);
	}
}
