package com.kakao.kemoticon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kemoticon.widget.ContentDescriptionKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class b extends ViewHolder {
    public final a c;
    public final ImageView d;

    public b(a a0, ViewGroup viewGroup0, boolean z) {
        Intrinsics.checkNotNullParameter(a0, "kc");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        int v = z ? layout.kemoticon_keyboard_thumbnail_large_item : layout.kemoticon_keyboard_thumbnail_small_item;
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
        ContentDescriptionKt.applyAccessibilityInfo$default(view0, Reflection.getOrCreateKotlinClass(Button.class), null, null, null, 14, null);
        super(view0);
        this.c = a0;
        View view1 = this.itemView.findViewById(id.kemoticon_keyboard_thumbnail);
        Intrinsics.checkNotNullExpressionValue(view1, "findViewById(...)");
        this.d = (ImageView)view1;
    }
}

