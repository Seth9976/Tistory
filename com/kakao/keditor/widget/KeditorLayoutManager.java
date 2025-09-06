package com.kakao.keditor.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001A\u00020\u0007J0\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006H\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/widget/KeditorLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onChangedFocus", "", "", "requestChildRectangleOnScreen", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "immediate", "focusedChildVisible", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorLayoutManager extends LinearLayoutManager {
    private boolean onChangedFocus;

    public KeditorLayoutManager(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
    }

    public final void onChangedFocus() {
        this.onChangedFocus = true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean requestChildRectangleOnScreen(@NotNull RecyclerView recyclerView0, @NotNull View view0, @NotNull Rect rect0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(rect0, "rect");
        if(this.onChangedFocus) {
            this.onChangedFocus = false;
            return false;
        }
        return super.requestChildRectangleOnScreen(recyclerView0, view0, rect0, z, z1);
    }
}

