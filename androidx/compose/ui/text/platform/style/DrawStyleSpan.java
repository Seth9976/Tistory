package androidx.compose.ui.text.platform.style;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    public final DrawStyle a;

    public DrawStyleSpan(@NotNull DrawStyle drawStyle0) {
        this.a = drawStyle0;
    }

    @NotNull
    public final DrawStyle getDrawStyle() {
        return this.a;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint0) {
        Paint.Cap paint$Cap0;
        Paint.Join paint$Join0;
        if(textPaint0 != null) {
            DrawStyle drawStyle0 = this.a;
            if(Intrinsics.areEqual(drawStyle0, Fill.INSTANCE)) {
                textPaint0.setStyle(Paint.Style.FILL);
                return;
            }
            if(drawStyle0 instanceof Stroke) {
                textPaint0.setStyle(Paint.Style.STROKE);
                textPaint0.setStrokeWidth(((Stroke)drawStyle0).getWidth());
                textPaint0.setStrokeMiter(((Stroke)drawStyle0).getMiter());
                int v = ((Stroke)drawStyle0).getJoin-LxFBmk8();
                if(StrokeJoin.equals-impl0(v, 0)) {
                    paint$Join0 = Paint.Join.MITER;
                }
                else if(StrokeJoin.equals-impl0(v, 1)) {
                    paint$Join0 = Paint.Join.ROUND;
                }
                else {
                    paint$Join0 = StrokeJoin.equals-impl0(v, 2) ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint0.setStrokeJoin(paint$Join0);
                int v1 = ((Stroke)drawStyle0).getCap-KaPHkGw();
                if(StrokeCap.equals-impl0(v1, 0)) {
                    paint$Cap0 = Paint.Cap.BUTT;
                }
                else if(StrokeCap.equals-impl0(v1, 1)) {
                    paint$Cap0 = Paint.Cap.ROUND;
                }
                else {
                    paint$Cap0 = StrokeCap.equals-impl0(v1, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint0.setStrokeCap(paint$Cap0);
                PathEffect pathEffect0 = ((Stroke)drawStyle0).getPathEffect();
                textPaint0.setPathEffect((pathEffect0 == null ? null : AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect0)));
            }
        }
    }
}

