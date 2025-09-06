package androidx.compose.ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\u001A;\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0007\u00A2\u0006\u0004\b\b\u0010\t\u001A;\u0010\n\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0001\u00A2\u0006\u0004\b\n\u0010\t\u001A\u0019\u0010\b\u001A\u00020\u00072\b\b\u0001\u0010\f\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\b\u0010\r\u001A\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000EH\u0007\u00A2\u0006\u0004\b\b\u0010\u000F\u001A7\u0010\b\u001A\u00020\u00072\b\b\u0001\u0010\u0001\u001A\u00020\u000B2\b\b\u0001\u0010\u0002\u001A\u00020\u000B2\b\b\u0001\u0010\u0003\u001A\u00020\u000B2\b\b\u0003\u0010\u0004\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\b\u0010\u0010\u001A,\u0010\u0016\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u00072\b\b\u0001\u0010\u0013\u001A\u00020\u0000H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A\u001E\u0010\u001A\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\u0017\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u0016\u0010\u001D\u001A\u00020\u0000*\u00020\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\u0016\u0010 \u001A\u00020\u000B*\u00020\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A%\u0010%\u001A\u00020\u0007*\u00020\u00072\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00070!H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$\"\u001A\u0010\'\u001A\u00020&8\u0000X\u0081T\u00A2\u0006\f\n\u0004\b\'\u0010(\u0012\u0004\b)\u0010*\"\u001F\u00100\u001A\u00020+*\u00020\u00078\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b.\u0010/\u001A\u0004\b,\u0010-\"\u001F\u00103\u001A\u00020+*\u00020\u00078\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b2\u0010/\u001A\u0004\b1\u0010-\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00064"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "UncheckedColor", "", "color", "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "luminance-8_81llA", "(J)F", "luminance", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Lkotlin/ULong;", "UnspecifiedColor", "J", "getUnspecifiedColor$annotations", "()V", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,723:1\n641#1:1110\n641#1:1111\n641#1:1112\n696#1:1136\n71#2,16:724\n71#2,16:740\n71#2,16:756\n71#2,16:772\n71#2,16:802\n71#2,16:856\n71#2,16:910\n71#2,16:964\n71#2,16:1094\n71#2,16:1120\n33#3,7:788\n33#3,7:795\n33#3,7:1113\n604#4,38:818\n604#4,38:872\n604#4,38:926\n604#4,38:980\n604#4,38:1018\n604#4,38:1056\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n621#1:1110\n622#1:1111\n623#1:1112\n708#1:1136\n432#1:724,16\n433#1:740,16\n434#1:756,16\n435#1:772,16\n449#1:802,16\n450#1:856,16\n451#1:910,16\n452#1:964,16\n591#1:1094,16\n676#1:1120,16\n440#1:788,7\n445#1:795,7\n666#1:1113,7\n449#1:818,38\n450#1:872,38\n451#1:926,38\n489#1:980,38\n490#1:1018,38\n491#1:1056,38\n*E\n"})
public final class ColorKt {
    public static final long UnspecifiedColor = 16L;

