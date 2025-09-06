package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.SortItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function0 {
    public final SortItem a;

    public l0(SortItem sortItem0) {
        this.a = sortItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FollowingTiara.trackClickSortItem$default(FollowingTiara.INSTANCE, null, this.a.getTitle(), 1, null);
        return Unit.INSTANCE;
    }
}

