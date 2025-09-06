package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class mp extends Lambda implements Function2 {
    public final TimePickerState w;
    public final TimePickerColors x;

    public mp(TimePickerState timePickerState0, TimePickerColors timePickerColors0) {
        this.w = timePickerState0;
        this.x = timePickerColors0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE3839F4B, v, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), ((Composer)object0), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        TimePickerKt.f(SizeKt.size-VpY3zN4(modifier$Companion0, 0.0f, 0.0f), TimePickerKt.getHourForDisplay(this.w), this.w, 0, this.x, ((Composer)object0), 0xC06);
        TimePickerKt.access$DisplaySeparator(SizeKt.size-VpY3zN4(modifier$Companion0, 24.0f, 0.0f), ((Composer)object0), 6);
        TimePickerKt.f(SizeKt.size-VpY3zN4(modifier$Companion0, 0.0f, 0.0f), this.w.getMinute(), this.w, 1, this.x, ((Composer)object0), 0xC06);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

