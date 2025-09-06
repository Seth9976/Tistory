package com.kakao.tistory.presentation.screen.blog.main;

import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class j1 extends Lambda implements Function0 {
    public final EntryVisibilityType a;
    public final BlogMainViewModel b;
    public final String c;
    public final long d;

    public j1(EntryVisibilityType entryVisibilityType0, BlogMainViewModel blogMainViewModel0, String s, long v) {
        this.a = entryVisibilityType0;
        this.b = blogMainViewModel0;
        this.c = s;
        this.d = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickEntryVisibility(this.a);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.b), null, null, new i1(this.b, this.c, this.d, this.a, null), 3, null);
        return Unit.INSTANCE;
    }
}

