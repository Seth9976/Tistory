package i4;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final int A;
    public final Event w;
    public final LifecycleOwner x;
    public final Function0 y;
    public final int z;

    public g(Event lifecycle$Event0, LifecycleOwner lifecycleOwner0, Function0 function00, int v, int v1) {
        this.w = lifecycle$Event0;
        this.x = lifecycleOwner0;
        this.y = function00;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        LifecycleEffectKt.LifecycleEventEffect(this.w, this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

