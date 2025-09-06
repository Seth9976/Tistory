package com.kakao.tistory.presentation.view.entry.widget;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final TextFieldValue a;
    public final Function0 b;

    public d0(TextFieldValue textFieldValue0, Function0 function00) {
        this.a = textFieldValue0;
        this.b = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(keyEvent0, "it");
        if(Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x4300000000L) && TextRange.getStart-impl(this.a.getSelection-d9O1mEE()) == 0 && TextRange.getLength-impl(this.a.getSelection-d9O1mEE()) == 0) {
            this.b.invoke();
            return true;
        }
        return false;
    }
}

