package com.kakao.tistory.presentation.view.editor;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class b6 extends SuspendLambda implements Function2 {
    public Object a;
    public final EditorTagFragment b;

    public b6(EditorTagFragment editorTagFragment0, Continuation continuation0) {
        this.b = editorTagFragment0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b6(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        b6 b60 = new b6(this.b, ((Continuation)object1));
        b60.a = (List)object0;
        return b60.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        List list0 = (List)this.a;
        EditorTagFragment.access$getEditorTagViewModel(this.b).setExclusiveTagList(list0);
        return Unit.INSTANCE;
    }
}

