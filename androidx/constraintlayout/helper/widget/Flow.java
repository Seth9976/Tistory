package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.VirtualLayout;

public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE;
    public androidx.constraintlayout.core.widgets.Flow d;

    public Flow(Context context0) {
        super(context0);
    }

    public Flow(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public Flow(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void init(AttributeSet attributeSet0) {
        super.init(attributeSet0);
        this.d = new androidx.constraintlayout.core.widgets.Flow();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_android_orientation) {
                    this.d.setOrientation(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_padding) {
                    this.d.setPadding(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.d.setPaddingStart(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.d.setPaddingEnd(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.d.setPaddingLeft(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.d.setPaddingTop(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.d.setPaddingRight(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.d.setPaddingBottom(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.d.setWrapMode(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.d.setHorizontalStyle(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.d.setVerticalStyle(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.d.setFirstHorizontalStyle(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.d.setLastHorizontalStyle(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.d.setFirstVerticalStyle(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.d.setLastVerticalStyle(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.d.setHorizontalBias(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.d.setFirstHorizontalBias(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.d.setLastHorizontalBias(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.d.setFirstVerticalBias(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.d.setLastVerticalBias(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.d.setVerticalBias(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.d.setHorizontalAlign(typedArray0.getInt(v2, 2));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.d.setVerticalAlign(typedArray0.getInt(v2, 2));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.d.setHorizontalGap(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.d.setVerticalGap(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.d.setMaxElementsWrap(typedArray0.getInt(v2, -1));
                }
            }
            typedArray0.recycle();
        }
        this.mHelperWidget = this.d;
        this.validateParams();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(Constraint constraintSet$Constraint0, HelperWidget helperWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        super.loadParameters(constraintSet$Constraint0, helperWidget0, constraintLayout$LayoutParams0, sparseArray0);
        if(helperWidget0 instanceof androidx.constraintlayout.core.widgets.Flow) {
            int v = constraintLayout$LayoutParams0.orientation;
            if(v != -1) {
                ((androidx.constraintlayout.core.widgets.Flow)helperWidget0).setOrientation(v);
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    @SuppressLint({"WrongCall"})
    public void onMeasure(int v, int v1) {
        this.onMeasure(this.d, v, v1);
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout0, int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        if(virtualLayout0 != null) {
            virtualLayout0.measure(v2, v3, v4, v5);
            this.setMeasuredDimension(virtualLayout0.getMeasuredWidth(), virtualLayout0.getMeasuredHeight());
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget0, boolean z) {
        this.d.applyRtl(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.d.setFirstHorizontalBias(f);
        this.requestLayout();
    }

    public void setFirstHorizontalStyle(int v) {
        this.d.setFirstHorizontalStyle(v);
        this.requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.d.setFirstVerticalBias(f);
        this.requestLayout();
    }

    public void setFirstVerticalStyle(int v) {
        this.d.setFirstVerticalStyle(v);
        this.requestLayout();
    }

    public void setHorizontalAlign(int v) {
        this.d.setHorizontalAlign(v);
        this.requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.d.setHorizontalBias(f);
        this.requestLayout();
    }

    public void setHorizontalGap(int v) {
        this.d.setHorizontalGap(v);
        this.requestLayout();
    }

    public void setHorizontalStyle(int v) {
        this.d.setHorizontalStyle(v);
        this.requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.d.setLastHorizontalBias(f);
        this.requestLayout();
    }

    public void setLastHorizontalStyle(int v) {
        this.d.setLastHorizontalStyle(v);
        this.requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.d.setLastVerticalBias(f);
        this.requestLayout();
    }

    public void setLastVerticalStyle(int v) {
        this.d.setLastVerticalStyle(v);
        this.requestLayout();
    }

    public void setMaxElementsWrap(int v) {
        this.d.setMaxElementsWrap(v);
        this.requestLayout();
    }

    public void setOrientation(int v) {
        this.d.setOrientation(v);
        this.requestLayout();
    }

    public void setPadding(int v) {
        this.d.setPadding(v);
        this.requestLayout();
    }

    public void setPaddingBottom(int v) {
        this.d.setPaddingBottom(v);
        this.requestLayout();
    }

    public void setPaddingLeft(int v) {
        this.d.setPaddingLeft(v);
        this.requestLayout();
    }

    public void setPaddingRight(int v) {
        this.d.setPaddingRight(v);
        this.requestLayout();
    }

    public void setPaddingTop(int v) {
        this.d.setPaddingTop(v);
        this.requestLayout();
    }

    public void setVerticalAlign(int v) {
        this.d.setVerticalAlign(v);
        this.requestLayout();
    }

    public void setVerticalBias(float f) {
        this.d.setVerticalBias(f);
        this.requestLayout();
    }

    public void setVerticalGap(int v) {
        this.d.setVerticalGap(v);
        this.requestLayout();
    }

    public void setVerticalStyle(int v) {
        this.d.setVerticalStyle(v);
        this.requestLayout();
    }

    public void setWrapMode(int v) {
        this.d.setWrapMode(v);
        this.requestLayout();
    }
}

