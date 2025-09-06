package androidx.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class v0 {
    public static Field a;
    public static boolean b;

    public void a(int v, View view0) {
        if(!v0.b) {
            try {
                Field field0 = View.class.getDeclaredField("mViewFlags");
                v0.a = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException unused_ex) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            v0.b = true;
        }
        Field field1 = v0.a;
        if(field1 != null) {
            try {
                int v1 = field1.getInt(view0);
                v0.a.setInt(view0, v | v1 & -13);
            }
            catch(IllegalAccessException unused_ex) {
            }
        }
    }
}

