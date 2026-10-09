public class Zak {
    private String jmeno;
    private int cisloChodu;

    public Zak(String jmeno, int cisloChodu) {
        this.jmeno = jmeno;
        this.cisloChodu = cisloChodu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getCisloChodu() {
        return cisloChodu;
    }

    public void setCisloChodu(int cisloChodu) {
        this.cisloChodu = cisloChodu;
    }

    @Override
    public String toString() {
        return jmeno+", cisloChodu: "+cisloChodu;
    }
}
