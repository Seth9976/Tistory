package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class i extends Lambda implements Function1 {
    public final CommentListModel a;
    public final Function1 b;
    public final CoroutineScope c;
    public final MutableState d;

    public i(CommentListModel commentListModel0, Function1 function10, CoroutineScope coroutineScope0, MutableState mutableState0) {
        this.a = commentListModel0;
        this.b = function10;
        this.c = coroutineScope0;
        this.d = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CommentCompletion)object0), "it");
        if(((Boolean)this.a.getCheckTextValidation().invoke(((CommentCompletion)object0).getText())).booleanValue()) {
            CommentBottomBarKt.access$CommentBottomBar$lambda$4$lambda$2(this.d, false);
            TextFieldValue textFieldValue0 = new TextFieldValue("", 0L, null, 6, null);
            this.b.invoke(textFieldValue0);
            this.a.getOnClickComplete().invoke(((CommentCompletion)object0));
            h h0 = new h(this.d, null);
            BuildersKt.launch$default(this.c, null, null, h0, 3, null);
        }
        return Unit.INSTANCE;
    }
}

