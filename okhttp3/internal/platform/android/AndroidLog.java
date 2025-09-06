package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J1\u0010\f\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00022\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "", "loggerName", "", "logLevel", "message", "", "t", "", "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "androidLog", "enable", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SuppressSignatureCheck
public final class AndroidLog {
    @NotNull
    public static final AndroidLog INSTANCE;
    public static final CopyOnWriteArraySet a;
    public static final Map b;

    static {
        AndroidLog.INSTANCE = new AndroidLog();  // 初始化器: Ljava/lang/Object;-><init>()V
        AndroidLog.a = new CopyOnWriteArraySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Class class0 = OkHttpClient.class;
        Package package0 = class0.getPackage();
        String s = package0 == null ? null : package0.getName();
        if(s != null) {
            linkedHashMap0.put(s, "OkHttp");
        }
        String s1 = class0.getName();
        Intrinsics.checkNotNullExpressionValue(s1, "OkHttpClient::class.java.name");
        linkedHashMap0.put(s1, "okhttp.OkHttpClient");
        Intrinsics.checkNotNullExpressionValue("okhttp3.internal.http2.Http2", "Http2::class.java.name");
        linkedHashMap0.put("okhttp3.internal.http2.Http2", "okhttp.Http2");
        Intrinsics.checkNotNullExpressionValue("okhttp3.internal.concurrent.TaskRunner", "TaskRunner::class.java.name");
        linkedHashMap0.put("okhttp3.internal.concurrent.TaskRunner", "okhttp.TaskRunner");
        linkedHashMap0.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        AndroidLog.b = x.toMap(linkedHashMap0);
    }

    public final void androidLog$okhttp(@NotNull String s, int v, @NotNull String s1, @Nullable Throwable throwable0) {
        Intrinsics.checkNotNullParameter(s, "loggerName");
        Intrinsics.checkNotNullParameter(s1, "message");
        String s2 = (String)AndroidLog.b.get(s);
        if(s2 == null) {
            s2 = StringsKt___StringsKt.take(s, 23);
        }
        if(Log.isLoggable(s2, v)) {
            if(throwable0 != null) {
                s1 = s1 + '\n' + Log.getStackTraceString(throwable0);
            }
            int v1 = s1.length();
            for(int v2 = 0; v2 < v1; v2 = v4 + 1) {
                int v3 = StringsKt__StringsKt.indexOf$default(s1, '\n', v2, false, 4, null);
                if(v3 == -1) {
                    v3 = v1;
                }
                while(true) {
                    int v4 = Math.min(v3, v2 + 4000);
                    String s3 = s1.substring(v2, v4);
                    Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(v, s2, s3);
                    if(v4 >= v3) {
                        break;
                    }
                    v2 = v4;
                }
            }
        }
    }

    public final void enable() {
        Level level0;
        for(Object object0: AndroidLog.b.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = (String)((Map.Entry)object0).getValue();
            Logger logger0 = Logger.getLogger(s);
            if(AndroidLog.a.add(logger0)) {
                logger0.setUseParentHandlers(false);
                if(Log.isLoggable(s1, 3)) {
                    level0 = Level.FINE;
                }
                else {
                    level0 = Log.isLoggable(s1, 4) ? Level.INFO : Level.WARNING;
                }
                logger0.setLevel(level0);
                logger0.addHandler(AndroidLogHandler.INSTANCE);
            }
        }
    }
}

