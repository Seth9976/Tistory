package com.kakao.keditor.plugin.itemspec.table;

import android.graphics.drawable.Drawable;
import com.kakao.keditor.databinding.KeItemTableCellBinding;
import com.kakao.keditor.plugin.attrs.text.spans.KeImageSpan;

public final class a implements Runnable {
    public final TableItemSpec a;
    public final Drawable b;
    public final double c;
    public final KeItemTableCellBinding d;
    public final TableCellItem e;
    public final KeImageSpan f;
    public final KeImageSpan g;
    public final int h;
    public final int i;

    public a(TableItemSpec tableItemSpec0, Drawable drawable0, double f, KeItemTableCellBinding keItemTableCellBinding0, TableCellItem tableCellItem0, KeImageSpan keImageSpan0, KeImageSpan keImageSpan1, int v, int v1) {
        this.a = tableItemSpec0;
        this.b = drawable0;
        this.c = f;
        this.d = keItemTableCellBinding0;
        this.e = tableCellItem0;
        this.f = keImageSpan0;
        this.g = keImageSpan1;
        this.h = v;
        this.i = v1;
    }

    @Override
    public final void run() {
        com.kakao.keditor.plugin.itemspec.table.TableItemSpec.onItemBound.2.1.1.5.1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}

