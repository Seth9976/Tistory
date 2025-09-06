package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.SortItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function0 {
    public final SortItem a;

    public r(SortItem sortItem0) {
        this.a = sortItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FollowingTiara.INSTANCE.trackClickSortItem("구독자", this.a.getTitle());
        return Unit.INSTANCE;
    }
}

