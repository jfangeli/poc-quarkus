package poc.quarkus.domaim;


import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class PetStore implements Serializable {

    private String id;

    @NotEmpty
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
