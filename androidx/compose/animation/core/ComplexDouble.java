package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0002H\u0086\n¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\nJ\u0018\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000B\u0010\tJ\u0018\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000B\u0010\nJ\u0018\u0010\f\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0002H\u0086\n¢\u0006\u0004\b\f\u0010\tJ\u0018\u0010\f\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000F\u0010\tJ$\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0011\u0010\u001D\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u001F\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001C¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "", "_real", "_imaginary", "<init>", "(DD)V", "other", "plus", "(D)Landroidx/compose/animation/core/ComplexDouble;", "(Landroidx/compose/animation/core/ComplexDouble;)Landroidx/compose/animation/core/ComplexDouble;", "minus", "times", "unaryMinus", "()Landroidx/compose/animation/core/ComplexDouble;", "div", "copy", "(DD)Landroidx/compose/animation/core/ComplexDouble;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "getReal", "()D", "real", "getImaginary", "imaginary", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n35#1,2:114\n66#1,3:116\n40#1,3:119\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:114,2\n50#1:116,3\n50#1:119,3\n*E\n"})
public final class ComplexDouble {
    public static final int $stable = 8;
    public double a;
    public double b;

    public ComplexDouble(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @NotNull
    public final ComplexDouble copy(double f, double f1) {
        return new ComplexDouble(f, f1);
    }

    public static ComplexDouble copy$default(ComplexDouble complexDouble0, double f, double f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = complexDouble0.a;
        }
        if((v & 2) != 0) {
            f1 = complexDouble0.b;
        }
        return complexDouble0.copy(f, f1);
    }

    @NotNull
    public final ComplexDouble div(double f) {
        this.a /= f;
        this.b /= f;
        return this;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ComplexDouble)) {
            return false;
        }
        return Double.compare(this.a, ((ComplexDouble)object0).a) == 0 ? Double.compare(this.b, ((ComplexDouble)object0).b) == 0 : false;
    }

    public final double getImaginary() {
        return this.b;
    }

    public final double getReal() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.b) + Double.hashCode(this.a) * 0x1F;
    }

    @NotNull
    public final ComplexDouble minus(double f) {
        this.a += -f;
        return this;
    }

    @NotNull
    public final ComplexDouble minus(@NotNull ComplexDouble complexDouble0) {
        complexDouble0.a *= -1.0;
        complexDouble0.b *= -1.0;
        this.a = complexDouble0.getReal() + this.a;
        this.b = complexDouble0.getImaginary() + this.b;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(double f) {
        this.a += f;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(@NotNull ComplexDouble complexDouble0) {
        this.a = complexDouble0.getReal() + this.a;
        this.b = complexDouble0.getImaginary() + this.b;
        return this;
    }

    @NotNull
    public final ComplexDouble times(double f) {
        this.a *= f;
        this.b *= f;
        return this;
    }

    @NotNull
    public final ComplexDouble times(@NotNull ComplexDouble complexDouble0) {
        this.a = complexDouble0.getReal() * this.getReal() - complexDouble0.getImaginary() * this.getImaginary();
        this.b = this.getImaginary() * complexDouble0.getReal() + complexDouble0.getImaginary() * this.getReal();
        return this;
    }

    @Override
    @NotNull
    public String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }

    @NotNull
    public final ComplexDouble unaryMinus() {
        this.a *= -1.0;
        this.b *= -1.0;
        return this;
    }
}

