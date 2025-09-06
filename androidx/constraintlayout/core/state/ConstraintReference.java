package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintReference implements Reference {
    public interface ConstraintReferenceFactory {
        ConstraintReference create(State arg1);
    }

    public Object A;
    public Object B;
    public float C;
    public float D;
    public Constraint E;
    public Dimension F;
    public Dimension G;
    public Object H;
    public ConstraintWidget I;
    public final HashMap J;
    public HashMap K;
    public Object a;
    public final State b;
    public String c;
    public Facade d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    protected Object mBottomToBottom;
    protected Object mBottomToTop;
    protected Object mEndToEnd;
    protected Object mEndToStart;
    protected Object mLeftToLeft;
    protected Object mLeftToRight;
    protected int mMarginBottom;
    protected int mMarginBottomGone;
    protected int mMarginEnd;
    protected int mMarginEndGone;
    protected int mMarginLeft;
    protected int mMarginLeftGone;
    protected int mMarginRight;
    protected int mMarginRightGone;
    protected int mMarginStart;
    protected int mMarginStartGone;
    protected int mMarginTop;
    protected int mMarginTopGone;
    protected Object mRightToLeft;
    protected Object mRightToRight;
    protected Object mStartToEnd;
    protected Object mStartToStart;
    protected Object mTopToBottom;
    protected Object mTopToTop;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public int x;
    public Object y;
    public Object z;

    public ConstraintReference(State state0) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = -1.0f;
        this.h = -1.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.mMarginLeft = 0;
        this.mMarginRight = 0;
        this.mMarginStart = 0;
        this.mMarginEnd = 0;
        this.mMarginTop = 0;
        this.mMarginBottom = 0;
        this.mMarginLeftGone = 0;
        this.mMarginRightGone = 0;
        this.mMarginStartGone = 0;
        this.mMarginEndGone = 0;
        this.mMarginTopGone = 0;
        this.mMarginBottomGone = 0;
        this.k = 0;
        this.l = 0;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.t = NaNf;
        this.u = NaNf;
        this.v = NaNf;
        this.w = NaNf;
        this.x = 0;
        this.mLeftToLeft = null;
        this.mLeftToRight = null;
        this.mRightToLeft = null;
        this.mRightToRight = null;
        this.mStartToStart = null;
        this.mStartToEnd = null;
        this.mEndToStart = null;
        this.mEndToEnd = null;
        this.mTopToTop = null;
        this.mTopToBottom = null;
        this.mBottomToTop = null;
        this.mBottomToBottom = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.E = null;
        this.F = Dimension.Fixed(Dimension.WRAP_DIMENSION);
        this.G = Dimension.Fixed(Dimension.WRAP_DIMENSION);
        this.J = new HashMap();
        this.K = new HashMap();
        this.b = state0;
    }

    public final void a(ConstraintWidget constraintWidget0, Object object0, Constraint state$Constraint0) {
        ConstraintWidget constraintWidget1 = object0 instanceof Reference ? ((Reference)object0).getConstraintWidget() : null;
        if(constraintWidget1 == null) {
            return;
        }
        int v = a.a[state$Constraint0.ordinal()];
        switch(a.a[state$Constraint0.ordinal()]) {
            case 1: {
                constraintWidget0.getAnchor(Type.LEFT).connect(constraintWidget1.getAnchor(Type.LEFT), this.mMarginLeft, this.mMarginLeftGone, false);
                return;
            }
            case 2: {
                constraintWidget0.getAnchor(Type.LEFT).connect(constraintWidget1.getAnchor(Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                return;
            }
            case 3: {
                constraintWidget0.getAnchor(Type.RIGHT).connect(constraintWidget1.getAnchor(Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                return;
            }
            case 4: {
                constraintWidget0.getAnchor(Type.RIGHT).connect(constraintWidget1.getAnchor(Type.RIGHT), this.mMarginRight, this.mMarginRightGone, false);
                return;
            }
            case 5: {
                constraintWidget0.getAnchor(Type.LEFT).connect(constraintWidget1.getAnchor(Type.LEFT), this.mMarginStart, this.mMarginStartGone, false);
                return;
            }
            case 6: {
                constraintWidget0.getAnchor(Type.LEFT).connect(constraintWidget1.getAnchor(Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                return;
            }
            case 7: {
                constraintWidget0.getAnchor(Type.RIGHT).connect(constraintWidget1.getAnchor(Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                return;
            }
            case 8: {
                constraintWidget0.getAnchor(Type.RIGHT).connect(constraintWidget1.getAnchor(Type.RIGHT), this.mMarginEnd, this.mMarginEndGone, false);
                return;
            }
            case 9: {
                constraintWidget0.getAnchor(Type.TOP).connect(constraintWidget1.getAnchor(Type.TOP), this.mMarginTop, this.mMarginTopGone, false);
                return;
            }
            case 10: {
                constraintWidget0.getAnchor(Type.TOP).connect(constraintWidget1.getAnchor(Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                return;
            }
            case 11: {
                constraintWidget0.getAnchor(Type.BOTTOM).connect(constraintWidget1.getAnchor(Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                return;
            }
            case 12: {
                constraintWidget0.getAnchor(Type.BOTTOM).connect(constraintWidget1.getAnchor(Type.BOTTOM), this.mMarginBottom, this.mMarginBottomGone, false);
                return;
            }
            case 13: {
                constraintWidget0.immediateConnect(Type.BASELINE, constraintWidget1, Type.BOTTOM, this.k, this.l);
                return;
            }
            case 14: {
                constraintWidget0.immediateConnect(Type.BASELINE, constraintWidget1, Type.TOP, this.k, this.l);
                return;
            }
            case 15: {
                constraintWidget0.immediateConnect(Type.BASELINE, constraintWidget1, Type.BASELINE, this.k, this.l);
                return;
            }
            case 16: {
                constraintWidget0.connectCircularConstraint(constraintWidget1, this.C, ((int)this.D));
            }
        }
    }

    public void addCustomColor(String s, int v) {
        this.J.put(s, v);
    }

    public void addCustomFloat(String s, float f) {
        if(this.K == null) {
            this.K = new HashMap();
        }
        this.K.put(s, f);
    }

    public ConstraintReference alpha(float f) {
        this.u = f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if(this.I == null) {
            return;
        }
        Facade facade0 = this.d;
        if(facade0 != null) {
            facade0.apply();
        }
        this.F.apply(this.b, this.I, 0);
        this.G.apply(this.b, this.I, 1);
        this.mLeftToLeft = this.b(this.mLeftToLeft);
        this.mLeftToRight = this.b(this.mLeftToRight);
        this.mRightToLeft = this.b(this.mRightToLeft);
        this.mRightToRight = this.b(this.mRightToRight);
        this.mStartToStart = this.b(this.mStartToStart);
        this.mStartToEnd = this.b(this.mStartToEnd);
        this.mEndToStart = this.b(this.mEndToStart);
        this.mEndToEnd = this.b(this.mEndToEnd);
        this.mTopToTop = this.b(this.mTopToTop);
        this.mTopToBottom = this.b(this.mTopToBottom);
        this.mBottomToTop = this.b(this.mBottomToTop);
        this.mBottomToBottom = this.b(this.mBottomToBottom);
        this.y = this.b(this.y);
        this.z = this.b(this.z);
        this.A = this.b(this.A);
        this.a(this.I, this.mLeftToLeft, Constraint.LEFT_TO_LEFT);
        this.a(this.I, this.mLeftToRight, Constraint.LEFT_TO_RIGHT);
        this.a(this.I, this.mRightToLeft, Constraint.RIGHT_TO_LEFT);
        this.a(this.I, this.mRightToRight, Constraint.RIGHT_TO_RIGHT);
        this.a(this.I, this.mStartToStart, Constraint.START_TO_START);
        this.a(this.I, this.mStartToEnd, Constraint.START_TO_END);
        this.a(this.I, this.mEndToStart, Constraint.END_TO_START);
        this.a(this.I, this.mEndToEnd, Constraint.END_TO_END);
        this.a(this.I, this.mTopToTop, Constraint.TOP_TO_TOP);
        this.a(this.I, this.mTopToBottom, Constraint.TOP_TO_BOTTOM);
        this.a(this.I, this.mBottomToTop, Constraint.BOTTOM_TO_TOP);
        this.a(this.I, this.mBottomToBottom, Constraint.BOTTOM_TO_BOTTOM);
        this.a(this.I, this.y, Constraint.BASELINE_TO_BASELINE);
        this.a(this.I, this.z, Constraint.BASELINE_TO_TOP);
        this.a(this.I, this.A, Constraint.BASELINE_TO_BOTTOM);
        this.a(this.I, this.B, Constraint.CIRCULAR_CONSTRAINT);
        int v = this.e;
        if(v != 0) {
            this.I.setHorizontalChainStyle(v);
        }
        int v1 = this.f;
        if(v1 != 0) {
            this.I.setVerticalChainStyle(v1);
        }
        float f = this.g;
        if(f != -1.0f) {
            this.I.setHorizontalWeight(f);
        }
        float f1 = this.h;
        if(f1 != -1.0f) {
            this.I.setVerticalWeight(f1);
        }
        this.I.setHorizontalBiasPercent(this.i);
        this.I.setVerticalBiasPercent(this.j);
        this.I.frame.pivotX = this.m;
        this.I.frame.pivotY = this.n;
        this.I.frame.rotationX = this.o;
        this.I.frame.rotationY = this.p;
        this.I.frame.rotationZ = this.q;
        this.I.frame.translationX = this.r;
        this.I.frame.translationY = this.s;
        this.I.frame.translationZ = this.t;
        this.I.frame.scaleX = this.v;
        this.I.frame.scaleY = this.w;
        this.I.frame.alpha = this.u;
        this.I.frame.visibility = this.x;
        this.I.setVisibility(this.x);
        HashMap hashMap0 = this.J;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.keySet()) {
                Integer integer0 = (Integer)hashMap0.get(((String)object0));
                this.I.frame.setCustomAttribute(((String)object0), 902, ((int)integer0));
            }
        }
        HashMap hashMap1 = this.K;
        if(hashMap1 != null) {
            for(Object object1: hashMap1.keySet()) {
                float f2 = (float)(((Float)this.K.get(((String)object1))));
                this.I.frame.setCustomAttribute(((String)object1), 901, f2);
            }
        }
    }

    public final Object b(Object object0) {
        if(object0 == null) {
            return null;
        }
        return !(object0 instanceof ConstraintReference) ? ((Reference)this.b.mReferences.get(object0)) : object0;
    }

    public ConstraintReference baseline() {
        this.E = Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object object0) {
        this.E = Constraint.BASELINE_TO_BASELINE;
        this.y = object0;
        return this;
    }

    public ConstraintReference baselineToBottom(Object object0) {
        this.E = Constraint.BASELINE_TO_BOTTOM;
        this.A = object0;
        return this;
    }

    public ConstraintReference baselineToTop(Object object0) {
        this.E = Constraint.BASELINE_TO_TOP;
        this.z = object0;
        return this;
    }

    public ConstraintReference bias(float f) {
        Constraint state$Constraint0 = this.E;
        if(state$Constraint0 == null) {
            return this;
        }
        switch(a.a[state$Constraint0.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 17: {
                this.i = f;
                return this;
            }
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 18: {
                this.j = f;
                return this;
            }
            default: {
                return this;
            }
        }
    }

    public ConstraintReference bottom() {
        if(this.mBottomToTop != null) {
            this.E = Constraint.BOTTOM_TO_TOP;
            return this;
        }
        this.E = Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public ConstraintReference bottomToBottom(Object object0) {
        this.E = Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = object0;
        return this;
    }

    public ConstraintReference bottomToTop(Object object0) {
        this.E = Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = object0;
        return this;
    }

    public ConstraintReference centerHorizontally(Object object0) {
        Object object1 = this.b(object0);
        this.mStartToStart = object1;
        this.mEndToEnd = object1;
        this.E = Constraint.CENTER_HORIZONTALLY;
        this.i = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object object0) {
        Object object1 = this.b(object0);
        this.mTopToTop = object1;
        this.mBottomToBottom = object1;
        this.E = Constraint.CENTER_VERTICALLY;
        this.j = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object object0, float f, float f1) {
        this.B = this.b(object0);
        this.C = f;
        this.D = f1;
        this.E = Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference clear() {
        Constraint state$Constraint0 = this.E;
        if(state$Constraint0 != null) {
            switch(a.a[state$Constraint0.ordinal()]) {
                case 1: 
                case 2: {
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    return this;
                }
                case 3: 
                case 4: {
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    return this;
                }
                case 5: 
                case 6: {
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    return this;
                }
                case 7: 
                case 8: {
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    return this;
                }
                case 9: 
                case 10: {
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    return this;
                }
                case 11: 
                case 12: {
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    return this;
                }
                case 15: {
                    this.y = null;
                    return this;
                }
                case 16: {
                    this.B = null;
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.mLeftToLeft = null;
        this.mLeftToRight = null;
        this.mMarginLeft = 0;
        this.mRightToLeft = null;
        this.mRightToRight = null;
        this.mMarginRight = 0;
        this.mStartToStart = null;
        this.mStartToEnd = null;
        this.mMarginStart = 0;
        this.mEndToStart = null;
        this.mEndToEnd = null;
        this.mMarginEnd = 0;
        this.mTopToTop = null;
        this.mTopToBottom = null;
        this.mMarginTop = 0;
        this.mBottomToTop = null;
        this.mBottomToBottom = null;
        this.mMarginBottom = 0;
        this.y = null;
        this.B = null;
        this.i = 0.5f;
        this.j = 0.5f;
        this.mMarginLeftGone = 0;
        this.mMarginRightGone = 0;
        this.mMarginStartGone = 0;
        this.mMarginEndGone = 0;
        this.mMarginTopGone = 0;
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clearHorizontal() {
        this.start().clear();
        this.end().clear();
        this.left().clear();
        this.right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        this.top().clear();
        this.baseline().clear();
        this.bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(this.getWidth().d, this.getHeight().d);
    }

    public ConstraintReference end() {
        if(this.mEndToStart != null) {
            this.E = Constraint.END_TO_START;
            return this;
        }
        this.E = Constraint.END_TO_END;
        return this;
    }

    public ConstraintReference endToEnd(Object object0) {
        this.E = Constraint.END_TO_END;
        this.mEndToEnd = object0;
        return this;
    }

    public ConstraintReference endToStart(Object object0) {
        this.E = Constraint.END_TO_START;
        this.mEndToStart = object0;
        return this;
    }

    public float getAlpha() {
        return this.u;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if(this.I == null) {
            ConstraintWidget constraintWidget0 = this.createConstraintWidget();
            this.I = constraintWidget0;
            constraintWidget0.setCompanionWidget(this.H);
        }
        return this.I;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return this.d;
    }

    public Dimension getHeight() {
        return this.G;
    }

    public int getHorizontalChainStyle() {
        return this.e;
    }

    public float getHorizontalChainWeight() {
        return this.g;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.a;
    }

    public float getPivotX() {
        return this.m;
    }

    public float getPivotY() {
        return this.n;
    }

    public float getRotationX() {
        return this.o;
    }

    public float getRotationY() {
        return this.p;
    }

    public float getRotationZ() {
        return this.q;
    }

    public float getScaleX() {
        return this.v;
    }

    public float getScaleY() {
        return this.w;
    }

    public String getTag() {
        return this.c;
    }

    public float getTranslationX() {
        return this.r;
    }

    public float getTranslationY() {
        return this.s;
    }

    public float getTranslationZ() {
        return this.t;
    }

    public int getVerticalChainStyle(int v) {
        return this.f;
    }

    public float getVerticalChainWeight() {
        return this.h;
    }

    public Object getView() {
        return this.H;
    }

    public Dimension getWidth() {
        return this.F;
    }

    public ConstraintReference height(Dimension dimension0) {
        return this.setHeight(dimension0);
    }

    public ConstraintReference horizontalBias(float f) {
        this.i = f;
        return this;
    }

    public ConstraintReference left() {
        if(this.mLeftToLeft != null) {
            this.E = Constraint.LEFT_TO_LEFT;
            return this;
        }
        this.E = Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public ConstraintReference leftToLeft(Object object0) {
        this.E = Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = object0;
        return this;
    }

    public ConstraintReference leftToRight(Object object0) {
        this.E = Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = object0;
        return this;
    }

    public ConstraintReference margin(int v) {
        Constraint state$Constraint0 = this.E;
        if(state$Constraint0 != null) {
            switch(state$Constraint0) {
                case 1: 
                case 2: {
                    this.mMarginLeft = v;
                    return this;
                }
                case 3: 
                case 4: {
                    this.mMarginRight = v;
                    return this;
                }
                case 5: 
                case 6: {
                    this.mMarginStart = v;
                    return this;
                }
                case 7: 
                case 8: {
                    this.mMarginEnd = v;
                    return this;
                }
                case 9: 
                case 10: {
                    this.mMarginTop = v;
                    return this;
                }
                case 11: 
                case 12: {
                    this.mMarginBottom = v;
                    return this;
                }
                case 13: 
                case 14: 
                case 15: {
                    this.k = v;
                    return this;
                }
                case 16: {
                    this.D = (float)v;
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.mMarginLeft = v;
        this.mMarginRight = v;
        this.mMarginStart = v;
        this.mMarginEnd = v;
        this.mMarginTop = v;
        this.mMarginBottom = v;
        return this;
    }

    public ConstraintReference margin(Object object0) {
        return this.margin(this.b.convertDimension(object0));
    }

    public ConstraintReference marginGone(int v) {
        Constraint state$Constraint0 = this.E;
        if(state$Constraint0 != null) {
            switch(state$Constraint0) {
                case 1: 
                case 2: {
                    this.mMarginLeftGone = v;
                    return this;
                }
                case 3: 
                case 4: {
                    this.mMarginRightGone = v;
                    return this;
                }
                case 5: 
                case 6: {
                    this.mMarginStartGone = v;
                    return this;
                }
                case 7: 
                case 8: {
                    this.mMarginEndGone = v;
                    return this;
                }
                case 9: 
                case 10: {
                    this.mMarginTopGone = v;
                    return this;
                }
                case 11: 
                case 12: {
                    this.mMarginBottomGone = v;
                    return this;
                }
                case 13: 
                case 14: 
                case 15: {
                    this.l = v;
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.mMarginLeftGone = v;
        this.mMarginRightGone = v;
        this.mMarginStartGone = v;
        this.mMarginEndGone = v;
        this.mMarginTopGone = v;
        this.mMarginBottomGone = v;
        return this;
    }

    public ConstraintReference marginGone(Object object0) {
        return this.marginGone(this.b.convertDimension(object0));
    }

    public ConstraintReference pivotX(float f) {
        this.m = f;
        return this;
    }

    public ConstraintReference pivotY(float f) {
        this.n = f;
        return this;
    }

    public ConstraintReference right() {
        if(this.mRightToLeft != null) {
            this.E = Constraint.RIGHT_TO_LEFT;
            return this;
        }
        this.E = Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public ConstraintReference rightToLeft(Object object0) {
        this.E = Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = object0;
        return this;
    }

    public ConstraintReference rightToRight(Object object0) {
        this.E = Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = object0;
        return this;
    }

    public ConstraintReference rotationX(float f) {
        this.o = f;
        return this;
    }

    public ConstraintReference rotationY(float f) {
        this.p = f;
        return this;
    }

    public ConstraintReference rotationZ(float f) {
        this.q = f;
        return this;
    }

    public ConstraintReference scaleX(float f) {
        this.v = f;
        return this;
    }

    public ConstraintReference scaleY(float f) {
        this.w = f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 == null) {
            return;
        }
        this.I = constraintWidget0;
        constraintWidget0.setCompanionWidget(this.H);
    }

    public void setFacade(Facade facade0) {
        this.d = facade0;
        if(facade0 != null) {
            this.setConstraintWidget(facade0.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension0) {
        this.G = dimension0;
        return this;
    }

    public void setHorizontalChainStyle(int v) {
        this.e = v;
    }

    public void setHorizontalChainWeight(float f) {
        this.g = f;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void setKey(Object object0) {
        this.a = object0;
    }

    public void setTag(String s) {
        this.c = s;
    }

    public void setVerticalChainStyle(int v) {
        this.f = v;
    }

    public void setVerticalChainWeight(float f) {
        this.h = f;
    }

    public void setView(Object object0) {
        this.H = object0;
        ConstraintWidget constraintWidget0 = this.I;
        if(constraintWidget0 != null) {
            constraintWidget0.setCompanionWidget(object0);
        }
    }

    public ConstraintReference setWidth(Dimension dimension0) {
        this.F = dimension0;
        return this;
    }

    public ConstraintReference start() {
        if(this.mStartToStart != null) {
            this.E = Constraint.START_TO_START;
            return this;
        }
        this.E = Constraint.START_TO_END;
        return this;
    }

    public ConstraintReference startToEnd(Object object0) {
        this.E = Constraint.START_TO_END;
        this.mStartToEnd = object0;
        return this;
    }

    public ConstraintReference startToStart(Object object0) {
        this.E = Constraint.START_TO_START;
        this.mStartToStart = object0;
        return this;
    }

    public ConstraintReference top() {
        if(this.mTopToTop != null) {
            this.E = Constraint.TOP_TO_TOP;
            return this;
        }
        this.E = Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public ConstraintReference topToBottom(Object object0) {
        this.E = Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = object0;
        return this;
    }

    public ConstraintReference topToTop(Object object0) {
        this.E = Constraint.TOP_TO_TOP;
        this.mTopToTop = object0;
        return this;
    }

    public ConstraintReference translationX(float f) {
        this.r = f;
        return this;
    }

    public ConstraintReference translationY(float f) {
        this.s = f;
        return this;
    }

    public ConstraintReference translationZ(float f) {
        this.t = f;
        return this;
    }

    public void validate() throws b {
        ArrayList arrayList0 = new ArrayList();
        if(this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList0.add("LeftToLeft and LeftToRight both defined");
        }
        if(this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList0.add("RightToLeft and RightToRight both defined");
        }
        if(this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList0.add("StartToStart and StartToEnd both defined");
        }
        if(this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList0.add("EndToStart and EndToEnd both defined");
        }
        if((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList0.add("Both left/right and start/end constraints defined");
        }
        if(arrayList0.size() > 0) {
            throw new b(arrayList0);
        }
    }

    public ConstraintReference verticalBias(float f) {
        this.j = f;
        return this;
    }

    public ConstraintReference visibility(int v) {
        this.x = v;
        return this;
    }

    public ConstraintReference width(Dimension dimension0) {
        return this.setWidth(dimension0);
    }
}

