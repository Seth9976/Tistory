package androidx.constraintlayout.core.state;

import java.util.ArrayList;

public final class b extends Exception {
    public final ArrayList a;

    public b(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override
    public final String toString() {
        return "IncorrectConstraintException: " + this.a.toString();
    }
}

