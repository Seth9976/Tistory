package com.kakao.tistory.presentation.view.comment;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function0 {
    public final CommentFragment a;

    public j0(CommentFragment commentFragment0) {
        this.a = commentFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            fragmentActivity0.finish();
        }
        return Unit.INSTANCE;
    }
}

