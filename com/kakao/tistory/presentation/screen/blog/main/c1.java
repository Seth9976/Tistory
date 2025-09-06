package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Delete;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;
    public final String b;
    public final long c;

    public c1(BlogMainViewModel blogMainViewModel0, String s, long v) {
        this.a = blogMainViewModel0;
        this.b = s;
        this.c = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickEntryDelete();
        ShowDialog blogMainIntent$ShowDialog0 = new ShowDialog(new Delete(this.b, this.c));
        this.a.sendIntent(blogMainIntent$ShowDialog0);
        return Unit.INSTANCE;
    }
}

