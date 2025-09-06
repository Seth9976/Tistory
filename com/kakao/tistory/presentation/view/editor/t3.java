package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t3 extends Lambda implements Function0 {
    public final EditorViewModel a;

    public t3(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickChangeVisibility(EntryVisibilityType.PROTECTED);
        return Unit.INSTANCE;
    }
}

