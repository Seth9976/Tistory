package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayoutStates {
    public static final String TAG = "ConstraintLayoutStates";
    public final ConstraintLayout a;
    public int b;
    public int c;
    public final SparseArray d;
    public final SparseArray e;
    public ConstraintsChangedListener f;

    public ConstraintLayoutStates(Context context0, ConstraintLayout constraintLayout0, int v) {
        this.b = -1;
        this.c = -1;
        this.d = new SparseArray();
        this.e = new SparseArray();
        e e0 = null;
        this.f = null;
        this.a = constraintLayout0;
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            while(true) {
                switch(v1) {
                    case 0: {
                        xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    default: {
                        if(v1 == 2) {
                            switch(xmlResourceParser0.getName()) {
                                case "ConstraintSet": {
                                    this.a(context0, xmlResourceParser0);
                                    break;
                                }
                                case "State": {
                                    e0 = new e(context0, xmlResourceParser0);
                                    this.d.put(e0.a, e0);
                                    break;
                                }
                                case "StateSet": {
                                    break;
                                }
                                case "Variant": {
                                    f f0 = new f(context0, xmlResourceParser0);
                                    if(e0 != null) {
                                        e0.b.add(f0);
                                    }
                                    break;
                                }
                                case "layoutDescription": {
                                }
                            }
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_33;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_33;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_33:
        iOException0.printStackTrace();
    }

    public final void a(Context context0, XmlResourceParser xmlResourceParser0) {
        ConstraintSet constraintSet0 = new ConstraintSet();
        int v = xmlResourceParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = xmlResourceParser0.getAttributeName(v1);
            String s1 = xmlResourceParser0.getAttributeValue(v1);
            if(s != null && s1 != null && "id".equals(s)) {
                int v2 = s1.contains("/") ? context0.getResources().getIdentifier(s1.substring(s1.indexOf(0x2F) + 1), "id", "net.daum.android.tistoryapp") : -1;
                if(v2 == -1) {
                    if(s1.length() > 1) {
                        v2 = Integer.parseInt(s1.substring(1));
                    }
                    else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet0.load(context0, xmlResourceParser0);
                this.e.put(v2, constraintSet0);
                return;
            }
        }
    }

    public boolean needsToChange(int v, float f, float f1) {
        int v1 = this.b;
        if(v1 != v) {
            return true;
        }
        Object object0 = v == -1 ? this.d.valueAt(0) : this.d.get(v1);
        return this.c == -1 || !((f)((e)object0).b.get(this.c)).a(f, f1) ? this.c != ((e)object0).a(f, f1) : false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener0) {
        this.f = constraintsChangedListener0;
    }

    public void updateConstraints(int v, float f, float f1) {
        int v1 = this.b;
        ConstraintLayout constraintLayout0 = this.a;
        SparseArray sparseArray0 = this.d;
        if(v1 == v) {
            e e0 = v == -1 ? ((e)sparseArray0.valueAt(0)) : ((e)sparseArray0.get(v1));
            if(this.c != -1 && ((f)e0.b.get(this.c)).a(f, f1)) {
                return;
            }
            int v2 = e0.a(f, f1);
            if(this.c == v2) {
                return;
            }
            ArrayList arrayList0 = e0.b;
            ConstraintSet constraintSet0 = v2 == -1 ? null : ((f)arrayList0.get(v2)).f;
            if(v2 != -1) {
                int v3 = ((f)arrayList0.get(v2)).e;
            }
            if(constraintSet0 == null) {
                return;
            }
            this.c = v2;
            constraintSet0.applyTo(constraintLayout0);
            if(this.f != null) {
            }
        }
        else {
            this.b = v;
            e e1 = (e)sparseArray0.get(v);
            int v4 = e1.a(f, f1);
            ArrayList arrayList1 = e1.b;
            ConstraintSet constraintSet1 = v4 == -1 ? e1.d : ((f)arrayList1.get(v4)).f;
            if(v4 != -1) {
                int v5 = ((f)arrayList1.get(v4)).e;
            }
            if(constraintSet1 == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + v + ", dim =" + f + ", " + f1);
                return;
            }
            this.c = v4;
            constraintSet1.applyTo(constraintLayout0);
        }
    }
}

