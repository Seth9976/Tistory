package com.kakao.tistory.presentation.view.comment;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final Pin a;
    public final FocusRequester b;
    public final SoftwareKeyboardController c;

    public x(Pin commentItemUIModel$Pin0, FocusRequester focusRequester0, SoftwareKeyboardController softwareKeyboardController0) {
        this.a = commentItemUIModel$Pin0;
        this.b = focusRequester0;
        this.c = softwareKeyboardController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnClickReply().invoke();
        this.b.requestFocus();
        SoftwareKeyboardController softwareKeyboardController0 = this.c;
        if(softwareKeyboardController0 != null) {
            softwareKeyboardController0.show();
        }
        return Unit.INSTANCE;
    }
}

