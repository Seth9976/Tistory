package com.kakao.keditor.plugin.pluginspec.imagegrid.layout;

import android.view.DragEvent;
import android.view.View.OnDragListener;
import android.view.View;

public final class b implements View.OnDragListener {
    public final DragAndDropManager a;

    public b(DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0) {
        this.a = autoTemplateLayout$LayoutManager$DragAndDropManager0;
    }

    @Override  // android.view.View$OnDragListener
    public final boolean onDrag(View view0, DragEvent dragEvent0) {
        return DragAndDropManager.a(this.a, view0, dragEvent0);
    }
}

