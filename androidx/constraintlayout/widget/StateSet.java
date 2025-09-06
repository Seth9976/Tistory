package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateSet {
    public static final String TAG = "ConstraintLayoutStates";
    public final int a;
    public final SparseArray b;

    public StateSet(Context context0, XmlPullParser xmlPullParser0) {
        this.a = -1;
        this.b = new SparseArray();
        new SparseArray();
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.StateSet);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.StateSet_defaultState) {
                this.a = typedArray0.getResourceId(v2, this.a);
            }
        }
        typedArray0.recycle();
        try {
            int v3 = xmlPullParser0.getEventType();
            j j0 = null;
            while(true) {
                switch(v3) {
                    case 0: {
                        xmlPullParser0.getName();
                        goto label_33;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlPullParser0.getName()) {
                            case "LayoutDescription": {
                                goto label_33;
                            }
                            case "State": {
                                j0 = new j(context0, xmlPullParser0);
                                this.b.put(j0.a, j0);
                                goto label_33;
                            }
                            case "StateSet": {
                                goto label_33;
                            }
                            case "Variant": {
                                k k0 = new k(context0, xmlPullParser0);
                                if(j0 != null) {
                                    j0.b.add(k0);
                                }
                                goto label_33;
                            }
                            default: {
                                goto label_33;
                            }
                        }
                    }
                    case 3: {
                        if("StateSet".equals(xmlPullParser0.getName())) {
                            return;
                        }
                    label_33:
                        v3 = xmlPullParser0.next();
                        break;
                    }
                    default: {
                        goto label_33;
                    }
                }
            }
            goto label_40;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_40;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_40:
        iOException0.printStackTrace();
    }

    public int convertToConstraintSet(int v, int v1, float f, float f1) {
        j j0 = (j)this.b.get(v1);
        if(j0 == null) {
            return v1;
        }
        ArrayList arrayList0 = j0.b;
        int v2 = j0.c;
        if(Float.compare(f, -1.0f) != 0 && f1 != -1.0f) {
            k k0 = null;
            for(Object object0: arrayList0) {
                k k1 = (k)object0;
                if(k1.a(f, f1)) {
                    if(v == k1.e) {
                        return v;
                    }
                    k0 = k1;
                }
            }
            return k0 == null ? v2 : k0.e;
        }
        if(v2 == v) {
            return v;
        }
        for(Object object1: arrayList0) {
            if(v == ((k)object1).e) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return v2;
    }

    public boolean needsToChange(int v, float f, float f1) {
        return -1 == v ? -1 != ((j)this.b.valueAt(0)).a(f, f1) : true;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener0) {
    }

    public int stateGetConstraintID(int v, int v1, int v2) {
        return this.updateConstraints(-1, v, ((float)v1), ((float)v2));
    }

    public int updateConstraints(int v, int v1, float f, float f1) {
        SparseArray sparseArray0 = this.b;
        if(v == v1) {
            j j0 = v1 == -1 ? ((j)sparseArray0.valueAt(0)) : ((j)sparseArray0.get(-1));
            if(j0 == null) {
                return -1;
            }
            ArrayList arrayList0 = j0.b;
            int v2 = j0.a(f, f1);
            if(v == v2) {
                return v;
            }
            return v2 == -1 ? j0.c : ((k)arrayList0.get(v2)).e;
        }
        j j1 = (j)sparseArray0.get(v1);
        if(j1 == null) {
            return -1;
        }
        int v3 = j1.a(f, f1);
        return v3 == -1 ? j1.c : ((k)j1.b.get(v3)).e;
    }
}

