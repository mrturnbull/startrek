import java.util.ArrayList;
import java.util.List;

public class PageView {

	private Page page;
	private Sort sort;
	private List<Character> characters = new ArrayList<Character>();

	public PageView(){
	}







	/**
	* Returns value of page
	* @return
	*/
	public Page getPage() {
		return page;
	}

	/**
	* Sets new value of page
	* @param
	*/
	public void setPage(Page page) {
		this.page = page;
	}

	/**
	* Returns value of sort
	* @return
	*/
	public Sort getSort() {
		return sort;
	}

	/**
	* Sets new value of sort
	* @param
	*/
	public void setSort(Sort sort) {
		this.sort = sort;
	}

	/**
	* Returns value of characters
	* @return
	*/
	public List<Character> getCharacters() {
		return characters;
	}

	/**
	* Sets new value of characters
	* @param
	*/
	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}


}
