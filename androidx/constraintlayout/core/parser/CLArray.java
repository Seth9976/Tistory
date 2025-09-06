package androidx.constraintlayout.core.parser;

public class CLArray extends CLContainer {
    public CLArray(char[] arr_c) {
        super(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    public static CLElement allocate(char[] arr_c) {
        return new CLArray(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.toJSON();
        if(v1 <= 0 && s.length() + v < CLElement.MAX_LINE) {
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
        stringBuilder0.append("[\n");
        boolean z = true;
        for(Object object0: this.c) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(",\n");
            }
            this.addIndent(stringBuilder0, CLElement.BASE_INDENT + v);
            stringBuilder0.append(((CLElement)object0).toFormattedJSON(CLElement.BASE_INDENT + v, v1 - 1));
        }
        stringBuilder0.append("\n");
        this.addIndent(stringBuilder0, v);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        boolean z = true;
        for(int v = 0; v < this.c.size(); ++v) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append("");
        }
        return stringBuilder0 + "]";
    }
}

