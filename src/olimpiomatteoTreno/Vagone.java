package olimpiomatteoTreno;
/**
 *  <b>classe treno</b>
 * <p>array di oggetti</p>
 * <UL>
 * <LI>nome
 * <LI>destinazione
 * <LI>vagoni massimi
 * </UL>
 * @author 4a
 *
 */
public class Vagone {

private int classe;
//private int PostiD;
private int postiO;
private int postiTot;

public Vagone(int Cl,int PTot) {
	classe=Cl;
	postiTot=PTot;
}

public int getPostiD() {
	return postiTot-postiO;
}



public int getPostiO() {
	return postiO;
}

public void setPostiO(int postiO) {
	postiO = postiO;
}
public String toString() {
	String s="la classe del vagone è:"+classe;
	s+="\ni posti del vagone sono: "+postiTot;
	return s;
}
/**
 * metodo test di classe
 * @param args
 */
public static void main(String[] args) {
	Vagone v=new Vagone(3,20);
		System.out.println(v);
}
}
