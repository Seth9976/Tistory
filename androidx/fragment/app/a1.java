package androidx.fragment.app;

import java.util.ArrayList;

public final class a1 implements OpGenerator {
    public final String a;
    public final int b;
    public final int c;
    public final FragmentManager d;

    public a1(FragmentManager fragmentManager0, String s, int v, int v1) {
        this.d = fragmentManager0;
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList0, ArrayList arrayList1) {
        Fragment fragment0 = this.d.y;
        return fragment0 == null || this.b >= 0 || this.a != null || !fragment0.getChildFragmentManager().popBackStackImmediate() ? this.d.L(arrayList0, arrayList1, this.a, this.b, this.c) : false;
    }
}

