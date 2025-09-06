package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public static final d0 w;

    static {
        d0.w = new d0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextUnit textUnit0;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        TextAlign textAlign0 = object1 == null ? null : ((TextAlign)object1);
        Intrinsics.checkNotNull(textAlign0);
        int v = textAlign0.unbox-impl();
        Object object2 = ((List)object0).get(1);
        TextDirection textDirection0 = object2 == null ? null : ((TextDirection)object2);
        Intrinsics.checkNotNull(textDirection0);
        int v1 = textDirection0.unbox-impl();
        Object object3 = ((List)object0).get(2);
        Saver saver0 = SaversKt.getSaver(TextUnit.Companion);
        if(Intrinsics.areEqual(object3, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            textUnit0 = null;
        }
        else if(object3 != null) {
            textUnit0 = (TextUnit)saver0.restore(object3);
        }
        else {
            textUnit0 = null;
        }
        Intrinsics.checkNotNull(textUnit0);
        long v2 = textUnit0.unbox-impl();
        Object object4 = ((List)object0).get(3);
        Saver saver1 = SaversKt.getSaver(TextIndent.Companion);
        if(Intrinsics.areEqual(object4, Boolean.FALSE) && !(saver1 instanceof NonNullValueClassSaver)) {
            return new ParagraphStyle(v, v1, v2, null, null, null, 0, 0, null, 0x1F0, null);
        }
        return object4 == null ? new ParagraphStyle(v, v1, v2, null, null, null, 0, 0, null, 0x1F0, null) : new ParagraphStyle(v, v1, v2, ((TextIndent)saver1.restore(object4)), null, null, 0, 0, null, 0x1F0, null);
    }
}

