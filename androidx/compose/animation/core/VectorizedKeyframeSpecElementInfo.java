package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\f\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001F\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u0011\u001A\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J7\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001A\u00028\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0004\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\fR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u000ER\u001D\u0010\b\u001A\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0010\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "vectorValue", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/ArcMode;", "arcMode", "<init>", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/animation/core/AnimationVector;", "component2", "()Landroidx/compose/animation/core/Easing;", "component3--9T-Mq4", "()I", "component3", "copy-2NF0KzA", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;I)Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/animation/core/AnimationVector;", "getVectorValue", "b", "Landroidx/compose/animation/core/Easing;", "getEasing", "c", "I", "getArcMode--9T-Mq4", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorizedKeyframeSpecElementInfo {
    public static final int $stable;
    public final AnimationVector a;
    public final Easing b;
    public final int c;

    public VectorizedKeyframeSpecElementInfo(AnimationVector animationVector0, Easing easing0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = animationVector0;
        this.b = easing0;
        this.c = v;
    }

    @NotNull
    public final AnimationVector component1() {
        return this.a;
    }

    @NotNull
    public final Easing component2() {
        return this.b;
    }

    public final int component3--9T-Mq4() {
        return this.c;
    }

    @NotNull
    public final VectorizedKeyframeSpecElementInfo copy-2NF0KzA(@NotNull AnimationVector animationVector0, @NotNull Easing easing0, int v) {
        return new VectorizedKeyframeSpecElementInfo(animationVector0, easing0, v, null);
    }

    public static VectorizedKeyframeSpecElementInfo copy-2NF0KzA$default(VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo0, AnimationVector animationVector0, Easing easing0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            animationVector0 = vectorizedKeyframeSpecElementInfo0.a;
        }
        if((v1 & 2) != 0) {
            easing0 = vectorizedKeyframeSpecElementInfo0.b;
        }
        if((v1 & 4) != 0) {
            v = vectorizedKeyframeSpecElementInfo0.c;
        }
        return vectorizedKeyframeSpecElementInfo0.copy-2NF0KzA(animationVector0, easing0, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((VectorizedKeyframeSpecElementInfo)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((VectorizedKeyframeSpecElementInfo)object0).b) ? ArcMode.equals-impl0(this.c, ((VectorizedKeyframeSpecElementInfo)object0).c) : false;
    }

    public final int getArcMode--9T-Mq4() {
        return this.c;
    }

    @NotNull
    public final Easing getEasing() {
        return this.b;
    }

    @NotNull
    public final AnimationVector getVectorValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ArcMode.hashCode-impl(this.c) + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=" + ArcMode.toString-impl(this.c) + ')';
    }
}

