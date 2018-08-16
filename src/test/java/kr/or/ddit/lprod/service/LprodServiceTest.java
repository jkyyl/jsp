package kr.or.ddit.lprod.service;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

import org.junit.Before;
import org.junit.Test;

public class LprodServiceTest {

	private LprodServiceInf lprodService;
	
	@Before
	public void setup() {
		lprodService = new LprodService();
	}
	
	
	@Test
	public void selectAllLprodTest() {
		/***Given***/

		/***When***/
		List<LprodVo> lprodList = lprodService.selectAllLprod();
		
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
		
//		List<LprodVo> lprodList = lprodService.getLprodPageList(map);
		
//		for(LprodVo vo : lprodList)
//			System.out.println(vo);
		
		/***Then***/
//		assertEquals(5, lprodList.size());
	}
}
