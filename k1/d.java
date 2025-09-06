package k1;

import androidx.compose.ui.b;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class d extends b {
    public final String d;
    public final Object[] e;

    public d(String s, Object[] arr_object, Function1 function10, Function3 function30) {
        super(function10, function30);
        this.d = s;
        this.e = arr_object;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof d && Intrinsics.areEqual(this.d, ((d)object0).d) && Arrays.equals(this.e, ((d)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.e) + this.d.hashCode() * 0x1F;
    }
}

