package info.juanmendez.databinding.model;

public class Country {
    int name;
    int flag;
    int url;

    Country(int name, int flag, int url) {
        this.name=name;
        this.flag=flag;
        this.url=url;
    }

    public int getName() {
        return name;
    }

    public int getFlag() {
        return flag;
    }

    public int getUrl() {
        return url;
    }
}
