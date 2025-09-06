package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000E\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\b\u0016\u0012\u001E\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u0005¢\u0006\u0004\b\u000B\u0010\fBE\b\u0000\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0012\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000F\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u0011\u001A\u00020\u0007\u0012\u0006\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u000B\u0010\u0014J/\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ/\u0010\u001C\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u001C\u0010\u001BR\u001A\u0010\t\u001A\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001A\u0010\n\u001A\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001E\u001A\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "durationMillis", "delayMillis", "<init>", "(Ljava/util/Map;II)V", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "defaultEasing", "Landroidx/compose/animation/core/ArcMode;", "initialArcMode", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "c", "I", "getDurationMillis", "()I", "d", "getDelayMillis", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1076:1\n215#2,2:1077\n215#2,2:1079\n70#3:1081\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n254#1:1077,2\n268#1:1079,2\n501#1:1081\n*E\n"})
public final class VectorizedKeyframesSpec implements VectorizedDurationBasedAnimationSpec {
    public static final int $stable = 8;
    public final IntList a;
    public final IntObjectMap b;
    public final int c;
    public final int d;
    public final Easing e;
    public final int f;
    public int[] g;
    public float[] h;
    public AnimationVector i;
    public AnimationVector j;
    public AnimationVector k;
    public AnimationVector l;
    public float[] m;
    public float[] n;
    public ArcSpline o;

    public VectorizedKeyframesSpec(IntList intList0, IntObjectMap intObjectMap0, int v, int v1, Easing easing0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = intList0;
        this.b = intObjectMap0;
        this.c = v;
        this.d = v1;
        this.e = easing0;
        this.f = v2;
    }

    public VectorizedKeyframesSpec(@NotNull Map map0, int v, int v1) {
        MutableIntList mutableIntList0 = new MutableIntList(map0.size() + 2);
        for(Object object0: map0.entrySet()) {
            mutableIntList0.add(((Number)((Map.Entry)object0).getKey()).intValue());
        }
        if(!map0.containsKey(0)) {
            mutableIntList0.add(0, 0);
        }
        if(!map0.containsKey(v)) {
            mutableIntList0.add(v);
        }
        mutableIntList0.sort();
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        for(Object object1: map0.entrySet()) {
            int v2 = ((Number)((Map.Entry)object1).getKey()).intValue();
            Pair pair0 = (Pair)((Map.Entry)object1).getValue();
            mutableIntObjectMap0.set(v2, new VectorizedKeyframeSpecElementInfo(((AnimationVector)pair0.getFirst()), ((Easing)pair0.getSecond()), 0, null));
        }
        this(mutableIntList0, mutableIntObjectMap0, v, v1, EasingKt.getLinearEasing(), 0, null);
    }

    public VectorizedKeyframesSpec(Map map0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(map0, v, v1);
    }

    public final float a(int v, int v1, boolean z) {
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
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo0 = (VectorizedKeyframeSpecElementInfo)this.b.get(v2);
        if(vectorizedKeyframeSpecElementInfo0 == null) {
            easing0 = this.e;
        }
        else {
            easing0 = vectorizedKeyframeSpecElementInfo0.getEasing();
            if(easing0 == null) {
                easing0 = this.e;
            }
        }
        float f = (float)(v3 - v2);
        float f1 = easing0.transform(((float)(v1 - v2)) / f);
        return z ? f1 : (f * f1 + ((float)v2)) / 1000.0f;
    }

