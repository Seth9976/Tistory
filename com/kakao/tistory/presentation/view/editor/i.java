package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final DraftViewModel a;

    public i(DraftViewModel draftViewModel0) {
        this.a = draftViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.dismissDraftListDialog();
        return Unit.INSTANCE;
    }
}

