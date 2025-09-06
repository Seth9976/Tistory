package androidx.constraintlayout.core.parser;

public class CLNumber extends CLElement {
    public float c;

    public CLNumber(float f) {
        super(null);
        this.c = f;
    }

    public CLNumber(char[] arr_c) {
        super(arr_c);
        this.c = NaNf;
    }

    public static CLElement allocate(char[] arr_c) {
        return new CLNumber(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if(Float.isNaN(this.c)) {
            this.c = Float.parseFloat(this.content());
        }
        return this.c;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if(Float.isNaN(this.c)) {
            this.c = (float)Integer.parseInt(this.content());
        }
        return (int)this.c;
    }

    public boolean isInt() {
        float f = this.getFloat();
        return ((float)(((int)f))) == f;
    }

    public void putValue(float f) {
        this.c = f;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.addIndent(stringBuilder0, v);
        float f = this.getFloat();
        if(((float)(((int)f))) == f) {
            stringBuilder0.append(((int)f));
            return stringBuilder0.toString();
        }
        stringBuilder0.append(f);
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f = this.getFloat();
        return Float.compare(((int)f), f) == 0 ? "" + ((int)f) : "" + f;
    }
}

