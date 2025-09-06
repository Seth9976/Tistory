package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.core.view.DragAndDropPermissionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "event", "", "dragAndDropRequestPermission", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDropRequestPermission_androidKt {
    public static final void dragAndDropRequestPermission(@NotNull DelegatableNode delegatableNode0, @NotNull DragAndDropEvent dragAndDropEvent0) {
        Activity activity0;
        ClipData clipData0 = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent0).getClipData();
        int v = clipData0.getItemCount();
        for(int v1 = 0; v1 < v; ++v1) {
            Uri uri0 = clipData0.getItemAt(v1).getUri();
            if(uri0 != null && Intrinsics.areEqual(uri0.getScheme(), "content")) {
                if(delegatableNode0.getNode().isAttached()) {
                    for(Context context0 = DelegatableNode_androidKt.requireView(delegatableNode0).getContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                        activity0 = null;
                        if(!(context0 instanceof ContextWrapper)) {
                            break;
                        }
                        if(context0 instanceof Activity) {
                            activity0 = (Activity)context0;
                            break;
                        }
                    }
                    if(activity0 == null) {
                        return;
                    }
                    DragAndDropPermissionsCompat.request(activity0, DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent0));
                }
                return;
            }
        }
    }
}

