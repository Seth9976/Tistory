package com.kakao.kandinsky.preview;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.td;
import androidx.compose.material3.y3;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import ce.e;
import com.kakao.kandinsky.designsystem.common.ModifierKt;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import com.kakao.kandinsky.utils.MatrixValuesKt;
import j0.t1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import na.n;
import na.o;
import na.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000B\u0010\fJ \u0010\u0011\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u0004\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001D\u0010\u001B\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001B\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001D0 H\u0007\u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00060$H\u0007\u00A2\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00061\u00B2\u0006\f\u0010(\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010)\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010*\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010+\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\u0005\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\u001E\u0010.\u001A\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,8\nX\u008A\u0084\u0002\u00B2\u0006\u001E\u0010/\u001A\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,8\nX\u008A\u0084\u0002\u00B2\u0006\u001E\u00100\u001A\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/preview/PreviewAnimator;", "", "<init>", "()V", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "contentBound", "", "init", "(Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;)V", "updateAbsoluteMatrix", "(Landroid/graphics/Matrix;)V", "Landroidx/compose/ui/geometry/Size;", "cropSize", "updateRelativeMatrix-TmRCtEA", "(JLandroid/graphics/Matrix;)V", "updateRelativeMatrix", "", "playAnimation", "updateGestureMatrix", "(Landroid/graphics/Matrix;Z)V", "enable", "(Z)V", "", "from", "to", "startBounceAnimation", "(II)V", "Landroidx/compose/ui/Modifier;", "gestureModifier", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lkotlin/Pair;", "Lcom/kakao/kandinsky/utils/MatrixValues;", "absoluteMatrixAndModifier", "(Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "Landroidx/compose/runtime/State;", "animatedRelativeRect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Companion", "bounceTransform", "gestureTransform", "scale", "transition", "Lkotlin/Triple;", "", "a", "b", "c", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimator.kt\ncom/kakao/kandinsky/preview/PreviewAnimator\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Matrix.kt\nandroidx/core/graphics/MatrixKt\n*L\n1#1,170:1\n81#2:171\n107#2,2:172\n81#2:174\n107#2,2:175\n81#2:177\n107#2,2:178\n81#2:180\n107#2,2:181\n81#2:183\n107#2,2:184\n81#2:256\n81#2:257\n81#2:258\n81#2:259\n81#2:260\n81#2:261\n81#2:262\n81#2:263\n1223#3,6:186\n1223#3,6:192\n1223#3,6:198\n1223#3,3:204\n1226#3,3:208\n1223#3,6:250\n1#4:207\n1#4:219\n1#4:232\n1#4:245\n1882#5:211\n1879#5,6:212\n1885#5,4:220\n1882#5:224\n1879#5,6:225\n1885#5,4:233\n1882#5:237\n1879#5,6:238\n1885#5,4:246\n32#6:218\n32#6:231\n32#6:244\n*S KotlinDebug\n*F\n+ 1 PreviewAnimator.kt\ncom/kakao/kandinsky/preview/PreviewAnimator\n*L\n27#1:171\n27#1:172,2\n28#1:174\n28#1:175,2\n29#1:177\n29#1:178,2\n30#1:180\n30#1:181,2\n31#1:183\n31#1:184,2\n106#1:256\n107#1:257\n116#1:258\n117#1:259\n119#1:260\n143#1:261\n144#1:262\n145#1:263\n116#1:186,6\n117#1:192,6\n119#1:198,6\n140#1:204,3\n140#1:208,3\n147#1:250,6\n143#1:219\n144#1:232\n145#1:245\n143#1:211\n143#1:212,6\n143#1:220,4\n144#1:224\n144#1:225,6\n144#1:233,4\n145#1:237\n145#1:238,6\n145#1:246,4\n143#1:218\n144#1:231\n145#1:244\n*E\n"})
public final class PreviewAnimator {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R2\u0010\t\u001A \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/kandinsky/preview/PreviewAnimator$Companion;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "BOUNCE_ANIMATION_SCALE_RANGE", "Lkotlin/ranges/ClosedFloatingPointRange;", "Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Triple;", "Landroidx/compose/animation/core/AnimationVector3D;", "FloatArrayToVector3D", "Landroidx/compose/animation/core/TwoWayConverter;", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableState a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public boolean f;
    public Rect g;
    public static final TwoWayConverter h;
    public static final ClosedFloatingPointRange i;

