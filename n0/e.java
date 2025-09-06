package n0;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final int w;
    public final long x;

    public e(long v, int v1) {
        this.w = v1;
        this.x = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return "Mouse.onDrag " + Offset.toString-impl(this.x);
            }
            case 1: {
                return "Touch.onDrag at " + Offset.toString-impl(this.x);
            }
            case 2: {
                return "Touch.onDragStart after longPress at " + Offset.toString-impl(this.x);
            }
            default: {
                return this.x;
            }
        }
    }
}

