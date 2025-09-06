package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import p6.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0014\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000B\u001A\u00020\n*\u00020\tH\u0014\u00A2\u0006\u0004\b\u000B\u0010\fR4\u0010\u0015\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00048F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR4\u0010\u001F\u001A\u00020\u001B2\u0006\u0010\u000E\u001A\u00020\u001B8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u0010\u001A\u0004\b\u001D\u0010\u0018\"\u0004\b\u001E\u0010\u001AR4\u0010#\u001A\u00020\u001B2\u0006\u0010\u000E\u001A\u00020\u001B8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b \u0010\u0010\u001A\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001AR+\u0010)\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u00068F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b$\u0010\u0010\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R4\u0010-\u001A\u00020\u001B2\u0006\u0010\u000E\u001A\u00020\u001B8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b*\u0010\u0010\u001A\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001AR4\u00101\u001A\u00020\u001B2\u0006\u0010\u000E\u001A\u00020\u001B8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b.\u0010\u0010\u001A\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001AR+\u00105\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00048F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b2\u0010\u0010\u001A\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001AR+\u00109\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00048F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b6\u0010\u0010\u001A\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001AR+\u0010=\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00048F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b:\u0010\u0010\u001A\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001AR+\u0010A\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00048F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b>\u0010\u0010\u001A\u0004\b?\u0010\u0018\"\u0004\b@\u0010\u001AR\u001D\u0010D\u001A\u00020B8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\bC\u0010\u0012\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006E"}, d2 = {"Lcom/google/accompanist/swiperefresh/CircularProgressPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "()V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/graphics/Color;", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "color", "g", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/unit/Dp;", "h", "getArcRadius-D9Ej5fM", "setArcRadius-0680j_4", "arcRadius", "i", "getStrokeWidth-D9Ej5fM", "setStrokeWidth-0680j_4", "strokeWidth", "j", "getArrowEnabled", "()Z", "setArrowEnabled", "(Z)V", "arrowEnabled", "k", "getArrowWidth-D9Ej5fM", "setArrowWidth-0680j_4", "arrowWidth", "l", "getArrowHeight-D9Ej5fM", "setArrowHeight-0680j_4", "arrowHeight", "m", "getArrowScale", "setArrowScale", "arrowScale", "o", "getStartTrim", "setStartTrim", "startTrim", "p", "getEndTrim", "setEndTrim", "endTrim", "q", "getRotation", "setRotation", "rotation", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "swiperefresh_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCircularProgressPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressPainter.kt\ncom/google/accompanist/swiperefresh/CircularProgressPainter\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,128:1\n154#2:129\n154#2:130\n154#2:131\n154#2:132\n76#3:133\n102#3,2:134\n76#3:136\n102#3,2:137\n76#3:139\n102#3,2:140\n76#3:142\n102#3,2:143\n76#3:145\n102#3,2:146\n76#3:148\n102#3,2:149\n76#3:151\n102#3,2:152\n76#3:154\n102#3,2:155\n76#3:157\n102#3,2:158\n76#3:160\n102#3,2:161\n76#3:163\n102#3,2:164\n136#4,5:166\n261#4,11:171\n136#4,5:182\n261#4,11:187\n*S KotlinDebug\n*F\n+ 1 CircularProgressPainter.kt\ncom/google/accompanist/swiperefresh/CircularProgressPainter\n*L\n45#1:129\n46#1:130\n48#1:131\n49#1:132\n43#1:133\n43#1:134,2\n44#1:136\n44#1:137,2\n45#1:139\n45#1:140,2\n46#1:142\n46#1:143,2\n47#1:145\n47#1:146,2\n48#1:148\n48#1:149,2\n49#1:151\n49#1:152,2\n50#1:154\n50#1:155,2\n56#1:157\n56#1:158,2\n57#1:160\n57#1:161,2\n58#1:163\n58#1:164,2\n69#1:166,5\n69#1:171,11\n119#1:182,5\n119#1:187,11\n*E\n"})
public final class CircularProgressPainter extends Painter {
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;
    public final Lazy n;
    public final MutableState o;
    public final MutableState p;
    public final MutableState q;

    public CircularProgressPainter() {
        this.f = SnapshotStateKt.mutableStateOf$default(Color.box-impl(Color.Companion.getUnspecified-0d7_KjU()), null, 2, null);
        this.g = SnapshotStateKt.mutableStateOf$default(1.0f, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
        this.i = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(5.0f), null, 2, null);
        this.j = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.k = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
        this.l = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
        this.m = SnapshotStateKt.mutableStateOf$default(1.0f, null, 2, null);
        this.n = c.lazy(a.w);
        this.o = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
        this.p = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
        this.q = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
    }

    public final Path a() {
        return (Path)this.n.getValue();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.setAlpha(f);
        return true;
    }

    public final float getAlpha() {
        return ((Number)this.g.getValue()).floatValue();
    }

    public final float getArcRadius-D9Ej5fM() {
        return ((Dp)this.h.getValue()).unbox-impl();
    }

    public final boolean getArrowEnabled() {
        return ((Boolean)this.j.getValue()).booleanValue();
    }

    public final float getArrowHeight-D9Ej5fM() {
        return ((Dp)this.l.getValue()).unbox-impl();
    }

    public final float getArrowScale() {
        return ((Number)this.m.getValue()).floatValue();
    }

