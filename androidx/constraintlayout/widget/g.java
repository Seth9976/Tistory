package androidx.constraintlayout.widget;

import android.util.Log;
import java.util.Arrays;

public final class g {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int v, float f) {
        int[] arr_v = this.d;
        if(this.f >= arr_v.length) {
            this.d = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.e = Arrays.copyOf(this.e, this.e.length * 2);
        }
        int v1 = this.f;
        this.d[v1] = v;
        this.f = v1 + 1;
        this.e[v1] = f;
    }

    public final void b(int v, int v1) {
        int[] arr_v = this.a;
        if(this.c >= arr_v.length) {
            this.a = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.b = Arrays.copyOf(this.b, this.b.length * 2);
        }
        int v2 = this.c;
        this.a[v2] = v;
        this.c = v2 + 1;
        this.b[v2] = v1;
    }

    public final void c(int v, String s) {
        int[] arr_v = this.g;
        if(this.i >= arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.h = (String[])Arrays.copyOf(this.h, this.h.length * 2);
        }
        int v1 = this.i;
        this.g[v1] = v;
        this.i = v1 + 1;
        this.h[v1] = s;
    }

    public final void d(int v, boolean z) {
        int[] arr_v = this.j;
        if(this.l >= arr_v.length) {
            this.j = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.k = Arrays.copyOf(this.k, this.k.length * 2);
        }
        int v1 = this.l;
        this.j[v1] = v;
        this.l = v1 + 1;
        this.k[v1] = z;
    }

    public final void e(Constraint constraintSet$Constraint0) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            int v2 = this.a[v1];
            int v3 = this.b[v1];
            switch(v2) {
                case 2: {
                    constraintSet$Constraint0.layout.bottomMargin = v3;
                    break;
                }
                case 6: {
                    constraintSet$Constraint0.layout.editorAbsoluteX = v3;
                    break;
                }
                case 7: {
                    constraintSet$Constraint0.layout.editorAbsoluteY = v3;
                    break;
                }
                case 8: {
                    constraintSet$Constraint0.layout.endMargin = v3;
                    break;
                }
                case 11: {
                    constraintSet$Constraint0.layout.goneBottomMargin = v3;
                    break;
                }
                case 12: {
                    constraintSet$Constraint0.layout.goneEndMargin = v3;
                    break;
                }
                case 13: {
                    constraintSet$Constraint0.layout.goneLeftMargin = v3;
                    break;
                }
                case 14: {
                    constraintSet$Constraint0.layout.goneRightMargin = v3;
                    break;
                }
                case 15: {
                    constraintSet$Constraint0.layout.goneStartMargin = v3;
                    break;
                }
                case 16: {
                    constraintSet$Constraint0.layout.goneTopMargin = v3;
                    break;
                }
                case 17: {
                    constraintSet$Constraint0.layout.guideBegin = v3;
                    break;
                }
                case 18: {
                    constraintSet$Constraint0.layout.guideEnd = v3;
                    break;
                }
                case 21: {
                    constraintSet$Constraint0.layout.mHeight = v3;
                    break;
                }
                case 22: {
                    constraintSet$Constraint0.propertySet.visibility = v3;
                    break;
                }
                case 23: {
                    constraintSet$Constraint0.layout.mWidth = v3;
                    break;
                }
                case 24: {
                    constraintSet$Constraint0.layout.leftMargin = v3;
                    break;
                }
                case 27: {
                    constraintSet$Constraint0.layout.orientation = v3;
                    break;
                }
                case 28: {
                    constraintSet$Constraint0.layout.rightMargin = v3;
                    break;
                }
                case 0x1F: {
                    constraintSet$Constraint0.layout.startMargin = v3;
                    break;
                }
                case 34: {
                    constraintSet$Constraint0.layout.topMargin = v3;
                    break;
                }
                case 38: {
                    constraintSet$Constraint0.a = v3;
                    break;
                }
                case 41: {
                    constraintSet$Constraint0.layout.horizontalChainStyle = v3;
                    break;
                }
                case 42: {
                    constraintSet$Constraint0.layout.verticalChainStyle = v3;
                    break;
                }
                case 54: {
                    constraintSet$Constraint0.layout.widthDefault = v3;
                    break;
                }
                case 55: {
                    constraintSet$Constraint0.layout.heightDefault = v3;
                    break;
                }
                case 56: {
                    constraintSet$Constraint0.layout.widthMax = v3;
                    break;
                }
                case 57: {
                    constraintSet$Constraint0.layout.heightMax = v3;
                    break;
                }
                case 58: {
                    constraintSet$Constraint0.layout.widthMin = v3;
                    break;
                }
                case 59: {
                    constraintSet$Constraint0.layout.heightMin = v3;
                    break;
                }
                case 61: {
                    constraintSet$Constraint0.layout.circleConstraint = v3;
                    break;
                }
                case 62: {
                    constraintSet$Constraint0.layout.circleRadius = v3;
                    break;
                }
                case 0x40: {
                    constraintSet$Constraint0.motion.mAnimateRelativeTo = v3;
                    break;
                }
                case 66: {
                    constraintSet$Constraint0.motion.mDrawPath = v3;
                    break;
                }
                case 72: {
                    constraintSet$Constraint0.layout.mBarrierDirection = v3;
                    break;
                }
                case 73: {
                    constraintSet$Constraint0.layout.mBarrierMargin = v3;
                    break;
                }
                case 76: {
                    constraintSet$Constraint0.motion.mPathMotionArc = v3;
                    break;
                }
                case 78: {
                    constraintSet$Constraint0.propertySet.mVisibilityMode = v3;
                    break;
                }
                case 82: {
                    constraintSet$Constraint0.motion.mAnimateCircleAngleTo = v3;
                    break;
                }
                case 83: {
                    constraintSet$Constraint0.transform.transformPivotTarget = v3;
                    break;
                }
                case 84: {
                    constraintSet$Constraint0.motion.mQuantizeMotionSteps = v3;
                    break;
                }
                case 87: {
                    break;
                }
                case 88: {
                    constraintSet$Constraint0.motion.mQuantizeInterpolatorType = v3;
                    break;
                }
                case 89: {
                    constraintSet$Constraint0.motion.mQuantizeInterpolatorID = v3;
                    break;
                }
                case 93: {
                    constraintSet$Constraint0.layout.baselineMargin = v3;
                    break;
                }
                case 94: {
                    constraintSet$Constraint0.layout.goneBaselineMargin = v3;
                    break;
                }
                case 97: {
                    constraintSet$Constraint0.layout.mWrapBehavior = v3;
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                }
            }
        }
        for(int v4 = 0; v4 < this.f; ++v4) {
            int v5 = this.d[v4];
            float f = this.e[v4];
            switch(v5) {
                case 19: {
                    constraintSet$Constraint0.layout.guidePercent = f;
                    break;
                }
                case 20: {
                    constraintSet$Constraint0.layout.horizontalBias = f;
                    break;
                }
                case 37: {
                    constraintSet$Constraint0.layout.verticalBias = f;
                    break;
                }
                case 39: {
                    constraintSet$Constraint0.layout.horizontalWeight = f;
                    break;
                }
                case 40: {
                    constraintSet$Constraint0.layout.verticalWeight = f;
                    break;
                }
                case 43: {
                    constraintSet$Constraint0.propertySet.alpha = f;
                    break;
                }
                case 44: {
                    constraintSet$Constraint0.transform.elevation = f;
                    constraintSet$Constraint0.transform.applyElevation = true;
                    break;
                }
                case 45: {
                    constraintSet$Constraint0.transform.rotationX = f;
                    break;
                }
                case 46: {
                    constraintSet$Constraint0.transform.rotationY = f;
                    break;
                }
                case 0x2F: {
                    constraintSet$Constraint0.transform.scaleX = f;
                    break;
                }
                case 0x30: {
                    constraintSet$Constraint0.transform.scaleY = f;
                    break;
                }
                case 49: {
                    constraintSet$Constraint0.transform.transformPivotX = f;
                    break;
                }
                case 50: {
                    constraintSet$Constraint0.transform.transformPivotY = f;
                    break;
                }
                case 51: {
                    constraintSet$Constraint0.transform.translationX = f;
                    break;
                }
                case 52: {
                    constraintSet$Constraint0.transform.translationY = f;
                    break;
                }
                case 53: {
                    constraintSet$Constraint0.transform.translationZ = f;
                    break;
                }
                case 60: {
                    constraintSet$Constraint0.transform.rotation = f;
                    break;
                }
                case 0x3F: {
                    constraintSet$Constraint0.layout.circleAngle = f;
                    break;
                }
                case 67: {
                    constraintSet$Constraint0.motion.mPathRotate = f;
                    break;
                }
                case 68: {
                    constraintSet$Constraint0.propertySet.mProgress = f;
                    break;
                }
                case 69: {
                    constraintSet$Constraint0.layout.widthPercent = f;
                    break;
                }
                case 70: {
                    constraintSet$Constraint0.layout.heightPercent = f;
                    break;
                }
                case 0x4F: {
                    constraintSet$Constraint0.motion.mMotionStagger = f;
                    break;
                }
                case 85: {
                    constraintSet$Constraint0.motion.mQuantizeMotionPhase = f;
                    break;
                }
                case 87: {
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                }
            }
        }
        for(int v6 = 0; v6 < this.i; ++v6) {
            int v7 = this.g[v6];
            String s = this.h[v6];
            switch(v7) {
                case 5: {
                    constraintSet$Constraint0.layout.dimensionRatio = s;
                    break;
                }
                case 65: {
                    constraintSet$Constraint0.motion.mTransitionEasing = s;
                    break;
                }
                case 74: {
                    constraintSet$Constraint0.layout.mReferenceIdString = s;
                    constraintSet$Constraint0.layout.mReferenceIds = null;
                    break;
                }
                case 77: {
                    constraintSet$Constraint0.layout.mConstraintTag = s;
                    break;
                }
                case 87: {
                    break;
                }
                case 90: {
                    constraintSet$Constraint0.motion.mQuantizeInterpolatorString = s;
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                }
            }
        }
        for(int v = 0; v < this.l; ++v) {
            int v8 = this.j[v];
            boolean z = this.k[v];
            switch(v8) {
                case 44: {
                    constraintSet$Constraint0.transform.applyElevation = z;
                    break;
                }
                case 75: {
                    constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets = z;
                    break;
                }
                case 80: {
                    constraintSet$Constraint0.layout.constrainedWidth = z;
                    break;
                }
                case 81: {
                    constraintSet$Constraint0.layout.constrainedHeight = z;
                    break;
                }
                case 87: {
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                }
            }
        }
    }
}

