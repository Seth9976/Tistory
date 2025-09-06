package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import wb.a;

public class State {
    public static enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

    }

    public static enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT;

    }

    public static enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM;

    }

    public static enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW;

    }

    public static final Integer PARENT;
    public final HashMap a;
    public int b;
    protected HashMap mHelperReferences;
    public final ConstraintReference mParent;
    protected HashMap mReferences;

    static {
        State.PARENT = 0;
    }

    public State() {
        this.mReferences = new HashMap();
        this.mHelperReferences = new HashMap();
        this.a = new HashMap();
        ConstraintReference constraintReference0 = new ConstraintReference(this);
        this.mParent = constraintReference0;
        this.b = 0;
        this.mReferences.put(State.PARENT, constraintReference0);
    }

    public void apply(ConstraintWidgetContainer constraintWidgetContainer0) {
        constraintWidgetContainer0.removeAllChildren();
        this.mParent.getWidth().apply(this, constraintWidgetContainer0, 0);
        this.mParent.getHeight().apply(this, constraintWidgetContainer0, 1);
        for(Object object0: this.mHelperReferences.keySet()) {
            HelperWidget helperWidget0 = ((HelperReference)this.mHelperReferences.get(object0)).getHelperWidget();
            if(helperWidget0 != null) {
                Reference reference0 = (Reference)this.mReferences.get(object0);
                if(reference0 == null) {
                    reference0 = this.constraints(object0);
                }
                reference0.setConstraintWidget(helperWidget0);
            }
        }
        for(Object object1: this.mReferences.keySet()) {
            Reference reference1 = (Reference)this.mReferences.get(object1);
            if(reference1 != this.mParent && reference1.getFacade() instanceof HelperReference) {
                HelperWidget helperWidget1 = ((HelperReference)reference1.getFacade()).getHelperWidget();
                if(helperWidget1 != null) {
                    Reference reference2 = (Reference)this.mReferences.get(object1);
                    if(reference2 == null) {
                        reference2 = this.constraints(object1);
                    }
                    reference2.setConstraintWidget(helperWidget1);
                }
            }
        }
        for(Object object2: this.mReferences.keySet()) {
            Reference reference3 = (Reference)this.mReferences.get(object2);
            if(reference3 == this.mParent) {
                reference3.setConstraintWidget(constraintWidgetContainer0);
            }
            else {
                ConstraintWidget constraintWidget0 = reference3.getConstraintWidget();
                constraintWidget0.setDebugName(reference3.getKey().toString());
                constraintWidget0.setParent(null);
                if(reference3.getFacade() instanceof GuidelineReference) {
                    reference3.apply();
                }
                constraintWidgetContainer0.add(constraintWidget0);
            }
        }
        for(Object object3: this.mHelperReferences.keySet()) {
            HelperReference helperReference0 = (HelperReference)this.mHelperReferences.get(object3);
            if(helperReference0.getHelperWidget() != null) {
                for(Object object4: helperReference0.mReferences) {
                    Reference reference4 = (Reference)this.mReferences.get(object4);
                    helperReference0.getHelperWidget().add(reference4.getConstraintWidget());
                }
            }
            helperReference0.apply();
        }
        for(Object object5: this.mReferences.keySet()) {
            Reference reference5 = (Reference)this.mReferences.get(object5);
            if(reference5 != this.mParent && reference5.getFacade() instanceof HelperReference) {
                HelperReference helperReference1 = (HelperReference)reference5.getFacade();
                HelperWidget helperWidget2 = helperReference1.getHelperWidget();
                if(helperWidget2 != null) {
                    for(Object object6: helperReference1.mReferences) {
                        Reference reference6 = (Reference)this.mReferences.get(object6);
                        if(reference6 != null) {
                            helperWidget2.add(reference6.getConstraintWidget());
                        }
                        else if(object6 instanceof Reference) {
                            helperWidget2.add(((Reference)object6).getConstraintWidget());
                        }
                        else {
                            System.out.println("couldn\'t find reference for " + object6);
                        }
                    }
                    reference5.apply();
                }
            }
        }
        for(Object object7: this.mReferences.keySet()) {
            Reference reference7 = (Reference)this.mReferences.get(object7);
            reference7.apply();
            ConstraintWidget constraintWidget1 = reference7.getConstraintWidget();
            if(constraintWidget1 != null && object7 != null) {
                constraintWidget1.stringId = object7.toString();
            }
        }
    }

    public BarrierReference barrier(Object object0, Direction state$Direction0) {
        ConstraintReference constraintReference0 = this.constraints(object0);
        if(constraintReference0.getFacade() == null || !(constraintReference0.getFacade() instanceof BarrierReference)) {
            BarrierReference barrierReference0 = new BarrierReference(this);
            barrierReference0.setBarrierDirection(state$Direction0);
            constraintReference0.setFacade(barrierReference0);
        }
        return (BarrierReference)constraintReference0.getFacade();
    }

    public AlignHorizontallyReference centerHorizontally(Object[] arr_object) {
        AlignHorizontallyReference alignHorizontallyReference0 = (AlignHorizontallyReference)this.helper(null, Helper.ALIGN_HORIZONTALLY);
        alignHorizontallyReference0.add(arr_object);
        return alignHorizontallyReference0;
    }

    public AlignVerticallyReference centerVertically(Object[] arr_object) {
        AlignVerticallyReference alignVerticallyReference0 = (AlignVerticallyReference)this.helper(null, Helper.ALIGN_VERTICALLY);
        alignVerticallyReference0.add(arr_object);
        return alignVerticallyReference0;
    }

    public ConstraintReference constraints(Object object0) {
        Reference reference0 = (Reference)this.mReferences.get(object0);
        if(reference0 == null) {
            reference0 = this.createConstraintReference(object0);
            this.mReferences.put(object0, reference0);
            reference0.setKey(object0);
        }
        return reference0 instanceof ConstraintReference ? ((ConstraintReference)reference0) : null;
    }

    public int convertDimension(Object object0) {
        if(object0 instanceof Float) {
            return ((Float)object0).intValue();
        }
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : 0;
    }

    public ConstraintReference createConstraintReference(Object object0) {
        return new ConstraintReference(this);
    }

    public void directMapping() {
        for(Object object0: this.mReferences.keySet()) {
            ConstraintReference constraintReference0 = this.constraints(object0);
            if(constraintReference0 != null) {
                constraintReference0.setView(object0);
            }
        }
    }

    // 去混淆评级： 低(20)
    public ArrayList getIdsForTag(String s) {
        return this.a.containsKey(s) ? ((ArrayList)this.a.get(s)) : null;
    }

    public GuidelineReference guideline(Object object0, int v) {
        ConstraintReference constraintReference0 = this.constraints(object0);
        if(constraintReference0.getFacade() == null || !(constraintReference0.getFacade() instanceof GuidelineReference)) {
            GuidelineReference guidelineReference0 = new GuidelineReference(this);
            guidelineReference0.setOrientation(v);
            guidelineReference0.setKey(object0);
            constraintReference0.setFacade(guidelineReference0);
        }
        return (GuidelineReference)constraintReference0.getFacade();
    }

    public State height(Dimension dimension0) {
        return this.setHeight(dimension0);
    }

    public HelperReference helper(Object object0, Helper state$Helper0) {
        if(object0 == null) {
            StringBuilder stringBuilder0 = new StringBuilder("__HELPER_KEY_");
            int v = this.b;
            this.b = v + 1;
            object0 = a.c(v, "__", stringBuilder0);
        }
        HelperReference helperReference0 = (HelperReference)this.mHelperReferences.get(object0);
        if(helperReference0 == null) {
            switch(c.a[state$Helper0.ordinal()]) {
                case 1: {
                    helperReference0 = new HorizontalChainReference(this);
                    break;
                }
                case 2: {
                    helperReference0 = new VerticalChainReference(this);
                    break;
                }
                case 3: {
                    helperReference0 = new AlignHorizontallyReference(this);
                    break;
                }
                case 4: {
                    helperReference0 = new AlignVerticallyReference(this);
                    break;
                }
                case 5: {
                    helperReference0 = new BarrierReference(this);
                    break;
                }
                default: {
                    helperReference0 = new HelperReference(this, state$Helper0);
                }
            }
            helperReference0.setKey(object0);
            this.mHelperReferences.put(object0, helperReference0);
        }
        return helperReference0;
    }

    public HorizontalChainReference horizontalChain() {
        return (HorizontalChainReference)this.helper(null, Helper.HORIZONTAL_CHAIN);
    }

    public HorizontalChainReference horizontalChain(Object[] arr_object) {
        HorizontalChainReference horizontalChainReference0 = (HorizontalChainReference)this.helper(null, Helper.HORIZONTAL_CHAIN);
        horizontalChainReference0.add(arr_object);
        return horizontalChainReference0;
    }

    public GuidelineReference horizontalGuideline(Object object0) {
        return this.guideline(object0, 0);
    }

    public void map(Object object0, Object object1) {
        ConstraintReference constraintReference0 = this.constraints(object0);
        if(constraintReference0 != null) {
            constraintReference0.setView(object1);
        }
    }

    public void reset() {
        this.mHelperReferences.clear();
        this.a.clear();
    }

    public boolean sameFixedHeight(int v) {
        return this.mParent.getHeight().equalsFixedValue(v);
    }

    public boolean sameFixedWidth(int v) {
        return this.mParent.getWidth().equalsFixedValue(v);
    }

    public State setHeight(Dimension dimension0) {
        this.mParent.setHeight(dimension0);
        return this;
    }

    public void setTag(String s, String s1) {
        ArrayList arrayList0;
        ConstraintReference constraintReference0 = this.constraints(s);
        if(constraintReference0 != null) {
            constraintReference0.setTag(s1);
            HashMap hashMap0 = this.a;
            if(hashMap0.containsKey(s1)) {
                arrayList0 = (ArrayList)hashMap0.get(s1);
            }
            else {
                arrayList0 = new ArrayList();
                hashMap0.put(s1, arrayList0);
            }
            arrayList0.add(s);
        }
    }

    public State setWidth(Dimension dimension0) {
        this.mParent.setWidth(dimension0);
        return this;
    }

    public VerticalChainReference verticalChain() {
        return (VerticalChainReference)this.helper(null, Helper.VERTICAL_CHAIN);
    }

    public VerticalChainReference verticalChain(Object[] arr_object) {
        VerticalChainReference verticalChainReference0 = (VerticalChainReference)this.helper(null, Helper.VERTICAL_CHAIN);
        verticalChainReference0.add(arr_object);
        return verticalChainReference0;
    }

    public GuidelineReference verticalGuideline(Object object0) {
        return this.guideline(object0, 1);
    }

    public State width(Dimension dimension0) {
        return this.setWidth(dimension0);
    }
}

