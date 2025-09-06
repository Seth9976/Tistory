package com.kakao.kemoticon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.Intrinsics;

public final class d extends ViewHolder {
    public final a c;
    public final ImageView d;

    public d(a a0, ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(a0, "kc");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        int v = layout.kemoticon_keyboard_tab_item;
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
        super(view0);
        this.c = a0;
        View view1 = this.itemView.findViewById(id.kemoticon_keyboard_tab_icon);
        Intrinsics.checkNotNullExpressionValue(view1, "findViewById(...)");
        this.d = (ImageView)view1;
    }
}

