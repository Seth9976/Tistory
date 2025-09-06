package androidx.constraintlayout.core.parser;

import wb.a;

public class CLParsingException extends Exception {
    public final String a;
    public final int b;
    public final String c;

    public CLParsingException(String s, CLElement cLElement0) {
        this.a = s;
        if(cLElement0 != null) {
            this.c = cLElement0.getStrClass();
            this.b = cLElement0.getLine();
            return;
        }
        this.c = "unknown";
        this.b = 0;
    }

    public String reason() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.c);
        stringBuilder0.append(" at line ");
        return a.c(this.b, ")", stringBuilder0);
    }

    @Override
    public String toString() {
        return "CLParsingException (" + this.hashCode() + ") : " + this.reason();
    }
}

