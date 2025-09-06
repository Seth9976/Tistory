package com.kakao.kandinsky.launcher;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"kandinsky", "", "Landroid/app/Application;", "init", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/launcher/KandinskyBuilder;", "Lkotlin/ExtensionFunctionType;", "kandinsky_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KandinskyBuilderKt {
    public static final void kandinsky(Application application0, Function1 function10) {
        Intrinsics.checkNotNullParameter(application0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "init");
        KandinskyBuilder kandinskyBuilder0 = new KandinskyBuilder();
        function10.invoke(kandinskyBuilder0);
        kandinskyBuilder0.build(application0);
    }
}

