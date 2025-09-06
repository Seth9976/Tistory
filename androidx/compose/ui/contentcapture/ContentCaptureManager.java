package androidx.compose.ui.contentcapture;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "", "Companion", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ContentCaptureManager {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R0\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00028G@GX\u0087\u000E¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureManager$Companion;", "", "", "<set-?>", "b", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", "isEnabled$annotations", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a = null;
        public static boolean b = true;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @ExperimentalComposeUiApi
        public final boolean isEnabled() [...] // 潜在的解密器

        @ExperimentalComposeUiApi
        public static void isEnabled$annotations() {
        }

        @ExperimentalComposeUiApi
        public final void setEnabled(boolean z) {
            Companion.b = z;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ContentCaptureManager.Companion = Companion.a;
    }
}

