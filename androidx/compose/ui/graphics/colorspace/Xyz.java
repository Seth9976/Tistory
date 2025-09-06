package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\'\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\'\u0010\u001A\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\tH\u0010¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010#\u001A\u00020 2\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u001C\u001A\u00020\t2\u0006\u0010\u001D\u001A\u00020\t2\u0006\u0010\u001E\u001A\u00020\t2\u0006\u0010\u001F\u001A\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u0010R\u0014\u0010&\u001A\u00020%8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "getMinValue", "(I)F", "getMaxValue", "", "v", "toXyz", "([F)[F", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,82:1\n79#1:83\n79#1:100\n79#1:117\n79#1:134\n79#1:154\n79#1:171\n79#1:188\n79#1:205\n79#1:222\n71#2,16:84\n71#2,16:101\n71#2,16:118\n71#2,16:135\n71#2,16:155\n71#2,16:172\n71#2,16:189\n71#2,16:206\n71#2,16:223\n71#2,16:239\n63#3,3:151\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n46#1:83\n47#1:100\n48#1:117\n53#1:134\n57#1:154\n67#1:171\n71#1:188\n72#1:205\n73#1:222\n46#1:84,16\n47#1:101,16\n48#1:118,16\n53#1:135,16\n57#1:155,16\n67#1:172,16\n71#1:189,16\n72#1:206,16\n73#1:223,16\n79#1:239,16\n53#1:151,3\n*E\n"})
public final class Xyz extends ColorSpace {
    public Xyz(@NotNull String s, int v) {
        super(s, 0x300000001L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] arr_f) {
        float f = arr_f[0];
        float f1 = -2.0f;
        if(f < -2.0f) {
            f = -2.0f;
        }
        float f2 = 2.0f;
        if(f > 2.0f) {
            f = 2.0f;
        }
        arr_f[0] = f;
        float f3 = arr_f[1];
        if(f3 < -2.0f) {
            f3 = -2.0f;
        }
        if(f3 > 2.0f) {
            f3 = 2.0f;
        }
        arr_f[1] = f3;
        float f4 = arr_f[2];
        if(f4 >= -2.0f) {
            f1 = f4;
        }
        if(f1 <= 2.0f) {
            f2 = f1;
        }
        arr_f[2] = f2;
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return 2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return -2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f1, float f2) {
        if(f < -2.0f) {
            f = -2.0f;
        }
        float f3 = 2.0f;
        if(f > 2.0f) {
            f = 2.0f;
        }
        if(f1 < -2.0f) {
            f1 = -2.0f;
        }
        if(f1 <= 2.0f) {
            f3 = f1;
        }
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f3)) & 0xFFFFFFFFL;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] arr_f) {
        float f = arr_f[0];
        float f1 = -2.0f;
        if(f < -2.0f) {
            f = -2.0f;
        }
        float f2 = 2.0f;
        if(f > 2.0f) {
            f = 2.0f;
        }
        arr_f[0] = f;
        float f3 = arr_f[1];
        if(f3 < -2.0f) {
            f3 = -2.0f;
        }
        if(f3 > 2.0f) {
            f3 = 2.0f;
        }
        arr_f[1] = f3;
        float f4 = arr_f[2];
        if(f4 >= -2.0f) {
            f1 = f4;
        }
        if(f1 <= 2.0f) {
            f2 = f1;
        }
        arr_f[2] = f2;
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f1, float f2) {
        if(f2 < -2.0f) {
            f2 = -2.0f;
        }
        return f2 > 2.0f ? 2.0f : f2;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long xyzaToColor-JlNiLsg$ui_graphics_release(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        if(f < -2.0f) {
            f = -2.0f;
        }
        float f4 = 2.0f;
        if(f > 2.0f) {
            f = 2.0f;
        }
        if(f1 < -2.0f) {
            f1 = -2.0f;
        }
        if(f1 > 2.0f) {
            f1 = 2.0f;
        }
        if(f2 < -2.0f) {
            f2 = -2.0f;
        }
        if(f2 <= 2.0f) {
            f4 = f2;
        }
        return ColorKt.Color(f, f1, f4, f3, colorSpace0);
    }
}

