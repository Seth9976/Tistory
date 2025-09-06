package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.datasource.BaseSearchDataSource.DataType;
import com.kakao.tistory.data.datasource.SearchBlogDataSource;
import com.kakao.tistory.data.datasource.SearchPostDataSource;
import com.kakao.tistory.data.datasource.SearchTagDataSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y3 extends Lambda implements Function0 {
    public final DataType a;
    public final SearchResultViewModel b;
    public final String c;
    public final String d;
    public final String e;

    public y3(DataType baseSearchDataSource$DataType0, SearchResultViewModel searchResultViewModel0, String s, String s1, String s2) {
        this.a = baseSearchDataSource$DataType0;
        this.b = searchResultViewModel0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.a) {
            case 1: {
                return new SearchPostDataSource(this.b.i, this.c, this.d, this.e);
            }
            case 2: {
                return new SearchTagDataSource(this.b.i, (this.c == null ? "" : this.c), this.d, this.e);
            }
            case 3: {
                return new SearchBlogDataSource(this.b.i, this.d);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

