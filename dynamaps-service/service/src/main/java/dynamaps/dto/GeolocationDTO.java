package dynamaps.dto;

import java.io.Serializable;

/**
 * Created by caldea on 3/26/2016.
 */
public class GeolocationDTO implements Serializable {
    private static final long	serialVersionUID	= -136827741795015185L;

    private String xlayout;
    private String ylayout;
    private FloorDTO floor;

    public String getXlayout() {
        return xlayout;
    }

    public void setXlayout(String xlayout) {
        this.xlayout = xlayout;
    }

    public String getYlayout() {
        return ylayout;
    }

    public void setYlayout(String ylayout) {
        this.ylayout = ylayout;
    }

    public FloorDTO getFloor() {
        return floor;
    }

    public void setFloor(FloorDTO floor) {
        this.floor = floor;
    }
}