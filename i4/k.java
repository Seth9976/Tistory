package i4;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int w;
    public final Object[] x;
    public final LifecycleOwner y;
    public final Function1 z;

    public k(Object[] arr_object, LifecycleOwner lifecycleOwner0, Function1 function10, int v, int v1, int v2) {
        this.w = v2;
        this.x = arr_object;
        this.y = lifecycleOwner0;
        this.z = function10;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            LifecycleEffectKt.LifecycleStartEffect(Arrays.copyOf(this.x, this.x.length), this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        LifecycleEffectKt.LifecycleResumeEffect(Arrays.copyOf(this.x, this.x.length), this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
        return Unit.INSTANCE;
    }
}

