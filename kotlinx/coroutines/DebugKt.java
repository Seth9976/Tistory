package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001A\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0014\u0010\t\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u001A\u0010\u000F\u001A\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\" \u0010\u0013\u001A\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0012\u0010\u0002\u001A\u0004\b\u0011\u0010\u000E\"\u001A\u0010\u0019\u001A\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u001A\u0010\u001A\u001A\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\f\u001A\u0004\b\u001B\u0010\u000E¨\u0006\u001C"}, d2 = {"", "resetCoroutineId", "()V", "", "DEBUG_PROPERTY_NAME", "Ljava/lang/String;", "STACKTRACE_RECOVERY_PROPERTY_NAME", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_ON", "DEBUG_PROPERTY_VALUE_OFF", "", "a", "Z", "getDEBUG", "()Z", "DEBUG", "b", "getRECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES$annotations", "RECOVER_STACK_TRACES", "Ljava/util/concurrent/atomic/AtomicLong;", "c", "Ljava/util/concurrent/atomic/AtomicLong;", "getCOROUTINE_ID", "()Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "ASSERTIONS_ENABLED", "getASSERTIONS_ENABLED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DebugKt {
    @NotNull
    public static final String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    @NotNull
    public static final String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    @NotNull
    public static final String DEBUG_PROPERTY_VALUE_OFF = "off";
    @NotNull
    public static final String DEBUG_PROPERTY_VALUE_ON = "on";
    @NotNull
    public static final String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;

    static {
        boolean z1;
        String s = SystemPropsKt.systemProp("kotlinx.coroutines.debug");
        boolean z = true;
        if(s == null) {
            z1 = false;
        }
        else {
            switch(s) {
                case "": 
                case "on": {
                    z1 = true;
                    break;
                }
                case "auto": 
                case "off": {
                    z1 = false;
                    break;
                }
                default: {
                    throw new IllegalStateException(("System property \'kotlinx.coroutines.debug\' has unrecognized value \'" + s + '\'').toString());
                }
            }
        }
        DebugKt.a = z1;
        if(!z1 || !SystemPropsKt.systemProp("kotlinx.coroutines.stacktrace.recovery", true)) {
            z = false;
        }
        DebugKt.b = z;
        DebugKt.c = new AtomicLong(0L);
    }

    public static final boolean getASSERTIONS_ENABLED() {
        return false;
    }

    @NotNull
    public static final AtomicLong getCOROUTINE_ID() {
        return DebugKt.c;
    }

    public static final boolean getDEBUG() {
        return DebugKt.a;
    }

    public static final boolean getRECOVER_STACK_TRACES() {
        return DebugKt.b;
    }

    @PublishedApi
    public static void getRECOVER_STACK_TRACES$annotations() {
    }

    public static final void resetCoroutineId() {
        DebugKt.c.set(0L);
    }
}

