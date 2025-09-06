package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import kotlinx.coroutines.channels.ProducerScope;

public final class f0 implements ViewTreeObserver.OnScrollChangedListener {
    public final ProducerScope a;
    public final View b;

    public f0(ProducerScope producerScope0, View view0) {
        this.a = producerScope0;
        this.b = view0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        Rect rect0 = PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(this.b);
        this.a.trySend-JP2dKIU(rect0);
    }
}

