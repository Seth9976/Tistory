package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class gq extends Lambda implements Function2 {
    public final MutableState w;
    public final TimePickerState x;
    public final TimePickerColors y;
    public final MutableState z;

    public gq(MutableState mutableState0, TimePickerState timePickerState0, TimePickerColors timePickerColors0, MutableState mutableState1) {
        this.w = mutableState0;
        this.x = timePickerState0;
        this.y = timePickerColors0;
        this.z = mutableState1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306700887, v, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        MutableState mutableState0 = this.w;
        boolean z = composer0.changed(mutableState0);
        TimePickerState timePickerState0 = this.x;
        boolean z1 = composer0.changedInstance(timePickerState0);
        aq aq0 = composer0.rememberedValue();
        if(z || z1 || aq0 == Composer.Companion.getEmpty()) {
            aq0 = new aq(timePickerState0, mutableState0);
            composer0.updateRememberedValue(aq0);
        }
        Modifier modifier1 = KeyInputModifierKt.onKeyEvent(modifier$Companion0, aq0);
        TextFieldValue textFieldValue0 = TimePickerKt.access$TimeInputImpl$lambda$6(mutableState0);
        boolean z2 = composer0.changedInstance(timePickerState0);
        boolean z3 = composer0.changed(mutableState0);
        bq bq0 = composer0.rememberedValue();
        if(z2 || z3 || bq0 == Composer.Companion.getEmpty()) {
            bq0 = new bq(timePickerState0, mutableState0);
            composer0.updateRememberedValue(bq0);
        }
        KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 3, 6, null, null, null, 0x73, null);
        boolean z4 = composer0.changedInstance(timePickerState0);
        cq cq0 = composer0.rememberedValue();
        if(z4 || cq0 == Composer.Companion.getEmpty()) {
            cq0 = new cq(timePickerState0);
            composer0.updateRememberedValue(cq0);
        }
        KeyboardActions keyboardActions0 = new KeyboardActions(null, null, cq0, null, null, null, 59, null);
        TimePickerColors timePickerColors0 = this.y;
        TimePickerKt.access$TimePickerTextField-1vLObsk(modifier1, textFieldValue0, bq0, timePickerState0, 0, keyboardOptions0, keyboardActions0, this.y, composer0, 0x6000, 0);
        TimePickerKt.access$DisplaySeparator(SizeKt.size-VpY3zN4(modifier$Companion0, 24.0f, 0.0f), composer0, 6);
        MutableState mutableState1 = this.z;
        boolean z5 = composer0.changed(mutableState1);
        boolean z6 = composer0.changedInstance(timePickerState0);
        dq dq0 = composer0.rememberedValue();
        if(z5 || z6 || dq0 == Composer.Companion.getEmpty()) {
            dq0 = new dq(timePickerState0, mutableState1);
            composer0.updateRememberedValue(dq0);
        }
        Modifier modifier2 = KeyInputModifierKt.onPreviewKeyEvent(modifier$Companion0, dq0);
        TextFieldValue textFieldValue1 = TimePickerKt.access$TimeInputImpl$lambda$9(mutableState1);
        boolean z7 = composer0.changedInstance(timePickerState0);
        boolean z8 = composer0.changed(mutableState1);
        eq eq0 = composer0.rememberedValue();
        if(z7 || z8 || eq0 == Composer.Companion.getEmpty()) {
            eq0 = new eq(timePickerState0, mutableState1);
            composer0.updateRememberedValue(eq0);
        }
        KeyboardOptions keyboardOptions1 = new KeyboardOptions(0, null, 3, 7, null, null, null, 0x73, null);
        boolean z9 = composer0.changedInstance(timePickerState0);
        fq fq0 = composer0.rememberedValue();
        if(z9 || fq0 == Composer.Companion.getEmpty()) {
            fq0 = new fq(timePickerState0);
            composer0.updateRememberedValue(fq0);
        }
        TimePickerKt.access$TimePickerTextField-1vLObsk(modifier2, textFieldValue1, eq0, timePickerState0, 1, keyboardOptions1, new KeyboardActions(null, null, fq0, null, null, null, 59, null), timePickerColors0, composer0, 0x6000, 0);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

