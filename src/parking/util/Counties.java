package parking.util;

public enum Counties {
    AB("Alba","AB"),
    AR("Arad","AR"),
    AG("Argeș","AG"),
    BC("Bacău","BC"),
    BH("Bihor","BH"),
    BN("Bistrița-Năsăud","BN"),
    BR("Brăila","BR"),
    BT("Botoșani","BT"),
    BV("Brașov","BV"),
    BZ("Buzău","BZ"),
    CS("Caraș-Severin","CS"),
    CL("Călărași","CL"),
    CJ("Cluj","CJ"),
    CT("Constanța","CT"),
    CV("Covasna","CV"),
    DB("Dâmbovița","DB"),
    DJ("Dolj","DJ"),
    GL("Galați","GL"),
    GR("Giurgiu","GR"),
    GJ("Gorj","GJ"),
    HR("Harghita","HR"),
    HD("Hunedoara","HD"),
    IL("Ialomița","IL"),
    IS("Iași","IS"),
    IF("Ilfov","IF"),
    MM("Maramureș","MM"),
    MH("Mehedinți","MH"),
    MS("Mureș","MS"),
    NT("Neamț","NT"),
    OT("Olt","OT"),
    PH("Prahova","PH"),
    SM("Satu Mare","SM"),
    SJ("Sălaj","SJ"),
    SB("Sibiu","SB"),
    SV("Suceava","SV"),
    TR("Teleorman","TR"),
    TM("Timiș","TM"),
    TL("Tulcea","TL"),
    VS("Vaslui","VS"),
    VL("Vâlcea","VL"),
    VN("Vrancea","VN"),
    B("Bucharest","B"),
    MAI("MINISTERUL AFACERILOR INTERNE","MAI");

    private final String countyName;
    private final String countyCode;

    //Constructor

    Counties(String countyName, String countyCode) {
        this.countyName = countyName;
        this.countyCode = countyCode;
    }

    //Getters

    public String getCountyName() {
        return countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

}
