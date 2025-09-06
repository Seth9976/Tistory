package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\u001A!\u0010\u0004\u001A\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001A\u0010\u000B\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", "target", "toPath", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "", "a", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n588#1:596\n33#2,6:590\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n441#1:596\n211#1:590,6\n*E\n"})
public final class PathParserKt {
    public static final float[] a;

    static {
        PathParserKt.a = new float[0];
    }

    public static final void a(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, boolean z, boolean z1) {
        double f25;
        double f24;
        double f7 = f6 / 180.0 * 3.141593;
        double f8 = Math.cos(f7);
        double f9 = Math.sin(f7);
        double f10 = (f1 * f9 + f * f8) / f4;
        double f11 = (f1 * f8 + -f * f9) / f5;
        double f12 = (f3 * f9 + f2 * f8) / f4;
        double f13 = (f3 * f8 + -f2 * f9) / f5;
        double f14 = f10 - f12;
        double f15 = f11 - f13;
        double f16 = (f10 + f12) / 2.0;
        double f17 = (f11 + f13) / 2.0;
        double f18 = f15 * f15 + f14 * f14;
        if(f18 == 0.0) {
            return;
        }
        double f19 = 1.0 / f18 - 0.25;
        if(f19 < 0.0) {
            double f20 = (double)(((float)(Math.sqrt(f18) / 1.99999)));
            PathParserKt.a(path0, f, f1, f2, f3, f4 * f20, f5 * f20, f6, z, z1);
            return;
        }
        double f21 = Math.sqrt(f19);
        double f22 = f14 * f21;
        double f23 = f21 * f15;
        if(z == z1) {
            f24 = f16 - f23;
            f25 = f17 + f22;
        }
        else {
            f24 = f16 + f23;
            f25 = f17 - f22;
        }
        double f26 = Math.atan2(f11 - f25, f10 - f24);
        double f27 = Math.atan2(f13 - f25, f12 - f24) - f26;
        int v = Double.compare(f27, 0.0);
        if(z1 != v >= 0) {
            f27 = v <= 0 ? f27 + 6.283185 : f27 - 6.283185;
        }
        double f28 = f24 * f4;
        double f29 = f25 * f5;
        int v1 = (int)Math.ceil(Math.abs(f27 * 4.0 / 3.141593));
        double f30 = Math.cos(f7);
        double f31 = Math.sin(f7);
        double f32 = Math.cos(f26);
        double f33 = Math.sin(f26);
        double f34 = -f4 * f30;
        double f35 = f5 * f31;
        double f36 = -f4 * f31;
        double f37 = f5 * f30;
        double f38 = f;
        double f39 = f26;
        double f40 = f34 * f33 - f35 * f32;
        int v2 = 0;
        double f41 = f32 * f37 + f33 * f36;
        double f42 = f1;
        while(v2 < v1) {
            double f43 = f39 + f27 / ((double)v1);
            double f44 = Math.sin(f43);
            double f45 = Math.cos(f43);
            double f46 = f4 * f30 * f45 + (f28 * f8 - f29 * f9) - f35 * f44;
            double f47 = f37 * f44 + (f4 * f31 * f45 + (f29 * f8 + f28 * f9));
            double f48 = f34 * f44 - f35 * f45;
            double f49 = f45 * f37 + f44 * f36;
            double f50 = f43 - f39;
            double f51 = Math.tan(f50 / 2.0);
            double f52 = (Math.sqrt(3.0 * f51 * f51 + 4.0) - 1.0) * Math.sin(f50) / 3.0;
            path0.cubicTo(((float)(f40 * f52 + f38)), ((float)(f41 * f52 + f42)), ((float)(f46 - f52 * f48)), ((float)(f47 - f52 * f49)), ((float)f46), ((float)f47));
            ++v2;
            f38 = f46;
            f42 = f47;
            f39 = f43;
            f41 = f49;
            f40 = f48;
        }
    }

    @NotNull
    public static final float[] getEmptyArray() {
        return PathParserKt.a;
    }

