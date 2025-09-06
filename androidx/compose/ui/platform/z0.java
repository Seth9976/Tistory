package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View.OnDragListener;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;

public final class z0 implements View.OnDragListener, DragAndDropManager {
    public final g a;
    public final DragAndDropNode b;
    public final ArraySet c;
    public final DragAndDropModifierOnDragListener.modifier.1 d;

    public z0(g g0) {
        this.a = g0;
        this.b = new DragAndDropNode(f.H);
        this.c = new ArraySet(0, 1, null);
        this.d = new DragAndDropModifierOnDragListener.modifier.1(this);
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropManager
    public final boolean drag-12SF9DM(DragAndDropTransferData dragAndDropTransferData0, long v, Function1 function10) {
        Size size0 = Size.box-impl(v);
        return ((Boolean)this.a.invoke(dragAndDropTransferData0, size0, function10)).booleanValue();
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropManager
    public final Modifier getModifier() {
        return this.d;
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropManager
    public final boolean isInterestedNode(DragAndDropModifierNode dragAndDropModifierNode0) {
        return this.c.contains(dragAndDropModifierNode0);
    }

    @Override  // android.view.View$OnDragListener
    public final boolean onDrag(View view0, DragEvent dragEvent0) {
        DragAndDropEvent dragAndDropEvent0 = new DragAndDropEvent(dragEvent0);
        int v = dragEvent0.getAction();
        DragAndDropNode dragAndDropNode0 = this.b;
        switch(v) {
            case 1: {
                boolean z = dragAndDropNode0.acceptDragAndDropTransfer(dragAndDropEvent0);
                for(Object object0: this.c) {
                    ((DragAndDropModifierNode)object0).onStarted(dragAndDropEvent0);
                }
                return z;
            }
            case 2: {
                dragAndDropNode0.onMoved(dragAndDropEvent0);
                return false;
            }
            case 3: {
                return dragAndDropNode0.onDrop(dragAndDropEvent0);
            }
            case 4: {
                dragAndDropNode0.onEnded(dragAndDropEvent0);
                return false;
            }
            case 5: {
                dragAndDropNode0.onEntered(dragAndDropEvent0);
                return false;
            }
            case 6: {
                dragAndDropNode0.onExited(dragAndDropEvent0);
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropManager
    public final void registerNodeInterest(DragAndDropModifierNode dragAndDropModifierNode0) {
        this.c.add(dragAndDropModifierNode0);
    }
}

