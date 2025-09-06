package androidx.compose.material.ripple;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A@\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/ui/node/DelegatableNode;", "createPlatformRippleNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "createPlatformRippleNode", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Ripple_androidKt {
    public static final boolean a;

    static {
        Ripple_androidKt.a = Intrinsics.areEqual(Build.DEVICE, "layoutlib");
    }

    public static final RippleContainer access$createAndAttachRippleContainerIfNeeded(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof RippleContainer) {
                return (RippleContainer)view0;
            }
        }
        RippleContainer rippleContainer0 = new RippleContainer(viewGroup0.getContext());
        viewGroup0.addView(rippleContainer0);
        return rippleContainer0;
    }

    public static final ViewGroup access$findNearestViewGroup(View view0) {
        while(!(view0 instanceof ViewGroup)) {
            ViewParent viewParent0 = view0.getParent();
            if(!(viewParent0 instanceof View)) {
                throw new IllegalArgumentException(("Couldn\'t find a valid parent for " + view0 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view0 = viewParent0;
        }
        return (ViewGroup)view0;
    }

    @NotNull
    public static final DelegatableNode createPlatformRippleNode-TDGSqEk(@NotNull InteractionSource interactionSource0, boolean z, float f, @NotNull ColorProducer colorProducer0, @NotNull Function0 function00) {
        return Ripple_androidKt.a ? new CommonRippleNode(interactionSource0, z, f, colorProducer0, function00, null) : new AndroidRippleNode(interactionSource0, z, f, colorProducer0, function00, null);
    }
}

