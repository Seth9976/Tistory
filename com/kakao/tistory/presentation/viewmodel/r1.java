package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class r1 extends SuspendLambda implements Function2 {
    public EntryViewModel a;
    public int b;
    public final EntryViewModel c;
    public final String d;

    public r1(EntryViewModel entryViewModel0, String s, Continuation continuation0) {
        this.c = entryViewModel0;
        this.d = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r1(this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new r1(this.c, this.d, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        EntryViewModel entryViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                EntryItem entryItem0 = (EntryItem)this.c.getEntryItem().getValue();
                if(entryItem0 != null) {
                    Long long0 = entryItem0.getId();
                    if(long0 != null) {
                        EntryViewModel entryViewModel0 = this.c;
                        this.a = entryViewModel0;
                        this.b = 1;
                        object0 = entryViewModel0.i.deleteEntry(this.d, long0.longValue(), this);
                        if(object0 == object1) {
                            return object1;
                        }
                        entryViewModel1 = entryViewModel0;
                        goto label_18;
                    }
                }
                break;
            }
            case 1: {
                entryViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_18:
                if(((Result)object0) instanceof Success) {
                    entryViewModel1.j.getUpdateBlogInfo().setValue(Boxing.boxBoolean(true));
                    entryViewModel1.z.setValue(new Event(Unit.INSTANCE));
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    entryViewModel1.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
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

