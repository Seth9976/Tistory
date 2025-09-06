package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final Context a;
    public final String b;

    public v(Context context0, String s) {
        this.a = context0;
        this.b = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "it");
        ToastUtils.show$default(ToastUtils.INSTANCE, this.a, this.b, 0, 0, 12, null);
        return Unit.INSTANCE;
    }
}

