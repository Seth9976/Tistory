package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalAnimationSpecApi
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0001\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ3\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00010\u000E\"\b\b\u0001\u0010\u000B*\u00020\n2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;)V", "", "periodicBias", "(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;F)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "a", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "KeyframesWithSplineSpecConfig", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1095:1\n382#2,4:1096\n354#2,6:1100\n364#2,3:1107\n367#2,2:1111\n387#2,2:1113\n370#2,6:1115\n389#2:1121\n1810#3:1106\n1672#3:1110\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n780#1:1096,4\n780#1:1100,6\n780#1:1107,3\n780#1:1111,2\n780#1:1113,2\n780#1:1115,6\n780#1:1121\n780#1:1106\n780#1:1110\n*E\n"})
public final class KeyframesWithSplineSpec implements DurationBasedAnimationSpec {
    @ExperimentalAnimationSpecApi
    @StabilityInferred(parameters = 2)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001A\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class KeyframesWithSplineSpecConfig extends KeyframesSpecBaseConfig {
        public static final int $stable;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        @Override  // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeBaseEntity createEntityFor$animation_core_release(Object object0) {
            return this.createEntityFor$animation_core_release(object0);
        }

        @NotNull
        public KeyframeEntity createEntityFor$animation_core_release(Object object0) {
            return new KeyframeEntity(object0, null, 0, 6, null);
        }
    }

    public static final int $stable;
    public final KeyframesWithSplineSpecConfig a;
    public final float b;

    public KeyframesWithSplineSpec(@NotNull KeyframesWithSplineSpecConfig keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0) {
        this.a = keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0;
        this.b = NaNf;
    }

    public KeyframesWithSplineSpec(@NotNull KeyframesWithSplineSpecConfig keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0, @FloatRange(from = 0.0, to = 1.0) float f) {
        this(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0);
        this.b = f;
    }

    @NotNull
    public final KeyframesWithSplineSpecConfig getConfig() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    @NotNull
    public VectorizedDurationBasedAnimationSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        int[] arr_v3;
        long[] arr_v2;
        KeyframesWithSplineSpecConfig keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0 = this.a;
        MutableIntList mutableIntList0 = new MutableIntList(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getKeyframes$animation_core_release().getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getKeyframes$animation_core_release().getSize());
        MutableIntObjectMap mutableIntObjectMap1 = keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getKeyframes$animation_core_release();
        int[] arr_v = mutableIntObjectMap1.keys;
        Object[] arr_object = mutableIntObjectMap1.values;
        long[] arr_v1 = mutableIntObjectMap1.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                int v4 = 0;
                while(v4 < v3) {
                    if((0xFFL & v2) < 0x80L) {
                        int v5 = (v1 << 3) + v4;
                        int v6 = arr_v[v5];
                        KeyframeEntity keyframesSpec$KeyframeEntity0 = (KeyframeEntity)arr_object[v5];
                        mutableIntList0.add(v6);
                        arr_v2 = arr_v1;
                        arr_v3 = arr_v;
                        mutableIntObjectMap0.set(v6, new Pair(twoWayConverter0.getConvertToVector().invoke(keyframesSpec$KeyframeEntity0.getValue$animation_core_release()), keyframesSpec$KeyframeEntity0.getEasing$animation_core_release()));
                    }
                    else {
                        arr_v2 = arr_v1;
                        arr_v3 = arr_v;
                    }
                    v2 >>= 8;
                    ++v4;
                    arr_v1 = arr_v2;
                    arr_v = arr_v3;
                }
                long[] arr_v4 = arr_v1;
                int[] arr_v5 = arr_v;
                if(v3 == 8) {
                    goto label_37;
                label_35:
                    arr_v4 = arr_v1;
                    arr_v5 = arr_v;
                label_37:
                    if(v1 != v) {
                        ++v1;
                        arr_v1 = arr_v4;
                        arr_v = arr_v5;
                        continue;
                    }
                }
                goto label_42;
            }
        }
        else {
        label_42:
            if(!keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getKeyframes$animation_core_release().contains(0)) {
                mutableIntList0.add(0, 0);
            }
        }
        if(!keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getKeyframes$animation_core_release().contains(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getDurationMillis())) {
            mutableIntList0.add(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getDurationMillis());
        }
        mutableIntList0.sort();
        return new VectorizedMonoSplineKeyframesSpec(mutableIntList0, mutableIntObjectMap0, keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getDurationMillis(), keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0.getDelayMillis(), this.b);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }
}

