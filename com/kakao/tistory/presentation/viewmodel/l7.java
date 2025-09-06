package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.statistics.entity.TopEntry;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import qd.a;

public final class l7 extends SuspendLambda implements Function2 {
    public int a;
    public final TopPostViewModel b;
    public final String c;
    public final String d;
    public final String e;

    public l7(TopPostViewModel topPostViewModel0, String s, String s1, String s2, Continuation continuation0) {
        this.b = topPostViewModel0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l7(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l7)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.invoke(this.c, this.d, this.e, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        TopPostViewModel topPostViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            MutableStateFlow mutableStateFlow0 = topPostViewModel0.q;
            Iterable iterable0 = (Iterable)((Success)(((Result)object0))).getData();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            int v = 0;
            for(Object object2: iterable0) {
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Thumbnail thumbnail0 = ((TopEntry)object2).getThumbnail();
                arrayList0.add(new TopEntryItem(((TopEntry)object2).getTitle(), (thumbnail0 == null ? null : ThumbnailUiStateKt.toItem(thumbnail0)), new k7(topPostViewModel0, v, ((TopEntry)object2)), ((TopEntry)object2).getLikeCount(), ((TopEntry)object2).getCommentCount(), ((TopEntry)object2).getCount()));
                ++v;
            }
            mutableStateFlow0.setValue(arrayList0);
        }
        return Unit.INSTANCE;
    }
}

