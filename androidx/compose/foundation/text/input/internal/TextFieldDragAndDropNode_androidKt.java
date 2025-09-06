package androidx.compose.foundation.text.input.internal;

import android.view.DragEvent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001AÒ\u0002\u0010\u0000\u001A\u00020\u00012\u0012\u0010\u0002\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000326\u0010\u0006\u001A2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\u00072\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102%\b\u0002\u0010\u0013\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102%\b\u0002\u0010\u0015\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102%\b\u0002\u0010\u0016\u001A\u001F\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102%\b\u0002\u0010\u0019\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102%\b\u0002\u0010\u001A\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102%\b\u0002\u0010\u001B\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0000¨\u0006\u001C"}, d2 = {"textFieldDragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "hintMediaTypes", "Lkotlin/Function0;", "", "Landroidx/compose/foundation/content/MediaType;", "onDrop", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/ClipEntry;", "Lkotlin/ParameterName;", "name", "clipEntry", "Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "", "dragAndDropRequestPermission", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "onStarted", "event", "onEntered", "onMoved", "Landroidx/compose/ui/geometry/Offset;", "position", "onChanged", "onExited", "onEnded", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldDragAndDropNode_androidKt {
    @NotNull
    public static final DragAndDropModifierNode textFieldDragAndDropNode(@NotNull Function0 function00, @NotNull Function2 function20, @NotNull Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @Nullable Function1 function15, @Nullable Function1 function16) {
        return DragAndDropNodeKt.DragAndDropModifierNode(new z0(function00), new DragAndDropTarget() {
            public final Function1 a;
            public final Function2 b;
            public final Function1 c;
            public final Function1 d;
            public final Function1 e;
            public final Function1 f;
            public final Function1 g;
            public final Function1 h;

            {
                Function1 function10 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function2 function20 = function20;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function11 = function11;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function12 = function12;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function13 = function13;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function14 = function15;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function15 = function14;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function16 = function16;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = function10;
                this.b = function20;
                this.c = function11;
                this.d = function12;
                this.e = function13;
                this.f = function14;
                this.g = function15;
                this.h = function16;
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onChanged(@NotNull DragAndDropEvent dragAndDropEvent0) {
                Function1 function10 = this.g;
                if(function10 != null) {
                    function10.invoke(dragAndDropEvent0);
                }
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(@NotNull DragAndDropEvent dragAndDropEvent0) {
                this.a.invoke(dragAndDropEvent0);
                ClipEntry clipEntry0 = AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent0).getClipData());
                ClipMetadata clipMetadata0 = AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent0).getClipDescription());
                return ((Boolean)this.b.invoke(clipEntry0, clipMetadata0)).booleanValue();
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(@NotNull DragAndDropEvent dragAndDropEvent0) {
                Function1 function10 = this.h;
                if(function10 != null) {
                    function10.invoke(dragAndDropEvent0);
                }
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(@NotNull DragAndDropEvent dragAndDropEvent0) {
                Function1 function10 = this.d;
                if(function10 != null) {
                    function10.invoke(dragAndDropEvent0);
                }
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(@NotNull DragAndDropEvent dragAndDropEvent0) {
                Function1 function10 = this.f;
                if(function10 != null) {
                    function10.invoke(dragAndDropEvent0);
                }
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onMoved(@NotNull DragAndDropEvent dragAndDropEvent0) {
                DragEvent dragEvent0 = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent0);
                Function1 function10 = this.e;
                if(function10 != null) {
                    function10.invoke(Offset.box-impl(OffsetKt.Offset(dragEvent0.getX(), dragEvent0.getY())));
                }
            }

            @Override  // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(@NotNull DragAndDropEvent dragAndDropEvent0) {
                Function1 function10 = this.c;
                if(function10 != null) {
                    function10.invoke(dragAndDropEvent0);
                }
            }
        });
    }

    public static DragAndDropModifierNode textFieldDragAndDropNode$default(Function0 function00, Function2 function20, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int v, Object object0) {
        Function1 function17 = (v & 8) == 0 ? function11 : null;
        Function1 function18 = (v & 16) == 0 ? function12 : null;
        Function1 function19 = (v & 0x20) == 0 ? function13 : null;
        Function1 function110 = (v & 0x40) == 0 ? function14 : null;
        Function1 function111 = (v & 0x80) == 0 ? function15 : null;
        return (v & 0x100) == 0 ? TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode(function00, function20, function10, function17, function18, function19, function110, function111, function16) : TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode(function00, function20, function10, function17, function18, function19, function110, function111, null);
    }
}

