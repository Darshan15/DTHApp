package util;

import java.util.HashMap;
import java.util.Map;

import controllers.StbSearch;
import pojo.StbTypePojo;

public class Cache {

	private static Map<String, StbTypePojo> stbs = new HashMap<>();
	
	public static StbTypePojo get(String id) {
		StbTypePojo stbTypePojo = stbs.get(id);
		if (stbTypePojo != null)
			return stbTypePojo;
		
		stbTypePojo = (StbTypePojo) StbSearch.getSTBType(Integer.parseInt(id));
		
		return stbTypePojo;
	}
	
	public static void put(StbTypePojo stb) {
		if (stbs == null) stbs = new HashMap<>();
		stbs.put(stb.toString(), stb);
	}
}
