package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function2 {
    public static final z0 a;

    static {
        z0.a = new z0();
    }

    public z0() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7CB0B3A7, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.ComposableSingletons$BlogSwitchBottomSheetKt.lambda-2.<anonymous> (BlogSwitchBottomSheet.kt:409)");
        }
        BlogSwitchState blogSwitchState0 = BlogSwitchBottomSheetKt.a(null, null, null, null, 15);
        BlogSwitchBottomSheetKt.a(BlogSwitchType.NORMAL, blogSwitchState0, ((Composer)object0), 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