    @NotNull
    public static final Path toPath(@NotNull List list0, @NotNull Path path0) {
        float f16;
        float f15;
        float f14;
        float f13;
        float f12;
        float f11;
        float f10;
        float f9;
        float f8;
        float f7;
        float f6;
        int v4;
        int v3;
        PathNode pathNode2;
        int v = path0.getFillType-Rg-k1Os();
        path0.rewind();
        path0.setFillType-oQ8Xj4U(v);
        PathNode pathNode0 = list0.isEmpty() ? Close.INSTANCE : ((PathNode)list0.get(0));
        int v1 = list0.size();
        int v2 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while(v2 < v1) {
            PathNode pathNode1 = (PathNode)list0.get(v2);
            if(pathNode1 instanceof Close) {
                path0.close();
                pathNode2 = pathNode1;
                v3 = v2;
                v4 = v1;
                f = f4;
                f2 = f;
                f1 = f5;
                f3 = f1;
            }
            else if(pathNode1 instanceof RelativeMoveTo) {
                f6 = ((RelativeMoveTo)pathNode1).getDx() + f2;
                f7 = ((RelativeMoveTo)pathNode1).getDy() + f3;
                path0.relativeMoveTo(((RelativeMoveTo)pathNode1).getDx(), ((RelativeMoveTo)pathNode1).getDy());
                goto label_36;
            }
            else if(pathNode1 instanceof MoveTo) {
                f6 = ((MoveTo)pathNode1).getX();
                f7 = ((MoveTo)pathNode1).getY();
                path0.moveTo(((MoveTo)pathNode1).getX(), ((MoveTo)pathNode1).getY());
            label_36:
                f2 = f6;
                f4 = f2;
                f3 = f7;
                f5 = f3;
                goto label_124;
            }
            else if(pathNode1 instanceof RelativeLineTo) {
                path0.relativeLineTo(((RelativeLineTo)pathNode1).getDx(), ((RelativeLineTo)pathNode1).getDy());
                f8 = ((RelativeLineTo)pathNode1).getDx() + f2;
                f3 = ((RelativeLineTo)pathNode1).getDy() + f3;
                f2 = f8;
                goto label_124;
            }
            else if(pathNode1 instanceof LineTo) {
                path0.lineTo(((LineTo)pathNode1).getX(), ((LineTo)pathNode1).getY());
                f8 = ((LineTo)pathNode1).getX();
                f3 = ((LineTo)pathNode1).getY();
                f2 = f8;
                goto label_124;
            }
            else if(pathNode1 instanceof RelativeHorizontalTo) {
                path0.relativeLineTo(((RelativeHorizontalTo)pathNode1).getDx(), 0.0f);
                f2 = ((RelativeHorizontalTo)pathNode1).getDx() + f2;
                goto label_124;
            }
            else if(pathNode1 instanceof HorizontalTo) {
                path0.lineTo(((HorizontalTo)pathNode1).getX(), f3);
                f2 = ((HorizontalTo)pathNode1).getX();
                goto label_124;
            }
            else if(pathNode1 instanceof RelativeVerticalTo) {
                path0.relativeLineTo(0.0f, ((RelativeVerticalTo)pathNode1).getDy());
                f3 = ((RelativeVerticalTo)pathNode1).getDy() + f3;
                goto label_124;
            }
            else if(pathNode1 instanceof VerticalTo) {
                path0.lineTo(f2, ((VerticalTo)pathNode1).getY());
                f3 = ((VerticalTo)pathNode1).getY();
                goto label_124;
            }
            else if(pathNode1 instanceof RelativeCurveTo) {
                path0.relativeCubicTo(((RelativeCurveTo)pathNode1).getDx1(), ((RelativeCurveTo)pathNode1).getDy1(), ((RelativeCurveTo)pathNode1).getDx2(), ((RelativeCurveTo)pathNode1).getDy2(), ((RelativeCurveTo)pathNode1).getDx3(), ((RelativeCurveTo)pathNode1).getDy3());
                f9 = ((RelativeCurveTo)pathNode1).getDx2() + f2;
                f10 = ((RelativeCurveTo)pathNode1).getDy2() + f3;
                f2 = ((RelativeCurveTo)pathNode1).getDx3() + f2;
                f3 = ((RelativeCurveTo)pathNode1).getDy3() + f3;
                goto label_141;
            }
            else if(pathNode1 instanceof CurveTo) {
                path0.cubicTo(((CurveTo)pathNode1).getX1(), ((CurveTo)pathNode1).getY1(), ((CurveTo)pathNode1).getX2(), ((CurveTo)pathNode1).getY2(), ((CurveTo)pathNode1).getX3(), ((CurveTo)pathNode1).getY3());
                f9 = ((CurveTo)pathNode1).getX2();
                f10 = ((CurveTo)pathNode1).getY2();
                f2 = ((CurveTo)pathNode1).getX3();
                f3 = ((CurveTo)pathNode1).getY3();
                goto label_141;
            }
            else if(pathNode1 instanceof RelativeReflectiveCurveTo) {
                if(pathNode0.isCurve()) {
                    f11 = f3 - f1;
                    f12 = f2 - f;
                }
                else {
                    f12 = 0.0f;
                    f11 = 0.0f;
                }
                path0.relativeCubicTo(f12, f11, ((RelativeReflectiveCurveTo)pathNode1).getDx1(), ((RelativeReflectiveCurveTo)pathNode1).getDy1(), ((RelativeReflectiveCurveTo)pathNode1).getDx2(), ((RelativeReflectiveCurveTo)pathNode1).getDy2());
                f9 = ((RelativeReflectiveCurveTo)pathNode1).getDx1() + f2;
                f10 = ((RelativeReflectiveCurveTo)pathNode1).getDy1() + f3;
                f2 = ((RelativeReflectiveCurveTo)pathNode1).getDx2() + f2;
                f3 = ((RelativeReflectiveCurveTo)pathNode1).getDy2() + f3;
                goto label_141;
            }
            else if(pathNode1 instanceof ReflectiveCurveTo) {
                if(pathNode0.isCurve()) {
                    f13 = 2.0f * f3 - f1;
                    f14 = f2 * 2.0f - f;
                }
                else {
                    f14 = f2;
                    f13 = f3;
                }
                path0.cubicTo(f14, f13, ((ReflectiveCurveTo)pathNode1).getX1(), ((ReflectiveCurveTo)pathNode1).getY1(), ((ReflectiveCurveTo)pathNode1).getX2(), ((ReflectiveCurveTo)pathNode1).getY2());
                f9 = ((ReflectiveCurveTo)pathNode1).getX1();
                f10 = ((ReflectiveCurveTo)pathNode1).getY1();
                f2 = ((ReflectiveCurveTo)pathNode1).getX2();
                f3 = ((ReflectiveCurveTo)pathNode1).getY2();
                goto label_141;
            }
            else if(pathNode1 instanceof RelativeQuadTo) {
                path0.relativeQuadraticTo(((RelativeQuadTo)pathNode1).getDx1(), ((RelativeQuadTo)pathNode1).getDy1(), ((RelativeQuadTo)pathNode1).getDx2(), ((RelativeQuadTo)pathNode1).getDy2());
                f = ((RelativeQuadTo)pathNode1).getDx1() + f2;
                f1 = ((RelativeQuadTo)pathNode1).getDy1() + f3;
                f8 = ((RelativeQuadTo)pathNode1).getDx2() + f2;
                f3 = ((RelativeQuadTo)pathNode1).getDy2() + f3;
                f2 = f8;
                goto label_124;
            }
            else if(pathNode1 instanceof QuadTo) {
                path0.quadraticTo(((QuadTo)pathNode1).getX1(), ((QuadTo)pathNode1).getY1(), ((QuadTo)pathNode1).getX2(), ((QuadTo)pathNode1).getY2());
                f = ((QuadTo)pathNode1).getX1();
                f1 = ((QuadTo)pathNode1).getY1();
                f8 = ((QuadTo)pathNode1).getX2();
                f3 = ((QuadTo)pathNode1).getY2();
                f2 = f8;
            label_124:
                pathNode2 = pathNode1;
                v3 = v2;
                v4 = v1;
            }
            else if(pathNode1 instanceof RelativeReflectiveQuadTo) {
                if(pathNode0.isQuad()) {
                    f15 = f2 - f;
                    f16 = f3 - f1;
                }
                else {
                    f15 = 0.0f;
                    f16 = 0.0f;
                }
                path0.relativeQuadraticTo(f15, f16, ((RelativeReflectiveQuadTo)pathNode1).getDx(), ((RelativeReflectiveQuadTo)pathNode1).getDy());
                f9 = f15 + f2;
                f10 = f16 + f3;
                float f17 = ((RelativeReflectiveQuadTo)pathNode1).getDx();
                f3 = ((RelativeReflectiveQuadTo)pathNode1).getDy() + f3;
                f2 = f17 + f2;
            label_141:
                pathNode2 = pathNode1;
                v3 = v2;
                v4 = v1;
                f1 = f10;
                f = f9;
            }
            else if(pathNode1 instanceof ReflectiveQuadTo) {
                if(pathNode0.isQuad()) {
                    f2 = f2 * 2.0f - f;
                    f3 = 2.0f * f3 - f1;
                }
                path0.quadraticTo(f2, f3, ((ReflectiveQuadTo)pathNode1).getX(), ((ReflectiveQuadTo)pathNode1).getY());
                float f18 = ((ReflectiveQuadTo)pathNode1).getX();
                f1 = f3;
                pathNode2 = pathNode1;
                v3 = v2;
                v4 = v1;
                f3 = ((ReflectiveQuadTo)pathNode1).getY();
                float f19 = f2;
                f2 = f18;
                f = f19;
            }
            else if(pathNode1 instanceof RelativeArcTo) {
                float f20 = ((RelativeArcTo)pathNode1).getArcStartDx() + f2;
                float f21 = ((RelativeArcTo)pathNode1).getArcStartDy() + f3;
                pathNode2 = pathNode1;
                v3 = v2;
                v4 = v1;
                PathParserKt.a(path0, ((double)f2), ((double)f3), ((double)f20), ((double)f21), ((double)((RelativeArcTo)pathNode1).getHorizontalEllipseRadius()), ((double)((RelativeArcTo)pathNode1).getVerticalEllipseRadius()), ((double)((RelativeArcTo)pathNode1).getTheta()), ((RelativeArcTo)pathNode1).isMoreThanHalf(), ((RelativeArcTo)pathNode1).isPositiveArc());
                f1 = f21;
                f3 = f1;
                f = f20;
                f2 = f;
            }
            else {
                pathNode2 = pathNode1;
                v3 = v2;
                v4 = v1;
                if(pathNode2 instanceof ArcTo) {
                    PathParserKt.a(path0, ((double)f2), ((double)f3), ((double)((ArcTo)pathNode2).getArcStartX()), ((double)((ArcTo)pathNode2).getArcStartY()), ((double)((ArcTo)pathNode2).getHorizontalEllipseRadius()), ((double)((ArcTo)pathNode2).getVerticalEllipseRadius()), ((double)((ArcTo)pathNode2).getTheta()), ((ArcTo)pathNode2).isMoreThanHalf(), ((ArcTo)pathNode2).isPositiveArc());
                    f2 = ((ArcTo)pathNode2).getArcStartX();
                    f1 = ((ArcTo)pathNode2).getArcStartY();
                    f3 = f1;
                    f = f2;
                }
            }
            v2 = v3 + 1;
            pathNode0 = pathNode2;
            v1 = v4;
        }
        return path0;
    }

    public static Path toPath$default(List list0, Path path0, int v, Object object0) {
        if((v & 1) != 0) {
            path0 = AndroidPath_androidKt.Path();
        }
        return PathParserKt.toPath(list0, path0);
    }
}

