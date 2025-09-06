package p0;

import androidx.compose.material.BottomSheetValue;
import androidx.compose.material.DraggableAnchorsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final float y;

    public t1(int v, float f, float f1) {
        this.w = v;
        this.x = f;
        this.y = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = (float)this.w;
        ((DraggableAnchorsConfig)object0).at(BottomSheetValue.Collapsed, f - this.x);
        float f1 = this.y;
        if(f1 > 0.0f && f1 != this.x) {
            ((DraggableAnchorsConfig)object0).at(BottomSheetValue.Expanded, f - f1);
        }
        return Unit.INSTANCE;
    }
}

