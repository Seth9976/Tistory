package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.view.View.OnClickListener;
import android.view.View;

public final class a implements View.OnClickListener {
    public final int a;
    public final ImageGridCell b;
    public final int c;

    public a(ImageGridCell imageGridAdapter$ImageGridCell0, int v, int v1) {
        this.a = v1;
        this.b = imageGridAdapter$ImageGridCell0;
        this.c = v;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            ImageGridCell.bind$lambda$3$lambda$2(this.b, this.c, view0);
            return;
        }
        ImageGridCell.bind$lambda$3$lambda$1(this.b, this.c, view0);
    }
}

