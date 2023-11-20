import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Interoperability {

    public void callingKotlinMethod() {
        MainKotlin.callingKotlinFromJava();
    }

    public void callingKotlinExtension() {
        String anyString = "Any String";
        MainKotlin.anotherExtension(anyString, "Other");
    }

    void paramOverloads() {
        String params = MainKotlin.overloadFunction("ParamA");
    }

    void readKotlinLambda() {
        MainKotlin.readKotlinLambdaFromJava((s, integer) -> null);
    }

    void accessingToKotlinObject() {
        String property = KotlinObject.property;
        KotlinObject.property = "New String";

        String staticFunction = KotlinObject.staticFunctionForJava();
    }

    @NotNull
    public String getNotNullString() {
        return "";
    }

    @Nullable
    public String getNullString() {
        return null;
    }
}
