package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit.Companion;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function1 {
    public static final j0 w;

    static {
        j0.w = new j0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextUnit textUnit1;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        Companion textUnit$Companion0 = TextUnit.Companion;
        Saver saver0 = SaversKt.getSaver(textUnit$Companion0);
        TextUnit textUnit0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            textUnit1 = null;
        }
        else if(object1 != null) {
            textUnit1 = (TextUnit)saver0.restore(object1);
        }
        else {
            textUnit1 = null;
        }
        Intrinsics.checkNotNull(textUnit1);
        long v = textUnit1.unbox-impl();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(textUnit$Companion0);
        if((!Intrinsics.areEqual(object2, Boolean.FALSE) || saver1 instanceof NonNullValueClassSaver) && object2 != null) {
            textUnit0 = (TextUnit)saver1.restore(object2);
        }
        Intrinsics.checkNotNull(textUnit0);
        return new TextIndent(v, textUnit0.unbox-impl(), null);
    }
}

