package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\u001A\r\u0010\u0018\u001A\u00020\u0004*\u00020\u0019H\u0087\n\u001A\r\u0010\u0018\u001A\u00020\u0001*\u00020\u0001H\u0086\n\u001A\r\u0010\u0018\u001A\u00020\u0004*\u00020\u0005H\u0087\n\u001A\r\u0010\u001A\u001A\u00020\u0004*\u00020\u0019H\u0087\n\u001A\r\u0010\u001A\u001A\u00020\u0001*\u00020\u0001H\u0086\n\u001A\r\u0010\u001A\u001A\u00020\u0004*\u00020\u0005H\u0087\n\u001A\r\u0010\u001B\u001A\u00020\u0004*\u00020\u0019H\u0087\n\u001A\r\u0010\u001B\u001A\u00020\u0001*\u00020\u0001H\u0086\n\u001A\r\u0010\u001B\u001A\u00020\u0004*\u00020\u0005H\u0087\n\u001A\r\u0010\u001C\u001A\u00020\u0004*\u00020\u0019H\u0087\n\u001A\r\u0010\u001C\u001A\u00020\u0001*\u00020\u0001H\u0086\n\u001A\r\u0010\u001C\u001A\u00020\u0004*\u00020\u0005H\u0087\n\u001A\u0015\u0010\u001D\u001A\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001A\u00020\nH\u0087\f\u001A\u0015\u0010\u001D\u001A\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001A\u00020\u001EH\u0087\f\u001A\u0015\u0010\u001D\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001A\u00020\nH\u0087\f\u001A\u0015\u0010\u001D\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001A\u00020\u001EH\u0087\f\u001A\u0015\u0010\u001D\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001A\u00020\nH\u0087\f\u001A\u0015\u0010\u001D\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001A\u00020\u001EH\u0087\f\u001A\u0015\u0010\u001F\u001A\u00020\u0019*\u00020\u00192\u0006\u0010 \u001A\u00020\u0019H\u0087\u0002\u001A\r\u0010!\u001A\u00020\u0019*\u00020\u0001H\u0087\b\u001A\r\u0010!\u001A\u00020\u0019*\u00020\u0005H\u0087\b\u001A\r\u0010\"\u001A\u00020\u0001*\u00020\u0005H\u0087\b\u001A\r\u0010\"\u001A\u00020\u0001*\u00020#H\u0087\b\u001A\r\u0010$\u001A\u00020\u0005*\u00020\u0001H\u0087\b\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00018\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0000\u001A\u00020\u0004*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0002\u0010\u0006\"\u0016\u0010\u0007\u001A\u00020\u0001*\u00020\u00018\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\u0003\"\u0016\u0010\u0007\u001A\u00020\u0004*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001A\u00020\n*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\f\"\u0016\u0010\r\u001A\u00020\u0001*\u00020\u00018\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u0003\"\u0016\u0010\r\u001A\u00020\u0004*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u0006\"\u0016\u0010\u000F\u001A\u00020\u0010*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0011\"\u0016\u0010\u0012\u001A\u00020\u0010*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0011\"\u0016\u0010\u0013\u001A\u00020\u0004*\u00020\u00018\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0013\u001A\u00020\u0004*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u0006\"\u0016\u0010\u0016\u001A\u00020\u0001*\u00020\u00018\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0003\"\u0016\u0010\u0016\u001A\u00020\u0004*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0006\u00A8\u0006%"}, d2 = {"alpha", "", "getAlpha", "(I)I", "", "", "(J)F", "blue", "getBlue", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "green", "getGreen", "isSrgb", "", "(J)Z", "isWideGamut", "luminance", "getLuminance", "(I)F", "red", "getRed", "component1", "Landroid/graphics/Color;", "component2", "component3", "component4", "convertTo", "Landroid/graphics/ColorSpace$Named;", "plus", "c", "toColor", "toColorInt", "", "toColorLong", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ColorKt {
    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component1(long v) {
        return Color.red(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component1(@NotNull Color color0) {
        return color0.getComponent(0);
    }

    public static final int component1(@ColorInt int v) {
        return v >> 24 & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component2(long v) {
        return Color.green(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component2(@NotNull Color color0) {
        return color0.getComponent(1);
    }

    public static final int component2(@ColorInt int v) {
        return v >> 16 & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component3(long v) {
        return Color.blue(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component3(@NotNull Color color0) {
        return color0.getComponent(2);
    }

    public static final int component3(@ColorInt int v) {
        return v >> 8 & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component4(long v) {
        return Color.alpha(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float component4(@NotNull Color color0) {
        return color0.getComponent(3);
    }

    public static final int component4(@ColorInt int v) {
        return v & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final long convertTo(@ColorInt int v, @NotNull ColorSpace.Named colorSpace$Named0) {
        return Color.convert(v, ColorSpace.get(colorSpace$Named0));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final long convertTo(@ColorInt int v, @NotNull ColorSpace colorSpace0) {
        return Color.convert(v, colorSpace0);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final long convertTo(long v, @NotNull ColorSpace.Named colorSpace$Named0) {
        return Color.convert(v, ColorSpace.get(colorSpace$Named0));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final long convertTo(long v, @NotNull ColorSpace colorSpace0) {
        return Color.convert(v, colorSpace0);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    @NotNull
    public static final Color convertTo(@NotNull Color color0, @NotNull ColorSpace.Named colorSpace$Named0) {
        return color0.convert(ColorSpace.get(colorSpace$Named0));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    @NotNull
    public static final Color convertTo(@NotNull Color color0, @NotNull ColorSpace colorSpace0) {
        return color0.convert(colorSpace0);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float getAlpha(long v) {
        return Color.alpha(v);
    }

    public static final int getAlpha(@ColorInt int v) {
        return v >> 24 & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float getBlue(long v) {
        return Color.blue(v);
    }

    public static final int getBlue(@ColorInt int v) {
        return v & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    @NotNull
    public static final ColorSpace getColorSpace(long v) {
        return Color.colorSpace(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float getGreen(long v) {
        return Color.green(v);
    }

    public static final int getGreen(@ColorInt int v) {
        return v >> 8 & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float getLuminance(@ColorInt int v) {
        return Color.luminance(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float getLuminance(long v) {
        return Color.luminance(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final float getRed(long v) {
        return Color.red(v);
    }

    public static final int getRed(@ColorInt int v) {
        return v >> 16 & 0xFF;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final boolean isSrgb(long v) {
        return Color.isSrgb(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final boolean isWideGamut(long v) {
        return Color.isWideGamut(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    @NotNull
    public static final Color plus(@NotNull Color color0, @NotNull Color color1) {
        return ColorUtils.compositeColors(color1, color0);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    @NotNull
    public static final Color toColor(@ColorInt int v) {
        return Color.valueOf(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    @NotNull
    public static final Color toColor(long v) {
        return Color.valueOf(v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @ColorInt
    @RequiresApi(26)
    public static final int toColorInt(long v) {
        return Color.toArgb(v);
    }

    @ColorInt
    public static final int toColorInt(@NotNull String s) {
        return Color.parseColor(s);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(26)
    public static final long toColorLong(@ColorInt int v) {
        return Color.pack(v);
    }
}

