package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class KeyFrames {
    public static final int UNSET = -1;
    public final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap0 = new HashMap();
        KeyFrames.b = hashMap0;
        try {
            hashMap0.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            hashMap0.put("KeyPosition", KeyPosition.class.getConstructor(null));
            hashMap0.put("KeyCycle", KeyCycle.class.getConstructor(null));
            hashMap0.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            hashMap0.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("KeyFrames", "unable to load", noSuchMethodException0);
        }
    }

    public KeyFrames() {
        this.a = new HashMap();
    }

    public KeyFrames(Context context0, XmlPullParser xmlPullParser0) {
        Exception exception1;
        Key key1;
        HashMap hashMap0;
        String s;
        Key key0;
        int v;
        this.a = new HashMap();
        try {
            v = xmlPullParser0.getEventType();
            key0 = null;
        alab1:
            while(true) {
            label_4:
                switch(v) {
                    case 1: {
                        return;
                    }
                    case 2: {
                        s = xmlPullParser0.getName();
                        hashMap0 = KeyFrames.b;
                        if(hashMap0.containsKey(s)) {
                            break alab1;
                        }
                        else if(!s.equalsIgnoreCase("CustomAttribute")) {
                            if(s.equalsIgnoreCase("CustomMethod") && key0 != null) {
                                HashMap hashMap2 = key0.d;
                                if(hashMap2 != null) {
                                    ConstraintAttribute.parse(context0, xmlPullParser0, hashMap2);
                                }
                            }
                        }
                        else if(key0 != null) {
                            HashMap hashMap1 = key0.d;
                            if(hashMap1 != null) {
                                ConstraintAttribute.parse(context0, xmlPullParser0, hashMap1);
                            }
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 3: {
                        goto label_36;
                    }
                    default: {
                        v = xmlPullParser0.next();
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException0.printStackTrace();
            return;
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return;
        }
        try {
            Constructor constructor0 = (Constructor)hashMap0.get(s);
            if(constructor0 == null) {
                throw new NullPointerException("Keymaker for " + s + " not found");
            }
            key1 = (Key)constructor0.newInstance(null);
        }
        catch(Exception exception0) {
            exception1 = exception0;
            key1 = key0;
            goto label_33;
        }
        try {
            key1.load(context0, Xml.asAttributeSet(xmlPullParser0));
            this.addKey(key1);
            key0 = key1;
            v = xmlPullParser0.next();
            goto label_4;
        }
        catch(Exception exception1) {
        }
        try {
        label_33:
            Log.e("KeyFrames", "unable to create ", exception1);
            key0 = key1;
            v = xmlPullParser0.next();
            goto label_4;
        label_36:
            if("KeyFrameSet".equals(xmlPullParser0.getName())) {
                return;
            }
            v = xmlPullParser0.next();
            goto label_4;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return;
        }
        xmlPullParserException0.printStackTrace();
    }

    public void addAllFrames(MotionController motionController0) {
        ArrayList arrayList0 = (ArrayList)this.a.get(-1);
        if(arrayList0 != null) {
            motionController0.w.addAll(arrayList0);
        }
    }

    public void addFrames(MotionController motionController0) {
        HashMap hashMap0 = this.a;
        ArrayList arrayList0 = (ArrayList)hashMap0.get(motionController0.c);
        if(arrayList0 != null) {
            motionController0.w.addAll(arrayList0);
        }
        ArrayList arrayList1 = (ArrayList)hashMap0.get(-1);
        if(arrayList1 != null) {
            for(Object object0: arrayList1) {
                Key key0 = (Key)object0;
                String s = ((LayoutParams)motionController0.b.getLayoutParams()).constraintTag;
                if((key0.c == null || s == null ? false : s.matches(key0.c))) {
                    motionController0.addKey(key0);
                }
            }
        }
    }

    public void addKey(Key key0) {
        HashMap hashMap0 = this.a;
        if(!hashMap0.containsKey(key0.b)) {
            hashMap0.put(key0.b, new ArrayList());
        }
        ArrayList arrayList0 = (ArrayList)hashMap0.get(key0.b);
        if(arrayList0 != null) {
            arrayList0.add(key0);
        }
    }

    public ArrayList getKeyFramesForView(int v) {
        return (ArrayList)this.a.get(v);
    }

    public Set getKeys() {
        return this.a.keySet();
    }
}

