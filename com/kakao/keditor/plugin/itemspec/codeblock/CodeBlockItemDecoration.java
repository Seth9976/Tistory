package com.kakao.keditor.plugin.itemspec.codeblock;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.internal.KeditorAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CodeBlockItemDecoration extends ItemDecoration {
    @NotNull
    public static final CodeBlockItemDecoration INSTANCE;

    static {
        CodeBlockItemDecoration.INSTANCE = new CodeBlockItemDecoration();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NotNull Rect rect0, @NotNull View view0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        super.getItemOffsets(rect0, view0, recyclerView0, recyclerView$State0);
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        KeditorAdapter keditorAdapter0 = recyclerView$Adapter0 instanceof KeditorAdapter ? ((KeditorAdapter)recyclerView$Adapter0) : null;
        if(keditorAdapter0 == null) {
            throw new Exception("Missing KeditorAdapter");
        }
        int v = keditorAdapter0.lastItemIndex();
        int v1 = keditorAdapter0.itemIndexAt(recyclerView0.getChildAdapterPosition(view0));
        if(v1 != -1 && v1 <= v && ((KeditorItem)keditorAdapter0.get(v1)) instanceof CodeBlockItem) {
            rect0.top = UnitConversionKt.dp2pxRoundDown(10.0f);
            rect0.bottom = UnitConversionKt.dp2pxRoundDown(10.0f);
        }
    }
}

