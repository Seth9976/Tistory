package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0012\u0013B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\u000B\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "a", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1095:1\n382#2,4:1096\n354#2,6:1100\n364#2,3:1107\n367#2,2:1111\n387#2,2:1113\n370#2,6:1115\n389#2:1121\n1810#3:1106\n1672#3:1110\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n668#1:1096,4\n668#1:1100,6\n668#1:1107,3\n668#1:1111,2\n668#1:1113,2\n668#1:1115,6\n668#1:1121\n668#1:1106\n668#1:1110\n*E\n"})
public final class KeyframesSpec implements DurationBasedAnimationSpec {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001A\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001A\u00020\u00068\u0000@\u0000X\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "value", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/ArcMode;", "arcMode", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", "getArcMode--9T-Mq4$animation_core_release", "setArcMode-Rur9ykg$animation_core_release", "(I)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class KeyframeEntity extends KeyframeBaseEntity {
        public static final int $stable = 8;
        public int c;

        public KeyframeEntity(Object object0, Easing easing0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 2) != 0) {
                easing0 = EasingKt.getLinearEasing();
            }
            if((v1 & 4) != 0) {
                v = 0;
            }
            this(object0, easing0, v, null);
        }

        public KeyframeEntity(Object object0, Easing easing0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            super(object0, easing0, null);
            this.c = v;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 instanceof KeyframeEntity ? Intrinsics.areEqual(((KeyframeEntity)object0).getValue$animation_core_release(), this.getValue$animation_core_release()) && Intrinsics.areEqual(((KeyframeEntity)object0).getEasing$animation_core_release(), this.getEasing$animation_core_release()) && ArcMode.equals-impl0(((KeyframeEntity)object0).c, this.c) : false;
        }

        public final int getArcMode--9T-Mq4$animation_core_release() {
            return this.c;
        }

        @Override
        public int hashCode() {
            Object object0 = this.getValue$animation_core_release();
            return object0 == null ? this.getEasing$animation_core_release().hashCode() + ArcMode.hashCode-impl(this.c) * 0x1F : this.getEasing$animation_core_release().hashCode() + (ArcMode.hashCode-impl(this.c) + object0.hashCode() * 0x1F) * 0x1F;
        }

        public final void setArcMode-Rur9ykg$animation_core_release(int v) {
            this.c = v;
        }
    }

    @StabilityInferred(parameters = 2)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001A\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\n\u001A\u00020\u000BH\u0096\u0004¢\u0006\u0002\u0010\fJ\"\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u000E\u001A\u00020\u000FH\u0096\u0004¢\u0006\u0002\u0010\u0010J+\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001A\u00020\u0013H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001B\u0010\u0016\u001A\u00020\u0017*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0018\u001A\u00020\u0019H\u0087\u0004\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "at", "timeStamp", "", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "atFraction", "fraction", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "using", "arcMode", "Landroidx/compose/animation/core/ArcMode;", "using-ngzHuyU", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "with", "", "easing", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1095:1\n26#2:1096\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n*L\n617#1:1096\n*E\n"})
    public static final class KeyframesSpecConfig extends KeyframesSpecBaseConfig {
        public static final int $stable;

        public KeyframesSpecConfig() {
            super(null);
        }

        @Override  // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeBaseEntity at(Object object0, int v) {
            return this.at(object0, v);
        }

        @NotNull
        public KeyframeEntity at(Object object0, @IntRange(from = 0L) int v) {
            KeyframeEntity keyframesSpec$KeyframeEntity0 = new KeyframeEntity(object0, null, 0, 6, null);
            this.getKeyframes$animation_core_release().set(v, keyframesSpec$KeyframeEntity0);
            return keyframesSpec$KeyframeEntity0;
        }

        @Override  // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeBaseEntity atFraction(Object object0, float f) {
            return this.atFraction(object0, f);
        }

        @NotNull
        public KeyframeEntity atFraction(Object object0, @FloatRange(from = 0.0, to = 1.0) float f) {
            return this.at(object0, Math.round(((float)this.getDurationMillis()) * f));
        }

        @Override  // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeBaseEntity createEntityFor$animation_core_release(Object object0) {
            return this.createEntityFor$animation_core_release(object0);
        }

        @NotNull
        public KeyframeEntity createEntityFor$animation_core_release(Object object0) {
            return new KeyframeEntity(object0, null, 0, 6, null);
        }

        @ExperimentalAnimationSpecApi
        @NotNull
        public final KeyframeEntity using-ngzHuyU(@NotNull KeyframeEntity keyframesSpec$KeyframeEntity0, int v) {
            keyframesSpec$KeyframeEntity0.setArcMode-Rur9ykg$animation_core_release(v);
            return keyframesSpec$KeyframeEntity0;
        }

        @Deprecated(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @ReplaceWith(expression = "this using easing", imports = {}))
        public final void with(@NotNull KeyframeEntity keyframesSpec$KeyframeEntity0, @NotNull Easing easing0) {
            keyframesSpec$KeyframeEntity0.setEasing$animation_core_release(easing0);
        }
    }

    public static final int $stable;
    public final KeyframesSpecConfig a;

    public KeyframesSpec(@NotNull KeyframesSpecConfig keyframesSpec$KeyframesSpecConfig0) {
        this.a = keyframesSpec$KeyframesSpecConfig0;
    }

    @NotNull
    public final KeyframesSpecConfig getConfig() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    public VectorizedDurationBasedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @NotNull
    public VectorizedKeyframesSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        Object[] arr_object1;
        int[] arr_v3;
        long[] arr_v2;
        KeyframesSpecConfig keyframesSpec$KeyframesSpecConfig0 = this.a;
        MutableIntList mutableIntList0 = new MutableIntList(keyframesSpec$KeyframesSpecConfig0.getKeyframes$animation_core_release().getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(keyframesSpec$KeyframesSpecConfig0.getKeyframes$animation_core_release().getSize());
        MutableIntObjectMap mutableIntObjectMap1 = keyframesSpec$KeyframesSpecConfig0.getKeyframes$animation_core_release();
        int[] arr_v = mutableIntObjectMap1.keys;
        Object[] arr_object = mutableIntObjectMap1.values;
        long[] arr_v1 = mutableIntObjectMap1.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_39;
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
                        arr_object1 = arr_object;
                        mutableIntObjectMap0.set(v6, new VectorizedKeyframeSpecElementInfo(((AnimationVector)twoWayConverter0.getConvertToVector().invoke(keyframesSpec$KeyframeEntity0.getValue$animation_core_release())), keyframesSpec$KeyframeEntity0.getEasing$animation_core_release(), keyframesSpec$KeyframeEntity0.getArcMode--9T-Mq4$animation_core_release(), null));
                    }
                    else {
                        arr_v2 = arr_v1;
                        arr_v3 = arr_v;
                        arr_object1 = arr_object;
                    }
                    v2 >>= 8;
                    ++v4;
                    arr_v1 = arr_v2;
                    arr_v = arr_v3;
                    arr_object = arr_object1;
                }
                long[] arr_v4 = arr_v1;
                int[] arr_v5 = arr_v;
                Object[] arr_object2 = arr_object;
                if(v3 == 8) {
                    goto label_42;
                label_39:
                    arr_v4 = arr_v1;
                    arr_v5 = arr_v;
                    arr_object2 = arr_object;
                label_42:
                    if(v1 != v) {
                        ++v1;
                        arr_v1 = arr_v4;
                        arr_v = arr_v5;
                        arr_object = arr_object2;
                        continue;
                    }
                }
                goto label_48;
            }
        }
        else {
        label_48:
            if(!keyframesSpec$KeyframesSpecConfig0.getKeyframes$animation_core_release().contains(0)) {
                mutableIntList0.add(0, 0);
            }
        }
        if(!keyframesSpec$KeyframesSpecConfig0.getKeyframes$animation_core_release().contains(keyframesSpec$KeyframesSpecConfig0.getDurationMillis())) {
            mutableIntList0.add(keyframesSpec$KeyframesSpecConfig0.getDurationMillis());
        }
        mutableIntList0.sort();
        return new VectorizedKeyframesSpec(mutableIntList0, mutableIntObjectMap0, keyframesSpec$KeyframesSpecConfig0.getDurationMillis(), keyframesSpec$KeyframesSpecConfig0.getDelayMillis(), EasingKt.getLinearEasing(), 0, null);
    }
}

