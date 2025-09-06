package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public static final g1 a;

    static {
        g1.a = new g1();
    }

    public g1() {
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
            ComposerKt.traceEventStart(-1556603504, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.ComposableSingletons$BlogSwitchBottomSheetKt.lambda-9.<anonymous> (BlogSwitchBottomSheet.kt:504)");
        }
        BlogSwitchState blogSwitchState0 = BlogSwitchBottomSheetKt.a(null, null, null, CollectionsKt__CollectionsKt.emptyList(), 7);
        BlogSwitchBottomSheetKt.a(BlogSwitchType.QUICK, blogSwitchState0, ((Composer)object0), 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

