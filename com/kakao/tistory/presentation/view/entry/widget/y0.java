package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function0 {
    public final CommentModifyModel a;
    public final TextFieldValue b;

    public y0(CommentModifyModel commentModifyModel0, TextFieldValue textFieldValue0) {
        this.a = commentModifyModel0;
        this.b = textFieldValue0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Boolean boolean0 = Boolean.valueOf(!Intrinsics.areEqual(this.b.getText(), ""));
        this.a.getOnClickCancel().invoke(boolean0);
        return Unit.INSTANCE;
    }
}

