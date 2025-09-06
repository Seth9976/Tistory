package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i6 extends Lambda implements Function0 {
    public final Function1 w;

    public i6(Function1 function10) {
        this.w = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DisplayMode displayMode0 = DisplayMode.box-impl(0);
        this.w.invoke(displayMode0);
        return Unit.INSTANCE;
    }
}

