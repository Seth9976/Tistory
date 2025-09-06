package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0087\f\u001A\u0015\u0010\u0000\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0003H\u0087\f\u001A\r\u0010\u0004\u001A\u00020\u0005*\u00020\u0001H\u0086\n\u001A\r\u0010\u0004\u001A\u00020\u0006*\u00020\u0003H\u0086\n\u001A\r\u0010\u0007\u001A\u00020\u0005*\u00020\u0001H\u0086\n\u001A\r\u0010\u0007\u001A\u00020\u0006*\u00020\u0003H\u0086\n\u001A\r\u0010\b\u001A\u00020\u0005*\u00020\u0001H\u0086\n\u001A\r\u0010\b\u001A\u00020\u0006*\u00020\u0003H\u0086\n\u001A\r\u0010\t\u001A\u00020\u0005*\u00020\u0001H\u0086\n\u001A\r\u0010\t\u001A\u00020\u0006*\u00020\u0003H\u0086\n\u001A\u0015\u0010\n\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\f\u001A\u00020\rH\u0086\n\u001A\u0015\u0010\n\u001A\u00020\u000B*\u00020\u00032\u0006\u0010\f\u001A\u00020\u000EH\u0086\n\u001A\u0015\u0010\u000F\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\rH\u0086\n\u001A\u0015\u0010\u000F\u001A\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\u000F\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u0005H\u0086\n\u001A\u0015\u0010\u000F\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000EH\u0086\n\u001A\u0015\u0010\u000F\u001A\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\u000F\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u0006H\u0086\n\u001A\u0015\u0010\u0012\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f\u001A\u0015\u0010\u0012\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\f\u001A\u0015\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\rH\u0086\n\u001A\u0015\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u0005H\u0086\n\u001A\u0015\u0010\u0013\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000EH\u0086\n\u001A\u0015\u0010\u0013\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\n\u001A\u0015\u0010\u0013\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u0006H\u0086\n\u001A\u0015\u0010\u0014\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u0005H\u0086\n\u001A\u0015\u0010\u0014\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0006H\u0086\n\u001A\u0015\u0010\u0014\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0005H\u0086\n\u001A\r\u0010\u0016\u001A\u00020\u0001*\u00020\u0003H\u0086\b\u001A\r\u0010\u0017\u001A\u00020\u0003*\u00020\u0001H\u0086\b\u001A\r\u0010\u0018\u001A\u00020\u0011*\u00020\u0001H\u0086\b\u001A\r\u0010\u0018\u001A\u00020\u0011*\u00020\u0003H\u0086\b\u001A\u0015\u0010\u0019\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u001BH\u0086\b\u001A\u0015\u0010\u001C\u001A\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f\u001A\u0015\u0010\u001C\u001A\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\f\u00A8\u0006\u001D"}, d2 = {"and", "Landroid/graphics/Rect;", "r", "Landroid/graphics/RectF;", "component1", "", "", "component2", "component3", "component4", "contains", "", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "xy", "Landroid/graphics/Region;", "or", "plus", "times", "factor", "toRect", "toRectF", "toRegion", "transform", "m", "Landroid/graphics/Matrix;", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
public final class RectKt {
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final Rect and(@NotNull Rect rect0, @NotNull Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.intersect(rect1);
        return rect2;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final RectF and(@NotNull RectF rectF0, @NotNull RectF rectF1) {
        RectF rectF2 = new RectF(rectF0);
        rectF2.intersect(rectF1);
        return rectF2;
    }

    public static final float component1(@NotNull RectF rectF0) {
        return rectF0.left;
    }

    public static final int component1(@NotNull Rect rect0) {
        return rect0.left;
    }

    public static final float component2(@NotNull RectF rectF0) {
        return rectF0.top;
    }

    public static final int component2(@NotNull Rect rect0) {
        return rect0.top;
    }

    public static final float component3(@NotNull RectF rectF0) {
        return rectF0.right;
    }

    public static final int component3(@NotNull Rect rect0) {
        return rect0.right;
    }

    public static final float component4(@NotNull RectF rectF0) {
        return rectF0.bottom;
    }

    public static final int component4(@NotNull Rect rect0) {
        return rect0.bottom;
    }

    public static final boolean contains(@NotNull Rect rect0, @NotNull Point point0) {
        return rect0.contains(point0.x, point0.y);
    }

    public static final boolean contains(@NotNull RectF rectF0, @NotNull PointF pointF0) {
        return rectF0.contains(pointF0.x, pointF0.y);
    }

    @NotNull
    public static final Rect minus(@NotNull Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(-v, -v);
        return rect1;
    }

    @NotNull
    public static final Rect minus(@NotNull Rect rect0, @NotNull Point point0) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(-point0.x, -point0.y);
        return rect1;
    }

