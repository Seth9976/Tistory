package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class l2 extends AdaptedFunctionReference implements Function0 {
    public l2(EditorViewModel editorViewModel0) {
        super(0, editorViewModel0, EditorViewModel.class, "onClickDaumLikeSelect", "onClickDaumLikeSelect(Z)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EditorViewModel.onClickDaumLikeSelect$default(((EditorViewModel)this.receiver), false, 1, null);
        return Unit.INSTANCE;
    }
}

