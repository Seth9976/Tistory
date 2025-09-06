package androidx.compose.foundation.text.handwriting;

import android.os.Build.VERSION;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000B\n\u0002\b\u0005\"\u001A\u0010\u0003\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "a", "Z", "isStylusHandwritingSupported", "()Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class StylusHandwriting_androidKt {
    public static final boolean a;

    static {
        StylusHandwriting_androidKt.a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean isStylusHandwritingSupported() [...] // 潜在的解密器
}

