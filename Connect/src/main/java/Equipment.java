import java.util.ArrayList;

public class Equipment {
    private String model;
    private double fontType;

    public Equipment(String model, double fontType) {
        this.model = model;
        this.fontType = fontType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFontType() {
        return fontType;
    }

    public void setFontType(double fontType) {
        this.fontType = fontType;
    }
}
