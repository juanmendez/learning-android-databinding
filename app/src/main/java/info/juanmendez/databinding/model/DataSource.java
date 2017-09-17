package info.juanmendez.databinding.model;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class DataSource {
    private String name;

    public static DataSource get( String name ){
        return  new DataSource(name);
    }

    public DataSource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
