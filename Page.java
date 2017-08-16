public class Page {

	private int pageNumber;
	private int pageSize;
	private int numberOfElements;
	private int totalElements;
	private int totalPages;
	private boolean firstPage;
	private boolean lastPage;

	public Page(){
	}









	/**
	* Returns value of pageNumber
	* @return
	*/
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	* Sets new value of pageNumber
	* @param
	*/
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	* Returns value of pageSize
	* @return
	*/
	public int getPageSize() {
		return pageSize;
	}

	/**
	* Sets new value of pageSize
	* @param
	*/
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	* Returns value of numberOfElements
	* @return
	*/
	public int getNumberOfElements() {
		return numberOfElements;
	}

	/**
	* Sets new value of numberOfElements
	* @param
	*/
	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	/**
	* Returns value of totalElements
	* @return
	*/
	public int getTotalElements() {
		return totalElements;
	}

	/**
	* Sets new value of totalElements
	* @param
	*/
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	/**
	* Returns value of totalPages
	* @return
	*/
	public int getTotalPages() {
		return totalPages;
	}

	/**
	* Sets new value of totalPages
	* @param
	*/
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	/**
	* Returns value of firstPage
	* @return
	*/
	public boolean isFirstPage() {
		return firstPage;
	}

	/**
	* Sets new value of firstPage
	* @param
	*/
	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}

	/**
	* Returns value of lastPage
	* @return
	*/
	public boolean isLastPage() {
		return lastPage;
	}

	/**
	* Sets new value of lastPage
	* @param
	*/
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}


}
