package com.kakao.tistory.presentation.view.editor;

import android.view.KeyEvent;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g5 extends Lambda implements Function1 {
    public final Function0 a;
    public final State b;

    public g5(Function0 function00, State state0) {
        this.a = function00;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(keyEvent0, "it");
        switch(keyEvent0.getKeyCode()) {
            case 66: {
                EditorTagFragment.access$TagInput$lambda$8(this.b).invoke();
                return true;
            }
            case 67: {
                return Boolean.valueOf(((Boolean)this.a.invoke()).booleanValue());
            }
            default: {
                return false;
            }
        }
    }
}

