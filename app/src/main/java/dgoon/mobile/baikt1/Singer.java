package dgoon.mobile.baikt1;

public class Singer {

    private String name, stagename, national, star;
    private int image;

    public Singer(String name, String stagename, String national, String star, int image) {
        this.name = name;
        this.stagename = stagename;
        this.national = national;
        this.star = star;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStagename() {
        return stagename;
    }

    public void setStagename(String stagename) {
        this.stagename = stagename;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
