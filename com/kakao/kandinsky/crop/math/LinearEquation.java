package com.kakao.kandinsky.crop.math;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\u001B\u0010\u0014\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001A\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0016J\u001A\u0010\u0017\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001A\u00020\u0015ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Lcom/kakao/kandinsky/crop/math/LinearEquation;", "", "a", "", "b", "c", "(FFF)V", "getA", "()F", "getB", "getC", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "intersection", "Landroidx/compose/ui/geometry/Offset;", "intersection-x-9fifI", "perpendicularIntersection", "point", "perpendicularIntersection-PeaRLWg", "(J)Landroidx/compose/ui/geometry/Offset;", "toString", "", "Companion", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLinearEquation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearEquation.kt\ncom/kakao/kandinsky/crop/math/LinearEquation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class LinearEquation {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\b\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/crop/math/LinearEquation$Companion;", "", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Lcom/kakao/kandinsky/crop/math/LinearEquation;", "from-0a9Yr6o", "(JJ)Lcom/kakao/kandinsky/crop/math/LinearEquation;", "from", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LinearEquation from-0a9Yr6o(long v, long v1) {
            return new LinearEquation(Offset.getY-impl(v) - Offset.getY-impl(v1), Offset.getX-impl(v1) - Offset.getX-impl(v), Offset.getY-impl(v1) * Offset.getX-impl(v) - Offset.getY-impl(v) * Offset.getX-impl(v1));
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float a;
    public final float b;
    public final float c;

    static {
        LinearEquation.Companion = new Companion(null);
    }

    public LinearEquation(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    @NotNull
    public final LinearEquation copy(float f, float f1, float f2) {
        return new LinearEquation(f, f1, f2);
    }

    public static LinearEquation copy$default(LinearEquation linearEquation0, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = linearEquation0.a;
        }
        if((v & 2) != 0) {
            f1 = linearEquation0.b;
        }
        if((v & 4) != 0) {
            f2 = linearEquation0.c;
        }
        return linearEquation0.copy(f, f1, f2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinearEquation)) {
            return false;
        }
        if(Float.compare(this.a, ((LinearEquation)object0).a) != 0) {
            return false;
        }
        return Float.compare(this.b, ((LinearEquation)object0).b) == 0 ? Float.compare(this.c, ((LinearEquation)object0).c) == 0 : false;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getC() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.c) + a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Nullable
    public final Offset intersection-x-9fifI(@NotNull LinearEquation linearEquation0) {
        Intrinsics.checkNotNullParameter(linearEquation0, "other");
        Offset offset0 = Offset.box-impl(OffsetKt.Offset((this.b * linearEquation0.c - linearEquation0.b * this.c) / (this.a * linearEquation0.b - linearEquation0.a * this.b), (this.c * linearEquation0.a - linearEquation0.c * this.a) / (this.a * linearEquation0.b - linearEquation0.a * this.b)));
        return OffsetKt.isSpecified-k-4lQ0M(offset0.unbox-impl()) ? offset0 : null;
    }

    @Nullable
    public final Offset perpendicularIntersection-PeaRLWg(long v) {
        return new LinearEquation(-this.b, this.a, Offset.getX-impl(v) * this.b - Offset.getY-impl(v) * this.a).intersection-x-9fifI(this);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LinearEquation(a=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", b=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", c=");
        return androidx.room.a.h(this.c, ")", stringBuilder0);
    }
}

