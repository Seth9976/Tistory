package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class sq extends Lambda implements Function1 {
    public final AnalogTimePickerState w;
    public final TimePickerColors x;

    public sq(AnalogTimePickerState analogTimePickerState0, TimePickerColors timePickerColors0) {
        this.w = analogTimePickerState0;
        this.x = timePickerColors0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = OffsetKt.Offset(((ContentDrawScope)object0).toPx-0680j_4(DpOffset.getX-D9Ej5fM(TimePickerKt.getSelectorPos(this.w))), ((ContentDrawScope)object0).toPx-0680j_4(DpOffset.getY-D9Ej5fM(TimePickerKt.getSelectorPos(this.w))));
        float f = ((ContentDrawScope)object0).toPx-0680j_4(0.0f);
        long v1 = this.x.getSelectorColor-0d7_KjU();
        DrawScope.drawCircle-VaOC9Bg$default(((ContentDrawScope)object0), 0xFF00000000000000L, f / 2.0f, v, 0.0f, null, null, 0, 56, null);
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawCircle-VaOC9Bg$default(((ContentDrawScope)object0), v1, f / 2.0f, v, 0.0f, null, null, 11, 56, null);
        float f1 = ((ContentDrawScope)object0).toPx-0680j_4(0.0f);
        long v2 = Offset.minus-MK-Hz9U(v, OffsetKt.Offset(((float)Math.cos(this.w.getCurrentAngle())) * (f / 2.0f), ((float)Math.sin(this.w.getCurrentAngle())) * (f / 2.0f)));
        DrawScope.drawLine-NGM6Ib0$default(((ContentDrawScope)object0), v1, SizeKt.getCenter-uvyYCjk(((ContentDrawScope)object0).getSize-NH-jbRc()), v2, f1, 0, null, 0.0f, null, 3, 0xF0, null);
        DrawScope.drawCircle-VaOC9Bg$default(((ContentDrawScope)object0), v1, ((ContentDrawScope)object0).toPx-0680j_4(0.0f) / 2.0f, SizeKt.getCenter-uvyYCjk(((ContentDrawScope)object0).getSize-NH-jbRc()), 0.0f, null, null, 0, 120, null);
        DrawScope.drawCircle-VaOC9Bg$default(((ContentDrawScope)object0), this.x.clockDialContentColor-vNxB06k$material3_release(true), f / 2.0f, v, 0.0f, null, null, 4, 56, null);
        return Unit.INSTANCE;
    }
}

