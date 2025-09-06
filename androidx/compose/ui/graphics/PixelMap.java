package androidx.compose.ui.graphics;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0010\u001A\u00020\r2\b\b\u0001\u0010\u000B\u001A\u00020\u00042\b\b\u0001\u0010\f\u001A\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001A\u0004\b\u001A\u0010\u0018R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0016\u001A\u0004\b\u001C\u0010\u0018R\u0017\u0010\b\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0016\u001A\u0004\b\u001E\u0010\u0018\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/graphics/PixelMap;", "", "", "buffer", "", "width", "height", "bufferOffset", "stride", "<init>", "([IIIII)V", "x", "y", "Landroidx/compose/ui/graphics/Color;", "get-WaAFU9c", "(II)J", "get", "a", "[I", "getBuffer", "()[I", "b", "I", "getWidth", "()I", "c", "getHeight", "d", "getBufferOffset", "e", "getStride", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PixelMap {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public PixelMap(@NotNull int[] arr_v, int v, int v1, int v2, int v3) {
        this.a = arr_v;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    public final long get-WaAFU9c(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        return ColorKt.Color(this.a[v1 * this.e + this.d + v]);
    }

    @NotNull
    public final int[] getBuffer() {
        return this.a;
    }

    public final int getBufferOffset() {
        return this.d;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getStride() {
        return this.e;
    }

    public final int getWidth() {
        return this.b;
    }
}

