package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function2 {
    public static final v0 a;

    static {
        v0.a = new v0();
    }

    public v0() {
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
            ComposerKt.traceEventStart(0x2F700678, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.ComposableSingletons$BlogSwitchBottomSheetKt.lambda-10.<anonymous> (BlogSwitchBottomSheet.kt:517)");
        }
        BlogSwitchState blogSwitchState0 = BlogSwitchBottomSheetKt.access$createMockState(BlogSwitchBottomSheetKt.b, BlogSwitchBottomSheetKt.c, CollectionsKt__CollectionsKt.emptyList(), BlogSwitchBottomSheetKt.e);
        BlogSwitchBottomSheetKt.a(BlogSwitchType.QUICK, blogSwitchState0, ((Composer)object0), 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

