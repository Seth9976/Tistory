package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u001A,\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0000\u001A\u0010\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0004H\u0000\u001A\u0015\u0010\t\u001A\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001A\u00020\u0002H\u0080\n\u001A\u0015\u0010\u000B\u001A\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001A\u00020\u0002H\u0080\n\u001A\u0015\u0010\f\u001A\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001A\u00020\u0002H\u0080\n¨\u0006\r"}, d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "a", "", "b", "c", "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n103#1:114\n107#1:120\n103#1:124\n103#1:135\n35#2,2:115\n54#2,3:117\n66#2,3:121\n35#2,2:125\n54#2,3:127\n35#2,2:130\n66#2,3:132\n35#2,2:136\n54#2,3:138\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:114\n89#1:120\n89#1:124\n107#1:135\n88#1:115,2\n88#1:117,3\n89#1:121,3\n89#1:125,2\n89#1:127,3\n103#1:130,2\n107#1:132,3\n107#1:136,2\n111#1:138,3\n*E\n"})
public final class ComplexDoubleKt {
    @NotNull
    public static final Pair complexQuadraticFormula(double f, double f1, double f2) {
        double f3 = ((long)f1) * ((long)f1) - 0x4010000000000000L * ((long)f) * f2;
        double f4 = 1.0 / (((long)f) * 0x4000000000000000L);
        ComplexDouble complexDouble0 = ComplexDoubleKt.complexSqrt(f3);
        complexDouble0.a += -((long)f1);
        complexDouble0.a *= f4;
        complexDouble0.b *= f4;
        ComplexDouble complexDouble1 = ComplexDoubleKt.complexSqrt(f3);
        complexDouble1.a *= -1.0;
        complexDouble1.b *= -1.0;
        complexDouble1.a += -((long)f1);
        complexDouble1.a *= f4;
        complexDouble1.b *= f4;
        return TuplesKt.to(complexDouble0, complexDouble1);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double f) {
        return f < 0.0 ? new ComplexDouble(0.0, Math.sqrt(Math.abs(f))) : new ComplexDouble(Math.sqrt(f), 0.0);
    }

    @NotNull
    public static final ComplexDouble minus(double f, @NotNull ComplexDouble complexDouble0) {
        complexDouble0.a *= -1.0;
        complexDouble0.b *= -1.0;
        complexDouble0.a += f;
        return complexDouble0;
    }

    @NotNull
    public static final ComplexDouble plus(double f, @NotNull ComplexDouble complexDouble0) {
        complexDouble0.a += f;
        return complexDouble0;
    }

    @NotNull
    public static final ComplexDouble times(double f, @NotNull ComplexDouble complexDouble0) {
        complexDouble0.a *= f;
        complexDouble0.b *= f;
        return complexDouble0;
    }
}

