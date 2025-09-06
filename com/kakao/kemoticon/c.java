package com.kakao.kemoticon;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import ib.e;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;

public final class c extends PagerAdapter {
    public final a c;
    public final List d;

    public c(a a0) {
        Intrinsics.checkNotNullParameter(a0, "kc");
        super();
        this.c = a0;
        a0.getClass();
        this.d = CollectionsKt___CollectionsKt.plus(k.listOf(".history"), a0.c);
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        Intrinsics.checkNotNullParameter(object0, "obj");
        viewGroup0.removeView(((View)object0));
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.d.size();
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        int v1 = layout.kemoticon_keyboard_page_item;
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v1, viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
        TextView textView0 = (TextView)view0.findViewById(id.kemoticon_keyboard_empty);
        textView0.setVisibility(8);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(id.kemoticon_keyboard_thumbnails);
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        Intrinsics.checkNotNull(recyclerView$LayoutManager0, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        Resources resources0 = recyclerView0.getContext().getResources();
        String s = (String)this.d.get(v);
        ((GridLayoutManager)recyclerView$LayoutManager0).setSpanCount(resources0.getInteger((this.c.a(s) ? integer.ke_emoticon_span_count_large : integer.ke_emoticon_span_count_small)));
        recyclerView0.setAdapter(new e(this.c, ((String)this.d.get(v)), new fg.c(textView0, 8)));
        viewGroup0.addView(view0);
        return view0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view0, Object object0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(object0, "obj");
        return Intrinsics.areEqual(view0, object0);
    }
}

