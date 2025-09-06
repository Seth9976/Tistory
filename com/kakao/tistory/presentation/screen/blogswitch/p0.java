package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function1 {
    public final BlogSwitchViewModel a;

    public p0(BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = blogSwitchViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogSwitchType)object0), "type");
        this.a.setType(((BlogSwitchType)object0));
        return Unit.INSTANCE;
    }
}

