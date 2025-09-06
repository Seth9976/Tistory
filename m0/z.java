package m0;

import android.view.View;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class z extends FunctionReferenceImpl implements Function1 {
    public static final z a;

    static {
        z.a = new z(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new InputMethodManagerImpl(((View)object0));
    }
}

