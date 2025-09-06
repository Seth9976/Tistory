package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function1 {
    public final EntryViewModel a;
    public final EntryViewActivity b;

    public h1(EntryViewModel entryViewModel0, EntryViewActivity entryViewActivity0) {
        this.a = entryViewModel0;
        this.b = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        String s = this.a.getBlogName();
        if(s != null) {
            EntryPasswordDialogFragment entryPasswordDialogFragment0 = EntryPasswordDialogFragment.Companion.newInstance(s, ((String)object0));
            entryPasswordDialogFragment0.setOnClickOkCallback(new f1(this.b, s, ((String)object0)));
            entryPasswordDialogFragment0.setOnClickCancelCallback(new g1(this.b));
            entryPasswordDialogFragment0.show(this.b.getSupportFragmentManager(), "EntryViewModel");
        }
        return Unit.INSTANCE;
    }
}

