package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class uq extends Lambda implements Function0 {
    public final int w;
    public final int x;
    public final boolean y;

    public uq(int v, int v1, boolean z) {
        this.w = v;
        this.x = v1;
        this.y = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new vq(this.w, this.x, this.y);
    }
}

