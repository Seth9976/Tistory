package com.kakao.tistory.presentation.view.comment;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function1 {
    public final CommentFragment a;

    public j1(CommentFragment commentFragment0) {
        this.a = commentFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            NavigatorExtensionKt.goToBlogTop(fragmentActivity0, ((String)object0));
        }
        return Unit.INSTANCE;
    }
}

