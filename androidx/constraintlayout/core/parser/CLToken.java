package androidx.constraintlayout.core.parser;

public class CLToken extends CLElement {
    public int c;
    public b d;
    public final char[] e;
    public final char[] f;
    public final char[] g;

    public CLToken(char[] arr_c) {
        super(arr_c);
        this.c = 0;
        this.d = b.a;
        this.e = "true".toCharArray();
        this.f = "false".toCharArray();
        this.g = "null".toCharArray();
    }

    public static CLElement allocate(char[] arr_c) {
        return new CLToken(arr_c);
    }

    public boolean getBoolean() throws CLParsingException {
        b b0 = this.d;
        if(b0 == b.b) {
            return true;
        }
        if(b0 != b.c) {
            throw new CLParsingException("this token is not a boolean: <" + this.content() + ">", this);
        }
        return false;
    }

    public b getType() {
        return this.d;
    }

    public boolean isNull() throws CLParsingException {
        if(this.d != b.d) {
            throw new CLParsingException("this token is not a null: <" + this.content() + ">", this);
        }
        return true;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.addIndent(stringBuilder0, v);
        stringBuilder0.append(this.content());
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        return this.content();
    }

    public boolean validate(char c, long v) {
        char[] arr_c = this.g;
        char[] arr_c1 = this.f;
        char[] arr_c2 = this.e;
        boolean z = false;
        switch(this.d.ordinal()) {
            case 0: {
                int v1 = this.c;
                if(arr_c2[v1] == c) {
                    this.d = b.b;
                    z = true;
                }
                else if(arr_c1[v1] == c) {
                    this.d = b.c;
                    z = true;
                }
                else if(arr_c[v1] == c) {
                    this.d = b.d;
                    z = true;
                }
                break;
            }
            case 1: {
                int v2 = this.c;
                if(arr_c2[v2] == c) {
                    z = true;
                    if(v2 + 1 == arr_c2.length) {
                        this.setEnd(v);
                    }
                }
                break;
            }
            case 2: {
                int v3 = this.c;
                if(arr_c1[v3] == c) {
                    z = true;
                    if(v3 + 1 == arr_c1.length) {
                        this.setEnd(v);
                    }
                }
                break;
            }
            case 3: {
                int v4 = this.c;
                if(arr_c[v4] == c) {
                    z = true;
                    if(v4 + 1 == arr_c.length) {
                        this.setEnd(v);
                    }
                }
            }
        }
        ++this.c;
        return z;
    }
}

