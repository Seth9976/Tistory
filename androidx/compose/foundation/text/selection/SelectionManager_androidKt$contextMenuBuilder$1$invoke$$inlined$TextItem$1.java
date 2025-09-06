package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "androidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n81#2:105\n*E\n"})
public final class SelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1 extends Lambda implements Function0 {
    public final ContextMenuState w;
    public final SelectionManager x;

    public SelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1(ContextMenuState contextMenuState0, SelectionManager selectionManager0) {
        this.w = contextMenuState0;
        this.x = selectionManager0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        this.x.copy$foundation_release();
        ContextMenuState_androidKt.close(this.w);
    }
}

