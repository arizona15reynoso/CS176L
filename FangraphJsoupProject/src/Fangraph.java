import org.jsoup.Jsoup;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Fangraph{
    	public static void main(String[] args) throws IOException {
    		final String LINK_22 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_142";
    		final String LINK_21 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_132";
    		final String LINK_20 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=00&page=1_142";
    		final int ARRAY_LENGTH_22 = 130;
    		final int ARRAY_LENGTH_21 = 132;
    		final int ARRAY_LENGTH_20 = 142;
    		ArrayList<String> arrayList_22 = new ArrayList<String>(ARRAY_LENGTH_22);
    		try {
    		    Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_130").get();
    		    Elements links = doc.select("tbody");
    		    String name;
    		    int counter = 0;
    		    for (Element link : links.select("td.grid_line_regular")) {
    		    	name = link.select("a").text();
    		    	if (name !="" && name.length() != 3) {
    		    		arrayList_22.add(name);
    		    		counter+=1;
    		    	}
    		    	if (counter == 130) {
    		    		break;
    		    	}	    	
    		    }
    		}
    		catch (IOException e) {
    			e.printStackTrace();
    		}
    		System.out.println();
    		ArrayList<String> arrayList_21 = new ArrayList<String>(ARRAY_LENGTH_21);
    		try {
    		    Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_132").get();
    		    Elements links = doc.select("tbody");
    		    String name;
    		    int counter = 0;
    		    for (Element link : links.select("td.grid_line_regular")) {
    		    	name = link.select("a").text();
    		    	if (name !="" && name.length() != 3) {
    		    		arrayList_21.add(name);
    		    		counter+=1;
    		    	}
    		    	if (counter == 132) {
    		    		break;
    		    	}
    		    }
    		}
    		catch (IOException e) {
    			e.printStackTrace();
    		}
    		
    		ArrayList<String> arrayList20 = new ArrayList<String>(ARRAY_LENGTH_20);
    		try {
    		    Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=1_142").get();
    		    Elements links = doc.select("tbody");
    		    String name;
    		    int counter = 0;
    		    for (Element link : links.select("td.grid_line_regular")) {
    		    	name = link.select("a").text();
    		    	if (name !="" && name.length() != 3) {
    		    		arrayList20.add(name);
    		    		counter+=1;
    		    	}
    		    	if (counter == 142) {
    		    		break;
    		    	}
    		    }
    		}
    		catch (IOException e) {
    			e.printStackTrace();
    		}
    		
    		ArrayList<String> repeat = new ArrayList<String>(142);
    		ArrayList<String> all_repeat = new ArrayList<String>(142);
    		ArrayList<Double> arrayList_AVG_POS = new ArrayList<Double>(9);
    		for(int i = 0; i< arrayList_22.size(); i++) {
    			if(arrayList_21.contains(arrayList_22.get(i))) {
    			repeat.add(arrayList_22.get(i));
    			}
    		}
    			for(int i = 0; i< repeat.size(); i++) {
    			if(arrayList20.contains(repeat.get(i))) {
    			all_repeat.add(repeat.get(i));
    			}
    			}
    			System.out.println();
    			for(int i = 0; i< all_repeat.size(); i++) {
    			arrayList_AVG_POS.add(((arrayList_22.indexOf(all_repeat.get(i)) + 1) +
    			(arrayList_21.indexOf(all_repeat.get(i)) + 1) + (arrayList20.indexOf(all_repeat.get(i)) + 1))
    			/ 3.0);
    			}
    			TreeMap<Double, String> ranks = new TreeMap<Double, String>();
    			for(int i = 0; i< all_repeat.size(); i++) {
    			ranks.put(arrayList_AVG_POS.get(i), all_repeat.get(i));
    			}
    			System.out.println("THE TOP TEN PLAYERS FROM 2022,2021,2020");
    			System.out.println();
    			for(int x = 0; x<11; x++) {
    			Map.Entry<Double, String> namePLUSrank = ranks.pollFirstEntry();
    			String names = namePLUSrank.getValue();
    			Double rank = namePLUSrank.getKey();
    			System.out.println(x+1 + " : " + names + " || " + rank);
    			}
    		
    	}
}