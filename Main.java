import java.util.ArrayList;



// UTENTE
abstract class Utente {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;


    public Utente(String nome, int id, String cognome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class UtenteRegistrato extends Utente{
    public UtenteRegistrato(String nome, int id, String cognome, String email, String password) {
        super(nome, id, cognome, email, password);
    }
}

class Operatore extends Utente{
    public Operatore(String nome, int id, String cognome, String email, String password) {
        super(nome, id, cognome, email, password);
    }
}

class Amministratore extends Utente{
    public Amministratore(String nome, int id, String cognome, String email, String password) {
        super(nome, id, cognome, email, password);
    }
}

//PRODOTTO
abstract class Prodotto{
    private int id;
    private Time dataInizio;
    private Time dataFine;
    private int costo;

    public Prodotto(int id, Time dataInizio, Time dataFine, int costo) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Time dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Time getDataFine() {
        return dataFine;
    }

    public void setDataFine(Time dataFine) {
        this.dataFine = dataFine;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}

class Viaggio extends Prodotto{
   private TipologiaViaggio tipologia;
   private String partenza;
   private String arrivo;

    public Viaggio(int id, Time dataInizio, Time dataFine, int costo, TipologiaViaggio tipologia, String partenza, String arrivo) {
        super(id, dataInizio, dataFine, costo);
        this.tipologia = tipologia;
        this.partenza = partenza;
        this.arrivo = arrivo;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public TipologiaViaggio getTipologia() {
        return tipologia;
    }

    public void setTipologia(TipologiaViaggio tipologia) {
        this.tipologia = tipologia;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }
}

class PacchettoVacanza extends Prodotto{
    private int numeroPersone;
    private String Hotel;
    private int postiDIsponibili;

    ArrayList<Viaggio> spostamenti;

    public PacchettoVacanza(int id, Time dataInizio, Time dataFine, int costo, int numeroPersone, ArrayList<Viaggio> spostamenti, int postiDIsponibili, String hotel) {
        super(id, dataInizio, dataFine, costo);
        this.numeroPersone = numeroPersone;
        this.spostamenti = spostamenti;
        this.postiDIsponibili = postiDIsponibili;
        Hotel = hotel;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public int getPostiDIsponibili() {
        return postiDIsponibili;
    }

    public void setPostiDIsponibili(int postiDIsponibili) {
        this.postiDIsponibili = postiDIsponibili;
    }

    public ArrayList<Viaggio> getSpostamenti() {
        return spostamenti;
    }

    public void setSpostamenti(ArrayList<Viaggio> spostamenti) {
        this.spostamenti = spostamenti;
    }
}

//VARIABILI
enum TipologiaViaggio{
    Aereo,
    Treno
}

class Time{
    private int giorno;
    private int mese;
    private int anno;
    private int ora;
    private int minuti;

    public Time(int giorno, int mese, int anno, int ora, int minuti) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
        this.ora = ora;
        this.minuti = minuti;
    }

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public int getOra() {
        return ora;
    }

    public int getMinuti() {
        return minuti;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("ok");
    }
}