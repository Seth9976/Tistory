package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.material.ChipColors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p0.j2;

public final class qp extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public qp(TimePickerColors timePickerColors0, IntList intList0, AnalogTimePickerState analogTimePickerState0, boolean z) {
        this.w = 0;
        this.y = timePickerColors0;
        this.z = intList0;
        this.A = analogTimePickerState0;
        this.x = z;
        super(2);
    }

    public qp(Function2 function20, ChipColors chipColors0, boolean z, Function3 function30) {
        this.w = 1;
        this.y = function20;
        this.z = chipColors0;
        this.x = z;
        this.A = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x27C9C90F, v, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:111)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getBody2(), ComposableLambdaKt.composableLambda(((Composer)object0), 0xBC930C80, true, new j2(((Function2)this.y), ((ChipColors)this.z), this.x, ((Function3)this.A))), ((Composer)object0), 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xECE87D10, v1, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
        }
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((TimePickerColors)this.y).clockDialContentColor-vNxB06k$material3_release(false))), ComposableLambdaKt.rememberComposableLambda(1992872400, true, new pp(((IntList)this.z), ((AnalogTimePickerState)this.A), this.x), ((Composer)object0), 54), ((Composer)object0), ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

