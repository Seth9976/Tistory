package com.kakao.tistory.presentation.view.statistics.viewholder;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function0 {
    public final TopViewModel a;
    public final EntryItem b;

    public j0(TopViewModel topViewModel0, EntryItem entryItem0) {
        this.a = topViewModel0;
        this.b = entryItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        i0 i00 = new i0(this.b);
        this.a.onClickSort(i00);
        return Unit.INSTANCE;
    }
}

