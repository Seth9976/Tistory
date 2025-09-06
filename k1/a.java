package k1;

import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class a extends b {
    public final String d;
    public final Object e;

    public a(String s, Object object0, Function1 function10, Function3 function30) {
        super(function10, function30);
        this.d = s;
        this.e = object0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && Intrinsics.areEqual(this.d, ((a)object0).d) && Intrinsics.areEqual(this.e, ((a)object0).e);
    }

    @Override
    public final int hashCode() {
        int v = this.d.hashCode();
        return this.e == null ? v * 0x1F : v * 0x1F + this.e.hashCode();
    }
}

