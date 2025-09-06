package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class sp extends Lambda implements Function1 {
    public final MutableState w;
    public final MutableState x;

    public sp(MutableState mutableState0, MutableState mutableState1) {
        this.w = mutableState0;
        this.x = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LayoutCoordinates layoutCoordinates0 = ((LayoutCoordinates)object0).getParentCoordinates();
        long v = layoutCoordinates0 == null ? 0L : IntSizeKt.getCenter-ozmzZPI(layoutCoordinates0.getSize-YbymL2g());
        TimePickerKt.access$ClockText$lambda$33(this.w, v);
        long v1 = LayoutCoordinatesKt.boundsInParent(((LayoutCoordinates)object0)).getCenter-F1C5BW0();
        TimePickerKt.access$ClockText$lambda$30(this.x, v1);
        return Unit.INSTANCE;
    }
}

