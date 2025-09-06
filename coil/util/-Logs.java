package coil.util;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001A+\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\bH\u0080\b\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\nH\u0000¨\u0006\u000B"}, d2 = {"log", "", "Lcoil/util/Logger;", "tag", "", "priority", "", "lazyMessage", "Lkotlin/Function0;", "throwable", "", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Logs")
public final class -Logs {
    public static final void log(@NotNull Logger logger0, @NotNull String s, int v, @NotNull Function0 function00) {
        if(logger0.getLevel() <= v) {
            logger0.log(s, v, ((String)function00.invoke()), null);
        }
    }

    public static final void log(@NotNull Logger logger0, @NotNull String s, @NotNull Throwable throwable0) {
        if(logger0.getLevel() <= 6) {
            logger0.log(s, 6, null, throwable0);
        }
    }
}

