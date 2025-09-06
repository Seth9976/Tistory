package com.kakao.kandinsky.border;

import a5.b;
import android.content.Context;
import com.kakao.kandinsky.core.kdphoto.Border;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class a extends Lambda implements Function1 {
    public final Context w;
    public final ImmutableList x;

    public a(Context context0, ImmutableList immutableList0) {
        this.w = context0;
        this.x = immutableList0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s;
        int v = ((Number)object0).intValue();
        Context context0 = this.w;
        if(v == 0) {
            s = context0.getString(string.border_item_name_origin);
        }
        else {
            Border border0 = (Border)CollectionsKt___CollectionsKt.getOrNull(this.x, v - 1);
            Integer integer0 = border0 == null ? null : border0.getIndex();
            String s1 = context0.getString(string.border_item_name);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            if(integer0 == null) {
                integer0 = "";
            }
            s = b.f(1, s1, "format(...)", new Object[]{integer0});
        }
        Intrinsics.checkNotNull(s);
        return s;
    }
}

