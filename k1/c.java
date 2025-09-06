package k1;

import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class c extends b {
    public final String d;
    public final Object e;
    public final Object f;
    public final Object g;

    public c(String s, Object object0, Object object1, Object object2, Function1 function10, Function3 function30) {
        super(function10, function30);
        this.d = s;
        this.e = object0;
        this.f = object1;
        this.g = object2;
    }

    // 去混淆评级： 中等(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c && Intrinsics.areEqual(this.d, ((c)object0).d) && Intrinsics.areEqual(this.e, ((c)object0).e) && Intrinsics.areEqual(this.f, ((c)object0).f) && Intrinsics.areEqual(this.g, ((c)object0).g);
    }

    @Override
    public final int hashCode() {
        int v = this.d.hashCode();
        int v1 = 0;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        int v3 = this.f == null ? 0 : this.f.hashCode();
        Object object0 = this.g;
        if(object0 != null) {
            v1 = object0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }
}