    @NotNull
    public static final RectF minus(@NotNull RectF rectF0, float f) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(-f, -f);
        return rectF1;
    }

    @NotNull
    public static final RectF minus(@NotNull RectF rectF0, @NotNull PointF pointF0) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(-pointF0.x, -pointF0.y);
        return rectF1;
    }

    @NotNull
    public static final Region minus(@NotNull Rect rect0, @NotNull Rect rect1) {
        Region region0 = new Region(rect0);
        region0.op(rect1, Region.Op.DIFFERENCE);
        return region0;
    }

    @NotNull
    public static final Region minus(@NotNull RectF rectF0, @NotNull RectF rectF1) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        Region region0 = new Region(rect0);
        Rect rect1 = new Rect();
        rectF1.roundOut(rect1);
        region0.op(rect1, Region.Op.DIFFERENCE);
        return region0;
    }

    @NotNull
    public static final Rect or(@NotNull Rect rect0, @NotNull Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.union(rect1);
        return rect2;
    }

    @NotNull
    public static final RectF or(@NotNull RectF rectF0, @NotNull RectF rectF1) {
        RectF rectF2 = new RectF(rectF0);
        rectF2.union(rectF1);
        return rectF2;
    }

    @NotNull
    public static final Rect plus(@NotNull Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(v, v);
        return rect1;
    }

    @NotNull
    public static final Rect plus(@NotNull Rect rect0, @NotNull Point point0) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(point0.x, point0.y);
        return rect1;
    }

    @NotNull
    public static final Rect plus(@NotNull Rect rect0, @NotNull Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.union(rect1);
        return rect2;
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF0, float f) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(f, f);
        return rectF1;
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF0, @NotNull PointF pointF0) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(pointF0.x, pointF0.y);
        return rectF1;
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF0, @NotNull RectF rectF1) {
        RectF rectF2 = new RectF(rectF0);
        rectF2.union(rectF1);
        return rectF2;
    }

    @NotNull
    public static final Rect times(@NotNull Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        rect1.top *= v;
        rect1.left *= v;
        rect1.right *= v;
        rect1.bottom *= v;
        return rect1;
    }

    @NotNull
    public static final RectF times(@NotNull RectF rectF0, float f) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.top *= f;
        rectF1.left *= f;
        rectF1.right *= f;
        rectF1.bottom *= f;
        return rectF1;
    }

    @NotNull
    public static final RectF times(@NotNull RectF rectF0, int v) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.top *= (float)v;
        rectF1.left *= (float)v;
        rectF1.right *= (float)v;
        rectF1.bottom *= (float)v;
        return rectF1;
    }

    @NotNull
    public static final Rect toRect(@NotNull RectF rectF0) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        return rect0;
    }

    @NotNull
    public static final RectF toRectF(@NotNull Rect rect0) {
        return new RectF(rect0);
    }

    @NotNull
    public static final Region toRegion(@NotNull Rect rect0) {
        return new Region(rect0);
    }

    @NotNull
    public static final Region toRegion(@NotNull RectF rectF0) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        return new Region(rect0);
    }

    @NotNull
    public static final RectF transform(@NotNull RectF rectF0, @NotNull Matrix matrix0) {
        matrix0.mapRect(rectF0);
        return rectF0;
    }

    @NotNull
    public static final Region xor(@NotNull Rect rect0, @NotNull Rect rect1) {
        Region region0 = new Region(rect0);
        region0.op(rect1, Region.Op.XOR);
        return region0;
    }

    @NotNull
    public static final Region xor(@NotNull RectF rectF0, @NotNull RectF rectF1) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        Region region0 = new Region(rect0);
        Rect rect1 = new Rect();
        rectF1.roundOut(rect1);
        region0.op(rect1, Region.Op.XOR);
        return region0;
    }
}

