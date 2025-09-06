package d5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.graphics.PathParser.PathDataNode;
import java.util.ArrayList;

public final class k {
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final h g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final ArrayMap o;
    public static final Matrix p;

    static {
        k.p = new Matrix();
    }

    public k() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0xFF;
        this.m = null;
        this.n = null;
        this.o = new ArrayMap();
        this.g = new h();
        this.a = new Path();
        this.b = new Path();
    }

    public k(k k0) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0xFF;
        this.m = null;
        this.n = null;
        ArrayMap arrayMap0 = new ArrayMap();
        this.o = arrayMap0;
        this.g = new h(k0.g, arrayMap0);
        this.a = new Path(k0.a);
        this.b = new Path(k0.b);
        this.h = k0.h;
        this.i = k0.i;
        this.j = k0.j;
        this.k = k0.k;
        this.l = k0.l;
        this.m = k0.m;
        String s = k0.m;
        if(s != null) {
            arrayMap0.put(s, this);
        }
        this.n = k0.n;
    }

    public final void a(h h0, Matrix matrix0, Canvas canvas0, int v, int v1) {
        h0.a.set(matrix0);
        Matrix matrix1 = h0.a;
        matrix1.preConcat(h0.j);
        canvas0.save();
        for(int v2 = 0; true; ++v2) {
            ArrayList arrayList0 = h0.b;
            if(v2 >= arrayList0.size()) {
                break;
            }
            i i0 = (i)arrayList0.get(v2);
            if(i0 instanceof h) {
                this.a(((h)i0), matrix1, canvas0, v, v1);
            }
            else if(i0 instanceof j) {
                float f = ((float)v) / this.j;
                float f1 = ((float)v1) / this.k;
                Matrix matrix2 = this.c;
                matrix2.set(matrix1);
                matrix2.postScale(f, f1);
                float[] arr_f = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix1.mapVectors(arr_f);
                float f2 = Math.min(f, f1);
                float f3 = Math.max(((float)Math.hypot(arr_f[0], arr_f[1])), ((float)Math.hypot(arr_f[2], arr_f[3])));
                float f4 = f3 > 0.0f ? Math.abs(arr_f[0] * arr_f[3] - arr_f[1] * arr_f[2]) / f3 : 0.0f;
                if(f4 != 0.0f) {
                    ((j)i0).getClass();
                    Path path0 = this.a;
                    path0.reset();
                    PathDataNode[] arr_pathParser$PathDataNode = ((j)i0).a;
                    if(arr_pathParser$PathDataNode != null) {
                        PathDataNode.nodesToPath(arr_pathParser$PathDataNode, path0);
                    }
                    Path path1 = this.b;
                    path1.reset();
                    if(((j)i0) instanceof f) {
                        path1.setFillType((((j)i0).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                        path1.addPath(path0, matrix2);
                        canvas0.clipPath(path1);
                    }
                    else {
                        float f5 = ((g)(((j)i0))).i;
                        if(f5 != 0.0f || ((g)(((j)i0))).j != 1.0f) {
                            float f6 = ((g)(((j)i0))).k;
                            float f7 = (((g)(((j)i0))).j + f6) % 1.0f;
                            if(this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path0, false);
                            float f8 = this.f.getLength();
                            float f9 = (f5 + f6) % 1.0f * f8;
                            float f10 = f7 * f8;
                            path0.reset();
                            if(f9 > f10) {
                                this.f.getSegment(f9, f8, path0, true);
                                this.f.getSegment(0.0f, f10, path0, true);
                            }
                            else {
                                this.f.getSegment(f9, f10, path0, true);
                            }
                            path0.rLineTo(0.0f, 0.0f);
                        }
                        path1.addPath(path0, matrix2);
                        if(((g)(((j)i0))).f.willDraw()) {
                            ComplexColorCompat complexColorCompat0 = ((g)(((j)i0))).f;
                            if(this.e == null) {
                                Paint paint0 = new Paint(1);
                                this.e = paint0;
                                paint0.setStyle(Paint.Style.FILL);
                            }
                            Paint paint1 = this.e;
                            if(complexColorCompat0.isGradient()) {
                                Shader shader0 = complexColorCompat0.getShader();
                                shader0.setLocalMatrix(matrix2);
                                paint1.setShader(shader0);
                                paint1.setAlpha(Math.round(((g)(((j)i0))).h * 255.0f));
                            }
                            else {
                                paint1.setShader(null);
                                paint1.setAlpha(0xFF);
                                int v3 = complexColorCompat0.getColor();
                                float f11 = ((g)(((j)i0))).h;
                                paint1.setColor(v3 & 0xFFFFFF | ((int)(((float)Color.alpha(v3)) * f11)) << 24);
                            }
                            paint1.setColorFilter(null);
                            path1.setFillType((((g)(((j)i0))).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD));
                            canvas0.drawPath(path1, paint1);
                        }
                        if(((g)(((j)i0))).d.willDraw()) {
                            ComplexColorCompat complexColorCompat1 = ((g)(((j)i0))).d;
                            if(this.d == null) {
                                Paint paint2 = new Paint(1);
                                this.d = paint2;
                                paint2.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint3 = this.d;
                            Paint.Join paint$Join0 = ((g)(((j)i0))).m;
                            if(paint$Join0 != null) {
                                paint3.setStrokeJoin(paint$Join0);
                            }
                            Paint.Cap paint$Cap0 = ((g)(((j)i0))).l;
                            if(paint$Cap0 != null) {
                                paint3.setStrokeCap(paint$Cap0);
                            }
                            paint3.setStrokeMiter(((g)(((j)i0))).n);
                            if(complexColorCompat1.isGradient()) {
                                Shader shader1 = complexColorCompat1.getShader();
                                shader1.setLocalMatrix(matrix2);
                                paint3.setShader(shader1);
                                paint3.setAlpha(Math.round(((g)(((j)i0))).g * 255.0f));
                            }
                            else {
                                paint3.setShader(null);
                                paint3.setAlpha(0xFF);
                                int v4 = complexColorCompat1.getColor();
                                float f12 = ((g)(((j)i0))).g;
                                paint3.setColor(v4 & 0xFFFFFF | ((int)(((float)Color.alpha(v4)) * f12)) << 24);
                            }
                            paint3.setColorFilter(null);
                            paint3.setStrokeWidth(((g)(((j)i0))).e * (f2 * f4));
                            canvas0.drawPath(path1, paint3);
                        }
                    }
                }
            }
        }
        canvas0.restore();
    }

    public float getAlpha() {
        return ((float)this.getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        this.setRootAlpha(((int)(f * 255.0f)));
    }

    public void setRootAlpha(int v) {
        this.l = v;
    }
}

