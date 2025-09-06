package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJF\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0007H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,381:1\n77#2:382\n1223#3,6:383\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n94#1:382\n95#1:383,6\n*E\n"})
public final class PlatformRipple extends Ripple {
    public static final int $stable;

    public PlatformRipple(boolean z, float f, State state0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(z, f, state0, null);
    }

    @Override  // androidx.compose.material.ripple.Ripple
    @Composable
    @NotNull
    public RippleIndicationInstance rememberUpdatedRippleInstance-942rkJo(@NotNull InteractionSource interactionSource0, boolean z, float f, @NotNull State state0, @NotNull State state1, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x13BE9E37);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x13BE9E37, v, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        ViewGroup viewGroup0 = Ripple_androidKt.access$findNearestViewGroup(((View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView())));
        int v1 = 0;
        int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(interactionSource0)) && (v & 6) != 4 ? 0 : 1;
        if((0x70000 & v ^ 0x30000) > 0x20000 && composer0.changed(this) || (v & 0x30000) == 0x20000) {
            v1 = 1;
        }
        boolean z1 = composer0.changed(viewGroup0);
        AndroidRippleIndicationInstance androidRippleIndicationInstance0 = composer0.rememberedValue();
        if((v2 | v1 | z1) != 0 || androidRippleIndicationInstance0 == Composer.Companion.getEmpty()) {
            androidRippleIndicationInstance0 = new AndroidRippleIndicationInstance(z, f, state0, state1, viewGroup0, null);
            composer0.updateRememberedValue(androidRippleIndicationInstance0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return androidRippleIndicationInstance0;
    }
}

