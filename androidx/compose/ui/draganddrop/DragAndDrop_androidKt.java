package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002\u001A\n\u0010\b\u001A\u00020\t*\u00020\u0002\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "mimeTypes", "", "", "toAndroidDragEvent", "Landroid/view/DragEvent;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(@NotNull DragAndDropEvent dragAndDropEvent0) {
        return OffsetKt.Offset(dragAndDropEvent0.getDragEvent$ui_release().getX(), dragAndDropEvent0.getDragEvent$ui_release().getY());
    }

    @NotNull
    public static final Set mimeTypes(@NotNull DragAndDropEvent dragAndDropEvent0) {
        ClipDescription clipDescription0 = dragAndDropEvent0.getDragEvent$ui_release().getClipDescription();
        if(clipDescription0 == null) {
            return f0.emptySet();
        }
        Set set0 = e0.createSetBuilder(clipDescription0.getMimeTypeCount());
        int v = clipDescription0.getMimeTypeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            set0.add(clipDescription0.getMimeType(v1));
        }
        return e0.build(set0);
    }

    @NotNull
    public static final DragEvent toAndroidDragEvent(@NotNull DragAndDropEvent dragAndDropEvent0) {
        return dragAndDropEvent0.getDragEvent$ui_release();
    }
}

