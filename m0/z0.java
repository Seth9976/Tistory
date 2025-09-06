package m0;

import android.content.ClipDescription;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function1 {
    public final Function0 w;

    public z0(Function0 function00) {
        this.w = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ClipDescription clipDescription0 = DragAndDrop_androidKt.toAndroidDragEvent(((DragAndDropEvent)object0)).getClipDescription();
        Iterable iterable0 = (Iterable)this.w.invoke();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(Intrinsics.areEqual(((MediaType)object1), MediaType.Companion.getAll()) || clipDescription0.hasMimeType(((MediaType)object1).getRepresentation())) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

