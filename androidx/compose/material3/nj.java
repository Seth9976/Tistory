package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class nj extends Lambda implements Function0 {
    public final int w;
    public final Animatable x;

    public nj(Animatable animatable0, int v) {
        this.w = v;
        this.x = animatable0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? ((Number)this.x.getValue()).floatValue() == 1.0f : ((Number)this.x.getValue()).floatValue() > 0.0f;
    }
}

