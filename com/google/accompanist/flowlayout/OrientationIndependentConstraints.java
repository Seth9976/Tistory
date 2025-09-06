package com.google.accompanist.flowlayout;

import a5.b;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0080\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u001C\b\u0016\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000FJ\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000FJ8\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000FJ\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000FR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001E\u001A\u0004\b\"\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010\u000F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/Constraints;", "c", "Lcom/google/accompanist/flowlayout/LayoutOrientation;", "orientation", "(JLcom/google/accompanist/flowlayout/LayoutOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMainAxisMin", "b", "getMainAxisMax", "getCrossAxisMin", "d", "getCrossAxisMax", "flowlayout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OrientationIndependentConstraints {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public OrientationIndependentConstraints(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    // 去混淆评级： 低(20)
    public OrientationIndependentConstraints(long v, LayoutOrientation layoutOrientation0, DefaultConstructorMarker defaultConstructorMarker0) {
        this((layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMinWidth-impl(v) : Constraints.getMinHeight-impl(v)), (layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMaxWidth-impl(v) : Constraints.getMaxHeight-impl(v)), (layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMinHeight-impl(v) : Constraints.getMinWidth-impl(v)), (layoutOrientation0 == LayoutOrientation.Horizontal ? Constraints.getMaxHeight-impl(v) : Constraints.getMaxWidth-impl(v)));
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    @NotNull
    public final OrientationIndependentConstraints copy(int v, int v1, int v2, int v3) {
        return new OrientationIndependentConstraints(v, v1, v2, v3);
    }

    public static OrientationIndependentConstraints copy$default(OrientationIndependentConstraints orientationIndependentConstraints0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = orientationIndependentConstraints0.a;
        }
        if((v4 & 2) != 0) {
            v1 = orientationIndependentConstraints0.b;
        }
        if((v4 & 4) != 0) {
            v2 = orientationIndependentConstraints0.c;
        }
        if((v4 & 8) != 0) {
            v3 = orientationIndependentConstraints0.d;
        }
        return orientationIndependentConstraints0.copy(v, v1, v2, v3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OrientationIndependentConstraints)) {
            return false;
        }
        if(this.a != ((OrientationIndependentConstraints)object0).a) {
            return false;
        }
        if(this.b != ((OrientationIndependentConstraints)object0).b) {
            return false;
        }
        return this.c == ((OrientationIndependentConstraints)object0).c ? this.d == ((OrientationIndependentConstraints)object0).d : false;
    }

    public final int getCrossAxisMax() {
        return this.d;
    }

    public final int getCrossAxisMin() {
        return this.c;
    }

    public final int getMainAxisMax() {
        return this.b;
    }

    public final int getMainAxisMin() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.d + a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OrientationIndependentConstraints(mainAxisMin=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", mainAxisMax=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", crossAxisMin=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", crossAxisMax=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

