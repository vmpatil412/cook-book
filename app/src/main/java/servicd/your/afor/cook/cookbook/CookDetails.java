package servicd.your.afor.cook.cookbook;

import java.io.Serializable;

public class CookDetails implements Serializable {
    private final String personName;
    private final String specialist;
    private final int imageId;

    public CookDetails(String personName, String specialist, int imageId) {
        this.personName = personName;
        this.specialist = specialist;
        this.imageId = imageId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getSpecialist() {
        return specialist;
    }

    public int getImageId() {
        return imageId;
    }
}
