package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas.VertexMode;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region.Op;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u00A0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0005\u0010\u0003J\u000F\u0010\u0006\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0006\u0010\u0003J\u001F\u0010\u000B\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001F\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0011J\u001A\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ:\u0010&\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\r2\u0006\u0010!\u001A\u00020\r2\u0006\u0010#\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%J\"\u0010+\u001A\u00020\u00042\u0006\u0010(\u001A\u00020\'2\u0006\u0010#\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*J\u0014\u0010/\u001A\u00020,*\u00020\"\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010.J*\u00105\u001A\u00020\u00042\u0006\u00101\u001A\u0002002\u0006\u00102\u001A\u0002002\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J7\u00106\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\r2\u0006\u0010!\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b6\u00107JG\u0010:\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\r2\u0006\u0010!\u001A\u00020\r2\u0006\u00108\u001A\u00020\r2\u0006\u00109\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b:\u0010;J7\u0010<\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\r2\u0006\u0010!\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b<\u00107J*\u0010A\u001A\u00020\u00042\u0006\u0010=\u001A\u0002002\u0006\u0010>\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b?\u0010@JO\u0010F\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\r2\u0006\u0010!\u001A\u00020\r2\u0006\u0010B\u001A\u00020\r2\u0006\u0010C\u001A\u00020\r2\u0006\u0010E\u001A\u00020D2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bF\u0010GJ\u001F\u0010H\u001A\u00020\u00042\u0006\u0010(\u001A\u00020\'2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bH\u0010IJ*\u0010O\u001A\u00020\u00042\u0006\u0010K\u001A\u00020J2\u0006\u0010L\u001A\u0002002\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bM\u0010NJB\u0010X\u001A\u00020\u00042\u0006\u0010K\u001A\u00020J2\u0006\u0010Q\u001A\u00020P2\u0006\u0010S\u001A\u00020R2\u0006\u0010T\u001A\u00020P2\u0006\u0010U\u001A\u00020R2\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bV\u0010WJ0\u0010_\u001A\u00020\u00042\u0006\u0010Z\u001A\u00020Y2\f\u0010\\\u001A\b\u0012\u0004\u0012\u0002000[2\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b]\u0010^J\u000F\u0010`\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b`\u0010\u0003J\u000F\u0010a\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\ba\u0010\u0003J*\u0010e\u001A\u00020\u00042\u0006\u0010Z\u001A\u00020Y2\u0006\u0010\\\u001A\u00020b2\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bc\u0010dJ*\u0010l\u001A\u00020\u00042\u0006\u0010g\u001A\u00020f2\u0006\u0010i\u001A\u00020h2\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bj\u0010kR,\u0010v\u001A\u00060mj\u0002`n8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\bo\u0010p\u0012\u0004\bu\u0010\u0003\u001A\u0004\bq\u0010r\"\u0004\bs\u0010t\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "a", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n38#2,5:436\n38#2,5:441\n33#3,6:446\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:436,5\n242#1:441,5\n319#1:446,6\n*E\n"})
public final class AndroidCanvas implements Canvas {
    public android.graphics.Canvas a;
    public Rect b;
    public Rect c;

    public AndroidCanvas() {
        this.a = AndroidCanvas_androidKt.access$getEmptyCanvas$p();
    }

    public final void a(int v, List list0, Paint paint0) {
        if(list0.size() >= 2) {
            android.graphics.Paint paint1 = paint0.asFrameworkPaint();
            for(int v1 = 0; v1 < list0.size() - 1; v1 += v) {
                long v2 = ((Offset)list0.get(v1)).unbox-impl();
                long v3 = ((Offset)list0.get(v1 + 1)).unbox-impl();
                this.a.drawLine(Offset.getX-impl(v2), Offset.getY-impl(v2), Offset.getX-impl(v3), Offset.getY-impl(v3), paint1);
            }
        }
    }

