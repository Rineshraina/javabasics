package basic;

public class Pass {
	private String pageno;
	private String pdes;
	private int pqu;
	private double pp,total;
	public String getPageno() {
		return pageno;
	}
	public void setPageno(String pageno) {
		this.pageno = pageno;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	public int getPqu() {
		return pqu;
	}
	public void setPqu(int pqu) {
		if(pqu<0) {
			this.pqu=0;
		}else {
		this.pqu = pqu;
	}}
	public double getPp() {
		return pp;
	}
	public void setPp(double pp) {
		if(pp<0) {
			this.pp=0;
		}else {
		this.pp = pp;
	}}
	public double getTotal() {
		total=pp*pqu;
		return total;
	}
	
	
	

}
