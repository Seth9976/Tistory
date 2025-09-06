package androidx.fragment.app;

import java.util.ArrayList;

public final class b1 implements OpGenerator {
    public final String a;
    public final FragmentManager b;

    public b1(FragmentManager fragmentManager0, String s) {
        this.b = fragmentManager0;
        this.a = s;
    }

    @Override  // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList0, ArrayList arrayList1) {
        return this.b.O(arrayList0, arrayList1, this.a);
    }
}

