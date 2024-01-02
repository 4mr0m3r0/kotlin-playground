public class Statics {
    private String paramA;
    private String paramB;
    private static int instanceCounter = 0;

    public Statics(String paramA, String paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
        instanceCounter++;
    }

    public String getParamA() {
        return paramA;
    }

    public void setParamA(String paramA) {
        this.paramA = paramA;
    }

    public String getParamB() {
        return paramB;
    }

    public void setParamB(String paramB) {
        this.paramB = paramB;
    }

    public static int getCounter() {
        return instanceCounter;
    }
}
