package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w9 extends Lambda implements Function0 {
    public final MutableState w;
    public final String x;
    public final Function1 y;
    public final boolean z;

    public w9(MutableState mutableState0, String s, Function1 function10, boolean z) {
        this.w = mutableState0;
        this.x = s;
        this.y = function10;
        this.z = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MenuAnchorType menuAnchorType0 = MenuAnchorType.box-impl(this.x);
        this.w.setValue(menuAnchorType0);
        this.y.invoke(Boolean.valueOf(!this.z));
        return Unit.INSTANCE;
    }
}

