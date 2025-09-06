package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final BlogCategoryDialogFragment a;

    public h(BlogCategoryDialogFragment blogCategoryDialogFragment0) {
        this.a = blogCategoryDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CategoryItem)object0), "it");
        this.a.getOnSelectedItem().invoke(((CategoryItem)object0));
        this.a.dismiss();
        return Unit.INSTANCE;
    }
}

