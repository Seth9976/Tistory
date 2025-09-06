package k1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class b extends androidx.compose.ui.b {
    public final String d;
    public final Object e;
    public final Object f;

    public b(String s, Object object0, Object object1, Function1 function10, Function3 function30) {
        super(function10, function30);
        this.d = s;
        this.e = object0;
        this.f = object1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b && Intrinsics.areEqual(this.d, ((b)object0).d) && Intrinsics.areEqual(this.e, ((b)object0).e) && Intrinsics.areEqual(this.f, ((b)object0).f);
    }

    @Override
    public final int hashCode() {
        int v = this.d.hashCode();
        int v1 = 0;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        Object object0 = this.f;
        if(object0 != null) {
            v1 = object0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }
}

