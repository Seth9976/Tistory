package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class jk extends Lambda implements Function1 {
    public final int w;
    public final Density x;

    public jk(Density density0, int v) {
        this.w = v;
        this.x = density0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((Number)object0).floatValue();
            return this.x.toPx-0680j_4(56.0f);
        }
        ((Number)object0).floatValue();
        return this.x.toPx-0680j_4(56.0f);
    }
}