    public final void b(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        float[] arr_f2;
        float[] arr_f3;
        boolean z = this.o != null;
        IntObjectMap intObjectMap0 = this.b;
        IntList intList0 = this.a;
        if(this.i == null) {
            this.i = AnimationVectorsKt.newInstance(animationVector0);
            this.j = AnimationVectorsKt.newInstance(animationVector2);
            int v = intList0.getSize();
            float[] arr_f = new float[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_f[v1] = ((float)intList0.get(v1)) / 1000.0f;
            }
            this.h = arr_f;
            int v2 = intList0.getSize();
            int[] arr_v = new int[v2];
            for(int v3 = 0; v3 < v2; ++v3) {
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo0 = (VectorizedKeyframeSpecElementInfo)intObjectMap0.get(intList0.get(v3));
                int v4 = vectorizedKeyframeSpecElementInfo0 == null ? this.f : vectorizedKeyframeSpecElementInfo0.getArcMode--9T-Mq4();
                if(!ArcMode.equals-impl0(v4, 0)) {
                    z = true;
                }
                arr_v[v3] = v4;
            }
            this.g = arr_v;
        }
        float[] arr_f1 = null;
        if(!z) {
            return;
        }
        if(this.o == null) {
        label_40:
            this.k = animationVector0;
            this.l = animationVector1;
            int v5 = animationVector0.getSize$animation_core_release();
            int v6 = animationVector0.getSize$animation_core_release() + v5 % 2;
            this.m = new float[v6];
            this.n = new float[v6];
            int v7 = intList0.getSize();
            float[][] arr2_f = new float[v7][];
            int v8 = 0;
            while(v8 < v7) {
                int v9 = intList0.get(v8);
                if(v9 == 0) {
                    if(intObjectMap0.contains(0)) {
                        arr_f3 = new float[v6];
                        Object object0 = intObjectMap0.get(0);
                        Intrinsics.checkNotNull(object0);
                        AnimationVector animationVector5 = ((VectorizedKeyframeSpecElementInfo)object0).getVectorValue();
                        for(int v11 = 0; v11 < v6; ++v11) {
                            arr_f3[v11] = animationVector5.get$animation_core_release(v11);
                        }
                        goto label_98;
                    }
                    else {
                        arr_f2 = new float[v6];
                        for(int v10 = 0; v10 < v6; ++v10) {
                            arr_f2[v10] = animationVector0.get$animation_core_release(v10);
                        }
                        goto label_99;
                    }
                    goto label_70;
                }
                else {
                label_70:
                    if(v9 == this.getDurationMillis()) {
                        if(intObjectMap0.contains(v9)) {
                            arr_f3 = new float[v6];
                            Object object1 = intObjectMap0.get(v9);
                            Intrinsics.checkNotNull(object1);
                            AnimationVector animationVector6 = ((VectorizedKeyframeSpecElementInfo)object1).getVectorValue();
                            for(int v13 = 0; v13 < v6; ++v13) {
                                arr_f3[v13] = animationVector6.get$animation_core_release(v13);
                            }
                            goto label_98;
                        }
                        else {
                            arr_f2 = new float[v6];
                            for(int v12 = 0; v12 < v6; ++v12) {
                                arr_f2[v12] = animationVector1.get$animation_core_release(v12);
                            }
                            goto label_99;
                        }
                        goto label_89;
                    }
                    else {
                    label_89:
                        arr_f3 = new float[v6];
                        Object object2 = intObjectMap0.get(v9);
                        Intrinsics.checkNotNull(object2);
                        AnimationVector animationVector7 = ((VectorizedKeyframeSpecElementInfo)object2).getVectorValue();
                        for(int v14 = 0; v14 < v6; ++v14) {
                            arr_f3[v14] = animationVector7.get$animation_core_release(v14);
                        }
                    }
                }
            label_98:
                arr_f2 = arr_f3;
            label_99:
                arr2_f[v8] = arr_f2;
                ++v8;
            }
            int[] arr_v1 = this.g;
            if(arr_v1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modes");
                arr_v1 = null;
            }
            float[] arr_f4 = this.h;
            if(arr_f4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("times");
            }
            else {
                arr_f1 = arr_f4;
            }
            this.o = new ArcSpline(arr_v1, arr_f1, arr2_f);
        }
        else {
            AnimationVector animationVector3 = this.k;
            if(animationVector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                animationVector3 = null;
            }
            if(Intrinsics.areEqual(animationVector3, animationVector0)) {
                AnimationVector animationVector4 = this.l;
                if(animationVector4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                    animationVector4 = null;
                }
                if(!Intrinsics.areEqual(animationVector4, animationVector1)) {
                    goto label_40;
                }
            }
            else {
                goto label_40;
            }
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
        if(intObjectMap0.contains(v1)) {
            Object object0 = intObjectMap0.get(v1);
            Intrinsics.checkNotNull(object0);
            return ((VectorizedKeyframeSpecElementInfo)object0).getVectorValue();
        }
        if(v1 >= this.getDurationMillis()) {
            return animationVector1;
        }
        if(v1 <= 0) {
            return animationVector0;
        }
        this.b(animationVector0, animationVector1, animationVector2);
        int v2 = 0;
        if(this.o != null) {
            int v3 = IntListExtensionKt.binarySearch$default(this.a, v1, 0, 0, 6, null);
            if(v3 < -1) {
                v3 = -(v3 + 2);
            }
            float f = this.a(v3, v1, false);
            ArcSpline arcSpline0 = this.o;
            if(arcSpline0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                arcSpline0 = null;
            }
            float[] arr_f = this.m;
            if(arr_f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                arr_f = null;
            }
            arcSpline0.getPos(f, arr_f);
            float[] arr_f1 = this.m;
            if(arr_f1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                arr_f1 = null;
            }
            while(v2 < arr_f1.length) {
                AnimationVector animationVector3 = this.i;
                if(animationVector3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                    animationVector3 = null;
                }
                float[] arr_f2 = this.m;
                if(arr_f2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("posArray");
                    arr_f2 = null;
                }
                animationVector3.set$animation_core_release(v2, arr_f2[v2]);
                ++v2;
            }
            AnimationVector animationVector4 = this.i;
            if(animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                return null;
            }
            return animationVector4;
        }
        int v4 = IntListExtensionKt.binarySearch$default(this.a, v1, 0, 0, 6, null);
        if(v4 < -1) {
            v4 = -(v4 + 2);
        }
        float f1 = this.a(v4, v1, true);
        IntList intList0 = this.a;
        int v5 = intList0.get(v4);
        if(intObjectMap0.contains(v5)) {
            Object object1 = intObjectMap0.get(v5);
            Intrinsics.checkNotNull(object1);
            animationVector0 = ((VectorizedKeyframeSpecElementInfo)object1).getVectorValue();
        }
        int v6 = intList0.get(v4 + 1);
        if(intObjectMap0.contains(v6)) {
            Object object2 = intObjectMap0.get(v6);
            Intrinsics.checkNotNull(object2);
            animationVector1 = ((VectorizedKeyframeSpecElementInfo)object2).getVectorValue();
        }
        AnimationVector animationVector5 = this.i;
        if(animationVector5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector5 = null;
        }
        int v7 = animationVector5.getSize$animation_core_release();
        while(v2 < v7) {
            AnimationVector animationVector6 = this.i;
            if(animationVector6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector6 = null;
            }
            animationVector6.set$animation_core_release(v2, VectorConvertersKt.lerp(animationVector0.get$animation_core_release(v2), animationVector1.get$animation_core_release(v2), f1));
            ++v2;
        }
        AnimationVector animationVector7 = this.i;
        if(animationVector7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return animationVector7;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public AnimationVector getVelocityFromNanos(long v, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        long v1 = VectorizedAnimationSpecKt.clampPlayTime(this, v / 1000000L);
        if(v1 < 0L) {
            return animationVector2;
        }
        this.b(animationVector0, animationVector1, animationVector2);
        int v2 = 0;
        if(this.o != null) {
            int v3 = IntListExtensionKt.binarySearch$default(this.a, ((int)v1), 0, 0, 6, null);
            if(v3 < -1) {
                v3 = -(v3 + 2);
            }
            float f = this.a(v3, ((int)v1), false);
            ArcSpline arcSpline0 = this.o;
            if(arcSpline0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                arcSpline0 = null;
            }
            float[] arr_f = this.n;
            if(arr_f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                arr_f = null;
            }
            arcSpline0.getSlope(f, arr_f);
            float[] arr_f1 = this.n;
            if(arr_f1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                arr_f1 = null;
            }
            while(v2 < arr_f1.length) {
                AnimationVector animationVector3 = this.j;
                if(animationVector3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                    animationVector3 = null;
                }
                float[] arr_f2 = this.n;
                if(arr_f2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                    arr_f2 = null;
                }
                animationVector3.set$animation_core_release(v2, arr_f2[v2]);
                ++v2;
            }
            AnimationVector animationVector4 = this.j;
            if(animationVector4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                return null;
            }
            return animationVector4;
        }
        AnimationVector animationVector5 = VectorizedAnimationSpecKt.getValueFromMillis(this, v1 - 1L, animationVector0, animationVector1, animationVector2);
        AnimationVector animationVector6 = VectorizedAnimationSpecKt.getValueFromMillis(this, v1, animationVector0, animationVector1, animationVector2);
        int v4 = animationVector5.getSize$animation_core_release();
        while(v2 < v4) {
            AnimationVector animationVector7 = this.j;
            if(animationVector7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector7 = null;
            }
            animationVector7.set$animation_core_release(v2, (animationVector5.get$animation_core_release(v2) - animationVector6.get$animation_core_release(v2)) * 1000.0f);
            ++v2;
        }
        AnimationVector animationVector8 = this.j;
        if(animationVector8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return animationVector8;
    }
}

