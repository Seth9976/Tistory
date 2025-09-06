package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build.VERSION;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000F\u001A\u00020\b2\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\t\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\t\u0010\u0018R$\u0010\u001E\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\b8\u0000@BX\u0080\u000E¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0013\u0010\"\u001A\u0004\u0018\u00010\u001F8F¢\u0006\u0006\u001A\u0004\b \u0010!R\u0011\u0010$\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b#\u0010\u001DR\u0013\u0010(\u001A\u0004\u0018\u00010%8F¢\u0006\u0006\u001A\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Outline;", "outline", "", "alpha", "", "clipToOutline", "elevation", "Landroidx/compose/ui/geometry/Size;", "size", "update-S_szKao", "(Landroidx/compose/ui/graphics/Outline;FZFJ)Z", "update", "Landroidx/compose/ui/geometry/Offset;", "position", "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "(Landroidx/compose/ui/graphics/Canvas;)V", "<set-?>", "f", "Z", "getCacheIsDirty$ui_release", "()Z", "cacheIsDirty", "Landroid/graphics/Outline;", "getAndroidOutline", "()Landroid/graphics/Outline;", "androidOutline", "getOutlineClipSupported", "outlineClipSupported", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,325:1\n1#2:326\n26#3:327\n26#3:328\n26#3:329\n26#3:330\n26#3:331\n26#3:332\n26#3:333\n26#3:334\n38#4,5:335\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n267#1:327\n268#1:328\n269#1:329\n270#1:330\n280#1:331\n281#1:332\n282#1:333\n283#1:334\n299#1:335,5\n*E\n"})
public final class OutlineResolver {
    public static final int $stable = 8;
    public boolean a;
    public final Outline b;
    public androidx.compose.ui.graphics.Outline c;
    public Path d;
    public Path e;
    public boolean f;
    public boolean g;
    public Path h;
    public RoundRect i;
    public float j;
    public long k;
    public long l;
    public boolean m;

    public OutlineResolver() {
        this.a = true;
        Outline outline0 = new Outline();
        outline0.setAlpha(1.0f);
        this.b = outline0;
        this.k = 0L;
        this.l = 0L;
    }

    public final void a() {
        if(this.f) {
            this.k = 0L;
            this.j = 0.0f;
            this.e = null;
            this.f = false;
            this.g = false;
            androidx.compose.ui.graphics.Outline outline0 = this.c;
            Outline outline1 = this.b;
            if(outline0 == null || !this.m || Size.getWidth-impl(this.l) <= 0.0f || Size.getHeight-impl(this.l) <= 0.0f) {
                outline1.setEmpty();
            }
            else {
                this.a = true;
                if(outline0 instanceof Rectangle) {
                    Rect rect0 = ((Rectangle)outline0).getRect();
                    this.k = OffsetKt.Offset(rect0.getLeft(), rect0.getTop());
                    this.l = SizeKt.Size(rect0.getWidth(), rect0.getHeight());
                    outline1.setRect(Math.round(rect0.getLeft()), Math.round(rect0.getTop()), Math.round(rect0.getRight()), Math.round(rect0.getBottom()));
                    return;
                }
                if(outline0 instanceof Rounded) {
                    RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
                    float f = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
                    this.k = OffsetKt.Offset(roundRect0.getLeft(), roundRect0.getTop());
                    this.l = SizeKt.Size(roundRect0.getWidth(), roundRect0.getHeight());
                    if(RoundRectKt.isSimple(roundRect0)) {
                        this.b.setRoundRect(Math.round(roundRect0.getLeft()), Math.round(roundRect0.getTop()), Math.round(roundRect0.getRight()), Math.round(roundRect0.getBottom()), f);
                        this.j = f;
                        return;
                    }
                    Path path0 = this.d;
                    if(path0 == null) {
                        path0 = AndroidPath_androidKt.Path();
                        this.d = path0;
                    }
                    path0.reset();
                    Path.addRoundRect$default(path0, roundRect0, null, 2, null);
                    this.b(path0);
                    return;
                }
                if(outline0 instanceof Generic) {
                    this.b(((Generic)outline0).getPath());
                }
            }
        }
    }

