package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.DraftItemResult;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i1 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final Integer g;
    public final String h;

    public i1(EditorViewModel editorViewModel0, String s, String s1, String s2, List list0, Integer integer0, String s3, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = list0;
        this.g = integer0;
        this.h = s3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.postNewDraft(this.c, this.d, this.e, this.f, this.g, this.h, this);
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
        EditorViewModel editorViewModel0 = this.b;
        String s = this.e;
        if(((Result)object0) instanceof Success) {
            editorViewModel0.clearAutoSaved();
            Logger.INSTANCE.log("post new draft success");
            editorViewModel0.X = Boxing.boxLong(((DraftItemResult)((Success)(((Result)object0))).getData()).getDraft().getSequence());
            editorViewModel0.Y = ((DraftItemResult)((Success)(((Result)object0))).getData()).getDraft();
            editorViewModel0.M.setValue(new Event(Unit.INSTANCE));
            editorViewModel0.loadKeditor(s);
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            Logger.INSTANCE.error("postNewDraft " + ((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

