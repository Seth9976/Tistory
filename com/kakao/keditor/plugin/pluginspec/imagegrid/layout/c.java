package com.kakao.keditor.plugin.pluginspec.imagegrid.layout;

import android.view.View.OnLongClickListener;
import android.view.View;

public final class c implements View.OnLongClickListener {
    public final DragAndDropManager a;
    public final View b;

    public c(DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0, View view0) {
        this.a = autoTemplateLayout$LayoutManager$DragAndDropManager0;
        this.b = view0;
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        return DragAndDropManager.b(this.a, this.b, view0);
    }
}

