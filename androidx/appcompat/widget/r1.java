package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class r1 {
    public static final Field a;

    static {
        Field field0 = null;
        try {
            field0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field0.setAccessible(true);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            noSuchFieldException0.printStackTrace();
        }
        r1.a = field0;
    }
}

