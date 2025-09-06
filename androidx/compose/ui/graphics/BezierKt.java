package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.FloatFloatPair;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\u001A\u001F\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A\'\u0010\b\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\b\u0010\t\u001A\u001F\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u0005\u001A/\u0010\u000E\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A)\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A)\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0016\u001AA\u0010\u001C\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u001C\u0010!\u001A\u00020 *\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001EH\u0080\b\u00A2\u0006\u0004\b!\u0010\"\u001A\u001C\u0010!\u001A\u00020 *\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b!\u0010#\u001A\'\u0010\'\u001A\u00020\u00122\u0006\u0010$\u001A\u00020\u00102\u0006\u0010%\u001A\u00020\u00022\u0006\u0010&\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\'\u0010(\u001A7\u0010+\u001A\u00020\u00122\u0006\u0010$\u001A\u00020\u00102\u0006\u0010%\u001A\u00020\u00022\u0006\u0010&\u001A\u00020\u00022\u0006\u0010)\u001A\u00020\u00102\u0006\u0010*\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b+\u0010,\u001A7\u0010.\u001A\u00020\u00122\u0006\u0010$\u001A\u00020\u00102\u0006\u0010%\u001A\u00020\u00022\u0006\u0010&\u001A\u00020\u00022\u0006\u0010-\u001A\u00020\u00102\u0006\u0010*\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b.\u0010,\u001AO\u00107\u001A\u00020\u00022\u0006\u0010/\u001A\u00020\u00022\u0006\u00100\u001A\u00020\u00022\u0006\u00101\u001A\u00020\u00022\u0006\u00102\u001A\u00020\u00022\u0006\u00103\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00022\u0006\u00105\u001A\u00020\u00022\u0006\u00106\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b7\u00108\u00A8\u00069"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "segment", "", "t", "evaluateY", "(Landroidx/compose/ui/graphics/PathSegment;F)F", "p1", "p2", "evaluateCubic", "(FFF)F", "fraction", "findFirstRoot", "p0", "p3", "findFirstCubicRoot", "(FFFF)F", "", "roots", "", "index", "Landroidx/collection/FloatFloatPair;", "computeHorizontalBounds", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "p0y", "p1y", "p2y", "p3y", "computeCubicVerticalBounds", "(FFFF[FI)J", "", "b", "", "closeTo", "(DD)Z", "(FF)Z", "points", "x", "y", "lineWinding", "([FFF)I", "tmpQuadratics", "tmpRoots", "quadraticWinding", "([FFF[F[F)I", "tmpCubics", "cubicWinding", "x0", "y0", "x1", "y1", "x2", "y2", "x3", "y3", "cubicArea", "(FFFFFFFF)F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1119:1\n229#1:1120\n570#1,7:1121\n570#1,7:1128\n570#1,7:1135\n570#1,7:1142\n570#1,7:1149\n559#1:1156\n559#1:1157\n559#1:1158\n570#1,7:1159\n570#1,7:1166\n570#1,7:1173\n570#1,7:1196\n570#1,7:1203\n570#1,7:1210\n570#1,7:1217\n570#1,7:1224\n570#1,7:1231\n358#1:1238\n358#1:1239\n1093#1:1240\n1093#1:1241\n1107#1:1242\n1107#1:1243\n358#1:1244\n570#1,7:1245\n562#1:1252\n562#1:1255\n97#2,16:1180\n49#2:1253\n60#2:1254\n71#2,16:1256\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n200#1:1120\n200#1:1121,7\n229#1:1128,7\n253#1:1135,7\n256#1:1142,7\n258#1:1149,7\n292#1:1156\n294#1:1157\n296#1:1158\n299#1:1159,7\n304#1:1166,7\n307#1:1173,7\n328#1:1196,7\n331#1:1203,7\n334#1:1210,7\n338#1:1217,7\n341#1:1224,7\n348#1:1231,7\n441#1:1238\n460#1:1239\n483#1:1240\n484#1:1241\n510#1:1242\n511#1:1243\n543#1:1244\n585#1:1245,7\n725#1:1252\n909#1:1255\n324#1:1180,16\n888#1:1253\n891#1:1254\n949#1:1256,16\n*E\n"})
public final class BezierKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.Move.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Line.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Quadratic.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Conic.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Cubic.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Close.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Done.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final float a(float f, float f1, float f2, float f3, float f4) {
        return ((((f1 - f2) * 3.0f + f3 - f) * f4 + (f2 - 2.0f * f1 + f) * 3.0f) * f4 + (f1 - f) * 3.0f) * f4 + f;
    }

    public static final float b(float f, float f1, float f2, float f3) {
        return ((f2 - f1 * 2.0f + f) * f3 + (f1 - f) * 2.0f) * f3 + f;
    }

    public static final int c(PathSegment pathSegment0, boolean z, float[] arr_f, int v) {
        float[] arr_f1 = pathSegment0.getPoints();
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
            case 3: {
                float f = arr_f1[!z + 2];
                float f1 = (f - arr_f1[!z]) * 2.0f;
                return BezierKt.h(-f1 / ((arr_f1[!z + 4] - f) * 2.0f - f1), arr_f, v);
            }
            case 5: {
                float f2 = arr_f1[!z + 2];
                float f3 = (f2 - arr_f1[!z]) * 3.0f;
                float f4 = arr_f1[!z + 4];
                float f5 = (f4 - f2) * 3.0f;
                float f6 = (arr_f1[!z + 6] - f4) * 3.0f;
                int v1 = BezierKt.d(f3, f5, f6, v, arr_f);
                float f7 = (f5 - f3) * 2.0f;
                return BezierKt.h(-f7 / ((f6 - f5) * 2.0f - f7), arr_f, v + v1) + v1;
            }
            case 1: 
            case 2: 
            case 4: 
            case 6: 
            case 7: {
                return 0;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean closeTo(double f, double f1) {
        return Math.abs(f - f1) < 1.000000E-07;
    }

    public static final boolean closeTo(float f, float f1) {
        return Math.abs(f - f1) < 0.000001f;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeCubicVerticalBounds(float f, float f1, float f2, float f3, @NotNull float[] arr_f, int v) {
        float f4 = (f1 - f) * 3.0f;
        float f5 = (f2 - f1) * 3.0f;
        float f6 = (f3 - f2) * 3.0f;
        int v1 = BezierKt.d(f4, f5, f6, v, arr_f);
        float f7 = (f5 - f4) * 2.0f;
        int v2 = BezierKt.h(-f7 / ((f6 - f5) * 2.0f - f7), arr_f, v + v1);
        float f8 = Math.min(f, f3);
        float f9 = Math.max(f, f3);
        for(int v3 = 0; v3 < v2 + v1; ++v3) {
            float f10 = BezierKt.a(f, f1, f2, f3, arr_f[v3]);
            f8 = Math.min(f8, f10);
            f9 = Math.max(f9, f10);
        }
        return FloatFloatPair.constructor-impl(f8, f9);
    }

    public static long computeCubicVerticalBounds$default(float f, float f1, float f2, float f3, float[] arr_f, int v, int v1, Object object0) {
        if((v1 & 0x20) != 0) {
            v = 0;
        }
        return BezierKt.computeCubicVerticalBounds(f, f1, f2, f3, arr_f, v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeHorizontalBounds(@NotNull PathSegment pathSegment0, @NotNull float[] arr_f, int v) {
        int v1 = BezierKt.c(pathSegment0, true, arr_f, v);
        float f = Math.min(pathSegment0.getPoints()[0], BezierKt.e(pathSegment0));
        float f1 = Math.max(pathSegment0.getPoints()[0], BezierKt.e(pathSegment0));
        for(int v2 = 0; v2 < v1; ++v2) {
            float f2 = arr_f[v2];
            float[] arr_f1 = pathSegment0.getPoints();
            float f3 = NaNf;
            switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
                case 1: {
                    f3 = arr_f1[0];
                    break;
                }
                case 2: {
                    float f4 = arr_f1[0];
                    f3 = q.a(arr_f1[2], f4, f2, f4);
                    break;
                }
                case 3: {
                    f3 = BezierKt.b(arr_f1[0], arr_f1[2], arr_f1[4], f2);
                    break;
                }
                case 5: {
                    f3 = BezierKt.a(arr_f1[0], arr_f1[2], arr_f1[4], arr_f1[6], f2);
                    break;
                }
                case 4: 
                case 6: 
                case 7: {
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = Math.min(f, f3);
            f1 = Math.max(f1, f3);
        }
        return FloatFloatPair.constructor-impl(f, f1);
    }

    public static long computeHorizontalBounds$default(PathSegment pathSegment0, float[] arr_f, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return BezierKt.computeHorizontalBounds(pathSegment0, arr_f, v);
    }

    public static final long computeVerticalBounds(@NotNull PathSegment pathSegment0, @NotNull float[] arr_f, int v) {
        int v2 = BezierKt.c(pathSegment0, false, arr_f, v);
        float f = Math.min(pathSegment0.getPoints()[1], BezierKt.f(pathSegment0));
        float f1 = Math.max(pathSegment0.getPoints()[1], BezierKt.f(pathSegment0));
        for(int v1 = 0; v1 < v2; ++v1) {
            float f2 = BezierKt.evaluateY(pathSegment0, arr_f[v1]);
            f = Math.min(f, f2);
            f1 = Math.max(f1, f2);
        }
        return FloatFloatPair.constructor-impl(f, f1);
    }

    public static long computeVerticalBounds$default(PathSegment pathSegment0, float[] arr_f, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return BezierKt.computeVerticalBounds(pathSegment0, arr_f, v);
    }

    public static final float cubicArea(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        return ((f / 3.0f + f4) * f7 + ((f - f4) * f3 + ((f2 + f4) * (f7 - f1) - (f3 + f5) * (f6 - f)) - (f1 - f5) * f2) - (f1 / 3.0f + f5) * f6) * 3.0f / 20.0f;
    }

    public static final int cubicWinding(@NotNull float[] arr_f, float f, float f1, @NotNull float[] arr_f1, @NotNull float[] arr_f2) {
        int v7;
        float f2 = arr_f[1];
        float f3 = arr_f[3];
        float f4 = arr_f[5];
        int v = BezierKt.d(q.a(f3, f4, 3.0f, arr_f[7] - f2), (f2 - f3 - f3 - f4) * 2.0f, f3 - f2, 0, arr_f2);
        if(v == 0) {
            ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, 0, 0, 8);
        }
        else {
            int v1 = 0;
            int v2 = 0;
            float f5 = 0.0f;
            while(v1 < v) {
                float f6 = (arr_f2[v1] - f5) / (1.0f - f5);
                if(f6 < 0.0f) {
                    f6 = 0.0f;
                }
                f5 = f6 > 1.0f ? 1.0f : f6;
                if(f5 >= 1.0f) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, v2, v2, 8);
                    float f7 = arr_f[v2 + 6];
                    float f8 = arr_f[v2 + 7];
                    arr_f1[v2 + 8] = f7;
                    arr_f1[v2 + 9] = f8;
                    arr_f1[v2 + 10] = f7;
                    arr_f1[v2 + 11] = f8;
                    arr_f1[v2 + 12] = f7;
                    arr_f1[v2 + 13] = f8;
                }
                else {
                    float f9 = arr_f[v2];
                    float f10 = arr_f[v2 + 1];
                    arr_f1[v2] = f9;
                    arr_f1[v2 + 1] = f10;
                    float f11 = arr_f[v2 + 2];
                    float f12 = arr_f[v2 + 3];
                    float f13 = f5 * f11 + (1.0f - f5) * f9;
                    float f14 = f5 * f12 + (1.0f - f5) * f10;
                    arr_f1[v2 + 2] = f13;
                    arr_f1[v2 + 3] = f14;
                    float f15 = arr_f[v2 + 4];
                    float f16 = arr_f[v2 + 5];
                    float f17 = f5 * f15 + (1.0f - f5) * f11;
                    float f18 = f5 * f16 + (1.0f - f5) * f12;
                    float f19 = f5 * f17 + (1.0f - f5) * f13;
                    float f20 = f5 * f18 + (1.0f - f5) * f14;
                    arr_f1[v2 + 4] = f19;
                    arr_f1[v2 + 5] = f20;
                    float f21 = arr_f[v2 + 6];
                    float f22 = arr_f[v2 + 7];
                    float f23 = f5 * f21 + (1.0f - f5) * f15;
                    float f24 = f5 * f22 + (1.0f - f5) * f16;
                    float f25 = f5 * f23 + (1.0f - f5) * f17;
                    float f26 = f5 * f24 + (1.0f - f5) * f18;
                    arr_f1[v2 + 6] = f5 * f25 + (1.0f - f5) * f19;
                    arr_f1[v2 + 7] = f5 * f26 + (1.0f - f5) * f20;
                    arr_f1[v2 + 8] = f25;
                    arr_f1[v2 + 9] = f26;
                    arr_f1[v2 + 10] = f23;
                    arr_f1[v2 + 11] = f24;
                    arr_f1[v2 + 12] = f21;
                    arr_f1[v2 + 13] = f22;
                }
                v2 += 6;
                ++v1;
                arr_f = arr_f1;
            }
        }
        if(v >= 0) {
            int v3 = 0;
            for(int v4 = 0; true; ++v4) {
                int v5 = v4 * 6 + 1;
                float f27 = arr_f1[v5];
                int v6 = v4 * 6 + 7;
                float f28 = arr_f1[v6];
                if(f27 > f28) {
                    v7 = -1;
                    float f29 = f28;
                    f28 = f27;
                    f27 = f29;
                }
                else {
                    v7 = 1;
                }
                if(f1 < f27 || f1 >= f28) {
                    v7 = 0;
                }
                else {
                    float f30 = arr_f1[v4 * 6];
                    float f31 = arr_f1[v4 * 6 + 2];
                    float f32 = arr_f1[v4 * 6 + 4];
                    float f33 = arr_f1[v4 * 6 + 6];
                    if(f < Math.min(f30, Math.min(f31, Math.min(f32, f33)))) {
                        v7 = 0;
                    }
                    else if(f <= Math.max(f30, Math.max(f31, Math.max(f32, f33)))) {
                        float f34 = arr_f1[v5];
                        float f35 = arr_f1[v4 * 6 + 3];
                        float f36 = arr_f1[v4 * 6 + 5];
                        float f37 = arr_f1[v6];
                        float f38 = BezierKt.findFirstCubicRoot(f34 - f1, f35 - f1, f36 - f1, f37 - f1);
                        if(Float.isNaN(f38)) {
                            v7 = 0;
                        }
                        else {
                            float f39 = BezierKt.a(f30, f31, f32, f33, f38);
                            if(Math.abs(f39 - f) < 0.000001f && (f != f33 || f1 != f37) || f39 >= f) {
                                v7 = 0;
                            }
                        }
                    }
                }
                v3 += v7;
                if(v4 == v) {
                    break;
                }
            }
            return v3;
        }
        return 0;
    }

    public static final int d(float f, float f1, float f2, int v, float[] arr_f) {
        double f3 = ((double)f) - ((double)f1) * 2.0 + ((double)f2);
        if(f3 == 0.0) {
            return ((double)f1) == ((double)f2) ? 0 : BezierKt.h(((float)((((double)f1) * 2.0 - ((double)f2)) / (((double)f1) * 2.0 - ((double)f2) * 2.0))), arr_f, v);
        }
        double f4 = Math.sqrt(((double)f1) * ((double)f1) - ((double)f2) * ((double)f));
        double f5 = ((double)f1) - ((double)f);
        int v1 = BezierKt.h(((float)(-(f5 - f4) / f3)), arr_f, v);
        int v2 = v1 + BezierKt.h(((float)((-f4 - f5) / f3)), arr_f, v + v1);
        if(v2 > 1) {
            float f6 = arr_f[v];
            float f7 = arr_f[v + 1];
            if(f6 > f7) {
                arr_f[v] = f7;
                arr_f[v + 1] = f6;
                return v2;
            }
            return f6 == f7 ? v2 - 1 : v2;
        }
        return v2;
    }

    public static final float e(PathSegment pathSegment0) {
        float[] arr_f = pathSegment0.getPoints();
        int v = 4;
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
            case 2: {
                v = 2;
                break;
            }
            case 3: 
            case 4: {
                break;
            }
            case 5: {
                return arr_f[6];
            }
            case 1: 
            case 6: 
            case 7: {
                return arr_f[0];
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return arr_f[v];
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateCubic(float f, float f1, float f2) {
        return (((f - f1 + 0.333333f) * f2 + (f1 - 2.0f * f)) * f2 + f) * 3.0f * f2;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateY(@NotNull PathSegment pathSegment0, float f) {
        float[] arr_f = pathSegment0.getPoints();
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
            case 1: {
                return arr_f[1];
            }
            case 2: {
                float f1 = arr_f[1];
                return q.a(arr_f[3], f1, f, f1);
            }
            case 3: {
                return BezierKt.b(arr_f[1], arr_f[3], arr_f[5], f);
            }
            case 5: {
                return BezierKt.a(arr_f[1], arr_f[3], arr_f[5], arr_f[7], f);
            }
            case 4: 
            case 6: 
            case 7: {
                return NaNf;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final float f(PathSegment pathSegment0) {
        float[] arr_f = pathSegment0.getPoints();
        int v = 5;
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
            case 2: {
                v = 3;
                break;
            }
            case 3: 
            case 4: {
                break;
            }
            case 5: {
                return arr_f[7];
            }
            case 1: 
            case 6: 
            case 7: {
                return arr_f[0];
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return arr_f[v];
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstCubicRoot(float f, float f1, float f2, float f3) {
        double f4 = (((double)f) - ((double)f1) * 2.0 + ((double)f2)) * 3.0;
        double f5 = ((double)(f1 - f)) * 3.0;
        double f6 = ((double)(f1 - f2)) * 3.0 + ((double)(-f)) + ((double)f3);
        if(Double.compare(Math.abs(f6 - 0.0), 1.000000E-07) < 0) {
            if(Math.abs(f4 - 0.0) < 1.000000E-07) {
                if(Math.abs(f5 - 0.0) < 1.000000E-07) {
                    return NaNf;
                }
                float f7 = (float)(-((double)f) / f5);
                if(f7 < 0.0f) {
                    return f7 >= -0.000001f ? 0.0f : NaNf;
                }
                if(f7 > 1.0f) {
                    return f7 <= 1.000001f ? 1.0f : NaNf;
                }
                return f7;
            }
            double f8 = Math.sqrt(f5 * f5 - 4.0 * f4 * ((double)f));
            float f9 = (float)((f8 - f5) / (f4 * 2.0));
            if(f9 >= 0.0f) {
                if(f9 > 1.0f) {
                    f9 = f9 <= 1.000001f ? 1.0f : NaNf;
                }
            }
            else if(f9 >= -0.000001f) {
                f9 = 0.0f;
            }
            else {
                f9 = NaNf;
            }
            if(!Float.isNaN(f9)) {
                return f9;
            }
            float f10 = (float)((-f5 - f8) / (f4 * 2.0));
            if(f10 < 0.0f) {
                return f10 >= -0.000001f ? 0.0f : NaNf;
            }
            if(f10 > 1.0f) {
                return f10 <= 1.000001f ? 1.0f : NaNf;
            }
            return f10;
        }
        double f11 = f4 / f6;
        double f12 = f5 / f6;
        double f13 = (f12 * 3.0 - f11 * f11) / 9.0;
        double f14 = (((double)f) / f6 * 27.0 + (2.0 * f11 * f11 * f11 - 9.0 * f11 * f12)) / 54.0;
        double f15 = f13 * f13 * f13;
        double f16 = f14 * f14 + f15;
        int v = Double.compare(f16, 0.0);
        if(v < 0) {
            double f17 = Math.sqrt(-f15);
            double f18 = -f14 / f17;
            if(f18 < -1.0) {
                f18 = -1.0;
            }
            if(f18 > 1.0) {
                f18 = 1.0;
            }
            double f19 = Math.acos(f18);
            float f20 = MathHelpersKt.fastCbrt(((float)f17));
            float f21 = (float)(Math.cos(f19 / 3.0) * ((double)(f20 * 2.0f)) - f11 / 3.0);
            if(f21 >= 0.0f) {
                if(f21 > 1.0f) {
                    f21 = f21 <= 1.000001f ? 1.0f : NaNf;
                }
            }
            else if(f21 >= -0.000001f) {
                f21 = 0.0f;
            }
            else {
                f21 = NaNf;
            }
            if(!Float.isNaN(f21)) {
                return f21;
            }
            float f22 = (float)(Math.cos((f19 + 6.283185) / 3.0) * ((double)(f20 * 2.0f)) - f11 / 3.0);
            if(f22 >= 0.0f) {
                if(f22 > 1.0f) {
                    f22 = f22 <= 1.000001f ? 1.0f : NaNf;
                }
            }
            else if(f22 >= -0.000001f) {
                f22 = 0.0f;
            }
            else {
                f22 = NaNf;
            }
            if(!Float.isNaN(f22)) {
                return f22;
            }
            float f23 = (float)(Math.cos((f19 + 12.566371) / 3.0) * ((double)(f20 * 2.0f)) - f11 / 3.0);
            if(f23 < 0.0f) {
                return f23 >= -0.000001f ? 0.0f : NaNf;
            }
            if(f23 > 1.0f) {
                return f23 <= 1.000001f ? 1.0f : NaNf;
            }
            return f23;
        }
        if(v == 0) {
            float f24 = MathHelpersKt.fastCbrt(((float)f14));
            float f25 = 2.0f * -f24 - ((float)(f11 / 3.0));
            if(f25 >= 0.0f) {
                if(f25 > 1.0f) {
                    f25 = f25 <= 1.000001f ? 1.0f : NaNf;
                }
            }
            else if(f25 >= -0.000001f) {
                f25 = 0.0f;
            }
            else {
                f25 = NaNf;
            }
            if(!Float.isNaN(f25)) {
                return f25;
            }
            float f26 = --f24 - ((float)(f11 / 3.0));
            if(f26 < 0.0f) {
                return f26 >= -0.000001f ? 0.0f : NaNf;
            }
            if(f26 > 1.0f) {
                return f26 <= 1.000001f ? 1.0f : NaNf;
            }
            return f26;
        }
        double f27 = Math.sqrt(f16);
        float f28 = (float)(((double)(MathHelpersKt.fastCbrt(((float)(f27 - f14))) - MathHelpersKt.fastCbrt(((float)(f14 + f27))))) - f11 / 3.0);
        if(f28 < 0.0f) {
            return f28 >= -0.000001f ? 0.0f : NaNf;
        }
        if(f28 > 1.0f) {
            return f28 <= 1.000001f ? 1.0f : NaNf;
        }
        return f28;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstRoot(@NotNull PathSegment pathSegment0, float f) {
        float f7;
        double f6;
        double f5;
        float f4;
        float f3;
        float[] arr_f = pathSegment0.getPoints();
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
            case 2: {
                float f1 = arr_f[0] - f;
                float f2 = -f1 / (arr_f[2] - f - f1);
                if(f2 < 0.0f) {
                    return f2 >= -0.000001f ? 0.0f : NaNf;
                }
                if(f2 > 1.0f) {
                    return f2 <= 1.000001f ? 1.0f : NaNf;
                }
                return f2;
            }
            case 3: {
                f3 = arr_f[0] - f;
                f4 = arr_f[2] - f;
                f5 = (double)(arr_f[4] - f);
                f6 = ((double)f3) - ((double)f4) * 2.0 + f5;
                if(f6 == 0.0) {
                    if(((double)f4) == f5) {
                        return NaNf;
                    }
                    f7 = (float)((((double)f4) * 2.0 - f5) / (((double)f4) * 2.0 - f5 * 2.0));
                    if(f7 < 0.0f) {
                        return f7 >= -0.000001f ? 0.0f : NaNf;
                    }
                    if(f7 > 1.0f) {
                        return f7 <= 1.000001f ? 1.0f : NaNf;
                    }
                }
                else {
                    goto label_23;
                }
                return f7;
            }
            case 5: {
                return BezierKt.findFirstCubicRoot(arr_f[0] - f, arr_f[2] - f, arr_f[4] - f, arr_f[6] - f);
            }
            case 1: 
            case 4: 
            case 6: 
            case 7: {
                return NaNf;
            label_23:
                double f8 = Math.sqrt(((double)f4) * ((double)f4) - f5 * ((double)f3));
                double f9 = ((double)f4) - ((double)f3);
                float f10 = (float)(-(f9 - f8) / f6);
                if(f10 >= 0.0f) {
                    if(f10 > 1.0f) {
                        f10 = f10 <= 1.000001f ? 1.0f : NaNf;
                    }
                }
                else if(f10 >= -0.000001f) {
                    f10 = 0.0f;
                }
                else {
                    f10 = NaNf;
                }
                if(!Float.isNaN(f10)) {
                    return f10;
                }
                f7 = (float)((-f8 - f9) / f6);
                if(f7 < 0.0f) {
                    return f7 >= -0.000001f ? 0.0f : NaNf;
                }
                if(f7 > 1.0f) {
                    return f7 <= 1.000001f ? 1.0f : NaNf;
                }
                return f7;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final int g(float[] arr_f, int v, float[] arr_f1, float f, float f1) {
        float f5;
        float f4;
        int v1;
        float f2 = arr_f[v + 1];
        float f3 = arr_f[v + 5];
        if(f2 > f3) {
            v1 = -1;
            f4 = f2;
            f5 = f3;
        }
        else {
            v1 = 1;
            f5 = f2;
            f4 = f3;
        }
        if(Float.compare(f1, f5) >= 0 && f1 < f4) {
            float f6 = arr_f[v + 3];
            float f7 = BezierKt.d(f2 - f6 * 2.0f + f3, (f6 - f2) * 2.0f, f2 - f1, 0, arr_f1) == 0 ? arr_f[(1 - v1) * 2] : BezierKt.b(arr_f[0], arr_f[2], arr_f[4], arr_f1[0]);
            if(Math.abs(f7 - f) < 0.000001f && (f != arr_f[4] || f1 != f3)) {
                return 0;
            }
            return f7 < f ? v1 : 0;
        }
        return 0;
    }

    public static final int h(float f, float[] arr_f, int v) {
        if(Float.compare(f, 0.0f) >= 0) {
            if(f > 1.0f) {
                f = f <= 1.000001f ? 0.0f : NaNf;
            }
        }
        else if(f >= -0.000001f) {
            f = 0.0f;
        }
        else {
            f = NaNf;
        }
        arr_f[v] = f;
        return !Float.isNaN(f);
    }

    public static final int lineWinding(@NotNull float[] arr_f, float f, float f1) {
        float f7;
        int v;
        float f2 = arr_f[0];
        float f3 = arr_f[1];
        float f4 = arr_f[2];
        float f5 = arr_f[3];
        float f6 = f5 - f3;
        if(f3 > f5) {
            v = -1;
            f7 = f3;
        }
        else {
            v = 1;
            f7 = f5;
            f5 = f3;
        }
        if(f1 >= f5 && f1 < f7) {
            float f8 = (f1 - f3) * (f4 - f2) - (f - f2) * f6;
            return f8 == 0.0f || ((int)Math.signum(f8)) == v ? 0 : v;
        }
        return 0;
    }

    public static final int quadraticWinding(@NotNull float[] arr_f, float f, float f1, @NotNull float[] arr_f1, @NotNull float[] arr_f2) {
        float f9;
        float f8;
        int v = 1;
        if(Float.compare(Math.signum(arr_f[3] - arr_f[5]) + Math.signum(arr_f[1] - arr_f[3]), 0.0f) != 0) {
            return BezierKt.g(arr_f, 0, arr_f2, f, f1);
        }
        float f2 = arr_f[1];
        float f3 = arr_f[3];
        float f4 = arr_f[5];
        float f5 = f2 - f3;
        float f6 = f3 - f4;
        if(Math.signum(f6) + Math.signum(f5) == 0.0f) {
            float f7 = f5 - f3 + f4;
            if(f5 < 0.0f) {
                f8 = -f5;
                f7 = -f7;
            }
            else {
                f8 = f5;
            }
            if(Float.compare(f7, 0.0f) != 0 && f8 != 0.0f && f8 < f7) {
                f9 = f8 / f7;
                if(f9 == 0.0f) {
                    f9 = NaNf;
                }
            }
            else {
                f9 = NaNf;
            }
            if(Float.isNaN(f9)) {
                if(Math.abs(f5) >= Math.abs(f6)) {
                    f2 = f4;
                }
                f3 = f2;
                ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, 0, 0, 6);
                arr_f1[3] = f3;
                v = 0;
            }
            else {
                float f10 = arr_f[0];
                float f11 = arr_f[1];
                float f12 = arr_f[2];
                float f13 = arr_f[3];
                float f14 = arr_f[4];
                float f15 = arr_f[5];
                float f16 = f9 * f12 + (1.0f - f9) * f10;
                float f17 = f9 * f13 + (1.0f - f9) * f11;
                arr_f1[0] = f10;
                arr_f1[1] = f11;
                arr_f1[2] = f16;
                arr_f1[3] = f17;
                float f18 = f9 * f14 + (1.0f - f9) * f12;
                float f19 = f9 * f15 + (1.0f - f9) * f13;
                arr_f1[4] = f9 * f18 + (1.0f - f9) * f16;
                arr_f1[5] = f9 * f19 + (1.0f - f9) * f17;
                arr_f1[6] = f18;
                arr_f1[7] = f19;
                arr_f1[8] = f14;
                arr_f1[9] = f15;
            }
        }
        else {
            ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, 0, 0, 6);
            arr_f1[3] = f3;
            v = 0;
        }
        int v1 = BezierKt.g(arr_f1, 0, arr_f2, f, f1);
        return v <= 0 ? v1 : v1 + BezierKt.g(arr_f1, 4, arr_f2, f, f1);
    }
}

