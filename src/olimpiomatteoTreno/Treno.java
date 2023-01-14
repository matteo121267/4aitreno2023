
package olimpiomatteoTreno;
/**
 * <b>classe treno</b>
 * <p>array di oggetti</p>
 * <UL>
 * <LI>nome
 * <LI>destinazione
 * <LI>vagoni massimi
 * </UL>
 * 
 * 
 * 
 * 
 * @author matteo olimpio
 * versione 2
 *
 */


public class Treno {
	/**
	 * 
	 * 
	 */
	private String nome;
	private String destinazione;
	private int numeroMax;
	private Vagone[] vagoni;
	/**
	 * 
	 * @param n
	 * @param nMax
	 */

	public Treno(String n, int nMax) {
		nome = n;
		numeroMax = nMax;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public boolean aggiungivagone(Vagone u, int pos) {
		vagoni[pos] = u;
		return true;
	}
	/**
	 * @return metodo che restituisce il treno completo
	 */
	
	
	public String toString() {
		String s="aggiungi vagone"+vagoni;
		return s;
	}
	public static void main(String[] args) {
		Treno t=new Treno("Freccia rossa",5);
		System.out.println(t);
	}
}
