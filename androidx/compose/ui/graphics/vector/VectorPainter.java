package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001A\u00020\u0007*\u00020\u0006H\u0014\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0014\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0014\u00A2\u0006\u0004\b\u0011\u0010\u0012R1\u0010\u001B\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00138@@@X\u0080\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR+\u0010!\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\f8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u0016\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001A\u0010\'\u001A\u00020\"8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R$\u0010/\u001A\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00105\u001A\u0004\u0018\u00010\u000F2\b\u00100\u001A\u0004\u0018\u00010\u000F8@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\b1\u00102\"\u0004\b3\u00104R*\u00108\u001A\u00020\u00132\u0006\u00100\u001A\u00020\u00138@@@X\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001AR$\u0010>\u001A\u0002092\u0006\u00100\u001A\u0002098@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001A\u0010B\u001A\u00020?8@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b@\u0010AR\u001A\u0010D\u001A\u00020\u00138VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bC\u0010\u0018\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006E"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc$ui_release", "()J", "setSize-uvyYCjk$ui_release", "(J)V", "size", "g", "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "h", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "getVector$ui_release", "()Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "Landroidx/compose/runtime/Composition;", "i", "Landroidx/compose/runtime/Composition;", "getComposition$ui_release", "()Landroidx/compose/runtime/Composition;", "setComposition$ui_release", "(Landroidx/compose/runtime/Composition;)V", "composition", "value", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui_release", "setViewportSize-uvyYCjk$ui_release", "viewportSize", "", "getName$ui_release", "()Ljava/lang/String;", "setName$ui_release", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getBitmapConfig-_sVssgQ$ui_release", "()I", "bitmapConfig", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,520:1\n81#2:521\n107#2,2:522\n81#2:524\n107#2,2:525\n75#3:527\n108#3,2:528\n270#4:530\n271#4:551\n184#5,6:531\n272#5,14:537\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n193#1:521\n193#1:522,2\n195#1:524\n195#1:525,2\n232#1:527\n232#1:528,2\n246#1:530\n246#1:551\n246#1:531,6\n246#1:537,14\n*E\n"})
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    public final MutableState f;
    public final MutableState g;
    public final VectorComponent h;
    public Composition i;
    public final MutableIntState j;
    public float k;
    public ColorFilter l;
    public int m;

    public VectorPainter() {
        this(null, 1, null);
    }

    public VectorPainter(@NotNull GroupComponent groupComponent0) {
        this.f = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0L), null, 2, null);
        this.g = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent0 = new VectorComponent(groupComponent0);
        vectorComponent0.setInvalidateCallback$ui_release(new e(this, 27));
        this.h = vectorComponent0;
        this.j = SnapshotIntStateKt.mutableIntStateOf(0);
        this.k = 1.0f;
        this.m = -1;
    }

    public VectorPainter(GroupComponent groupComponent0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            groupComponent0 = new GroupComponent();
        }
        this(groupComponent0);
    }

    public static final int access$getInvalidateCount(VectorPainter vectorPainter0) {
        return vectorPainter0.j.getIntValue();
    }

    public static final void access$setInvalidateCount(VectorPainter vectorPainter0, int v) {
        vectorPainter0.j.setIntValue(v);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.k = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter0) {
        this.l = colorFilter0;
        return true;
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    public final int getBitmapConfig-_sVssgQ$ui_release() {
        return this.h.getCacheBitmapConfig-_sVssgQ$ui_release();
    }

    @Nullable
    public final Composition getComposition$ui_release() {
        return this.i;
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.h.getIntrinsicColorFilter$ui_release();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return this.getSize-NH-jbRc$ui_release();
    }

    @NotNull
    public final String getName$ui_release() {
        return this.h.getName();
    }

    public final long getSize-NH-jbRc$ui_release() {
        return ((Size)this.f.getValue()).unbox-impl();
    }

    @NotNull
    public final VectorComponent getVector$ui_release() {
        return this.h;
    }

    public final long getViewportSize-NH-jbRc$ui_release() {
        return this.h.getViewportSize-NH-jbRc$ui_release();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        ColorFilter colorFilter0 = this.l;
        VectorComponent vectorComponent0 = this.h;
        if(colorFilter0 == null) {
            colorFilter0 = vectorComponent0.getIntrinsicColorFilter$ui_release();
        }
        if(!this.getAutoMirror$ui_release() || drawScope0.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent0.draw(drawScope0, this.k, colorFilter0);
        }
        else {
            long v = drawScope0.getCenter-F1C5BW0();
            DrawContext drawContext0 = drawScope0.getDrawContext();
            long v1 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            try {
                drawContext0.getTransform().scale-0AR0LA0(-1.0f, 1.0f, v);
                vectorComponent0.draw(drawScope0, this.k, colorFilter0);
            }
            finally {
                a.y(drawContext0, v1);
            }
        }
        this.m = this.j.getIntValue();
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    public final void setComposition$ui_release(@Nullable Composition composition0) {
        this.i = composition0;
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter0) {
        this.h.setIntrinsicColorFilter$ui_release(colorFilter0);
    }

    public final void setName$ui_release(@NotNull String s) {
        this.h.setName(s);
    }

    public final void setSize-uvyYCjk$ui_release(long v) {
        Size size0 = Size.box-impl(v);
        this.f.setValue(size0);
    }

    public final void setViewportSize-uvyYCjk$ui_release(long v) {
        this.h.setViewportSize-uvyYCjk$ui_release(v);
    }
}

