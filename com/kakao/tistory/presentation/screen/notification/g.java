package com.kakao.tistory.presentation.screen.notification;

import android.content.Context;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final Context a;

    public g(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_notification_pc_message);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        ToastUtils.show$default(ToastUtils.INSTANCE, this.a, s, 0, 0, 12, null);
        return Unit.INSTANCE;
    }
}

