package androidx.compose.material.ripple;

import aa.l;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import u0.r;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH&¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0015\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u001D\u001A\u00020\r*\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "", "bounded", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/State;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "addRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlinx/coroutines/CoroutineScope;)V", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/foundation/interaction/Interaction;", "updateStateLayer$material_ripple_release", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/CoroutineScope;)V", "updateStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleIndicationInstance\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,556:1\n137#2:557\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleIndicationInstance\n*L\n308#1:557\n*E\n"})
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;
    public final boolean a;
    public final r b;

    public RippleIndicationInstance(boolean z, @NotNull State state0) {
        this.a = z;
        this.b = new r(z, new l(state0, 28));
    }

    public abstract void addRipple(@NotNull Press arg1, @NotNull CoroutineScope arg2);

    public final void drawStateLayer-H2RKhps(@NotNull DrawScope drawScope0, float f, long v) {
        float f1;
        if(Float.isNaN(f)) {
            long v1 = drawScope0.getSize-NH-jbRc();
            f1 = RippleAnimationKt.getRippleEndRadius-cSwnlzA(drawScope0, this.a, v1);
        }
        else {
            f1 = drawScope0.toPx-0680j_4(f);
        }
        this.b.a(drawScope0, f1, v);
    }

    public abstract void removeRipple(@NotNull Press arg1);

    public final void updateStateLayer$material_ripple_release(@NotNull Interaction interaction0, @NotNull CoroutineScope coroutineScope0) {
        this.b.b(interaction0, coroutineScope0);
    }
}

