package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeCurrentCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a2 extends Lambda implements Function2 {
    public final BlogMainViewModel a;

    public a2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((BlogMainCategoryItem)object1), "it");
        BlogMainTiara.INSTANCE.trackClickCategoryItem(((Number)object0).intValue());
        ChangeCurrentCategory blogMainIntent$ChangeCurrentCategory0 = new ChangeCurrentCategory(((BlogMainCategoryItem)object1));
        this.a.sendIntent(blogMainIntent$ChangeCurrentCategory0);
        return Unit.INSTANCE;
    }
}

