package com.kakao.tistory.presentation.view.common.bottomsheet;

import com.kakao.tistory.domain.entity.SortItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final CommonBottomDialogFragment a;

    public h(CommonBottomDialogFragment commonBottomDialogFragment0) {
        this.a = commonBottomDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Function1 function10 = this.a.getOnSelectedItem();
        Intrinsics.checkNotNull(((SortItem)object0));
        function10.invoke(((SortItem)object0));
        this.a.dismiss();
        return Unit.INSTANCE;
    }
}

