package com.kakao.kandinsky.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final Function0 w;
    public final Function0 x;
    public final Function0 y;

    public b(Function0 function00, Function0 function01, Function0 function02) {
        this.w = function00;
        this.x = function01;
        this.y = function02;
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
            ComposerKt.traceEventStart(0x62549E20, v, -1, "com.kakao.kandinsky.text.TextMenu.<anonymous> (TextScreen.kt:100)");
        }
        MenuButtonKt.MenuIconTextButton(drawable.modify, StringResources_androidKt.stringResource(string.modify, ((Composer)object0), 0), this.w, ((Composer)object0), 0);
        MenuButtonKt.MenuIconTextButton(drawable.add, StringResources_androidKt.stringResource(string.add, ((Composer)object0), 0), this.x, ((Composer)object0), 0);
        MenuButtonKt.MenuIconTextButton(drawable.remove_all, StringResources_androidKt.stringResource(string.remove_all, ((Composer)object0), 0), this.y, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

