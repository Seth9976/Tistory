package com.kakao.kphotopicker;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/kakao/kphotopicker/PickerFragment$initViews$5$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "", "position", "getSpanSize", "(I)I", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PickerFragment.initViews.5.1.1 extends SpanSizeLookup {
    public final RecyclerView e;
    public final int f;

    public PickerFragment.initViews.5.1.1(RecyclerView recyclerView0, int v) {
        this.e = recyclerView0;
        this.f = v;
        super();
    }

    @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
    public int getSpanSize(int v) {
        Adapter recyclerView$Adapter0 = this.e.getAdapter();
        if(recyclerView$Adapter0 instanceof ConcatAdapter) {
            int v1 = ((ConcatAdapter)recyclerView$Adapter0).getItemCount();
            return v >= ((ConcatAdapter)recyclerView$Adapter0).getItemCount() || v1 - 2 > v ? 1 : this.f;
        }
        return 1;
    }
}

