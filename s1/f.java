package s1;

import android.media.ImageReader;
import androidx.compose.ui.graphics.layer.LayerSnapshotV22;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class f extends ContinuationImpl {
    public ImageReader o;
    public Object p;
    public final LayerSnapshotV22 q;
    public int r;

    public f(LayerSnapshotV22 layerSnapshotV220, Continuation continuation0) {
        this.q = layerSnapshotV220;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.toBitmap(null, this);
    }
}

