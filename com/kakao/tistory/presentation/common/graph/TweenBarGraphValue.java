package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;", "", "firstBarValue", "secondBarValue", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getFirstBarValue", "b", "getSecondBarValue", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TweenBarGraphValue implements BarGraphValue {
    public static final int $stable;
    public final float a;
    public final float b;

    public TweenBarGraphValue() {
        this(0.0f, 0.0f, 3, null);
    }

    public TweenBarGraphValue(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public TweenBarGraphValue(float f, float f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        this(f, f1);
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    @NotNull
    public final TweenBarGraphValue copy(float f, float f1) {
        return new TweenBarGraphValue(f, f1);
    }

    public static TweenBarGraphValue copy$default(TweenBarGraphValue tweenBarGraphValue0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = tweenBarGraphValue0.a;
        }
        if((v & 2) != 0) {
            f1 = tweenBarGraphValue0.b;
        }
        return tweenBarGraphValue0.copy(f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TweenBarGraphValue)) {
            return false;
        }
        return Float.compare(this.a, ((TweenBarGraphValue)object0).a) == 0 ? Float.compare(this.b, ((TweenBarGraphValue)object0).b) == 0 : false;
    }

    public final float getFirstBarValue() {
        return this.a;
    }

    public final float getSecondBarValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TweenBarGraphValue(firstBarValue=" + this.a + ", secondBarValue=" + this.b + ")";
    }
}

