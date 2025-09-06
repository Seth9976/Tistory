package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\u0002\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\rJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016H\u00D6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010 \u001A\u0004\b!\u0010\rR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010 \u001A\u0004\b\"\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010 \u001A\u0004\b#\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010 \u001A\u0004\b$\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010 \u001A\u0004\b%\u0010\rR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010 \u001A\u0004\b&\u0010\rR\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010 \u001A\u0004\b(\u0010\r\u00A8\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "", "gamma", "a", "b", "c", "d", "e", "f", "<init>", "(DDDDDDD)V", "component1", "()D", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(DDDDDDD)Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getGamma", "getA", "getB", "getC", "getD", "getE", "g", "getF", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransferParameters {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public TransferParameters(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        if(Double.isNaN(f1) || Double.isNaN(f2) || Double.isNaN(f3) || Double.isNaN(f4) || Double.isNaN(f5) || Double.isNaN(f6) || Double.isNaN(f)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if(f4 < 0.0 || f4 > 1.0) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + f4);
        }
        if(f4 == 0.0 && (f1 == 0.0 || f == 0.0)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if(f4 >= 1.0 && f3 == 0.0) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if((f1 == 0.0 || f == 0.0) && f3 == 0.0) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if(f3 < 0.0) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if(f1 < 0.0 || f < 0.0) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public TransferParameters(double f, double f1, double f2, double f3, double f4, double f5, double f6, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, f2, f3, f4, ((v & 0x20) == 0 ? f5 : 0.0), ((v & 0x40) == 0 ? f6 : 0.0));
    }

    public final double component1() {
        return this.a;
    }

    public final double component2() {
        return this.b;
    }

    public final double component3() {
        return this.c;
    }

    public final double component4() {
        return this.d;
    }

    public final double component5() {
        return this.e;
    }

    public final double component6() {
        return this.f;
    }

    public final double component7() {
        return this.g;
    }

    @NotNull
    public final TransferParameters copy(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        return new TransferParameters(f, f1, f2, f3, f4, f5, f6);
    }

    public static TransferParameters copy$default(TransferParameters transferParameters0, double f, double f1, double f2, double f3, double f4, double f5, double f6, int v, Object object0) {
        double f7 = (v & 1) == 0 ? f : transferParameters0.a;
        double f8 = (v & 2) == 0 ? f1 : transferParameters0.b;
        double f9 = (v & 4) == 0 ? f2 : transferParameters0.c;
        double f10 = (v & 8) == 0 ? f3 : transferParameters0.d;
        double f11 = (v & 16) == 0 ? f4 : transferParameters0.e;
        double f12 = (v & 0x20) == 0 ? f5 : transferParameters0.f;
        return (v & 0x40) == 0 ? transferParameters0.copy(f7, f8, f9, f10, f11, f12, f6) : transferParameters0.copy(f7, f8, f9, f10, f11, f12, transferParameters0.g);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransferParameters)) {
            return false;
        }
        if(Double.compare(this.a, ((TransferParameters)object0).a) != 0) {
            return false;
        }
        if(Double.compare(this.b, ((TransferParameters)object0).b) != 0) {
            return false;
        }
        if(Double.compare(this.c, ((TransferParameters)object0).c) != 0) {
            return false;
        }
        if(Double.compare(this.d, ((TransferParameters)object0).d) != 0) {
            return false;
        }
        if(Double.compare(this.e, ((TransferParameters)object0).e) != 0) {
            return false;
        }
        return Double.compare(this.f, ((TransferParameters)object0).f) == 0 ? Double.compare(this.g, ((TransferParameters)object0).g) == 0 : false;
    }

    public final double getA() {
        return this.b;
    }

    public final double getB() {
        return this.c;
    }

    public final double getC() {
        return this.d;
    }

    public final double getD() {
        return this.e;
    }

    public final double getE() {
        return this.f;
    }

    public final double getF() {
        return this.g;
    }

    public final double getGamma() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.g) + (Double.hashCode(this.f) + (Double.hashCode(this.e) + (Double.hashCode(this.d) + (Double.hashCode(this.c) + (Double.hashCode(this.b) + Double.hashCode(this.a) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }
}

