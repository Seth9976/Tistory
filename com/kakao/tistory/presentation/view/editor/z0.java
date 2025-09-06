package com.kakao.tistory.presentation.view.editor;

import android.widget.ImageView;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.RunIconClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function1 {
    public static final z0 a;

    static {
        z0.a = new z0();
    }

    public z0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ImageView)object0), "it");
        RunIconClick pluginSpecRequest$RunIconClick0 = new RunIconClick("grammar_check", 0, 2, null);
        KeEvent.INSTANCE.postInScope(pluginSpecRequest$RunIconClick0);
        return Unit.INSTANCE;
    }
}

