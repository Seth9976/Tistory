package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class ReactiveGuide extends View implements SharedValuesListener {
    public int a;
    public boolean b;
    public int c;
    public boolean d;

    public ReactiveGuide(Context context0) {
        super(context0);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        this.a(null);
    }

    public ReactiveGuide(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        this.a(attributeSet0);
    }

    public ReactiveGuide(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        this.a(attributeSet0);
    }

    public ReactiveGuide(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        this.a(attributeSet0);
    }

    public final void a(AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_ReactiveGuide);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.a = typedArray0.getResourceId(v2, this.a);
                }
                else if(v2 == styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.b = typedArray0.getBoolean(v2, this.b);
                }
                else if(v2 == styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.c = typedArray0.getResourceId(v2, this.c);
                }
                else if(v2 == styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.d = typedArray0.getBoolean(v2, this.d);
                }
            }
            typedArray0.recycle();
        }
        if(this.a != -1) {
            ConstraintLayout.getSharedValues().addListener(this.a, this);
        }
    }

    @Override  // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas0) {
    }

    public int getApplyToConstraintSetId() {
        return this.c;
    }

    public int getAttributeId() {
        return this.a;
    }

    public boolean isAnimatingChange() {
        return this.b;
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // androidx.constraintlayout.widget.SharedValues$SharedValuesListener
    public void onNewValue(int v, int v1, int v2) {
        this.setGuidelineBegin(v1);
        int v3 = this.getId();
        if(v3 <= 0) {
            return;
        }
        if(this.getParent() instanceof MotionLayout) {
            MotionLayout motionLayout0 = (MotionLayout)this.getParent();
            int v4 = motionLayout0.getCurrentState();
            int v5 = this.c;
            if(v5 != 0) {
                v4 = v5;
            }
            int v6 = 0;
            if(this.b) {
                if(this.d) {
                    int[] arr_v = motionLayout0.getConstraintSetIds();
                    while(v6 < arr_v.length) {
                        int v7 = arr_v[v6];
                        if(v7 != v4) {
                            ConstraintSet constraintSet0 = motionLayout0.getConstraintSet(v7);
                            constraintSet0.setGuidelineEnd(v3, v1);
                            motionLayout0.updateState(v7, constraintSet0);
                        }
                        ++v6;
                    }
                }
                ConstraintSet constraintSet1 = motionLayout0.cloneConstraintSet(v4);
                constraintSet1.setGuidelineEnd(v3, v1);
                motionLayout0.updateStateAnimate(v4, constraintSet1, 1000);
                return;
            }
            if(this.d) {
                int[] arr_v1 = motionLayout0.getConstraintSetIds();
                while(v6 < arr_v1.length) {
                    int v8 = arr_v1[v6];
                    ConstraintSet constraintSet2 = motionLayout0.getConstraintSet(v8);
                    constraintSet2.setGuidelineEnd(v3, v1);
                    motionLayout0.updateState(v8, constraintSet2);
                    ++v6;
                }
                return;
            }
            ConstraintSet constraintSet3 = motionLayout0.getConstraintSet(v4);
            constraintSet3.setGuidelineEnd(v3, v1);
            motionLayout0.updateState(v4, constraintSet3);
        }
    }

    public void setAnimateChange(boolean z) {
        this.b = z;
    }

    public void setApplyToConstraintSetId(int v) {
        this.c = v;
    }

    public void setAttributeId(int v) {
        SharedValues sharedValues0 = ConstraintLayout.getSharedValues();
        int v1 = this.a;
        if(v1 != -1) {
            sharedValues0.removeListener(v1, this);
        }
        this.a = v;
        if(v != -1) {
            sharedValues0.addListener(v, this);
        }
    }

    public void setGuidelineBegin(int v) {
        LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams0.guideBegin = v;
        this.setLayoutParams(constraintLayout$LayoutParams0);
    }

    public void setGuidelineEnd(int v) {
        LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams0.guideEnd = v;
        this.setLayoutParams(constraintLayout$LayoutParams0);
    }

    public void setGuidelinePercent(float f) {
        LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams0.guidePercent = f;
        this.setLayoutParams(constraintLayout$LayoutParams0);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
    }
}

