package androidx.compose.ui.platform;

import android.content.ClipDescription;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ClipMetadata;", "", "Landroid/content/ClipDescription;", "clipDescription", "<init>", "(Landroid/content/ClipDescription;)V", "a", "Landroid/content/ClipDescription;", "getClipDescription", "()Landroid/content/ClipDescription;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ClipMetadata {
    public static final int $stable = 8;
    public final ClipDescription a;

    public ClipMetadata(@NotNull ClipDescription clipDescription0) {
        this.a = clipDescription0;
    }

    @NotNull
    public final ClipDescription getClipDescription() {
        return this.a;
    }
}

