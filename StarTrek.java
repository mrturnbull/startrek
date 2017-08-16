import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.io.StringReader;
import java.net.URI;
//import javax.json;
import javax.ws.rs.core.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.cxf.transport.ConduitInitiatorManager;
import org.apache.cxf.BusFactory;
import org.apache.cxf.Bus;
import org.apache.cxf.transport.http.*;

public class StarTrek {

	private static final String STAPI_BASE_PATH = "http://stapi.co/api/v1/rest/";
	private static final int MAX_PAGE_SIZE = 100;
	private static int TOTAL_CHARACTER_PAGES = 60;
	private Map catalog;
	private Map dict;

	public StarTrek(){

		dict = new HashMap<String, String>();
		dict.put("a",  "OxF8D0");
		dict.put("A",  "OxF8D0");
		dict.put("b",  "OxF8D1");
		dict.put("B",  "OxF8D1");
		dict.put("#", "OxF8D2");
		dict.put("d",  "OxF8D3");
		dict.put("D",  "OxF8D3");
		dict.put("e",  "OxF8D4");
		dict.put("E",  "OxF8D4");
		dict.put("$", "OxF8D5");
		dict.put("h", "OxF8D6");
		dict.put("H", "OxF8D6");
		dict.put("i", "OxF8D7");
		dict.put("I", "OxF8D7");
		dict.put("j", "OxF8D8");
		dict.put("J", "OxF8D8");
		dict.put("l", "OxF8D9");
		dict.put("L", "OxF8D9");
		dict.put("m", "OxF8DA");
		dict.put("M", "OxF8DA");
		dict.put("n", "OxF8DB");
		dict.put("N", "OxF8DB");
		dict.put("%", "OxF8DC");
		dict.put("o", "OxF8DD");
		dict.put("O", "OxF8DD");
		dict.put("p", "OxF8DE");
		dict.put("P", "OxF8DE");
		dict.put("q", "OxF8DF");

		dict.put("Q", "OxF8E0");
		dict.put("r", "OxF8E1");
		dict.put("R", "OxF8E1");
		dict.put("s", "OxF8E2");
		dict.put("S", "OxF8E2");
		dict.put("t", "OxF8E3");
		dict.put("T", "OxF8E3");
		dict.put("@", "OxF8E4");
		dict.put("u", "OxF8E5");
		dict.put("U", "OxF8E5");
		dict.put("v", "OxF8E6");
		dict.put("V", "OxF8E6");
		dict.put("w", "OxF8E7");
		dict.put("W", "OxF8E7");
		dict.put("y", "OxF8E8");
		dict.put("Y", "OxF8E8");
		dict.put("'", "OxF8E9");

		dict.put("0", "OxF8F0");
		dict.put("1", "OxF8F1");
		dict.put("2", "OxF8F2");
		dict.put("3", "OxF8F3");
		dict.put("4", "OxF8F4");
		dict.put("5", "OxF8F5");
		dict.put("6", "OxF8F6");
		dict.put("7", "OxF8F7");
		dict.put("8", "OxF8F8");
		dict.put("9", "OxF8F9");

		dict.put(",", "OxF8FD");
		dict.put(".", "OxF8FE");
		dict.put(" ", "0x0020");





		catalog = new HashMap<String, Float>();
		catalog.put("A", 1.0f);
		catalog.put("B", 2.0f);
		catalog.put("C", 3.0f);
		catalog.put("D", 4.0f);
		catalog.put("E", 5.0f);
		catalog.put("F", 6.0f);
		catalog.put("G", 7.0f);
		catalog.put("H", 8.0f);
		catalog.put("I", 9.0f);
		catalog.put("J", 10.0f);
		catalog.put("K", 11.0f);
		catalog.put("L", 12.0f);
		catalog.put("M", 13.0f);
		catalog.put("N", 14.0f);
		catalog.put("O", 15.0f);
		catalog.put("P", 16.0f);
		catalog.put("Q", 17.0f);
		catalog.put("R", 18.0f);
		catalog.put("S", 19.0f);
		catalog.put("T", 20.0f);
		catalog.put("U", 21.0f);
		catalog.put("V", 22.0f);
		catalog.put("W", 23.0f);
		catalog.put("X", 24.0f);
		catalog.put("Y", 25.0f);
		catalog.put("Z", 26.0f);

	}

	public void translate2Klingon(String tokenInput) throws Exception{

		if (tokenInput.matches("@|#|$|%")) throw new Exception("Unsupported character(s) in your name");

		tokenInput = tokenInput.replaceAll("(?i)tlh", "@").replaceAll("(?i)ch", "#").replaceAll("(?i)gh", "$").replaceAll("(?i)ng", "%");

		//System.out.println(tokenInput);

		String tokenOutput = "";
		for (int i = 0; i < tokenInput.length(); i++){

			if (dict.get(tokenInput.substring(i, i + 1)) != null){

				tokenOutput += (String) dict.get(tokenInput.substring(i, i + 1)) + " ";

			}
			else
				throw new Exception("Unsupported character(s) in your name");

		}

		System.out.println(tokenOutput);


	}

