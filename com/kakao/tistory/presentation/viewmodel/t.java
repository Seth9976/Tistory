package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.SelectNothingItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final DaumCategoryViewModel a;

    public t(DaumCategoryViewModel daumCategoryViewModel0) {
        this.a = daumCategoryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((List)object0).add(0, SelectNothingItem.INSTANCE);
        this.a.getCategories().setValue(((List)object0));
        this.a.isShowProgress().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

