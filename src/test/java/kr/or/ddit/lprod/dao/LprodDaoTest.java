package kr.or.ddit.lprod.dao;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVo;

public class LprodDaoTest {

	private LprodDaoInf lprodDao;
	
	@Before
	public void setup() {
		lprodDao = new LprodDao();
	}
	
	@Test
	public void selectAllLprodTest() {
		/***Given***/

		/***When***/
		List<LprodVo> lprodList = lprodDao.selectAllLprod();
		
		for(LprodVo vo : lprodList) {
			System.out.println(vo);
		}

		/***Then***/
		assertEquals(12, lprodList.size());
	}
	
	@Test
	public void getLprodPageList() {
		/***Given***/

		/***When***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page", 1);
		map.put("pageSize", 5);
		
		List<LprodVo> lprodList = lprodDao.getLprodPageList(map);
		
		for(LprodVo vo : lprodList)
			System.out.println(vo);
		
		/***Then***/
		assertEquals(5, lprodList.size());
	}
}
