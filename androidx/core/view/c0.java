package androidx.core.view;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;

public final class c0 {
    public final int a;
    public final Class b;
    public final int c;
    public final int d;
    public final int e;

    public c0(int v, Class class0, int v1, int v2, int v3) {
        this.e = v3;
        super();
        this.a = v;
        this.b = class0;
        this.d = v1;
        this.c = v2;
    }

    public final void a(View view0, Object object0) {
        int v1;
        Object object1;
        if(Build.VERSION.SDK_INT >= this.c) {
            switch(this.e) {
                case 0: {
                    l0.j(view0, ((Boolean)object0).booleanValue());
                    return;
                }
                case 1: {
                    l0.h(view0, ((CharSequence)object0));
                    return;
                }
                case 2: {
                    n0.f(view0, ((CharSequence)object0));
                    return;
                }
                default: {
                    l0.g(view0, ((Boolean)object0).booleanValue());
                    return;
                }
            }
        }
        if(Build.VERSION.SDK_INT >= this.c) {
            switch(this.e) {
                case 0: {
                    object1 = Boolean.valueOf(l0.d(view0));
                    break;
                }
                case 1: {
                    object1 = l0.b(view0);
                    break;
                }
                case 2: {
                    object1 = n0.b(view0);
                    break;
                }
                default: {
                    object1 = Boolean.valueOf(l0.c(view0));
                }
            }
        }
        else {
            object1 = view0.getTag(this.a);
            if(!this.b.isInstance(object1)) {
                object1 = null;
            }
        }
        int v = 0;
        switch(this.e) {
            case 0: {
                if((((Boolean)object1) == null || !((Boolean)object1).booleanValue() ? 0 : 1) == (((Boolean)object0) == null || !((Boolean)object0).booleanValue() ? 0 : 1)) {
                    v = 1;
                }
                v1 = v ^ 1;
                break;
            }
            case 1: {
                v1 = !TextUtils.equals(((CharSequence)object1), ((CharSequence)object0));
                break;
            }
            case 2: {
                v1 = !TextUtils.equals(((CharSequence)object1), ((CharSequence)object0));
                break;
            }
            default: {
                if((((Boolean)object1) == null || !((Boolean)object1).booleanValue() ? 0 : 1) == (((Boolean)object0) == null || !((Boolean)object0).booleanValue() ? 0 : 1)) {
                    v = 1;
                }
                v1 = v ^ 1;
            }
        }
        if(v1 != 0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = ViewCompat.getAccessibilityDelegate(view0);
            if(accessibilityDelegateCompat0 == null) {
                accessibilityDelegateCompat0 = new AccessibilityDelegateCompat();
            }
            ViewCompat.setAccessibilityDelegate(view0, accessibilityDelegateCompat0);
            view0.setTag(this.a, object0);
            ViewCompat.d(this.d, view0);
        }
    }
}

