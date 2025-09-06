package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0086\n\u001A\r\u0010\u0000\u001A\u00020\u0003*\u00020\u0004H\u0086\n\u001A\r\u0010\u0005\u001A\u00020\u0001*\u00020\u0002H\u0086\n\u001A\r\u0010\u0005\u001A\u00020\u0003*\u00020\u0004H\u0086\n\u001A\u0015\u0010\u0006\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\u0006\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001A\u00020\u0002H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\u000B\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001A\u00020\u0002H\u0086\n\u001A\u0015\u0010\u000B\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\u000B\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004H\u0086\n\u001A\u0015\u0010\u000B\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\f\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\f\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\n\u001A\r\u0010\r\u001A\u00020\u0002*\u00020\u0004H\u0086\b\u001A\r\u0010\u000E\u001A\u00020\u0004*\u00020\u0002H\u0086\b\u001A\r\u0010\u000F\u001A\u00020\u0002*\u00020\u0002H\u0086\n\u001A\r\u0010\u000F\u001A\u00020\u0004*\u00020\u0004H\u0086\n¨\u0006\u0010"}, d2 = {"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "div", "scalar", "minus", "p", "xy", "plus", "times", "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PointKt {
    public static final float component1(@NotNull PointF pointF0) {
        return pointF0.x;
    }

    public static final int component1(@NotNull Point point0) {
        return point0.x;
    }

    public static final float component2(@NotNull PointF pointF0) {
        return pointF0.y;
    }

    public static final int component2(@NotNull Point point0) {
        return point0.y;
    }

    @NotNull
    public static final Point div(@NotNull Point point0, float f) {
        return new Point(Math.round(((float)point0.x) / f), Math.round(((float)point0.y) / f));
    }

    @NotNull
    public static final PointF div(@NotNull PointF pointF0, float f) {
        return new PointF(pointF0.x / f, pointF0.y / f);
    }

    @NotNull
    public static final Point minus(@NotNull Point point0, int v) {
        Point point1 = new Point(point0.x, point0.y);
        point1.offset(-v, -v);
        return point1;
    }

    @NotNull
    public static final Point minus(@NotNull Point point0, @NotNull Point point1) {
        Point point2 = new Point(point0.x, point0.y);
        point2.offset(-point1.x, -point1.y);
        return point2;
    }

    @NotNull
    public static final PointF minus(@NotNull PointF pointF0, float f) {
        PointF pointF1 = new PointF(pointF0.x, pointF0.y);
        pointF1.offset(-f, -f);
        return pointF1;
    }

    @NotNull
    public static final PointF minus(@NotNull PointF pointF0, @NotNull PointF pointF1) {
        PointF pointF2 = new PointF(pointF0.x, pointF0.y);
        pointF2.offset(-pointF1.x, -pointF1.y);
        return pointF2;
    }

    @NotNull
    public static final Point plus(@NotNull Point point0, int v) {
        Point point1 = new Point(point0.x, point0.y);
        point1.offset(v, v);
        return point1;
    }

    @NotNull
    public static final Point plus(@NotNull Point point0, @NotNull Point point1) {
        Point point2 = new Point(point0.x, point0.y);
        point2.offset(point1.x, point1.y);
        return point2;
    }

    @NotNull
    public static final PointF plus(@NotNull PointF pointF0, float f) {
        PointF pointF1 = new PointF(pointF0.x, pointF0.y);
        pointF1.offset(f, f);
        return pointF1;
    }

    @NotNull
    public static final PointF plus(@NotNull PointF pointF0, @NotNull PointF pointF1) {
        PointF pointF2 = new PointF(pointF0.x, pointF0.y);
        pointF2.offset(pointF1.x, pointF1.y);
        return pointF2;
    }

    @NotNull
    public static final Point times(@NotNull Point point0, float f) {
        return new Point(Math.round(((float)point0.x) * f), Math.round(((float)point0.y) * f));
    }

    @NotNull
    public static final PointF times(@NotNull PointF pointF0, float f) {
        return new PointF(pointF0.x * f, pointF0.y * f);
    }

    @NotNull
    public static final Point toPoint(@NotNull PointF pointF0) {
        return new Point(((int)pointF0.x), ((int)pointF0.y));
    }

    @NotNull
    public static final PointF toPointF(@NotNull Point point0) {
        return new PointF(point0);
    }

    @NotNull
    public static final Point unaryMinus(@NotNull Point point0) {
        return new Point(-point0.x, -point0.y);
    }

    @NotNull
    public static final PointF unaryMinus(@NotNull PointF pointF0) {
        return new PointF(-pointF0.x, -pointF0.y);
    }
}

