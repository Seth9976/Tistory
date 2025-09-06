package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001A\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3_release", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "shadowElevation", "tonalElevation-D9Ej5fM$material3_release", "()F", "tonalElevation", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n1223#2,6:703\n1223#2,6:709\n1223#2,6:715\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n*L\n528#1:703,6\n537#1:709,6\n546#1:715,6\n*E\n"})
public class FloatingActionButtonElevation {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public FloatingActionButtonElevation(float f, float f1, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof FloatingActionButtonElevation) || !Dp.equals-impl0(this.a, ((FloatingActionButtonElevation)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((FloatingActionButtonElevation)object0).b)) {
            return false;
        }
        return Dp.equals-impl0(this.c, ((FloatingActionButtonElevation)object0).c) ? Dp.equals-impl0(this.d, ((FloatingActionButtonElevation)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.d) + a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Composable
    @NotNull
    public final State shadowElevation$material3_release(@NotNull InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, v, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:516)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, v & 0x7E, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:525)");
        }
        int v1 = v & 14 ^ 6;
        boolean z = false;
        boolean z1 = v1 > 4 && composer0.changed(interactionSource0) || (v & 6) == 4;
        ma ma0 = composer0.rememberedValue();
        if(z1 || ma0 == Composer.Companion.getEmpty()) {
            ma0 = new ma(this.a, this.b, this.d, this.c);
            composer0.updateRememberedValue(ma0);
        }
        boolean z2 = composer0.changedInstance(ma0);
        boolean z3 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(this) || (v & 0x30) == 0x20;
        ga ga0 = composer0.rememberedValue();
        if(z2 || z3 || ga0 == Composer.Companion.getEmpty()) {
            ga0 = new ga(ma0, this, null);
            composer0.updateRememberedValue(ga0);
        }
        EffectsKt.LaunchedEffect(this, ga0, composer0, (v & 0x7E) >> 3 & 14);
        if(v1 > 4 && composer0.changed(interactionSource0) || (v & 6) == 4) {
            z = true;
        }
        boolean z4 = composer0.changedInstance(ma0);
        ja ja0 = composer0.rememberedValue();
        if(z4 || z || ja0 == Composer.Companion.getEmpty()) {
            ja0 = new ja(interactionSource0, ma0, null);
            composer0.updateRememberedValue(ja0);
        }
        EffectsKt.LaunchedEffect(interactionSource0, ja0, composer0, v & 14);
        State state0 = ma0.e.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    public final float tonalElevation-D9Ej5fM$material3_release() {
        return this.a;
    }
}