    public final void b(int v, float[] arr_f, Paint paint0) {
        if(arr_f.length >= 4 && arr_f.length % 2 == 0) {
            android.graphics.Paint paint1 = paint0.asFrameworkPaint();
            for(int v1 = 0; v1 < arr_f.length - 3; v1 += v * 2) {
                this.a.drawLine(arr_f[v1], arr_f[v1 + 1], arr_f[v1 + 2], arr_f[v1 + 3], paint1);
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipPath-mtrdD-E(@NotNull Path path0, int v) {
        android.graphics.Canvas canvas0 = this.a;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.clipPath(((AndroidPath)path0).getInternalPath(), this.toRegionOp--7u2Bmg(v));
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipRect-N_I0leg(float f, float f1, float f2, float f3, int v) {
        this.a.clipRect(f, f1, f2, f3, this.toRegionOp--7u2Bmg(v));
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void concat-58bKbWc(@NotNull float[] arr_f) {
        if(!MatrixKt.isIdentity-58bKbWc(arr_f)) {
            Matrix matrix0 = new Matrix();
            AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(matrix0, arr_f);
            this.a.concat(matrix0);
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.a, false);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f1, float f2, float f3, float f4, float f5, boolean z, @NotNull Paint paint0) {
        this.a.drawArc(f, f1, f2, f3, f4, f5, z, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawCircle-9KIMszo(long v, float f, @NotNull Paint paint0) {
        this.a.drawCircle(Offset.getX-impl(v), Offset.getY-impl(v), f, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawImage-d-4ec7I(@NotNull ImageBitmap imageBitmap0, long v, @NotNull Paint paint0) {
        this.a.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0), Offset.getX-impl(v), Offset.getY-impl(v), paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawImageRect-HPBpro0(@NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @NotNull Paint paint0) {
        if(this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        android.graphics.Canvas canvas0 = this.a;
        Bitmap bitmap0 = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0);
        Rect rect0 = this.b;
        Intrinsics.checkNotNull(rect0);
        rect0.left = IntOffset.getX-impl(v);
        rect0.top = IntOffset.getY-impl(v);
        rect0.right = IntSize.getWidth-impl(v1) + IntOffset.getX-impl(v);
        rect0.bottom = IntSize.getHeight-impl(v1) + IntOffset.getY-impl(v);
        Rect rect1 = this.c;
        Intrinsics.checkNotNull(rect1);
        rect1.left = IntOffset.getX-impl(v2);
        rect1.top = IntOffset.getY-impl(v2);
        rect1.right = IntSize.getWidth-impl(v3) + IntOffset.getX-impl(v2);
        rect1.bottom = IntSize.getHeight-impl(v3) + IntOffset.getY-impl(v2);
        canvas0.drawBitmap(bitmap0, rect0, rect1, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawLine-Wko1d7g(long v, long v1, @NotNull Paint paint0) {
        this.a.drawLine(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v1), Offset.getY-impl(v1), paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        this.a.drawOval(f, f1, f2, f3, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path0, @NotNull Paint paint0) {
        android.graphics.Canvas canvas0 = this.a;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.drawPath(((AndroidPath)path0).getInternalPath(), paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawPoints-O7TthRY(int v, @NotNull List list0, @NotNull Paint paint0) {
        if(PointMode.equals-impl0(v, 1)) {
            this.a(2, list0, paint0);
            return;
        }
        if(PointMode.equals-impl0(v, 2)) {
            this.a(1, list0, paint0);
            return;
        }
        if(PointMode.equals-impl0(v, 0)) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                long v3 = ((Offset)list0.get(v2)).unbox-impl();
                this.a.drawPoint(Offset.getX-impl(v3), Offset.getY-impl(v3), paint0.asFrameworkPaint());
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRawPoints-O7TthRY(int v, @NotNull float[] arr_f, @NotNull Paint paint0) {
        if(arr_f.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        if(PointMode.equals-impl0(v, 1)) {
            this.b(2, arr_f, paint0);
            return;
        }
        if(PointMode.equals-impl0(v, 2)) {
            this.b(1, arr_f, paint0);
            return;
        }
        if(PointMode.equals-impl0(v, 0) && arr_f.length % 2 == 0) {
            android.graphics.Paint paint1 = paint0.asFrameworkPaint();
            for(int v1 = 0; v1 < arr_f.length - 1; v1 += 2) {
                this.a.drawPoint(arr_f[v1], arr_f[v1 + 1], paint1);
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        this.a.drawRect(f, f1, f2, f3, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f1, float f2, float f3, float f4, float f5, @NotNull Paint paint0) {
        this.a.drawRoundRect(f, f1, f2, f3, f4, f5, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawVertices-TPEHhCM(@NotNull Vertices vertices0, int v, @NotNull Paint paint0) {
        android.graphics.Canvas canvas0 = this.a;
        Canvas.VertexMode canvas$VertexMode0 = AndroidVertexMode_androidKt.toAndroidVertexMode-JOOmi9M(vertices0.getVertexMode-c2xauaI());
        android.graphics.Paint paint1 = paint0.asFrameworkPaint();
        canvas0.drawVertices(canvas$VertexMode0, vertices0.getPositions().length, vertices0.getPositions(), 0, vertices0.getTextureCoordinates(), 0, vertices0.getColors(), 0, vertices0.getIndices(), 0, vertices0.getIndices().length, paint1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.a, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.a;
    }

    @PublishedApi
    public static void getInternalCanvas$annotations() {
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.a.restore();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        this.a.rotate(f);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.a.save();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect rect0, @NotNull Paint paint0) {
        this.a.saveLayer(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), paint0.asFrameworkPaint(), 0x1F);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f1) {
        this.a.scale(f, f1);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas0) {
        this.a = canvas0;
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void skew(float f, float f1) {
        this.a.skew(f, f1);
    }

    // 去混淆评级： 低(40)
    @NotNull
    public final Region.Op toRegionOp--7u2Bmg(int v) {
        return ClipOp.equals-impl0(v, 0) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f1) {
        this.a.translate(f, f1);
    }
}

