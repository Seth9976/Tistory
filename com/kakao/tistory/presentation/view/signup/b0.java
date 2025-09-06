package com.kakao.tistory.presentation.view.signup;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function3 {
    public final List a;
    public final Function1 b;

    public b0(List list0, Function1 function10) {
        this.a = list0;
        this.b = function10;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((FlowRowScope)object0), "$this$FlowRow");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x21D2F3DE, v, -1, "com.kakao.tistory.presentation.view.signup.RecommendedBlogName.<anonymous>.<anonymous> (SignUpScreen.kt:292)");
        }
        Function1 function10 = this.b;
        for(Object object3: this.a) {
            SignUpScreenKt.access$BlogNameSuggestion(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 6.0f, 6.0f, 3, null), ((RecommendedBlogNameInfo)object3), function10, ((Composer)object1), 70, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

