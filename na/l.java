package na;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.preview.PinchZoomImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class l extends Lambda implements Function4 {
    public final MutableState A;
    public final MutableState w;
    public final MutableState x;
    public final MutableState y;
    public final MutableState z;

    public l(MutableState mutableState0, MutableState mutableState1, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.w = mutableState0;
        this.x = mutableState1;
        this.y = mutableState2;
        this.z = mutableState3;
        this.A = mutableState4;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object3).floatValue();
        float f = c.coerceIn(PinchZoomImageKt.access$PinchZoomImage$lambda$3(this.w) * ((Number)object2).floatValue(), 1.0f, 5.0f);
        float f1 = f - PinchZoomImageKt.access$PinchZoomImage$lambda$3(this.w);
        long v = Float.compare(f1, 0.0f) == 0 ? PinchZoomImageKt.access$moveImage-YqVAtuI(PinchZoomImageKt.access$PinchZoomImage$lambda$3(this.w), ((Offset)object1).unbox-impl(), PinchZoomImageKt.access$PinchZoomImage$lambda$17(this.x), PinchZoomImageKt.access$PinchZoomImage$lambda$11(this.y), PinchZoomImageKt.access$PinchZoomImage$lambda$14(this.z)) : PinchZoomImageKt.access$scaleAndMoveImage-pGV3PM0(f1, f, ((Offset)object0).unbox-impl(), PinchZoomImageKt.access$PinchZoomImage$lambda$7(this.A), PinchZoomImageKt.access$PinchZoomImage$lambda$11(this.y), PinchZoomImageKt.access$PinchZoomImage$lambda$14(this.z));
        PinchZoomImageKt.access$PinchZoomImage$lambda$4(this.w, f);
        PinchZoomImageKt.access$PinchZoomImage$lambda$8(this.A, Offset.plus-MK-Hz9U(PinchZoomImageKt.access$PinchZoomImage$lambda$7(this.A), v));
        return Unit.INSTANCE;
    }
}

