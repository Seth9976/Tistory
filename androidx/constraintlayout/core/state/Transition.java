package androidx.constraintlayout.core.state;

import androidx.compose.ui.text.n0;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashMap;

public class Transition implements TypedValues {
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    public static final int START;
    public final HashMap a;
    public final HashMap b;
    public final TypedBundle c;
    public String d;
    public Easing e;

    public Transition() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new TypedBundle();
        this.d = null;
        this.e = null;
    }

    public final f a(int v, String s) {
        HashMap hashMap0 = this.b;
        f f0 = (f)hashMap0.get(s);
        if(f0 == null) {
            f0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
            f0.h = new KeyCache();
            WidgetFrame widgetFrame0 = new WidgetFrame();
            f0.a = widgetFrame0;
            WidgetFrame widgetFrame1 = new WidgetFrame();
            f0.b = widgetFrame1;
            WidgetFrame widgetFrame2 = new WidgetFrame();
            f0.c = widgetFrame2;
            MotionWidget motionWidget0 = new MotionWidget(widgetFrame0);
            f0.e = motionWidget0;
            MotionWidget motionWidget1 = new MotionWidget(widgetFrame1);
            f0.f = motionWidget1;
            f0.g = new MotionWidget(widgetFrame2);
            Motion motion0 = new Motion(motionWidget0);
            f0.d = motion0;
            motion0.setStart(motionWidget0);
            motion0.setEnd(motionWidget1);
            this.c.applyDelta(motion0);
            hashMap0.put(s, f0);
        }
        return f0;
    }

    public void addCustomColor(int v, String s, String s1, int v1) {
        WidgetFrame widgetFrame0;
        f f0 = this.a(v, s);
        if(v == 0) {
            widgetFrame0 = f0.a;
        }
        else {
            widgetFrame0 = v == 1 ? f0.b : f0.c;
        }
        widgetFrame0.addCustomColor(s1, v1);
    }

    public void addCustomFloat(int v, String s, String s1, float f) {
        WidgetFrame widgetFrame0;
        f f1 = this.a(v, s);
        if(v == 0) {
            widgetFrame0 = f1.a;
        }
        else {
            widgetFrame0 = v == 1 ? f1.b : f1.c;
        }
        widgetFrame0.addCustomFloat(s1, f);
    }

    public void addKeyAttribute(String s, TypedBundle typedBundle0) {
        f f0 = this.a(0, s);
        MotionKeyAttributes motionKeyAttributes0 = new MotionKeyAttributes();
        typedBundle0.applyDelta(motionKeyAttributes0);
        f0.d.addKey(motionKeyAttributes0);
    }

    public void addKeyCycle(String s, TypedBundle typedBundle0) {
        f f0 = this.a(0, s);
        MotionKeyCycle motionKeyCycle0 = new MotionKeyCycle();
        typedBundle0.applyDelta(motionKeyCycle0);
        f0.d.addKey(motionKeyCycle0);
    }

    public void addKeyPosition(String s, int v, int v1, float f, float f1) {
        TypedBundle typedBundle0 = new TypedBundle();
        typedBundle0.add(510, 2);
        typedBundle0.add(100, v);
        typedBundle0.add(506, f);
        typedBundle0.add(507, f1);
        f f2 = this.a(0, s);
        MotionKeyPosition motionKeyPosition0 = new MotionKeyPosition();
        typedBundle0.applyDelta(motionKeyPosition0);
        f2.d.addKey(motionKeyPosition0);
        e e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e0.a = v;
        e0.b = f;
        e0.c = f1;
        HashMap hashMap0 = this.a;
        HashMap hashMap1 = (HashMap)hashMap0.get(v);
        if(hashMap1 == null) {
            hashMap1 = new HashMap();
            hashMap0.put(v, hashMap1);
        }
        hashMap1.put(s, e0);
    }

    public void addKeyPosition(String s, TypedBundle typedBundle0) {
        f f0 = this.a(0, s);
        MotionKeyPosition motionKeyPosition0 = new MotionKeyPosition();
        typedBundle0.applyDelta(motionKeyPosition0);
        f0.d.addKey(motionKeyPosition0);
    }

    public void clear() {
        this.b.clear();
    }

    public boolean contains(String s) {
        return this.b.containsKey(s);
    }

    public void fillKeyPositions(WidgetFrame widgetFrame0, float[] arr_f, float[] arr_f1, float[] arr_f2) {
        int v = 0;
        for(int v1 = 0; v1 <= 100; ++v1) {
            HashMap hashMap0 = (HashMap)this.a.get(v1);
            if(hashMap0 != null) {
                e e0 = (e)hashMap0.get(widgetFrame0.widget.stringId);
                if(e0 != null) {
                    arr_f[v] = e0.b;
                    arr_f1[v] = e0.c;
                    arr_f2[v] = (float)e0.a;
                    ++v;
                }
            }
        }
    }

    public e findNextPosition(String s, int v) {
        while(v <= 100) {
            HashMap hashMap0 = (HashMap)this.a.get(v);
            if(hashMap0 != null) {
                e e0 = (e)hashMap0.get(s);
                if(e0 != null) {
                    return e0;
                }
            }
            ++v;
        }
        return null;
    }

    public e findPreviousPosition(String s, int v) {
        while(v >= 0) {
            HashMap hashMap0 = (HashMap)this.a.get(v);
            if(hashMap0 != null) {
                e e0 = (e)hashMap0.get(s);
                if(e0 != null) {
                    return e0;
                }
            }
            --v;
        }
        return null;
    }

    public int getAutoTransition() {
        return 0;
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget0) {
        return this.a(1, constraintWidget0.stringId).b;
    }

    public WidgetFrame getEnd(String s) {
        f f0 = (f)this.b.get(s);
        return f0 == null ? null : f0.b;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        return 0;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget0) {
        return this.a(2, constraintWidget0.stringId).c;
    }

    public WidgetFrame getInterpolated(String s) {
        f f0 = (f)this.b.get(s);
        return f0 == null ? null : f0.c;
    }

    public static Interpolator getInterpolator(int v, String s) {
        switch(v) {
            case -1: {
                return new d(s, 0);
            }
            case 0: {
                return new n0(3);
            }
            case 1: {
                return new n0(4);
            }
            case 2: {
                return new n0(5);
            }
            case 3: {
                return new n0(6);
            }
            case 4: {
                return new n0(9);
            }
            case 5: {
                return new n0(8);
            }
            case 6: {
                return new n0(7);
            }
            default: {
                return null;
            }
        }
    }

    public Interpolator getInterpolator() {
        return Transition.getInterpolator(0, this.d);
    }

    public int getKeyFrames(String s, float[] arr_f, int[] arr_v, int[] arr_v1) {
        return ((f)this.b.get(s)).d.buildKeyFrames(arr_f, arr_v, arr_v1);
    }

    public Motion getMotion(String s) {
        return this.a(0, s).d;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame0) {
        int v = 0;
        for(int v1 = 0; v1 <= 100; ++v1) {
            HashMap hashMap0 = (HashMap)this.a.get(v1);
            if(hashMap0 != null && ((e)hashMap0.get(widgetFrame0.widget.stringId)) != null) {
                ++v;
            }
        }
        return v;
    }

    public float[] getPath(String s) {
        f f0 = (f)this.b.get(s);
        float[] arr_f = new float[0x7C];
        f0.d.buildPath(arr_f, 62);
        return arr_f;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget0) {
        return this.a(0, constraintWidget0.stringId).a;
    }

    public WidgetFrame getStart(String s) {
        f f0 = (f)this.b.get(s);
        return f0 == null ? null : f0.a;
    }

    public boolean hasPositionKeyframes() {
        return this.a.size() > 0;
    }

    public void interpolate(int v, int v1, float f) {
        Easing easing0 = this.e;
        if(easing0 != null) {
            f = (float)easing0.get(((double)f));
        }
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            Object object1 = hashMap0.get(((String)object0));
            ((f)object1).getClass();
            ((f)object1).d.setup(v, v1, 1.0f, System.nanoTime());
            WidgetFrame.interpolate(v, v1, ((f)object1).c, ((f)object1).a, ((f)object1).b, this, f);
            ((f)object1).c.interpolatedPos = f;
            ((f)object1).d.interpolate(((f)object1).g, f, System.nanoTime(), ((f)object1).h);
        }
    }

    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public void setTransitionProperties(TypedBundle typedBundle0) {
        typedBundle0.applyDelta(this.c);
        typedBundle0.applyDelta(this);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, float f) {
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, int v1) {
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, String s) {
        if(v == 705) {
            this.d = s;
            this.e = Easing.getInterpolator(s);
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, boolean z) {
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer0, int v) {
        ArrayList arrayList0 = constraintWidgetContainer0.getChildren();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v2);
            f f0 = this.a(v, constraintWidget0.stringId);
            Motion motion0 = f0.d;
            if(v == 0) {
                f0.a.update(constraintWidget0);
                motion0.setStart(f0.e);
            }
            else if(v == 1) {
                f0.b.update(constraintWidget0);
                motion0.setEnd(f0.f);
            }
        }
    }
}

