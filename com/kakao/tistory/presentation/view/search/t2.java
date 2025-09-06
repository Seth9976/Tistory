package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t2 extends Lambda implements Function1 {
    public final Function1 a;
    public final MutableState b;
    public final MutableState c;

    public t2(Function1 function10, MutableState mutableState0, MutableState mutableState1) {
        this.a = function10;
        this.b = mutableState0;
        this.c = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "newTextFieldValueState");
        SearchToolbarKt.access$SearchTextField$lambda$6(this.b, ((TextFieldValue)object0));
        boolean z = Intrinsics.areEqual(SearchToolbarKt.access$SearchTextField$lambda$9(this.c), ((TextFieldValue)object0).getText());
        String s = ((TextFieldValue)object0).getText();
        SearchToolbarKt.access$SearchTextField$lambda$10(this.c, s);
        if(!z) {
            String s1 = ((TextFieldValue)object0).getText();
            this.a.invoke(s1);
        }
        return Unit.INSTANCE;
    }
}

