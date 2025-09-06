package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "Landroid/view/DragEvent;", "dragEvent", "<init>", "(Landroid/view/DragEvent;)V", "a", "Landroid/view/DragEvent;", "getDragEvent$ui_release", "()Landroid/view/DragEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDropEvent {
    public static final int $stable = 8;
    public final DragEvent a;

    public DragAndDropEvent(@NotNull DragEvent dragEvent0) {
        this.a = dragEvent0;
    }

    @NotNull
    public final DragEvent getDragEvent$ui_release() {
        return this.a;
    }
}

