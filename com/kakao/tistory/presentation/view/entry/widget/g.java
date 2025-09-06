package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final CommentListModel a;
    public final Function1 b;
    public final MutableState c;

    public g(CommentListModel commentListModel0, Function1 function10, MutableState mutableState0) {
        this.a = commentListModel0;
        this.b = function10;
        this.c = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "it");
        if(((Boolean)this.a.getCheckTextValidation().invoke(((TextFieldValue)object0).getText())).booleanValue() && CommentBottomBarKt.access$CommentBottomBar$lambda$4$lambda$1(this.c)) {
            this.b.invoke(((TextFieldValue)object0));
        }
        return Unit.INSTANCE;
    }
}

