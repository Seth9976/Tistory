package com.kakao.keditor.plugin.itemspec.paragraph;

import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import com.kakao.keditor.databinding.KeItemParagraphBinding;
import com.kakao.keditor.widget.KeditorEditText;

public final class a implements View.OnKeyListener {
    public final KeditorEditText a;
    public final ParagraphItemSpec b;
    public final KeItemParagraphBinding c;

    public a(ParagraphItemSpec paragraphItemSpec0, KeItemParagraphBinding keItemParagraphBinding0, KeditorEditText keditorEditText0) {
        this.a = keditorEditText0;
        this.b = paragraphItemSpec0;
        this.c = keItemParagraphBinding0;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        return ParagraphItemSpec.onItemBound$lambda$5$lambda$4(this.a, this.b, this.c, view0, v, keyEvent0);
    }
}

