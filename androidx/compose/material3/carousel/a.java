package androidx.compose.material3.carousel;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.c;
import v0.o;

public final class a implements KeylineListScope {
    public int a;
    public float b;
    public int c;
    public final ArrayList d;

    public a() {
        this.a = -1;
        this.c = -1;
        this.d = new ArrayList();
    }

    public static ArrayList a(int v, float f, int v1, int v2, float f1, float f2, float f3, ArrayList arrayList0) {
        float f5;
        o o0 = (o)arrayList0.get(v);
        ArrayList arrayList1 = new ArrayList();
        float f4 = o0.a;
        if(Float.compare(f - f4 / 2.0f, 0.0f) >= 0 || f + f4 / 2.0f <= 0.0f) {
            f5 = f - f4 / 2.0f >= f2 || f + f4 / 2.0f <= f2 ? 0.0f : f4 / 2.0f + f - f2;
        }
        else {
            f5 = f - f4 / 2.0f;
        }
        arrayList1.add(new Keyline(f4, f, f, v1 <= v && v <= v2, o0.b, true, f5));
        float f6 = f - f1 / 2.0f - f3;
        float f7 = f6;
        Iterator iterator0 = c.downTo(v - 1, 0).iterator();
        while(iterator0.hasNext()) {
            int v3 = ((IntIterator)iterator0).nextInt();
            o o1 = (o)arrayList0.get(v3);
            float f8 = f6 - o1.a / 2.0f;
            arrayList1.add(0, new Keyline(o1.a, f8, f7 - f1 / 2.0f, v1 <= v3 && v3 <= v2, o1.b, false, (f8 - o1.a / 2.0f >= 0.0f || f8 + o1.a / 2.0f <= 0.0f ? 0.0f : Math.abs(f8 - o1.a / 2.0f))));
            f6 -= o1.a + f3;
            f7 -= f1 + f3;
        }
        float f9 = f + f1 / 2.0f + f3;
        float f10 = f9;
        Iterator iterator1 = r0.a.r(arrayList0, v + 1);
        while(iterator1.hasNext()) {
            int v4 = ((IntIterator)iterator1).nextInt();
            o o2 = (o)arrayList0.get(v4);
            float f11 = o2.a / 2.0f + f9;
            arrayList1.add(new Keyline(o2.a, f11, f10 + f1 / 2.0f, v1 <= v4 && v4 <= v2, o2.b, false, (f11 - o2.a / 2.0f >= f2 || f11 + o2.a / 2.0f <= f2 ? 0.0f : o2.a / 2.0f + f11 - f2)));
            f9 += o2.a + f3;
            f10 += f1 + f3;
        }
        return arrayList1;
    }

    @Override  // androidx.compose.material3.carousel.KeylineListScope
    public final void add(float f, boolean z) {
        ArrayList arrayList0 = this.d;
        arrayList0.add(new o(f, z));
        if(f > this.b) {
            this.a = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            this.b = f;
        }
    }

    public final int b() {
        int v;
        for(v = this.a; v < CollectionsKt__CollectionsKt.getLastIndex(this.d) && ((o)this.d.get(v + 1)).a == this.b; ++v) {
        }
        return v;
    }
}

