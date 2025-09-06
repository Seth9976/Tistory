package androidx.constraintlayout.core.parser;

public class CLString extends CLElement {
    public CLString(char[] arr_c) {
        super(arr_c);
    }

    public static CLElement allocate(char[] arr_c) {
        return new CLString(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.addIndent(stringBuilder0, v);
        stringBuilder0.append("\'");
        stringBuilder0.append(this.content());
        stringBuilder0.append("\'");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        return "\'" + this.content() + "\'";
    }
}

