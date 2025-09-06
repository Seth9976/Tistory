package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowChallengeAuthDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent;
import com.kakao.tistory.presentation.widget.dialog.DialogButton;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final DialogFactory a;
    public final EntryViewActivity b;
    public final EntryDialogEvent c;

    public w(DialogFactory dialogFactory0, EntryViewActivity entryViewActivity0, EntryDialogEvent entryViewModel$EntryDialogEvent0) {
        this.a = dialogFactory0;
        this.b = entryViewActivity0;
        this.c = entryViewModel$EntryDialogEvent0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogButton)object0), "button");
        this.a.getDismiss().invoke();
        EntryViewActivity.access$getEntryViewModel(this.b).showChallengeSuccessDialog(((ShowChallengeAuthDialog)this.c).getChallengeResult());
        switch(EntryViewActivity.EntryDialogHandler.1.6.WhenMappings.$EnumSwitchMapping$0[((DialogButton)object0).ordinal()]) {
            case 1: {
                EntryTiara.INSTANCE.trackClickChallengeAuth();
                NavigatorExtensionKt.goToWebView$default(this.b, "https://accounts.kakao.com/weblogin/account", false, false, false, false, 30, null);
                return Unit.INSTANCE;
            }
            case 2: {
                EntryTiara.INSTANCE.trackClickChallengeAuthLater();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

