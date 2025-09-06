package w0;

import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final int A;
    public final LifecycleOwner w;
    public final Function1 x;
    public final Function0 y;
    public final int z;

    public d(LifecycleOwner lifecycleOwner0, Function1 function10, Function0 function00, int v, int v1) {
        this.w = lifecycleOwner0;
        this.x = function10;
        this.y = function00;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AccessibilityServiceStateProvider_androidKt.a(this.w, this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

