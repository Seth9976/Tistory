package com.kakao.tistory.presentation.common;

import com.kakao.keditor.plugin.itemspec.grammarcheck.GrammarCheckResponse;
import com.kakao.tistory.domain.entity.GrammarCheck;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.p;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int a;
    public final String b;
    public final TistoryGrammarChecker c;
    public final Function0 d;
    public final Function1 e;

    public c(String s, TistoryGrammarChecker tistoryGrammarChecker0, Function0 function00, Function1 function10, Continuation continuation0) {
        this.b = s;
        this.c = tistoryGrammarChecker0;
        this.d = function00;
        this.e = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b.length() <= 0 || p.isBlank(this.b)) {
                    this.d.invoke();
                    return Unit.INSTANCE;
                }
                this.a = 1;
                object0 = this.c.a.invoke(this.b, this);
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
        TistoryGrammarChecker tistoryGrammarChecker0 = this.c;
        Function1 function10 = this.e;
        Function0 function00 = this.d;
        if(((Result)object0) instanceof Success) {
            GrammarCheckResponse grammarCheckResponse0 = TistoryGrammarChecker.access$toGrammarCheckResponseMapper(tistoryGrammarChecker0, ((GrammarCheck)((Success)(((Result)object0))).getData()));
            if(grammarCheckResponse0.getSentences() == null || !grammarCheckResponse0.getHasGrammarError()) {
                tistoryGrammarChecker0.b.invoke(Boxing.boxInt(string.info_no_grammar_error));
            }
            else {
                function10.invoke(grammarCheckResponse0);
            }
            function00.invoke();
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            tistoryGrammarChecker0.b.invoke(Boxing.boxInt(string.info_grammar_check_fail));
            function00.invoke();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

