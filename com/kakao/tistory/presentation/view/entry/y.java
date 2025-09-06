package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final String a;
    public final DialogFactory b;
    public final EntryViewActivity c;

    public y(String s, DialogFactory dialogFactory0, EntryViewActivity entryViewActivity0) {
        this.a = s;
        this.b = dialogFactory0;
        this.c = entryViewActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryTiara.INSTANCE.trackClickChallengeSuccess(this.a);
        this.b.getDismiss().invoke();
        String s = EntryViewActivity.access$getEntryViewModel(this.c).getBlogName();
        NavigatorExtensionKt.goToBlogTop(this.c, s);
        return Unit.INSTANCE;
    }
}

