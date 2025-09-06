package com.kakao.tistory.presentation.view.common.dialog;

import com.kakao.android.base.utils.UiUtils;
import com.kakao.tistory.presentation.databinding.DialogEntryPasswordBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final EntryPasswordDialogFragment a;

    public d(EntryPasswordDialogFragment entryPasswordDialogFragment0) {
        this.a = entryPasswordDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        DialogEntryPasswordBinding dialogEntryPasswordBinding0 = EntryPasswordDialogFragment.access$getDataBinding(this.a);
        Intrinsics.checkNotNullExpressionValue(dialogEntryPasswordBinding0.commonProtectedEntryDialogEditText, "commonProtectedEntryDialogEditText");
        UiUtils.INSTANCE.hideSoftInput(dialogEntryPasswordBinding0.commonProtectedEntryDialogEditText);
        this.a.dismiss();
        this.a.getOnClickOkCallback().invoke(((String)object0));
        return Unit.INSTANCE;
    }
}

