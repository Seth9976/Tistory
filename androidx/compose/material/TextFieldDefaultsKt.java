package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000B\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001A\u00020\u00008\nX\u008A\u0084\u0002"}, d2 = {"", "focused", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,906:1\n81#2:907\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n894#1:907\n*E\n"})
public final class TextFieldDefaultsKt {
    public static final State access$animateBorderStrokeAsState-NuRrP5Q(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, float f, float f1, Composer composer0, int v) {
        State state2;
        composer0.startReplaceableGroup(0x41709F90);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x41709F90, v, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:892)");
        }
        State state0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer0, v >> 6 & 14);
        State state1 = textFieldColors0.indicatorColor(z, z1, interactionSource0, composer0, v & 0x1FFE);
        float f2 = ((Boolean)state0.getValue()).booleanValue() ? f : f1;
        if(z) {
            composer0.startReplaceableGroup(0x6479F2D6);
            state2 = AnimateAsStateKt.animateDpAsState-AjpBEmI(f2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceableGroup(0x6479F338);
            state2 = SnapshotStateKt.rememberUpdatedState(Dp.box-impl(f1), composer0, v >> 15 & 14);
        }
        composer0.endReplaceableGroup();
        State state3 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(((Dp)state2.getValue()).unbox-impl(), new SolidColor(((Color)state1.getValue()).unbox-impl(), null), null), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state3;
    }
}

