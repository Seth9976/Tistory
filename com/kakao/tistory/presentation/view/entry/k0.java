package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.MutableState;
import com.google.firebase.messaging.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function1 {
    public final EntryViewActivity a;
    public final MutableState b;

    public k0(EntryViewActivity entryViewActivity0, MutableState mutableState0) {
        this.a = entryViewActivity0;
        this.b = mutableState0;
        super(1);
    }

    public static final void a(boolean z, EntryViewActivity entryViewActivity0, MutableState mutableState0) {
        Intrinsics.checkNotNullParameter(entryViewActivity0, "this$0");
        Intrinsics.checkNotNullParameter(mutableState0, "$enabledScroll$delegate");
        if(z) {
            entryViewActivity0.hideAppBar();
        }
        EntryViewActivity.access$WebView$lambda$5(mutableState0, !z);
    }

    public final void a(boolean z) {
        p p0 = new p(z, this.a, this.b);
        this.a.runOnUiThread(p0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }
}

