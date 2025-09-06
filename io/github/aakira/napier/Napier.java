package io.github.aakira.napier;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u00C7\u0002\u0018\u00002\u00020\u0001:\u0001 J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\u0010\u0010\u001A\u0004\u0018\u00010\tH\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0013\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0013\u0010\u0016J-\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0017\u0010\u0014J3\u0010\u0017\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0017\u0010\u0016J-\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0018\u0010\u0014J3\u0010\u0018\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0018\u0010\u0016J-\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0019\u0010\u0014J3\u0010\u0019\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u0019\u0010\u0016J-\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u001A\u0010\u0014J3\u0010\u001A\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u001A\u0010\u0016J-\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u001B\u0010\u0014J3\u0010\u001B\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u001B\u0010\u0016J5\u0010\u001C\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0010\u001A\u00020\t\u00A2\u0006\u0004\b\u001C\u0010\u0012J;\u0010\u001C\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u0015\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001E\u0010\u0006J\r\u0010\u001E\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001E\u0010\u001F\u00A8\u0006!"}, d2 = {"Lio/github/aakira/napier/Napier;", "", "Lio/github/aakira/napier/Antilog;", "antilog", "", "base", "(Lio/github/aakira/napier/Antilog;)V", "Lio/github/aakira/napier/Napier$Level;", "priority", "", "tag", "", "isEnable", "(Lio/github/aakira/napier/Napier$Level;Ljava/lang/String;)Z", "", "throwable", "message", "rawLog", "(Lio/github/aakira/napier/Napier$Level;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "v", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;Ljava/lang/String;)V", "i", "d", "w", "e", "wtf", "log", "(Lio/github/aakira/napier/Napier$Level;Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "takeLogarithm", "()V", "Level", "napier_release"}, k = 1, mv = {1, 4, 2})
public final class Napier {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/github/aakira/napier/Napier$Level;", "", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "ASSERT", "napier_release"}, k = 1, mv = {1, 4, 2})
    public static enum Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        ASSERT;

    }

    @NotNull
    public static final Napier INSTANCE;
    public static final ArrayList a;

    static {
        Napier.INSTANCE = new Napier();  // 初始化器: Ljava/lang/Object;-><init>()V
        Napier.a = new ArrayList();
    }

    public final void base(@NotNull Antilog antilog0) {
        Intrinsics.checkNotNullParameter(antilog0, "antilog");
        Napier.a.add(antilog0);
    }

    public final void d(@NotNull String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        this.log(Level.DEBUG, s1, throwable0, s);
    }

    public final void d(@NotNull Function0 function00, @Nullable Throwable throwable0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(function00, "message");
        this.log(Level.DEBUG, s, throwable0, function00);
    }

    public static void d$default(Napier napier0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        napier0.d(s, throwable0, s1);
    }

    public static void d$default(Napier napier0, Function0 function00, Throwable throwable0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        napier0.d(function00, throwable0, s);
    }

    public final void e(@NotNull String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        this.log(Level.ERROR, s1, throwable0, s);
    }

    public final void e(@NotNull Function0 function00, @Nullable Throwable throwable0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(function00, "message");
        this.log(Level.ERROR, s, throwable0, function00);
    }

    public static void e$default(Napier napier0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        napier0.e(s, throwable0, s1);
    }

    public static void e$default(Napier napier0, Function0 function00, Throwable throwable0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        napier0.e(function00, throwable0, s);
    }

    public final void i(@NotNull String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        this.log(Level.INFO, s1, throwable0, s);
    }

    public final void i(@NotNull Function0 function00, @Nullable Throwable throwable0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(function00, "message");
        this.log(Level.INFO, s, throwable0, function00);
    }

    public static void i$default(Napier napier0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        napier0.i(s, throwable0, s1);
    }

    public static void i$default(Napier napier0, Function0 function00, Throwable throwable0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        napier0.i(function00, throwable0, s);
    }

    public final boolean isEnable(@NotNull Level napier$Level0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        ArrayList arrayList0 = Napier.a;
        if(arrayList0 == null || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(((Antilog)object0).isEnable(napier$Level0, s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final void log(@NotNull Level napier$Level0, @Nullable String s, @Nullable Throwable throwable0, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        Intrinsics.checkNotNullParameter(s1, "message");
        if(this.isEnable(napier$Level0, s)) {
            this.rawLog(napier$Level0, s, throwable0, s1);
        }
    }

    public final void log(@NotNull Level napier$Level0, @Nullable String s, @Nullable Throwable throwable0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        Intrinsics.checkNotNullParameter(function00, "message");
        if(this.isEnable(napier$Level0, s)) {
            this.rawLog(napier$Level0, s, throwable0, ((String)function00.invoke()));
        }
    }

    public static void log$default(Napier napier0, Level napier$Level0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        napier0.log(napier$Level0, s, throwable0, s1);
    }

    public static void log$default(Napier napier0, Level napier$Level0, String s, Throwable throwable0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        napier0.log(napier$Level0, s, throwable0, function00);
    }

    @PublishedApi
    public final void rawLog(@NotNull Level napier$Level0, @Nullable String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        for(Object object0: Napier.a) {
            ((Antilog)object0).rawLog$napier_release(napier$Level0, s, throwable0, s1);
        }
    }

    public final void takeLogarithm() {
        Napier.a.clear();
    }

    public final void takeLogarithm(@NotNull Antilog antilog0) {
        Intrinsics.checkNotNullParameter(antilog0, "antilog");
        Napier.a.remove(antilog0);
    }

    public final void v(@NotNull String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        this.log(Level.VERBOSE, s1, throwable0, s);
    }

    public final void v(@NotNull Function0 function00, @Nullable Throwable throwable0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(function00, "message");
        this.log(Level.VERBOSE, s, throwable0, function00);
    }

    public static void v$default(Napier napier0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        napier0.v(s, throwable0, s1);
    }

    public static void v$default(Napier napier0, Function0 function00, Throwable throwable0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        napier0.v(function00, throwable0, s);
    }

    public final void w(@NotNull String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        this.log(Level.WARNING, s1, throwable0, s);
    }

    public final void w(@NotNull Function0 function00, @Nullable Throwable throwable0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(function00, "message");
        this.log(Level.WARNING, s, throwable0, function00);
    }

    public static void w$default(Napier napier0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        napier0.w(s, throwable0, s1);
    }

    public static void w$default(Napier napier0, Function0 function00, Throwable throwable0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        napier0.w(function00, throwable0, s);
    }

    public final void wtf(@NotNull String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        this.log(Level.ASSERT, s1, throwable0, s);
    }

    public final void wtf(@NotNull Function0 function00, @Nullable Throwable throwable0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(function00, "message");
        this.log(Level.ASSERT, s, throwable0, function00);
    }

    public static void wtf$default(Napier napier0, String s, Throwable throwable0, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        napier0.wtf(s, throwable0, s1);
    }

    public static void wtf$default(Napier napier0, Function0 function00, Throwable throwable0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        napier0.wtf(function00, throwable0, s);
    }
}

