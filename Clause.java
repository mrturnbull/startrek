public class Clause {

  private String name;
  private String direction;
  private int clauseOrder;

  public Clause(){}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of direction
	* @return
	*/
	public String getDirection() {
		return direction;
	}

	/**
	* Sets new value of direction
	* @param
	*/
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	* Returns value of clauseOrder
	* @return
	*/
	public int getClauseOrder() {
		return clauseOrder;
	}

	/**
	* Sets new value of clauseOrder
	* @param
	*/
	public void setClauseOrder(int clauseOrder) {
		this.clauseOrder = clauseOrder;
	}
}
