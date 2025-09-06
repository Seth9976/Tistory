package com.kakao.keditor.plugin.common;

import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;

public final class a implements View.OnClickListener {
    public final EditText a;
    public final EditText b;
    public final LinkFormDialog c;
    public final boolean d;
    public final boolean e;

    public a(EditText editText0, EditText editText1, LinkFormDialog linkFormDialog0, boolean z, boolean z1) {
        this.a = editText0;
        this.b = editText1;
        this.c = linkFormDialog0;
        this.d = z;
        this.e = z1;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        LinkFormDialog.onViewCreated$lambda$4(this.a, this.b, this.c, this.d, this.e, view0);
    }
}

