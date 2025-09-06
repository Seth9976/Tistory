package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;

public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    public final LayoutParams a;
    public final View b;

    public ConstraintProperties(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.a = (LayoutParams)viewGroup$LayoutParams0;
        this.b = view0;
    }

    public static String a(int v) {
        switch(v) {
            case 1: {
                return "left";
            }
            case 2: {
                return "right";
            }
            case 3: {
                return "top";
            }
            case 4: {
                return "bottom";
            }
            case 5: {
                return "baseline";
            }
            case 6: {
                return "start";
            }
            case 7: {
                return "end";
            }
            default: {
                return "undefined";
            }
        }
    }

    public ConstraintProperties addToHorizontalChain(int v, int v1) {
        this.connect(1, v, (v == 0 ? 1 : 2), 0);
        this.connect(2, v1, (v1 == 0 ? 2 : 1), 0);
        View view0 = this.b;
        if(v != 0) {
            new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v)).connect(2, view0.getId(), 1, 0);
        }
        if(v1 != 0) {
            new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v1)).connect(1, view0.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperties addToHorizontalChainRTL(int v, int v1) {
        this.connect(6, v, (v == 0 ? 6 : 7), 0);
        this.connect(7, v1, (v1 == 0 ? 7 : 6), 0);
        View view0 = this.b;
        if(v != 0) {
            new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v)).connect(7, view0.getId(), 6, 0);
        }
        if(v1 != 0) {
            new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v1)).connect(6, view0.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperties addToVerticalChain(int v, int v1) {
        this.connect(3, v, (v == 0 ? 3 : 4), 0);
        this.connect(4, v1, (v1 == 0 ? 4 : 3), 0);
        View view0 = this.b;
        if(v != 0) {
            new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v)).connect(4, view0.getId(), 3, 0);
        }
        if(v1 != 0) {
            new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v1)).connect(3, view0.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperties alpha(float f) {
        this.b.setAlpha(f);
        return this;
    }

    public void apply() {
    }

    public ConstraintProperties center(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        if(v2 < 0 || v5 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if(f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        if(v1 != 1 && v1 != 2) {
            if(v1 != 6 && v1 != 7) {
                this.connect(3, v, v1, v2);
                this.connect(4, v3, v4, v5);
                constraintLayout$LayoutParams0.verticalBias = f;
                return this;
            }
            this.connect(6, v, v1, v2);
            this.connect(7, v3, v4, v5);
            constraintLayout$LayoutParams0.horizontalBias = f;
            return this;
        }
        this.connect(1, v, v1, v2);
        this.connect(2, v3, v4, v5);
        constraintLayout$LayoutParams0.horizontalBias = f;
        return this;
    }

    public ConstraintProperties centerHorizontally(int v) {
        if(v == 0) {
            this.center(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        this.center(v, 2, 0, v, 1, 0, 0.5f);
        return this;
    }

    public ConstraintProperties centerHorizontally(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        this.connect(1, v, v1, v2);
        this.connect(2, v3, v4, v5);
        this.a.horizontalBias = f;
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int v) {
        if(v == 0) {
            this.center(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        this.center(v, 7, 0, v, 6, 0, 0.5f);
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        this.connect(6, v, v1, v2);
        this.connect(7, v3, v4, v5);
        this.a.horizontalBias = f;
        return this;
    }

    public ConstraintProperties centerVertically(int v) {
        if(v == 0) {
            this.center(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        this.center(v, 4, 0, v, 3, 0, 0.5f);
        return this;
    }

    public ConstraintProperties centerVertically(int v, int v1, int v2, int v3, int v4, int v5, float f) {
        this.connect(3, v, v1, v2);
        this.connect(4, v3, v4, v5);
        this.a.verticalBias = f;
        return this;
    }

    public ConstraintProperties connect(int v, int v1, int v2, int v3) {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        switch(v) {
            case 1: {
                if(v2 == 1) {
                    constraintLayout$LayoutParams0.leftToLeft = v1;
                    constraintLayout$LayoutParams0.leftToRight = -1;
                }
                else if(v2 == 2) {
                    constraintLayout$LayoutParams0.leftToRight = v1;
                    constraintLayout$LayoutParams0.leftToLeft = -1;
                }
                else {
                    throw new IllegalArgumentException("Left to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.leftMargin = v3;
                return this;
            }
            case 2: {
                if(v2 == 1) {
                    constraintLayout$LayoutParams0.rightToLeft = v1;
                    constraintLayout$LayoutParams0.rightToRight = -1;
                }
                else if(v2 == 2) {
                    constraintLayout$LayoutParams0.rightToRight = v1;
                    constraintLayout$LayoutParams0.rightToLeft = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.rightMargin = v3;
                return this;
            }
            case 3: {
                if(v2 == 3) {
                    constraintLayout$LayoutParams0.topToTop = v1;
                    constraintLayout$LayoutParams0.topToBottom = -1;
                    constraintLayout$LayoutParams0.baselineToBaseline = -1;
                    constraintLayout$LayoutParams0.baselineToTop = -1;
                    constraintLayout$LayoutParams0.baselineToBottom = -1;
                }
                else if(v2 == 4) {
                    constraintLayout$LayoutParams0.topToBottom = v1;
                    constraintLayout$LayoutParams0.topToTop = -1;
                    constraintLayout$LayoutParams0.baselineToBaseline = -1;
                    constraintLayout$LayoutParams0.baselineToTop = -1;
                    constraintLayout$LayoutParams0.baselineToBottom = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.topMargin = v3;
                return this;
            }
            case 4: {
                if(v2 == 4) {
                    constraintLayout$LayoutParams0.bottomToBottom = v1;
                    constraintLayout$LayoutParams0.bottomToTop = -1;
                    constraintLayout$LayoutParams0.baselineToBaseline = -1;
                    constraintLayout$LayoutParams0.baselineToTop = -1;
                    constraintLayout$LayoutParams0.baselineToBottom = -1;
                }
                else if(v2 == 3) {
                    constraintLayout$LayoutParams0.bottomToTop = v1;
                    constraintLayout$LayoutParams0.bottomToBottom = -1;
                    constraintLayout$LayoutParams0.baselineToBaseline = -1;
                    constraintLayout$LayoutParams0.baselineToTop = -1;
                    constraintLayout$LayoutParams0.baselineToBottom = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.bottomMargin = v3;
                return this;
            }
            case 5: {
                if(v2 == 5) {
                    constraintLayout$LayoutParams0.baselineToBaseline = v1;
                    constraintLayout$LayoutParams0.bottomToBottom = -1;
                    constraintLayout$LayoutParams0.bottomToTop = -1;
                    constraintLayout$LayoutParams0.topToTop = -1;
                    constraintLayout$LayoutParams0.topToBottom = -1;
                }
                if(v2 == 3) {
                    constraintLayout$LayoutParams0.baselineToTop = v1;
                    constraintLayout$LayoutParams0.bottomToBottom = -1;
                    constraintLayout$LayoutParams0.bottomToTop = -1;
                    constraintLayout$LayoutParams0.topToTop = -1;
                    constraintLayout$LayoutParams0.topToBottom = -1;
                }
                else if(v2 == 4) {
                    constraintLayout$LayoutParams0.baselineToBottom = v1;
                    constraintLayout$LayoutParams0.bottomToBottom = -1;
                    constraintLayout$LayoutParams0.bottomToTop = -1;
                    constraintLayout$LayoutParams0.topToTop = -1;
                    constraintLayout$LayoutParams0.topToBottom = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.baselineMargin = v3;
                return this;
            }
            case 6: {
                if(v2 == 6) {
                    constraintLayout$LayoutParams0.startToStart = v1;
                    constraintLayout$LayoutParams0.startToEnd = -1;
                }
                else if(v2 == 7) {
                    constraintLayout$LayoutParams0.startToEnd = v1;
                    constraintLayout$LayoutParams0.startToStart = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.setMarginStart(v3);
                return this;
            }
            case 7: {
                if(v2 == 7) {
                    constraintLayout$LayoutParams0.endToEnd = v1;
                    constraintLayout$LayoutParams0.endToStart = -1;
                }
                else if(v2 == 6) {
                    constraintLayout$LayoutParams0.endToStart = v1;
                    constraintLayout$LayoutParams0.endToEnd = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintProperties.a(v2) + " undefined");
                }
                constraintLayout$LayoutParams0.setMarginEnd(v3);
                return this;
            }
            default: {
                throw new IllegalArgumentException(ConstraintProperties.a(v) + " to " + ConstraintProperties.a(v2) + " unknown");
            }
        }
    }

    public ConstraintProperties constrainDefaultHeight(int v) {
        this.a.matchConstraintDefaultHeight = v;
        return this;
    }

    public ConstraintProperties constrainDefaultWidth(int v) {
        this.a.matchConstraintDefaultWidth = v;
        return this;
    }

    public ConstraintProperties constrainHeight(int v) {
        this.a.height = v;
        return this;
    }

    public ConstraintProperties constrainMaxHeight(int v) {
        this.a.matchConstraintMaxHeight = v;
        return this;
    }

    public ConstraintProperties constrainMaxWidth(int v) {
        this.a.matchConstraintMaxWidth = v;
        return this;
    }

    public ConstraintProperties constrainMinHeight(int v) {
        this.a.matchConstraintMinHeight = v;
        return this;
    }

    public ConstraintProperties constrainMinWidth(int v) {
        this.a.matchConstraintMinWidth = v;
        return this;
    }

    public ConstraintProperties constrainWidth(int v) {
        this.a.width = v;
        return this;
    }

    public ConstraintProperties dimensionRatio(String s) {
        this.a.dimensionRatio = s;
        return this;
    }

    public ConstraintProperties elevation(float f) {
        this.b.setElevation(f);
        return this;
    }

    public ConstraintProperties goneMargin(int v, int v1) {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        switch(v) {
            case 1: {
                constraintLayout$LayoutParams0.goneLeftMargin = v1;
                return this;
            }
            case 2: {
                constraintLayout$LayoutParams0.goneRightMargin = v1;
                return this;
            }
            case 3: {
                constraintLayout$LayoutParams0.goneTopMargin = v1;
                return this;
            }
            case 4: {
                constraintLayout$LayoutParams0.goneBottomMargin = v1;
                return this;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 6: {
                constraintLayout$LayoutParams0.goneStartMargin = v1;
                return this;
            }
            case 7: {
                constraintLayout$LayoutParams0.goneEndMargin = v1;
                return this;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public ConstraintProperties horizontalBias(float f) {
        this.a.horizontalBias = f;
        return this;
    }

    public ConstraintProperties horizontalChainStyle(int v) {
        this.a.horizontalChainStyle = v;
        return this;
    }

    public ConstraintProperties horizontalWeight(float f) {
        this.a.horizontalWeight = f;
        return this;
    }

    public ConstraintProperties margin(int v, int v1) {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        switch(v) {
            case 1: {
                constraintLayout$LayoutParams0.leftMargin = v1;
                return this;
            }
            case 2: {
                constraintLayout$LayoutParams0.rightMargin = v1;
                return this;
            }
            case 3: {
                constraintLayout$LayoutParams0.topMargin = v1;
                return this;
            }
            case 4: {
                constraintLayout$LayoutParams0.bottomMargin = v1;
                return this;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 6: {
                constraintLayout$LayoutParams0.setMarginStart(v1);
                return this;
            }
            case 7: {
                constraintLayout$LayoutParams0.setMarginEnd(v1);
                return this;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public ConstraintProperties removeConstraints(int v) {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        switch(v) {
            case 1: {
                constraintLayout$LayoutParams0.leftToRight = -1;
                constraintLayout$LayoutParams0.leftToLeft = -1;
                constraintLayout$LayoutParams0.leftMargin = -1;
                constraintLayout$LayoutParams0.goneLeftMargin = 0x80000000;
                return this;
            }
            case 2: {
                constraintLayout$LayoutParams0.rightToRight = -1;
                constraintLayout$LayoutParams0.rightToLeft = -1;
                constraintLayout$LayoutParams0.rightMargin = -1;
                constraintLayout$LayoutParams0.goneRightMargin = 0x80000000;
                return this;
            }
            case 3: {
                constraintLayout$LayoutParams0.topToBottom = -1;
                constraintLayout$LayoutParams0.topToTop = -1;
                constraintLayout$LayoutParams0.topMargin = -1;
                constraintLayout$LayoutParams0.goneTopMargin = 0x80000000;
                return this;
            }
            case 4: {
                constraintLayout$LayoutParams0.bottomToTop = -1;
                constraintLayout$LayoutParams0.bottomToBottom = -1;
                constraintLayout$LayoutParams0.bottomMargin = -1;
                constraintLayout$LayoutParams0.goneBottomMargin = 0x80000000;
                return this;
            }
            case 5: {
                constraintLayout$LayoutParams0.baselineToBaseline = -1;
                return this;
            }
            case 6: {
                constraintLayout$LayoutParams0.startToEnd = -1;
                constraintLayout$LayoutParams0.startToStart = -1;
                constraintLayout$LayoutParams0.setMarginStart(-1);
                constraintLayout$LayoutParams0.goneStartMargin = 0x80000000;
                return this;
            }
            case 7: {
                constraintLayout$LayoutParams0.endToStart = -1;
                constraintLayout$LayoutParams0.endToEnd = -1;
                constraintLayout$LayoutParams0.setMarginEnd(-1);
                constraintLayout$LayoutParams0.goneEndMargin = 0x80000000;
                return this;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public ConstraintProperties removeFromHorizontalChain() {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        int v = constraintLayout$LayoutParams0.leftToRight;
        int v1 = constraintLayout$LayoutParams0.rightToLeft;
        View view0 = this.b;
        if(v == -1 && v1 == -1) {
            int v2 = constraintLayout$LayoutParams0.startToEnd;
            int v3 = constraintLayout$LayoutParams0.endToStart;
            if(v2 != -1 || v3 != -1) {
                ConstraintProperties constraintProperties0 = new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v2));
                ConstraintProperties constraintProperties1 = new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v3));
                if(v2 != -1 && v3 != -1) {
                    constraintProperties0.connect(7, v3, 6, 0);
                    constraintProperties1.connect(6, -1, 7, 0);
                }
                else if(v3 != -1) {
                    int v4 = constraintLayout$LayoutParams0.rightToRight;
                    if(v4 == -1) {
                        int v5 = constraintLayout$LayoutParams0.leftToLeft;
                        if(v5 != -1) {
                            constraintProperties1.connect(6, v5, 6, 0);
                        }
                    }
                    else {
                        constraintProperties0.connect(7, v4, 7, 0);
                    }
                }
            }
            this.removeConstraints(6);
            this.removeConstraints(7);
            return this;
        }
        ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v));
        ConstraintProperties constraintProperties3 = new ConstraintProperties(((ViewGroup)view0.getParent()).findViewById(v1));
        if(v != -1 && v1 != -1) {
            constraintProperties2.connect(2, v1, 1, 0);
            constraintProperties3.connect(1, v, 2, 0);
        }
        else if(v != -1 || v1 != -1) {
            int v6 = constraintLayout$LayoutParams0.rightToRight;
            if(v6 == -1) {
                int v7 = constraintLayout$LayoutParams0.leftToLeft;
                if(v7 != -1) {
                    constraintProperties3.connect(1, v7, 1, 0);
                }
            }
            else {
                constraintProperties2.connect(2, v6, 2, 0);
            }
        }
        this.removeConstraints(1);
        this.removeConstraints(2);
        return this;
    }

    public ConstraintProperties removeFromVerticalChain() {
        LayoutParams constraintLayout$LayoutParams0 = this.a;
        int v = constraintLayout$LayoutParams0.topToBottom;
        int v1 = constraintLayout$LayoutParams0.bottomToTop;
        if(v != -1 || v1 != -1) {
            ConstraintProperties constraintProperties0 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v));
            ConstraintProperties constraintProperties1 = new ConstraintProperties(((ViewGroup)this.b.getParent()).findViewById(v1));
            if(v != -1 && v1 != -1) {
                constraintProperties0.connect(4, v1, 3, 0);
                constraintProperties1.connect(3, v, 4, 0);
            }
            else if(v != -1 || v1 != -1) {
                int v2 = constraintLayout$LayoutParams0.bottomToBottom;
                if(v2 == -1) {
                    int v3 = constraintLayout$LayoutParams0.topToTop;
                    if(v3 != -1) {
                        constraintProperties1.connect(3, v3, 3, 0);
                    }
                }
                else {
                    constraintProperties0.connect(4, v2, 4, 0);
                }
            }
        }
        this.removeConstraints(3);
        this.removeConstraints(4);
        return this;
    }

    public ConstraintProperties rotation(float f) {
        this.b.setRotation(f);
        return this;
    }

    public ConstraintProperties rotationX(float f) {
        this.b.setRotationX(f);
        return this;
    }

    public ConstraintProperties rotationY(float f) {
        this.b.setRotationY(f);
        return this;
    }

    public ConstraintProperties scaleX(float f) {
        this.b.setScaleY(f);
        return this;
    }

    public ConstraintProperties scaleY(float f) {
        return this;
    }

    public ConstraintProperties transformPivot(float f, float f1) {
        this.b.setPivotX(f);
        this.b.setPivotY(f1);
        return this;
    }

    public ConstraintProperties transformPivotX(float f) {
        this.b.setPivotX(f);
        return this;
    }

    public ConstraintProperties transformPivotY(float f) {
        this.b.setPivotY(f);
        return this;
    }

    public ConstraintProperties translation(float f, float f1) {
        this.b.setTranslationX(f);
        this.b.setTranslationY(f1);
        return this;
    }

    public ConstraintProperties translationX(float f) {
        this.b.setTranslationX(f);
        return this;
    }

    public ConstraintProperties translationY(float f) {
        this.b.setTranslationY(f);
        return this;
    }

    public ConstraintProperties translationZ(float f) {
        this.b.setTranslationZ(f);
        return this;
    }

    public ConstraintProperties verticalBias(float f) {
        this.a.verticalBias = f;
        return this;
    }

    public ConstraintProperties verticalChainStyle(int v) {
        this.a.verticalChainStyle = v;
        return this;
    }

    public ConstraintProperties verticalWeight(float f) {
        this.a.verticalWeight = f;
        return this;
    }

    public ConstraintProperties visibility(int v) {
        this.b.setVisibility(v);
        return this;
    }
}

