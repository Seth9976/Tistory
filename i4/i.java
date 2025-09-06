package i4;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final Function1 A;
    public final int B;
    public final int C;
    public final int w;
    public final Object x;
    public final Object y;
    public final LifecycleOwner z;

    public i(Object object0, Object object1, LifecycleOwner lifecycleOwner0, Function1 function10, int v, int v1, int v2) {
        this.w = v2;
        this.x = object0;
        this.y = object1;
        this.z = lifecycleOwner0;
        this.A = function10;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            LifecycleEffectKt.LifecycleStartEffect(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        LifecycleEffectKt.LifecycleResumeEffect(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

