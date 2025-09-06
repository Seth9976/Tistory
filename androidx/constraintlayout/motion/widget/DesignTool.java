package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;

public class DesignTool implements ProxyInterface {
    public final MotionLayout a;
    public String b;
    public String c;
    public int d;
    public int e;
    public static final HashMap f;
    public static final HashMap g;

    static {
        HashMap hashMap0 = new HashMap();
        DesignTool.f = hashMap0;
        HashMap hashMap1 = new HashMap();
        DesignTool.g = hashMap1;
        hashMap0.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap0.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap0.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap0.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap0.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap0.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap0.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap0.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap0.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap0.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap0.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap0.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap0.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap1.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap1.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap1.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap1.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap1.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap1.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap1.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap1.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap1.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap1.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap1.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap1.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(MotionLayout motionLayout0) {
        this.b = null;
        this.c = null;
        this.d = -1;
        this.e = -1;
        this.a = motionLayout0;
    }

    public static void a(int v, ConstraintSet constraintSet0, View view0, HashMap hashMap0, int v1, int v2) {
        Pair pair0 = Pair.create(v1, v2);
        String s = (String)DesignTool.f.get(pair0);
        String s1 = (String)hashMap0.get(s);
        if(s1 != null) {
            String s2 = (String)DesignTool.g.get(s);
            int v3 = s2 == null ? 0 : DesignTool.b(v, ((String)hashMap0.get(s2)));
            int v4 = Integer.parseInt(s1);
            constraintSet0.connect(view0.getId(), v1, v4, v2, v3);
        }
    }

    public static int b(int v, String s) {
        if(s == null) {
            return 0;
        }
        int v1 = s.indexOf(100);
        return v1 == -1 ? 0 : ((int)(((float)(((int)Integer.valueOf(s.substring(0, v1))) * v)) / 160.0f));
    }

    public static void c(ConstraintSet constraintSet0, View view0, HashMap hashMap0, int v) {
        String s = (String)hashMap0.get((v == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias"));
        if(s != null) {
            if(v == 0) {
                constraintSet0.setHorizontalBias(view0.getId(), Float.parseFloat(s));
                return;
            }
            if(v == 1) {
                constraintSet0.setVerticalBias(view0.getId(), Float.parseFloat(s));
            }
        }
    }

    public static void d(int v, ConstraintSet constraintSet0, View view0, HashMap hashMap0, int v1) {
        String s = (String)hashMap0.get((v1 == 1 ? "layout_height" : "layout_width"));
        if(s != null) {
            int v2 = s.equalsIgnoreCase("wrap_content") ? -2 : DesignTool.b(v, s);
            if(v1 == 0) {
                constraintSet0.constrainWidth(view0.getId(), v2);
                return;
            }
            constraintSet0.constrainHeight(view0.getId(), v2);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public int designAccess(int v, String s, Object object0, float[] arr_f, int v1, float[] arr_f1, int v2) {
        MotionController motionController0;
        MotionLayout motionLayout0 = this.a;
        if(v == 0) {
            motionController0 = null;
        }
        else {
            if(motionLayout0.a == null) {
                return -1;
            }
            if(((View)object0) == null) {
                return -1;
            }
            motionController0 = (MotionController)motionLayout0.k.get(((View)object0));
            if(motionController0 == null) {
                return -1;
            }
        }
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                int v3 = motionLayout0.a.getDuration();
                motionController0.b(arr_f1, v3 / 16);
                return v3 / 16;
            }
            case 2: {
                int v4 = motionLayout0.a.getDuration();
                motionController0.a(null, arr_f1);
                return v4 / 16;
            }
            case 3: {
                SplineSet splineSet0 = (SplineSet)motionController0.y.get(s);
                if(splineSet0 != null) {
                    for(int v5 = 0; v5 < arr_f1.length; ++v5) {
                        arr_f1[v5] = splineSet0.get(((float)(v5 / (arr_f1.length - 1))));
                    }
                    return arr_f1.length;
                }
                return -1;
            }
            default: {
                return -1;
            }
        }
    }

    public void disableAutoTransition(boolean z) {
        MotionScene motionScene0 = this.a.a;
        if(motionScene0 != null) {
            motionScene0.disableAutoTransition(z);
        }
    }

    public void dumpConstraintSet(String s) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = null;
        }
        int v = motionLayout0.a == null ? 0 : motionLayout0.a.lookUpConstraintId(s);
        System.out.println(" dumping  " + s + " (" + v + ")");
        try {
            motionLayout0.a.b(v).dump(motionLayout0.a, new int[0]);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    public int getAnimationKeyFrames(Object object0, float[] arr_f) {
        MotionLayout motionLayout0 = this.a;
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 == null) {
            return -1;
        }
        int v = motionScene0.getDuration();
        MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
        if(motionController0 == null) {
            return 0;
        }
        motionController0.a(null, arr_f);
        return v / 16;
    }

    public int getAnimationPath(Object object0, float[] arr_f, int v) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            return -1;
        }
        MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
        if(motionController0 == null) {
            return 0;
        }
        motionController0.b(arr_f, v);
        return v;
    }

