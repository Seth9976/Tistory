package s;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function1 {
    public final Function1 w;

    public k0(Function1 function10) {
        this.w = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((IntSize)object0).unbox-impl();
        return IntSize.box-impl(IntSizeKt.IntSize(((Number)this.w.invoke(IntSize.getWidth-impl(v))).intValue(), IntSize.getHeight-impl(v)));
    }
}

