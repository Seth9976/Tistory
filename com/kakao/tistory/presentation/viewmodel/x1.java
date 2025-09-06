package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.EnumConstsKt;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class x1 extends SuspendLambda implements Function2 {
    public int a;
    public final EntryViewModel b;

    public x1(EntryViewModel entryViewModel0, Continuation continuation0) {
        this.b = entryViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x1(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new x1(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.postWebSession(this);
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
        EntryViewModel entryViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            EntryItem entryItem0 = (EntryItem)entryViewModel0.getEntryItem().getValue();
            if(entryItem0 != null) {
                String s = entryItem0.getPermalink();
                if(s == null || s.length() == 0) {
                    entryItem0 = null;
                }
                if(entryItem0 != null) {
                    entryViewModel0.isRestrictedEntry().setValue(Boxing.boxBoolean(entryItem0.isRestrict()));
                    entryViewModel0.D.setValue(EnumConstsKt.getEntryType(entryItem0.getType()));
                    EntryViewModel.access$showLikeAndCommentButton(entryViewModel0, entryItem0.getType());
                    Intrinsics.checkNotNull(entryItem0);
                    entryViewModel0.m.setValue(new Event(entryItem0));
                    return Unit.INSTANCE;
                }
            }
        }
        else if(((Result)object0) instanceof Fail) {
            entryViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

