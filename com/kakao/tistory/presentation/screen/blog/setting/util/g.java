package com.kakao.tistory.presentation.screen.blog.setting.util;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final Function1 a;
    public final Function0 b;

    public g(Function1 function10, Function0 function00) {
        this.a = function10;
        this.b = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(((ActivityResult)object0), "result");
        if(((ActivityResult)object0).getResultCode() == -1) {
            Intent intent0 = ((ActivityResult)object0).getData();
            if(intent0 == null) {
                unit0 = null;
            }
            else {
                Uri uri0 = intent0.getData();
                if(uri0 == null) {
                    unit0 = null;
                }
                else {
                    String s = uri0.getPath();
                    if(s == null) {
                        unit0 = null;
                    }
                    else {
                        this.a.invoke(s);
                        unit0 = Unit.INSTANCE;
                    }
                }
            }
            if(unit0 == null) {
                this.b.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

