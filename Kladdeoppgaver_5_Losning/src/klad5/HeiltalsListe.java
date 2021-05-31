package klad5;

public class HeiltalsListe {

	private HNode start;

	public HeiltalsListe() {
		start = null;
	}

	public HeiltalsListe(int verdi) {
		start = new HNode(verdi);
	}

	public void leggTilFoerst(int verdi) {
		HNode ny = new HNode(verdi);
		ny.setNeste(start);
		start = ny;
	}

	public int antall() {
		return antall(start);
	};

	private int antall(HNode p) {
		if (p == null) {
			return 0;
		} else {
			return 1 + antall(p.getNeste());
		}
	}

	public int sum() {
		return sum(start);
	}

	private int sum(HNode p) {
		if (p == null) {
			return 0;
		} else {
			return p.getVerdi() + antall(p.getNeste());
		}
	}

	public int maks() {
		// må minst ha et element
		if (antall() > 0) {
			return maks(start);
		} else {
			return 0;
		}
	}

	private int maks(HNode p) {
		if (p.getNeste() == null) {
			return p.getVerdi();
		} else {
			int maksResten = maks(p.getNeste());
			if (p.getVerdi() >= maksResten) {
				return p.getVerdi();
			} else {
				return maksResten;
			}
		}
	}

	public boolean erSortert() {
		return erSortert(start);
	}

	private boolean erSortert(HNode p) {
		if (antall() == 0) {
			return true;
		} else {
			if (p.getNeste() == null) {
				return true;
			} else {
				boolean TF = erSortert(p.getNeste());

				return ((p.getVerdi() < p.getNeste().getVerdi()) && TF);

			}
		}

	}

	public void skrivBaklengs() {
		if (start == null) {
			System.out.println("Lista er tom");
		} else {
			skrivBaklengs(start);
		}
	}

	private void skrivBaklengs(HNode p) {
		if (p == null) {
			// basis -> gjer ingenting
		} else {
			skrivBaklengs(p.getNeste());
			System.out.println(" " + p.getVerdi());
		}

	}
}
