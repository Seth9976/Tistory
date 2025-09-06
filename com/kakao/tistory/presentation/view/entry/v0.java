package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.common.IllegalFilmType;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment.Companion;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function1 {
    public final EntryViewModel a;
    public final EntryViewActivity b;

    public v0(EntryViewModel entryViewModel0, EntryViewActivity entryViewActivity0) {
        this.a = entryViewModel0;
        this.b = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Number)object0).longValue();
        String s = this.a.getBlogName();
        if(s != null) {
            Long long0 = EntryViewActivity.access$getEntryViewModel(this.b).getBlogId();
            Companion.newInstance$default(ReportDialogFragment.Companion, "글뷰", "글뷰", s, long0, v, null, null, null, IllegalFilmType.ARTICLE, null, null, 0x6E0, null).show(this.b.getSupportFragmentManager(), "ReportDialogFragment");
        }
        return Unit.INSTANCE;
    }
}

