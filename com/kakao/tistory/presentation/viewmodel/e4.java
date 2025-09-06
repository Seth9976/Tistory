package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.domain.entity.SearchItem.Empty;
import com.kakao.tistory.presentation.R.string;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import qd.a;

public final class e4 extends SuspendLambda implements Function2 {
    public ArrayList a;
    public int b;
    public final SearchViewModel c;

    public e4(SearchViewModel searchViewModel0, Continuation continuation0) {
        this.c = searchViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e4(this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new e4(this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ArrayList arrayList1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ArrayList arrayList0 = new ArrayList();
                if(this.c.g.getRecentKeywordEnabled()) {
                    d4 d40 = new d4(this.c, arrayList0, null);
                    this.a = arrayList0;
                    this.b = 1;
                    if(BuildersKt.withContext(Dispatchers.getIO(), d40, this) == object1) {
                        return object1;
                    }
                }
                else {
                    arrayList0.add(new Empty(Boxing.boxInt(string.label_search_recent_off_title)));
                    arrayList0.add(new Bottom(Boxing.boxInt(string.label_search_recent_on), null, true));
                }
                arrayList1 = arrayList0;
                break;
            }
            case 1: {
                arrayList1 = this.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.c.getSuggestItems().setValue(arrayList1);
        return Unit.INSTANCE;
    }
}

