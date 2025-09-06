package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.cdm.CDM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class o0 extends SuspendLambda implements Function2 {
    public final EditorViewModel a;
    public final Function0 b;

    public o0(EditorViewModel editorViewModel0, Function0 function00, Continuation continuation0) {
        this.a = editorViewModel0;
        this.b = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new o0(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new o0(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        KeditorView keditorView0 = this.a.s;
        KeditorView keditorView1 = null;
        if(keditorView0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keditor");
            keditorView0 = null;
        }
        CDM cDM0 = keditorView0.export();
        MutableLiveData mutableLiveData0 = this.a.getCoverImageUrl();
        String s = cDM0.getRepresentationImage();
        if(s == null) {
            s = (String)this.a.getCoverImageUrl().getValue();
            if(s == null) {
                KeditorView keditorView2 = this.a.s;
                if(keditorView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("keditor");
                }
                else {
                    keditorView1 = keditorView2;
                }
                s = keditorView1.getFirstRepresentableImage();
            }
        }
        mutableLiveData0.setValue(s);
        this.b.invoke();
        return Unit.INSTANCE;
    }
}

