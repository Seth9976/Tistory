package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowModificationDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final EntryViewActivity a;
    public final String b;
    public final EntryDialogEvent c;

    public u(EntryViewActivity entryViewActivity0, String s, EntryDialogEvent entryViewModel$EntryDialogEvent0) {
        this.a = entryViewActivity0;
        this.b = s;
        this.c = entryViewModel$EntryDialogEvent0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long v = (long)((ShowModificationDialog)this.c).getId();
        NavigatorExtensionKt.goToEntryEditor(this.a, this.b, v, 0x80A);
        return Unit.INSTANCE;
    }
}

