package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.common.tiara.TistoryGNBTiaraKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowBlogSwitchBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n2 extends Lambda implements Function0 {
    public final BlogMainViewModel a;

    public n2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TistoryGNBTiaraKt.trackClickAppBarBlogImage(BlogMainTiara.INSTANCE, true);
        this.a.sendEvent(ShowBlogSwitchBottomSheet.INSTANCE);
        return Unit.INSTANCE;
    }
}

