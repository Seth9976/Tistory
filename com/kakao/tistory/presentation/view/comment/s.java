package com.kakao.tistory.presentation.view.comment;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final Pin a;
    public final SoftwareKeyboardController b;

    public s(Pin commentItemUIModel$Pin0, SoftwareKeyboardController softwareKeyboardController0) {
        this.a = commentItemUIModel$Pin0;
        this.b = softwareKeyboardController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnClickReply().invoke();
        SoftwareKeyboardController softwareKeyboardController0 = this.b;
        if(softwareKeyboardController0 != null) {
            softwareKeyboardController0.hide();
        }
        return Unit.INSTANCE;
    }
}

