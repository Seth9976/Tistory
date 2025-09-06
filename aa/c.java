package aa;

import android.graphics.Matrix;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final int w;
    public final long x;

    public c(long v, int v1) {
        this.w = v1;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                ((GraphicsLayerScope)object0).setScaleX(Offset.getX-impl(this.x));
                ((GraphicsLayerScope)object0).setScaleY(Offset.getY-impl(this.x));
                return Unit.INSTANCE;
            }
            case 1: {
                ((SemanticsPropertyReceiver)object0).set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, this.x, SelectionHandleAnchor.Middle, true, null));
                return Unit.INSTANCE;
            }
            case 2: {
                return this.x;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postTranslate(Offset.getX-impl(this.x), Offset.getY-impl(this.x));
                return Unit.INSTANCE;
            }
        }
    }
}

