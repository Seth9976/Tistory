package androidx.core.view;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class n1 {
    public static final Field a;
    public static final Field b;
    public static final Field c;
    public static final boolean d;

    static {
        try {
            Field field0 = View.class.getDeclaredField("mAttachInfo");
            n1.a = field0;
            field0.setAccessible(true);
            Class class0 = Class.forName("android.view.View$AttachInfo");
            Field field1 = class0.getDeclaredField("mStableInsets");
            n1.b = field1;
            field1.setAccessible(true);
            Field field2 = class0.getDeclaredField("mContentInsets");
            n1.c = field2;
            field2.setAccessible(true);
            n1.d = true;
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
        }
    }
}

