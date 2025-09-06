package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class t2 extends FunctionReferenceImpl implements Function1 {
    public t2(Object object0) {
        super(1, object0, EditorViewModel.class, "onClickPublishNow", "onClickPublishNow(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((EditorViewModel)this.receiver).onClickPublishNow(((String)object0));
        return Unit.INSTANCE;
    }
}

