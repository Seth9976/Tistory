package androidx.compose.ui.graphics;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build.VERSION;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001A\u0006\u0010\u0000\u001A\u00020\u0001\u001A\b\u0010\u0002\u001A\u00020\u0003H\u0000\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0003\u001A\u0010\u0010\u0005\u001A\u00020\u0006*\u00060\u0003j\u0002`\u0007H\u0000\u001A\u0010\u0010\b\u001A\u00020\t*\u00060\u0003j\u0002`\u0007H\u0000\u001A\u0015\u0010\n\u001A\u00020\u000B*\u00060\u0003j\u0002`\u0007H\u0000\u00A2\u0006\u0002\u0010\f\u001A\u0015\u0010\r\u001A\u00020\u000E*\u00060\u0003j\u0002`\u0007H\u0000\u00A2\u0006\u0002\u0010\u000F\u001A\u0015\u0010\u0010\u001A\u00020\u0011*\u00060\u0003j\u0002`\u0007H\u0000\u00A2\u0006\u0002\u0010\u000F\u001A\u0015\u0010\u0012\u001A\u00020\u0013*\u00060\u0003j\u0002`\u0007H\u0000\u00A2\u0006\u0002\u0010\u000F\u001A\u0010\u0010\u0014\u001A\u00020\u0006*\u00060\u0003j\u0002`\u0007H\u0000\u001A\u0010\u0010\u0015\u001A\u00020\u0006*\u00060\u0003j\u0002`\u0007H\u0000\u001A\u0015\u0010\u0016\u001A\u00020\u0017*\u00060\u0003j\u0002`\u0007H\u0000\u00A2\u0006\u0002\u0010\u000F\u001A\u0018\u0010\u0018\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u0006H\u0000\u001A\u0018\u0010\u001B\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\tH\u0000\u001A\"\u0010\u001C\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001D\u001A\u00020\u001EH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001A\"\u0010!\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u000BH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#\u001A\u001A\u0010$\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\b\u0010\u001A\u001A\u0004\u0018\u00010%H\u0000\u001A\"\u0010&\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u000EH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010 \u001A\u001A\u0010(\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\b\u0010\u001A\u001A\u0004\u0018\u00010)H\u0000\u001A \u0010*\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u000E\u0010\u001A\u001A\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0000\u001A\"\u0010-\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u0011H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010 \u001A\"\u0010/\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u0013H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u0010 \u001A\u0018\u00101\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u0006H\u0000\u001A\u0018\u00102\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u0006H\u0000\u001A\"\u00103\u001A\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001A\u001A\u00020\u0017H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u0010 *\n\u00105\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00066"}, d2 = {"Paint", "Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "Landroid/graphics/Paint;", "asComposePaint", "getNativeAlpha", "", "Landroidx/compose/ui/graphics/NativePaint;", "getNativeAntiAlias", "", "getNativeColor", "Landroidx/compose/ui/graphics/Color;", "(Landroid/graphics/Paint;)J", "getNativeFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "(Landroid/graphics/Paint;)I", "getNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeMiterLimit", "getNativeStrokeWidth", "getNativeStyle", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeAlpha", "", "value", "setNativeAntiAlias", "setNativeBlendMode", "mode", "Landroidx/compose/ui/graphics/BlendMode;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeColor", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "setNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativePathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "setNativeShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeMiterLimit", "setNativeStrokeWidth", "setNativeStyle", "setNativeStyle--5YerkU", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPaint_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] arr_v = new int[Paint.Style.values().length];
            try {
                arr_v[Paint.Style.STROKE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[Paint.Cap.values().length];
            try {
                arr_v1[Paint.Cap.BUTT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[Paint.Cap.ROUND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[Paint.Cap.SQUARE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            int[] arr_v2 = new int[Paint.Join.values().length];
            try {
                arr_v2[Paint.Join.MITER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[Paint.Join.BEVEL.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[Paint.Join.ROUND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$2 = arr_v2;
        }
    }

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    @NotNull
    public static final Paint asComposePaint(@NotNull android.graphics.Paint paint0) {
        return new AndroidPaint(paint0);
    }

    public static final float getNativeAlpha(@NotNull android.graphics.Paint paint0) {
        return ((float)paint0.getAlpha()) / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull android.graphics.Paint paint0) {
        return paint0.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull android.graphics.Paint paint0) {
        return ColorKt.Color(paint0.getColor());
    }

    // 去混淆评级： 中等(50)
    public static final int getNativeFilterQuality(@NotNull android.graphics.Paint paint0) {
        return paint0.isFilterBitmap() ? 1 : 0;
    }

    public static final int getNativeStrokeCap(@NotNull android.graphics.Paint paint0) {
        Paint.Cap paint$Cap0 = paint0.getStrokeCap();
        switch((paint$Cap0 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[paint$Cap0.ordinal()])) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }

    public static final int getNativeStrokeJoin(@NotNull android.graphics.Paint paint0) {
        Paint.Join paint$Join0 = paint0.getStrokeJoin();
        switch((paint$Join0 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[paint$Join0.ordinal()])) {
            case 1: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    public static final float getNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint0) {
        return paint0.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull android.graphics.Paint paint0) {
        return paint0.getStrokeWidth();
    }

    // 去混淆评级： 低(30)
    public static final int getNativeStyle(@NotNull android.graphics.Paint paint0) {
        Paint.Style paint$Style0 = paint0.getStyle();
        return (paint$Style0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paint$Style0.ordinal()]) == 1 ? 1 : 0;
    }

    @NotNull
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(@NotNull android.graphics.Paint paint0, float f) {
        paint0.setAlpha(((int)(((float)Math.rint(f * 255.0f)))));
    }

    public static final void setNativeAntiAlias(@NotNull android.graphics.Paint paint0, boolean z) {
        paint0.setAntiAlias(z);
    }

    public static final void setNativeBlendMode-GB0RdKg(@NotNull android.graphics.Paint paint0, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.setBlendMode-GB0RdKg(paint0, v);
            return;
        }
        paint0.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v)));
    }

    public static final void setNativeColor-4WTKRHQ(@NotNull android.graphics.Paint paint0, long v) {
        paint0.setColor(ColorKt.toArgb-8_81llA(v));
    }

    public static final void setNativeColorFilter(@NotNull android.graphics.Paint paint0, @Nullable ColorFilter colorFilter0) {
        paint0.setColorFilter((colorFilter0 == null ? null : AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter0)));
    }

    public static final void setNativeFilterQuality-50PEsBU(@NotNull android.graphics.Paint paint0, int v) {
        paint0.setFilterBitmap(!FilterQuality.equals-impl0(v, 0));
    }

    public static final void setNativePathEffect(@NotNull android.graphics.Paint paint0, @Nullable PathEffect pathEffect0) {
        paint0.setPathEffect((((AndroidPathEffect)pathEffect0) == null ? null : ((AndroidPathEffect)pathEffect0).getNativePathEffect()));
    }

    public static final void setNativeShader(@NotNull android.graphics.Paint paint0, @Nullable Shader shader0) {
        paint0.setShader(shader0);
    }

    public static final void setNativeStrokeCap-CSYIeUk(@NotNull android.graphics.Paint paint0, int v) {
        Paint.Cap paint$Cap0;
        if(StrokeCap.equals-impl0(v, 2)) {
            paint$Cap0 = Paint.Cap.SQUARE;
        }
        else {
            paint$Cap0 = StrokeCap.equals-impl0(v, 1) ? Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
        paint0.setStrokeCap(paint$Cap0);
    }

    public static final void setNativeStrokeJoin-kLtJ_vA(@NotNull android.graphics.Paint paint0, int v) {
        Paint.Join paint$Join0;
        if(StrokeJoin.equals-impl0(v, 0)) {
            paint$Join0 = Paint.Join.MITER;
        }
        else if(StrokeJoin.equals-impl0(v, 2)) {
            paint$Join0 = Paint.Join.BEVEL;
        }
        else {
            paint$Join0 = StrokeJoin.equals-impl0(v, 1) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint0.setStrokeJoin(paint$Join0);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint0, float f) {
        paint0.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(@NotNull android.graphics.Paint paint0, float f) {
        paint0.setStrokeWidth(f);
    }

    // 去混淆评级： 低(20)
    public static final void setNativeStyle--5YerkU(@NotNull android.graphics.Paint paint0, int v) {
        paint0.setStyle((PaintingStyle.equals-impl0(v, 1) ? Paint.Style.STROKE : Paint.Style.FILL));
    }
}

