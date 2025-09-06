package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i4 extends Lambda implements Function1 {
    public final EditorViewModel a;

    public i4(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CategoryItem)object0), "it");
        this.a.selectCategoryItem(((CategoryItem)object0));
        return Unit.INSTANCE;
    }
}

