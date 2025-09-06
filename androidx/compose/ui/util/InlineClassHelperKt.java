package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001A\u0019\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0086\b\u001A\u0019\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u0006H\u0086\b\u001A\u0011\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\t\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\n\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\u000B\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\f\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\r\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0001H\u0086\b¨\u0006\u000E"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackAbsFloat1", "value", "unpackAbsFloat2", "unpackFloat1", "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,116:1\n22#2:117\n22#2:118\n22#2:119\n22#2:120\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n72#1:117\n79#1:118\n86#1:119\n93#1:120\n*E\n"})
public final class InlineClassHelperKt {
    public static final long packFloats(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static final long packInts(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final float unpackAbsFloat1(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20 & 0x7FFFFFFFL)));
    }

    public static final float unpackAbsFloat2(long v) {
        return Float.intBitsToFloat(((int)(v & 0x7FFFFFFFL)));
    }

    public static final float unpackFloat1(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float unpackFloat2(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static final int unpackInt1(long v) {
        return (int)(v >> 0x20);
    }

    public static final int unpackInt2(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }
}

