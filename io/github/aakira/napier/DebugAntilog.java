package io.github.aakira.napier;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\b\u001A\u0004\u0018\u00010\u00022\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/github/aakira/napier/DebugAntilog;", "Lio/github/aakira/napier/Antilog;", "", "defaultTag", "<init>", "(Ljava/lang/String;)V", "Lio/github/aakira/napier/Napier$Level;", "priority", "tag", "", "throwable", "message", "", "performLog", "(Lio/github/aakira/napier/Napier$Level;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "className", "createStackElementTag$napier_release", "(Ljava/lang/String;)Ljava/lang/String;", "createStackElementTag", "Companion", "napier_release"}, k = 1, mv = {1, 4, 2})
public final class DebugAntilog extends Antilog {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lio/github/aakira/napier/DebugAntilog$Companion;", "", "", "CALL_STACK_INDEX", "I", "MAX_LOG_LENGTH", "MAX_TAG_LENGTH", "napier_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Pattern a;
    public final String b;

    static {
        DebugAntilog.Companion = new Companion(null);
    }

    public DebugAntilog() {
        this(null, 1, null);
    }

    public DebugAntilog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "defaultTag");
        super();
        this.b = s;
        this.a = Pattern.compile("(\\$\\d+)+$");
    }

    public DebugAntilog(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "app";
        }
        this(s);
    }

    public static int a(Level napier$Level0) {
        switch(DebugAntilog.WhenMappings.$EnumSwitchMapping$0[napier$Level0.ordinal()]) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 7;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final String createStackElementTag$napier_release(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        Matcher matcher0 = this.a.matcher(s);
        if(matcher0.find()) {
            s = matcher0.replaceAll("");
            Intrinsics.checkNotNullExpressionValue(s, "m.replaceAll(\"\")");
        }
        int v = StringsKt__StringsKt.lastIndexOf$default(s, '.', 0, false, 6, null);
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String s1 = s.substring(v + 1);
        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
        s1.length();
        return s1;
    }

    @Override  // io.github.aakira.napier.Antilog
    public void performLog(@NotNull Level napier$Level0, @Nullable String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        if(s == null) {
            Thread thread0 = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(thread0, "Thread.currentThread()");
            StackTraceElement[] arr_stackTraceElement = thread0.getStackTrace();
            if(arr_stackTraceElement == null || arr_stackTraceElement.length < 9) {
                s = this.b;
            }
            else {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[9];
                String s2 = stackTraceElement0.getClassName();
                Intrinsics.checkNotNullExpressionValue(s2, "className");
                s = this.createStackElementTag$napier_release(s2) + '$' + stackTraceElement0.getMethodName();
            }
        }
        if(s1 == null) {
            if(throwable0 != null) {
                StringWriter stringWriter1 = new StringWriter(0x100);
                PrintWriter printWriter1 = new PrintWriter(stringWriter1, false);
                throwable0.printStackTrace(printWriter1);
                printWriter1.flush();
                s1 = stringWriter1.toString();
                Intrinsics.checkNotNullExpressionValue(s1, "sw.toString()");
                if(s1 != null) {
                label_31:
                    int v1 = s1.length();
                    if(v1 <= 4000) {
                        if(napier$Level0 == Level.ASSERT) {
                            Log.wtf(s, s1);
                            return;
                        }
                        Log.println(DebugAntilog.a(napier$Level0), s, s1);
                        return;
                    }
                    for(int v = 0; v < v1; v = v3 + 1) {
                        int v2 = StringsKt__StringsKt.indexOf$default(s1, '\n', v, false, 4, null);
                        if(v2 == -1) {
                            v2 = v1;
                        }
                        while(true) {
                            int v3 = Math.min(v2, v + 4000);
                            String s4 = s1.substring(v, v3);
                            Intrinsics.checkNotNullExpressionValue(s4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            if(DebugAntilog.a(napier$Level0) == 7) {
                                Log.wtf(s, s4);
                            }
                            else {
                                Log.println(DebugAntilog.a(napier$Level0), s, s4);
                            }
                            if(v3 >= v2) {
                                break;
                            }
                            v = v3;
                        }
                    }
                }
            }
        }
        else if(throwable0 != null) {
            StringWriter stringWriter0 = new StringWriter(0x100);
            PrintWriter printWriter0 = new PrintWriter(stringWriter0, false);
            throwable0.printStackTrace(printWriter0);
            printWriter0.flush();
            String s3 = stringWriter0.toString();
            Intrinsics.checkNotNullExpressionValue(s3, "sw.toString()");
            s1 = s1 + '\n' + s3;
            goto label_31;
        }
        else {
            goto label_31;
        }
    }
}

