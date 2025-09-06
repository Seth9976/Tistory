package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public final TextFieldValue a;
    public final CommentModifyModel b;
    public final Function1 c;

    public a1(TextFieldValue textFieldValue0, CommentModifyModel commentModifyModel0, Function1 function10) {
        this.a = textFieldValue0;
        this.b = commentModifyModel0;
        this.c = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "it");
        if(this.a.getText().length() >= ((TextFieldValue)object0).getText().length()) {
            this.c.invoke(((TextFieldValue)object0));
        }
        else if(((Boolean)this.b.getCheckTextValidation().invoke(((TextFieldValue)object0).getText())).booleanValue()) {
            this.c.invoke(((TextFieldValue)object0));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

