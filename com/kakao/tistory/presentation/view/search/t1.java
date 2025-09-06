package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.data.datasource.BaseSearchDataSource.DataType;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final DataType c;
    public final TopViewModel d;
    public final SearchResultViewModel e;
    public final int f;

    public t1(String s, String s1, DataType baseSearchDataSource$DataType0, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, int v) {
        this.a = s;
        this.b = s1;
        this.c = baseSearchDataSource$DataType0;
        this.d = topViewModel0;
        this.e = searchResultViewModel0;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.access$SearchResultPage(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
        return Unit.INSTANCE;
    }
}

