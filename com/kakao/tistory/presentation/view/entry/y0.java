package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryEvent.GoComment;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function1 {
    public final EntryViewActivity a;

    public y0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryEvent)object0), "it");
        if(((EntryEvent)object0) instanceof GoComment) {
            EntryItem entryItem0 = ((GoComment)(((EntryEvent)object0))).getEntryItem();
            Long long0 = ((GoComment)(((EntryEvent)object0))).getCommentId();
            NavigatorExtensionKt.goToComment(this.a, entryItem0, long0, 0x809);
        }
        return Unit.INSTANCE;
    }
}

