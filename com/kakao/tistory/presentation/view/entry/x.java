package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowChallengeAuthDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final EntryViewActivity a;
    public final EntryDialogEvent b;

    public x(EntryViewActivity entryViewActivity0, EntryDialogEvent entryViewModel$EntryDialogEvent0) {
        this.a = entryViewActivity0;
        this.b = entryViewModel$EntryDialogEvent0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryTiara.INSTANCE.trackClickChallengeAuthLater();
        EntryViewActivity.access$getEntryViewModel(this.a).showChallengeSuccessDialog(((ShowChallengeAuthDialog)this.b).getChallengeResult());
        return Unit.INSTANCE;
    }
}

