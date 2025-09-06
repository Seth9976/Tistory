package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

public class CLKey extends CLContainer {
    public static final ArrayList d;

    static {
        ArrayList arrayList0 = new ArrayList();
        CLKey.d = arrayList0;
        arrayList0.add("ConstraintSets");
        arrayList0.add("Variables");
        arrayList0.add("Generate");
        arrayList0.add("Transitions");
        arrayList0.add("KeyFrames");
        arrayList0.add("KeyAttributes");
        arrayList0.add("KeyPositions");
        arrayList0.add("KeyCycles");
    }

    public CLKey(char[] arr_c) {
        super(arr_c);
    }

    public static CLElement allocate(String s, CLElement cLElement0) {
        CLElement cLElement1 = new CLKey(s.toCharArray());
        cLElement1.setStart(0L);
        cLElement1.setEnd(((long)(s.length() - 1)));
        ((CLKey)cLElement1).set(cLElement0);
        return cLElement1;
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    public static CLElement allocate(char[] arr_c) {
        return new CLKey(arr_c);
    }

    public String getName() {
        return this.content();
    }

    public CLElement getValue() {
        return this.c.size() <= 0 ? null : ((CLElement)this.c.get(0));
    }

    public void set(CLElement cLElement0) {
        ArrayList arrayList0 = this.c;
        if(arrayList0.size() > 0) {
            arrayList0.set(0, cLElement0);
            return;
        }
        arrayList0.add(cLElement0);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder("");
        this.addIndent(stringBuilder0, v);
        String s = this.content();
        ArrayList arrayList0 = this.c;
        if(arrayList0.size() > 0) {
            stringBuilder0.append(s);
            stringBuilder0.append(": ");
            if(CLKey.d.contains(s)) {
                v1 = 3;
            }
            if(v1 > 0) {
                stringBuilder0.append(((CLElement)arrayList0.get(0)).toFormattedJSON(v, v1 - 1));
                return stringBuilder0.toString();
            }
            if(v < CLElement.MAX_LINE) {
                stringBuilder0.append("");
                return stringBuilder0.toString();
            }
            stringBuilder0.append(((CLElement)arrayList0.get(0)).toFormattedJSON(v, v1 - 1));
            return stringBuilder0.toString();
        }
        return s + ": <> ";
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        return this.c.size() <= 0 ? "" + this.content() + ": <> " : "" + this.content() + ": " + "";
    }
}

