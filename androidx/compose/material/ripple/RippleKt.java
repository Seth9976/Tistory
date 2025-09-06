package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A>\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A0\u0010\u0013\u001A\u00020\u00102\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/ui/node/DelegatableNode;", "createRippleModifierNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "createRippleModifierNode", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/Indication;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "rememberRipple", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,556:1\n1223#2,6:557\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n149#1:557,6\n*E\n"})
public final class RippleKt {
    public static final TweenSpec a;

    static {
        RippleKt.a = new TweenSpec(15, 0, EasingKt.getLinearEasing(), 2, null);
    }

    public static final AnimationSpec access$incomingStateLayerAnimationSpecFor(Interaction interaction0) {
        AnimationSpec animationSpec0 = RippleKt.a;
        if(!(interaction0 instanceof Enter)) {
            if(interaction0 instanceof Focus) {
                return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
            }
            if(interaction0 instanceof Start) {
                return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
            }
        }
        return animationSpec0;
    }

    public static final AnimationSpec access$outgoingStateLayerAnimationSpecFor(Interaction interaction0) {
        AnimationSpec animationSpec0 = RippleKt.a;
        return !(interaction0 instanceof Enter) && !(interaction0 instanceof Focus) && interaction0 instanceof Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : animationSpec0;
    }

    @NotNull
    public static final DelegatableNode createRippleModifierNode-TDGSqEk(@NotNull InteractionSource interactionSource0, boolean z, float f, @NotNull ColorProducer colorProducer0, @NotNull Function0 function00) {
        return Ripple_androidKt.createPlatformRippleNode-TDGSqEk(interactionSource0, z, f, colorProducer0, function00);
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "rememberRipple has been deprecated - it returns an old Indication implementation that is not compatible with the new Indication APIs that provide notable performance improvements. Instead, use the new ripple APIs provided by design system libraries, such as material and material3. If you are implementing your own design system library, use createRippleNode to create your own custom ripple implementation that queries your own theme values. For a migration guide and background information, please visit developer.android.com")
    @NotNull
    public static final Indication rememberRipple-9IZ8Weo(boolean z, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        int v3 = 1;
        if((v2 & 1) != 0) {
            z = true;
        }
        if((v2 & 2) != 0) {
            f = NaNf;
        }
        if((v2 & 4) != 0) {
            v = 0L;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x61769D80, v1, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v), composer0, v1 >> 6 & 14);
        int v4 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(z)) && (v1 & 6) != 4 ? 0 : 1;
        if(((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(f)) && (v1 & 0x30) != 0x20) {
            v3 = 0;
        }
        PlatformRipple platformRipple0 = composer0.rememberedValue();
        if((v4 | v3) != 0 || platformRipple0 == Composer.Companion.getEmpty()) {
            platformRipple0 = new PlatformRipple(z, f, state0, null);
            composer0.updateRememberedValue(platformRipple0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformRipple0;
    }
}

