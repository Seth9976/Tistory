package com.kakao.keditor.plugin.itemspec.textlist;

import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import android.widget.LinearLayout;
import com.kakao.keditor.databinding.KeItemListContentBinding;

public final class a implements View.OnKeyListener {
    public final KeItemListContentBinding a;
    public final TextListItem b;
    public final LinearLayout c;
    public final TextListItemSpec d;
    public final View e;

    public a(KeItemListContentBinding keItemListContentBinding0, TextListItem textListItem0, LinearLayout linearLayout0, TextListItemSpec textListItemSpec0, View view0) {
        this.a = keItemListContentBinding0;
        this.b = textListItem0;
        this.c = linearLayout0;
        this.d = textListItemSpec0;
        this.e = view0;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        return TextListItemSpec.addItemView$lambda$15$lambda$14$lambda$13(this.a, this.b, this.c, this.d, this.e, view0, v, keyEvent0);
    }
}

