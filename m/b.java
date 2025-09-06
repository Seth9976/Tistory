package m;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import java.lang.reflect.Method;

public final class b implements MenuItem.OnMenuItemClickListener {
    public Object a;
    public Method b;
    public static final Class[] c;

    static {
        b.c = new Class[]{MenuItem.class};
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        try {
            Method method0 = this.b;
            Class class0 = method0.getReturnType();
            Object object0 = this.a;
            if(class0 == Boolean.TYPE) {
                return ((Boolean)method0.invoke(object0, menuItem0)).booleanValue();
            }
            method0.invoke(object0, menuItem0);
            return true;
        }
        catch(Exception exception0) {
        }
        throw new RuntimeException(exception0);
    }
}

