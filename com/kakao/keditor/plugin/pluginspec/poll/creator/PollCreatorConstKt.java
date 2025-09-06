package com.kakao.keditor.plugin.pluginspec.poll.creator;

import java.text.SimpleDateFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"calendarDateDisplayFormat", "Ljava/text/SimpleDateFormat;", "getCalendarDateDisplayFormat", "()Ljava/text/SimpleDateFormat;", "calendarDateFormat", "getCalendarDateFormat", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PollCreatorConstKt {
    @NotNull
    private static final SimpleDateFormat calendarDateDisplayFormat;
    @NotNull
    private static final SimpleDateFormat calendarDateFormat;

    static {
        PollCreatorConstKt.calendarDateDisplayFormat = new SimpleDateFormat("yyyy-MM-dd (E)");
        PollCreatorConstKt.calendarDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    @NotNull
    public static final SimpleDateFormat getCalendarDateDisplayFormat() {
        return PollCreatorConstKt.calendarDateDisplayFormat;
    }

    @NotNull
    public static final SimpleDateFormat getCalendarDateFormat() {
        return PollCreatorConstKt.calendarDateFormat;
    }
}

