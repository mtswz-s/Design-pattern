package builderpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 15:04
 * @Version 1.0
 */
public class Hose {
    private String base;
    private String roof;
    private String renovation;

    @Override
    public String toString() {
        return "Hose{" +
                "base='" + base + '\'' +
                ", roof='" + roof + '\'' +
                ", renovation='" + renovation + '\'' +
                '}';
    }

    public Hose() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getRenovation() {
        return renovation;
    }

    public void setRenovation(String renovation) {
        this.renovation = renovation;
    }

    public Hose(String base, String roof, String renovation) {
        this.base = base;
        this.roof = roof;
        this.renovation = renovation;
    }
}
