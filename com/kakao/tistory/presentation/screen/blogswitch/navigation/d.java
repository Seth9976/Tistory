package com.kakao.tistory.presentation.screen.blogswitch.navigation;

import android.os.Bundle;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function4 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;

    public d(Function0 function00, Function0 function01, Function0 function02) {
        this.a = function00;
        this.b = function01;
        this.c = function02;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        String s4;
        String s2;
        BlogSwitchType blogSwitchType0;
        String s;
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$bottomSheet");
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object1), "backstackEntry");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1470308220, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.navigation.blogSwitchBottomSheet.<anonymous> (BlogSwitchNavigation.kt:41)");
        }
        Bundle bundle0 = ((NavBackStackEntry)object1).getArguments();
        if(bundle0 == null) {
            s = "";
        }
        else {
            s = bundle0.getString("type");
            if(s == null) {
                s = "";
            }
        }
        try {
            blogSwitchType0 = BlogSwitchType.valueOf(s);
        }
        catch(IllegalArgumentException unused_ex) {
            blogSwitchType0 = BlogSwitchType.NORMAL;
        }
        Bundle bundle1 = ((NavBackStackEntry)object1).getArguments();
        if(bundle1 == null) {
            s2 = "";
        }
        else {
            String s1 = bundle1.getString("section");
            s2 = s1 == null ? "" : s1;
        }
        Bundle bundle2 = ((NavBackStackEntry)object1).getArguments();
        if(bundle2 == null) {
            s4 = "";
        }
        else {
            String s3 = bundle2.getString("page");
            s4 = s3 == null ? "" : s3;
        }
        BlogSwitchBottomSheetKt.BlogSwitchBottomSheet(s2, s4, blogSwitchType0, this.a, this.b, this.c, null, ((Composer)object2), 0, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

