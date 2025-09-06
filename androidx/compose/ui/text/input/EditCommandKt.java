package androidx.compose.ui.text.input;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class EditCommandKt {
    // 去混淆评级： 低(20)
    public static final boolean access$isSurrogatePair(char c, char c1) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c1);
    }
}