    @Stable
    public static final long Color(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        int v18;
        int v16;
        int v12;
        int v10;
        int v6;
        int v4;
        float f4 = 1.0f;
        float f5 = 0.0f;
        if(colorSpace0.isSrgb()) {
            float f6 = f3 < 0.0f ? 0.0f : f3;
            if(f6 > 1.0f) {
                f6 = 1.0f;
            }
            float f7 = f < 0.0f ? 0.0f : f;
            if(f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = f1 < 0.0f ? 0.0f : f1;
            if(f8 > 1.0f) {
                f8 = 1.0f;
            }
            if(f2 >= 0.0f) {
                f5 = f2;
            }
            if(f5 <= 1.0f) {
                f4 = f5;
            }
            return ((long)(((int)(f6 * 255.0f + 0.5f)) << 24 | ((int)(f7 * 255.0f + 0.5f)) << 16 | ((int)(f8 * 255.0f + 0.5f)) << 8 | ((int)(f4 * 255.0f + 0.5f)))) << 0x20;
        }
        if(colorSpace0.getComponentCount() != 3) {
            InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int v = colorSpace0.getId$ui_graphics_release();
        if(v == -1) {
            InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float f9 = colorSpace0.getMinValue(0);
        float f10 = colorSpace0.getMaxValue(0);
        if(f >= f9) {
            f9 = f;
        }
        if(f9 <= f10) {
            f10 = f9;
        }
        int v1 = Float.floatToRawIntBits(f10);
        int v2 = v1 >>> 23 & 0xFF;
        int v3 = 0x200;
        if(v2 == 0xFF) {
            v4 = ((v1 & 0x7FFFFF) == 0 ? 0 : 0x200) | (v1 >>> 0x1F << 15 | 0x7C00);
        }
        else if(v2 - 0x70 >= 0x1F) {
            v4 = v1 >>> 0x1F << 15 | 0xC400;
        }
        else if(v2 - 0x70 <= 0) {
            if(v2 - 0x70 >= -10) {
                int v5 = (v1 & 0x7FFFFF | 0x800000) >> 0x71 - v2;
                v6 = ((v5 & 0x1000) == 0 ? (v1 & 0x7FFFFF | 0x800000) >> 0x71 - v2 : v5 + 0x2000) >> 13;
            }
            else {
                v6 = 0;
            }
            v4 = v6 | v1 >>> 0x1F << 15;
        }
        else {
            int v7 = (v1 & 0x7FFFFF) >> 13;
            v4 = (v1 & 0x1000) == 0 ? v7 | (v1 >>> 0x1F << 15 | v2 - 0x70 << 10) : (v2 - 0x70 << 10 | v7) + 1 | v1 >>> 0x1F << 15;
        }
        float f11 = colorSpace0.getMinValue(1);
        float f12 = colorSpace0.getMaxValue(1);
        if(f1 >= f11) {
            f11 = f1;
        }
        if(f11 <= f12) {
            f12 = f11;
        }
        int v8 = Float.floatToRawIntBits(f12);
        int v9 = v8 >>> 23 & 0xFF;
        if(v9 == 0xFF) {
            v10 = ((v8 & 0x7FFFFF) == 0 ? 0 : 0x200) | (v8 >>> 0x1F << 15 | 0x7C00);
        }
        else if(v9 - 0x70 >= 0x1F) {
            v10 = v8 >>> 0x1F << 15 | 0xC400;
        }
        else if(v9 - 0x70 <= 0) {
            if(v9 - 0x70 >= -10) {
                int v11 = (v8 & 0x7FFFFF | 0x800000) >> 0x71 - v9;
                v12 = ((v11 & 0x1000) == 0 ? (v8 & 0x7FFFFF | 0x800000) >> 0x71 - v9 : v11 + 0x2000) >> 13;
            }
            else {
                v12 = 0;
            }
            v10 = v12 | v8 >>> 0x1F << 15;
        }
        else {
            int v13 = (v8 & 0x7FFFFF) >> 13;
            v10 = (v8 & 0x1000) == 0 ? v13 | (v8 >>> 0x1F << 15 | v9 - 0x70 << 10) : (v9 - 0x70 << 10 | v13) + 1 | v8 >>> 0x1F << 15;
        }
        float f13 = colorSpace0.getMinValue(2);
        float f14 = colorSpace0.getMaxValue(2);
        if(f2 >= f13) {
            f13 = f2;
        }
        if(f13 <= f14) {
            f14 = f13;
        }
        int v14 = Float.floatToRawIntBits(f14);
        int v15 = v14 >>> 23 & 0xFF;
        if(v15 == 0xFF) {
            if((0x7FFFFF & v14) == 0) {
                v3 = 0;
            }
            v16 = v14 >>> 0x1F << 15 | 0x7C00 | v3;
        }
        else if(v15 - 0x70 >= 0x1F) {
            v16 = v14 >>> 0x1F << 15 | 0xC400;
        }
        else if(v15 - 0x70 <= 0) {
            if(v15 - 0x70 >= -10) {
                int v17 = (0x7FFFFF & v14 | 0x800000) >> 0x71 - v15;
                v18 = ((v17 & 0x1000) == 0 ? (0x7FFFFF & v14 | 0x800000) >> 0x71 - v15 : v17 + 0x2000) >> 13;
            }
            else {
                v18 = 0;
            }
            v16 = v14 >>> 0x1F << 15 | v18;
        }
        else {
            int v19 = (0x7FFFFF & v14) >> 13;
            v16 = (v14 & 0x1000) == 0 ? v14 >>> 0x1F << 15 | v15 - 0x70 << 10 | v19 : (v15 - 0x70 << 10 | v19) + 1 | v14 >>> 0x1F << 15;
        }
        if(f3 >= 0.0f) {
            f5 = f3;
        }
        if(f5 <= 1.0f) {
            f4 = f5;
        }
        return ((long)v) & 0x3FL | ((((long)(((int)(f4 * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((((long)(((short)v4))) & 0xFFFFL) << 0x30 | (((long)(((short)v10))) & 0xFFFFL) << 0x20 | (0xFFFFL & ((long)(((short)v16)))) << 16));
    }

    @Stable
    public static final long Color(@ColorInt int v) [...] // 潜在的解密器

    @Stable
    public static final long Color(@IntRange(from = 0L, to = 0xFFL) int v, @IntRange(from = 0L, to = 0xFFL) int v1, @IntRange(from = 0L, to = 0xFFL) int v2, @IntRange(from = 0L, to = 0xFFL) int v3) {
        return ColorKt.Color((v & 0xFF) << 16 | (v3 & 0xFF) << 24 | (v1 & 0xFF) << 8 | v2 & 0xFF);
    }

    @Stable
    public static final long Color(long v) [...] // 潜在的解密器

    public static long Color$default(float f, float f1, float f2, float f3, ColorSpace colorSpace0, int v, Object object0) {
        if((v & 8) != 0) {
            f3 = 1.0f;
        }
        if((v & 16) != 0) {
            colorSpace0 = ColorSpaces.INSTANCE.getSrgb();
        }
        return ColorKt.Color(f, f1, f2, f3, colorSpace0);
    }

    public static long Color$default(int v, int v1, int v2, int v3, int v4, Object object0) [...] // 潜在的解密器

    @Stable
    public static final long UncheckedColor(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        int v11;
        int v9;
        int v5;
        int v3;
        if(colorSpace0.isSrgb()) {
            return ((long)(((int)(f3 * 255.0f + 0.5f)) << 24 | ((int)(f * 255.0f + 0.5f)) << 16 | ((int)(f1 * 255.0f + 0.5f)) << 8 | ((int)(255.0f * f2 + 0.5f)))) << 0x20;
        }
        int v = Float.floatToRawIntBits(f);
        int v1 = v >>> 23 & 0xFF;
        int v2 = 0x200;
        if(v1 == 0xFF) {
            v3 = ((v & 0x7FFFFF) == 0 ? 0 : 0x200) | (v >>> 0x1F << 15 | 0x7C00);
        }
        else if(v1 - 0x70 >= 0x1F) {
            v3 = v >>> 0x1F << 15 | 0xC400;
        }
        else if(v1 - 0x70 <= 0) {
            if(v1 - 0x70 >= -10) {
                int v4 = (v & 0x7FFFFF | 0x800000) >> 0x71 - v1;
                v5 = ((v4 & 0x1000) == 0 ? (v & 0x7FFFFF | 0x800000) >> 0x71 - v1 : v4 + 0x2000) >> 13;
            }
            else {
                v5 = 0;
            }
            v3 = v5 | v >>> 0x1F << 15;
        }
        else {
            int v6 = (v & 0x7FFFFF) >> 13;
            v3 = (v & 0x1000) == 0 ? v6 | (v >>> 0x1F << 15 | v1 - 0x70 << 10) : (v1 - 0x70 << 10 | v6) + 1 | v >>> 0x1F << 15;
        }
        int v7 = Float.floatToRawIntBits(f1);
        int v8 = v7 >>> 23 & 0xFF;
        if(v8 == 0xFF) {
            v9 = ((v7 & 0x7FFFFF) == 0 ? 0 : 0x200) | (v7 >>> 0x1F << 15 | 0x7C00);
        }
        else if(v8 - 0x70 >= 0x1F) {
            v9 = v7 >>> 0x1F << 15 | 0xC400;
        }
        else if(v8 - 0x70 <= 0) {
            if(v8 - 0x70 >= -10) {
                int v10 = (v7 & 0x7FFFFF | 0x800000) >> 0x71 - v8;
                v11 = ((v10 & 0x1000) == 0 ? (v7 & 0x7FFFFF | 0x800000) >> 0x71 - v8 : v10 + 0x2000) >> 13;
            }
            else {
                v11 = 0;
            }
            v9 = v11 | v7 >>> 0x1F << 15;
        }
        else {
            int v12 = (v7 & 0x7FFFFF) >> 13;
            v9 = (v7 & 0x1000) == 0 ? v12 | (v7 >>> 0x1F << 15 | v8 - 0x70 << 10) : (v8 - 0x70 << 10 | v12) + 1 | v7 >>> 0x1F << 15;
        }
        int v13 = Float.floatToRawIntBits(f2);
        int v14 = v13 >>> 23 & 0xFF;
        if(v14 == 0xFF) {
            if((0x7FFFFF & v13) == 0) {
                v2 = 0;
            }
            return (((long)(((short)v9))) & 0xFFFFL) << 0x20 | (((long)(((short)v3))) & 0xFFFFL) << 0x30 | (((long)(((short)(v13 >>> 0x1F << 15 | 0x7C00 | v2)))) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)colorSpace0.getId$ui_graphics_release()) & 0x3FL;
        }
        if(v14 - 0x70 >= 0x1F) {
            return (((long)(((short)v9))) & 0xFFFFL) << 0x20 | (((long)(((short)v3))) & 0xFFFFL) << 0x30 | (((long)(((short)(v13 >>> 0x1F << 15 | 0xC400)))) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)colorSpace0.getId$ui_graphics_release()) & 0x3FL;
        }
        if(v14 - 0x70 <= 0) {
            if(v14 - 0x70 >= -10) {
                int v15 = (0x7FFFFF & v13 | 0x800000) >> 0x71 - v14;
                return (((long)(((short)v9))) & 0xFFFFL) << 0x20 | (((long)(((short)v3))) & 0xFFFFL) << 0x30 | (((long)(((short)(v13 >>> 0x1F << 15 | ((v15 & 0x1000) == 0 ? (0x7FFFFF & v13 | 0x800000) >> 0x71 - v14 : v15 + 0x2000) >> 13)))) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)colorSpace0.getId$ui_graphics_release()) & 0x3FL;
            }
            return (((long)(((short)v9))) & 0xFFFFL) << 0x20 | (((long)(((short)v3))) & 0xFFFFL) << 0x30 | (((long)(((short)(v13 >>> 0x1F << 15)))) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)colorSpace0.getId$ui_graphics_release()) & 0x3FL;
        }
        int v16 = (0x7FFFFF & v13) >> 13;
        return (v13 & 0x1000) == 0 ? (((long)(((short)v9))) & 0xFFFFL) << 0x20 | (((long)(((short)v3))) & 0xFFFFL) << 0x30 | (((long)(((short)(v13 >>> 0x1F << 15 | v14 - 0x70 << 10 | v16)))) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)colorSpace0.getId$ui_graphics_release()) & 0x3FL : (((long)(((short)v9))) & 0xFFFFL) << 0x20 | (((long)(((short)v3))) & 0xFFFFL) << 0x30 | (((long)(((short)((v14 - 0x70 << 10 | v16) + 1 | v13 >>> 0x1F << 15)))) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)colorSpace0.getId$ui_graphics_release()) & 0x3FL;
    }

    public static long UncheckedColor$default(float f, float f1, float f2, float f3, ColorSpace colorSpace0, int v, Object object0) {
        if((v & 8) != 0) {
            f3 = 1.0f;
        }
        if((v & 16) != 0) {
            colorSpace0 = ColorSpaces.INSTANCE.getSrgb();
        }
        return ColorKt.UncheckedColor(f, f1, f2, f3, colorSpace0);
    }

    @Stable
    public static final long compositeOver--OWjLjI(long v, long v1) {
        long v2 = Color.convert-vNxB06k(v, Color.getColorSpace-impl(v1));
        float f = Color.getAlpha-impl(v1);
        float f1 = Color.getAlpha-impl(v2);
        float f2 = f * (1.0f - f1) + f1;
        float f3 = Color.getRed-impl(v2);
        float f4 = Color.getRed-impl(v1);
        float f5 = 0.0f;
        int v3 = Float.compare(f2, 0.0f);
        float f6 = Color.getGreen-impl(v2);
        float f7 = Color.getGreen-impl(v1);
        float f8 = Color.getBlue-impl(v2);
        float f9 = Color.getBlue-impl(v1);
        if(v3 != 0) {
            f5 = (f9 * f * (1.0f - f1) + f8 * f1) / f2;
        }
        return ColorKt.UncheckedColor((v3 == 0 ? 0.0f : (f4 * f * (1.0f - f1) + f3 * f1) / f2), (v3 == 0 ? 0.0f : (f7 * f * (1.0f - f1) + f6 * f1) / f2), f5, f2, Color.getColorSpace-impl(v1));
    }

    @PublishedApi
    public static void getUnspecifiedColor$annotations() {
    }

    public static final boolean isSpecified-8_81llA(long v) {
        return v != 16L;
    }

    @Stable
    public static void isSpecified-8_81llA$annotations(long v) {
    }

    public static final boolean isUnspecified-8_81llA(long v) {
        return v == 16L;
    }

    @Stable
    public static void isUnspecified-8_81llA$annotations(long v) {
    }

    @Stable
    public static final long lerp-jxsXWHM(long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        ColorSpace colorSpace0 = ColorSpaces.INSTANCE.getOklab();
        long v2 = Color.convert-vNxB06k(v, colorSpace0);
        long v3 = Color.convert-vNxB06k(v1, colorSpace0);
        float f1 = Color.getAlpha-impl(v2);
        float f2 = Color.getRed-impl(v2);
        float f3 = Color.getGreen-impl(v2);
        float f4 = Color.getBlue-impl(v2);
        float f5 = Color.getAlpha-impl(v3);
        float f6 = Color.getRed-impl(v3);
        float f7 = Color.getGreen-impl(v3);
        float f8 = Color.getBlue-impl(v3);
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 1.0f) {
            f = 1.0f;
        }
        return Color.convert-vNxB06k(ColorKt.UncheckedColor(f * f6 + (1.0f - f) * f2, f * f7 + (1.0f - f) * f3, f * f8 + (1.0f - f) * f4, f * f5 + (1.0f - f) * f1, colorSpace0), Color.getColorSpace-impl(v1));
    }

    @Stable
    public static final float luminance-8_81llA(long v) {
        ColorSpace colorSpace0 = Color.getColorSpace-impl(v);
        if(!ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L)) {
            InlineClassHelperKt.throwIllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ColorModel.toString-impl(colorSpace0.getModel-xdoWZVw())));
        }
        Intrinsics.checkNotNull(colorSpace0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction doubleFunction0 = ((Rgb)colorSpace0).getEotfFunc$ui_graphics_release();
        double f = doubleFunction0.invoke(((double)Color.getRed-impl(v)));
        double f1 = doubleFunction0.invoke(((double)Color.getGreen-impl(v)));
        float f2 = (float)(doubleFunction0.invoke(((double)Color.getBlue-impl(v))) * 0.0722 + (f1 * 0.7152 + f * 0.2126));
        if(f2 < 0.0f) {
            f2 = 0.0f;
        }
        return f2 > 1.0f ? 1.0f : f2;
    }

    public static final long takeOrElse-DxMtmZc(long v, @NotNull Function0 function00) {
        return v == 16L ? ((Color)function00.invoke()).unbox-impl() : v;
    }

    @ColorInt
    @Stable
    public static final int toArgb-8_81llA(long v) {
        return (int)ULong.constructor-impl(Color.convert-vNxB06k(v, ColorSpaces.INSTANCE.getSrgb()) >>> 0x20);
    }
}

