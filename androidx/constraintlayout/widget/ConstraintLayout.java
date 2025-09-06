package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = 0x80000000;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;
        public String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        boolean heightSet;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        boolean isVirtualGroup;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        ConstraintWidget widget;
        boolean widthSet;
        public int wrapBehaviorInParent;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = 0x80000000;
            this.goneTopMargin = 0x80000000;
            this.goneRightMargin = 0x80000000;
            this.goneBottomMargin = 0x80000000;
            this.goneStartMargin = 0x80000000;
            this.goneEndMargin = 0x80000000;
            this.goneBaselineMargin = 0x80000000;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = 0x80000000;
            this.resolveGoneRightMargin = 0x80000000;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = 0x80000000;
            this.goneTopMargin = 0x80000000;
            this.goneRightMargin = 0x80000000;
            this.goneBottomMargin = 0x80000000;
            this.goneStartMargin = 0x80000000;
            this.goneEndMargin = 0x80000000;
            this.goneBaselineMargin = 0x80000000;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = 0x80000000;
            this.resolveGoneRightMargin = 0x80000000;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(c.a.get(v2)) {
                    case 1: {
                        this.orientation = typedArray0.getInt(v2, this.orientation);
                        break;
                    }
                    case 2: {
                        int v3 = typedArray0.getResourceId(v2, this.circleConstraint);
                        this.circleConstraint = v3;
                        if(v3 == -1) {
                            this.circleConstraint = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 3: {
                        this.circleRadius = typedArray0.getDimensionPixelSize(v2, this.circleRadius);
                        break;
                    }
                    case 4: {
                        float f = typedArray0.getFloat(v2, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if(f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                        }
                        break;
                    }
                    case 5: {
                        this.guideBegin = typedArray0.getDimensionPixelOffset(v2, this.guideBegin);
                        break;
                    }
                    case 6: {
                        this.guideEnd = typedArray0.getDimensionPixelOffset(v2, this.guideEnd);
                        break;
                    }
                    case 7: {
                        this.guidePercent = typedArray0.getFloat(v2, this.guidePercent);
                        break;
                    }
                    case 8: {
                        int v4 = typedArray0.getResourceId(v2, this.leftToLeft);
                        this.leftToLeft = v4;
                        if(v4 == -1) {
                            this.leftToLeft = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 9: {
                        int v5 = typedArray0.getResourceId(v2, this.leftToRight);
                        this.leftToRight = v5;
                        if(v5 == -1) {
                            this.leftToRight = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 10: {
                        int v6 = typedArray0.getResourceId(v2, this.rightToLeft);
                        this.rightToLeft = v6;
                        if(v6 == -1) {
                            this.rightToLeft = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 11: {
                        int v7 = typedArray0.getResourceId(v2, this.rightToRight);
                        this.rightToRight = v7;
                        if(v7 == -1) {
                            this.rightToRight = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 12: {
                        int v8 = typedArray0.getResourceId(v2, this.topToTop);
                        this.topToTop = v8;
                        if(v8 == -1) {
                            this.topToTop = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 13: {
                        int v9 = typedArray0.getResourceId(v2, this.topToBottom);
                        this.topToBottom = v9;
                        if(v9 == -1) {
                            this.topToBottom = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 14: {
                        int v10 = typedArray0.getResourceId(v2, this.bottomToTop);
                        this.bottomToTop = v10;
                        if(v10 == -1) {
                            this.bottomToTop = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 15: {
                        int v11 = typedArray0.getResourceId(v2, this.bottomToBottom);
                        this.bottomToBottom = v11;
                        if(v11 == -1) {
                            this.bottomToBottom = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 16: {
                        int v12 = typedArray0.getResourceId(v2, this.baselineToBaseline);
                        this.baselineToBaseline = v12;
                        if(v12 == -1) {
                            this.baselineToBaseline = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 17: {
                        int v13 = typedArray0.getResourceId(v2, this.startToEnd);
                        this.startToEnd = v13;
                        if(v13 == -1) {
                            this.startToEnd = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 18: {
                        int v14 = typedArray0.getResourceId(v2, this.startToStart);
                        this.startToStart = v14;
                        if(v14 == -1) {
                            this.startToStart = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 19: {
                        int v15 = typedArray0.getResourceId(v2, this.endToStart);
                        this.endToStart = v15;
                        if(v15 == -1) {
                            this.endToStart = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 20: {
                        int v16 = typedArray0.getResourceId(v2, this.endToEnd);
                        this.endToEnd = v16;
                        if(v16 == -1) {
                            this.endToEnd = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 21: {
                        this.goneLeftMargin = typedArray0.getDimensionPixelSize(v2, this.goneLeftMargin);
                        break;
                    }
                    case 22: {
                        this.goneTopMargin = typedArray0.getDimensionPixelSize(v2, this.goneTopMargin);
                        break;
                    }
                    case 23: {
                        this.goneRightMargin = typedArray0.getDimensionPixelSize(v2, this.goneRightMargin);
                        break;
                    }
                    case 24: {
                        this.goneBottomMargin = typedArray0.getDimensionPixelSize(v2, this.goneBottomMargin);
                        break;
                    }
                    case 25: {
                        this.goneStartMargin = typedArray0.getDimensionPixelSize(v2, this.goneStartMargin);
                        break;
                    }
                    case 26: {
                        this.goneEndMargin = typedArray0.getDimensionPixelSize(v2, this.goneEndMargin);
                        break;
                    }
                    case 27: {
                        this.constrainedWidth = typedArray0.getBoolean(v2, this.constrainedWidth);
                        break;
                    }
                    case 28: {
                        this.constrainedHeight = typedArray0.getBoolean(v2, this.constrainedHeight);
                        break;
                    }
                    case 29: {
                        this.horizontalBias = typedArray0.getFloat(v2, this.horizontalBias);
                        break;
                    }
                    case 30: {
                        this.verticalBias = typedArray0.getFloat(v2, this.verticalBias);
                        break;
                    }
                    case 0x1F: {
                        int v17 = typedArray0.getInt(v2, 0);
                        this.matchConstraintDefaultWidth = v17;
                        if(v17 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    }
                    case 0x20: {
                        int v18 = typedArray0.getInt(v2, 0);
                        this.matchConstraintDefaultHeight = v18;
                        if(v18 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    }
                    case 33: {
                        try {
                            this.matchConstraintMinWidth = typedArray0.getDimensionPixelSize(v2, this.matchConstraintMinWidth);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                            }
                        }
                        break;
                    }
                    case 34: {
                        try {
                            this.matchConstraintMaxWidth = typedArray0.getDimensionPixelSize(v2, this.matchConstraintMaxWidth);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                            }
                        }
                        break;
                    }
                    case 35: {
                        this.matchConstraintPercentWidth = Math.max(0.0f, typedArray0.getFloat(v2, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    }
                    case 36: {
                        try {
                            this.matchConstraintMinHeight = typedArray0.getDimensionPixelSize(v2, this.matchConstraintMinHeight);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                            }
                        }
                        break;
                    }
                    case 37: {
                        try {
                            this.matchConstraintMaxHeight = typedArray0.getDimensionPixelSize(v2, this.matchConstraintMaxHeight);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                            }
                        }
                        break;
                    }
                    case 38: {
                        this.matchConstraintPercentHeight = Math.max(0.0f, typedArray0.getFloat(v2, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    }
                    case 44: {
                        ConstraintSet.i(this, typedArray0.getString(v2));
                        break;
                    }
                    case 45: {
                        this.horizontalWeight = typedArray0.getFloat(v2, this.horizontalWeight);
                        break;
                    }
                    case 46: {
                        this.verticalWeight = typedArray0.getFloat(v2, this.verticalWeight);
                        break;
                    }
                    case 0x2F: {
                        this.horizontalChainStyle = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 0x30: {
                        this.verticalChainStyle = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 49: {
                        this.editorAbsoluteX = typedArray0.getDimensionPixelOffset(v2, this.editorAbsoluteX);
                        break;
                    }
                    case 50: {
                        this.editorAbsoluteY = typedArray0.getDimensionPixelOffset(v2, this.editorAbsoluteY);
                        break;
                    }
                    case 51: {
                        this.constraintTag = typedArray0.getString(v2);
                        break;
                    }
                    case 52: {
                        int v19 = typedArray0.getResourceId(v2, this.baselineToTop);
                        this.baselineToTop = v19;
                        if(v19 == -1) {
                            this.baselineToTop = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 53: {
                        int v20 = typedArray0.getResourceId(v2, this.baselineToBottom);
                        this.baselineToBottom = v20;
                        if(v20 == -1) {
                            this.baselineToBottom = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 54: {
                        this.baselineMargin = typedArray0.getDimensionPixelSize(v2, this.baselineMargin);
                        break;
                    }
                    case 55: {
                        this.goneBaselineMargin = typedArray0.getDimensionPixelSize(v2, this.goneBaselineMargin);
                        break;
                    }
                    case 0x40: {
                        ConstraintSet.h(this, typedArray0, v2, 0);
                        this.widthSet = true;
                        break;
                    }
                    case 65: {
                        ConstraintSet.h(this, typedArray0, v2, 1);
                        this.heightSet = true;
                        break;
                    }
                    case 66: {
                        this.wrapBehaviorInParent = typedArray0.getInt(v2, this.wrapBehaviorInParent);
                        break;
                    }
                    case 67: {
                        this.guidelineUseRtl = typedArray0.getBoolean(v2, this.guidelineUseRtl);
                    }
                }
            }
            typedArray0.recycle();
            this.validate();
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = 0x80000000;
            this.goneTopMargin = 0x80000000;
            this.goneRightMargin = 0x80000000;
            this.goneBottomMargin = 0x80000000;
            this.goneStartMargin = 0x80000000;
            this.goneEndMargin = 0x80000000;
            this.goneBaselineMargin = 0x80000000;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = 0x80000000;
            this.resolveGoneRightMargin = 0x80000000;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(LayoutParams constraintLayout$LayoutParams0) {
            super(constraintLayout$LayoutParams0);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = 0x80000000;
            this.goneTopMargin = 0x80000000;
            this.goneRightMargin = 0x80000000;
            this.goneBottomMargin = 0x80000000;
            this.goneStartMargin = 0x80000000;
            this.goneEndMargin = 0x80000000;
            this.goneBaselineMargin = 0x80000000;
            this.baselineMargin = 0;
            this.widthSet = true;
            this.heightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = 0x80000000;
            this.resolveGoneRightMargin = 0x80000000;
            this.resolvedHorizontalBias = 0.5f;
            new ConstraintWidget();
            this.helped = false;
            this.guideBegin = constraintLayout$LayoutParams0.guideBegin;
            this.guideEnd = constraintLayout$LayoutParams0.guideEnd;
            this.guidePercent = constraintLayout$LayoutParams0.guidePercent;
            this.guidelineUseRtl = constraintLayout$LayoutParams0.guidelineUseRtl;
            this.leftToLeft = constraintLayout$LayoutParams0.leftToLeft;
            this.leftToRight = constraintLayout$LayoutParams0.leftToRight;
            this.rightToLeft = constraintLayout$LayoutParams0.rightToLeft;
            this.rightToRight = constraintLayout$LayoutParams0.rightToRight;
            this.topToTop = constraintLayout$LayoutParams0.topToTop;
            this.topToBottom = constraintLayout$LayoutParams0.topToBottom;
            this.bottomToTop = constraintLayout$LayoutParams0.bottomToTop;
            this.bottomToBottom = constraintLayout$LayoutParams0.bottomToBottom;
            this.baselineToBaseline = constraintLayout$LayoutParams0.baselineToBaseline;
            this.baselineToTop = constraintLayout$LayoutParams0.baselineToTop;
            this.baselineToBottom = constraintLayout$LayoutParams0.baselineToBottom;
            this.circleConstraint = constraintLayout$LayoutParams0.circleConstraint;
            this.circleRadius = constraintLayout$LayoutParams0.circleRadius;
            this.circleAngle = constraintLayout$LayoutParams0.circleAngle;
            this.startToEnd = constraintLayout$LayoutParams0.startToEnd;
            this.startToStart = constraintLayout$LayoutParams0.startToStart;
            this.endToStart = constraintLayout$LayoutParams0.endToStart;
            this.endToEnd = constraintLayout$LayoutParams0.endToEnd;
            this.goneLeftMargin = constraintLayout$LayoutParams0.goneLeftMargin;
            this.goneTopMargin = constraintLayout$LayoutParams0.goneTopMargin;
            this.goneRightMargin = constraintLayout$LayoutParams0.goneRightMargin;
            this.goneBottomMargin = constraintLayout$LayoutParams0.goneBottomMargin;
            this.goneStartMargin = constraintLayout$LayoutParams0.goneStartMargin;
            this.goneEndMargin = constraintLayout$LayoutParams0.goneEndMargin;
            this.goneBaselineMargin = constraintLayout$LayoutParams0.goneBaselineMargin;
            this.baselineMargin = constraintLayout$LayoutParams0.baselineMargin;
            this.horizontalBias = constraintLayout$LayoutParams0.horizontalBias;
            this.verticalBias = constraintLayout$LayoutParams0.verticalBias;
            this.dimensionRatio = constraintLayout$LayoutParams0.dimensionRatio;
            this.dimensionRatioValue = constraintLayout$LayoutParams0.dimensionRatioValue;
            this.dimensionRatioSide = constraintLayout$LayoutParams0.dimensionRatioSide;
            this.horizontalWeight = constraintLayout$LayoutParams0.horizontalWeight;
            this.verticalWeight = constraintLayout$LayoutParams0.verticalWeight;
            this.horizontalChainStyle = constraintLayout$LayoutParams0.horizontalChainStyle;
            this.verticalChainStyle = constraintLayout$LayoutParams0.verticalChainStyle;
            this.constrainedWidth = constraintLayout$LayoutParams0.constrainedWidth;
            this.constrainedHeight = constraintLayout$LayoutParams0.constrainedHeight;
            this.matchConstraintDefaultWidth = constraintLayout$LayoutParams0.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = constraintLayout$LayoutParams0.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = constraintLayout$LayoutParams0.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = constraintLayout$LayoutParams0.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = constraintLayout$LayoutParams0.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = constraintLayout$LayoutParams0.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = constraintLayout$LayoutParams0.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = constraintLayout$LayoutParams0.matchConstraintPercentHeight;
            this.editorAbsoluteX = constraintLayout$LayoutParams0.editorAbsoluteX;
            this.editorAbsoluteY = constraintLayout$LayoutParams0.editorAbsoluteY;
            this.orientation = constraintLayout$LayoutParams0.orientation;
            this.horizontalDimensionFixed = constraintLayout$LayoutParams0.horizontalDimensionFixed;
            this.verticalDimensionFixed = constraintLayout$LayoutParams0.verticalDimensionFixed;
            this.needsBaseline = constraintLayout$LayoutParams0.needsBaseline;
            this.isGuideline = constraintLayout$LayoutParams0.isGuideline;
            this.resolvedLeftToLeft = constraintLayout$LayoutParams0.resolvedLeftToLeft;
            this.resolvedLeftToRight = constraintLayout$LayoutParams0.resolvedLeftToRight;
            this.resolvedRightToLeft = constraintLayout$LayoutParams0.resolvedRightToLeft;
            this.resolvedRightToRight = constraintLayout$LayoutParams0.resolvedRightToRight;
            this.resolveGoneLeftMargin = constraintLayout$LayoutParams0.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = constraintLayout$LayoutParams0.resolveGoneRightMargin;
            this.resolvedHorizontalBias = constraintLayout$LayoutParams0.resolvedHorizontalBias;
            this.constraintTag = constraintLayout$LayoutParams0.constraintTag;
            this.wrapBehaviorInParent = constraintLayout$LayoutParams0.wrapBehaviorInParent;
            this.widget = constraintLayout$LayoutParams0.widget;
            this.widthSet = constraintLayout$LayoutParams0.widthSet;
            this.heightSet = constraintLayout$LayoutParams0.heightSet;
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void reset() {
            ConstraintWidget constraintWidget0 = this.widget;
            if(constraintWidget0 != null) {
                constraintWidget0.reset();
            }
        }

        @Override  // android.view.ViewGroup$MarginLayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int v) {
            int v1 = this.leftMargin;
            int v2 = this.rightMargin;
            super.resolveLayoutDirection(v);
            boolean z = false;
            boolean z1 = 1 == this.getLayoutDirection();
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolveGoneLeftMargin = this.goneLeftMargin;
            this.resolveGoneRightMargin = this.goneRightMargin;
            float f = this.horizontalBias;
            this.resolvedHorizontalBias = f;
            int v3 = this.guideBegin;
            this.resolvedGuideBegin = v3;
            int v4 = this.guideEnd;
            this.resolvedGuideEnd = v4;
            float f1 = this.guidePercent;
            this.resolvedGuidePercent = f1;
            if(z1) {
                int v5 = this.startToEnd;
                if(v5 == -1) {
                    int v6 = this.startToStart;
                    if(v6 != -1) {
                        this.resolvedRightToRight = v6;
                        z = true;
                    }
                }
                else {
                    this.resolvedRightToLeft = v5;
                    z = true;
                }
                int v7 = this.endToStart;
                if(v7 != -1) {
                    this.resolvedLeftToRight = v7;
                    z = true;
                }
                int v8 = this.endToEnd;
                if(v8 != -1) {
                    this.resolvedLeftToLeft = v8;
                    z = true;
                }
                int v9 = this.goneStartMargin;
                if(v9 != 0x80000000) {
                    this.resolveGoneRightMargin = v9;
                }
                int v10 = this.goneEndMargin;
                if(v10 != 0x80000000) {
                    this.resolveGoneLeftMargin = v10;
                }
                if(z) {
                    this.resolvedHorizontalBias = 1.0f - f;
                }
                if(this.isGuideline && this.orientation == 1 && this.guidelineUseRtl) {
                    if(f1 != -1.0f) {
                        this.resolvedGuidePercent = 1.0f - f1;
                        this.resolvedGuideBegin = -1;
                        this.resolvedGuideEnd = -1;
                    }
                    else if(v3 != -1) {
                        this.resolvedGuideEnd = v3;
                        this.resolvedGuideBegin = -1;
                        this.resolvedGuidePercent = -1.0f;
                    }
                    else if(v4 != -1) {
                        this.resolvedGuideBegin = v4;
                        this.resolvedGuideEnd = -1;
                        this.resolvedGuidePercent = -1.0f;
                    }
                }
            }
            else {
                int v11 = this.startToEnd;
                if(v11 != -1) {
                    this.resolvedLeftToRight = v11;
                }
                int v12 = this.startToStart;
                if(v12 != -1) {
                    this.resolvedLeftToLeft = v12;
                }
                int v13 = this.endToStart;
                if(v13 != -1) {
                    this.resolvedRightToLeft = v13;
                }
                int v14 = this.endToEnd;
                if(v14 != -1) {
                    this.resolvedRightToRight = v14;
                }
                int v15 = this.goneStartMargin;
                if(v15 != 0x80000000) {
                    this.resolveGoneLeftMargin = v15;
                }
                int v16 = this.goneEndMargin;
                if(v16 != 0x80000000) {
                    this.resolveGoneRightMargin = v16;
                }
            }
            if(this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int v17 = this.rightToLeft;
                if(v17 == -1) {
                    int v18 = this.rightToRight;
                    if(v18 != -1) {
                        this.resolvedRightToRight = v18;
                        if(this.rightMargin <= 0 && v2 > 0) {
                            this.rightMargin = v2;
                        }
                    }
                }
                else {
                    this.resolvedRightToLeft = v17;
                    if(this.rightMargin <= 0 && v2 > 0) {
                        this.rightMargin = v2;
                    }
                }
                int v19 = this.leftToLeft;
                if(v19 == -1) {
                    int v20 = this.leftToRight;
                    if(v20 != -1) {
                        this.resolvedLeftToRight = v20;
                        if(this.leftMargin <= 0 && v1 > 0) {
                            this.leftMargin = v1;
                        }
                    }
                }
                else {
                    this.resolvedLeftToLeft = v19;
                    if(this.leftMargin <= 0 && v1 > 0) {
                        this.leftMargin = v1;
                    }
                }
            }
        }

        public void setWidgetDebugName(String s) {
            this.widget.setDebugName(s);
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int v = this.width;
            if(v == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if(this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int v1 = this.height;
            if(v1 == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if(this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if(v == -1 || v == 0) {
                this.horizontalDimensionFixed = false;
                if(v == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if(v1 == -1 || v1 == 0) {
                this.verticalDimensionFixed = false;
                if(v1 == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if(this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if(!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }
                ((Guideline)this.widget).setOrientation(this.orientation);
            }
        }
    }

    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    SparseArray mChildrenByIds;
    private ArrayList mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    d mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray mTempMapIdToWidget;
    private static SharedValues sSharedValues;

    public ConstraintLayout(@NonNull Context context0) {
        super(context0);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new d(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.a(null, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new d(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.a(attributeSet0, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new d(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.a(attributeSet0, v, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new d(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.a(attributeSet0, v, v1);
    }

    public final void a(AttributeSet attributeSet0, int v, int v1) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(this.getId(), this);
        this.mConstraintSet = null;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout, v, v1);
            int v2 = typedArray0.getIndexCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = typedArray0.getIndex(v3);
                if(v4 == styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArray0.getDimensionPixelOffset(v4, this.mMinWidth);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArray0.getDimensionPixelOffset(v4, this.mMinHeight);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArray0.getDimensionPixelOffset(v4, this.mMaxWidth);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArray0.getDimensionPixelOffset(v4, this.mMaxHeight);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArray0.getInt(v4, this.mOptimizationLevel);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_layoutDescription) {
                    int v5 = typedArray0.getResourceId(v4, 0);
                    if(v5 != 0) {
                        try {
                            this.parseLayoutDescription(v5);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                }
                else if(v4 == styleable.ConstraintLayout_Layout_constraintSet) {
                    int v6 = typedArray0.getResourceId(v4, 0);
                    try {
                        ConstraintSet constraintSet0 = new ConstraintSet();
                        this.mConstraintSet = constraintSet0;
                        constraintSet0.load(this.getContext(), v6);
                    }
                    catch(Resources.NotFoundException unused_ex) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = v6;
                }
            }
            typedArray0.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view0, ConstraintWidget constraintWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        constraintLayout$LayoutParams0.validate();
        constraintLayout$LayoutParams0.helped = false;
        constraintWidget0.setVisibility(view0.getVisibility());
        if(constraintLayout$LayoutParams0.isInPlaceholder) {
            constraintWidget0.setInPlaceholder(true);
            constraintWidget0.setVisibility(8);
        }
        constraintWidget0.setCompanionWidget(view0);
        if(view0 instanceof ConstraintHelper) {
            ((ConstraintHelper)view0).resolveRtl(constraintWidget0, this.mLayoutWidget.isRtl());
        }
        if(constraintLayout$LayoutParams0.isGuideline) {
            int v = constraintLayout$LayoutParams0.resolvedGuideBegin;
            int v1 = constraintLayout$LayoutParams0.resolvedGuideEnd;
            float f = constraintLayout$LayoutParams0.resolvedGuidePercent;
            if(f != -1.0f) {
                ((Guideline)constraintWidget0).setGuidePercent(f);
                return;
            }
            if(v != -1) {
                ((Guideline)constraintWidget0).setGuideBegin(v);
                return;
            }
            if(v1 != -1) {
                ((Guideline)constraintWidget0).setGuideEnd(v1);
            }
        }
        else {
            int v2 = constraintLayout$LayoutParams0.resolvedLeftToLeft;
            int v3 = constraintLayout$LayoutParams0.resolvedLeftToRight;
            int v4 = constraintLayout$LayoutParams0.resolvedRightToLeft;
            int v5 = constraintLayout$LayoutParams0.resolvedRightToRight;
            int v6 = constraintLayout$LayoutParams0.resolveGoneLeftMargin;
            int v7 = constraintLayout$LayoutParams0.resolveGoneRightMargin;
            float f1 = constraintLayout$LayoutParams0.resolvedHorizontalBias;
            int v8 = constraintLayout$LayoutParams0.circleConstraint;
            if(v8 == -1) {
                if(v2 != -1) {
                    Object object0 = sparseArray0.get(v2);
                    if(((ConstraintWidget)object0) != null) {
                        constraintWidget0.immediateConnect(Type.LEFT, ((ConstraintWidget)object0), Type.LEFT, constraintLayout$LayoutParams0.leftMargin, v6);
                    }
                }
                else if(v3 != -1) {
                    Object object1 = sparseArray0.get(v3);
                    if(((ConstraintWidget)object1) != null) {
                        constraintWidget0.immediateConnect(Type.LEFT, ((ConstraintWidget)object1), Type.RIGHT, constraintLayout$LayoutParams0.leftMargin, v6);
                    }
                }
                if(v4 != -1) {
                    Object object2 = sparseArray0.get(v4);
                    if(((ConstraintWidget)object2) != null) {
                        constraintWidget0.immediateConnect(Type.RIGHT, ((ConstraintWidget)object2), Type.LEFT, constraintLayout$LayoutParams0.rightMargin, v7);
                    }
                }
                else if(v5 != -1) {
                    Object object3 = sparseArray0.get(v5);
                    if(((ConstraintWidget)object3) != null) {
                        constraintWidget0.immediateConnect(Type.RIGHT, ((ConstraintWidget)object3), Type.RIGHT, constraintLayout$LayoutParams0.rightMargin, v7);
                    }
                }
                int v9 = constraintLayout$LayoutParams0.topToTop;
                if(v9 == -1) {
                    int v10 = constraintLayout$LayoutParams0.topToBottom;
                    if(v10 != -1) {
                        Object object5 = sparseArray0.get(v10);
                        if(((ConstraintWidget)object5) != null) {
                            constraintWidget0.immediateConnect(Type.TOP, ((ConstraintWidget)object5), Type.BOTTOM, constraintLayout$LayoutParams0.topMargin, constraintLayout$LayoutParams0.goneTopMargin);
                        }
                    }
                }
                else {
                    Object object4 = sparseArray0.get(v9);
                    if(((ConstraintWidget)object4) != null) {
                        constraintWidget0.immediateConnect(Type.TOP, ((ConstraintWidget)object4), Type.TOP, constraintLayout$LayoutParams0.topMargin, constraintLayout$LayoutParams0.goneTopMargin);
                    }
                }
                int v11 = constraintLayout$LayoutParams0.bottomToTop;
                if(v11 == -1) {
                    int v12 = constraintLayout$LayoutParams0.bottomToBottom;
                    if(v12 != -1) {
                        Object object7 = sparseArray0.get(v12);
                        if(((ConstraintWidget)object7) != null) {
                            constraintWidget0.immediateConnect(Type.BOTTOM, ((ConstraintWidget)object7), Type.BOTTOM, constraintLayout$LayoutParams0.bottomMargin, constraintLayout$LayoutParams0.goneBottomMargin);
                        }
                    }
                }
                else {
                    Object object6 = sparseArray0.get(v11);
                    if(((ConstraintWidget)object6) != null) {
                        constraintWidget0.immediateConnect(Type.BOTTOM, ((ConstraintWidget)object6), Type.TOP, constraintLayout$LayoutParams0.bottomMargin, constraintLayout$LayoutParams0.goneBottomMargin);
                    }
                }
                int v13 = constraintLayout$LayoutParams0.baselineToBaseline;
                if(v13 == -1) {
                    int v14 = constraintLayout$LayoutParams0.baselineToTop;
                    if(v14 == -1) {
                        int v15 = constraintLayout$LayoutParams0.baselineToBottom;
                        if(v15 != -1) {
                            this.b(constraintWidget0, constraintLayout$LayoutParams0, sparseArray0, v15, Type.BOTTOM);
                        }
                    }
                    else {
                        this.b(constraintWidget0, constraintLayout$LayoutParams0, sparseArray0, v14, Type.TOP);
                    }
                }
                else {
                    this.b(constraintWidget0, constraintLayout$LayoutParams0, sparseArray0, v13, Type.BASELINE);
                }
                if(f1 >= 0.0f) {
                    constraintWidget0.setHorizontalBiasPercent(f1);
                }
                float f2 = constraintLayout$LayoutParams0.verticalBias;
                if(f2 >= 0.0f) {
                    constraintWidget0.setVerticalBiasPercent(f2);
                }
            }
            else {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)sparseArray0.get(v8);
                if(constraintWidget1 != null) {
                    constraintWidget0.connectCircularConstraint(constraintWidget1, constraintLayout$LayoutParams0.circleAngle, constraintLayout$LayoutParams0.circleRadius);
                }
            }
            if(z) {
                int v16 = constraintLayout$LayoutParams0.editorAbsoluteX;
                if(v16 != -1 || constraintLayout$LayoutParams0.editorAbsoluteY != -1) {
                    constraintWidget0.setOrigin(v16, constraintLayout$LayoutParams0.editorAbsoluteY);
                }
            }
            if(constraintLayout$LayoutParams0.horizontalDimensionFixed) {
                constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidget0.setWidth(constraintLayout$LayoutParams0.width);
                if(constraintLayout$LayoutParams0.width == -2) {
                    constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                }
            }
            else if(constraintLayout$LayoutParams0.width == -1) {
                if(constraintLayout$LayoutParams0.constrainedWidth) {
                    constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                }
                else {
                    constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                }
                ConstraintAnchor constraintAnchor0 = constraintWidget0.getAnchor(Type.LEFT);
                constraintAnchor0.mMargin = constraintLayout$LayoutParams0.leftMargin;
                ConstraintAnchor constraintAnchor1 = constraintWidget0.getAnchor(Type.RIGHT);
                constraintAnchor1.mMargin = constraintLayout$LayoutParams0.rightMargin;
            }
            else {
                constraintWidget0.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget0.setWidth(0);
            }
            if(constraintLayout$LayoutParams0.verticalDimensionFixed) {
                constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                constraintWidget0.setHeight(constraintLayout$LayoutParams0.height);
                if(constraintLayout$LayoutParams0.height == -2) {
                    constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                }
            }
            else if(constraintLayout$LayoutParams0.height == -1) {
                if(constraintLayout$LayoutParams0.constrainedHeight) {
                    constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                }
                else {
                    constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget0.getAnchor(Type.TOP);
                constraintAnchor2.mMargin = constraintLayout$LayoutParams0.topMargin;
                ConstraintAnchor constraintAnchor3 = constraintWidget0.getAnchor(Type.BOTTOM);
                constraintAnchor3.mMargin = constraintLayout$LayoutParams0.bottomMargin;
            }
            else {
                constraintWidget0.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget0.setHeight(0);
            }
            constraintWidget0.setDimensionRatio(constraintLayout$LayoutParams0.dimensionRatio);
            constraintWidget0.setHorizontalWeight(constraintLayout$LayoutParams0.horizontalWeight);
            constraintWidget0.setVerticalWeight(constraintLayout$LayoutParams0.verticalWeight);
            constraintWidget0.setHorizontalChainStyle(constraintLayout$LayoutParams0.horizontalChainStyle);
            constraintWidget0.setVerticalChainStyle(constraintLayout$LayoutParams0.verticalChainStyle);
            constraintWidget0.setWrapBehaviorInParent(constraintLayout$LayoutParams0.wrapBehaviorInParent);
            constraintWidget0.setHorizontalMatchStyle(constraintLayout$LayoutParams0.matchConstraintDefaultWidth, constraintLayout$LayoutParams0.matchConstraintMinWidth, constraintLayout$LayoutParams0.matchConstraintMaxWidth, constraintLayout$LayoutParams0.matchConstraintPercentWidth);
            constraintWidget0.setVerticalMatchStyle(constraintLayout$LayoutParams0.matchConstraintDefaultHeight, constraintLayout$LayoutParams0.matchConstraintMinHeight, constraintLayout$LayoutParams0.matchConstraintMaxHeight, constraintLayout$LayoutParams0.matchConstraintPercentHeight);
        }
    }

    public final void b(ConstraintWidget constraintWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0, int v, Type constraintAnchor$Type0) {
        View view0 = (View)this.mChildrenByIds.get(v);
        ConstraintWidget constraintWidget1 = (ConstraintWidget)sparseArray0.get(v);
        if(constraintWidget1 != null && view0 != null && view0.getLayoutParams() instanceof LayoutParams) {
            constraintLayout$LayoutParams0.needsBaseline = true;
            Type constraintAnchor$Type1 = Type.BASELINE;
            if(constraintAnchor$Type0 == constraintAnchor$Type1) {
                LayoutParams constraintLayout$LayoutParams1 = (LayoutParams)view0.getLayoutParams();
                constraintLayout$LayoutParams1.needsBaseline = true;
                constraintLayout$LayoutParams1.widget.setHasBaseline(true);
            }
            constraintWidget0.getAnchor(constraintAnchor$Type1).connect(constraintWidget1.getAnchor(constraintAnchor$Type0), constraintLayout$LayoutParams0.baselineMargin, constraintLayout$LayoutParams0.goneBaselineMargin, true);
            constraintWidget0.setHasBaseline(true);
            constraintWidget0.getAnchor(Type.TOP).reset();
            constraintWidget0.getAnchor(Type.BOTTOM).reset();
        }
    }

    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(Canvas canvas0) {
        ArrayList arrayList0 = this.mConstraintHelpers;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            if(v > 0) {
                for(int v1 = 0; v1 < v; ++v1) {
                    ((ConstraintHelper)this.mConstraintHelpers.get(v1)).updatePreDraw(this);
                }
            }
        }
        super.dispatchDraw(canvas0);
        if(this.isInEditMode()) {
            float f = (float)this.getWidth();
            float f1 = (float)this.getHeight();
            int v2 = this.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = this.getChildAt(v3);
                if(view0.getVisibility() != 8) {
                    Object object0 = view0.getTag();
                    if(object0 != null && object0 instanceof String) {
                        String[] arr_s = ((String)object0).split(",");
                        if(arr_s.length == 4) {
                            int v4 = Integer.parseInt(arr_s[0]);
                            int v5 = Integer.parseInt(arr_s[1]);
                            int v6 = Integer.parseInt(arr_s[2]);
                            int v7 = (int)(((float)v4) / 1080.0f * f);
                            int v8 = (int)(((float)v5) / 1920.0f * f1);
                            int v9 = (int)(((float)Integer.parseInt(arr_s[3])) / 1920.0f * f1);
                            Paint paint0 = new Paint();
                            paint0.setColor(0xFFFF0000);
                            float f2 = (float)(v7 + ((int)(((float)v6) / 1080.0f * f)));
                            canvas0.drawLine(((float)v7), ((float)v8), f2, ((float)v8), paint0);
                            float f3 = (float)(v8 + v9);
                            canvas0.drawLine(f2, ((float)v8), f2, f3, paint0);
                            canvas0.drawLine(f2, f3, ((float)v7), f3, paint0);
                            canvas0.drawLine(((float)v7), f3, ((float)v7), ((float)v8), paint0);
                            paint0.setColor(0xFF00FF00);
                            canvas0.drawLine(((float)v7), ((float)v8), f2, f3, paint0);
                            canvas0.drawLine(((float)v7), f3, f2, ((float)v8), paint0);
                        }
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics0) {
        this.mMetrics = metrics0;
        this.mLayoutWidget.fillMetrics(metrics0);
    }

    @Override  // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    // 去混淆评级： 低(20)
    public Object getDesignInformation(int v, Object object0) {
        return v != 0 || !(object0 instanceof String) || (this.mDesignIds == null || !this.mDesignIds.containsKey(((String)object0))) ? null : this.mDesignIds.get(((String)object0));
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    private int getPaddingWidth() {
        int v = Math.max(0, this.getPaddingLeft());
        int v1 = Math.max(0, this.getPaddingRight()) + v;
        int v2 = Math.max(0, this.getPaddingStart());
        int v3 = Math.max(0, this.getPaddingEnd()) + v2;
        return v3 <= 0 ? v1 : v3;
    }

    public String getSceneString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.mLayoutWidget.stringId == null) {
            int v = this.getId();
            this.mLayoutWidget.stringId = v == -1 ? "parent" : this.getContext().getResources().getResourceEntryName(v);
        }
        if(this.mLayoutWidget.getDebugName() == null) {
            this.mLayoutWidget.setDebugName(this.mLayoutWidget.stringId);
            Log.v("ConstraintLayout", " setDebugName " + this.mLayoutWidget.getDebugName());
        }
        for(Object object0: this.mLayoutWidget.getChildren()) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            View view0 = (View)constraintWidget0.getCompanionWidget();
            if(view0 != null) {
                if(constraintWidget0.stringId == null) {
                    int v1 = view0.getId();
                    if(v1 != -1) {
                        constraintWidget0.stringId = this.getContext().getResources().getResourceEntryName(v1);
                    }
                }
                if(constraintWidget0.getDebugName() == null) {
                    constraintWidget0.setDebugName(constraintWidget0.stringId);
                    Log.v("ConstraintLayout", " setDebugName " + constraintWidget0.getDebugName());
                }
            }
        }
        this.mLayoutWidget.getSceneString(stringBuilder0);
        return stringBuilder0.toString();
    }

    public static SharedValues getSharedValues() {
        if(ConstraintLayout.sSharedValues == null) {
            ConstraintLayout.sSharedValues = new SharedValues();
        }
        return ConstraintLayout.sSharedValues;
    }

    public View getViewById(int v) {
        return (View)this.mChildrenByIds.get(v);
    }

    public final ConstraintWidget getViewWidget(View view0) {
        if(view0 == this) {
            return this.mLayoutWidget;
        }
        if(view0 != null) {
            if(view0.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams)view0.getLayoutParams()).widget;
            }
            view0.setLayoutParams(this.generateLayoutParams(view0.getLayoutParams()));
            return view0.getLayoutParams() instanceof LayoutParams ? ((LayoutParams)view0.getLayoutParams()).widget : null;
        }
        return null;
    }

    public boolean isRtl() {
        return (this.getContext().getApplicationInfo().flags & 0x400000) != 0 && 1 == this.getLayoutDirection();
    }

    public void loadLayoutDescription(int v) {
        if(v != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(this.getContext(), this, v);
            }
            catch(Resources.NotFoundException unused_ex) {
                this.mConstraintLayoutSpec = null;
            }
            return;
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        boolean z1 = this.isInEditMode();
        for(int v6 = 0; v6 < v4; ++v6) {
            View view0 = this.getChildAt(v6);
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            ConstraintWidget constraintWidget0 = constraintLayout$LayoutParams0.widget;
            if((view0.getVisibility() != 8 || constraintLayout$LayoutParams0.isGuideline || constraintLayout$LayoutParams0.isHelper || constraintLayout$LayoutParams0.isVirtualGroup || z1) && !constraintLayout$LayoutParams0.isInPlaceholder) {
                int v7 = constraintWidget0.getX();
                int v8 = constraintWidget0.getY();
                int v9 = constraintWidget0.getWidth() + v7;
                int v10 = constraintWidget0.getHeight() + v8;
                view0.layout(v7, v8, v9, v10);
                if(view0 instanceof Placeholder) {
                    View view1 = ((Placeholder)view0).getContent();
                    if(view1 != null) {
                        view1.setVisibility(0);
                        view1.layout(v7, v8, v9, v10);
                    }
                }
            }
        }
        int v11 = this.mConstraintHelpers.size();
        if(v11 > 0) {
            for(int v5 = 0; v5 < v11; ++v5) {
                ((ConstraintHelper)this.mConstraintHelpers.get(v5)).updatePostLayout(this);
            }
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        ConstraintWidget constraintWidget1;
        if(!this.mDirtyHierarchy) {
            int v3 = this.getChildCount();
            for(int v4 = 0; v4 < v3; ++v4) {
                if(this.getChildAt(v4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = v;
        this.mOnMeasureHeightMeasureSpec = v1;
        this.mLayoutWidget.setRtl(this.isRtl());
        if(this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int v5 = this.getChildCount();
            for(int v6 = 0; true; ++v6) {
                boolean z = false;
                if(v6 >= v5) {
                    break;
                }
                if(this.getChildAt(v6).isLayoutRequested()) {
                    z = true;
                    break;
                }
            }
            if(z) {
                boolean z1 = this.isInEditMode();
                int v7 = this.getChildCount();
                for(int v8 = 0; v8 < v7; ++v8) {
                    ConstraintWidget constraintWidget0 = this.getViewWidget(this.getChildAt(v8));
                    if(constraintWidget0 != null) {
                        constraintWidget0.reset();
                    }
                }
                if(z1) {
                    for(int v9 = 0; v9 < v7; ++v9) {
                        View view0 = this.getChildAt(v9);
                        try {
                            String s = this.getResources().getResourceName(view0.getId());
                            this.setDesignInformation(0, s, view0.getId());
                            int v10 = s.indexOf(0x2F);
                            if(v10 != -1) {
                                s = s.substring(v10 + 1);
                            }
                            int v11 = view0.getId();
                            if(v11 == 0) {
                                constraintWidget1 = this.mLayoutWidget;
                            }
                            else {
                                View view1 = (View)this.mChildrenByIds.get(v11);
                                if(view1 == null) {
                                    view1 = this.findViewById(v11);
                                    if(view1 != null && view1 != this && view1.getParent() == this) {
                                        this.onViewAdded(view1);
                                    }
                                }
                                if(view1 == this) {
                                    constraintWidget1 = this.mLayoutWidget;
                                }
                                else {
                                    constraintWidget1 = view1 == null ? null : ((LayoutParams)view1.getLayoutParams()).widget;
                                }
                            }
                            constraintWidget1.setDebugName(s);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                        }
                    }
                }
                if(this.mConstraintSetId != -1) {
                    for(int v12 = 0; v12 < v7; ++v12) {
                        View view2 = this.getChildAt(v12);
                        if(view2.getId() == this.mConstraintSetId && view2 instanceof Constraints) {
                            this.mConstraintSet = ((Constraints)view2).getConstraintSet();
                        }
                    }
                }
                ConstraintSet constraintSet0 = this.mConstraintSet;
                if(constraintSet0 != null) {
                    constraintSet0.b(this, true);
                }
                this.mLayoutWidget.removeAllChildren();
                int v13 = this.mConstraintHelpers.size();
                if(v13 > 0) {
                    for(int v14 = 0; v14 < v13; ++v14) {
                        ((ConstraintHelper)this.mConstraintHelpers.get(v14)).updatePreLayout(this);
                    }
                }
                for(int v15 = 0; v15 < v7; ++v15) {
                    View view3 = this.getChildAt(v15);
                    if(view3 instanceof Placeholder) {
                        ((Placeholder)view3).updatePreLayout(this);
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(this.getId(), this.mLayoutWidget);
                for(int v16 = 0; v16 < v7; ++v16) {
                    View view4 = this.getChildAt(v16);
                    ConstraintWidget constraintWidget2 = this.getViewWidget(view4);
                    this.mTempMapIdToWidget.put(view4.getId(), constraintWidget2);
                }
                for(int v2 = 0; v2 < v7; ++v2) {
                    View view5 = this.getChildAt(v2);
                    ConstraintWidget constraintWidget3 = this.getViewWidget(view5);
                    if(constraintWidget3 != null) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view5.getLayoutParams();
                        this.mLayoutWidget.add(constraintWidget3);
                        this.applyConstraintsFromLayoutParams(z1, view5, constraintWidget3, ((LayoutParams)viewGroup$LayoutParams0), this.mTempMapIdToWidget);
                    }
                }
            }
            if(z) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        this.resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, v, v1);
        this.resolveMeasuredDimension(v, v1, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
    }

    @Override  // android.view.ViewGroup
    public void onViewAdded(View view0) {
        super.onViewAdded(view0);
        if(view0 instanceof androidx.constraintlayout.widget.Guideline && !(this.getViewWidget(view0) instanceof Guideline)) {
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Guideline guideline0 = new Guideline();
            constraintLayout$LayoutParams0.widget = guideline0;
            constraintLayout$LayoutParams0.isGuideline = true;
            guideline0.setOrientation(constraintLayout$LayoutParams0.orientation);
        }
        if(view0 instanceof ConstraintHelper) {
            ((ConstraintHelper)view0).validateParams();
            ((LayoutParams)view0.getLayoutParams()).isHelper = true;
            if(!this.mConstraintHelpers.contains(((ConstraintHelper)view0))) {
                this.mConstraintHelpers.add(((ConstraintHelper)view0));
            }
        }
        this.mChildrenByIds.put(view0.getId(), view0);
        this.mDirtyHierarchy = true;
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        this.mChildrenByIds.remove(view0.getId());
        ConstraintWidget constraintWidget0 = this.getViewWidget(view0);
        this.mLayoutWidget.remove(constraintWidget0);
        this.mConstraintHelpers.remove(view0);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int v) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(this.getContext(), this, v);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int v, int v1, int v2, int v3, boolean z, boolean z1) {
        int v4 = v3 + this.mMeasurer.e;
        int v5 = View.resolveSizeAndState(v2 + this.mMeasurer.d, v, 0);
        int v6 = View.resolveSizeAndState(v4, v1, 0);
        int v7 = Math.min(this.mMaxWidth, v5 & 0xFFFFFF);
        int v8 = Math.min(this.mMaxHeight, v6 & 0xFFFFFF);
        if(z) {
            v7 |= 0x1000000;
        }
        if(z1) {
            v8 |= 0x1000000;
        }
        this.setMeasuredDimension(v7, v8);
        this.mLastMeasureWidth = v7;
        this.mLastMeasureHeight = v8;
    }

    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2) {
        int v13;
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = View.MeasureSpec.getMode(v2);
        int v6 = View.MeasureSpec.getSize(v2);
        int v7 = Math.max(0, this.getPaddingTop());
        int v8 = Math.max(0, this.getPaddingBottom());
        int v9 = v7 + v8;
        int v10 = this.getPaddingWidth();
        this.mMeasurer.b = v7;
        this.mMeasurer.c = v8;
        this.mMeasurer.d = v10;
        this.mMeasurer.e = v9;
        this.mMeasurer.f = v1;
        this.mMeasurer.g = v2;
        int v11 = Math.max(0, this.getPaddingStart());
        int v12 = Math.max(0, this.getPaddingEnd());
        if(v11 > 0 || v12 > 0) {
            v13 = this.isRtl() ? v12 : v11;
        }
        else {
            v13 = Math.max(0, this.getPaddingLeft());
        }
        int v14 = v4 - v10;
        int v15 = v6 - v9;
        this.setSelfDimensionBehaviour(constraintWidgetContainer0, v3, v14, v5, v15);
        constraintWidgetContainer0.measure(v, v3, v14, v5, v15, this.mLastMeasureWidth, this.mLastMeasureHeight, v13, v7);
    }

    public void setConstraintSet(ConstraintSet constraintSet0) {
        this.mConstraintSet = constraintSet0;
    }

    public void setDesignInformation(int v, Object object0, Object object1) {
        if(v == 0 && object0 instanceof String && object1 instanceof Integer) {
            if(this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            String s = (String)object0;
            int v1 = s.indexOf("/");
            if(v1 != -1) {
                s = s.substring(v1 + 1);
            }
            ((Integer)object1).intValue();
            this.mDesignIds.put(s, ((Integer)object1));
        }
    }

    @Override  // android.view.View
    public void setId(int v) {
        this.mChildrenByIds.remove(this.getId());
        super.setId(v);
        this.mChildrenByIds.put(this.getId(), this);
    }

    public void setMaxHeight(int v) {
        if(v == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = v;
        this.requestLayout();
    }

    public void setMaxWidth(int v) {
        if(v == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = v;
        this.requestLayout();
    }

    public void setMinHeight(int v) {
        if(v == this.mMinHeight) {
            return;
        }
        this.mMinHeight = v;
        this.requestLayout();
    }

    public void setMinWidth(int v) {
        if(v == this.mMinWidth) {
            return;
        }
        this.mMinWidth = v;
        this.requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener0) {
        this.mConstraintsChangedListener = constraintsChangedListener0;
        ConstraintLayoutStates constraintLayoutStates0 = this.mConstraintLayoutSpec;
        if(constraintLayoutStates0 != null) {
            constraintLayoutStates0.setOnConstraintsChanged(constraintsChangedListener0);
        }
    }

    public void setOptimizationLevel(int v) {
        this.mOptimizationLevel = v;
        this.mLayoutWidget.setOptimizationLevel(v);
    }

    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2, int v3) {
        DimensionBehaviour constraintWidget$DimensionBehaviour1;
        int v4 = this.mMeasurer.e;
        int v5 = this.mMeasurer.d;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.FIXED;
        int v6 = this.getChildCount();
        switch(v) {
            case 0x80000000: {
                constraintWidget$DimensionBehaviour1 = DimensionBehaviour.WRAP_CONTENT;
                if(v6 == 0) {
                    v1 = Math.max(0, this.mMinWidth);
                }
                break;
            }
            case 0: {
                constraintWidget$DimensionBehaviour1 = DimensionBehaviour.WRAP_CONTENT;
                v1 = v6 == 0 ? Math.max(0, this.mMinWidth) : 0;
                break;
            }
            case 0x40000000: {
                v1 = Math.min(this.mMaxWidth - v5, v1);
                constraintWidget$DimensionBehaviour1 = constraintWidget$DimensionBehaviour0;
                break;
            }
            default: {
                constraintWidget$DimensionBehaviour1 = constraintWidget$DimensionBehaviour0;
                v1 = 0;
            }
        }
        switch(v2) {
            case 0x80000000: {
                constraintWidget$DimensionBehaviour0 = DimensionBehaviour.WRAP_CONTENT;
                if(v6 == 0) {
                    v3 = Math.max(0, this.mMinHeight);
                }
                break;
            }
            case 0: {
                constraintWidget$DimensionBehaviour0 = DimensionBehaviour.WRAP_CONTENT;
                v3 = v6 == 0 ? Math.max(0, this.mMinHeight) : 0;
                break;
            }
            case 0x40000000: {
                v3 = Math.min(this.mMaxHeight - v4, v3);
                break;
            }
            default: {
                v3 = 0;
            }
        }
        if(v1 != constraintWidgetContainer0.getWidth() || v3 != constraintWidgetContainer0.getHeight()) {
            constraintWidgetContainer0.invalidateMeasures();
        }
        constraintWidgetContainer0.setX(0);
        constraintWidgetContainer0.setY(0);
        constraintWidgetContainer0.setMaxWidth(this.mMaxWidth - v5);
        constraintWidgetContainer0.setMaxHeight(this.mMaxHeight - v4);
        constraintWidgetContainer0.setMinWidth(0);
        constraintWidgetContainer0.setMinHeight(0);
        constraintWidgetContainer0.setHorizontalDimensionBehaviour(constraintWidget$DimensionBehaviour1);
        constraintWidgetContainer0.setWidth(v1);
        constraintWidgetContainer0.setVerticalDimensionBehaviour(constraintWidget$DimensionBehaviour0);
        constraintWidgetContainer0.setHeight(v3);
        constraintWidgetContainer0.setMinWidth(this.mMinWidth - v5);
        constraintWidgetContainer0.setMinHeight(this.mMinHeight - v4);
    }

    public void setState(int v, int v1, int v2) {
        ConstraintLayoutStates constraintLayoutStates0 = this.mConstraintLayoutSpec;
        if(constraintLayoutStates0 != null) {
            constraintLayoutStates0.updateConstraints(v, ((float)v1), ((float)v2));
        }
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

