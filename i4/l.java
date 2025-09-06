package i4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final LifecycleOwner x;
    public final Function1 y;
    public final int z;

    public l(LifecycleOwner lifecycleOwner0, Function1 function10, int v, int v1, int v2) {
        this.w = v2;
        this.x = lifecycleOwner0;
        this.y = function10;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            LifecycleEffectKt.LifecycleStartEffect(this.x, this.y, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.z | 1), this.A);
            return Unit.INSTANCE;
        }
        LifecycleEffectKt.LifecycleResumeEffect(this.x, this.y, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.z | 1), this.A);
        return Unit.INSTANCE;
    }
}

