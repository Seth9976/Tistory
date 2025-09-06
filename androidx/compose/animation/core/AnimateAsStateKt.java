package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;
import t.f;

@Metadata(d1 = {"\u0000l\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001AY\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\u000B\u0010\f\u001AR\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001A\u00020\r2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001AR\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001A\u00020\u00112\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001AR\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001A\u00020\u00152\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0013\u001AO\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001A\u00020\u00182\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001AO\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\n2\u0006\u0010\u0001\u001A\u00020\u001B2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u001B0\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001AR\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001E0\n2\u0006\u0010\u0001\u001A\u00020\u001E2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u001E0\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u0013\u001AR\u0010#\u001A\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001A\u00020!2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\u0013\u001A\u007F\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001A\u00028\u00002\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\'2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b)\u0010*\u001AO\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00002\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\u000B\u0010+\u001AH\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001A\u00020\r2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-\u001AH\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001A\u00020\u00112\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00110\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/\u001AH\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001A\u00020\u00152\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00150\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u0010/\u001AE\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001A\u00020\u00182\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00180\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\u0019\u00101\u001AE\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\n2\u0006\u0010\u0001\u001A\u00020\u001B2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u001B0\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\u001C\u00102\u001AH\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001E0\n2\u0006\u0010\u0001\u001A\u00020\u001E2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u001E0\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u0010/\u001AH\u0010#\u001A\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001A\u00020!2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020!0\u00022\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u0010/\u001Au\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001A\u00028\u00002\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\'2\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b)\u00105\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00068\u00B2\u0006*\u00106\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%8\nX\u008A\u0084\u0002\u00B2\u0006\"\u00107\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%8\nX\u008A\u0084\u0002"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/State;", "animateFloatAsState", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-YLp_XPw", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-7362WCg", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Rect;", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-HyPO7BM", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-4goxYXU", "animateIntSizeAsState", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "animateValueAsState", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateOffsetAsState-N6fFfp4", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-8f6pmRE", "animateIntSizeAsState-zTRF_AQ", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "listener", "animSpec", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n1223#2,6:585\n1223#2,6:591\n1223#2,6:597\n1223#2,6:603\n1223#2,6:609\n1223#2,6:615\n1223#2,6:621\n1223#2,6:627\n81#3:633\n81#3:634\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585,6\n394#1:591,6\n400#1:597,6\n401#1:603,6\n414#1:609,6\n415#1:615,6\n418#1:621,6\n573#1:627,6\n402#1:633\n403#1:634\n*E\n"})
public final class AnimateAsStateKt {
    public static final SpringSpec a;
    public static final SpringSpec b;
    public static final SpringSpec c;
    public static final SpringSpec d;
    public static final SpringSpec e;
    public static final SpringSpec f;
    public static final SpringSpec g;
    public static final SpringSpec h;

    static {
        AnimateAsStateKt.a = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        AnimateAsStateKt.b = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.box-impl(0.1f), 3, null);
        AnimateAsStateKt.c = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.box-impl(0x3F0000003F000000L), 3, null);
        AnimateAsStateKt.d = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.box-impl(0x3F0000003F000000L), 3, null);
        AnimateAsStateKt.e = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
        AnimateAsStateKt.f = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
        AnimateAsStateKt.g = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.box-impl(0x100000001L), 3, null);
        AnimateAsStateKt.h = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.box-impl(0x100000001L), 3, null);
    }

    public static final Function1 access$animateValueAsState$lambda$4(State state0) {
        return (Function1)state0.getValue();
    }

    public static final AnimationSpec access$animateValueAsState$lambda$6(State state0) {
        return (AnimationSpec)state0.getValue();
    }

    @Composable
    @NotNull
    public static final State animateDpAsState-AjpBEmI(float f, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.b;
        }
        if((v1 & 4) != 0) {
            s = "DpAnimation";
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, v, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec0, null, s, function10, composer0, v & 14 | v << 3 & 0x380 | 0xE000 & v << 6 | v << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateDpAsState-Kz89ssw(float f, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.b;
        }
        if((v1 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, v, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec0, null, null, function10, composer0, v & 14 | v << 3 & 0x380 | v << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateFloatAsState(float f, @Nullable AnimationSpec animationSpec0, float f1, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        AnimationSpec animationSpec2;
        SpringSpec springSpec0 = AnimateAsStateKt.a;
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : springSpec0;
        float f2 = (v1 & 4) == 0 ? f1 : 0.01f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, v, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if(animationSpec1 == springSpec0) {
            composer0.startReplaceGroup(0x431745D7);
            boolean z = (v & 0x380 ^ 0x180) > 0x100 && composer0.changed(f2) || (v & 0x180) == 0x100;
            SpringSpec springSpec1 = composer0.rememberedValue();
            if(z || springSpec1 == Composer.Companion.getEmpty()) {
                springSpec1 = AnimationSpecKt.spring$default(0.0f, 0.0f, f2, 3, null);
                composer0.updateRememberedValue(springSpec1);
            }
            animationSpec2 = springSpec1;
            composer0.endReplaceGroup();
        }
        else {
            composer0.startReplaceGroup(1125708605);
            composer0.endReplaceGroup();
            animationSpec2 = animationSpec1;
        }
        State state0 = AnimateAsStateKt.animateValueAsState(f, VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), animationSpec2, f2, ((v1 & 8) == 0 ? s : "FloatAnimation"), ((v1 & 16) == 0 ? function10 : null), composer0, v << 3 & 0x1C00 | v & 14 | 0xE000 & v << 3 | v << 3 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateFloatAsState(float f, AnimationSpec animationSpec0, float f1, Function1 function10, Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.a;
        }
        if((v1 & 4) != 0) {
            f1 = 0.01f;
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, v, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        State state0 = AnimateAsStateKt.animateFloatAsState(f, animationSpec0, f1, null, function10, composer0, v & 0x3FE | v << 3 & 0xE000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateIntAsState(int v, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.f;
        }
        if((v2 & 4) != 0) {
            s = "IntAnimation";
        }
        if((v2 & 8) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, v1, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(v, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec0, null, s, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateIntAsState(int v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.f;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCDC6BF0B, v1, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(v, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec0, null, null, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateIntOffsetAsState-8f6pmRE(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.g;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, v1, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(IntOffset.box-impl(v), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec0, null, null, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateIntOffsetAsState-HyPO7BM(long v, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.g;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD677EFC8, v1, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(IntOffset.box-impl(v), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec1, null, ((v2 & 4) == 0 ? s : "IntOffsetAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateIntSizeAsState-4goxYXU(long v, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.h;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x22B968C8, v1, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(IntSize.box-impl(v), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec1, null, ((v2 & 4) == 0 ? s : "IntSizeAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateIntSizeAsState-zTRF_AQ(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.h;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x97BCB82B, v1, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(IntSize.box-impl(v), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec0, null, null, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateOffsetAsState-7362WCg(long v, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.d;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, v1, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Offset.box-impl(v), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec1, null, ((v2 & 4) == 0 ? s : "OffsetAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateOffsetAsState-N6fFfp4(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.d;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE4CA2993, v1, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Offset.box-impl(v), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec0, null, null, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateRectAsState(@NotNull Rect rect0, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.e;
        }
        if((v1 & 4) != 0) {
            s = "RectAnimation";
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1FF3AC02, v, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(rect0, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec0, null, s, function10, composer0, v & 14 | v << 3 & 0x380 | 0xE000 & v << 6 | v << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateRectAsState(Rect rect0, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.e;
        }
        if((v1 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD15A4231, v, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(rect0, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec0, null, null, function10, composer0, v & 14 | v << 3 & 0x380 | v << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateSizeAsState-LjSzlW0(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.c;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x342AAEB7, v1, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Size.box-impl(v), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec0, null, null, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateSizeAsState-YLp_XPw(long v, @Nullable AnimationSpec animationSpec0, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.c;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x51EF3CBC, v1, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(Size.box-impl(v), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec1, null, ((v2 & 4) == 0 ? s : "SizeAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State animateValueAsState(Object object0, @NotNull TwoWayConverter twoWayConverter0, @Nullable AnimationSpec animationSpec0, @Nullable Object object1, @Nullable String s, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        AnimationSpec animationSpec1;
        if((v1 & 4) == 0) {
            animationSpec1 = animationSpec0;
        }
        else {
            SpringSpec springSpec0 = composer0.rememberedValue();
            if(springSpec0 == Composer.Companion.getEmpty()) {
                springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer0.updateRememberedValue(springSpec0);
            }
            animationSpec1 = springSpec0;
        }
        Object object2 = (v1 & 8) == 0 ? object1 : null;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x892044A4, v, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = new Animatable(object0, twoWayConverter0, object2, ((v1 & 16) == 0 ? s : "ValueAnimation"));
            composer0.updateRememberedValue(animatable0);
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(((v1 & 0x20) == 0 ? function10 : null), composer0, v >> 15 & 14);
        if(object2 != null && animationSpec1 instanceof SpringSpec && !Intrinsics.areEqual(((SpringSpec)animationSpec1).getVisibilityThreshold(), object2)) {
            animationSpec1 = AnimationSpecKt.spring(((SpringSpec)animationSpec1).getDampingRatio(), ((SpringSpec)animationSpec1).getStiffness(), object2);
        }
        State state1 = SnapshotStateKt.rememberUpdatedState(animationSpec1, composer0, 0);
        Channel channel0 = composer0.rememberedValue();
        if(channel0 == composer$Companion0.getEmpty()) {
            channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer0.updateRememberedValue(channel0);
        }
        boolean z = composer0.changedInstance(channel0);
        boolean z1 = (v & 14 ^ 6) > 4 && composer0.changedInstance(object0) || (v & 6) == 4;
        a a0 = composer0.rememberedValue();
        if(z1 || z || a0 == composer$Companion0.getEmpty()) {
            a0 = new a(7, channel0, object0);
            composer0.updateRememberedValue(a0);
        }
        EffectsKt.SideEffect(a0, composer0, 0);
        boolean z2 = composer0.changedInstance(channel0);
        boolean z3 = composer0.changedInstance(animatable0);
        boolean z4 = composer0.changed(state1);
        boolean z5 = composer0.changed(state0);
        f f0 = composer0.rememberedValue();
        if((z2 | z3 | z4 | z5) != 0 || f0 == composer$Companion0.getEmpty()) {
            f0 = new f(channel0, animatable0, state1, state0, null);
            composer0.updateRememberedValue(f0);
        }
        EffectsKt.LaunchedEffect(channel0, f0, composer0, 0);
        State state2 = (State)mutableState0.getValue();
        if(state2 == null) {
            state2 = animatable0.asState();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state2;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State animateValueAsState(Object object0, TwoWayConverter twoWayConverter0, AnimationSpec animationSpec0, Object object1, Function1 function10, Composer composer0, int v, int v1) {
        AnimationSpec animationSpec1;
        if((v1 & 4) == 0) {
            animationSpec1 = animationSpec0;
        }
        else {
            SpringSpec springSpec0 = composer0.rememberedValue();
            if(springSpec0 == Composer.Companion.getEmpty()) {
                springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer0.updateRememberedValue(springSpec0);
            }
            animationSpec1 = springSpec0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCD8D3BCF, v, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        State state0 = AnimateAsStateKt.animateValueAsState(object0, twoWayConverter0, animationSpec1, ((v1 & 8) == 0 ? object1 : null), "ValueAnimation", ((v1 & 16) == 0 ? function10 : null), composer0, (v & 8) << 9 | (v & 8 | 0x6000 | v & 14 | v & 0x70 | v & 0x380) | v & 0x1C00 | v << 3 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }
}

