package parking.util;

public enum Counties {
    AB("Alba"),
    AR("Arad"),
    AG("Argeș"),
    BC("Bacău"),
    BH("Bihor"),
    BN("Bistrița-Năsăud"),
    BR("Brăila"),
    BT("Botoșani"),
    BV("Brașov"),
    BZ("Buzău"),
    CS("Caraș-Severin"),
    CL("Călărași"),
    CJ("Cluj"),
    CT("Constanța"),
    CV("Covasna"),
    DB("Dâmbovița"),
    DJ("Dolj"),
    GL("Galați"),
    GR("Giurgiu"),
    GJ("Gorj"),
    HR("Harghita"),
    HD("Hunedoara"),
    IL("Ialomița"),
    IS("Iași"),
    IF("Ilfov"),
    MM("Maramureș"),
    MH("Mehedinți"),
    MS("Mureș"),
    NT("Neamț"),
    OT("Olt"),
    PH("Prahova"),
    SM("Satu Mare"),
    SJ("Sălaj"),
    SB("Sibiu"),
    SV("Suceava"),
    TR("Teleorman"),
    TM("Timiș"),
    TL("Tulcea"),
    VS("Vaslui"),
    VL("Vâlcea"),
    VN("Vrancea"),
    B("Bucharest");

    private final String countyName;

    Counties(String countyName) {
        this.countyName = countyName;
    }
}
