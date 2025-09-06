package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction.Start;
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
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
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

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u000B2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001D\u0010\u001A\u001A\u0004\b\u001E\u0010\u001CR\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001F\u0010\u001A\u001A\u0004\b \u0010\u001CR\u001D\u0010\u0006\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001A\u001A\u0004\b\"\u0010\u001CR\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001A\u001A\u0004\b$\u0010\u001CR\u001D\u0010\b\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u001A\u001A\u0004\b&\u0010\u001C\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006)²\u0006\u0010\u0010(\u001A\u0004\u0018\u00010\'8\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/material3/ChipElevation;", "", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3_release", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "shadowElevation", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "getElevation-D9Ej5fM", "()F", "b", "getPressedElevation-D9Ej5fM", "c", "getFocusedElevation-D9Ej5fM", "d", "getHoveredElevation-D9Ej5fM", "e", "getDraggedElevation-D9Ej5fM", "f", "getDisabledElevation-D9Ej5fM", "Landroidx/compose/foundation/interaction/Interaction;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2787:1\n1223#2,6:2788\n1223#2,6:2794\n1223#2,6:2800\n1223#2,6:2806\n1223#2,6:2812\n81#3:2818\n107#3,2:2819\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipElevation\n*L\n2181#1:2788,6\n2182#1:2794,6\n2183#1:2800,6\n2235#1:2806,6\n2237#1:2812,6\n2182#1:2818\n2182#1:2819,2\n*E\n"})
public final class ChipElevation {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ChipElevation(float f, float f1, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public static final Interaction access$animateElevation$lambda$2(MutableState mutableState0) {
        return (Interaction)mutableState0.getValue();
    }

    public static final void access$animateElevation$lambda$3(MutableState mutableState0, Interaction interaction0) {
        mutableState0.setValue(interaction0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof ChipElevation) || !Dp.equals-impl0(this.a, ((ChipElevation)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((ChipElevation)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((ChipElevation)object0).c)) {
            return false;
        }
        return Dp.equals-impl0(this.d, ((ChipElevation)object0).d) ? Dp.equals-impl0(this.f, ((ChipElevation)object0).f) : false;
    }

    public final float getDisabledElevation-D9Ej5fM() {
        return this.f;
    }

    public final float getDraggedElevation-D9Ej5fM() {
        return this.e;
    }

    public final float getElevation-D9Ej5fM() {
        return this.a;
    }

    public final float getFocusedElevation-D9Ej5fM() {
        return this.c;
    }

    public final float getHoveredElevation-D9Ej5fM() {
        return this.d;
    }

    public final float getPressedElevation-D9Ej5fM() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.f) + a.C(this.d, a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Composable
    @NotNull
    public final State shadowElevation$material3_release(boolean z, @NotNull InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        float f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x702B2A93, v, -1, "androidx.compose.material3.ChipElevation.shadowElevation (Chip.kt:2171)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2071499570, v & 0x3FE, -1, "androidx.compose.material3.ChipElevation.animateElevation (Chip.kt:2179)");
        }
        SnapshotStateList snapshotStateList0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(snapshotStateList0 == composer$Companion0.getEmpty()) {
            snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
            composer0.updateRememberedValue(snapshotStateList0);
        }
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        int v1 = 1;
        boolean z1 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(interactionSource0) || (v & 0x30) == 0x20;
        k3 k30 = composer0.rememberedValue();
        if(z1 || k30 == composer$Companion0.getEmpty()) {
            k30 = new k3(interactionSource0, snapshotStateList0, null);
            composer0.updateRememberedValue(k30);
        }
        EffectsKt.LaunchedEffect(interactionSource0, k30, composer0, (v & 0x3FE) >> 3 & 14);
        Object object0 = CollectionsKt___CollectionsKt.lastOrNull(snapshotStateList0);
        if(!z) {
            f = this.f;
        }
        else if(((Interaction)object0) instanceof Press) {
            f = this.b;
        }
        else if(((Interaction)object0) instanceof Enter) {
            f = this.d;
        }
        else if(((Interaction)object0) instanceof Focus) {
            f = this.c;
        }
        else {
            f = ((Interaction)object0) instanceof Start ? this.e : this.a;
        }
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = new Animatable(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer0.updateRememberedValue(animatable0);
        }
        Dp dp0 = Dp.box-impl(f);
        boolean z2 = composer0.changedInstance(animatable0);
        boolean z3 = composer0.changed(f);
        if(((v & 14 ^ 6) <= 4 || !composer0.changed(z)) && (v & 6) != 4) {
            v1 = 0;
        }
        boolean z4 = composer0.changedInstance(((Interaction)object0));
        l3 l30 = composer0.rememberedValue();
        if((z2 | z3 | v1 | z4) != 0 || l30 == composer$Companion0.getEmpty()) {
            l3 l31 = new l3(animatable0, f, z, ((Interaction)object0), mutableState0, null);
            composer0.updateRememberedValue(l31);
            l30 = l31;
        }
        EffectsKt.LaunchedEffect(dp0, l30, composer0, 0);
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

