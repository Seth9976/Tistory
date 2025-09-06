package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class o2 extends FunctionReferenceImpl implements Function0 {
    public o2(Object object0) {
        super(0, object0, EditorViewModel.class, "onClickPassword", "onClickPassword()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((EditorViewModel)this.receiver).onClickPassword();
        return Unit.INSTANCE;
    }
}