    public void getAnimationRectangles(Object object0, float[] arr_f) {
        MotionLayout motionLayout0 = this.a;
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 == null) {
            return;
        }
        int v = motionScene0.getDuration();
        MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
        if(motionController0 == null) {
            return;
        }
        for(int v1 = 0; v1 < v / 16; ++v1) {
            float f = motionController0.c(((float)v1) * (1.0f / ((float)(v / 16 - 1))), null);
            motionController0.j[0].getPos(((double)f), motionController0.p);
            motionController0.f.d(motionController0.o, motionController0.p, arr_f, v1 * 8);
        }
    }

    public String getEndState() {
        MotionLayout motionLayout0 = this.a;
        int v = motionLayout0.getEndState();
        if(this.e == v) {
            return this.c;
        }
        String s = motionLayout0.a == null ? null : motionLayout0.a.lookUpConstraintName(v);
        if(s != null) {
            this.c = s;
            this.e = v;
        }
        return s;
    }

    public int getKeyFrameInfo(Object object0, int v, int[] arr_v) {
        MotionController motionController0 = (MotionController)this.a.k.get(((View)object0));
        return motionController0 == null ? 0 : motionController0.getKeyFrameInfo(v, arr_v);
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public float getKeyFramePosition(Object object0, int v, float f, float f1) {
        if(!(object0 instanceof View)) {
            return 0.0f;
        }
        MotionController motionController0 = (MotionController)this.a.k.get(((View)object0));
        return motionController0 == null ? 0.0f : motionController0.e(f, f1, v);
    }

    public int getKeyFramePositions(Object object0, int[] arr_v, float[] arr_f) {
        MotionController motionController0 = (MotionController)this.a.k.get(((View)object0));
        return motionController0 == null ? 0 : motionController0.getKeyFramePositions(arr_v, arr_f);
    }

    public Object getKeyframe(int v, int v1, int v2) {
        MotionLayout motionLayout0 = this.a;
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 == null) {
            return null;
        }
        motionLayout0.getContext();
        return motionScene0.e(v, v1, v2);
    }

    public Object getKeyframe(Object object0, int v, int v1) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            return null;
        }
        int v2 = ((View)object0).getId();
        MotionScene motionScene0 = motionLayout0.a;
        motionLayout0.getContext();
        return motionScene0.e(v, v2, v1);
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public Object getKeyframeAtLocation(Object object0, float f, float f1) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            return -1;
        }
        if(((View)object0) != null) {
            MotionController motionController0 = (MotionController)motionLayout0.k.get(((View)object0));
            if(motionController0 == null) {
                return null;
            }
            ViewGroup viewGroup0 = (ViewGroup)((View)object0).getParent();
            int v = viewGroup0.getWidth();
            int v1 = viewGroup0.getHeight();
            RectF rectF0 = new RectF();
            rectF0.left = motionController0.f.e;
            rectF0.top = motionController0.f.f;
            rectF0.right = motionController0.f.e + motionController0.f.g;
            rectF0.bottom = motionController0.f.f + motionController0.f.h;
            RectF rectF1 = new RectF();
            rectF1.left = motionController0.g.e;
            rectF1.top = motionController0.g.f;
            rectF1.right = motionController0.g.e + motionController0.g.g;
            rectF1.bottom = motionController0.g.f + motionController0.g.h;
            for(Object object1: motionController0.w) {
                Key key0 = (Key)object1;
                if(key0 instanceof d && ((d)key0).intersects(v, v1, rectF0, rectF1, f, f1)) {
                    return (d)key0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public Boolean getPositionKeyframe(Object object0, Object object1, float f, float f1, String[] arr_s, float[] arr_f) {
        if(object0 instanceof d) {
            MotionController motionController0 = (MotionController)this.a.k.get(((View)object1));
            motionController0.getClass();
            RectF rectF0 = new RectF();
            rectF0.left = motionController0.f.e;
            rectF0.top = motionController0.f.f;
            rectF0.right = motionController0.f.e + motionController0.f.g;
            rectF0.bottom = motionController0.f.f + motionController0.f.h;
            RectF rectF1 = new RectF();
            rectF1.left = motionController0.g.e;
            rectF1.top = motionController0.g.f;
            rectF1.right = motionController0.g.e + motionController0.g.g;
            rectF1.bottom = motionController0.g.f + motionController0.g.h;
            ((d)object0).positionAttributes(((View)object1), rectF0, rectF1, f, f1, arr_s, arr_f);
            this.a.rebuildScene();
            this.a.s = true;
            return true;
        }
        return false;
    }

    public float getProgress() {
        return this.a.getProgress();
    }

    public String getStartState() {
        MotionLayout motionLayout0 = this.a;
        int v = motionLayout0.getStartState();
        if(this.d == v) {
            return this.b;
        }
        String s = motionLayout0.a == null ? null : motionLayout0.a.lookUpConstraintName(v);
        if(s != null) {
            this.b = s;
            this.d = v;
        }
        return motionLayout0.a == null ? null : motionLayout0.a.lookUpConstraintName(v);
    }

    public String getState() {
        if(this.b != null && this.c != null) {
            float f = this.getProgress();
            if(f <= 0.01f) {
                return this.b;
            }
            return f >= 0.99f ? this.c : this.b;
        }
        return this.b;
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public long getTransitionTimeMs() {
        return this.a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        return this.b != null && this.c != null;
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setAttributes(int v, String s, Object object0, Object object1) {
        MotionLayout motionLayout0 = this.a;
        int v1 = motionLayout0.a == null ? 0 : motionLayout0.a.lookUpConstraintId(s);
        ConstraintSet constraintSet0 = motionLayout0.a.b(v1);
        if(constraintSet0 == null) {
            return;
        }
        constraintSet0.clear(((View)object0).getId());
        DesignTool.d(v, constraintSet0, ((View)object0), ((HashMap)object1), 0);
        DesignTool.d(v, constraintSet0, ((View)object0), ((HashMap)object1), 1);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 6, 6);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 6, 7);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 7, 7);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 7, 6);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 1, 1);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 1, 2);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 2, 2);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 2, 1);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 3, 3);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 3, 4);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 4, 3);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 4, 4);
        DesignTool.a(v, constraintSet0, ((View)object0), ((HashMap)object1), 5, 5);
        DesignTool.c(constraintSet0, ((View)object0), ((HashMap)object1), 0);
        DesignTool.c(constraintSet0, ((View)object0), ((HashMap)object1), 1);
        String s1 = (String)((HashMap)object1).get("layout_editor_absoluteX");
        if(s1 != null) {
            constraintSet0.setEditorAbsoluteX(((View)object0).getId(), DesignTool.b(v, s1));
        }
        String s2 = (String)((HashMap)object1).get("layout_editor_absoluteY");
        if(s2 != null) {
            constraintSet0.setEditorAbsoluteY(((View)object0).getId(), DesignTool.b(v, s2));
        }
        motionLayout0.updateState(v1, constraintSet0);
        motionLayout0.requestLayout();
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setKeyFrame(Object object0, int v, String s, Object object1) {
        MotionLayout motionLayout0 = this.a;
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 != null) {
            motionScene0.setKeyframe(((View)object0), v, s, object1);
            motionLayout0.q = ((float)v) / 100.0f;
            motionLayout0.o = 0.0f;
            motionLayout0.rebuildScene();
            motionLayout0.j(true);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public boolean setKeyFramePosition(Object object0, int v, int v1, float f, float f1) {
        if(!(object0 instanceof View)) {
            return false;
        }
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a != null) {
            MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
            int v2 = (int)(motionLayout0.n * 100.0f);
            if(motionController0 != null) {
                Transition motionScene$Transition0 = motionLayout0.a.c;
                if(motionScene$Transition0 != null) {
                    for(Object object1: motionScene$Transition0.k) {
                        for(Object object2: ((KeyFrames)object1).getKeyFramesForView(((View)object0).getId())) {
                            if(((Key)object2).a == v2) {
                                float f2 = motionController0.e(f, f1, 2);
                                float f3 = motionController0.e(f, f1, 5);
                                motionLayout0.a.setKeyframe(((View)object0), v2, "motion:percentX", f2);
                                motionLayout0.a.setKeyframe(((View)object0), v2, "motion:percentY", f3);
                                motionLayout0.rebuildScene();
                                motionLayout0.j(true);
                                motionLayout0.invalidate();
                                return true;
                            }
                            if(false) {
                                break;
                            }
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setKeyframe(Object object0, String s, Object object1) {
        if(object0 instanceof Key) {
            ((Key)object0).setValue(s, object1);
            this.a.rebuildScene();
            this.a.s = true;
        }
    }

    public void setState(String s) {
        if(s == null) {
            s = "motion_base";
        }
        if(this.b == s) {
            return;
        }
        this.b = s;
        this.c = null;
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = null;
        }
        int v = motionLayout0.a == null ? 0 : motionLayout0.a.lookUpConstraintId(s);
        this.d = v;
        if(v != 0) {
            if(v == motionLayout0.getStartState()) {
                motionLayout0.setProgress(0.0f);
            }
            else {
                if(v != motionLayout0.getEndState()) {
                    motionLayout0.transitionToState(v);
                }
                motionLayout0.setProgress(1.0f);
            }
        }
        motionLayout0.requestLayout();
    }

    @Override  // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setToolPosition(float f) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = null;
        }
        motionLayout0.setProgress(f);
        motionLayout0.j(true);
        motionLayout0.requestLayout();
        motionLayout0.invalidate();
    }

    public void setTransition(String s, String s1) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = null;
        }
        int v = 0;
        int v1 = motionLayout0.a == null ? 0 : motionLayout0.a.lookUpConstraintId(s);
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 != null) {
            v = motionScene0.lookUpConstraintId(s1);
        }
        motionLayout0.setTransition(v1, v);
        this.d = v1;
        this.e = v;
        this.b = s;
        this.c = s1;
    }

    public void setViewDebug(Object object0, int v) {
        if(!(object0 instanceof View)) {
            return;
        }
        MotionLayout motionLayout0 = this.a;
        MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
        if(motionController0 != null) {
            motionController0.setDrawPath(v);
            motionLayout0.invalidate();
        }
    }
}

