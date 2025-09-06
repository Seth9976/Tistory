package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class Dimension {
    public static enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT;

    }

    public static final Object FIXED_DIMENSION;
    public static final Object PARENT_DIMENSION;
    public static final Object PERCENT_DIMENSION;
    public static final Object RATIO_DIMENSION;
    public static final Object SPREAD_DIMENSION;
    public static final Object WRAP_DIMENSION;
    public int a;
    public int b;
    public float c;
    public int d;
    public String e;
    public Object f;
    public boolean g;

    static {
        Dimension.FIXED_DIMENSION = new Object();
        Dimension.WRAP_DIMENSION = new Object();
        Dimension.SPREAD_DIMENSION = new Object();
        Dimension.PARENT_DIMENSION = new Object();
        Dimension.PERCENT_DIMENSION = new Object();
        Dimension.RATIO_DIMENSION = new Object();
    }

    public Dimension() {
        this.a = 0;
        this.b = 0x7FFFFFFF;
        this.c = 1.0f;
        this.d = 0;
        this.e = null;
        this.f = Dimension.WRAP_DIMENSION;
        this.g = false;
    }

    public Dimension(Object object0) {
        this.a = 0;
        this.b = 0x7FFFFFFF;
        this.c = 1.0f;
        this.d = 0;
        this.e = null;
        this.g = false;
        this.f = object0;
    }

    public static Dimension Fixed(int v) {
        Dimension dimension0 = new Dimension(Dimension.FIXED_DIMENSION);
        dimension0.fixed(v);
        return dimension0;
    }

    public static Dimension Fixed(Object object0) {
        Dimension dimension0 = new Dimension(Dimension.FIXED_DIMENSION);
        dimension0.fixed(object0);
        return dimension0;
    }

    public static Dimension Parent() {
        return new Dimension(Dimension.PARENT_DIMENSION);
    }

    public static Dimension Percent(Object object0, float f) {
        Dimension dimension0 = new Dimension(Dimension.PERCENT_DIMENSION);
        dimension0.percent(object0, f);
        return dimension0;
    }

    public static Dimension Ratio(String s) {
        Dimension dimension0 = new Dimension(Dimension.RATIO_DIMENSION);
        dimension0.ratio(s);
        return dimension0;
    }

    public static Dimension Spread() {
        return new Dimension(Dimension.SPREAD_DIMENSION);
    }

    public static Dimension Suggested(int v) {
        Dimension dimension0 = new Dimension();
        dimension0.suggested(v);
        return dimension0;
    }

    public static Dimension Suggested(Object object0) {
        Dimension dimension0 = new Dimension();
        dimension0.suggested(object0);
        return dimension0;
    }

    public static Dimension Wrap() {
        return new Dimension(Dimension.WRAP_DIMENSION);
    }

    public void apply(State state0, ConstraintWidget constraintWidget0, int v) {
        String s = this.e;
        if(s != null) {
            constraintWidget0.setDimensionRatio(s);
        }
        int v1 = 2;
        if(v == 0) {
            if(this.g) {
                constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                Object object0 = this.f;
                if(object0 == Dimension.WRAP_DIMENSION) {
                    v1 = 1;
                }
                else if(object0 != Dimension.PERCENT_DIMENSION) {
                    v1 = 0;
                }
                constraintWidget0.setHorizontalMatchStyle(v1, this.a, this.b, this.c);
                return;
            }
            int v2 = this.a;
            if(v2 > 0) {
                constraintWidget0.setMinWidth(v2);
            }
            int v3 = this.b;
            if(v3 < 0x7FFFFFFF) {
                constraintWidget0.setMaxWidth(v3);
            }
            Object object1 = this.f;
            if(object1 == Dimension.WRAP_DIMENSION) {
                constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if(object1 == Dimension.PARENT_DIMENSION) {
                constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                return;
            }
            if(object1 == null) {
                constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidget0.setWidth(this.d);
            }
        }
        else {
            if(this.g) {
                constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                Object object2 = this.f;
                if(object2 == Dimension.WRAP_DIMENSION) {
                    v1 = 1;
                }
                else if(object2 != Dimension.PERCENT_DIMENSION) {
                    v1 = 0;
                }
                constraintWidget0.setVerticalMatchStyle(v1, this.a, this.b, this.c);
                return;
            }
            int v4 = this.a;
            if(v4 > 0) {
                constraintWidget0.setMinHeight(v4);
            }
            int v5 = this.b;
            if(v5 < 0x7FFFFFFF) {
                constraintWidget0.setMaxHeight(v5);
            }
            Object object3 = this.f;
            if(object3 == Dimension.WRAP_DIMENSION) {
                constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if(object3 == Dimension.PARENT_DIMENSION) {
                constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                return;
            }
            if(object3 == null) {
                constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidget0.setHeight(this.d);
            }
        }
    }

    public boolean equalsFixedValue(int v) {
        return this.f == null && this.d == v;
    }

    public Dimension fixed(int v) {
        this.f = null;
        this.d = v;
        return this;
    }

    public Dimension fixed(Object object0) {
        this.f = object0;
        if(object0 instanceof Integer) {
            this.d = (int)(((Integer)object0));
            this.f = null;
        }
        return this;
    }

    public Dimension max(int v) {
        if(this.b >= 0) {
            this.b = v;
        }
        return this;
    }

    public Dimension max(Object object0) {
        Object object1 = Dimension.WRAP_DIMENSION;
        if(object0 == object1 && this.g) {
            this.f = object1;
            this.b = 0x7FFFFFFF;
        }
        return this;
    }

    public Dimension min(int v) {
        if(v >= 0) {
            this.a = v;
        }
        return this;
    }

    public Dimension min(Object object0) {
        if(object0 == Dimension.WRAP_DIMENSION) {
            this.a = -2;
        }
        return this;
    }

    public Dimension percent(Object object0, float f) {
        this.c = f;
        return this;
    }

    public Dimension ratio(String s) {
        this.e = s;
        return this;
    }

    public Dimension suggested(int v) {
        this.g = true;
        if(v >= 0) {
            this.b = v;
        }
        return this;
    }

    public Dimension suggested(Object object0) {
        this.f = object0;
        this.g = true;
        return this;
    }
}

