package kr.or.ddit.lprod.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

public interface LprodDaoInf {
	
	
	List<LprodVo> selectAllLprod();
	
	List<LprodVo> getLprodPageList(Map<String, Integer> map);
	
	int getLprodTotCnt();
	
}
