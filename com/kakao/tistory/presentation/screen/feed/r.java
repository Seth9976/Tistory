package com.kakao.tistory.presentation.screen.feed;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public final Context a;

    public r(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryItem)object0), "it");
        FragmentActivity fragmentActivity0 = this.a instanceof FragmentActivity ? ((FragmentActivity)this.a) : null;
        if(fragmentActivity0 != null) {
            NavigatorExtensionKt.goToEntryView$default(fragmentActivity0, ((EntryItem)object0), false, null, 6, null);
        }
        return Unit.INSTANCE;
    }
}

