package androidx.compose.ui.text.platform;

import android.graphics.Paint.Style;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.material3.p6;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0015\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001D\u001A\u00020\n2\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u0004\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010 \u001A\u00020\n2\b\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u00A2\u0006\u0004\b \u0010!R(\u0010\u000E\u001A\u00020\r8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b\'\u0010(\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\u0010R*\u0010\u0017\u001A\u0004\u0018\u00010\u00168\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b/\u0010(\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R2\u00109\u001A\u0012\u0012\f\u0012\n\u0018\u000101j\u0004\u0018\u0001`2\u0018\u0001008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R0\u0010A\u001A\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010(\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010H\u001A\u00020B2\u0006\u0010C\u001A\u00020B8F@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006I"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "Landroidx/compose/ui/graphics/Color;", "color", "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrush", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "d", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "()V", "e", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text_release", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text_release", "(Landroidx/compose/ui/graphics/Brush;)V", "getBrush$ui_text_release$annotations", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "f", "Landroidx/compose/runtime/State;", "getShaderState$ui_text_release", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text_release", "(Landroidx/compose/runtime/State;)V", "shaderState", "g", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text_release", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text_release", "(Landroidx/compose/ui/geometry/Size;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "brushSize", "Landroidx/compose/ui/graphics/BlendMode;", "value", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,203:1\n1#2:204\n696#3:205\n198#4:206\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n105#1:205\n131#1:206\n*E\n"})
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    public Paint a;
    public TextDecoration b;
    public int c;
    public Shadow d;
    public Brush e;
    public State f;
    public Size g;
    public DrawStyle h;

    public AndroidTextPaint(int v, float f) {
        super(v);
        this.density = f;
        this.b = TextDecoration.Companion.getNone();
        this.c = 3;
        this.d = Shadow.Companion.getNone();
    }

    public final Paint a() {
        Paint paint0 = this.a;
        if(paint0 != null) {
            return paint0;
        }
        Paint paint1 = AndroidPaint_androidKt.asComposePaint(this);
        this.a = paint1;
        return paint1;
    }

    public final int getBlendMode-0nO6VwU() {
        return this.c;
    }

    @Nullable
    public final Brush getBrush$ui_text_release() {
        return this.e;
    }

    @VisibleForTesting
    public static void getBrush$ui_text_release$annotations() {
    }

    @Nullable
    public final Size getBrushSize-VsRJwc0$ui_text_release() {
        return this.g;
    }

    @VisibleForTesting
    public static void getBrushSize-VsRJwc0$ui_text_release$annotations() {
    }

    @Nullable
    public final State getShaderState$ui_text_release() {
        return this.f;
    }

    @NotNull
    public final Shadow getShadow$ui_text_release() {
        return this.d;
    }

    @VisibleForTesting
    public static void getShadow$ui_text_release$annotations() {
    }

    public final void setBlendMode-s9anfk8(int v) {
        if(BlendMode.equals-impl0(v, this.c)) {
            return;
        }
        this.a().setBlendMode-s9anfk8(v);
        this.c = v;
    }

    public final void setBrush$ui_text_release(@Nullable Brush brush0) {
        this.e = brush0;
    }

    public final void setBrush-12SF9DM(@Nullable Brush brush0, long v, float f) {
        Shader shader0 = null;
        if(brush0 == null) {
            this.f = null;
            this.e = null;
            this.g = null;
            this.setShader(null);
            return;
        }
        if(brush0 instanceof SolidColor) {
            this.setColor-8_81llA(TextDrawStyleKt.modulate-DxMtmZc(((SolidColor)brush0).getValue-0d7_KjU(), f));
            return;
        }
        if(brush0 instanceof ShaderBrush) {
            if((!Intrinsics.areEqual(this.e, brush0) || !(this.g == null ? false : Size.equals-impl0(this.g.unbox-impl(), v))) && v != 0x7FC000007FC00000L) {
                this.e = brush0;
                this.g = Size.box-impl(v);
                this.f = SnapshotStateKt.derivedStateOf(new p6(2, v, brush0));
            }
            Paint paint0 = this.a();
            State state0 = this.f;
            if(state0 != null) {
                shader0 = (Shader)state0.getValue();
            }
            paint0.setShader(shader0);
            AndroidTextPaint_androidKt.setAlpha(this, f);
        }
    }

    public static void setBrush-12SF9DM$default(AndroidTextPaint androidTextPaint0, Brush brush0, long v, float f, int v1, Object object0) {
        if((v1 & 4) != 0) {
            f = NaNf;
        }
        androidTextPaint0.setBrush-12SF9DM(brush0, v, f);
    }

    public final void setBrushSize-iaC8Vc4$ui_text_release(@Nullable Size size0) {
        this.g = size0;
    }

    public final void setColor-8_81llA(long v) {
        if(v != 16L) {
            this.setColor(ColorKt.toArgb-8_81llA(v));
            this.f = null;
            this.e = null;
            this.g = null;
            this.setShader(null);
        }
    }

    public final void setDrawStyle(@Nullable DrawStyle drawStyle0) {
        if(drawStyle0 == null) {
            return;
        }
        if(!Intrinsics.areEqual(this.h, drawStyle0)) {
            this.h = drawStyle0;
            if(Intrinsics.areEqual(drawStyle0, Fill.INSTANCE)) {
                this.setStyle(Paint.Style.FILL);
                return;
            }
            if(drawStyle0 instanceof Stroke) {
                this.a().setStyle-k9PVt8s(1);
                this.a().setStrokeWidth(((Stroke)drawStyle0).getWidth());
                this.a().setStrokeMiterLimit(((Stroke)drawStyle0).getMiter());
                this.a().setStrokeJoin-Ww9F2mQ(((Stroke)drawStyle0).getJoin-LxFBmk8());
                this.a().setStrokeCap-BeK7IIE(((Stroke)drawStyle0).getCap-KaPHkGw());
                this.a().setPathEffect(((Stroke)drawStyle0).getPathEffect());
            }
        }
    }

    public final void setShaderState$ui_text_release(@Nullable State state0) {
        this.f = state0;
    }

    public final void setShadow(@Nullable Shadow shadow0) {
        if(shadow0 == null) {
            return;
        }
        if(!Intrinsics.areEqual(this.d, shadow0)) {
            this.d = shadow0;
            if(Intrinsics.areEqual(shadow0, Shadow.Companion.getNone())) {
                this.clearShadowLayer();
                return;
            }
            this.setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.d.getBlurRadius()), Offset.getX-impl(this.d.getOffset-F1C5BW0()), Offset.getY-impl(this.d.getOffset-F1C5BW0()), ColorKt.toArgb-8_81llA(this.d.getColor-0d7_KjU()));
        }
    }

    public final void setShadow$ui_text_release(@NotNull Shadow shadow0) {
        this.d = shadow0;
    }

    public final void setTextDecoration(@Nullable TextDecoration textDecoration0) {
        if(textDecoration0 == null) {
            return;
        }
        if(!Intrinsics.areEqual(this.b, textDecoration0)) {
            this.b = textDecoration0;
            this.setUnderlineText(textDecoration0.contains(TextDecoration.Companion.getUnderline()));
            this.setStrikeThruText(this.b.contains(TextDecoration.Companion.getLineThrough()));
        }
    }
}

