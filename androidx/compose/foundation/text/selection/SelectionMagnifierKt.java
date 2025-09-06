package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001AJ\u0010\t\u001A\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\'\u0010\b\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\"&\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u001A\u0010\u0016\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\" \u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001E²\u0006\f\u0010\u0007\u001A\u00020\u00028\nX\u008A\u0084\u0002²\u0006\f\u0010\u001D\u001A\u00020\u00028\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedCenter", "platformMagnifier", "animatedSelectionMagnifier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "b", "Landroidx/compose/animation/core/TwoWayConverter;", "getUnspecifiedSafeOffsetVectorConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "getOffsetDisplacementThreshold", "()J", "OffsetDisplacementThreshold", "Landroidx/compose/animation/core/SpringSpec;", "d", "Landroidx/compose/animation/core/SpringSpec;", "getMagnifierSpringSpec", "()Landroidx/compose/animation/core/SpringSpec;", "MagnifierSpringSpec", "targetValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1223#2,6:110\n1223#2,6:116\n1223#2,6:122\n81#3:128\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n78#1:110,6\n79#1:116,6\n83#1:122,6\n78#1:128\n*E\n"})
public final class SelectionMagnifierKt {
    public static final AnimationVector2D a;
    public static final TwoWayConverter b;
    public static final long c;
    public static final SpringSpec d;

    static {
        SelectionMagnifierKt.a = new AnimationVector2D(NaNf, NaNf);
        SelectionMagnifierKt.b = VectorConvertersKt.TwoWayConverter(v0.x, v0.y);
        SelectionMagnifierKt.c = 0x3C23D70A3C23D70AL;
        SelectionMagnifierKt.d = new SpringSpec(0.0f, 0.0f, Offset.box-impl(0x3C23D70A3C23D70AL), 3, null);
    }

    public static final State access$rememberAnimatedMagnifierPosition(Function0 function00, Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA13DA64F, v, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        State state0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(function00);
            composer0.updateRememberedValue(state0);
        }
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == composer$Companion0.getEmpty()) {
            Offset offset0 = Offset.box-impl(((Offset)state0.getValue()).unbox-impl());
            Offset offset1 = Offset.box-impl(SelectionMagnifierKt.c);
            animatable0 = new Animatable(offset0, SelectionMagnifierKt.b, offset1, null, 8, null);
            composer0.updateRememberedValue(animatable0);
        }
        Unit unit0 = Unit.INSTANCE;
        boolean z = composer0.changedInstance(animatable0);
        z0 z00 = composer0.rememberedValue();
        if(z || z00 == composer$Companion0.getEmpty()) {
            z00 = new z0(state0, animatable0, null);
            composer0.updateRememberedValue(z00);
        }
        EffectsKt.LaunchedEffect(unit0, z00, composer0, 6);
        State state1 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state1;
    }

    public static final long access$rememberAnimatedMagnifierPosition$lambda$1(State state0) {
        return ((Offset)state0.getValue()).unbox-impl();
    }

    @NotNull
    public static final Modifier animatedSelectionMagnifier(@NotNull Modifier modifier0, @NotNull Function0 function00, @NotNull Function1 function10) {
        return ComposedModifierKt.composed$default(modifier0, null, new w0(0, function00, function10), 1, null);
    }

    @NotNull
    public static final SpringSpec getMagnifierSpringSpec() {
        return SelectionMagnifierKt.d;
    }

    public static final long getOffsetDisplacementThreshold() [...] // 潜在的解密器

    @NotNull
    public static final TwoWayConverter getUnspecifiedSafeOffsetVectorConverter() {
        return SelectionMagnifierKt.b;
    }
}

