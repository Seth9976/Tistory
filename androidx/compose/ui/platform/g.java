package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class g extends FunctionReferenceImpl implements Function3 {
    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return Boolean.valueOf(AndroidComposeView.access$startDrag-12SF9DM(((AndroidComposeView)this.receiver), ((DragAndDropTransferData)object0), ((Size)object1).unbox-impl(), ((Function1)object2)));
    }
}

