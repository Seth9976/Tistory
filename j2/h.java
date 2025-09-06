package j2;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public static final h w;

    static {
        h.w = new h(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    public static TextFieldValue a(Object object0) {
        AnnotatedString annotatedString0;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.getAnnotatedStringSaver();
        TextRange textRange0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            annotatedString0 = null;
        }
        else if(object1 != null) {
            annotatedString0 = (AnnotatedString)saver0.restore(object1);
        }
        else {
            annotatedString0 = null;
        }
        Intrinsics.checkNotNull(annotatedString0);
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(TextRange.Companion);
        if((!Intrinsics.areEqual(object2, Boolean.FALSE) || saver1 instanceof NonNullValueClassSaver) && object2 != null) {
            textRange0 = (TextRange)saver1.restore(object2);
        }
        Intrinsics.checkNotNull(textRange0);
        return new TextFieldValue(annotatedString0, textRange0.unbox-impl(), null, 4, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return h.a(object0);
    }
}

