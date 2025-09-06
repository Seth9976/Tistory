package com.kakao.tistory.presentation.screen.feed;

import android.app.Activity;
import android.content.Context;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final Context a;

    public v(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        Context context0 = this.a;
        Activity activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
        if(activity0 != null) {
            String s = context0.getString(v);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, activity0, s, null, false, null, u.a, null, 92, null);
        }
        return Unit.INSTANCE;
    }
}

