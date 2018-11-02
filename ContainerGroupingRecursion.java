package concepts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainerGroupingRecursion {
	Map<String, List<String>> containerUnique;
	Map<String, List<String>> blUnique;

	/**
	 * @param args
	 */
	public Map<String, Integer> linkGrouping(Map<String, String> raw) {
		Map<String, Integer> result = new HashMap<String, Integer>();
		int grp = 0;
		for (String key : raw.keySet()) {
			if(result.get(key) != -1){
				
			}else{
				grp++;
				
			}
		}

		return null;
	}

	public List<String> listContainersForBl(String bl) {
		return null;
	}

	public List<String> listBlsForContainer(String container) {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the 2 master maps
	}

}
