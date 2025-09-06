package com.kakao.tistory.presentation.screen.revenue;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.item.Vendor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final Context a;
    public final State b;
    public final MutableState c;

    public x(Context context0, State state0, MutableState mutableState0) {
        this.a = context0;
        this.b = state0;
        this.c = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Vendor)object0), "it");
        RevenueScreenKt.access$RevenueScreen$lambda$6(this.b).getOnClickVendor().invoke(((Vendor)object0));
        String s = this.a.getString(((Vendor)object0).getTitle());
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        RevenueTiara.INSTANCE.trackClickVendor(s);
        RevenueScreenKt.access$RevenueScreen$lambda$4(this.c, false);
        return Unit.INSTANCE;
    }
}

