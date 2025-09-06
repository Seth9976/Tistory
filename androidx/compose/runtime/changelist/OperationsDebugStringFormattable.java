package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "()V", "toDebugString", "", "linePrefix", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class OperationsDebugStringFormattable {
    public static final int $stable;

    @NotNull
    public abstract String toDebugString(@NotNull String arg1);

    public static String toDebugString$default(OperationsDebugStringFormattable operationsDebugStringFormattable0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if((v & 1) != 0) {
            s = "  ";
        }
        return operationsDebugStringFormattable0.toDebugString(s);
    }
}

