package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Stable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\n2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3_release", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "shadowElevation", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1108:1\n1223#2,6:1109\n1223#2,6:1115\n1223#2,6:1121\n1223#2,6:1127\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n*L\n940#1:1109,6\n941#1:1115,6\n983#1:1121,6\n985#1:1127,6\n*E\n"})
public final class ButtonElevation {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ButtonElevation(float f, float f1, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof ButtonElevation) || !Dp.equals-impl0(this.a, ((ButtonElevation)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((ButtonElevation)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((ButtonElevation)object0).c)) {
            return false;
        }
        return Dp.equals-impl0(this.d, ((ButtonElevation)object0).d) ? Dp.equals-impl0(this.e, ((ButtonElevation)object0).e) : false;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.e) + a.C(this.d, a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Composable
    @NotNull
    public final State shadowElevation$material3_release(boolean z, @NotNull InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        float f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045116089, v, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB1C4AE02, v & 0x3FE, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)");
        }
        SnapshotStateList snapshotStateList0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(snapshotStateList0 == composer$Companion0.getEmpty()) {
            snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
            composer0.updateRememberedValue(snapshotStateList0);
        }
        int v1 = 1;
        boolean z1 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(interactionSource0) || (v & 0x30) == 0x20;
        i2 i20 = composer0.rememberedValue();
        if(z1 || i20 == composer$Companion0.getEmpty()) {
            i20 = new i2(interactionSource0, snapshotStateList0, null);
            composer0.updateRememberedValue(i20);
        }
        EffectsKt.LaunchedEffect(interactionSource0, i20, composer0, (v & 0x3FE) >> 3 & 14);
        Object object0 = CollectionsKt___CollectionsKt.lastOrNull(snapshotStateList0);
        if(!z) {
            f = this.e;
        }
        else if(((Interaction)object0) instanceof Press) {
            f = this.b;
        }
        else if(((Interaction)object0) instanceof Enter) {
            f = this.d;
        }
        else {
            f = ((Interaction)object0) instanceof Focus ? this.c : this.a;
        }
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = new Animatable(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer0.updateRememberedValue(animatable0);
        }
        Dp dp0 = Dp.box-impl(f);
        boolean z2 = composer0.changedInstance(animatable0);
        boolean z3 = composer0.changed(f);
        int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(z)) && (v & 6) != 4 ? 0 : 1;
        if(((v & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(this)) && (v & 0x180) != 0x100) {
            v1 = 0;
        }
        boolean z4 = composer0.changedInstance(((Interaction)object0));
        j2 j20 = composer0.rememberedValue();
        if((z2 | z3 | v2 | v1 | z4) != 0 || j20 == composer$Companion0.getEmpty()) {
            j2 j21 = new j2(animatable0, f, z, this, ((Interaction)object0), null);
            composer0.updateRememberedValue(j21);
            j20 = j21;
        }
        EffectsKt.LaunchedEffect(dp0, j20, composer0, 0);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }
}

