package i4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final LifecycleOwner A;
    public final Function1 B;
    public final int C;
    public final int D;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public j(Object object0, Object object1, Object object2, LifecycleOwner lifecycleOwner0, Function1 function10, int v, int v1, int v2) {
        this.w = v2;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = lifecycleOwner0;
        this.B = function10;
        this.C = v;
        this.D = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            LifecycleEffectKt.LifecycleStartEffect(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.C | 1), this.D);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        LifecycleEffectKt.LifecycleResumeEffect(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.C | 1), this.D);
        return Unit.INSTANCE;
    }
}

