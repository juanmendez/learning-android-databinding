package info.juanmendez.databinding.model;

public class Country {
    int name;
    int flag;
    int url;
    int timesVisited;

    public Country(int name) {
        this.name = name;
    }

    Country(int name, int flag, int url) {
        this.name=name;
        this.flag=flag;
        this.url=url;
    }

    Country(int name, int flag, int url, int timesVisited ){
        this( name, flag, url );
        this.timesVisited = timesVisited;
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

    public int getTimesVisited() {
        return timesVisited;
    }
}
