package com.marigold.shoes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesService;
import com.marigold.shoes.domain.ShoesVO;

@Service("shoesService")
public class ShoesServiceImpl implements ShoesService {

	@Autowired
	@Qualifier("shoesDAO")
	private ShoesDAO dao;
	
	@Override
	public void insertShoes(ShoesVO vo) {
		dao.insertShoes(vo);
	}

	@Override
	public void updateShoes(ShoesVO vo) {
		dao.updateShoes(vo);
	}

	@Override
	public void deleteOneShoes(int article) {
		dao.deleteOneShoes(article);
	}

	@Override
	public void deleteAll() {
		dao.deleteAll();
	}

	@Override
	public int getCount() {
		return dao.getCount();
	}

	@Override
	public ShoesVO getOne(ShoesVO vo) {
		return dao.getOne(vo);
	}

	@Override
	public List<ShoesVO> getList(ShoesVO vo) {
		return dao.getList(vo);
	}

	@Override
	public List<ShoesVO> searchShoes(ShoesVO vo) {
		return dao.searchShoes(vo);
	}

	@Override
	public List<ShoesVO> searchFirstCategoryList(ShoesVO vo) {
		return dao.searchFirstCategoryList(vo);
	}

	@Override
	public List<ShoesVO> searchSecondCategoryList(ShoesVO vo) {
		return dao.searchSecondCategoryList(vo);
	}

	@Override
	public List<ShoesVO> searchThirdCategoryList(ShoesVO vo) {
		return dao.searchThirdCategoryList(vo);
	}

	@Override
	public List<ShoesVO> searchProductNameList(ShoesVO vo) {
		return dao.searchProductNameList(vo);
	}

	@Override
	public List<ShoesVO> searchSpecialDayList(ShoesVO vo) {
		return dao.searchSpecialDayList(vo);
	}

	@Override
	public List<ShoesVO> searchSeasonList(ShoesVO vo) {
		return dao.searchSeasonList(vo);
	}

	@Override
	public List<ShoesVO> searchColorList(ShoesVO vo) {
		return dao.searchColorList(vo);
	}

	@Override
	public List<ShoesVO> searchMaterialList(ShoesVO vo) {
		return dao.searchMaterialList(vo);
	}

	@Override
	public List<ShoesVO> searchPriceList(ShoesVO vo) {
		return dao.searchPriceList(vo);
	}

	@Override
	public List<ShoesVO> searchHeelList(ShoesVO vo) {
		return dao.searchHeelList(vo);
	}

	@Override
	public List<ShoesVO> searchFootSizeList(ShoesVO vo) {
		return dao.searchFootSizeList(vo);
	}

	@Override
	public List<ShoesVO> searchBrandList(ShoesVO vo) {
		return dao.searchBrandList(vo);
	}

	@Override
	public List<ShoesVO> searchModelIdList(ShoesVO vo) {
		return dao.searchModelIdList(vo);
	}

}
