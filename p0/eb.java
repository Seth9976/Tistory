package p0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class eb extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final MutableState y;

    public eb(float f, MutableState mutableState0, int v) {
        this.w = v;
        this.x = f;
        this.y = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            long v = ((Size)object0).unbox-impl();
            float f = Size.getWidth-impl(v) * this.x;
            float f1 = Size.getHeight-impl(v) * this.x;
            MutableState mutableState0 = this.y;
            if(Size.getWidth-impl(((Size)mutableState0.getValue()).unbox-impl()) != f || Size.getHeight-impl(((Size)mutableState0.getValue()).unbox-impl()) != f1) {
                mutableState0.setValue(Size.box-impl(SizeKt.Size(f, f1)));
            }
            return Unit.INSTANCE;
        }
        long v1 = ((Size)object0).unbox-impl();
        float f2 = Size.getWidth-impl(v1) * this.x;
        float f3 = Size.getHeight-impl(v1) * this.x;
        MutableState mutableState1 = this.y;
        if(Size.getWidth-impl(((Size)mutableState1.getValue()).unbox-impl()) != f2 || Size.getHeight-impl(((Size)mutableState1.getValue()).unbox-impl()) != f3) {
            mutableState1.setValue(Size.box-impl(SizeKt.Size(f2, f3)));
        }
        return Unit.INSTANCE;
    }
}

