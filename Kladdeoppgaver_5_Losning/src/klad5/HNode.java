package klad5;

public class HNode {

	private int verdi;
	private HNode neste;

	public HNode(int verdi) {
		this.verdi = verdi;
		neste = null;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

	public HNode getNeste() {
		return neste;
	}

	public void setNeste(HNode neste) {
		this.neste = neste;
	}
	
	

}
