package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A*\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0080\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TraceKt {
    public static final Object trace(@NotNull String s, @NotNull Function0 function00) {
        Object object1;
        Trace trace0 = Trace.INSTANCE;
        Object object0 = trace0.beginSection(s);
        try {
            object1 = function00.invoke();
        }
        catch(Throwable throwable0) {
            Trace.INSTANCE.endSection(object0);
            throw throwable0;
        }
        trace0.endSection(object0);
        return object1;
    }
}

