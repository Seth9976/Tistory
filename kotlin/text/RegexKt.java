package kotlin.text;

import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1789#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
public final class RegexKt {
    public static final MatchResult access$findNext(Matcher matcher0, int v, CharSequence charSequence0) {
        return !matcher0.find(v) ? null : new e(matcher0, charSequence0);
    }

    public static final MatchResult access$matchEntire(Matcher matcher0, CharSequence charSequence0) {
        return !matcher0.matches() ? null : new e(matcher0, charSequence0);
    }

    public static final IntRange access$range(java.util.regex.MatchResult matchResult0) {
        return c.until(matchResult0.start(), matchResult0.end());
    }

    public static final IntRange access$range(java.util.regex.MatchResult matchResult0, int v) {
        return c.until(matchResult0.start(v), matchResult0.end(v));
    }

    public static final int access$toInt(Iterable iterable0) {
        int v = 0;
        for(Object object0: iterable0) {
            v |= ((FlagEnum)object0).getValue();
        }
        return v;
    }
}

