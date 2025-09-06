package androidx.compose.ui.tooling;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger;", "", "()V", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PreviewLogger {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J#\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger$Companion;", "", "", "message", "", "throwable", "", "logWarning$ui_tooling_release", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "logWarning", "logError$ui_tooling_release", "logError", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void logError$ui_tooling_release(@NotNull String s, @Nullable Throwable throwable0) {
            Log.e("PreviewLogger", s, throwable0);
        }

        public static void logError$ui_tooling_release$default(Companion previewLogger$Companion0, String s, Throwable throwable0, int v, Object object0) {
            if((v & 2) != 0) {
                throwable0 = null;
            }
            previewLogger$Companion0.logError$ui_tooling_release(s, throwable0);
        }

        public final void logWarning$ui_tooling_release(@NotNull String s, @Nullable Throwable throwable0) {
            Log.w("PreviewLogger", s, throwable0);
        }

        public static void logWarning$ui_tooling_release$default(Companion previewLogger$Companion0, String s, Throwable throwable0, int v, Object object0) {
            if((v & 2) != 0) {
                throwable0 = null;
            }
            previewLogger$Companion0.logWarning$ui_tooling_release(s, throwable0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;

    static {
        PreviewLogger.Companion = new Companion(null);
    }
}

