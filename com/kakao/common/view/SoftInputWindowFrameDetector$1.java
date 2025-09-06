package com.kakao.common.view;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/kakao/common/view/SoftInputWindowFrameDetector$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SoftInputWindowFrameDetector.1 implements View.OnAttachStateChangeListener {
    public final SoftInputWindowFrameDetector a;

    public SoftInputWindowFrameDetector.1(SoftInputWindowFrameDetector softInputWindowFrameDetector0) {
        this.a = softInputWindowFrameDetector0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        SoftInputWindowFrameDetector.access$setVto(this.a, viewTreeObserver0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        SoftInputWindowFrameDetector.access$setVto(this.a, null);
    }
}

