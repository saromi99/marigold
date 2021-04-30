package com.marigold.shoes.domain;

public class ShoesVO {
	
	private String article;
	private String firstCategory;
	private String secondCategory;
	private String thirdCategory;
	private String productName;
	private String specialDay;
	private int season;
	private String color;
	private String material;
	private int price;
	private int heel;
	private int footSize;
	private String brand;
	private String modelId;
	
	public ShoesVO() {
		super();
	}
	
	public ShoesVO(String article, String firstCategory, String secondCategory, String thirdCategory,
			String productName, String color, String material, int price, int heel, int footSize, String brand) {
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

	public ShoesVO(String article, String firstCategory, String secondCategory, String thirdCategory,
			String productName, String specialDay, int season, String color, String material, int price, int heel,
			int footSize, String brand, String modelId) {
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

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getFirstCategory() {
		return firstCategory;
	}

	public void setFirstCategory(String firstCategory) {
		this.firstCategory = firstCategory;
	}

	public String getSecondCategory() {
		return secondCategory;
	}

	public void setSecondCategory(String secondCategory) {
		this.secondCategory = secondCategory;
	}

	public String getThirdCategory() {
		return thirdCategory;
	}

	public void setThirdCategory(String thirdCategory) {
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
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
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((firstCategory == null) ? 0 : firstCategory.hashCode());
		result = prime * result + footSize;
		result = prime * result + heel;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((modelId == null) ? 0 : modelId.hashCode());
		result = prime * result + price;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + season;
		result = prime * result + ((secondCategory == null) ? 0 : secondCategory.hashCode());
		result = prime * result + ((specialDay == null) ? 0 : specialDay.hashCode());
		result = prime * result + ((thirdCategory == null) ? 0 : thirdCategory.hashCode());
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
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (firstCategory == null) {
			if (other.firstCategory != null)
				return false;
		} else if (!firstCategory.equals(other.firstCategory))
			return false;
		if (footSize != other.footSize)
			return false;
		if (heel != other.heel)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
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
		if (secondCategory == null) {
			if (other.secondCategory != null)
				return false;
		} else if (!secondCategory.equals(other.secondCategory))
			return false;
		if (specialDay == null) {
			if (other.specialDay != null)
				return false;
		} else if (!specialDay.equals(other.specialDay))
			return false;
		if (thirdCategory == null) {
			if (other.thirdCategory != null)
				return false;
		} else if (!thirdCategory.equals(other.thirdCategory))
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
