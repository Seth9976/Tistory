package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final BlogSwitchViewModel a;

    public k(BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = blogSwitchViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.dismissBlogSwitchBottomSheet();
        return Unit.INSTANCE;
    }
}

