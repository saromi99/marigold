package com.marigold.shoes.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesVO;

@Repository("shoesDAO")
public class ShoesDAOImpl implements ShoesDAO {

	@Autowired
	private SqlSession session;
	
	@Override
	public void insertShoes(ShoesVO vo) {
		session.insert("ShoesDAO.insertShoes", vo);
	}

	@Override
	public void updateShoes(ShoesVO vo) {
		session.update("ShoesDAO.updateShoes", vo);
	}

	@Override
	public void deleteOneShoes(int article) {
		session.delete("ShoesDAO.deleteOneShoes", article);
	}

	@Override
	public void deleteAll() {
		session.delete("ShoesDAO.deleteAllShoes");
	}

	@Override
	public int getCount() {
		return session.selectOne("ShoesDAO.getCount");
	}

	@Override
	public List<ShoesVO> getList(ShoesVO vo) {
		return session.selectList("ShoesDAO.getList", vo);
	}

	@Override
	public ShoesVO getOne(ShoesVO vo) {
		return session.selectOne("ShoesDAO.getOne", vo);
	}
	
	@Override
	public List<ShoesVO> searchShoes(ShoesVO vo) {
		List<ShoesVO> list = null;
		
		return null;
	}

	@Override
	public List<ShoesVO> searchFirstCategoryList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchFirstCategoryList", vo);
	}

	@Override
	public List<ShoesVO> searchSecondCategoryList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchSecondCategoryList", vo);
	}

	@Override
	public List<ShoesVO> searchThirdCategoryList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchThirdCategoryList", vo);
	}

	@Override
	public List<ShoesVO> searchProductNameList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchProductNameList", vo);
	}

	@Override
	public List<ShoesVO> searchSpecialDayList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchSpecialDayList", vo);
	}

	@Override
	public List<ShoesVO> searchSeasonList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchSeasonList", vo);
	}

	@Override
	public List<ShoesVO> searchColorList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchColorList", vo);
	}

	@Override
	public List<ShoesVO> searchMaterialList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchMaterialList", vo);
	}

	@Override
	public List<ShoesVO> searchPriceList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchPriceList", vo);
	}

	@Override
	public List<ShoesVO> searchHeelList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchHeelList", vo);
	}

	@Override
	public List<ShoesVO> searchFootSizeList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchFootSizeList", vo);
	}

	@Override
	public List<ShoesVO> searchBrandList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchBrandList", vo);
	}

	@Override
	public List<ShoesVO> searchModelIdList(ShoesVO vo) {
		return session.selectList("ShoesDAO.searchModelIdList", vo);
	}

	@Override
	public List<ShoesVO> checkFirstCategoryList(List<ShoesVO> chkList) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("chkList",chkList);
		return session.selectList("ShoesDAO.checkFirstCategoryList", map);
	}

}
