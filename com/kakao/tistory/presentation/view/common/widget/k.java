package com.kakao.tistory.presentation.view.common.widget;

import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final TistoryToolbar a;

    public k(TistoryToolbar tistoryToolbar0) {
        this.a = tistoryToolbar0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SortItem)object0), "item");
        TistoryToolbarViewModel tistoryToolbarViewModel0 = this.a.e;
        if(tistoryToolbarViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tistoryToolbarViewModel");
            tistoryToolbarViewModel0 = null;
        }
        tistoryToolbarViewModel0.onClickServer(((SortItem)object0));
        return Unit.INSTANCE;
    }
}

