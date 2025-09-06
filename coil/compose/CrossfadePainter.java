package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000F\u001A\u00020\u000E*\u00020\rH\u0014¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0012\u001A\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001A\u00020\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001C\u001A\u00020\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Lcoil/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "start", "end", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;IZZ)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,129:1\n75#2:130\n108#2,2:131\n76#3:133\n109#3,2:134\n81#4:136\n107#4,2:137\n152#5:139\n152#5:140\n159#5:141\n159#5:147\n159#5:148\n105#6:142\n67#6,4:143\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n37#1:130\n37#1:131,2\n41#1:133\n41#1:134,2\n42#1:136\n42#1:137,2\n88#1:139\n89#1:140\n110#1:141\n124#1:147\n125#1:148\n113#1:142\n113#1:143,4\n*E\n"})
public final class CrossfadePainter extends Painter {
    public static final int $stable;
    public Painter f;
    public final Painter g;
    public final ContentScale h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final MutableIntState l;
    public long m;
    public boolean n;
    public final MutableFloatState o;
    public final MutableState p;

    public CrossfadePainter(@Nullable Painter painter0, @Nullable Painter painter1, @NotNull ContentScale contentScale0, int v, boolean z, boolean z1) {
        this.f = painter0;
        this.g = painter1;
        this.h = contentScale0;
        this.i = v;
        this.j = z;
        this.k = z1;
        this.l = SnapshotIntStateKt.mutableIntStateOf(0);
        this.m = -1L;
        this.o = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
        this.p = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final void a(DrawScope drawScope0, Painter painter0, float f) {
        long v2;
        if(painter0 != null && f > 0.0f) {
            long v = drawScope0.getSize-NH-jbRc();
            long v1 = painter0.getIntrinsicSize-NH-jbRc();
            if(v1 == 0x7FC000007FC00000L || Size.isEmpty-impl(v1)) {
                v2 = v;
            }
            else if(v != 0x7FC000007FC00000L && !Size.isEmpty-impl(v)) {
                v2 = ScaleFactorKt.times-UQTWf7w(v1, this.h.computeScaleFactor-H7hwNQA(v1, v));
            }
            else {
                v2 = v;
            }
            MutableState mutableState0 = this.p;
            if(Long.compare(v, 0x7FC000007FC00000L) == 0 || Size.isEmpty-impl(v)) {
                painter0.draw-x_KDEd0(drawScope0, v2, f, ((ColorFilter)mutableState0.getValue()));
                return;
            }
            float f1 = (Size.getWidth-impl(v) - Size.getWidth-impl(v2)) / 2.0f;
            float f2 = (Size.getHeight-impl(v) - Size.getHeight-impl(v2)) / 2.0f;
            drawScope0.getDrawContext().getTransform().inset(f1, f2, f1, f2);
            painter0.draw-x_KDEd0(drawScope0, v2, f, ((ColorFilter)mutableState0.getValue()));
            drawScope0.getDrawContext().getTransform().inset(-f1, -f2, -f1, -f2);
        }
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.o.setFloatValue(f);
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter0) {
        this.p.setValue(colorFilter0);
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        long v = this.f == null ? 0L : this.f.getIntrinsicSize-NH-jbRc();
        long v1 = this.g == null ? 0L : this.g.getIntrinsicSize-NH-jbRc();
        boolean z = false;
        boolean z1 = Long.compare(v, 0x7FC000007FC00000L) != 0;
        if(v1 != 0x7FC000007FC00000L) {
            z = true;
        }
        if(z1 && z) {
            return SizeKt.Size(Math.max(Size.getWidth-impl(v), Size.getWidth-impl(v1)), Math.max(Size.getHeight-impl(v), Size.getHeight-impl(v1)));
        }
        if(this.k) {
            if(!z1) {
                return z ? v1 : 0x7FC000007FC00000L;
            }
            return v;
        }
        return 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        Painter painter0 = this.g;
        MutableFloatState mutableFloatState0 = this.o;
        if(this.n) {
            this.a(drawScope0, painter0, mutableFloatState0.getFloatValue());
            return;
        }
        long v = SystemClock.uptimeMillis();
        if(this.m == -1L) {
            this.m = v;
        }
        float f = ((float)(v - this.m)) / ((float)this.i);
        float f1 = c.coerceIn(f, 0.0f, 1.0f);
        float f2 = mutableFloatState0.getFloatValue() * f1;
        float f3 = this.j ? mutableFloatState0.getFloatValue() - f2 : mutableFloatState0.getFloatValue();
        this.n = Float.compare(f, 1.0f) >= 0;
        this.a(drawScope0, this.f, f3);
        this.a(drawScope0, painter0, f2);
        if(this.n) {
            this.f = null;
            return;
        }
        int v1 = this.l.getIntValue();
        this.l.setIntValue(v1 + 1);
    }
}

