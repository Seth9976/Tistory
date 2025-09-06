package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalAnimationSpecApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000E\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0018\u0010\t\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J/\u0010\u0016\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001A\u0010\f\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001A\u001A\u0004\b\u001E\u0010\u001C¨\u0006\u001F"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "", "durationMillis", "delayMillis", "", "periodicBias", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "c", "I", "getDurationMillis", "()I", "d", "getDelayMillis", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,203:1\n70#2:204\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n174#1:204\n*E\n"})
public final class VectorizedMonoSplineKeyframesSpec implements VectorizedDurationBasedAnimationSpec {
    public static final int $stable = 8;
    public final IntList a;
    public final IntObjectMap b;
    public final int c;
    public final int d;
    public final float e;
    public AnimationVector f;
    public AnimationVector g;
    public float[] h;
    public MonoSpline i;
    public float[][] j;
    public AnimationVector k;
    public AnimationVector l;

    public VectorizedMonoSplineKeyframesSpec(@NotNull IntList intList0, @NotNull IntObjectMap intObjectMap0, int v, int v1, float f) {
        this.a = intList0;
        this.b = intObjectMap0;
        this.c = v;
        this.d = v1;
        this.e = f;
    }

    public final float a(int v, int v1) {
        Easing easing0;
        IntList intList0 = this.a;
        if(v >= intList0._size - 1) {
            return ((float)v1) / 1000.0f;
        }
        int v2 = intList0.get(v);
        int v3 = intList0.get(v + 1);
        if(v1 == v2) {
            return ((float)v2) / 1000.0f;
        }
        int v4 = intList0.get(v);
        Pair pair0 = (Pair)this.b.get(v4);
        if(pair0 == null) {
            easing0 = EasingKt.getLinearEasing();
        }
        else {
            easing0 = (Easing)pair0.getSecond();
            if(easing0 == null) {
                easing0 = EasingKt.getLinearEasing();
            }
        }
        float f = (float)(v3 - v2);
        return (easing0.transform(((float)(v1 - v2)) / f) * f + ((float)v2)) / 1000.0f;
    }

