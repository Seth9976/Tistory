package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

public final class e {
    public final int a;
    public final ArrayList b;
    public final int c;
    public final ConstraintSet d;

    public e(Context context0, XmlResourceParser xmlResourceParser0) {
        this.b = new ArrayList();
        this.c = -1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), styleable.State);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.State_android_id) {
                this.a = typedArray0.getResourceId(v2, this.a);
            }
            else if(v2 == styleable.State_constraints) {
                int v3 = typedArray0.getResourceId(v2, this.c);
                this.c = v3;
                String s = context0.getResources().getResourceTypeName(v3);
                context0.getResources().getResourceName(v3);
                if("layout".equals(s)) {
                    ConstraintSet constraintSet0 = new ConstraintSet();
                    this.d = constraintSet0;
                    constraintSet0.clone(context0, v3);
                }
            }
        }
        typedArray0.recycle();
    }

    public final int a(float f, float f1) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            if(((f)arrayList0.get(v)).a(f, f1)) {
                return v;
            }
        }
        return -1;
    }
}

