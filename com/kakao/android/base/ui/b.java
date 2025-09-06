package com.kakao.android.base.ui;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import com.kakao.android.base.ui.dialog.BaseLoadingDialog;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final LayoutLessBaseFragment x;

    public b(LayoutLessBaseFragment layoutLessBaseFragment0, int v) {
        this.w = v;
        this.x = layoutLessBaseFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            Context context0 = this.x.requireContext();
            Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
            return new BaseLoadingDialog(context0, 0, 2, null);
        }
        Lifecycle lifecycle0 = this.x.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle0, "<get-lifecycle>(...)");
        return new AutoLifecycleObserver(lifecycle0);
    }
}

