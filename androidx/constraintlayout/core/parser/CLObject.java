package androidx.constraintlayout.core.parser;

import java.util.Iterator;

public class CLObject extends CLContainer implements Iterable {
    public CLObject(char[] arr_c) {
        super(arr_c);
    }

    public static CLObject allocate(char[] arr_c) {
        return new CLObject(arr_c);
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new a();
        iterator0.b = 0;
        iterator0.c = this;
        return iterator0;
    }

    public String toFormattedJSON() {
        return this.toFormattedJSON(0, 0);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder("");
        stringBuilder0.append("{\n");
        boolean z = true;
        for(Object object0: this.c) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(",\n");
            }
            stringBuilder0.append(((CLElement)object0).toFormattedJSON(CLElement.BASE_INDENT + v, v1 - 1));
        }
        stringBuilder0.append("\n");
        this.addIndent(stringBuilder0, v);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder stringBuilder0 = new StringBuilder("{ ");
        boolean z = true;
        Iterator iterator0 = this.c.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append("");
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }
}

