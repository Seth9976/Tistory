package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0018\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0018\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001A\"\u0010\r\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\"\u0010\u000F\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"", "f", "", "floatToHalf", "(F)S", "h", "halfToFloat", "(S)F", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "min-AoSsdG0", "(SS)S", "min", "max-AoSsdG0", "max", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,716:1\n22#2:717\n22#2:718\n22#2:719\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n660#1:717\n677#1:718\n587#1:719\n*E\n"})
public final class Float16Kt {
    public static final short a;
    public static final short b;
    public static final float c;

    static {
        Float16Kt.a = 0x3C00;
        Float16Kt.b = (short)0xBC00;
        Float16Kt.c = 0.5f;
    }

    public static final float access$getFp32DenormalFloat$p() [...] // 潜在的解密器

    public static final short access$getNegativeOne$p() [...] // 潜在的解密器

    public static final short access$getOne$p() [...] // 潜在的解密器

    public static final short floatToHalf(float f) {
        int v = Float.floatToRawIntBits(f);
        int v1 = v >>> 23 & 0xFF;
        if(v1 == 0xFF) {
            return (0x7FFFFF & v) == 0 ? ((short)(v >>> 0x1F << 15 | 0x7C00)) : ((short)(v >>> 0x1F << 15 | 0x7E00));
        }
        if(v1 - 0x70 >= 0x1F) {
            return (short)(v >>> 0x1F << 15 | 0xC400);
        }
        if(v1 - 0x70 <= 0) {
            if(v1 - 0x70 >= -10) {
                int v2 = (0x800000 | 0x7FFFFF & v) >> 0x71 - v1;
                return (short)(v >>> 0x1F << 15 | ((v2 & 0x1000) == 0 ? (0x800000 | 0x7FFFFF & v) >> 0x71 - v1 : v2 + 0x2000) >> 13);
            }
            return (short)(v >>> 0x1F << 15);
        }
        int v3 = (0x7FFFFF & v) >> 13;
        return (v & 0x1000) == 0 ? ((short)(v >>> 0x1F << 15 | v1 - 0x70 << 10 | v3)) : ((short)((v1 - 0x70 << 10 | v3) + 1 | v >>> 0x1F << 15));
    }

    public static final float halfToFloat(short v) {
        int v1 = (0xFFFF & v) >>> 10 & 0x1F;
        if(v1 == 0) {
            if((v & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v & 0x3FF) + 0x3F000000) - 0.5f;
                return (0x8000 & v) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v) << 16);
        }
        int v2 = (v & 0x3FF) << 13;
        if(v1 == 0x1F) {
            if(v2 != 0) {
                v2 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v) << 16 | v2);
        }
        return Float.intBitsToFloat(v1 + 0x70 << 23 | (0x8000 & v) << 16 | v2);
    }

    public static final short max-AoSsdG0(short v, short v1) {
        if(!Float16.isNaN-impl(v) && !Float16.isNaN-impl(v1)) {
            return Float16.compareTo-41bOqos(v, v1) >= 0 ? v : v1;
        }
        return 0x7E00;
    }

    public static final short min-AoSsdG0(short v, short v1) {
        if(!Float16.isNaN-impl(v) && !Float16.isNaN-impl(v1)) {
            return Float16.compareTo-41bOqos(v, v1) <= 0 ? v : v1;
        }
        return 0x7E00;
    }
}

