package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final CategoryGroup a;
    public final Function1 b;

    public c(CategoryGroup homeSlot$CategoryGroup0, Function1 function10) {
        this.a = homeSlot$CategoryGroup0;
        this.b = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeTiara.INSTANCE.trackClickCategoryGroup("");
        this.b.invoke("");
        return Unit.INSTANCE;
    }
}

