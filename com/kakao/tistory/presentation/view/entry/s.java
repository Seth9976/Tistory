package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.widget.dialog.DialogButton;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final DialogFactory a;
    public final EntryViewActivity b;

    public s(DialogFactory dialogFactory0, EntryViewActivity entryViewActivity0) {
        this.a = dialogFactory0;
        this.b = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogButton)object0), "button");
        switch(EntryViewActivity.EntryDialogHandler.1.2.WhenMappings.$EnumSwitchMapping$0[((DialogButton)object0).ordinal()]) {
            case 1: {
                this.a.getDismiss().invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                this.a.getDismiss().invoke();
                EntryViewActivity.access$getEntryViewModel(this.b).deleteEntry();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

