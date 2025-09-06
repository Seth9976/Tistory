package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public static final w w;

    static {
        w.w = new w(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Field field0 = InputMethodManager.class.getDeclaredField("mServedView");
            field0.setAccessible(true);
            Field field1 = InputMethodManager.class.getDeclaredField("mNextServedView");
            field1.setAccessible(true);
            Field field2 = InputMethodManager.class.getDeclaredField("mH");
            field2.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(field2, "hField");
            Intrinsics.checkNotNullExpressionValue(field0, "servedViewField");
            Intrinsics.checkNotNullExpressionValue(field1, "nextServedViewField");
            return new ValidCleaner(field2, field0, field1);
        }
        catch(NoSuchFieldException unused_ex) {
            return FailedInitialization.INSTANCE;
        }
    }
}

