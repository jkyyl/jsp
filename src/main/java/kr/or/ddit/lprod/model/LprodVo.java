package kr.or.ddit.lprod.model;

public class LprodVo {
	//lprod_id(int), lprod_gu(String(4)), lprod_nm(Sting)
	
	private int lprod_id;
	private String lprod_nm;
	private String lprod_gu;
	
	public LprodVo() {
		
	}

	public int getLprod_id() {
		return lprod_id;
	}

	public void setLprod_id(int lprod_id) {
		this.lprod_id = lprod_id;
	}

	public String getLprod_nm() {
		return lprod_nm;
	}

	public void setLprod_nm(String lprod_nm) {
		this.lprod_nm = lprod_nm;
	}

	public String getLprod_gu() {
		return lprod_gu;
	}

	public void setLprod_gu(String lprod_gu) {
		this.lprod_gu = lprod_gu;
	}

	@Override
	public String toString() {
		return "LpordVo [lprod_id=" + lprod_id + ", lprod_nm=" + lprod_nm
				+ ", lprod_gu=" + lprod_gu + "]";
	}

	
}
