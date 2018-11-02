import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class ScoreTree {
	static TreeNode root;
	public ScoreTree()
    {
        root = null;
    }
	static void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    static int height(TreeNode root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
 
    /* Print nodes at the given level */
    static void printGivenLevel (TreeNode root ,int level)
    {
        if (root == null)
            System.out.println(",");
        if (level == 1)
            System.out.print(root.value + ",");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
	public class TreeNode{
		int value;
		int numOccurance;
		TreeNode left;
		TreeNode right;
		public TreeNode(int value){
			this.value = value;
			numOccurance = 1;
			left=right=null;
		}
		public TreeNode incrementOccurance(){
			this.numOccurance +=1;
			return this;
		}
	}
	
	
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        
        int _scores_size = 0;
        _scores_size = Integer.parseInt(in.nextLine());
        int[] _scores = new int[_scores_size];
        int _scores_item;
        for(int _scores_i = 0; _scores_i < _scores_size; _scores_i++) {
            _scores_item = Integer.parseInt(in.nextLine());
            _scores[_scores_i] = _scores_item;
        }
        
        res = gatherScores(_scores);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }
	static void findNodeAndAdd(TreeNode root, int value) {
		if(root !=null){
			findNodeAndAdd(root.left, value);
			if(root.value == value){
				root.incrementOccurance();
			}else{
				if(root.value > value){
					root.left = TreeNode(value);
				}else{
					root.right = new TreeNode(value);
				}
			}
			findNodeAndAdd(root.right, value);
			
		}
	}

	static void createTree(int[] scores){
		for(int x = 0; x<scores.length; x++){
			findNodeAndAdd(root, scores[x]);
		}
	}
	static String gatherScores(int[] scores) {
		createTree(scores);
		printLevelOrder();
		return null;

    }

}


