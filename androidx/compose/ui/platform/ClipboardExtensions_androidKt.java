package androidx.compose.ui.platform;

import android.net.Uri;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"firstUriOrNull", "Landroid/net/Uri;", "Landroidx/compose/ui/platform/ClipEntry;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ClipboardExtensions_androidKt {
    @ExperimentalComposeUiApi
    @Nullable
    public static final Uri firstUriOrNull(@NotNull ClipEntry clipEntry0) {
        int v = clipEntry0.getClipData().getItemCount();
        for(int v1 = 0; v1 < v; ++v1) {
            Uri uri0 = clipEntry0.getClipData().getItemAt(v1).getUri();
            if(uri0 != null) {
                return uri0;
            }
        }
        return null;
    }
}

