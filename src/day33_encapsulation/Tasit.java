package day33_encapsulation;

public class Tasit {
   private String tasitTürü;
  private   boolean muayenesiVarmi;
    private int yil;

    public String getTasitTürü() {
        return tasitTürü;
    }

    public void setTasitTürü(String tasitTürü) {
        this.tasitTürü = tasitTürü;
    }

    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;
    }

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
