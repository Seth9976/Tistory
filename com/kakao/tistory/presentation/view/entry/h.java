package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final EntryViewActivity a;

    public h(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4585977B, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.Content.<anonymous> (EntryViewActivity.kt:151)");
        }
        if(!((Boolean)LiveDataAdapterKt.observeAsState(EntryViewActivity.access$getEntryViewModel(this.a).isRestrictedEntry(), Boolean.FALSE, ((Composer)object0), 56).getValue()).booleanValue()) {
            this.a.BottomBar(((Composer)object0), 8);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

