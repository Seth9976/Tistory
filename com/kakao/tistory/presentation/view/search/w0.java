package com.kakao.tistory.presentation.view.search;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final State a;
    public final SearchViewModel b;

    public w0(State state0, SearchViewModel searchViewModel0) {
        this.a = state0;
        this.b = searchViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        List list0 = SearchKeywordFragmentKt.access$SearchKeywordList$lambda$4(this.a);
        Intrinsics.checkNotNullExpressionValue(list0, "access$SearchKeywordList$lambda$4(...)");
        ((LazyListScope)object0).items(list0.size(), null, new SearchKeywordFragmentKt.SearchKeywordList.1.invoke..inlined.itemsIndexed.default.2(list0), ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new SearchKeywordFragmentKt.SearchKeywordList.1.invoke..inlined.itemsIndexed.default.3(list0, this.b)));
        return Unit.INSTANCE;
    }
}

