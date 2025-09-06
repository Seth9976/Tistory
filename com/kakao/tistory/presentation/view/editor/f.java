package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SwipeableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class f extends Lambda implements Function1 {
    public final CoroutineScope a;
    public final SwipeableState b;
    public final SoftwareKeyboardController c;
    public final LazyListState d;

    public f(CoroutineScope coroutineScope0, SwipeableState swipeableState0, SoftwareKeyboardController softwareKeyboardController0, LazyListState lazyListState0) {
        this.a = coroutineScope0;
        this.b = swipeableState0;
        this.c = softwareKeyboardController0;
        this.d = lazyListState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        e e0 = new e(((Boolean)object0), this.b, this.c, this.d, null);
        BuildersKt.launch$default(this.a, null, null, e0, 3, null);
        return Unit.INSTANCE;
    }
}

