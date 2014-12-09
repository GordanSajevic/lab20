package lab20;

public class Pakovanje {

	public static double volTezina(Dimensions niz)
	{
		double volumetrijskaTezina = (niz.height*niz.width*niz.length)/5000;
		return volumetrijskaTezina;
	}
	
	public static double racunajCijenu(Dimensions niz)
	{
		double volumetrijskaTezina = volTezina(niz);
		double cijena = niz.weight*3;
		if (volumetrijskaTezina > niz.weight)
		{
			cijena = volumetrijskaTezina*3;
			return cijena;
		}
		return cijena;
	}
	
	
	private static Dimensions getDimension()
	{
		Dimensions dim = new Dimensions();
		System.out.println("Unesite visinu(cm): ");
		dim.height = TextIO.getDouble();
		System.out.println("Unesite širinu(cm): ");
		dim.width = TextIO.getDouble();
		System.out.println("Unesite dužinu(cm): ");
		dim.length = TextIO.getDouble();
		System.out.println("Unesite težinu(kg): ");
		dim.weight = TextIO.getDouble();
		return dim;
	}
	
	public static void main(String[] args) {
		Dimensions dim = getDimension();
		System.out.println("Cijena pakovanja je: " + racunajCijenu(dim) + " KM");	
	}

}