    static {
        PreviewAnimator.Companion = new Companion(null);
        PreviewAnimator.h = VectorConvertersKt.TwoWayConverter(n.x, n.y);
        PreviewAnimator.i = e.rangeTo(0.7f, 1.3f);
    }

    public PreviewAnimator() {
        this.a = SnapshotStateKt.mutableStateOf$default(new AnimationMatrix(null, null, 3, null), null, 2, null);
        this.b = SnapshotStateKt.mutableStateOf$default(new Matrix(), null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(new AnimationMatrix(null, null, 3, null), null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(new AnimationMatrix(null, null, 3, null), null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0L), null, 2, null);
        this.f = true;
        this.g = Rect.Companion.getZero();
    }

    public static State a(AnimationMatrix animationMatrix0, Composer composer0, int v) {
        composer0.startReplaceGroup(1827130788);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827130788, v, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix (PreviewAnimator.kt:138)");
        }
        composer0.startReplaceGroup(0x110D9A6B);
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(animationMatrix0) || (v & 6) == 4;
        MutableTransitionState mutableTransitionState0 = composer0.rememberedValue();
        if(z || mutableTransitionState0 == Composer.Companion.getEmpty()) {
            mutableTransitionState0 = new MutableTransitionState(animationMatrix0.getFrom());
            mutableTransitionState0.setTargetState(animationMatrix0.getTo());
            composer0.updateRememberedValue(mutableTransitionState0);
        }
        composer0.endReplaceGroup();
        Transition transition0 = TransitionKt.updateTransition(mutableTransitionState0, "", composer0, MutableTransitionState.$stable | 0x30, 0);
        PreviewAnimator.getAnimatedMatrix..inlined.animateValue.1 previewAnimator$getAnimatedMatrix$$inlined$animateValue$10 = PreviewAnimator.getAnimatedMatrix..inlined.animateValue.1.INSTANCE;
        Matrix matrix0 = (Matrix)transition0.getCurrentState();
        composer0.startReplaceGroup(2035063832);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2035063832, 0, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix.<anonymous> (PreviewAnimator.kt:142)");
        }
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        Float float0 = (float)arr_f[0];
        float[] arr_f1 = new float[9];
        matrix0.getValues(arr_f1);
        Float float1 = (float)arr_f1[1];
        float[] arr_f2 = new float[9];
        matrix0.getValues(arr_f2);
        Triple triple0 = new Triple(float0, float1, ((float)arr_f2[2]));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        Matrix matrix1 = (Matrix)transition0.getTargetState();
        composer0.startReplaceGroup(2035063832);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2035063832, 0, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix.<anonymous> (PreviewAnimator.kt:142)");
        }
        float[] arr_f3 = new float[9];
        matrix1.getValues(arr_f3);
        Float float2 = (float)arr_f3[0];
        float[] arr_f4 = new float[9];
        matrix1.getValues(arr_f4);
        Float float3 = (float)arr_f4[1];
        float[] arr_f5 = new float[9];
        matrix1.getValues(arr_f5);
        Triple triple1 = new Triple(float2, float3, ((float)arr_f5[2]));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        Object object0 = previewAnimator$getAnimatedMatrix$$inlined$animateValue$10.invoke(transition0.getSegment(), composer0, 0);
        TwoWayConverter twoWayConverter0 = PreviewAnimator.h;
        State state0 = TransitionKt.createTransitionAnimation(transition0, triple0, triple1, ((FiniteAnimationSpec)object0), twoWayConverter0, "", composer0, 0x38000);
        PreviewAnimator.getAnimatedMatrix..inlined.animateValue.2 previewAnimator$getAnimatedMatrix$$inlined$animateValue$20 = PreviewAnimator.getAnimatedMatrix..inlined.animateValue.2.INSTANCE;
        Matrix matrix2 = (Matrix)transition0.getCurrentState();
        composer0.startReplaceGroup(-2078170215);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2078170215, 0, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix.<anonymous> (PreviewAnimator.kt:143)");
        }
        float[] arr_f6 = new float[9];
        matrix2.getValues(arr_f6);
        Float float4 = (float)arr_f6[3];
        float[] arr_f7 = new float[9];
        matrix2.getValues(arr_f7);
        Float float5 = (float)arr_f7[4];
        float[] arr_f8 = new float[9];
        matrix2.getValues(arr_f8);
        Triple triple2 = new Triple(float4, float5, ((float)arr_f8[5]));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        Matrix matrix3 = (Matrix)transition0.getTargetState();
        composer0.startReplaceGroup(-2078170215);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2078170215, 0, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix.<anonymous> (PreviewAnimator.kt:143)");
        }
        float[] arr_f9 = new float[9];
        matrix3.getValues(arr_f9);
        Float float6 = (float)arr_f9[3];
        float[] arr_f10 = new float[9];
        matrix3.getValues(arr_f10);
        Float float7 = (float)arr_f10[4];
        float[] arr_f11 = new float[9];
        matrix3.getValues(arr_f11);
        Triple triple3 = new Triple(float6, float7, ((float)arr_f11[5]));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        State state1 = TransitionKt.createTransitionAnimation(transition0, triple2, triple3, ((FiniteAnimationSpec)previewAnimator$getAnimatedMatrix$$inlined$animateValue$20.invoke(transition0.getSegment(), composer0, 0)), twoWayConverter0, "", composer0, 0x38000);
        PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3 previewAnimator$getAnimatedMatrix$$inlined$animateValue$30 = PreviewAnimator.getAnimatedMatrix..inlined.animateValue.3.INSTANCE;
        Matrix matrix4 = (Matrix)transition0.getCurrentState();
        composer0.startReplaceGroup(0x8EF6AB1A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8EF6AB1A, 0, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix.<anonymous> (PreviewAnimator.kt:144)");
        }
        float[] arr_f12 = new float[9];
        matrix4.getValues(arr_f12);
        Float float8 = (float)arr_f12[6];
        float[] arr_f13 = new float[9];
        matrix4.getValues(arr_f13);
        Float float9 = (float)arr_f13[7];
        float[] arr_f14 = new float[9];
        matrix4.getValues(arr_f14);
        Triple triple4 = new Triple(float8, float9, ((float)arr_f14[8]));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        Matrix matrix5 = (Matrix)transition0.getTargetState();
        composer0.startReplaceGroup(0x8EF6AB1A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8EF6AB1A, 0, -1, "com.kakao.kandinsky.preview.PreviewAnimator.getAnimatedMatrix.<anonymous> (PreviewAnimator.kt:144)");
        }
        float[] arr_f15 = new float[9];
        matrix5.getValues(arr_f15);
        Float float10 = (float)arr_f15[6];
        float[] arr_f16 = new float[9];
        matrix5.getValues(arr_f16);
        Float float11 = (float)arr_f16[7];
        float[] arr_f17 = new float[9];
        matrix5.getValues(arr_f17);
        Triple triple5 = new Triple(float10, float11, ((float)arr_f17[8]));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        State state2 = TransitionKt.createTransitionAnimation(transition0, triple4, triple5, ((FiniteAnimationSpec)previewAnimator$getAnimatedMatrix$$inlined$animateValue$30.invoke(transition0.getSegment(), composer0, 0)), twoWayConverter0, "", composer0, 0x38000);
        composer0.startReplaceGroup(286104802);
        boolean z1 = composer0.changed(transition0);
        State state3 = composer0.rememberedValue();
        if(z1 || state3 == Composer.Companion.getEmpty()) {
            state3 = SnapshotStateKt.derivedStateOf(new td(state0, state1, 10, state2));
            composer0.updateRememberedValue(state3);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state3;
    }

    @Composable
    @NotNull
    public final Pair absoluteMatrixAndModifier(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x2CD867BA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2CD867BA, v, -1, "com.kakao.kandinsky.preview.PreviewAnimator.absoluteMatrixAndModifier (PreviewAnimator.kt:114)");
        }
        MutableState mutableState0 = this.a;
        AnimationMatrix animationMatrix0 = (AnimationMatrix)mutableState0.getValue();
        composer0.startReplaceGroup(214402321);
        boolean z = composer0.changed(animationMatrix0);
        AnimationMatrix animationMatrix1 = composer0.rememberedValue();
        if(z || animationMatrix1 == Composer.Companion.getEmpty()) {
            animationMatrix1 = this.b(((AnimationMatrix)mutableState0.getValue()));
            composer0.updateRememberedValue(animationMatrix1);
        }
        composer0.endReplaceGroup();
        int v1 = v << 3 & 0x70;
        State state0 = PreviewAnimator.a(animationMatrix1, composer0, v1);
        AnimationMatrix animationMatrix2 = (AnimationMatrix)mutableState0.getValue();
        composer0.startReplaceGroup(214402434);
        boolean z1 = composer0.changed(animationMatrix2);
        AnimationMatrix animationMatrix3 = composer0.rememberedValue();
        if(z1 || animationMatrix3 == Composer.Companion.getEmpty()) {
            AnimationMatrix animationMatrix4 = (AnimationMatrix)mutableState0.getValue();
            AnimationMatrix animationMatrix5 = this.b(animationMatrix4);
            animationMatrix3 = new AnimationMatrix(MatrixExtensionKt.buildMatrix(animationMatrix4.getFrom(), new p(animationMatrix5, 0)), MatrixExtensionKt.buildMatrix(animationMatrix4.getTo(), new p(animationMatrix5, 1)));
            composer0.updateRememberedValue(animationMatrix3);
        }
        composer0.endReplaceGroup();
        State state1 = PreviewAnimator.a(animationMatrix3, composer0, v1);
        Matrix matrix0 = (Matrix)state0.getValue();
        Matrix matrix1 = (Matrix)state1.getValue();
        composer0.startReplaceGroup(214402540);
        boolean z2 = composer0.changed(matrix0);
        boolean z3 = composer0.changed(matrix1);
        State state2 = composer0.rememberedValue();
        if(z2 || z3 || state2 == Composer.Companion.getEmpty()) {
            state2 = SnapshotStateKt.derivedStateOf(new t1(18, state1, state0));
            composer0.updateRememberedValue(state2);
        }
        composer0.endReplaceGroup();
        MatrixValues matrixValues0 = MatrixValues.box-impl(MatrixValuesKt.getMatrixValues(((Matrix)state2.getValue())));
        Transform transform0 = MatrixTransformKt.getTransform(((Matrix)state0.getValue()));
        Pair pair0 = TuplesKt.to(matrixValues0, ModifierKt.graphicsLayer(ModifierKt.graphicsLayer(Modifier.Companion, transform0), MatrixTransformKt.getTransform(((Matrix)state1.getValue()))));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return pair0;
    }

    public static final Matrix access$absoluteMatrixAndModifier$lambda$5(State state0) {
        return (Matrix)state0.getValue();
    }

    public static final Matrix access$absoluteMatrixAndModifier$lambda$7(State state0) {
        return (Matrix)state0.getValue();
    }

    public static final Triple access$getAnimatedMatrix$lambda$13(State state0) {
        return (Triple)state0.getValue();
    }

    public static final Triple access$getAnimatedMatrix$lambda$15(State state0) {
        return (Triple)state0.getValue();
    }

    public static final Triple access$getAnimatedMatrix$lambda$17(State state0) {
        return (Triple)state0.getValue();
    }

    @Composable
    @NotNull
    public final State animatedRelativeRect(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x483092C6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x483092C6, v, -1, "com.kakao.kandinsky.preview.PreviewAnimator.animatedRelativeRect (PreviewAnimator.kt:133)");
        }
        State state0 = AnimateAsStateKt.animateRectAsState(RectExtensionKt.mapRect(((Matrix)this.b.getValue()), SizeKt.toRect-uvyYCjk(((Size)this.e.getValue()).unbox-impl())), null, "relative rect", null, composer0, 0x180, 10);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    public final AnimationMatrix b(AnimationMatrix animationMatrix0) {
        return new AnimationMatrix(MatrixExtensionKt.buildMatrix$default(null, new o(MatrixTransformKt.getTransform(animationMatrix0.getFrom()), this, 0), 1, null), MatrixExtensionKt.buildMatrix$default(null, new o(MatrixTransformKt.getTransform(animationMatrix0.getTo()), this, 1), 1, null));
    }

    public final void enable(boolean z) {
        this.f = z;
    }

    @SuppressLint({"ComposableModifierFactory"})
    @Composable
    @NotNull
    public final Modifier gestureModifier(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x8D3AB1A1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8D3AB1A1, v, -1, "com.kakao.kandinsky.preview.PreviewAnimator.gestureModifier (PreviewAnimator.kt:104)");
        }
        int v1 = v << 3 & 0x70;
        State state0 = PreviewAnimator.a(((AnimationMatrix)this.d.getValue()), composer0, v1);
        Transform transform0 = MatrixTransformKt.getTransform(((Matrix)PreviewAnimator.a(((AnimationMatrix)this.c.getValue()), composer0, v1).getValue()));
        Modifier modifier0 = ModifierKt.graphicsLayer(ModifierKt.graphicsLayer(Modifier.Companion, transform0), MatrixTransformKt.getTransform(((Matrix)state0.getValue())));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }

    public final void init(@NotNull Matrix matrix0, @NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Intrinsics.checkNotNullParameter(rect0, "contentBound");
        AnimationMatrix animationMatrix0 = new AnimationMatrix(matrix0, matrix0);
        this.a.setValue(animationMatrix0);
        this.g = rect0;
    }

    public final void startBounceAnimation(int v, int v1) {
        if(v > 0 && v1 > 0) {
            AnimationMatrix animationMatrix0 = new AnimationMatrix(MatrixExtensionKt.buildMatrix$default(null, new y3(((Number)c.coerceIn(MathHelpersKt.lerp(((Number)PreviewAnimator.i.getStart()).floatValue(), ((Number)PreviewAnimator.i.getEndInclusive()).floatValue(), ((float)v1) / ((float)v) / 2.0f), PreviewAnimator.i)).floatValue(), this, 3), 1, null), new Matrix());
            this.d.setValue(animationMatrix0);
        }
    }

    public final void updateAbsoluteMatrix(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Matrix matrix1 = this.f ? ((AnimationMatrix)this.a.getValue()).getTo() : matrix0;
        this.a.setValue(new AnimationMatrix(matrix1, matrix0));
    }

    public final void updateGestureMatrix(@NotNull Matrix matrix0, boolean z) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Matrix matrix1 = z ? ((AnimationMatrix)this.c.getValue()).getTo() : matrix0;
        this.c.setValue(new AnimationMatrix(matrix1, matrix0));
    }

    public final void updateRelativeMatrix-TmRCtEA(long v, @NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Size size0 = Size.box-impl(v);
        this.e.setValue(size0);
        this.b.setValue(matrix0);
    }
}

