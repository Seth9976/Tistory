package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class l3 extends FunctionReferenceImpl implements Function0 {
    public l3(EditorViewModel editorViewModel0) {
        super(0, editorViewModel0, EditorViewModel.class, "onClickEditTag", "onClickEditTag()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((EditorViewModel)this.receiver).onClickEditTag();
        return Unit.INSTANCE;
    }
}

