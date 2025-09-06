package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final Function1 a;
    public final Creator b;

    public f(Function1 function10, Creator homeSlotContent$Creator0) {
        this.a = function10;
        this.b = homeSlotContent$Creator0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeTiara.INSTANCE.trackClickCreatorBlog();
        this.a.invoke(this.b.getBlogName());
        return Unit.INSTANCE;
    }
}

