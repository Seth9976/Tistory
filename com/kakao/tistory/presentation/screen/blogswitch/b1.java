package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function2 {
    public static final b1 a;

    static {
        b1.a = new b1();
    }

    public b1() {
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
            ComposerKt.traceEventStart(365202872, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.ComposableSingletons$BlogSwitchBottomSheetKt.lambda-4.<anonymous> (BlogSwitchBottomSheet.kt:433)");
        }
        BlogSwitchState blogSwitchState0 = BlogSwitchBottomSheetKt.a(BlogSwitchBottomSheetKt.b, BlogSwitchBottomSheetKt.c, CollectionsKt__CollectionsKt.emptyList(), null, 8);
        BlogSwitchBottomSheetKt.a(BlogSwitchType.NORMAL, blogSwitchState0, ((Composer)object0), 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

