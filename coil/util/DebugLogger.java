package coil.util;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00022\b\u0010\t\u001A\u0004\u0018\u00010\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000ER*\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00028\u0016@VX\u0096\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcoil/util/DebugLogger;", "Lcoil/util/Logger;", "", "level", "<init>", "(I)V", "", "tag", "priority", "message", "", "throwable", "", "log", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "value", "a", "I", "getLevel", "()I", "setLevel", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDebugLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugLogger.kt\ncoil/util/DebugLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class DebugLogger implements Logger {
    public int a;

    @JvmOverloads
    public DebugLogger() {
        this(0, 1, null);
    }

    @JvmOverloads
    public DebugLogger(int v) {
        this.a = v;
        DebugLogger.a(v);
    }

    public DebugLogger(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 3;
        }
        this(v);
    }

    public static void a(int v) {
        if(2 > v || v >= 8) {
            throw new IllegalArgumentException(("Invalid log level: " + v).toString());
        }
    }

    @Override  // coil.util.Logger
    public int getLevel() {
        return this.a;
    }

    @Override  // coil.util.Logger
    public void log(@NotNull String s, int v, @Nullable String s1, @Nullable Throwable throwable0) {
        if(s1 != null) {
            Log.println(v, s, s1);
        }
        if(throwable0 != null) {
            StringWriter stringWriter0 = new StringWriter();
            throwable0.printStackTrace(new PrintWriter(stringWriter0));
            Log.println(v, s, stringWriter0.toString());
        }
    }

    @Override  // coil.util.Logger
    public void setLevel(int v) {
        DebugLogger.a(v);
        this.a = v;
    }
}

