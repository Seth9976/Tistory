package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;

public class TransitionInflater {
    public final Context a;
    public static final Class[] b;
    public static final ArrayMap c;

    static {
        TransitionInflater.b = new Class[]{Context.class, AttributeSet.class};
        TransitionInflater.c = new ArrayMap();
    }

    public TransitionInflater(Context context0) {
        this.a = context0;
    }

    public final Object a(AttributeSet attributeSet0, Class class0, String s) {
        Constructor constructor0;
        String s1 = attributeSet0.getAttributeValue(null, "class");
        if(s1 != null) {
            try {
                ArrayMap arrayMap0 = TransitionInflater.c;
                synchronized(arrayMap0) {
                    constructor0 = (Constructor)arrayMap0.get(s1);
                    if(constructor0 == null) {
                        Class class1 = Class.forName(s1, false, this.a.getClassLoader()).asSubclass(class0);
                        if(class1 != null) {
                            constructor0 = class1.getConstructor(TransitionInflater.b);
                            constructor0.setAccessible(true);
                            arrayMap0.put(s1, constructor0);
                        }
                    }
                }
                return constructor0.newInstance(this.a, attributeSet0);
            }
            catch(Exception exception0) {
                throw new InflateException("Could not instantiate " + class0 + " class " + s1, exception0);
            }
        }
        throw new InflateException(s + " tag must have a \'class\' attribute");
    }

