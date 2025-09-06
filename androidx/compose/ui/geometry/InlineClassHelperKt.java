package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A*\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u001A\u0010\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u000FH\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0006\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0007\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\b\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DualFirstNaN", "", "DualFloatInfinityBase", "DualFloatSignBit", "DualUnsignedFloatMask", "FloatInfinityBase", "Uint64High32", "Uint64Low32", "UnspecifiedPackedFloats", "checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "throwIllegalStateException", "message", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InlineClassHelperKt {
    public static final long DualFirstNaN = 0x7F8000017F800001L;
    public static final long DualFloatInfinityBase = 0x7F8000007F800000L;
    public static final long DualFloatSignBit = 0x8000000080000000L;
    public static final long DualUnsignedFloatMask = 0x7FFFFFFF7FFFFFFFL;
    public static final long FloatInfinityBase = 0x7F800000L;
    public static final long Uint64High32 = 0x8000000080000000L;
    public static final long Uint64Low32 = 0x100000001L;
    public static final long UnspecifiedPackedFloats = 0x7FC000007FC00000L;

    public static final void checkPrecondition(boolean z, @NotNull Function0 function00) {
        if(!z) {
            InlineClassHelperKt.throwIllegalStateException(((String)function00.invoke()));
        }
    }

    public static final void throwIllegalStateException(@NotNull String s) {
        throw new IllegalStateException(s);
    }
}

