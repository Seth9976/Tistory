package com.kakao.tistory.presentation.view.blog;

import android.content.Context;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function1 {
    public final BlogFollowingFragment a;

    public p0(BlogFollowingFragment blogFollowingFragment0) {
        this.a = blogFollowingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Context context0 = this.a.getContext();
        ToastUtils.show$default(ToastUtils.INSTANCE, context0, ((Number)object0).intValue(), 0, 0, 12, null);
        return Unit.INSTANCE;
    }
}

