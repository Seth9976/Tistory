package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.domain.entity.SearchKeywordItem;
import com.kakao.tistory.domain.entity.SearchKeywordList;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.SearchRepository.DefaultImpls;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import qd.a;

public final class g4 extends SuspendLambda implements Function2 {
    public SearchViewModel a;
    public ArrayList b;
    public String c;
    public List d;
    public int e;
    public final SearchViewModel f;
    public final String g;

    public g4(SearchViewModel searchViewModel0, String s, Continuation continuation0) {
        this.f = searchViewModel0;
        this.g = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g4(this.f, this.g, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new g4(this.f, this.g, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator0;
        ArrayList arrayList1;
        List list1;
        List list0;
        String s;
        ArrayList arrayList0;
        SearchViewModel searchViewModel0;
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.e = 1;
                object2 = DefaultImpls.getSuggestKeyword$default(this.f.g, this.g, 0, this, 2, null);
                if(object2 == object1) {
                    return object1;
                }
                goto label_10;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                object2 = object0;
            label_10:
                searchViewModel0 = this.f;
                if(((Result)object2) instanceof Success) {
                    arrayList0 = new ArrayList();
                    s = ((SearchKeywordList)((Success)(((Result)object2))).getData()).getQuery();
                    list0 = ((SearchKeywordList)((Success)(((Result)object2))).getData()).getSuggestions();
                    if(s != null && Intrinsics.areEqual(s, searchViewModel0.getSearchKeyword().getValue())) {
                        if(searchViewModel0.g.getRecentKeywordEnabled()) {
                            f4 f40 = new f4(searchViewModel0, s, null);
                            this.a = searchViewModel0;
                            this.b = arrayList0;
                            this.c = s;
                            this.d = list0;
                            this.e = 2;
                            Object object3 = BuildersKt.withContext(Dispatchers.getIO(), f40, this);
                            if(object3 == object1) {
                                return object1;
                            }
                            list1 = (List)object3;
                        }
                        else {
                            list1 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                        iterator0 = list1.iterator();
                        goto label_40;
                    }
                    goto label_67;
                }
                break;
            }
            case 2: {
                list0 = this.d;
                s = this.c;
                arrayList0 = this.b;
                searchViewModel0 = this.a;
                ResultKt.throwOnFailure(object0);
                list1 = (List)object0;
                arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                iterator0 = list1.iterator();
            label_40:
                while(iterator0.hasNext()) {
                    Object object4 = iterator0.next();
                    arrayList1.add(new Keyword(new SearchKeywordItem(((SearchKeywordItem)object4).getKeyword(), ((SearchKeywordItem)object4).getDate()), false, 2, null));
                }
                arrayList0.addAll(arrayList1);
                if(list0 != null && !list0.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator iterator1 = list0.iterator();
                    while(iterator1.hasNext()) {
                        Object object5 = null;
                        Object object6 = iterator1.next();
                        String s1 = (String)object6;
                        for(Object object7: list1) {
                            if(Intrinsics.areEqual(StringExtensionKt.getStringExcludeBold(s1), ((SearchKeywordItem)object7).getKeyword())) {
                                object5 = object7;
                                break;
                            }
                        }
                        if(object5 == null) {
                            arrayList2.add(object6);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(arrayList2, 10));
                    for(Object object8: arrayList2) {
                        arrayList3.add(new Keyword(new SearchKeywordItem(((String)object8), null), false, 2, null));
                    }
                    arrayList0.addAll(arrayList3);
                }
            label_67:
                arrayList0.add(new Bottom(Boxing.boxInt(string.label_search_recommend_off), null, false, 6, null));
                if(Intrinsics.areEqual(s, searchViewModel0.getSearchKeyword().getValue())) {
                    searchViewModel0.getSuggestItems().setValue(arrayList0);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

