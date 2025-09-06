package com.kakao.keditor.plugin.pluginspec.grammarcheck;

public final class a implements Runnable {
    public final GrammarCheckActivity a;
    public final GrammarRequest b;

    public a(GrammarCheckActivity grammarCheckActivity0, GrammarRequest grammarRequest0) {
        this.a = grammarCheckActivity0;
        this.b = grammarRequest0;
    }

    @Override
    public final void run() {
        com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckActivity.initViewModel.2.invoke$lambda$1(this.a, this.b);
    }
}

