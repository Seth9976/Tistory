package androidx.fragment.app;

import java.util.ArrayList;

public final class w0 implements OpGenerator {
    public final String a;
    public final FragmentManager b;

    public w0(FragmentManager fragmentManager0, String s) {
        this.b = fragmentManager0;
        this.a = s;
    }

    @Override  // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList0, ArrayList arrayList1) {
        return this.b.O(arrayList0, arrayList1, this.a) ? this.b.L(arrayList0, arrayList1, this.a, -1, 1) : false;
    }
}

