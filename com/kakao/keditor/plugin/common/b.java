package com.kakao.keditor.plugin.common;

import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;

public final class b implements DialogInterface.OnShowListener {
    public final LinkFormDialog a;

    public b(LinkFormDialog linkFormDialog0) {
        this.a = linkFormDialog0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        LinkFormDialog.onCreateView$lambda$0(this.a, dialogInterface0);
    }
}

