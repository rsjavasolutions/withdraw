public class Lender {

    private Integer id;
    private String fullName;
    private String shortName;

    public Lender(Integer id, String fullName, String shortName) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "Lender{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
