package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.material.ButtonElevation;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class w2 implements ButtonElevation {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public w2(float f, float f1, float f2, float f3, float f4) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override  // androidx.compose.material.ButtonElevation
    public final State elevation(boolean z, InteractionSource interactionSource0, Composer composer0, int v) {
        float f;
        composer0.startReplaceableGroup(-1588756907);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, v, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:504)");
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        SnapshotStateList snapshotStateList0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(snapshotStateList0 == composer$Companion0.getEmpty()) {
            snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
            composer0.updateRememberedValue(snapshotStateList0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xAD71CC4);
        boolean z1 = composer0.changed(interactionSource0);
        boolean z2 = composer0.changed(snapshotStateList0);
        u2 u20 = composer0.rememberedValue();
        if(z1 || z2 || u20 == composer$Companion0.getEmpty()) {
            u20 = new u2(interactionSource0, snapshotStateList0, null);
            composer0.updateRememberedValue(u20);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource0, u20, composer0, v >> 3 & 14 | 0x40);
        Object object0 = CollectionsKt___CollectionsKt.lastOrNull(snapshotStateList0);
        if(!z) {
            f = this.c;
        }
        else if(((Interaction)object0) instanceof Press) {
            f = this.b;
        }
        else if(((Interaction)object0) instanceof Enter) {
            f = this.d;
        }
        else {
            f = ((Interaction)object0) instanceof Focus ? this.e : this.a;
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = new Animatable(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer0.updateRememberedValue(animatable0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Dp.box-impl(f), new v2(animatable0, f, z, this, ((Interaction)object0), null), composer0, 0x40);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

