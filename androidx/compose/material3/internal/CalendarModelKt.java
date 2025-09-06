package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A\u0010\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"DaysInWeek", "", "MillisecondsIn24Hours", "", "datePatternAsInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "localeFormat", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000L;

    @NotNull
    public static final DateInputFormat datePatternAsInputFormat(@NotNull String s) {
        String s1 = new Regex("[^dMy/\\-.]").replace(s, "");
        String s2 = new Regex("d{1,2}").replace(s1, "dd");
        String s3 = new Regex("M{1,2}").replace(s2, "MM");
        String s4 = StringsKt__StringsKt.removeSuffix(p.replace$default(new Regex("y{1,4}").replace(s3, "yyyy"), "My", "M/y", false, 4, null), ".");
        MatchResult matchResult0 = Regex.find$default(new Regex("[/\\-.]"), s4, 0, 2, null);
        Intrinsics.checkNotNull(matchResult0);
        MatchGroup matchGroup0 = matchResult0.getGroups().get(0);
        Intrinsics.checkNotNull(matchGroup0);
        int v = matchGroup0.getRange().getFirst();
        String s5 = s4.substring(v, v + 1);
        Intrinsics.checkNotNullExpressionValue(s5, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(s4, s5.charAt(0));
    }
}

