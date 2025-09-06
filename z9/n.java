package z9;

import androidx.compose.material3.s9;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.crop.R.drawable;
import com.kakao.kandinsky.crop.R.string;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final Function1 w;
    public final Function1 x;

    public n(Function1 function10, Function1 function11) {
        this.w = function10;
        this.x = function11;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1426218020, v, -1, "com.kakao.kandinsky.crop.ui.RotateMenu.<anonymous> (RotateMenu.kt:16)");
        }
        int v1 = drawable.rotate_90;
        String s = StringResources_androidKt.stringResource(string.crop_rotate_90, composer0, 0);
        composer0.startReplaceGroup(13320805);
        Function1 function10 = this.w;
        boolean z = composer0.changed(function10);
        s9 s90 = composer0.rememberedValue();
        if(z || s90 == Composer.Companion.getEmpty()) {
            s90 = new s9(function10, 3);
            composer0.updateRememberedValue(s90);
        }
        composer0.endReplaceGroup();
        MenuButtonKt.MenuIconTextButton(v1, s, s90, composer0, 0);
        int v2 = drawable.horizontal_flip;
        String s1 = StringResources_androidKt.stringResource(string.crop_horizontal_flip, composer0, 0);
        composer0.startReplaceGroup(13321025);
        Function1 function11 = this.x;
        boolean z1 = composer0.changed(function11);
        s9 s91 = composer0.rememberedValue();
        if(z1 || s91 == Composer.Companion.getEmpty()) {
            s91 = new s9(function11, 4);
            composer0.updateRememberedValue(s91);
        }
        composer0.endReplaceGroup();
        MenuButtonKt.MenuIconTextButton(v2, s1, s91, composer0, 0);
        int v3 = drawable.vertical_flip;
        String s2 = StringResources_androidKt.stringResource(string.crop_vertical_flip, composer0, 0);
        composer0.startReplaceGroup(0xCB441A);
        boolean z2 = composer0.changed(function11);
        s9 s92 = composer0.rememberedValue();
        if(z2 || s92 == Composer.Companion.getEmpty()) {
            s92 = new s9(function11, 5);
            composer0.updateRememberedValue(s92);
        }
        composer0.endReplaceGroup();
        MenuButtonKt.MenuIconTextButton(v3, s2, s92, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

