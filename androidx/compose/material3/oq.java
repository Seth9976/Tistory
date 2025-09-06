package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class oq extends Lambda implements Function2 {
    public final int w;
    public final TimePickerState x;
    public final int y;
    public final long z;

    public oq(int v, TimePickerState timePickerState0, int v1, long v2) {
        this.w = v;
        this.x = timePickerState0;
        this.y = v1;
        this.z = v2;
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
            ComposerKt.traceEventStart(0xA7F27559, v, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
        }
        boolean z = this.x.is24hour();
        String s = TimePickerKt.numberContentDescription-dSwYdS4(this.w, z, this.y, ((Composer)object0), 0);
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
        boolean z1 = ((Composer)object0).changed(s);
        m m0 = ((Composer)object0).rememberedValue();
        if(z1 || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(s, 10);
            ((Composer)object0).updateRememberedValue(m0);
        }
        Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, m0, 1, null);
        TextKt.Text--4IGK_g(CalendarLocale_jvmKt.toLocalString$default(this.y, 2, 0, false, 6, null), modifier1, this.z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFF8);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

