package androidx.appcompat.app;

import a5.b;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class k0 implements View.OnClickListener {
    public final View a;
    public final String b;
    public Method c;
    public Context d;

    public k0(View view0, String s) {
        this.a = view0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@NonNull View view0) {
        if(this.c == null) {
            View view1 = this.a;
            Context context0 = view1.getContext();
            while(true) {
                String s = this.b;
                if(context0 != null) {
                    try {
                        if(!context0.isRestricted()) {
                            Method method0 = context0.getClass().getMethod(s, View.class);
                            if(method0 != null) {
                                this.c = method0;
                                this.d = context0;
                                break;
                            }
                        }
                    }
                    catch(NoSuchMethodException unused_ex) {
                    }
                    if(context0 instanceof ContextWrapper) {
                        context0 = ((ContextWrapper)context0).getBaseContext();
                        continue;
                    }
                    context0 = null;
                    continue;
                }
                int v = view1.getId();
                String s1 = v == -1 ? "" : " with id \'" + view1.getContext().getResources().getResourceEntryName(v) + "\'";
                StringBuilder stringBuilder0 = b.v("Could not find method ", s, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                stringBuilder0.append(view1.getClass());
                stringBuilder0.append(s1);
                throw new IllegalStateException(stringBuilder0.toString());
            }
        }
        try {
            this.c.invoke(this.d, view0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException0);
        }
    }
}

