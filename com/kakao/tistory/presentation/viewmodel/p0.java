package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

public final class p0 extends Lambda implements Function0 {
    public final EditorViewModel a;
    public final Function0 b;

    public p0(EditorViewModel editorViewModel0, Function0 function00) {
        this.a = editorViewModel0;
        this.b = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.a), Dispatchers.getMain(), null, new o0(this.a, this.b, null), 2, null);
        return Unit.INSTANCE;
    }
}

