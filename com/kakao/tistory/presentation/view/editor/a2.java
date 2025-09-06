package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a2 extends Lambda implements Function3 {
    public final Function0 a;
    public final String b;

    public a2(Function0 function00, String s) {
        this.a = function00;
        this.b = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$ItemContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055596505, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.ChallengeTagButton.<anonymous> (EditorSettingFragment.kt:406)");
        }
        ButtonColors roundButtonDefaults$ButtonColors0 = new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 56, null);
        Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-280266037, true, new z1(this.b), ((Composer)object1), 54);
        RoundButtonKt.RoundButton(this.a, this.b, roundButtonDefaults$ButtonColors0, modifier0, null, null, false, null, null, composableLambda0, ((Composer)object1), 0x30000D80, 0x1F0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

