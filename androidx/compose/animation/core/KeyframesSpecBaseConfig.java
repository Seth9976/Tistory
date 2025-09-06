package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000E\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004J\u0017\u0010\b\u001A\u00028\u00012\u0006\u0010\u0005\u001A\u00028\u0000H ¢\u0006\u0004\b\u0006\u0010\u0007J\u001E\u0010\u000B\u001A\u00028\u0001*\u00028\u00002\b\b\u0001\u0010\n\u001A\u00020\tH\u0096\u0004¢\u0006\u0004\b\u000B\u0010\fJ\u001E\u0010\u000F\u001A\u00028\u0001*\u00028\u00002\b\b\u0001\u0010\u000E\u001A\u00020\rH\u0096\u0004¢\u0006\u0004\b\u000F\u0010\u0010J\u001C\u0010\u0013\u001A\u00028\u0001*\u00028\u00012\u0006\u0010\u0012\u001A\u00020\u0011H\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u001C\u001A\u00020\t2\b\b\u0001\u0010\u0015\u001A\u00020\t8G@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR,\u0010 \u001A\u00020\t2\b\b\u0001\u0010\u0015\u001A\u00020\t8G@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u0017\u001A\u0004\b\u001E\u0010\u0019\"\u0004\b\u001F\u0010\u001BR \u0010&\u001A\b\u0012\u0004\u0012\u00028\u00010!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\u0082\u0001\u0002\'(¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "E", "", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "createEntityFor", "", "timeStamp", "at", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframeBaseEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "using", "(Landroidx/compose/animation/core/KeyframeBaseEntity;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "<set-?>", "a", "I", "getDurationMillis", "()I", "setDurationMillis", "(I)V", "durationMillis", "b", "getDelayMillis", "setDelayMillis", "delayMillis", "Landroidx/collection/MutableIntObjectMap;", "c", "Landroidx/collection/MutableIntObjectMap;", "getKeyframes$animation_core_release", "()Landroidx/collection/MutableIntObjectMap;", "keyframes", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1095:1\n26#2:1096\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n*L\n527#1:1096\n*E\n"})
public abstract class KeyframesSpecBaseConfig {
    public static final int $stable = 8;
    public int a;
    public int b;
    public final MutableIntObjectMap c;

    public KeyframesSpecBaseConfig(DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = 300;
        this.c = IntObjectMapKt.mutableIntObjectMapOf();
    }

    @NotNull
    public KeyframeBaseEntity at(Object object0, @IntRange(from = 0L) int v) {
        KeyframeBaseEntity keyframeBaseEntity0 = this.createEntityFor$animation_core_release(object0);
        this.c.set(v, keyframeBaseEntity0);
        return keyframeBaseEntity0;
    }

    @NotNull
    public KeyframeBaseEntity atFraction(Object object0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return this.at(object0, Math.round(((float)this.a) * f));
    }

    @NotNull
    public abstract KeyframeBaseEntity createEntityFor$animation_core_release(Object arg1);

    @IntRange(from = 0L)
    public final int getDelayMillis() {
        return this.b;
    }

    @IntRange(from = 0L)
    public final int getDurationMillis() {
        return this.a;
    }

    @NotNull
    public final MutableIntObjectMap getKeyframes$animation_core_release() {
        return this.c;
    }

    public final void setDelayMillis(@IntRange(from = 0L) int v) {
        this.b = v;
    }

    public final void setDurationMillis(@IntRange(from = 0L) int v) {
        this.a = v;
    }

    @NotNull
    public final KeyframeBaseEntity using(@NotNull KeyframeBaseEntity keyframeBaseEntity0, @NotNull Easing easing0) {
        keyframeBaseEntity0.setEasing$animation_core_release(easing0);
        return keyframeBaseEntity0;
    }
}

