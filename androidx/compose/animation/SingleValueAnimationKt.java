package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AR\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001AH\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u00022\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A$\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000F\u001A\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/State;", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColorAsState", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "initialValue", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "Animatable", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n1223#2,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:112,6\n*E\n"})
public final class SingleValueAnimationKt {
    public static final SpringSpec a;

    static {
        SingleValueAnimationKt.a = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    }

    @NotNull
    public static final Animatable Animatable-8_81llA(long v) {
        return new Animatable(Color.box-impl(v), ((TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.getColorSpace-impl(v))), null, null, 12, null);
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateColorAsState-KTwxG1Y(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = SingleValueAnimationKt.a;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, v1, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:79)");
        }
        State state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v, animationSpec0, null, function10, composer0, v1 & 0x7E | v1 << 3 & 0x1C00, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateColorAsState-euL9pac(long v, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : SingleValueAnimationKt.a;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE510911C, v1, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean z = composer0.changed(Color.getColorSpace-impl(v));
        TwoWayConverter twoWayConverter0 = composer0.rememberedValue();
        if(z || twoWayConverter0 == Composer.Companion.getEmpty()) {
            ColorSpace colorSpace0 = Color.getColorSpace-impl(v);
            twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace0);
            composer0.updateRememberedValue(twoWayConverter0);
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Color.box-impl(v), twoWayConverter0, animationSpec1, null, ((v2 & 4) == 0 ? s : "ColorAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }
}

