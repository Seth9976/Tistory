package n0;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class c0 extends FunctionReferenceImpl implements Function2 {
    public static final c0 a;

    static {
        c0.a = new c0(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return Boolean.valueOf(((TextFieldCharSequence)object0).contentEquals(((CharSequence)object1)));
    }
}

