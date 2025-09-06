package com.kakao.tistory.presentation.view.common.widget;

import com.kakao.tistory.domain.entity.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final TistoryToolbar a;

    public c(TistoryToolbar tistoryToolbar0) {
        this.a = tistoryToolbar0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.a.d) {
            TistoryToolbar.updateAppBarUserImage$default(this.a, ((User)object0), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}

