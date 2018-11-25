package com.poc.model;

import java.util.List;

public class Detail {
	
	/**
	 * @param detailId
	 * @param parts
	 */
	public Detail(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}
	public int getDetailId() {
		return detailId;
	}
		public List<String> getParts() {
		return parts;
	}
	
	private int detailId;
	private List<String> parts;

}
