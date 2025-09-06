package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import org.jetbrains.annotations.NotNull;

public final class d0 {
    public static final d0 a;

    static {
        d0.a = new d0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(24)
    public final boolean a(@NotNull View view0, @NotNull DragAndDropTransferData dragAndDropTransferData0, @NotNull ComposeDragShadowBuilder composeDragShadowBuilder0) {
        return view0.startDragAndDrop(dragAndDropTransferData0.getClipData(), composeDragShadowBuilder0, dragAndDropTransferData0.getLocalState(), dragAndDropTransferData0.getFlags());
    }
}

