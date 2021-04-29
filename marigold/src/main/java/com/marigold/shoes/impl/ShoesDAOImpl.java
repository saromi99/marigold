package com.marigold.shoes.impl;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchFirCategoryList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchSecondCategoryList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchThirdCategoryList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchProductNameList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchSpecialDayList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchSeasonList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchColorList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchMaterialList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchPriceList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchHeelList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchFootSizeList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchBrandList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> searchModelIdList(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
