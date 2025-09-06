package com.kakao.tistory.presentation.view.search;

import com.kakao.android.base.utils.UiUtils;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final SearchActivity a;
    public final SearchViewModel b;

    public v(SearchActivity searchActivity0, SearchViewModel searchViewModel0) {
        this.a = searchActivity0;
        this.b = searchViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        UiUtils.INSTANCE.hideSoftInput(this.a);
        Object object1 = this.b.getSearchKeyword().getValue();
        NavigatorExtensionKt.goToSearch$default(this.a, ((String)object1), null, RedirectDestination.POST, 2, null);
        return Unit.INSTANCE;
    }
}

