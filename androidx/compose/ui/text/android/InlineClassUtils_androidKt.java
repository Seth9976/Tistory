package androidx.compose.ui.text.android;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001A\u0019\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0080\b\u001A\u0011\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0001H\u0080\b\u001A\u0011\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0001H\u0080\b¨\u0006\b"}, d2 = {"packInts", "", "val1", "", "val2", "unpackInt1", "value", "unpackInt2", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InlineClassUtils_androidKt {
    public static final long packInts(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final int unpackInt1(long v) {
        return (int)(v >> 0x20);
    }

    public static final int unpackInt2(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }
}

