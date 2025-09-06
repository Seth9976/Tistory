package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.domain.entity.SearchItem.Empty;
import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.domain.entity.SearchItem.Top;
import com.kakao.tistory.domain.entity.SearchKeywordItem;
import com.kakao.tistory.presentation.R.string;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d4 extends SuspendLambda implements Function2 {
    public final SearchViewModel a;
    public final ArrayList b;

    public d4(SearchViewModel searchViewModel0, ArrayList arrayList0, Continuation continuation0) {
        this.a = searchViewModel0;
        this.b = arrayList0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d4(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new d4(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        List list0 = this.a.g.getAllRecentSearch();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object1: list0) {
            arrayList0.add(new Keyword(((SearchKeywordItem)object1), true));
        }
        if(arrayList0.isEmpty()) {
            Empty searchItem$Empty0 = new Empty(Boxing.boxInt(string.label_search_recent_empty));
            this.b.add(searchItem$Empty0);
        }
        else {
            Top searchItem$Top0 = new Top(Boxing.boxInt(string.label_search_recent_title));
            this.b.add(searchItem$Top0);
        }
        this.b.addAll(arrayList0);
        Bottom searchItem$Bottom0 = new Bottom(Boxing.boxInt(string.label_search_recent_off), (arrayList0.isEmpty() ? null : Boxing.boxInt(string.label_search_remove_all)), true);
        return Boxing.boxBoolean(this.b.add(searchItem$Bottom0));
    }
}

