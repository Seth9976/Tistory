package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function0 {
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public z0(float f, float f1, float f2, int v) {
        this.w = v;
        this.x = f;
        this.y = f1;
        this.z = f2;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? new TopAppBarState(this.x, this.y, this.z) : AppBarKt.BottomAppBarState(this.x, this.y, this.z);
    }
}

