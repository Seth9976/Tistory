package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;

public abstract class g0 extends LinearLayoutManager {
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        f0 f00 = new f0(recyclerView0.getContext());  // 初始化器: Landroidx/recyclerview/widget/LinearSmoothScroller;-><init>(Landroid/content/Context;)V
        f00.setTargetPosition(v);
        this.startSmoothScroll(f00);
    }
}

