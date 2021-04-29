package com.marigold.shoes.domain;

public class ShoesVO {
	private int article;
	private int firstCategory;
	private int secondCategory;
	private int thirdCategory;
	private String productName;
	private String specialDay;
	private int season;
	private String color;
	private int material;
	private int price;
	private int heel;
	private int footSize;
	private int brand;
	private String modelId;
	
	public ShoesVO() {
		super();
	}
	
	public ShoesVO(int article, int firstCategory, int secondCategory, int thirdCategory, String productName,
			String color, int material, int price, int heel, int footSize, int brand) {
		super();
		this.article = article;
		this.firstCategory = firstCategory;
		this.secondCategory = secondCategory;
		this.thirdCategory = thirdCategory;
		this.productName = productName;
		this.color = color;
		this.material = material;
		this.price = price;
		this.heel = heel;
		this.footSize = footSize;
		this.brand = brand;
	}

	public ShoesVO(int article, int firstCategory, int secondCategory, int thirdCategory, String productName,
			String specialDay, int season, String color, int material, int price, int heel, int footSize, int brand,
			String modelId) {
		super();
		this.article = article;
		this.firstCategory = firstCategory;
		this.secondCategory = secondCategory;
		this.thirdCategory = thirdCategory;
		this.productName = productName;
		this.specialDay = specialDay;
		this.season = season;
		this.color = color;
		this.material = material;
		this.price = price;
		this.heel = heel;
		this.footSize = footSize;
		this.brand = brand;
		this.modelId = modelId;
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	public int getFirstCategory() {
		return firstCategory;
	}

	public void setFirstCategory(int firstCategory) {
		this.firstCategory = firstCategory;
	}

	public int getSecondCategory() {
		return secondCategory;
	}

	public void setSecondCategory(int secondCategory) {
		this.secondCategory = secondCategory;
	}

	public int getThirdCategory() {
		return thirdCategory;
	}

	public void setThirdCategory(int thirdCategory) {
		this.thirdCategory = thirdCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSpecialDay() {
		return specialDay;
	}

	public void setSpecialDay(String specialDay) {
		this.specialDay = specialDay;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHeel() {
		return heel;
	}

	public void setHeel(int heel) {
		this.heel = heel;
	}

	public int getFootSize() {
		return footSize;
	}

	public void setFootSize(int footSize) {
		this.footSize = footSize;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + article;
		result = prime * result + brand;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + firstCategory;
		result = prime * result + footSize;
		result = prime * result + heel;
		result = prime * result + material;
		result = prime * result + ((modelId == null) ? 0 : modelId.hashCode());
		result = prime * result + price;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + season;
		result = prime * result + secondCategory;
		result = prime * result + ((specialDay == null) ? 0 : specialDay.hashCode());
		result = prime * result + thirdCategory;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoesVO other = (ShoesVO) obj;
		if (article != other.article)
			return false;
		if (brand != other.brand)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (firstCategory != other.firstCategory)
			return false;
		if (footSize != other.footSize)
			return false;
		if (heel != other.heel)
			return false;
		if (material != other.material)
			return false;
		if (modelId == null) {
			if (other.modelId != null)
				return false;
		} else if (!modelId.equals(other.modelId))
			return false;
		if (price != other.price)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (season != other.season)
			return false;
		if (secondCategory != other.secondCategory)
			return false;
		if (specialDay == null) {
			if (other.specialDay != null)
				return false;
		} else if (!specialDay.equals(other.specialDay))
			return false;
		if (thirdCategory != other.thirdCategory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShoesVO [article=" + article + ", firstCategory=" + firstCategory + ", secondCategory=" + secondCategory
				+ ", thirdCategory=" + thirdCategory + ", productName=" + productName + ", specialDay=" + specialDay
				+ ", season=" + season + ", color=" + color + ", material=" + material + ", price=" + price + ", heel="
				+ heel + ", footSize=" + footSize + ", brand=" + brand + ", modelId=" + modelId + "]";
	}

}
