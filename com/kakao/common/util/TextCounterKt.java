package com.kakao.common.util;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\n\u0010\u0004\u001A\u00020\u0003*\u00020\u0001¨\u0006\u0005"}, d2 = {"getBreakIteratorSubstring", "", "endOffset", "", "getGraphemeLength", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TextCounterKt {
    @NotNull
    public static final String getBreakIteratorSubstring(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        int v1 = breakIterator0.following(v - 2);
        if(v1 >= 0) {
            s = s.substring(0, v1);
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
        }
        return s;
    }

    public static final int getGraphemeLength(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.last();
    }
}

