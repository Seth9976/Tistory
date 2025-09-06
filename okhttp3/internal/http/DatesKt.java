package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u001A\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0013\u0010\u0004\u001A\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001A\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Ljava/util/Date;", "toHttpDateOrNull", "(Ljava/lang/String;)Ljava/util/Date;", "toHttpDateString", "(Ljava/util/Date;)Ljava/lang/String;", "", "MAX_DATE", "J", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DatesKt {
    public static final long MAX_DATE = 0xE677D21FDBFFL;
    public static final DatesKt.STANDARD_DATE_FORMAT.1 a;
    public static final String[] b;
    public static final DateFormat[] c;

    static {
        DatesKt.a = new DatesKt.STANDARD_DATE_FORMAT.1();  // 初始化器: Ljava/lang/ThreadLocal;-><init>()V
        DatesKt.b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        DatesKt.c = new DateFormat[15];
    }

    @Nullable
    public static final Date toHttpDateOrNull(@NotNull String s) {
        Date date1;
        int v;
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(s.length() == 0) {
            return null;
        }
        ParsePosition parsePosition0 = new ParsePosition(0);
        Date date0 = ((DateFormat)DatesKt.a.get()).parse(s, parsePosition0);
        if(parsePosition0.getIndex() == s.length()) {
            return date0;
        }
        String[] arr_s = DatesKt.b;
        __monitor_enter(arr_s);
        try {
            v = 0;
            while(true) {
                if(v >= arr_s.length) {
                    goto label_28;
                }
                DateFormat[] arr_dateFormat = DatesKt.c;
                DateFormat dateFormat0 = arr_dateFormat[v];
                if(dateFormat0 == null) {
                    dateFormat0 = new SimpleDateFormat(DatesKt.b[v], Locale.US);
                    dateFormat0.setTimeZone(Util.UTC);
                    arr_dateFormat[v] = dateFormat0;
                }
                parsePosition0.setIndex(0);
                date1 = dateFormat0.parse(s, parsePosition0);
                if(parsePosition0.getIndex() != 0) {
                    goto label_24;
                }
                ++v;
            }
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(arr_s);
        throw throwable0;
    label_24:
        __monitor_exit(arr_s);
        return date1;
    label_28:
        __monitor_exit(arr_s);
        return null;
    }

    @NotNull
    public static final String toHttpDateString(@NotNull Date date0) {
        Intrinsics.checkNotNullParameter(date0, "<this>");
        String s = ((DateFormat)DatesKt.a.get()).format(date0);
        Intrinsics.checkNotNullExpressionValue(s, "STANDARD_DATE_FORMAT.get().format(this)");
        return s;
    }
}

