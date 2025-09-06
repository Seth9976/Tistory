package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final BlogCategoryDialogAdapter a;
    public final CategoryItem b;

    public e(BlogCategoryDialogAdapter blogCategoryDialogAdapter0, CategoryItem categoryItem0) {
        this.a = blogCategoryDialogAdapter0;
        this.b = categoryItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

