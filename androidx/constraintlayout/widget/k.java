package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

public final class k {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public k(Context context0, XmlPullParser xmlPullParser0) {
        this.a = NaNf;
        this.b = NaNf;
        this.c = NaNf;
        this.d = NaNf;
        this.e = -1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.Variant);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.Variant_constraints) {
                int v3 = typedArray0.getResourceId(v2, this.e);
                this.e = v3;
                String s = context0.getResources().getResourceTypeName(v3);
                context0.getResources().getResourceName(v3);
                "layout".equals(s);
            }
            else if(v2 == styleable.Variant_region_heightLessThan) {
                this.d = typedArray0.getDimension(v2, this.d);
            }
            else if(v2 == styleable.Variant_region_heightMoreThan) {
                this.b = typedArray0.getDimension(v2, this.b);
            }
            else if(v2 == styleable.Variant_region_widthLessThan) {
                this.c = typedArray0.getDimension(v2, this.c);
            }
            else if(v2 == styleable.Variant_region_widthMoreThan) {
                this.a = typedArray0.getDimension(v2, this.a);
            }
            else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArray0.recycle();
    }

    public final boolean a(float f, float f1) {
        if(!Float.isNaN(this.a) && f < this.a) {
            return false;
        }
        if(!Float.isNaN(this.b) && f1 < this.b) {
            return false;
        }
        return Float.isNaN(this.c) || f <= this.c ? Float.isNaN(this.d) || f1 <= this.d : false;
    }
}

