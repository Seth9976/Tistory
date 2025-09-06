package androidx.compose.ui.geometry;

import a5.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u001D\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DBO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0007\u00A2\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000EH\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u0016\u0010\u001E\u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010 \u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u0016\u0010\"\u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u001DJ\u0016\u0010$\u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010\u001DJc\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\u0007H\u00C6\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010)\u001A\u00020(H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010*J\u001A\u0010,\u001A\u00020\u00102\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u0018R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b1\u0010/\u001A\u0004\b2\u0010\u0018R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010/\u001A\u0004\b4\u0010\u0018R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010/\u001A\u0004\b6\u0010\u0018R\u001D\u0010\b\u001A\u00020\u00078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001DR\u001D\u0010\t\u001A\u00020\u00078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b:\u00108\u001A\u0004\b;\u0010\u001DR\u001D\u0010\n\u001A\u00020\u00078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b<\u00108\u001A\u0004\b=\u0010\u001DR\u001D\u0010\u000B\u001A\u00020\u00078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u00108\u001A\u0004\b?\u0010\u001DR\u0011\u0010A\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b@\u0010\u0018R\u0011\u0010C\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bB\u0010\u0018\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006E"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "", "left", "top", "right", "bottom", "Landroidx/compose/ui/geometry/CornerRadius;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getLeft", "b", "getTop", "c", "getRight", "d", "getBottom", "e", "J", "getTopLeftCornerRadius-kKHJgLs", "f", "getTopRightCornerRadius-kKHJgLs", "g", "getBottomRightCornerRadius-kKHJgLs", "h", "getBottomLeftCornerRadius-kKHJgLs", "getWidth", "width", "getHeight", "height", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RoundRect {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "Landroidx/compose/ui/geometry/RoundRect;", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "()V", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.j;
        }

        @JvmStatic
        public static void getZero$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public RoundRect i;
    public static final RoundRect j;

    static {
        RoundRect.Companion = new Companion(null);
        RoundRect.j = RoundRectKt.RoundRect-gG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    // 去混淆评级： 低(40)
    public RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, f2, f3, ((v4 & 16) == 0 ? v : 0L), ((v4 & 0x20) == 0 ? v1 : 0L), ((v4 & 0x40) == 0 ? v2 : 0L), ((v4 & 0x80) == 0 ? v3 : 0L), null);
    }

    public RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = v3;
    }

    public static float a(float f, float f1, float f2, float f3) {
        float f4 = f1 + f2;
        return f4 <= f3 || f4 == 0.0f ? f : Math.min(f, f3 / f4);
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

    public final float component4() {
        return this.d;
    }

    public final long component5-kKHJgLs() {
        return this.e;
    }

    public final long component6-kKHJgLs() {
        return this.f;
    }

    public final long component7-kKHJgLs() {
        return this.g;
    }

    public final long component8-kKHJgLs() {
        return this.h;
    }

    public final boolean contains-k-4lQ0M(long v) {
        float f8;
        float f7;
        float f6;
        float f5;
        float f = this.a;
        if(Offset.getX-impl(v) >= f) {
            float f1 = this.c;
            if(Offset.getX-impl(v) < f1) {
                float f2 = this.b;
                if(Offset.getY-impl(v) >= f2) {
                    float f3 = this.d;
                    if(Offset.getY-impl(v) < f3) {
                        RoundRect roundRect0 = this.i;
                        if(roundRect0 == null) {
                            float f4 = RoundRect.a(RoundRect.a(RoundRect.a(RoundRect.a(1.0f, CornerRadius.getY-impl(this.h), CornerRadius.getY-impl(this.e), this.getHeight()), CornerRadius.getX-impl(this.e), CornerRadius.getX-impl(this.f), this.getWidth()), CornerRadius.getY-impl(this.f), CornerRadius.getY-impl(this.g), this.getHeight()), CornerRadius.getX-impl(this.g), CornerRadius.getX-impl(this.h), this.getWidth());
                            RoundRect roundRect1 = new RoundRect(f * f4, f2 * f4, f1 * f4, f3 * f4, CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.e) * f4, CornerRadius.getY-impl(this.e) * f4), CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.f) * f4, CornerRadius.getY-impl(this.f) * f4), CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.g) * f4, CornerRadius.getY-impl(this.g) * f4), CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.h) * f4, CornerRadius.getY-impl(this.h) * f4), null);
                            this.i = roundRect1;
                            roundRect0 = roundRect1;
                        }
                        long v1 = roundRect0.e;
                        if(Float.compare(Offset.getX-impl(v), CornerRadius.getX-impl(v1) + f) < 0 && Offset.getY-impl(v) < CornerRadius.getY-impl(v1) + f2) {
                            f5 = Offset.getX-impl(v) - f - CornerRadius.getX-impl(v1);
                            f6 = Offset.getY-impl(v) - f2 - CornerRadius.getY-impl(v1);
                            f7 = CornerRadius.getX-impl(v1);
                            f8 = CornerRadius.getY-impl(v1);
                            return f6 / f8 * (f6 / f8) + f5 / f7 * (f5 / f7) <= 1.0f;
                        }
                        long v2 = roundRect0.f;
                        if(Offset.getX-impl(v) > f1 - CornerRadius.getX-impl(v2) && Offset.getY-impl(v) < CornerRadius.getY-impl(v2) + f2) {
                            f5 = Offset.getX-impl(v) - f1 + CornerRadius.getX-impl(v2);
                            f6 = Offset.getY-impl(v) - f2 - CornerRadius.getY-impl(v2);
                            f7 = CornerRadius.getX-impl(v2);
                            f8 = CornerRadius.getY-impl(v2);
                            return f6 / f8 * (f6 / f8) + f5 / f7 * (f5 / f7) <= 1.0f;
                        }
                        long v3 = roundRect0.g;
                        if(Offset.getX-impl(v) > f1 - CornerRadius.getX-impl(v3) && Offset.getY-impl(v) > f3 - CornerRadius.getY-impl(v3)) {
                            f5 = Offset.getX-impl(v) - f1 + CornerRadius.getX-impl(v3);
                            f6 = Offset.getY-impl(v) - f3 + CornerRadius.getY-impl(v3);
                            f7 = CornerRadius.getX-impl(v3);
                            f8 = CornerRadius.getY-impl(v3);
                            return f6 / f8 * (f6 / f8) + f5 / f7 * (f5 / f7) <= 1.0f;
                        }
                        long v4 = roundRect0.h;
                        if(Offset.getX-impl(v) < CornerRadius.getX-impl(v4) + f && Offset.getY-impl(v) > f3 - CornerRadius.getY-impl(v4)) {
                            f5 = Offset.getX-impl(v) - f - CornerRadius.getX-impl(v4);
                            f6 = Offset.getY-impl(v) - f3 + CornerRadius.getY-impl(v4);
                            f7 = CornerRadius.getX-impl(v4);
                            f8 = CornerRadius.getY-impl(v4);
                            return f6 / f8 * (f6 / f8) + f5 / f7 * (f5 / f7) <= 1.0f;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public final RoundRect copy-MDFrsts(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3) {
        return new RoundRect(f, f1, f2, f3, v, v1, v2, v3, null);
    }

    public static RoundRect copy-MDFrsts$default(RoundRect roundRect0, float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, int v4, Object object0) {
        float f4 = (v4 & 1) == 0 ? f : roundRect0.a;
        float f5 = (v4 & 2) == 0 ? f1 : roundRect0.b;
        float f6 = (v4 & 4) == 0 ? f2 : roundRect0.c;
        float f7 = (v4 & 8) == 0 ? f3 : roundRect0.d;
        long v5 = (v4 & 16) == 0 ? v : roundRect0.e;
        long v6 = (v4 & 0x20) == 0 ? v1 : roundRect0.f;
        long v7 = (v4 & 0x40) == 0 ? v2 : roundRect0.g;
        return (v4 & 0x80) == 0 ? roundRect0.copy-MDFrsts(f4, f5, f6, f7, v5, v6, v7, v3) : roundRect0.copy-MDFrsts(f4, f5, f6, f7, v5, v6, v7, roundRect0.h);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RoundRect)) {
            return false;
        }
        if(Float.compare(this.a, ((RoundRect)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((RoundRect)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((RoundRect)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((RoundRect)object0).d) != 0) {
            return false;
        }
        if(!CornerRadius.equals-impl0(this.e, ((RoundRect)object0).e)) {
            return false;
        }
        if(!CornerRadius.equals-impl0(this.f, ((RoundRect)object0).f)) {
            return false;
        }
        return CornerRadius.equals-impl0(this.g, ((RoundRect)object0).g) ? CornerRadius.equals-impl0(this.h, ((RoundRect)object0).h) : false;
    }

    public final float getBottom() {
        return this.d;
    }

    public final long getBottomLeftCornerRadius-kKHJgLs() {
        return this.h;
    }

    public final long getBottomRightCornerRadius-kKHJgLs() {
        return this.g;
    }

    public final float getHeight() {
        return this.d - this.b;
    }

    public final float getLeft() {
        return this.a;
    }

    public final float getRight() {
        return this.c;
    }

    public final float getTop() {
        return this.b;
    }

    public final long getTopLeftCornerRadius-kKHJgLs() {
        return this.e;
    }

    public final long getTopRightCornerRadius-kKHJgLs() {
        return this.f;
    }

    public final float getWidth() {
        return this.c - this.a;
    }

    @NotNull
    public static final RoundRect getZero() {
        return RoundRect.Companion.getZero();
    }

    @Override
    public int hashCode() {
        return CornerRadius.hashCode-impl(this.h) + (CornerRadius.hashCode-impl(this.g) + (CornerRadius.hashCode-impl(this.f) + (CornerRadius.hashCode-impl(this.e) + a.b(this.d, a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F)) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        String s = GeometryUtilsKt.toStringAsFixed(this.a, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.b, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.c, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.d, 1);
        long v = this.e;
        long v1 = this.f;
        long v2 = this.g;
        long v3 = this.h;
        if(CornerRadius.equals-impl0(v, v1) && CornerRadius.equals-impl0(v1, v2) && CornerRadius.equals-impl0(v2, v3)) {
            if(CornerRadius.getX-impl(v) == CornerRadius.getY-impl(v)) {
                StringBuilder stringBuilder0 = b.v("RoundRect(rect=", s, ", radius=");
                stringBuilder0.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1));
                stringBuilder0.append(')');
                return stringBuilder0.toString();
            }
            StringBuilder stringBuilder1 = b.v("RoundRect(rect=", s, ", x=");
            stringBuilder1.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1));
            stringBuilder1.append(", y=");
            stringBuilder1.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.getY-impl(v), 1));
            stringBuilder1.append(')');
            return stringBuilder1.toString();
        }
        StringBuilder stringBuilder2 = b.v("RoundRect(rect=", s, ", topLeft=");
        stringBuilder2.append(CornerRadius.toString-impl(v));
        stringBuilder2.append(", topRight=");
        stringBuilder2.append(CornerRadius.toString-impl(v1));
        stringBuilder2.append(", bottomRight=");
        stringBuilder2.append(CornerRadius.toString-impl(v2));
        stringBuilder2.append(", bottomLeft=");
        stringBuilder2.append(CornerRadius.toString-impl(v3));
        stringBuilder2.append(')');
        return stringBuilder2.toString();
    }
}

