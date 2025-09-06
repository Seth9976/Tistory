package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser.PathDataNode;
import androidx.core.graphics.PathParser;
import d5.a;
import d5.d;
import java.io.IOException;
import java.util.ArrayList;
import jeb.synthetic.TWR;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class AnimatorInflaterCompat {
    public static Animator a(Context context0, Resources resources0, Resources.Theme resources$Theme0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, AnimatorSet animatorSet0, int v, float f) {
        PropertyValuesHolder[] arr_propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder0;
        int v16;
        Keyframe keyframe4;
        Keyframe keyframe3;
        int v11;
        Keyframe keyframe0;
        int v9;
        int v7;
        int v6;
        AttributeSet attributeSet2;
        int v3;
        int v1 = xmlResourceParser0.getDepth();
        Animator animator0 = null;
        ArrayList arrayList0 = null;
        while(true) {
            int v2 = xmlResourceParser0.next();
            boolean z = false;
            if(v2 == 3 && xmlResourceParser0.getDepth() <= v1 || v2 == 1) {
                break;
            }
            if(v2 == 2) {
                String s = xmlResourceParser0.getName();
                if(s.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator0 = new ObjectAnimator();
                    AnimatorInflaterCompat.d(context0, resources0, resources$Theme0, attributeSet0, objectAnimator0, f, xmlResourceParser0);
                    animator0 = objectAnimator0;
                    v3 = v1;
                }
                else if(s.equals("animator")) {
                    animator0 = AnimatorInflaterCompat.d(context0, resources0, resources$Theme0, attributeSet0, null, f, xmlResourceParser0);
                    v3 = v1;
                }
                else if(s.equals("set")) {
                    AnimatorSet animatorSet1 = new AnimatorSet();
                    TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.h);
                    AnimatorInflaterCompat.a(context0, resources0, resources$Theme0, xmlResourceParser0, attributeSet0, animatorSet1, TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "ordering", 0, 0), f);
                    typedArray0.recycle();
                    v3 = v1;
                    animator0 = animatorSet1;
                }
                else {
                    if(!s.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser0.getName());
                    }
                    AttributeSet attributeSet1 = Xml.asAttributeSet(xmlResourceParser0);
                    ArrayList arrayList1 = null;
                alab2:
                    while(true) {
                        switch(xmlResourceParser0.getEventType()) {
                            case 2: {
                                if(xmlResourceParser0.getName().equals("propertyValuesHolder")) {
                                    TypedArray typedArray1 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet1, a.i);
                                    String s1 = TypedArrayUtils.getNamedString(typedArray1, xmlResourceParser0, "propertyName", 3);
                                    int v4 = TypedArrayUtils.getNamedInt(typedArray1, xmlResourceParser0, "valueType", 2, 4);
                                    int v5 = v4;
                                    ArrayList arrayList2 = null;
                                alab1:
                                    while(true) {
                                        attributeSet2 = attributeSet1;
                                        switch(xmlResourceParser0.next()) {
                                            case 1: 
                                            case 3: {
                                                break alab1;
                                            }
                                            default: {
                                                if(xmlResourceParser0.getName().equals("keyframe")) {
                                                    int[] arr_v = a.j;
                                                    v6 = v5;
                                                    if(v6 == 4) {
                                                        TypedArray typedArray2 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, Xml.asAttributeSet(xmlResourceParser0), arr_v);
                                                        v7 = v1;
                                                        TypedValue typedValue0 = TypedArrayUtils.peekNamedValue(typedArray2, xmlResourceParser0, "value", 0);
                                                        int v8 = typedValue0 == null || !AnimatorInflaterCompat.c(typedValue0.type) ? 0 : 3;
                                                        typedArray2.recycle();
                                                        v6 = v8;
                                                    }
                                                    else {
                                                        v7 = v1;
                                                    }
                                                    TypedArray typedArray3 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, Xml.asAttributeSet(xmlResourceParser0), arr_v);
                                                    float f1 = TypedArrayUtils.getNamedFloat(typedArray3, xmlResourceParser0, "fraction", 3, -1.0f);
                                                    TypedValue typedValue1 = TypedArrayUtils.peekNamedValue(typedArray3, xmlResourceParser0, "value", 0);
                                                    boolean z1 = typedValue1 != null;
                                                    if(v6 != 4) {
                                                        v9 = v6;
                                                    }
                                                    else if(!z1 || !AnimatorInflaterCompat.c(typedValue1.type)) {
                                                        v9 = 0;
                                                    }
                                                    else {
                                                        v9 = 3;
                                                    }
                                                    if(z1) {
                                                        switch(v9) {
                                                            case 0: {
                                                                keyframe0 = Keyframe.ofFloat(f1, TypedArrayUtils.getNamedFloat(typedArray3, xmlResourceParser0, "value", 0, 0.0f));
                                                                break;
                                                            }
                                                            case 1: 
                                                            case 3: {
                                                                keyframe0 = Keyframe.ofInt(f1, TypedArrayUtils.getNamedInt(typedArray3, xmlResourceParser0, "value", 0, 0));
                                                                break;
                                                            }
                                                            default: {
                                                                keyframe0 = null;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        keyframe0 = v9 == 0 ? Keyframe.ofFloat(f1) : Keyframe.ofInt(f1);
                                                    }
                                                    int v10 = TypedArrayUtils.getNamedResourceId(typedArray3, xmlResourceParser0, "interpolator", 1, 0);
                                                    if(v10 > 0) {
                                                        keyframe0.setInterpolator(AnimationUtilsCompat.loadInterpolator(context0, v10));
                                                    }
                                                    typedArray3.recycle();
                                                    if(keyframe0 != null) {
                                                        if(arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        arrayList2.add(keyframe0);
                                                    }
                                                    xmlResourceParser0.next();
                                                }
                                                else {
                                                    v7 = v1;
                                                    v6 = v5;
                                                }
                                                attributeSet1 = attributeSet2;
                                                v1 = v7;
                                                v5 = v6;
                                            }
                                        }
                                    }
                                    v11 = v1;
                                    if(arrayList2 == null) {
                                        propertyValuesHolder0 = null;
                                    }
                                    else {
                                        int v12 = arrayList2.size();
                                        if(v12 > 0) {
                                            Keyframe keyframe1 = (Keyframe)arrayList2.get(0);
                                            Keyframe keyframe2 = (Keyframe)arrayList2.get(v12 - 1);
                                            float f2 = keyframe2.getFraction();
                                            if(f2 < 1.0f) {
                                                if(f2 < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                }
                                                else {
                                                    int v13 = arrayList2.size();
                                                    if(keyframe2.getType() == Float.TYPE) {
                                                        keyframe3 = Keyframe.ofFloat(1.0f);
                                                    }
                                                    else {
                                                        keyframe3 = keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f);
                                                    }
                                                    arrayList2.add(v13, keyframe3);
                                                    ++v12;
                                                }
                                            }
                                            float f3 = keyframe1.getFraction();
                                            if(f3 != 0.0f) {
                                                if(f3 < 0.0f) {
                                                    keyframe1.setFraction(0.0f);
                                                }
                                                else {
                                                    if(keyframe1.getType() == Float.TYPE) {
                                                        keyframe4 = Keyframe.ofFloat(0.0f);
                                                    }
                                                    else {
                                                        keyframe4 = keyframe1.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f);
                                                    }
                                                    arrayList2.add(0, keyframe4);
                                                    ++v12;
                                                }
                                            }
                                            Keyframe[] arr_keyframe = new Keyframe[v12];
                                            arrayList2.toArray(arr_keyframe);
                                            int v14 = 0;
                                            while(v14 < v12) {
                                                Keyframe keyframe5 = arr_keyframe[v14];
                                                if(keyframe5.getFraction() < 0.0f) {
                                                    if(v14 == 0) {
                                                        keyframe5.setFraction(0.0f);
                                                    }
                                                    else {
                                                        int v15 = v12 - 1;
                                                        if(v14 == v15) {
                                                            keyframe5.setFraction(1.0f);
                                                        }
                                                        else {
                                                            int v17 = v14 + 1;
                                                            int v18 = v14;
                                                            while(v17 < v15 && arr_keyframe[v17].getFraction() < 0.0f) {
                                                                v18 = v17;
                                                                ++v17;
                                                            }
                                                            float f4 = (arr_keyframe[v18 + 1].getFraction() - arr_keyframe[v14 - 1].getFraction()) / ((float)(v18 - v14 + 2));
                                                            for(int v19 = v14; v19 <= v18; ++v19) {
                                                                arr_keyframe[v19].setFraction(arr_keyframe[v19 - 1].getFraction() + f4);
                                                            }
                                                        }
                                                        v16 = v12;
                                                        goto label_147;
                                                    }
                                                }
                                                v16 = v12;
                                            label_147:
                                                ++v14;
                                                v12 = v16;
                                            }
                                            propertyValuesHolder0 = PropertyValuesHolder.ofKeyframe(s1, arr_keyframe);
                                            if(v5 == 3) {
                                                propertyValuesHolder0.setEvaluator(ArgbEvaluator.getInstance());
                                            }
                                        }
                                        else {
                                            propertyValuesHolder0 = null;
                                        }
                                    }
                                    if(propertyValuesHolder0 == null) {
                                        propertyValuesHolder0 = AnimatorInflaterCompat.b(typedArray1, v4, 0, 1, s1);
                                    }
                                    if(propertyValuesHolder0 != null) {
                                        if(arrayList1 == null) {
                                            arrayList1 = new ArrayList();
                                        }
                                        arrayList1.add(propertyValuesHolder0);
                                    }
                                    typedArray1.recycle();
                                }
                                else {
                                    attributeSet2 = attributeSet1;
                                    v11 = v1;
                                }
                                xmlResourceParser0.next();
                                attributeSet1 = attributeSet2;
                                v1 = v11;
                                break;
                            }
                            case 1: 
                            case 3: {
                                break alab2;
                            }
                            default: {
                                xmlResourceParser0.next();
                            }
                        }
                    }
                    v3 = v1;
                    if(arrayList1 == null) {
                        arr_propertyValuesHolder = null;
                    }
                    else {
                        int v20 = arrayList1.size();
                        arr_propertyValuesHolder = new PropertyValuesHolder[v20];
                        for(int v21 = 0; v21 < v20; ++v21) {
                            arr_propertyValuesHolder[v21] = (PropertyValuesHolder)arrayList1.get(v21);
                        }
                    }
                    if(arr_propertyValuesHolder != null && animator0 instanceof ValueAnimator) {
                        ((ValueAnimator)animator0).setValues(arr_propertyValuesHolder);
                    }
                    z = true;
                }
                if(animatorSet0 != null && !z) {
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    arrayList0.add(animator0);
                }
                v1 = v3;
            }
        }
        if(animatorSet0 != null && arrayList0 != null) {
            Animator[] arr_animator = new Animator[arrayList0.size()];
            int v22 = 0;
            for(Object object0: arrayList0) {
                arr_animator[v22] = (Animator)object0;
                ++v22;
            }
            if(v == 0) {
                animatorSet0.playTogether(arr_animator);
                return animator0;
            }
            animatorSet0.playSequentially(arr_animator);
        }
        return animator0;
    }

    public static PropertyValuesHolder b(TypedArray typedArray0, int v, int v1, int v2, String s) {
        int v7;
        int v6;
        int v5;
        PropertyValuesHolder propertyValuesHolder1;
        TypedValue typedValue0 = typedArray0.peekValue(v1);
        int v3 = typedValue0 == null ? typedValue0.type : 0;
        TypedValue typedValue1 = typedArray0.peekValue(v2);
        int v4 = typedValue1 == null ? typedValue1.type : 0;
        if(v == 4) {
            v = (typedValue0 == null || !AnimatorInflaterCompat.c(v3)) && (typedValue1 == null || !AnimatorInflaterCompat.c(v4)) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder0 = null;
        if(v == 2) {
            String s1 = typedArray0.getString(v1);
            String s2 = typedArray0.getString(v2);
            PathDataNode[] arr_pathParser$PathDataNode = PathParser.createNodesFromPathData(s1);
            PathDataNode[] arr_pathParser$PathDataNode1 = PathParser.createNodesFromPathData(s2);
            if(arr_pathParser$PathDataNode != null || arr_pathParser$PathDataNode1 != null) {
                if(arr_pathParser$PathDataNode != null) {
                    d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
                    if(arr_pathParser$PathDataNode1 != null) {
                        if(!PathParser.canMorph(arr_pathParser$PathDataNode, arr_pathParser$PathDataNode1)) {
                            throw new InflateException(" Can\'t morph from " + s1 + " to " + s2);
                        }
                        return PropertyValuesHolder.ofObject(s, d0, new Object[]{arr_pathParser$PathDataNode, arr_pathParser$PathDataNode1});
                    }
                    return PropertyValuesHolder.ofObject(s, d0, new Object[]{arr_pathParser$PathDataNode});
                }
                return arr_pathParser$PathDataNode1 == null ? null : PropertyValuesHolder.ofObject(s, new d(), new Object[]{arr_pathParser$PathDataNode1});  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }
        else {
            ArgbEvaluator argbEvaluator0 = v == 3 ? ArgbEvaluator.getInstance() : null;
            if(v == 0) {
                if(typedValue0 == null) {
                    propertyValuesHolder1 = PropertyValuesHolder.ofFloat(s, new float[]{(v4 == 5 ? typedArray0.getDimension(v2, 0.0f) : typedArray0.getFloat(v2, 0.0f))});
                }
                else {
                    float f = v3 == 5 ? typedArray0.getDimension(v1, 0.0f) : typedArray0.getFloat(v1, 0.0f);
                    propertyValuesHolder1 = typedValue1 == null ? PropertyValuesHolder.ofFloat(s, new float[]{f}) : PropertyValuesHolder.ofFloat(s, new float[]{f, (v4 == 5 ? typedArray0.getDimension(v2, 0.0f) : typedArray0.getFloat(v2, 0.0f))});
                }
                propertyValuesHolder0 = propertyValuesHolder1;
            }
            else if(typedValue0 != null) {
                if(v3 == 5) {
                    v5 = (int)typedArray0.getDimension(v1, 0.0f);
                }
                else {
                    v5 = AnimatorInflaterCompat.c(v3) ? typedArray0.getColor(v1, 0) : typedArray0.getInt(v1, 0);
                }
                if(typedValue1 == null) {
                    propertyValuesHolder0 = PropertyValuesHolder.ofInt(s, new int[]{v5});
                }
                else {
                    if(v4 == 5) {
                        v6 = (int)typedArray0.getDimension(v2, 0.0f);
                    }
                    else {
                        v6 = AnimatorInflaterCompat.c(v4) ? typedArray0.getColor(v2, 0) : typedArray0.getInt(v2, 0);
                    }
                    propertyValuesHolder0 = PropertyValuesHolder.ofInt(s, new int[]{v5, v6});
                }
            }
            else if(typedValue1 != null) {
                if(v4 == 5) {
                    v7 = (int)typedArray0.getDimension(v2, 0.0f);
                }
                else {
                    v7 = AnimatorInflaterCompat.c(v4) ? typedArray0.getColor(v2, 0) : typedArray0.getInt(v2, 0);
                }
                propertyValuesHolder0 = PropertyValuesHolder.ofInt(s, new int[]{v7});
            }
            if(propertyValuesHolder0 != null && argbEvaluator0 != null) {
                propertyValuesHolder0.setEvaluator(argbEvaluator0);
            }
        }
        return propertyValuesHolder0;
    }

    public static boolean c(int v) {
        return v >= 28 && v <= 0x1F;
    }

    public static ValueAnimator d(Context context0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, ObjectAnimator objectAnimator0, float f, XmlResourceParser xmlResourceParser0) {
        ValueAnimator valueAnimator2;
        PropertyValuesHolder propertyValuesHolder1;
        ValueAnimator valueAnimator1;
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.g);
        TypedArray typedArray1 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.k);
        ValueAnimator valueAnimator0 = objectAnimator0 == null ? new ValueAnimator() : objectAnimator0;
        long v = (long)TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "duration", 1, 300);
        long v2 = (long)TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "startOffset", 2, 0);
        int v3 = TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "valueType", 7, 4);
        if(TypedArrayUtils.hasAttribute(xmlResourceParser0, "valueFrom") && TypedArrayUtils.hasAttribute(xmlResourceParser0, "valueTo")) {
            if(v3 == 4) {
                TypedValue typedValue0 = typedArray0.peekValue(5);
                int v4 = typedValue0 == null ? typedValue0.type : 0;
                TypedValue typedValue1 = typedArray0.peekValue(6);
                boolean z = typedValue1 != null;
                v3 = (typedValue0 == null || !AnimatorInflaterCompat.c(v4)) && (!z || !AnimatorInflaterCompat.c((z ? typedValue1.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder propertyValuesHolder0 = AnimatorInflaterCompat.b(typedArray0, v3, 5, 6, "");
            if(propertyValuesHolder0 != null) {
                valueAnimator0.setValues(new PropertyValuesHolder[]{propertyValuesHolder0});
            }
        }
        valueAnimator0.setDuration(v);
        valueAnimator0.setStartDelay(v2);
        valueAnimator0.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "repeatCount", 3, 0));
        valueAnimator0.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "repeatMode", 4, 1));
        if(typedArray1 == null) {
            valueAnimator1 = valueAnimator0;
        }
        else {
            String s = TypedArrayUtils.getNamedString(typedArray1, xmlResourceParser0, "pathData", 1);
            if(s == null) {
                valueAnimator1 = valueAnimator0;
                ((ObjectAnimator)valueAnimator0).setPropertyName(TypedArrayUtils.getNamedString(typedArray1, xmlResourceParser0, "propertyName", 0));
            }
            else {
                String s1 = TypedArrayUtils.getNamedString(typedArray1, xmlResourceParser0, "propertyXName", 2);
                String s2 = TypedArrayUtils.getNamedString(typedArray1, xmlResourceParser0, "propertyYName", 3);
                if(s1 == null && s2 == null) {
                    throw new InflateException(typedArray1.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path0 = PathParser.createPathFromPathData(s);
                PathMeasure pathMeasure0 = new PathMeasure(path0, false);
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(0.0f);
                float f1 = 0.0f;
                do {
                    f1 += pathMeasure0.getLength();
                    arrayList0.add(f1);
                }
                while(pathMeasure0.nextContour());
                PathMeasure pathMeasure1 = new PathMeasure(path0, false);
                int v5 = Math.min(100, ((int)(f1 / (0.5f * f))) + 1);
                float[] arr_f = new float[v5];
                float[] arr_f1 = new float[v5];
                float[] arr_f2 = new float[2];
                valueAnimator1 = valueAnimator0;
                int v6 = 0;
                float f2 = 0.0f;
                for(int v1 = 0; true; ++v1) {
                    propertyValuesHolder1 = null;
                    if(v1 >= v5) {
                        break;
                    }
                    pathMeasure1.getPosTan(f2 - ((float)(((Float)arrayList0.get(v6)))), arr_f2, null);
                    arr_f[v1] = arr_f2[0];
                    arr_f1[v1] = arr_f2[1];
                    f2 += f1 / ((float)(v5 - 1));
                    if(v6 + 1 < arrayList0.size() && f2 > ((float)(((Float)arrayList0.get(v6 + 1))))) {
                        pathMeasure1.nextContour();
                        ++v6;
                    }
                }
                PropertyValuesHolder propertyValuesHolder2 = s1 == null ? null : PropertyValuesHolder.ofFloat(s1, arr_f);
                if(s2 != null) {
                    propertyValuesHolder1 = PropertyValuesHolder.ofFloat(s2, arr_f1);
                }
                if(propertyValuesHolder2 == null) {
                    ((ObjectAnimator)valueAnimator0).setValues(new PropertyValuesHolder[]{propertyValuesHolder1});
                }
                else if(propertyValuesHolder1 == null) {
                    ((ObjectAnimator)valueAnimator0).setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                }
                else {
                    ((ObjectAnimator)valueAnimator0).setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder1});
                }
            }
        }
        int v7 = TypedArrayUtils.getNamedResourceId(typedArray0, xmlResourceParser0, "interpolator", 0, 0);
        if(v7 > 0) {
            valueAnimator2 = valueAnimator1;
            valueAnimator2.setInterpolator(AnimationUtilsCompat.loadInterpolator(context0, v7));
        }
        else {
            valueAnimator2 = valueAnimator1;
        }
        typedArray0.recycle();
        if(typedArray1 != null) {
            typedArray1.recycle();
        }
        return valueAnimator2;
    }

    public static Animator loadAnimator(Context context0, @AnimatorRes int v) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context0, v);
    }

    public static Animator loadAnimator(Context context0, Resources resources0, Resources.Theme resources$Theme0, @AnimatorRes int v) throws Resources.NotFoundException {
        return AnimatorInflaterCompat.loadAnimator(context0, resources0, resources$Theme0, v, 1.0f);
    }

    public static Animator loadAnimator(Context context0, Resources resources0, Resources.Theme resources$Theme0, @AnimatorRes int v, float f) throws Resources.NotFoundException {
        Animator animator0;
        XmlResourceParser xmlResourceParser0;
        try {
            try {
                xmlResourceParser0 = null;
                xmlResourceParser0 = resources0.getAnimation(v);
                animator0 = AnimatorInflaterCompat.a(context0, resources0, resources$Theme0, xmlResourceParser0, Xml.asAttributeSet(xmlResourceParser0), null, 0, f);
            }
            catch(XmlPullParserException xmlPullParserException0) {
                Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException("Can\'t load animation resource ID #0x" + Integer.toHexString(v));
                resources$NotFoundException0.initCause(xmlPullParserException0);
                throw resources$NotFoundException0;
            }
            catch(IOException iOException0) {
                Resources.NotFoundException resources$NotFoundException1 = new Resources.NotFoundException("Can\'t load animation resource ID #0x" + Integer.toHexString(v));
                resources$NotFoundException1.initCause(iOException0);
                throw resources$NotFoundException1;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(xmlResourceParser0, throwable0);
            throw throwable0;
        }
        xmlResourceParser0.close();
        return animator0;
    }
}

