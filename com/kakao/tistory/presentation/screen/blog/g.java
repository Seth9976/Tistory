package com.kakao.tistory.presentation.screen.blog;

import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEvent.Finish;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final BlogViewModel a;

    public g(BlogViewModel blogViewModel0) {
        this.a = blogViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "section");
        Intrinsics.checkNotNullParameter(((String)object1), "page");
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, ((String)object0), ((String)object1), TistoryTiaraActionType.CLICK_CLOSE, null, null, null, null, null, 0xF8, null);
        this.a.sendEvent(Finish.INSTANCE);
        return Unit.INSTANCE;
    }
}

