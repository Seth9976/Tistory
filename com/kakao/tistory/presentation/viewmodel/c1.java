package com.kakao.tistory.presentation.viewmodel;

import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import com.kakao.tistory.domain.entity.entry.OpenGraphInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

public final class c1 extends SuspendLambda implements Function2 {
    public Object a;
    public final EditorViewModel b;
    public final OpenGraphItem c;
    public final Function1 d;

    public c1(EditorViewModel editorViewModel0, OpenGraphItem openGraphItem0, Function1 function10, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = openGraphItem0;
        this.d = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c1(this.b, this.c, this.d, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.a;
        OpenGraphInfo openGraphInfo0 = this.b.g.getOpenGraphWithAsync(this.c.getSourceUrl());
        if(openGraphInfo0 != null) {
            BuildersKt.launch$default(coroutineScope0, Dispatchers.getMain(), null, new b1(this.d, this.c, openGraphInfo0, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}

