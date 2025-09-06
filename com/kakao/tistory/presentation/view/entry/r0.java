package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function0 {
    public final EntryViewModel a;

    public r0(EntryViewModel entryViewModel0) {
        this.a = entryViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickUserProfileImage();
        return Unit.INSTANCE;
    }
}