	public int estimatePage(String token){

		String url = STAPI_BASE_PATH + "character/search";
		url += "?";
		url += "pageNumber=1";
		url += "&pageSize=1";

		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);

		WebTarget webTarget = client.target(url);

		Builder builder = webTarget.request();



		Response response = builder.accept(MediaType.APPLICATION_JSON).get();

		if (response.getStatus() == 200) {

			PageView pageView = (PageView) builder.get(PageView.class);

			TOTAL_CHARACTER_PAGES = pageView.getPage().getTotalPages() / MAX_PAGE_SIZE + 1;

		}

		String firstLetter = token.substring(0, 1).toUpperCase();

		float page = TOTAL_CHARACTER_PAGES * (((float) catalog.get(firstLetter))/ 26.0f);

		response.close();
		client.close();

		return Math.round(page);
		//return 1;

	}

	public List<Character> getCharactersByPage(String token, int pageNumber) {

		// = new String[];

		String url = STAPI_BASE_PATH + "character/search";
		url += "?";
		url += "pageNumber=" + pageNumber;
		url += "&pageSize=" + MAX_PAGE_SIZE;
		url += "&sort=name,ASC";

		//URI uri = URI.create(url);

		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);

		WebTarget webTarget = client.target(url);

		Builder builder = webTarget.request();

		Response response = builder.accept(MediaType.APPLICATION_JSON).get();

		//System.out.println(response.getStatus());
		List<Character> listCharacterWanted = new ArrayList<Character>();
		//Se Response.Status.OK;
		if (response.getStatus() == 200) {

			 PageView pageView = (PageView) builder.get(PageView.class);

			 List<Character> listCharacters = pageView.getCharacters();

			 for (Character character: listCharacters){

				  String[] aName = character.getName().split(" ");

					for (int i=0; i < aName.length; i++){

						if (aName[i].toUpperCase().equals(token.toUpperCase())){ /////// SHALL I CHANGE !!!!!!

							listCharacterWanted.add(character);
							break;

						}

					}

					//if (characterWanted != null) break;

			 }

		}

		response.close();
		client.close();

		return listCharacterWanted;

	}

	public String getSpeciesByCharacter(String uid) {

		// = new String[];

		String url = STAPI_BASE_PATH + "character";
		url += "?";
		url += "uid=" + uid;


		//URI uri = URI.create(url);

		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);

		WebTarget webTarget = client.target(url);

		Builder builder = webTarget.request();

		Response response = builder.accept(MediaType.APPLICATION_JSON).get();

		//System.out.println(response.getStatus());
		//CharacterFull characterWanted = null;
		//Se Response.Status.OK;
		String species = "";
		if (response.getStatus() == 200) {

			CharacterFull characterWanted = (CharacterFull) builder.get(CharacterFull.class);
			CharacterSpecies[] characterSpecies = characterWanted.getCharacter().getCharacterSpecies();
			if (characterSpecies.length > 0) species = characterSpecies[0].getName();

		}

		response.close();
		client.close();

		return species;

	}

	public void initializeCxf() {
    final Bus defaultBus = BusFactory.getDefaultBus();
    final ConduitInitiatorManager extension = defaultBus.getExtension(ConduitInitiatorManager.class);
    extension.registerConduitInitiator("http://cxf.apache.org/transports/http", new HTTPTransportFactory());
	}

	public void identifySpecies(String token){

		initializeCxf();

		System.out.print("#");
		int initialPage = estimatePage(token);
		String species = "";
		boolean speciesFound = false;

		for (int currentPage = initialPage; (currentPage <= TOTAL_CHARACTER_PAGES) && !speciesFound; currentPage++){

			System.out.print("#");

  		List<Character> listCharacterWanted = getCharactersByPage(token, currentPage);

			for (Character characterWanted : listCharacterWanted) {

				//System.out.println("uid found = " + characterWanted.getUid());
				System.out.println("\nFull name found: " + characterWanted.getName());

				species = getSpeciesByCharacter(characterWanted.getUid());

				System.out.println("Species: " + ((species.length() > 0) ? species: "N/A"));

				if (!species.equals("")) {
					speciesFound = true;
					break;
				}

			}

		}

	}


	public static void main (String args[]){

		StarTrek starTrek = new StarTrek();

		try {
			starTrek.translate2Klingon(args[0]);
			starTrek.identifySpecies(args[0]);
		}
		catch(Exception e){
			System.out.println();
			System.out.println(e.getMessage());
		}

		System.out.println();

	}

}
