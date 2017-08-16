import java.util.Set;

public class Sort {

  private Set<Clause> clauses;

  public Sort(){}

	/**
	* Returns value of clauses
	* @return
	*/
	public Set<Clause> getClauses() {
		return clauses;
	}

	/**
	* Sets new value of clauses
	* @param
	*/
	public void setClauses(Set<Clause> clauses) {
		this.clauses = clauses;
	}
}
