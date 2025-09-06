package androidx.activity;

import android.graphics.Rect;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1 implements View.OnAttachStateChangeListener {
    public final ProducerScope a;
    public final View b;
    public final f0 c;
    public final e0 d;

    public PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1(ProducerScope producerScope0, View view0, f0 f00, e0 e00) {
        this.a = producerScope0;
        this.b = view0;
        this.c = f00;
        this.d = e00;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        Rect rect0 = PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(this.b);
        this.a.trySend-JP2dKIU(rect0);
        this.b.getViewTreeObserver().addOnScrollChangedListener(this.c);
        this.b.addOnLayoutChangeListener(this.d);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        view0.getViewTreeObserver().removeOnScrollChangedListener(this.c);
        view0.removeOnLayoutChangeListener(this.d);
    }
}

