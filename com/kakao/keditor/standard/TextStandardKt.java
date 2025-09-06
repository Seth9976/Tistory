package com.kakao.keditor.standard;

import com.kakao.keditor.plugin.itemspec.paragraph.URLInfo;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\u001A\u001C\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0000\u001A\u0012\u0010\b\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001A\u00020\u0006\u001A\n\u0010\n\u001A\u00020\u0006*\u00020\u0001\u001A\u0016\u0010\u000B\u001A\u0004\u0018\u00010\f*\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006H\u0000\u001A(\u0010\u000E\u001A\u00020\u000F*\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000F0\u0011H\u0000\u001A\f\u0010\u0012\u001A\u00020\u0003*\u00020\u0013H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"URL_PATTERN", "", "checkLineBreakInput", "", "", "start", "", "after", "getBreakIteratorSubstring", "endOffset", "getGraphemeLength", "getUrlOrNull", "Lcom/kakao/keditor/plugin/itemspec/paragraph/URLInfo;", "cursorPosition", "ifHasUrl", "", "block", "Lkotlin/Function1;", "isLineBreak", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TextStandardKt {
    @NotNull
    public static final String URL_PATTERN = "(\\s|^)((www\\.)|(m\\.)|(http://)|(https://))[-a-zA-Z0-9가-힣@:%._+~#=]{1,256}\\.[a-z]{2,6}\\b[-a-zA-Z0-9가-힣@:%_+.~#?&/=()\\[\\]!$\'*,;]*";

    public static final boolean checkLineBreakInput(@NotNull CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return v1 == 1 && charSequence0.length() > 0 && charSequence0.length() > v && TextStandardKt.isLineBreak(charSequence0.charAt(v));
    }

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

    @Nullable
    public static final URLInfo getUrlOrNull(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v <= 0) {
            return null;
        }
        String s = charSequence0.subSequence(0, Math.min(charSequence0.length(), v - 1)).toString();
        Intrinsics.checkNotNullExpressionValue("\r\n", "lineSeparator(...)");
        String s1 = (String)CollectionsKt___CollectionsKt.getOrNull(CollectionsKt___CollectionsKt.reversed(StringsKt__StringsKt.split$default(s, new String[]{"\r\n", " "}, false, 0, 6, null)), 0);
        if(s1 != null && s1.length() == StringsKt__StringsKt.trimEnd(s1).toString().length()) {
            MatchResult matchResult0 = Regex.find$default(new Regex("(\\s|^)((www\\.)|(m\\.)|(http://)|(https://))[-a-zA-Z0-9가-힣@:%._+~#=]{1,256}\\.[a-z]{2,6}\\b[-a-zA-Z0-9가-힣@:%_+.~#?&/=()\\[\\]!$\'*,;]*"), s1, 0, 2, null);
            if(matchResult0 != null) {
                MatchGroupCollection matchGroupCollection0 = matchResult0.getGroups();
                if(matchGroupCollection0 != null) {
                    MatchGroup matchGroup0 = matchGroupCollection0.get(0);
                    if(matchGroup0 != null) {
                        String s2 = StringsKt__StringsKt.trimStart(matchGroup0.getValue()).toString();
                        return p.startsWith$default(s2, "http", false, 2, null) ? new URLInfo(s2, s2) : new URLInfo(s2, "http://" + s2);
                    }
                }
            }
        }
        return null;
    }

    public static final void ifHasUrl(@NotNull CharSequence charSequence0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        URLInfo uRLInfo0 = TextStandardKt.getUrlOrNull(charSequence0, v);
        if(uRLInfo0 != null) {
            function10.invoke(uRLInfo0.getLinkUrl());
        }
    }

    // 去混淆评级： 低(20)
    public static final boolean isLineBreak(char c) {
        return Intrinsics.areEqual(String.valueOf(c), "\r\n");
    }
}

