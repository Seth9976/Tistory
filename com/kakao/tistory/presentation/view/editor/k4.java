package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k4 extends Lambda implements Function1 {
    public final EditorViewModel a;

    public k4(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.selectDaumLikeCategoryItem(((DaumLikeItem)object0));
        return Unit.INSTANCE;
    }
}

