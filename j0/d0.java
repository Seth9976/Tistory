package j0;

import aa.d;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.functions.Function2;

public final class d0 implements TextFieldDecorator {
    public static final d0 a;

    static {
        d0.a = new d0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1669748801);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1669748801, v1, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:488)");
            }
            function20.invoke(composer1, ((int)(v1 & 14)));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(this, function20, v, 12));
        }
    }
}

