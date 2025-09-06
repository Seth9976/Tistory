package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final DraftViewModel a;

    public l(DraftViewModel draftViewModel0) {
        this.a = draftViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DraftItem)object0), "it");
        this.a.onClickShowAccessibilityDraftList(((DraftItem)object0));
        return Unit.INSTANCE;
    }
}

