package lab20;

public class PodaciOKorisniku {

	public static void upisPodataka(User u)
	{
		System.out.println("Unesite ime: ");
		u.ime = TextIO.getlnString();
		System.out.println("Unesite prezime: ");
		u.prezime = TextIO.getlnString();
		System.out.println("Unesite godine: ");
		u.godine = TextIO.getlnInt();
	}
	
	public static void ispisPodataka(String ime, String prezime, int godine)
	{
		System.out.println(ime + " " + prezime + ", " + godine + " godine, propao kao žeton.");
	}
	
	public static void main(String[] args) {
		User u = new User();
		upisPodataka(u);
		String ime1 = u.ime;
		String prezime1 = u.prezime;
		int godine1 = u.godine;
		ispisPodataka(ime1, prezime1, godine1);
		upisPodataka(u);
		String ime2 = u.ime;
		int godine2 = u.godine;
		String prezime2 = u.prezime;
		ispisPodataka(ime2, prezime2, godine2);
		if(godine1 > godine2)
		{
			System.out.println("Stariji je korisnik " + ime1);
		}
		else if (godine2 > godine1)
		{
			System.out.println("Stariji je korisnik " + ime2);
		}
		else
		{
			System.out.println("Korisnici imaju isti broj godina");
		}
	}

}
