package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class g extends FunctionReferenceImpl implements Function1 {
    public g(BlogCategoryViewModel blogCategoryViewModel0) {
        super(1, blogCategoryViewModel0, BlogCategoryViewModel.class, "onClickCategoryItem", "onClickCategoryItem(Lcom/kakao/tistory/domain/entity/CategoryItem;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CategoryItem)object0), "p0");
        ((BlogCategoryViewModel)this.receiver).onClickCategoryItem(((CategoryItem)object0));
        return Unit.INSTANCE;
    }
}

