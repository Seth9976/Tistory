package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final SoftwareKeyboardController a;
    public final Function1 b;
    public final CommentItem c;
    public final TextFieldValue d;
    public final MutableState e;

    public w(SoftwareKeyboardController softwareKeyboardController0, Function1 function10, CommentItem commentItemType$CommentItem0, TextFieldValue textFieldValue0, MutableState mutableState0) {
        this.a = softwareKeyboardController0;
        this.b = function10;
        this.c = commentItemType$CommentItem0;
        this.d = textFieldValue0;
        this.e = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SoftwareKeyboardController softwareKeyboardController0 = this.a;
        if(softwareKeyboardController0 != null) {
            softwareKeyboardController0.hide();
        }
        this.b.invoke(new CommentCompletion(null, null, (this.c == null ? null : this.c.getId()), this.d.getText(), CommentEditFieldKt.access$CommentModifyEditField$lambda$11(this.e), 3, null));
        return Unit.INSTANCE;
    }
}