    public final void b(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        float[] arr_f1;
        float[] arr_f2;
        IntList intList0 = this.a;
        if(this.f == null) {
            this.f = AnimationVectorsKt.newInstance(animationVector0);
            this.g = AnimationVectorsKt.newInstance(animationVector2);
            int v1 = intList0.getSize();
            float[] arr_f = new float[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_f[v2] = ((float)intList0.get(v2)) / 1000.0f;
            }
            this.h = arr_f;
        }
        if(this.i == null || !Intrinsics.areEqual(this.k, animationVector0) || !Intrinsics.areEqual(this.l, animationVector1)) {
            boolean z = Intrinsics.areEqual(this.k, animationVector0);
            boolean z1 = Intrinsics.areEqual(this.l, animationVector1);
            this.k = animationVector0;
            this.l = animationVector1;
            int v3 = animationVector0.getSize$animation_core_release();
            float[][] arr2_f = null;
            IntObjectMap intObjectMap0 = this.b;
            if(this.j == null) {
                int v4 = intList0.getSize();
                float[][] arr2_f1 = new float[v4][];
                int v5 = 0;
                while(v5 < v4) {
                    int v6 = intList0.get(v5);
                    if(v6 == 0) {
                        if(intObjectMap0.contains(0)) {
                            arr_f2 = new float[v3];
                            Object object0 = intObjectMap0.get(0);
                            Intrinsics.checkNotNull(object0);
                            AnimationVector animationVector3 = (AnimationVector)((Pair)object0).getFirst();
                            for(int v8 = 0; v8 < v3; ++v8) {
                                arr_f2[v8] = animationVector3.get$animation_core_release(v8);
                            }
                            goto label_74;
                        }
                        else {
                            arr_f1 = new float[v3];
                            for(int v7 = 0; v7 < v3; ++v7) {
                                arr_f1[v7] = animationVector0.get$animation_core_release(v7);
                            }
                            goto label_75;
                        }
                        goto label_46;
                    }
                    else {
                    label_46:
                        if(v6 == this.getDurationMillis()) {
                            if(intObjectMap0.contains(v6)) {
                                arr_f2 = new float[v3];
                                Object object1 = intObjectMap0.get(v6);
                                Intrinsics.checkNotNull(object1);
                                AnimationVector animationVector4 = (AnimationVector)((Pair)object1).getFirst();
                                for(int v10 = 0; v10 < v3; ++v10) {
                                    arr_f2[v10] = animationVector4.get$animation_core_release(v10);
                                }
                                goto label_74;
                            }
                            else {
                                arr_f1 = new float[v3];
                                for(int v9 = 0; v9 < v3; ++v9) {
                                    arr_f1[v9] = animationVector1.get$animation_core_release(v9);
                                }
                                goto label_75;
                            }
                            goto label_65;
                        }
                        else {
                        label_65:
                            arr_f2 = new float[v3];
                            Object object2 = intObjectMap0.get(v6);
                            Intrinsics.checkNotNull(object2);
                            AnimationVector animationVector5 = (AnimationVector)((Pair)object2).getFirst();
                            for(int v11 = 0; v11 < v3; ++v11) {
                                arr_f2[v11] = animationVector5.get$animation_core_release(v11);
                            }
                        }
                    }
                label_74:
                    arr_f1 = arr_f2;
                label_75:
                    arr2_f1[v5] = arr_f1;
                    ++v5;
                }
                this.j = arr2_f1;
            }
            else {
                if(!z && !intObjectMap0.contains(0)) {
                    float[][] arr2_f2 = this.j;
                    if(arr2_f2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("values");
                        arr2_f2 = null;
                    }
                    int v12 = IntListExtensionKt.binarySearch$default(this.a, 0, 0, 0, 6, null);
                    float[] arr_f3 = new float[v3];
                    for(int v13 = 0; v13 < v3; ++v13) {
                        arr_f3[v13] = animationVector0.get$animation_core_release(v13);
                    }
                    arr2_f2[v12] = arr_f3;
                }
                if(!z1 && !intObjectMap0.contains(this.getDurationMillis())) {
                    float[][] arr2_f3 = this.j;
                    if(arr2_f3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("values");
                        arr2_f3 = null;
                    }
                    int v14 = IntListExtensionKt.binarySearch$default(this.a, this.getDurationMillis(), 0, 0, 6, null);
                    float[] arr_f4 = new float[v3];
                    for(int v = 0; v < v3; ++v) {
                        arr_f4[v] = animationVector1.get$animation_core_release(v);
                    }
                    arr2_f3[v14] = arr_f4;
                }
            }
            float[] arr_f5 = this.h;
            if(arr_f5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("times");
                arr_f5 = null;
            }
            float[][] arr2_f4 = this.j;
            if(arr2_f4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("values");
            }
            else {
                arr2_f = arr2_f4;
            }
            this.i = new MonoSpline(arr_f5, arr2_f, this.e);
        }
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.d;
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.c;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getValueFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        int v1 = (int)VectorizedAnimationSpecKt.clampPlayTime(this, v / 1000000L);
        IntObjectMap intObjectMap0 = this.b;
        if(intObjectMap0.containsKey(v1)) {
            Object object0 = intObjectMap0.get(v1);
            Intrinsics.checkNotNull(object0);
            return (AnimationVector)((Pair)object0).getFirst();
        }
        if(v1 >= this.getDurationMillis()) {
            return animationVector1;
        }
        if(v1 <= 0) {
            return animationVector0;
        }
        this.b(animationVector0, animationVector1, animationVector2);
        int v2 = IntListExtensionKt.binarySearch$default(this.a, v1, 0, 0, 6, null);
        if(v2 < -1) {
            v2 = -(v2 + 2);
        }
        MonoSpline monoSpline0 = this.i;
        if(monoSpline0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline0 = null;
        }
        float f = this.a(v2, v1);
        AnimationVector animationVector3 = this.f;
        if(animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector3 = null;
        }
        monoSpline0.getPos(f, animationVector3, v2);
        AnimationVector animationVector4 = this.f;
        if(animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return animationVector4;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        int v1 = (int)VectorizedAnimationSpecKt.clampPlayTime(this, v / 1000000L);
        if(v1 < 0) {
            return animationVector2;
        }
        this.b(animationVector0, animationVector1, animationVector2);
        int v2 = IntListExtensionKt.binarySearch$default(this.a, v1, 0, 0, 6, null);
        if(v2 < -1) {
            v2 = -(v2 + 2);
        }
        MonoSpline monoSpline0 = this.i;
        if(monoSpline0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline0 = null;
        }
        float f = this.a(v2, v1);
        AnimationVector animationVector3 = this.g;
        if(animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector3 = null;
        }
        monoSpline0.getSlope(f, animationVector3, v2);
        AnimationVector animationVector4 = this.g;
        if(animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return animationVector4;
    }
}

