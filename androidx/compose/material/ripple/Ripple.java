package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import u0.f;

@Stable
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJF\u0010\u0015\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u0006H\'ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00022\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "<init>", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedInstance", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,556:1\n77#2:557\n646#3:558\n1223#4,6:559\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n198#1:557\n200#1:558\n218#1:559,6\n*E\n"})
public abstract class Ripple implements Indication {
    public static final int $stable;
    public final boolean a;
    public final float b;
    public final State c;

    public Ripple(boolean z, float f, State state0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
        this.b = f;
        this.c = state0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Ripple)) {
            return false;
        }
        if(this.a != ((Ripple)object0).a) {
            return false;
        }
        return Dp.equals-impl0(this.b, ((Ripple)object0).b) ? Intrinsics.areEqual(this.c, ((Ripple)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + a.C(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.foundation.Indication
    @Composable
    @Deprecated(message = "Super method is deprecated")
    @NotNull
    public final IndicationInstance rememberUpdatedInstance(@NotNull InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        long v1;
        composer0.startReplaceGroup(0x3AEF0613);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AEF0613, v, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        RippleTheme rippleTheme0 = (RippleTheme)composer0.consume(RippleThemeKt.getLocalRippleTheme());
        State state0 = this.c;
        boolean z = false;
        if(Long.compare(((Color)state0.getValue()).unbox-impl(), 0L) == 0) {
            composer0.startReplaceGroup(-303521246);
            v1 = rippleTheme0.defaultColor-WaAFU9c(composer0, 0);
            composer0.endReplaceGroup();
        }
        else {
            composer0.startReplaceGroup(-303571590);
            composer0.endReplaceGroup();
            v1 = ((Color)state0.getValue()).unbox-impl();
        }
        State state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        State state2 = SnapshotStateKt.rememberUpdatedState(rippleTheme0.rippleAlpha(composer0, 0), composer0, 0);
        IndicationInstance indicationInstance0 = this.rememberUpdatedRippleInstance-942rkJo(interactionSource0, this.a, this.b, state1, state2, composer0, v & 14 | v << 12 & 0x70000);
        if((v & 14 ^ 6) > 4 && composer0.changed(interactionSource0) || (v & 6) == 4) {
            z = true;
        }
        boolean z1 = composer0.changedInstance(indicationInstance0);
        f f0 = composer0.rememberedValue();
        if(z1 || z || f0 == Composer.Companion.getEmpty()) {
            f0 = new f(interactionSource0, ((RippleIndicationInstance)indicationInstance0), null);
            composer0.updateRememberedValue(f0);
        }
        EffectsKt.LaunchedEffect(indicationInstance0, interactionSource0, f0, composer0, v << 3 & 0x70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return indicationInstance0;
    }

    @Composable
    @NotNull
    public abstract RippleIndicationInstance rememberUpdatedRippleInstance-942rkJo(@NotNull InteractionSource arg1, boolean arg2, float arg3, @NotNull State arg4, @NotNull State arg5, @Nullable Composer arg6, int arg7);
}

