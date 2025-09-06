package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bK\b\u00C0\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u001D\u0010\u0013\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u001D\u0010\u0016\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006R\u001D\u0010\u0019\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u001D\u0010\u001C\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0004\u001A\u0004\b\u001B\u0010\u0006R\u001D\u0010\u001F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001D\u0010\u0004\u001A\u0004\b\u001E\u0010\u0006R\u001D\u0010\"\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b \u0010\u0004\u001A\u0004\b!\u0010\u0006R\u001D\u0010%\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010\u0004\u001A\u0004\b$\u0010\u0006R\u001D\u0010(\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b&\u0010\u0004\u001A\u0004\b\'\u0010\u0006R\u001D\u0010+\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010\u0004\u001A\u0004\b*\u0010\u0006R\u001D\u0010.\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b,\u0010\u0004\u001A\u0004\b-\u0010\u0006R\u001D\u00101\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010\u0004\u001A\u0004\b0\u0010\u0006R\u001D\u00104\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010\u0004\u001A\u0004\b3\u0010\u0006R\u001D\u00107\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010\u0004\u001A\u0004\b6\u0010\u0006R\u001D\u0010:\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b8\u0010\u0004\u001A\u0004\b9\u0010\u0006R\u001D\u0010=\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010\u0004\u001A\u0004\b<\u0010\u0006R\u001D\u0010@\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u0010\u0004\u001A\u0004\b?\u0010\u0006R\u001D\u0010C\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bA\u0010\u0004\u001A\u0004\bB\u0010\u0006R\u001D\u0010F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bD\u0010\u0004\u001A\u0004\bE\u0010\u0006R\u001D\u0010I\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bG\u0010\u0004\u001A\u0004\bH\u0010\u0006R\u001D\u0010L\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bJ\u0010\u0004\u001A\u0004\bK\u0010\u0006\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006M"}, d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "Landroidx/compose/ui/input/key/Key;", "a", "J", "getA-EK5gGoQ", "()J", "A", "b", "getC-EK5gGoQ", "C", "c", "getH-EK5gGoQ", "H", "d", "getV-EK5gGoQ", "V", "e", "getY-EK5gGoQ", "Y", "f", "getX-EK5gGoQ", "X", "g", "getZ-EK5gGoQ", "Z", "h", "getBackslash-EK5gGoQ", "Backslash", "i", "getDirectionLeft-EK5gGoQ", "DirectionLeft", "j", "getDirectionRight-EK5gGoQ", "DirectionRight", "k", "getDirectionUp-EK5gGoQ", "DirectionUp", "l", "getDirectionDown-EK5gGoQ", "DirectionDown", "m", "getPageUp-EK5gGoQ", "PageUp", "n", "getPageDown-EK5gGoQ", "PageDown", "o", "getMoveHome-EK5gGoQ", "MoveHome", "p", "getMoveEnd-EK5gGoQ", "MoveEnd", "q", "getInsert-EK5gGoQ", "Insert", "r", "getEnter-EK5gGoQ", "Enter", "s", "getBackspace-EK5gGoQ", "Backspace", "t", "getDelete-EK5gGoQ", "Delete", "u", "getPaste-EK5gGoQ", "Paste", "v", "getCut-EK5gGoQ", "Cut", "w", "getCopy-EK5gGoQ", "Copy", "x", "getTab-EK5gGoQ", "Tab", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MappedKeys {
    public static final int $stable;
    @NotNull
    public static final MappedKeys INSTANCE;
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;
    public static final long w;
    public static final long x;

    static {
        MappedKeys.INSTANCE = new MappedKeys();  // 初始化器: Ljava/lang/Object;-><init>()V
        MappedKeys.a = 0x1D00000000L;
        MappedKeys.b = 0x1F00000000L;
        MappedKeys.c = 0x2400000000L;
        MappedKeys.d = 0x3200000000L;
        MappedKeys.e = 0x3500000000L;
        MappedKeys.f = 0x3400000000L;
        MappedKeys.g = 0x3600000000L;
        MappedKeys.h = 0x4900000000L;
        MappedKeys.i = 0x1500000000L;
        MappedKeys.j = 0x1600000000L;
        MappedKeys.k = 0x1300000000L;
        MappedKeys.l = 0x1400000000L;
        MappedKeys.m = 0x5C00000000L;
        MappedKeys.n = 0x5D00000000L;
        MappedKeys.o = 0x7A00000000L;
        MappedKeys.p = 0x7B00000000L;
        MappedKeys.q = 0x7C00000000L;
        MappedKeys.r = 0x4200000000L;
        MappedKeys.s = 0x4300000000L;
        MappedKeys.t = 0x7000000000L;
        MappedKeys.u = 0x11700000000L;
        MappedKeys.v = 0x11500000000L;
        MappedKeys.w = 0x11600000000L;
        MappedKeys.x = 0x3D00000000L;
    }

    public final long getA-EK5gGoQ() [...] // 潜在的解密器

    public final long getBackslash-EK5gGoQ() [...] // 潜在的解密器

    public final long getBackspace-EK5gGoQ() [...] // 潜在的解密器

    public final long getC-EK5gGoQ() [...] // 潜在的解密器

    public final long getCopy-EK5gGoQ() [...] // 潜在的解密器

    public final long getCut-EK5gGoQ() [...] // 潜在的解密器

    public final long getDelete-EK5gGoQ() [...] // 潜在的解密器

    public final long getDirectionDown-EK5gGoQ() [...] // 潜在的解密器

    public final long getDirectionLeft-EK5gGoQ() [...] // 潜在的解密器

    public final long getDirectionRight-EK5gGoQ() [...] // 潜在的解密器

    public final long getDirectionUp-EK5gGoQ() [...] // 潜在的解密器

    public final long getEnter-EK5gGoQ() [...] // 潜在的解密器

    public final long getH-EK5gGoQ() [...] // 潜在的解密器

    public final long getInsert-EK5gGoQ() [...] // 潜在的解密器

    public final long getMoveEnd-EK5gGoQ() [...] // 潜在的解密器

    public final long getMoveHome-EK5gGoQ() [...] // 潜在的解密器

    public final long getPageDown-EK5gGoQ() [...] // 潜在的解密器

    public final long getPageUp-EK5gGoQ() [...] // 潜在的解密器

    public final long getPaste-EK5gGoQ() [...] // 潜在的解密器

    public final long getTab-EK5gGoQ() [...] // 潜在的解密器

    public final long getV-EK5gGoQ() [...] // 潜在的解密器

    public final long getX-EK5gGoQ() [...] // 潜在的解密器

    public final long getY-EK5gGoQ() [...] // 潜在的解密器

    public final long getZ-EK5gGoQ() [...] // 潜在的解密器
}