    public final Transition b(XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Transition transition0) {
        int v = xmlResourceParser0.getDepth();
        TransitionSet transitionSet0 = transition0 instanceof TransitionSet ? ((TransitionSet)transition0) : null;
        while(true) {
            Transition transition1 = null;
            while(true) {
            label_3:
                int v1 = xmlResourceParser0.next();
                if(v1 == 3 && xmlResourceParser0.getDepth() <= v || v1 == 1) {
                    return transition1;
                }
                if(v1 == 2) {
                    String s = xmlResourceParser0.getName();
                    Context context0 = this.a;
                    if("fade".equals(s)) {
                        transition1 = new Fade(context0, attributeSet0);
                        goto label_91;
                    }
                    if("changeBounds".equals(s)) {
                        transition1 = new ChangeBounds(context0, attributeSet0);
                        goto label_91;
                    }
                    if("slide".equals(s)) {
                        transition1 = new Slide(context0, attributeSet0);
                        goto label_91;
                    }
                    if("explode".equals(s)) {
                        transition1 = new Explode(context0, attributeSet0);
                        goto label_91;
                    }
                    if("changeImageTransform".equals(s)) {
                        transition1 = new ChangeImageTransform(context0, attributeSet0);
                        goto label_91;
                    }
                    if("changeTransform".equals(s)) {
                        transition1 = new ChangeTransform(context0, attributeSet0);
                        goto label_91;
                    }
                    if("changeClipBounds".equals(s)) {
                        transition1 = new ChangeClipBounds(context0, attributeSet0);
                        goto label_91;
                    }
                    if("autoTransition".equals(s)) {
                        transition1 = new AutoTransition(context0, attributeSet0);
                        goto label_91;
                    }
                    if("changeScroll".equals(s)) {
                        transition1 = new ChangeScroll(context0, attributeSet0);
                        goto label_91;
                    }
                    if("transitionSet".equals(s)) {
                        transition1 = new TransitionSet(context0, attributeSet0);
                        goto label_91;
                    }
                    if("transition".equals(s)) {
                        transition1 = (Transition)this.a(attributeSet0, Transition.class, "transition");
                        goto label_91;
                    }
                    if("targets".equals(s)) {
                        int v2 = xmlResourceParser0.getDepth();
                        while(true) {
                            int v3 = xmlResourceParser0.next();
                            if(v3 == 3 && xmlResourceParser0.getDepth() <= v2 || v3 == 1) {
                                goto label_91;
                            }
                            if(v3 == 2) {
                                if(!xmlResourceParser0.getName().equals("target")) {
                                    break;
                                }
                                TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.a);
                                int v4 = TypedArrayUtils.getNamedResourceId(typedArray0, xmlResourceParser0, "targetId", 1, 0);
                                if(v4 == 0) {
                                    int v5 = TypedArrayUtils.getNamedResourceId(typedArray0, xmlResourceParser0, "excludeId", 2, 0);
                                    if(v5 == 0) {
                                        String s1 = TypedArrayUtils.getNamedString(typedArray0, xmlResourceParser0, "targetName", 4);
                                        if(s1 == null) {
                                            String s2 = TypedArrayUtils.getNamedString(typedArray0, xmlResourceParser0, "excludeName", 5);
                                            if(s2 == null) {
                                                String s3 = TypedArrayUtils.getNamedString(typedArray0, xmlResourceParser0, "excludeClass", 3);
                                                try {
                                                    if(s3 == null) {
                                                        s3 = TypedArrayUtils.getNamedString(typedArray0, xmlResourceParser0, "targetClass", 0);
                                                        if(s3 != null) {
                                                            transition0.addTarget(Class.forName(s3));
                                                        }
                                                    }
                                                    else {
                                                        transition0.excludeTarget(Class.forName(s3), true);
                                                    }
                                                    goto label_75;
                                                }
                                                catch(ClassNotFoundException classNotFoundException0) {
                                                }
                                                typedArray0.recycle();
                                                throw new RuntimeException("Could not create " + s3, classNotFoundException0);
                                            }
                                            else {
                                                transition0.excludeTarget(s2, true);
                                            }
                                        }
                                        else {
                                            transition0.addTarget(s1);
                                        }
                                    }
                                    else {
                                        transition0.excludeTarget(v5, true);
                                    }
                                }
                                else {
                                    transition0.addTarget(v4);
                                }
                            label_75:
                                typedArray0.recycle();
                            }
                        }
                        throw new RuntimeException("Unknown scene name: " + xmlResourceParser0.getName());
                    }
                    if("arcMotion".equals(s)) {
                        if(transition0 == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        transition0.setPathMotion(new ArcMotion(context0, attributeSet0));
                        goto label_91;
                    }
                    else if("pathMotion".equals(s)) {
                        if(transition0 == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        transition0.setPathMotion(((PathMotion)this.a(attributeSet0, PathMotion.class, "pathMotion")));
                        goto label_91;
                    }
                    else {
                        if(!"patternPathMotion".equals(s)) {
                            throw new RuntimeException("Unknown scene name: " + xmlResourceParser0.getName());
                        }
                        if(transition0 == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        transition0.setPathMotion(new PatternPathMotion(context0, attributeSet0));
                    label_91:
                        if(transition1 == null) {
                            continue;
                        }
                        break;
                    }
                }
            }
            if(!xmlResourceParser0.isEmptyElementTag()) {
                this.b(xmlResourceParser0, attributeSet0, transition1);
            }
            if(transitionSet0 == null) {
                break;
            }
            transitionSet0.addTransition(transition1);
        }
        if(transition0 != null) {
            throw new InflateException("Could not add transition to another transition.");
        }
        goto label_3;
    }

    public final TransitionManager c(XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, ViewGroup viewGroup0) {
        int v = xmlResourceParser0.getDepth();
        TransitionManager transitionManager0 = null;
        while(true) {
            int v1 = xmlResourceParser0.next();
            if(v1 == 3 && xmlResourceParser0.getDepth() <= v || v1 == 1) {
                break;
            }
            if(v1 == 2) {
                String s = xmlResourceParser0.getName();
                if(s.equals("transitionManager")) {
                    transitionManager0 = new TransitionManager();
                }
                else {
                    if(!s.equals("transition") || transitionManager0 == null) {
                        throw new RuntimeException("Unknown scene name: " + xmlResourceParser0.getName());
                    }
                    TypedArray typedArray0 = this.a.obtainStyledAttributes(attributeSet0, f0.b);
                    int v2 = TypedArrayUtils.getNamedResourceId(typedArray0, xmlResourceParser0, "transition", 2, -1);
                    int v3 = TypedArrayUtils.getNamedResourceId(typedArray0, xmlResourceParser0, "fromScene", 0, -1);
                    Scene scene0 = v3 >= 0 ? Scene.getSceneForLayout(viewGroup0, v3, this.a) : null;
                    int v4 = TypedArrayUtils.getNamedResourceId(typedArray0, xmlResourceParser0, "toScene", 1, -1);
                    Scene scene1 = v4 >= 0 ? Scene.getSceneForLayout(viewGroup0, v4, this.a) : null;
                    if(v2 >= 0) {
                        Transition transition0 = this.inflateTransition(v2);
                        if(transition0 != null) {
                            if(scene1 == null) {
                                throw new RuntimeException("No toScene for transition ID " + v2);
                            }
                            if(scene0 == null) {
                                transitionManager0.setTransition(scene1, transition0);
                            }
                            else {
                                transitionManager0.setTransition(scene0, scene1, transition0);
                            }
                        }
                    }
                    typedArray0.recycle();
                }
            }
        }
        return transitionManager0;
    }

    @NonNull
    public static TransitionInflater from(@NonNull Context context0) {
        return new TransitionInflater(context0);
    }

    public Transition inflateTransition(int v) {
        try(XmlResourceParser xmlResourceParser0 = this.a.getResources().getXml(v)) {
            try {
                return this.b(xmlResourceParser0, Xml.asAttributeSet(xmlResourceParser0), null);
            }
            catch(XmlPullParserException xmlPullParserException0) {
                throw new InflateException(xmlPullParserException0.getMessage(), xmlPullParserException0);
            }
            catch(IOException iOException0) {
                throw new InflateException(xmlResourceParser0.getPositionDescription() + ": " + iOException0.getMessage(), iOException0);
            }
        }
    }

    public TransitionManager inflateTransitionManager(int v, ViewGroup viewGroup0) {
        try(XmlResourceParser xmlResourceParser0 = this.a.getResources().getXml(v)) {
            try {
                return this.c(xmlResourceParser0, Xml.asAttributeSet(xmlResourceParser0), viewGroup0);
            }
            catch(XmlPullParserException xmlPullParserException0) {
                InflateException inflateException0 = new InflateException(xmlPullParserException0.getMessage());
                inflateException0.initCause(xmlPullParserException0);
                throw inflateException0;
            }
            catch(IOException iOException0) {
                InflateException inflateException1 = new InflateException(xmlResourceParser0.getPositionDescription() + ": " + iOException0.getMessage());
                inflateException1.initCause(iOException0);
                throw inflateException1;
            }
        }
    }
}

