package com.kakao.tistory.presentation;

import com.kakao.keditor.KeditorBuilder;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.Loader;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final Loader a;
    public final List b;
    public final String c;
    public final GrammarChecker d;

    public u(Loader loader0, List list0, String s, GrammarChecker grammarChecker0) {
        this.a = loader0;
        this.b = list0;
        this.c = s;
        this.d = grammarChecker0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KeditorBuilder)object0), "$this$keditor");
        ((KeditorBuilder)object0).config(r.a);
        ((KeditorBuilder)object0).itemSpecList(new s(this.a));
        ((KeditorBuilder)object0).pluginSpecs(new t(this.b, this.c, this.d));
        return Unit.INSTANCE;
    }
}

