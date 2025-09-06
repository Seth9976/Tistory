package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0000\u001A\u0014\u0010\u0003\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0001H\u0000\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"charCount", "", "codePoint", "codePointAt", "", "index", "codePointBefore", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CodepointHelpers_jvmKt {
    public static final int charCount(int v) {
        return Character.charCount(v);
    }

    public static final int codePointAt(@NotNull CharSequence charSequence0, int v) {
        return Character.codePointAt(charSequence0, v);
    }

    public static final int codePointBefore(@NotNull CharSequence charSequence0, int v) {
        return Character.codePointBefore(charSequence0, v);
    }
}

