package com.kakao.kemoticon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kemoticon_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonKeyboardKt {
    public static final View access$inflate(ViewGroup viewGroup0, int v, boolean z) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, z);
        Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
        return view0;
    }
}

