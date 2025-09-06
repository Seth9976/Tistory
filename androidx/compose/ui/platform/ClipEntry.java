package androidx.compose.ui.platform;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0011\u0010\r\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "", "Landroid/content/ClipData;", "clipData", "<init>", "(Landroid/content/ClipData;)V", "a", "Landroid/content/ClipData;", "getClipData", "()Landroid/content/ClipData;", "Landroidx/compose/ui/platform/ClipMetadata;", "getClipMetadata", "()Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ClipEntry {
    public static final int $stable = 8;
    public final ClipData a;

    public ClipEntry(@NotNull ClipData clipData0) {
        this.a = clipData0;
    }

    @NotNull
    public final ClipData getClipData() {
        return this.a;
    }

    @NotNull
    public final ClipMetadata getClipMetadata() {
        return AndroidClipboardManager_androidKt.toClipMetadata(this.a.getDescription());
    }
}

