package na;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.kakao.kandinsky.preview.PinchZoomImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final MutableState w;
    public final MutableState x;
    public final MutableState y;

    public k(MutableState mutableState0, MutableState mutableState1, MutableState mutableState2) {
        this.w = mutableState0;
        this.x = mutableState1;
        this.y = mutableState2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Rect rect0;
        Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
        LayoutCoordinates layoutCoordinates0 = ((LayoutCoordinates)object0).getParentLayoutCoordinates();
        if(layoutCoordinates0 == null) {
            rect0 = Rect.Companion.getZero();
        }
        else {
            rect0 = LayoutCoordinatesKt.boundsInParent(layoutCoordinates0);
            if(rect0 == null) {
                rect0 = Rect.Companion.getZero();
            }
        }
        PinchZoomImageKt.access$PinchZoomImage$lambda$18(this.w, rect0);
        MutableState mutableState0 = this.x;
        if(Intrinsics.areEqual(PinchZoomImageKt.access$PinchZoomImage$lambda$14(mutableState0), Rect.Companion.getZero())) {
            PinchZoomImageKt.access$PinchZoomImage$lambda$15(mutableState0, LayoutCoordinatesKt.boundsInParent(((LayoutCoordinates)object0)));
        }
        Rect rect1 = LayoutCoordinatesKt.boundsInParent(((LayoutCoordinates)object0));
        PinchZoomImageKt.access$PinchZoomImage$lambda$12(this.y, rect1);
        return Unit.INSTANCE;
    }
}

