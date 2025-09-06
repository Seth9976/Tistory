package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A]\u0010\u000B\u001A\u00020\u0000*\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012:\b\u0002\u0010\n\u001A4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000B\u0010\f\u001Ag\u0010\u000B\u001A\u00020\u0000*\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u000E\u001A\u00020\r2:\b\u0002\u0010\n\u001A4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000B\u0010\u000F\"\u001A\u0010\u0014\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0018\u001A\u00020\u0015*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "finishedListener", "animateContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "alignment", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "a", "J", "getInvalidSize", "()J", "InvalidSize", "", "isValid-ozmzZPI", "(J)Z", "isValid", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationModifierKt {
    public static final long a;

    static {
        AnimationModifierKt.a = 0x8000000080000000L;
    }

    @NotNull
    public static final Modifier animateContentSize(@NotNull Modifier modifier0, @NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Alignment alignment0, @Nullable Function2 function20) {
        return ClipKt.clipToBounds(modifier0).then(new SizeAnimationModifierElement(finiteAnimationSpec0, alignment0, function20));
    }

    @NotNull
    public static final Modifier animateContentSize(@NotNull Modifier modifier0, @NotNull FiniteAnimationSpec finiteAnimationSpec0, @Nullable Function2 function20) {
        return ClipKt.clipToBounds(modifier0).then(new SizeAnimationModifierElement(finiteAnimationSpec0, Alignment.Companion.getTopStart(), function20));
    }

    public static Modifier animateContentSize$default(Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, Alignment alignment0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.Companion.getTopStart();
        }
        if((v & 4) != 0) {
            function20 = null;
        }
        return AnimationModifierKt.animateContentSize(modifier0, finiteAnimationSpec0, alignment0, function20);
    }

    public static Modifier animateContentSize$default(Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.box-impl(0x100000001L), 1, null);
        }
        if((v & 2) != 0) {
            function20 = null;
        }
        return AnimationModifierKt.animateContentSize(modifier0, finiteAnimationSpec0, function20);
    }

    public static final long getInvalidSize() [...] // 潜在的解密器

    public static final boolean isValid-ozmzZPI(long v) {
        return !IntSize.equals-impl0(v, AnimationModifierKt.a);
    }
}

