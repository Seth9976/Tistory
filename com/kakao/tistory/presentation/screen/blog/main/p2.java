package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Block;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.UnBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p2 extends Lambda implements Function2 {
    public final BlogMainViewModel a;

    public p2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Number)object0).longValue();
        BlogMainViewModel blogMainViewModel0 = this.a;
        Block dialogType$Block0 = ((Boolean)object1).booleanValue() ? new Block(v) : new UnBlock(v);
        blogMainViewModel0.sendIntent(new ShowDialog(dialogType$Block0));
        return Unit.INSTANCE;
    }
}

