package esprit.projet.persistance.dao;

import java.util.List;

import esprit.projet.persistance.model.Tpcategory;

public class Response {
	private List<Tpcategory> tpcategories;
	public List<Tpcategory> getTpcategories() {
		return tpcategories;
	}

	public void setTpcategories(List<Tpcategory> tpcategories) {
		this.tpcategories = tpcategories;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Response(List<Tpcategory> tpcategories, int totalPages, int pageNumber, int pageSize) {
		
		this.tpcategories = tpcategories;
		this.totalPages = totalPages;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	private int totalPages;
	private int pageNumber;
	private int pageSize;
	
	public Response(){}

	@Override
	public String toString() {
		return "Response [tpcategories=" + tpcategories + ", totalPages=" + totalPages + ", pageNumber=" + pageNumber
				+ ", pageSize=" + pageSize + "]";
	}

	
	
}