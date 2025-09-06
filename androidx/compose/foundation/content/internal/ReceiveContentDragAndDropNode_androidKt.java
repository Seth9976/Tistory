package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w.c;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A$\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000\u001A\f\u0010\b\u001A\u00020\t*\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"ReceiveContentDragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "receiveContentConfiguration", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "dragAndDropRequestPermission", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "toTransferableContent", "Landroidx/compose/foundation/content/TransferableContent;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ReceiveContentDragAndDropNode_androidKt {
    @NotNull
    public static final DragAndDropModifierNode ReceiveContentDragAndDropNode(@NotNull ReceiveContentConfiguration receiveContentConfiguration0, @NotNull Function1 function10) {
        androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode.2 receiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$20 = new DragAndDropTarget() {
            public final ReceiveContentConfiguration a;
            public final Function1 b;

            {
                ReceiveContentConfiguration receiveContentConfiguration0 = receiveContentConfiguration0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = receiveContentConfiguration0;
                this.b = function10;
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(@NotNull DragAndDropEvent dragAndDropEvent0) {
                this.b.invoke(dragAndDropEvent0);
                TransferableContent transferableContent0 = ReceiveContentDragAndDropNode_androidKt.toTransferableContent(dragAndDropEvent0);
                return !Intrinsics.areEqual(transferableContent0, this.a.getReceiveContentListener().onReceive(transferableContent0));
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(@NotNull DragAndDropEvent dragAndDropEvent0) {
                this.a.getReceiveContentListener().onDragEnd();
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(@NotNull DragAndDropEvent dragAndDropEvent0) {
                this.a.getReceiveContentListener().onDragEnter();
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(@NotNull DragAndDropEvent dragAndDropEvent0) {
                this.a.getReceiveContentListener().onDragExit();
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(@NotNull DragAndDropEvent dragAndDropEvent0) {
                this.a.getReceiveContentListener().onDragStart();
            }
        };
        return DragAndDropNodeKt.DragAndDropModifierNode(c.w, receiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$20);
    }

    @NotNull
    public static final TransferableContent toTransferableContent(@NotNull DragAndDropEvent dragAndDropEvent0) {
        DragEvent dragEvent0 = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent0);
        return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(dragEvent0.getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(dragEvent0.getClipDescription()), 1, null, 8, null);
    }
}

