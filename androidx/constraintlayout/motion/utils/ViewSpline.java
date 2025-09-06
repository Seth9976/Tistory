package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import y2.e;
import y2.f;

public abstract class ViewSpline extends SplineSet {
    public static class CustomSet extends ViewSpline {
        public final SparseArray c;
        public float[] d;

        public CustomSet(String s, SparseArray sparseArray0) {
            String s1 = s.split(",")[1];
            this.c = sparseArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int v, float f) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int v, ConstraintAttribute constraintAttribute0) {
            this.c.append(v, constraintAttribute0);
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view0, float f) {
            this.mCurveFit.getPos(((double)f), this.d);
            CustomSupport.setInterpolatedValue(((ConstraintAttribute)this.c.valueAt(0)), view0, this.d);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int v) {
            SparseArray sparseArray0 = this.c;
            int v1 = sparseArray0.size();
            int v2 = ((ConstraintAttribute)sparseArray0.valueAt(0)).numberOfInterpolatedValues();
            double[] arr_f = new double[v1];
            this.d = new float[v2];
            double[][] arr2_f = new double[v1][v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = sparseArray0.keyAt(v3);
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)sparseArray0.valueAt(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                constraintAttribute0.getValuesToInterpolate(this.d);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f1 = this.d;
                    if(v5 >= arr_f1.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f1[v5];
                }
            }
            this.mCurveFit = CurveFit.get(v, arr_f, arr2_f);
        }
    }

    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view0, float f, double f1, double f2) {
            view0.setRotation(this.get(f) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view0, float f) {
        }
    }

    public static ViewSpline makeCustomSpline(String s, SparseArray sparseArray0) {
        return new CustomSet(s, sparseArray0);
    }

    public static ViewSpline makeSpline(String s) {
        s.getClass();
        switch(s) {
            case "alpha": {
                return new e(0);
            }
            case "elevation": {
                return new e(1);
            }
            case "progress": {
                ViewSpline viewSpline0 = new f();  // 初始化器: Landroidx/constraintlayout/motion/utils/ViewSpline;-><init>()V
                viewSpline0.c = false;
                return viewSpline0;
            }
            case "rotation": {
                return new e(4);
            }
            case "rotationX": {
                return new e(5);
            }
            case "rotationY": {
                return new e(6);
            }
            case "scaleX": {
                return new e(7);
            }
            case "scaleY": {
                return new e(8);
            }
            case "transformPivotX": {
                return new e(2);
            }
            case "transformPivotY": {
                return new e(3);
            }
            case "transitionPathRotate": {
                return new PathRotate();
            }
            case "translationX": {
                return new e(9);
            }
            case "translationY": {
                return new e(10);
            }
            case "translationZ": {
                return new e(11);
            }
            case "waveOffset": {
                return new e(0);
            }
            case "waveVariesBy": {
                return new e(0);
            }
            default: {
                return null;
            }
        }
    }

    public abstract void setProperty(View arg1, float arg2);
}

