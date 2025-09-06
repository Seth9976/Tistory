package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import android.view.View.OnClickListener;
import android.view.View;

public final class b implements View.OnClickListener {
    public final int a;
    public final GrammarEditBottomView b;

    public b(GrammarEditBottomView grammarEditBottomView0, int v) {
        this.a = v;
        this.b = grammarEditBottomView0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            GrammarEditBottomView._init_$lambda$1(this.b, view0);
            return;
        }
        GrammarEditBottomView._init_$lambda$0(this.b, view0);
    }
}

