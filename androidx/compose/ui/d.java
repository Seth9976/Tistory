package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

public final class d extends Lambda implements Function2 {
    public final Composer w;

    public d(Composer composer0) {
        this.w = composer0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Modifier modifier0 = (Element)object1;
        if(modifier0 instanceof b) {
            Intrinsics.checkNotNull(((b)modifier0).c, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            Modifier modifier1 = (Modifier)((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(((b)modifier0).c, 3)).invoke(Modifier.Companion, this.w, 0);
            modifier0 = ComposedModifierKt.a(this.w, modifier1);
        }
        return ((Modifier)object0).then(modifier0);
    }
}