    public final float getArrowWidth-D9Ej5fM() {
        return ((Dp)this.k.getValue()).unbox-impl();
    }

    public final long getColor-0d7_KjU() {
        return ((Color)this.f.getValue()).unbox-impl();
    }

    public final float getEndTrim() {
        return ((Number)this.p.getValue()).floatValue();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return 0x7FC000007FC00000L;
    }

    public final float getRotation() {
        return ((Number)this.q.getValue()).floatValue();
    }

    public final float getStartTrim() {
        return ((Number)this.o.getValue()).floatValue();
    }

    public final float getStrokeWidth-D9Ej5fM() {
        return ((Dp)this.i.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        float f = this.getRotation();
        long v = drawScope0.getCenter-F1C5BW0();
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(f, v);
        float f1 = drawScope0.toPx-0680j_4(this.getArcRadius-D9Ej5fM());
        float f2 = drawScope0.toPx-0680j_4(this.getStrokeWidth-D9Ej5fM()) / 2.0f + f1;
        Rect rect0 = new Rect(Offset.getX-impl(SizeKt.getCenter-uvyYCjk(drawScope0.getSize-NH-jbRc())) - f2, Offset.getY-impl(SizeKt.getCenter-uvyYCjk(drawScope0.getSize-NH-jbRc())) - f2, Offset.getX-impl(SizeKt.getCenter-uvyYCjk(drawScope0.getSize-NH-jbRc())) + f2, Offset.getY-impl(SizeKt.getCenter-uvyYCjk(drawScope0.getSize-NH-jbRc())) + f2);
        float f3 = this.getStartTrim();
        float f4 = (this.getRotation() + f3) * 360.0f;
        float f5 = this.getEndTrim();
        float f6 = (this.getRotation() + f5) * 360.0f - f4;
        DrawScope.drawArc-yD3GUKo$default(drawScope0, this.getColor-0d7_KjU(), f4, f6, false, rect0.getTopLeft-F1C5BW0(), rect0.getSize-NH-jbRc(), this.getAlpha(), new Stroke(drawScope0.toPx-0680j_4(this.getStrokeWidth-D9Ej5fM()), 0.0f, 2, 0, null, 26, null), null, 0, 0x300, null);
        if(this.getArrowEnabled()) {
            this.a().reset();
            this.a().moveTo(0.0f, 0.0f);
            Path path0 = this.a();
            float f7 = drawScope0.toPx-0680j_4(this.getArrowWidth-D9Ej5fM());
            path0.lineTo(this.getArrowScale() * f7, 0.0f);
            Path path1 = this.a();
            float f8 = drawScope0.toPx-0680j_4(this.getArrowWidth-D9Ej5fM());
            float f9 = this.getArrowScale();
            float f10 = drawScope0.toPx-0680j_4(this.getArrowHeight-D9Ej5fM());
            path1.lineTo(f9 * f8 / 2.0f, this.getArrowScale() * f10);
            float f11 = drawScope0.toPx-0680j_4(this.getArrowWidth-D9Ej5fM());
            float f12 = this.getArrowScale();
            Path path2 = this.a();
            float f13 = Offset.getX-impl(rect0.getCenter-F1C5BW0());
            float f14 = Offset.getY-impl(rect0.getCenter-F1C5BW0());
            path2.translate-k-4lQ0M(OffsetKt.Offset(f13 + Math.min(rect0.getWidth(), rect0.getHeight()) / 2.0f - f12 * f11 / 2.0f, drawScope0.toPx-0680j_4(this.getStrokeWidth-D9Ej5fM()) / 2.0f + f14));
            this.a().close();
            long v2 = drawScope0.getCenter-F1C5BW0();
            DrawContext drawContext1 = drawScope0.getDrawContext();
            long v3 = drawContext1.getSize-NH-jbRc();
            drawContext1.getCanvas().save();
            drawContext1.getTransform().rotate-Uv8p0NA(f4 + f6, v2);
            DrawScope.drawPath-LG529CI$default(drawScope0, this.a(), this.getColor-0d7_KjU(), this.getAlpha(), null, null, 0, 56, null);
            r0.a.y(drawContext1, v3);
        }
        r0.a.y(drawContext0, v1);
    }

    public final void setAlpha(float f) {
        this.g.setValue(f);
    }

    public final void setArcRadius-0680j_4(float f) {
        Dp dp0 = Dp.box-impl(f);
        this.h.setValue(dp0);
    }

    public final void setArrowEnabled(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void setArrowHeight-0680j_4(float f) {
        Dp dp0 = Dp.box-impl(f);
        this.l.setValue(dp0);
    }

    public final void setArrowScale(float f) {
        this.m.setValue(f);
    }

    public final void setArrowWidth-0680j_4(float f) {
        Dp dp0 = Dp.box-impl(f);
        this.k.setValue(dp0);
    }

    public final void setColor-8_81llA(long v) {
        Color color0 = Color.box-impl(v);
        this.f.setValue(color0);
    }

    public final void setEndTrim(float f) {
        this.p.setValue(f);
    }

    public final void setRotation(float f) {
        this.q.setValue(f);
    }

    public final void setStartTrim(float f) {
        this.o.setValue(f);
    }

    public final void setStrokeWidth-0680j_4(float f) {
        Dp dp0 = Dp.box-impl(f);
        this.i.setValue(dp0);
    }
}

