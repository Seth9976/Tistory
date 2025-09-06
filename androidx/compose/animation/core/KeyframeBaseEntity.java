package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J9\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0010\u001A\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\"\u0010\u0017\u001A\u00020\b8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", "T", "", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "toPair$animation_core_release", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "toPair", "a", "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", "value", "b", "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core_release", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core_release", "(Landroidx/compose/animation/core/Easing;)V", "easing", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class KeyframeBaseEntity {
    public static final int $stable = 8;
    public final Object a;
    public Easing b;

    public KeyframeBaseEntity(Object object0, Easing easing0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = object0;
        this.b = easing0;
    }

    @NotNull
    public final Easing getEasing$animation_core_release() {
        return this.b;
    }

    public final Object getValue$animation_core_release() {
        return this.a;
    }

    public final void setEasing$animation_core_release(@NotNull Easing easing0) {
        this.b = easing0;
    }

    @NotNull
    public final Pair toPair$animation_core_release(@NotNull Function1 function10) {
        return TuplesKt.to(function10.invoke(this.a), this.b);
    }
}

