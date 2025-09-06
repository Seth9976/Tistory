package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001AA\u0010\t\u001A\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001A\u00020\u00012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", "target", "Landroidx/compose/foundation/interaction/Interaction;", "from", "to", "", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateElevation", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ElevationKt {
    public static final TweenSpec a;
    public static final TweenSpec b;
    public static final TweenSpec c;

    static {
        ElevationKt.a = new TweenSpec(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        ElevationKt.b = new TweenSpec(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
        ElevationKt.c = new TweenSpec(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    }

    @Nullable
    public static final Object animateElevation-rAjV9yQ(@NotNull Animatable animatable0, float f, @Nullable Interaction interaction0, @Nullable Interaction interaction1, @NotNull Continuation continuation0) {
        TweenSpec tweenSpec0 = null;
        if(interaction1 == null) {
            if(interaction0 != null) {
                if(interaction0 instanceof Press) {
                    tweenSpec0 = ElevationKt.b;
                }
                else if(interaction0 instanceof Start) {
                    tweenSpec0 = ElevationKt.b;
                }
                else if(interaction0 instanceof Enter) {
                    tweenSpec0 = ElevationKt.c;
                }
                else if(interaction0 instanceof Focus) {
                    tweenSpec0 = ElevationKt.b;
                }
            }
        }
        else if(interaction1 instanceof Press) {
            tweenSpec0 = ElevationKt.a;
        }
        else if(interaction1 instanceof Start) {
            tweenSpec0 = ElevationKt.a;
        }
        else if(interaction1 instanceof Enter) {
            tweenSpec0 = ElevationKt.a;
        }
        else if(interaction1 instanceof Focus) {
            tweenSpec0 = ElevationKt.a;
        }
        if(tweenSpec0 != null) {
            Object object0 = Animatable.animateTo$default(animatable0, Dp.box-impl(f), tweenSpec0, null, null, continuation0, 12, null);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        Object object1 = animatable0.snapTo(Dp.box-impl(f), continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object animateElevation-rAjV9yQ$default(Animatable animatable0, float f, Interaction interaction0, Interaction interaction1, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            interaction0 = null;
        }
        if((v & 4) != 0) {
            interaction1 = null;
        }
        return ElevationKt.animateElevation-rAjV9yQ(animatable0, f, interaction0, interaction1, continuation0);
    }
}