    public final void b(Path path0) {
        Outline outline0 = this.b;
        if(Build.VERSION.SDK_INT <= 28 && !path0.isConvex()) {
            this.a = false;
            outline0.setEmpty();
            this.g = true;
        }
        else if(path0 instanceof AndroidPath) {
            outline0.setConvexPath(((AndroidPath)path0).getInternalPath());
            this.g = !outline0.canClip();
        }
        else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.e = path0;
    }

    public final void clipToOutline(@NotNull Canvas canvas0) {
        Path path0 = this.getClipPath();
        if(path0 != null) {
            Canvas.clipPath-mtrdD-E$default(canvas0, path0, 0, 2, null);
            return;
        }
        float f = this.j;
        if(f > 0.0f) {
            Path path1 = this.h;
            RoundRect roundRect0 = this.i;
            if(path1 == null) {
            label_12:
                float f1 = Offset.getX-impl(this.k);
                float f2 = Offset.getY-impl(this.k);
                float f3 = Offset.getX-impl(this.k);
                float f4 = Size.getWidth-impl(this.l);
                float f5 = Offset.getY-impl(this.k);
                RoundRect roundRect1 = RoundRectKt.RoundRect-gG7oq9Y(f1, f2, f4 + f3, Size.getHeight-impl(this.l) + f5, CornerRadiusKt.CornerRadius$default(this.j, 0.0f, 2, null));
                if(path1 == null) {
                    path1 = AndroidPath_androidKt.Path();
                }
                else {
                    path1.reset();
                }
                Path.addRoundRect$default(path1, roundRect1, null, 2, null);
                this.i = roundRect1;
                this.h = path1;
            }
            else {
                long v = this.k;
                long v1 = this.l;
                if(roundRect0 == null || !RoundRectKt.isSimple(roundRect0) || roundRect0.getLeft() != Offset.getX-impl(v) || roundRect0.getTop() != Offset.getY-impl(v) || roundRect0.getRight() != Size.getWidth-impl(v1) + Offset.getX-impl(v) || roundRect0.getBottom() != Size.getHeight-impl(v1) + Offset.getY-impl(v) || CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != f) {
                    goto label_12;
                }
            }
            Canvas.clipPath-mtrdD-E$default(canvas0, path1, 0, 2, null);
            return;
        }
        float f6 = Offset.getX-impl(this.k);
        float f7 = Offset.getY-impl(this.k);
        float f8 = Offset.getX-impl(this.k);
        float f9 = Size.getWidth-impl(this.l);
        float f10 = Offset.getY-impl(this.k);
        Canvas.clipRect-N_I0leg$default(canvas0, f6, f7, f9 + f8, Size.getHeight-impl(this.l) + f10, 0, 16, null);
    }

    @Nullable
    public final Outline getAndroidOutline() {
        this.a();
        return !this.m || !this.a ? null : this.b;
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.f;
    }

    @Nullable
    public final Path getClipPath() {
        this.a();
        return this.e;
    }

    public final boolean getOutlineClipSupported() {
        return !this.g;
    }

    public final boolean isInOutline-k-4lQ0M(long v) {
        if(!this.m) {
            return true;
        }
        return this.c == null ? true : ShapeContainingUtilKt.isInOutline(this.c, Offset.getX-impl(v), Offset.getY-impl(v), null, null);
    }

    public final boolean update-S_szKao(@Nullable androidx.compose.ui.graphics.Outline outline0, float f, boolean z, float f1, long v) {
        this.b.setAlpha(f);
        boolean z1 = Intrinsics.areEqual(this.c, outline0);
        if(!z1) {
            this.c = outline0;
            this.f = true;
        }
        this.l = v;
        boolean z2 = outline0 != null && (z || f1 > 0.0f);
        if(this.m != z2) {
            this.m = z2;
            this.f = true;
        }
        return !z1;
    }
}

