package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016\u00A2\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001A\u00060\u0002j\u0002`\u0007H\u0016\u00A2\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001A\u0004\u0018\u00010\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\u00138V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u000B\u001A\u00020\u00198V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR*\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001E8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010)\u001A\u00020$2\u0006\u0010\u000B\u001A\u00020$8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R*\u0010-\u001A\u00020*2\u0006\u0010\u000B\u001A\u00020*8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b+\u0010&\"\u0004\b,\u0010(R$\u00100\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\u00138V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R*\u00104\u001A\u0002012\u0006\u0010\u000B\u001A\u0002018V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b2\u0010&\"\u0004\b3\u0010(R*\u00108\u001A\u0002052\u0006\u0010\u000B\u001A\u0002058V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b6\u0010&\"\u0004\b7\u0010(R$\u0010;\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\u00138V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b9\u0010\u0015\"\u0004\b:\u0010\u0017R*\u0010?\u001A\u00020<2\u0006\u0010\u000B\u001A\u00020<8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b=\u0010&\"\u0004\b>\u0010(R4\u0010F\u001A\n\u0018\u00010@j\u0004\u0018\u0001`A2\u000E\u0010\u000B\u001A\n\u0018\u00010@j\u0004\u0018\u0001`A8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010L\u001A\u0004\u0018\u00010G2\b\u0010\u000B\u001A\u0004\u0018\u00010G8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bH\u0010I\"\u0004\bJ\u0010K\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "asFrameworkPaint", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/PathEffect;", "value", "e", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "pathEffect", "", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "", "isAntiAlias", "()Z", "setAntiAlias", "(Z)V", "Landroidx/compose/ui/graphics/Color;", "color", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "style", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeJoin", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "shader", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPaint implements Paint {
    public final android.graphics.Paint a;
    public int b;
    public Shader c;
    public ColorFilter d;
    public PathEffect e;

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }

    public AndroidPaint(@NotNull android.graphics.Paint paint0) {
        this.a = paint0;
        this.b = 3;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @NotNull
    public android.graphics.Paint asFrameworkPaint() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getBlendMode-0nO6VwU() {
        return this.b;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public long getColor-0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @Nullable
    public ColorFilter getColorFilter() {
        return this.d;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getFilterQuality-f-v9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @Nullable
    public PathEffect getPathEffect() {
        return this.e;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @Nullable
    public Shader getShader() {
        return this.c;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getStrokeCap-KaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getStrokeJoin-LxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getStyle-TiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f) {
        AndroidPaint_androidKt.setNativeAlpha(this.a, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setAntiAlias(boolean z) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.a, z);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setBlendMode-s9anfk8(int v) {
        if(!BlendMode.equals-impl0(this.b, v)) {
            this.b = v;
            AndroidPaint_androidKt.setNativeBlendMode-GB0RdKg(this.a, v);
        }
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setColor-8_81llA(long v) {
        AndroidPaint_androidKt.setNativeColor-4WTKRHQ(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.d = colorFilter0;
        AndroidPaint_androidKt.setNativeColorFilter(this.a, colorFilter0);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setFilterQuality-vDHp3xo(int v) {
        AndroidPaint_androidKt.setNativeFilterQuality-50PEsBU(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setPathEffect(@Nullable PathEffect pathEffect0) {
        AndroidPaint_androidKt.setNativePathEffect(this.a, pathEffect0);
        this.e = pathEffect0;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setShader(@Nullable Shader shader0) {
        this.c = shader0;
        AndroidPaint_androidKt.setNativeShader(this.a, shader0);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeCap-BeK7IIE(int v) {
        AndroidPaint_androidKt.setNativeStrokeCap-CSYIeUk(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeJoin-Ww9F2mQ(int v) {
        AndroidPaint_androidKt.setNativeStrokeJoin-kLtJ_vA(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.a, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.a, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStyle-k9PVt8s(int v) {
        AndroidPaint_androidKt.setNativeStyle--5YerkU(this.a, v);
    }
}

