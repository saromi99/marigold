package com.marigold.shoes.domain;

import java.util.List;

public interface ShoesDAO {
	public void insertShoes(ShoesVO vo);
	public void updateShoes(ShoesVO vo);
	public void deleteOneShoes(int article);
	public void deleteAll();
	public int getCount();
	
	public ShoesVO getOne(ShoesVO vo);
	public List<ShoesVO> getList(ShoesVO vo);
	
	public List<ShoesVO> searchShoes(ShoesVO vo);
	public List<ShoesVO> searchFirstCategoryList(ShoesVO vo); 
	public List<ShoesVO> searchSecondCategoryList(ShoesVO vo);
	public List<ShoesVO> searchThirdCategoryList(ShoesVO vo);
	public List<ShoesVO> searchProductNameList(ShoesVO vo);
	public List<ShoesVO> searchSpecialDayList(ShoesVO vo);
	public List<ShoesVO> searchSeasonList(ShoesVO vo);
	public List<ShoesVO> searchColorList(ShoesVO vo);
	public List<ShoesVO> searchMaterialList(ShoesVO vo);
	public List<ShoesVO> searchPriceList(ShoesVO vo);
	public List<ShoesVO> searchHeelList(ShoesVO vo);
	public List<ShoesVO> searchFootSizeList(ShoesVO vo);
	public List<ShoesVO> searchBrandList(ShoesVO vo);
	public List<ShoesVO> searchModelIdList(ShoesVO vo);
}
