package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet {
    public static class Constraint {
        public int a;
        public String b;
        public g c;
        public final Layout layout;
        public HashMap mCustomConstraints;
        public final Motion motion;
        public final PropertySet propertySet;
        public final Transform transform;

        public Constraint() {
            this.propertySet = new PropertySet();
            this.motion = new Motion();
            this.layout = new Layout();
            this.transform = new Transform();
            this.mCustomConstraints = new HashMap();
        }

        public final void a(int v, LayoutParams constraintLayout$LayoutParams0) {
            this.a = v;
            Layout constraintSet$Layout0 = this.layout;
            constraintSet$Layout0.leftToLeft = constraintLayout$LayoutParams0.leftToLeft;
            constraintSet$Layout0.leftToRight = constraintLayout$LayoutParams0.leftToRight;
            constraintSet$Layout0.rightToLeft = constraintLayout$LayoutParams0.rightToLeft;
            constraintSet$Layout0.rightToRight = constraintLayout$LayoutParams0.rightToRight;
            constraintSet$Layout0.topToTop = constraintLayout$LayoutParams0.topToTop;
            constraintSet$Layout0.topToBottom = constraintLayout$LayoutParams0.topToBottom;
            constraintSet$Layout0.bottomToTop = constraintLayout$LayoutParams0.bottomToTop;
            constraintSet$Layout0.bottomToBottom = constraintLayout$LayoutParams0.bottomToBottom;
            constraintSet$Layout0.baselineToBaseline = constraintLayout$LayoutParams0.baselineToBaseline;
            constraintSet$Layout0.baselineToTop = constraintLayout$LayoutParams0.baselineToTop;
            constraintSet$Layout0.baselineToBottom = constraintLayout$LayoutParams0.baselineToBottom;
            constraintSet$Layout0.startToEnd = constraintLayout$LayoutParams0.startToEnd;
            constraintSet$Layout0.startToStart = constraintLayout$LayoutParams0.startToStart;
            constraintSet$Layout0.endToStart = constraintLayout$LayoutParams0.endToStart;
            constraintSet$Layout0.endToEnd = constraintLayout$LayoutParams0.endToEnd;
            constraintSet$Layout0.horizontalBias = constraintLayout$LayoutParams0.horizontalBias;
            constraintSet$Layout0.verticalBias = constraintLayout$LayoutParams0.verticalBias;
            constraintSet$Layout0.dimensionRatio = constraintLayout$LayoutParams0.dimensionRatio;
            constraintSet$Layout0.circleConstraint = constraintLayout$LayoutParams0.circleConstraint;
            constraintSet$Layout0.circleRadius = constraintLayout$LayoutParams0.circleRadius;
            constraintSet$Layout0.circleAngle = constraintLayout$LayoutParams0.circleAngle;
            constraintSet$Layout0.editorAbsoluteX = constraintLayout$LayoutParams0.editorAbsoluteX;
            constraintSet$Layout0.editorAbsoluteY = constraintLayout$LayoutParams0.editorAbsoluteY;
            constraintSet$Layout0.orientation = constraintLayout$LayoutParams0.orientation;
            constraintSet$Layout0.guidePercent = constraintLayout$LayoutParams0.guidePercent;
            constraintSet$Layout0.guideBegin = constraintLayout$LayoutParams0.guideBegin;
            constraintSet$Layout0.guideEnd = constraintLayout$LayoutParams0.guideEnd;
            constraintSet$Layout0.mWidth = constraintLayout$LayoutParams0.width;
            constraintSet$Layout0.mHeight = constraintLayout$LayoutParams0.height;
            constraintSet$Layout0.leftMargin = constraintLayout$LayoutParams0.leftMargin;
            constraintSet$Layout0.rightMargin = constraintLayout$LayoutParams0.rightMargin;
            constraintSet$Layout0.topMargin = constraintLayout$LayoutParams0.topMargin;
            constraintSet$Layout0.bottomMargin = constraintLayout$LayoutParams0.bottomMargin;
            constraintSet$Layout0.baselineMargin = constraintLayout$LayoutParams0.baselineMargin;
            constraintSet$Layout0.verticalWeight = constraintLayout$LayoutParams0.verticalWeight;
            constraintSet$Layout0.horizontalWeight = constraintLayout$LayoutParams0.horizontalWeight;
            constraintSet$Layout0.verticalChainStyle = constraintLayout$LayoutParams0.verticalChainStyle;
            constraintSet$Layout0.horizontalChainStyle = constraintLayout$LayoutParams0.horizontalChainStyle;
            constraintSet$Layout0.constrainedWidth = constraintLayout$LayoutParams0.constrainedWidth;
            constraintSet$Layout0.constrainedHeight = constraintLayout$LayoutParams0.constrainedHeight;
            constraintSet$Layout0.widthDefault = constraintLayout$LayoutParams0.matchConstraintDefaultWidth;
            constraintSet$Layout0.heightDefault = constraintLayout$LayoutParams0.matchConstraintDefaultHeight;
            constraintSet$Layout0.widthMax = constraintLayout$LayoutParams0.matchConstraintMaxWidth;
            constraintSet$Layout0.heightMax = constraintLayout$LayoutParams0.matchConstraintMaxHeight;
            constraintSet$Layout0.widthMin = constraintLayout$LayoutParams0.matchConstraintMinWidth;
            constraintSet$Layout0.heightMin = constraintLayout$LayoutParams0.matchConstraintMinHeight;
            constraintSet$Layout0.widthPercent = constraintLayout$LayoutParams0.matchConstraintPercentWidth;
            constraintSet$Layout0.heightPercent = constraintLayout$LayoutParams0.matchConstraintPercentHeight;
            constraintSet$Layout0.mConstraintTag = constraintLayout$LayoutParams0.constraintTag;
            constraintSet$Layout0.goneTopMargin = constraintLayout$LayoutParams0.goneTopMargin;
            constraintSet$Layout0.goneBottomMargin = constraintLayout$LayoutParams0.goneBottomMargin;
            constraintSet$Layout0.goneLeftMargin = constraintLayout$LayoutParams0.goneLeftMargin;
            constraintSet$Layout0.goneRightMargin = constraintLayout$LayoutParams0.goneRightMargin;
            constraintSet$Layout0.goneStartMargin = constraintLayout$LayoutParams0.goneStartMargin;
            constraintSet$Layout0.goneEndMargin = constraintLayout$LayoutParams0.goneEndMargin;
            constraintSet$Layout0.goneBaselineMargin = constraintLayout$LayoutParams0.goneBaselineMargin;
            constraintSet$Layout0.mWrapBehavior = constraintLayout$LayoutParams0.wrapBehaviorInParent;
            constraintSet$Layout0.endMargin = constraintLayout$LayoutParams0.getMarginEnd();
            this.layout.startMargin = constraintLayout$LayoutParams0.getMarginStart();
        }

        public void applyDelta(Constraint constraintSet$Constraint0) {
            g g0 = this.c;
            if(g0 != null) {
                g0.e(constraintSet$Constraint0);
            }
        }

        public void applyTo(LayoutParams constraintLayout$LayoutParams0) {
            Layout constraintSet$Layout0 = this.layout;
            constraintLayout$LayoutParams0.leftToLeft = constraintSet$Layout0.leftToLeft;
            constraintLayout$LayoutParams0.leftToRight = constraintSet$Layout0.leftToRight;
            constraintLayout$LayoutParams0.rightToLeft = constraintSet$Layout0.rightToLeft;
            constraintLayout$LayoutParams0.rightToRight = constraintSet$Layout0.rightToRight;
            constraintLayout$LayoutParams0.topToTop = constraintSet$Layout0.topToTop;
            constraintLayout$LayoutParams0.topToBottom = constraintSet$Layout0.topToBottom;
            constraintLayout$LayoutParams0.bottomToTop = constraintSet$Layout0.bottomToTop;
            constraintLayout$LayoutParams0.bottomToBottom = constraintSet$Layout0.bottomToBottom;
            constraintLayout$LayoutParams0.baselineToBaseline = constraintSet$Layout0.baselineToBaseline;
            constraintLayout$LayoutParams0.baselineToTop = constraintSet$Layout0.baselineToTop;
            constraintLayout$LayoutParams0.baselineToBottom = constraintSet$Layout0.baselineToBottom;
            constraintLayout$LayoutParams0.startToEnd = constraintSet$Layout0.startToEnd;
            constraintLayout$LayoutParams0.startToStart = constraintSet$Layout0.startToStart;
            constraintLayout$LayoutParams0.endToStart = constraintSet$Layout0.endToStart;
            constraintLayout$LayoutParams0.endToEnd = constraintSet$Layout0.endToEnd;
            constraintLayout$LayoutParams0.leftMargin = constraintSet$Layout0.leftMargin;
            constraintLayout$LayoutParams0.rightMargin = constraintSet$Layout0.rightMargin;
            constraintLayout$LayoutParams0.topMargin = constraintSet$Layout0.topMargin;
            constraintLayout$LayoutParams0.bottomMargin = constraintSet$Layout0.bottomMargin;
            constraintLayout$LayoutParams0.goneStartMargin = constraintSet$Layout0.goneStartMargin;
            constraintLayout$LayoutParams0.goneEndMargin = constraintSet$Layout0.goneEndMargin;
            constraintLayout$LayoutParams0.goneTopMargin = constraintSet$Layout0.goneTopMargin;
            constraintLayout$LayoutParams0.goneBottomMargin = constraintSet$Layout0.goneBottomMargin;
            constraintLayout$LayoutParams0.horizontalBias = constraintSet$Layout0.horizontalBias;
            constraintLayout$LayoutParams0.verticalBias = constraintSet$Layout0.verticalBias;
            constraintLayout$LayoutParams0.circleConstraint = constraintSet$Layout0.circleConstraint;
            constraintLayout$LayoutParams0.circleRadius = constraintSet$Layout0.circleRadius;
            constraintLayout$LayoutParams0.circleAngle = constraintSet$Layout0.circleAngle;
            constraintLayout$LayoutParams0.dimensionRatio = constraintSet$Layout0.dimensionRatio;
            constraintLayout$LayoutParams0.editorAbsoluteX = constraintSet$Layout0.editorAbsoluteX;
            constraintLayout$LayoutParams0.editorAbsoluteY = constraintSet$Layout0.editorAbsoluteY;
            constraintLayout$LayoutParams0.verticalWeight = constraintSet$Layout0.verticalWeight;
            constraintLayout$LayoutParams0.horizontalWeight = constraintSet$Layout0.horizontalWeight;
            constraintLayout$LayoutParams0.verticalChainStyle = constraintSet$Layout0.verticalChainStyle;
            constraintLayout$LayoutParams0.horizontalChainStyle = constraintSet$Layout0.horizontalChainStyle;
            constraintLayout$LayoutParams0.constrainedWidth = constraintSet$Layout0.constrainedWidth;
            constraintLayout$LayoutParams0.constrainedHeight = constraintSet$Layout0.constrainedHeight;
            constraintLayout$LayoutParams0.matchConstraintDefaultWidth = constraintSet$Layout0.widthDefault;
            constraintLayout$LayoutParams0.matchConstraintDefaultHeight = constraintSet$Layout0.heightDefault;
            constraintLayout$LayoutParams0.matchConstraintMaxWidth = constraintSet$Layout0.widthMax;
            constraintLayout$LayoutParams0.matchConstraintMaxHeight = constraintSet$Layout0.heightMax;
            constraintLayout$LayoutParams0.matchConstraintMinWidth = constraintSet$Layout0.widthMin;
            constraintLayout$LayoutParams0.matchConstraintMinHeight = constraintSet$Layout0.heightMin;
            constraintLayout$LayoutParams0.matchConstraintPercentWidth = constraintSet$Layout0.widthPercent;
            constraintLayout$LayoutParams0.matchConstraintPercentHeight = constraintSet$Layout0.heightPercent;
            constraintLayout$LayoutParams0.orientation = constraintSet$Layout0.orientation;
            constraintLayout$LayoutParams0.guidePercent = constraintSet$Layout0.guidePercent;
            constraintLayout$LayoutParams0.guideBegin = constraintSet$Layout0.guideBegin;
            constraintLayout$LayoutParams0.guideEnd = constraintSet$Layout0.guideEnd;
            constraintLayout$LayoutParams0.width = constraintSet$Layout0.mWidth;
            constraintLayout$LayoutParams0.height = constraintSet$Layout0.mHeight;
            String s = constraintSet$Layout0.mConstraintTag;
            if(s != null) {
                constraintLayout$LayoutParams0.constraintTag = s;
            }
            constraintLayout$LayoutParams0.wrapBehaviorInParent = constraintSet$Layout0.mWrapBehavior;
            constraintLayout$LayoutParams0.setMarginStart(constraintSet$Layout0.startMargin);
            constraintLayout$LayoutParams0.setMarginEnd(this.layout.endMargin);
            constraintLayout$LayoutParams0.validate();
        }

        public final void b(int v, androidx.constraintlayout.widget.Constraints.LayoutParams constraints$LayoutParams0) {
            this.a(v, constraints$LayoutParams0);
            this.propertySet.alpha = constraints$LayoutParams0.alpha;
            this.transform.rotation = constraints$LayoutParams0.rotation;
            this.transform.rotationX = constraints$LayoutParams0.rotationX;
            this.transform.rotationY = constraints$LayoutParams0.rotationY;
            this.transform.scaleX = constraints$LayoutParams0.scaleX;
            this.transform.scaleY = constraints$LayoutParams0.scaleY;
            this.transform.transformPivotX = constraints$LayoutParams0.transformPivotX;
            this.transform.transformPivotY = constraints$LayoutParams0.transformPivotY;
            this.transform.translationX = constraints$LayoutParams0.translationX;
            this.transform.translationY = constraints$LayoutParams0.translationY;
            this.transform.translationZ = constraints$LayoutParams0.translationZ;
            this.transform.elevation = constraints$LayoutParams0.elevation;
            this.transform.applyElevation = constraints$LayoutParams0.applyElevation;
        }

        public final ConstraintAttribute c(String s, AttributeType constraintAttribute$AttributeType0) {
            if(this.mCustomConstraints.containsKey(s)) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.mCustomConstraints.get(s);
                if(constraintAttribute0.getType() != constraintAttribute$AttributeType0) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute0.getType().name());
                }
                return constraintAttribute0;
            }
            ConstraintAttribute constraintAttribute1 = new ConstraintAttribute(s, constraintAttribute$AttributeType0);
            this.mCustomConstraints.put(s, constraintAttribute1);
            return constraintAttribute1;
        }

        public Constraint clone() {
            Constraint constraintSet$Constraint0 = new Constraint();
            constraintSet$Constraint0.layout.copyFrom(this.layout);
            constraintSet$Constraint0.motion.copyFrom(this.motion);
            constraintSet$Constraint0.propertySet.copyFrom(this.propertySet);
            constraintSet$Constraint0.transform.copyFrom(this.transform);
            constraintSet$Constraint0.a = this.a;
            constraintSet$Constraint0.c = this.c;
            return constraintSet$Constraint0;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        public void printDelta(String s) {
            g g0 = this.c;
            if(g0 != null) {
                g0.getClass();
                Log.v(s, "int");
                for(int v1 = 0; v1 < g0.c; ++v1) {
                    Log.v(s, g0.a[v1] + " = " + g0.b[v1]);
                }
                Log.v(s, "float");
                for(int v2 = 0; v2 < g0.f; ++v2) {
                    Log.v(s, g0.d[v2] + " = " + g0.e[v2]);
                }
                Log.v(s, "strings");
                for(int v3 = 0; v3 < g0.i; ++v3) {
                    Log.v(s, g0.g[v3] + " = " + g0.h[v3]);
                }
                Log.v(s, "boolean");
                for(int v = 0; v < g0.l; ++v) {
                    Log.v(s, g0.j[v] + " = " + g0.k[v]);
                }
                return;
            }
            Log.v(s, "DELTA IS NULL");
        }
    }

    public static class Layout {
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = 0x80000000;
        public static final SparseIntArray a;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endMargin;
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
        public int heightDefault;
        public int heightMax;
        public int heightMin;
        public float heightPercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public boolean mApply;
        public boolean mBarrierAllowsGoneWidgets;
        public int mBarrierDirection;
        public int mBarrierMargin;
        public String mConstraintTag;
        public int mHeight;
        public int mHelperType;
        public boolean mIsGuideline;
        public boolean mOverride;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public int mWrapBehavior;
        public int orientation;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public int startMargin;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int widthDefault;
        public int widthMax;
        public int widthMin;
        public float widthPercent;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Layout.a = sparseIntArray0;
            sparseIntArray0.append(styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sparseIntArray0.append(styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sparseIntArray0.append(styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sparseIntArray0.append(styleable.Layout_layout_constraintRight_toRightOf, 29);
            sparseIntArray0.append(styleable.Layout_layout_constraintTop_toTopOf, 35);
            sparseIntArray0.append(styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sparseIntArray0.append(styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sparseIntArray0.append(styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sparseIntArray0.append(styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sparseIntArray0.append(styleable.Layout_layout_editor_absoluteX, 6);
            sparseIntArray0.append(styleable.Layout_layout_editor_absoluteY, 7);
            sparseIntArray0.append(styleable.Layout_layout_constraintGuide_begin, 17);
            sparseIntArray0.append(styleable.Layout_layout_constraintGuide_end, 18);
            sparseIntArray0.append(styleable.Layout_layout_constraintGuide_percent, 19);
            sparseIntArray0.append(styleable.Layout_guidelineUseRtl, 90);
            sparseIntArray0.append(styleable.Layout_android_orientation, 26);
            sparseIntArray0.append(styleable.Layout_layout_constraintStart_toEndOf, 0x1F);
            sparseIntArray0.append(styleable.Layout_layout_constraintStart_toStartOf, 0x20);
            sparseIntArray0.append(styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sparseIntArray0.append(styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sparseIntArray0.append(styleable.Layout_layout_goneMarginLeft, 13);
            sparseIntArray0.append(styleable.Layout_layout_goneMarginTop, 16);
            sparseIntArray0.append(styleable.Layout_layout_goneMarginRight, 14);
            sparseIntArray0.append(styleable.Layout_layout_goneMarginBottom, 11);
            sparseIntArray0.append(styleable.Layout_layout_goneMarginStart, 15);
            sparseIntArray0.append(styleable.Layout_layout_goneMarginEnd, 12);
            sparseIntArray0.append(styleable.Layout_layout_constraintVertical_weight, 38);
            sparseIntArray0.append(styleable.Layout_layout_constraintHorizontal_weight, 37);
            sparseIntArray0.append(styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sparseIntArray0.append(styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sparseIntArray0.append(styleable.Layout_layout_constraintHorizontal_bias, 20);
            sparseIntArray0.append(styleable.Layout_layout_constraintVertical_bias, 36);
            sparseIntArray0.append(styleable.Layout_layout_constraintDimensionRatio, 5);
            sparseIntArray0.append(styleable.Layout_layout_constraintLeft_creator, 91);
            sparseIntArray0.append(styleable.Layout_layout_constraintTop_creator, 91);
            sparseIntArray0.append(styleable.Layout_layout_constraintRight_creator, 91);
            sparseIntArray0.append(styleable.Layout_layout_constraintBottom_creator, 91);
            sparseIntArray0.append(styleable.Layout_layout_constraintBaseline_creator, 91);
            sparseIntArray0.append(styleable.Layout_android_layout_marginLeft, 23);
            sparseIntArray0.append(styleable.Layout_android_layout_marginRight, 27);
            sparseIntArray0.append(styleable.Layout_android_layout_marginStart, 30);
            sparseIntArray0.append(styleable.Layout_android_layout_marginEnd, 8);
            sparseIntArray0.append(styleable.Layout_android_layout_marginTop, 33);
            sparseIntArray0.append(styleable.Layout_android_layout_marginBottom, 2);
            sparseIntArray0.append(styleable.Layout_android_layout_width, 22);
            sparseIntArray0.append(styleable.Layout_android_layout_height, 21);
            sparseIntArray0.append(styleable.Layout_layout_constraintWidth, 41);
            sparseIntArray0.append(styleable.Layout_layout_constraintHeight, 42);
            sparseIntArray0.append(styleable.Layout_layout_constrainedWidth, 41);
            sparseIntArray0.append(styleable.Layout_layout_constrainedHeight, 42);
            sparseIntArray0.append(styleable.Layout_layout_wrapBehaviorInParent, 76);
            sparseIntArray0.append(styleable.Layout_layout_constraintCircle, 61);
            sparseIntArray0.append(styleable.Layout_layout_constraintCircleRadius, 62);
            sparseIntArray0.append(styleable.Layout_layout_constraintCircleAngle, 0x3F);
            sparseIntArray0.append(styleable.Layout_layout_constraintWidth_percent, 69);
            sparseIntArray0.append(styleable.Layout_layout_constraintHeight_percent, 70);
            sparseIntArray0.append(styleable.Layout_chainUseRtl, 71);
            sparseIntArray0.append(styleable.Layout_barrierDirection, 72);
            sparseIntArray0.append(styleable.Layout_barrierMargin, 73);
            sparseIntArray0.append(styleable.Layout_constraint_referenced_ids, 74);
            sparseIntArray0.append(styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public Layout() {
            this.mIsGuideline = false;
            this.mApply = false;
            this.mOverride = false;
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
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.leftMargin = 0;
            this.rightMargin = 0;
            this.topMargin = 0;
            this.bottomMargin = 0;
            this.endMargin = 0;
            this.startMargin = 0;
            this.baselineMargin = 0;
            this.goneLeftMargin = 0x80000000;
            this.goneTopMargin = 0x80000000;
            this.goneRightMargin = 0x80000000;
            this.goneBottomMargin = 0x80000000;
            this.goneEndMargin = 0x80000000;
            this.goneStartMargin = 0x80000000;
            this.goneBaselineMargin = 0x80000000;
            this.verticalWeight = -1.0f;
            this.horizontalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.widthDefault = 0;
            this.heightDefault = 0;
            this.widthMax = 0;
            this.heightMax = 0;
            this.widthMin = 0;
            this.heightMin = 0;
            this.widthPercent = 1.0f;
            this.heightPercent = 1.0f;
            this.mBarrierDirection = -1;
            this.mBarrierMargin = 0;
            this.mHelperType = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.mBarrierAllowsGoneWidgets = true;
            this.mWrapBehavior = 0;
        }

        public final void a(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Layout);
            this.mApply = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                SparseIntArray sparseIntArray0 = Layout.a;
                switch(sparseIntArray0.get(v2)) {
                    case 1: {
                        this.baselineToBaseline = ConstraintSet.g(typedArray0, v2, this.baselineToBaseline);
                        break;
                    }
                    case 2: {
                        this.bottomMargin = typedArray0.getDimensionPixelSize(v2, this.bottomMargin);
                        break;
                    }
                    case 3: {
                        this.bottomToBottom = ConstraintSet.g(typedArray0, v2, this.bottomToBottom);
                        break;
                    }
                    case 4: {
                        this.bottomToTop = ConstraintSet.g(typedArray0, v2, this.bottomToTop);
                        break;
                    }
                    case 5: {
                        this.dimensionRatio = typedArray0.getString(v2);
                        break;
                    }
                    case 6: {
                        this.editorAbsoluteX = typedArray0.getDimensionPixelOffset(v2, this.editorAbsoluteX);
                        break;
                    }
                    case 7: {
                        this.editorAbsoluteY = typedArray0.getDimensionPixelOffset(v2, this.editorAbsoluteY);
                        break;
                    }
                    case 8: {
                        this.endMargin = typedArray0.getDimensionPixelSize(v2, this.endMargin);
                        break;
                    }
                    case 9: {
                        this.endToEnd = ConstraintSet.g(typedArray0, v2, this.endToEnd);
                        break;
                    }
                    case 10: {
                        this.endToStart = ConstraintSet.g(typedArray0, v2, this.endToStart);
                        break;
                    }
                    case 11: {
                        this.goneBottomMargin = typedArray0.getDimensionPixelSize(v2, this.goneBottomMargin);
                        break;
                    }
                    case 12: {
                        this.goneEndMargin = typedArray0.getDimensionPixelSize(v2, this.goneEndMargin);
                        break;
                    }
                    case 13: {
                        this.goneLeftMargin = typedArray0.getDimensionPixelSize(v2, this.goneLeftMargin);
                        break;
                    }
                    case 14: {
                        this.goneRightMargin = typedArray0.getDimensionPixelSize(v2, this.goneRightMargin);
                        break;
                    }
                    case 15: {
                        this.goneStartMargin = typedArray0.getDimensionPixelSize(v2, this.goneStartMargin);
                        break;
                    }
                    case 16: {
                        this.goneTopMargin = typedArray0.getDimensionPixelSize(v2, this.goneTopMargin);
                        break;
                    }
                    case 17: {
                        this.guideBegin = typedArray0.getDimensionPixelOffset(v2, this.guideBegin);
                        break;
                    }
                    case 18: {
                        this.guideEnd = typedArray0.getDimensionPixelOffset(v2, this.guideEnd);
                        break;
                    }
                    case 19: {
                        this.guidePercent = typedArray0.getFloat(v2, this.guidePercent);
                        break;
                    }
                    case 20: {
                        this.horizontalBias = typedArray0.getFloat(v2, this.horizontalBias);
                        break;
                    }
                    case 21: {
                        this.mHeight = typedArray0.getLayoutDimension(v2, this.mHeight);
                        break;
                    }
                    case 22: {
                        this.mWidth = typedArray0.getLayoutDimension(v2, this.mWidth);
                        break;
                    }
                    case 23: {
                        this.leftMargin = typedArray0.getDimensionPixelSize(v2, this.leftMargin);
                        break;
                    }
                    case 24: {
                        this.leftToLeft = ConstraintSet.g(typedArray0, v2, this.leftToLeft);
                        break;
                    }
                    case 25: {
                        this.leftToRight = ConstraintSet.g(typedArray0, v2, this.leftToRight);
                        break;
                    }
                    case 26: {
                        this.orientation = typedArray0.getInt(v2, this.orientation);
                        break;
                    }
                    case 27: {
                        this.rightMargin = typedArray0.getDimensionPixelSize(v2, this.rightMargin);
                        break;
                    }
                    case 28: {
                        this.rightToLeft = ConstraintSet.g(typedArray0, v2, this.rightToLeft);
                        break;
                    }
                    case 29: {
                        this.rightToRight = ConstraintSet.g(typedArray0, v2, this.rightToRight);
                        break;
                    }
                    case 30: {
                        this.startMargin = typedArray0.getDimensionPixelSize(v2, this.startMargin);
                        break;
                    }
                    case 0x1F: {
                        this.startToEnd = ConstraintSet.g(typedArray0, v2, this.startToEnd);
                        break;
                    }
                    case 0x20: {
                        this.startToStart = ConstraintSet.g(typedArray0, v2, this.startToStart);
                        break;
                    }
                    case 33: {
                        this.topMargin = typedArray0.getDimensionPixelSize(v2, this.topMargin);
                        break;
                    }
                    case 34: {
                        this.topToBottom = ConstraintSet.g(typedArray0, v2, this.topToBottom);
                        break;
                    }
                    case 35: {
                        this.topToTop = ConstraintSet.g(typedArray0, v2, this.topToTop);
                        break;
                    }
                    case 36: {
                        this.verticalBias = typedArray0.getFloat(v2, this.verticalBias);
                        break;
                    }
                    case 37: {
                        this.horizontalWeight = typedArray0.getFloat(v2, this.horizontalWeight);
                        break;
                    }
                    case 38: {
                        this.verticalWeight = typedArray0.getFloat(v2, this.verticalWeight);
                        break;
                    }
                    case 39: {
                        this.horizontalChainStyle = typedArray0.getInt(v2, this.horizontalChainStyle);
                        break;
                    }
                    case 40: {
                        this.verticalChainStyle = typedArray0.getInt(v2, this.verticalChainStyle);
                        break;
                    }
                    case 41: {
                        ConstraintSet.h(this, typedArray0, v2, 0);
                        break;
                    }
                    case 42: {
                        ConstraintSet.h(this, typedArray0, v2, 1);
                        break;
                    }
                    case 61: {
                        this.circleConstraint = ConstraintSet.g(typedArray0, v2, this.circleConstraint);
                        break;
                    }
                    case 62: {
                        this.circleRadius = typedArray0.getDimensionPixelSize(v2, this.circleRadius);
                        break;
                    }
                    case 0x3F: {
                        this.circleAngle = typedArray0.getFloat(v2, this.circleAngle);
                        break;
                    }
                    case 69: {
                        this.widthPercent = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 70: {
                        this.heightPercent = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 72: {
                        this.mBarrierDirection = typedArray0.getInt(v2, this.mBarrierDirection);
                        break;
                    }
                    case 73: {
                        this.mBarrierMargin = typedArray0.getDimensionPixelSize(v2, this.mBarrierMargin);
                        break;
                    }
                    case 74: {
                        this.mReferenceIdString = typedArray0.getString(v2);
                        break;
                    }
                    case 75: {
                        this.mBarrierAllowsGoneWidgets = typedArray0.getBoolean(v2, this.mBarrierAllowsGoneWidgets);
                        break;
                    }
                    case 76: {
                        this.mWrapBehavior = typedArray0.getInt(v2, this.mWrapBehavior);
                        break;
                    }
                    case 77: {
                        this.baselineToTop = ConstraintSet.g(typedArray0, v2, this.baselineToTop);
                        break;
                    }
                    case 78: {
                        this.baselineToBottom = ConstraintSet.g(typedArray0, v2, this.baselineToBottom);
                        break;
                    }
                    case 0x4F: {
                        this.goneBaselineMargin = typedArray0.getDimensionPixelSize(v2, this.goneBaselineMargin);
                        break;
                    }
                    case 80: {
                        this.baselineMargin = typedArray0.getDimensionPixelSize(v2, this.baselineMargin);
                        break;
                    }
                    case 81: {
                        this.widthDefault = typedArray0.getInt(v2, this.widthDefault);
                        break;
                    }
                    case 82: {
                        this.heightDefault = typedArray0.getInt(v2, this.heightDefault);
                        break;
                    }
                    case 83: {
                        this.heightMax = typedArray0.getDimensionPixelSize(v2, this.heightMax);
                        break;
                    }
                    case 84: {
                        this.widthMax = typedArray0.getDimensionPixelSize(v2, this.widthMax);
                        break;
                    }
                    case 85: {
                        this.heightMin = typedArray0.getDimensionPixelSize(v2, this.heightMin);
                        break;
                    }
                    case 86: {
                        this.widthMin = typedArray0.getDimensionPixelSize(v2, this.widthMin);
                        break;
                    }
                    case 87: {
                        this.constrainedWidth = typedArray0.getBoolean(v2, this.constrainedWidth);
                        break;
                    }
                    case 88: {
                        this.constrainedHeight = typedArray0.getBoolean(v2, this.constrainedHeight);
                        break;
                    }
                    case 89: {
                        this.mConstraintTag = typedArray0.getString(v2);
                        break;
                    }
                    case 90: {
                        this.guidelineUseRtl = typedArray0.getBoolean(v2, this.guidelineUseRtl);
                        break;
                    }
                    case 91: {
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                        break;
                    }
                    default: {
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                    }
                }
            }
            typedArray0.recycle();
        }

        public void copyFrom(Layout constraintSet$Layout0) {
            this.mIsGuideline = constraintSet$Layout0.mIsGuideline;
            this.mWidth = constraintSet$Layout0.mWidth;
            this.mApply = constraintSet$Layout0.mApply;
            this.mHeight = constraintSet$Layout0.mHeight;
            this.guideBegin = constraintSet$Layout0.guideBegin;
            this.guideEnd = constraintSet$Layout0.guideEnd;
            this.guidePercent = constraintSet$Layout0.guidePercent;
            this.guidelineUseRtl = constraintSet$Layout0.guidelineUseRtl;
            this.leftToLeft = constraintSet$Layout0.leftToLeft;
            this.leftToRight = constraintSet$Layout0.leftToRight;
            this.rightToLeft = constraintSet$Layout0.rightToLeft;
            this.rightToRight = constraintSet$Layout0.rightToRight;
            this.topToTop = constraintSet$Layout0.topToTop;
            this.topToBottom = constraintSet$Layout0.topToBottom;
            this.bottomToTop = constraintSet$Layout0.bottomToTop;
            this.bottomToBottom = constraintSet$Layout0.bottomToBottom;
            this.baselineToBaseline = constraintSet$Layout0.baselineToBaseline;
            this.baselineToTop = constraintSet$Layout0.baselineToTop;
            this.baselineToBottom = constraintSet$Layout0.baselineToBottom;
            this.startToEnd = constraintSet$Layout0.startToEnd;
            this.startToStart = constraintSet$Layout0.startToStart;
            this.endToStart = constraintSet$Layout0.endToStart;
            this.endToEnd = constraintSet$Layout0.endToEnd;
            this.horizontalBias = constraintSet$Layout0.horizontalBias;
            this.verticalBias = constraintSet$Layout0.verticalBias;
            this.dimensionRatio = constraintSet$Layout0.dimensionRatio;
            this.circleConstraint = constraintSet$Layout0.circleConstraint;
            this.circleRadius = constraintSet$Layout0.circleRadius;
            this.circleAngle = constraintSet$Layout0.circleAngle;
            this.editorAbsoluteX = constraintSet$Layout0.editorAbsoluteX;
            this.editorAbsoluteY = constraintSet$Layout0.editorAbsoluteY;
            this.orientation = constraintSet$Layout0.orientation;
            this.leftMargin = constraintSet$Layout0.leftMargin;
            this.rightMargin = constraintSet$Layout0.rightMargin;
            this.topMargin = constraintSet$Layout0.topMargin;
            this.bottomMargin = constraintSet$Layout0.bottomMargin;
            this.endMargin = constraintSet$Layout0.endMargin;
            this.startMargin = constraintSet$Layout0.startMargin;
            this.baselineMargin = constraintSet$Layout0.baselineMargin;
            this.goneLeftMargin = constraintSet$Layout0.goneLeftMargin;
            this.goneTopMargin = constraintSet$Layout0.goneTopMargin;
            this.goneRightMargin = constraintSet$Layout0.goneRightMargin;
            this.goneBottomMargin = constraintSet$Layout0.goneBottomMargin;
            this.goneEndMargin = constraintSet$Layout0.goneEndMargin;
            this.goneStartMargin = constraintSet$Layout0.goneStartMargin;
            this.goneBaselineMargin = constraintSet$Layout0.goneBaselineMargin;
            this.verticalWeight = constraintSet$Layout0.verticalWeight;
            this.horizontalWeight = constraintSet$Layout0.horizontalWeight;
            this.horizontalChainStyle = constraintSet$Layout0.horizontalChainStyle;
            this.verticalChainStyle = constraintSet$Layout0.verticalChainStyle;
            this.widthDefault = constraintSet$Layout0.widthDefault;
            this.heightDefault = constraintSet$Layout0.heightDefault;
            this.widthMax = constraintSet$Layout0.widthMax;
            this.heightMax = constraintSet$Layout0.heightMax;
            this.widthMin = constraintSet$Layout0.widthMin;
            this.heightMin = constraintSet$Layout0.heightMin;
            this.widthPercent = constraintSet$Layout0.widthPercent;
            this.heightPercent = constraintSet$Layout0.heightPercent;
            this.mBarrierDirection = constraintSet$Layout0.mBarrierDirection;
            this.mBarrierMargin = constraintSet$Layout0.mBarrierMargin;
            this.mHelperType = constraintSet$Layout0.mHelperType;
            this.mConstraintTag = constraintSet$Layout0.mConstraintTag;
            int[] arr_v = constraintSet$Layout0.mReferenceIds;
            this.mReferenceIds = arr_v == null || constraintSet$Layout0.mReferenceIdString != null ? null : Arrays.copyOf(arr_v, arr_v.length);
            this.mReferenceIdString = constraintSet$Layout0.mReferenceIdString;
            this.constrainedWidth = constraintSet$Layout0.constrainedWidth;
            this.constrainedHeight = constraintSet$Layout0.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = constraintSet$Layout0.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = constraintSet$Layout0.mWrapBehavior;
        }

        public void dump(MotionScene motionScene0, StringBuilder stringBuilder0) {
            Field[] arr_field = this.getClass().getDeclaredFields();
            stringBuilder0.append("\n");
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                String s = field0.getName();
                if(!Modifier.isStatic(field0.getModifiers())) {
                    try {
                        Object object0 = field0.get(this);
                        Class class0 = field0.getType();
                        if(class0 == Integer.TYPE) {
                            Integer integer0 = (Integer)object0;
                            if(((int)integer0) != -1) {
                                String s1 = motionScene0.lookUpConstraintName(((int)integer0));
                                stringBuilder0.append("    ");
                                stringBuilder0.append(s);
                                stringBuilder0.append(" = \"");
                                if(s1 != null) {
                                    integer0 = s1;
                                }
                                stringBuilder0.append(integer0);
                                stringBuilder0.append("\"\n");
                            }
                        }
                        else if(class0 == Float.TYPE && ((float)(((Float)object0))) != -1.0f) {
                            stringBuilder0.append("    ");
                            stringBuilder0.append(s);
                            stringBuilder0.append(" = \"");
                            stringBuilder0.append(((Float)object0));
                            stringBuilder0.append("\"\n");
                        }
                        continue;
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                    }
                    illegalAccessException0.printStackTrace();
                }
            }
        }
    }

    public static class Motion {
        public static final SparseIntArray a;
        public int mAnimateCircleAngleTo;
        public int mAnimateRelativeTo;
        public boolean mApply;
        public int mDrawPath;
        public float mMotionStagger;
        public int mPathMotionArc;
        public float mPathRotate;
        public int mPolarRelativeTo;
        public int mQuantizeInterpolatorID;
        public String mQuantizeInterpolatorString;
        public int mQuantizeInterpolatorType;
        public float mQuantizeMotionPhase;
        public int mQuantizeMotionSteps;
        public String mTransitionEasing;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Motion.a = sparseIntArray0;
            sparseIntArray0.append(styleable.Motion_motionPathRotate, 1);
            sparseIntArray0.append(styleable.Motion_pathMotionArc, 2);
            sparseIntArray0.append(styleable.Motion_transitionEasing, 3);
            sparseIntArray0.append(styleable.Motion_drawPath, 4);
            sparseIntArray0.append(styleable.Motion_animateRelativeTo, 5);
            sparseIntArray0.append(styleable.Motion_animateCircleAngleTo, 6);
            sparseIntArray0.append(styleable.Motion_motionStagger, 7);
            sparseIntArray0.append(styleable.Motion_quantizeMotionSteps, 8);
            sparseIntArray0.append(styleable.Motion_quantizeMotionPhase, 9);
            sparseIntArray0.append(styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public Motion() {
            this.mApply = false;
            this.mAnimateRelativeTo = -1;
            this.mAnimateCircleAngleTo = 0;
            this.mTransitionEasing = null;
            this.mPathMotionArc = -1;
            this.mDrawPath = 0;
            this.mMotionStagger = NaNf;
            this.mPolarRelativeTo = -1;
            this.mPathRotate = NaNf;
            this.mQuantizeMotionPhase = NaNf;
            this.mQuantizeMotionSteps = -1;
            this.mQuantizeInterpolatorString = null;
            this.mQuantizeInterpolatorType = -3;
            this.mQuantizeInterpolatorID = -1;
        }

        public final void a(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Motion);
            this.mApply = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Motion.a.get(v2)) {
                    case 1: {
                        this.mPathRotate = typedArray0.getFloat(v2, this.mPathRotate);
                        break;
                    }
                    case 2: {
                        this.mPathMotionArc = typedArray0.getInt(v2, this.mPathMotionArc);
                        break;
                    }
                    case 3: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            this.mTransitionEasing = typedArray0.getString(v2);
                        }
                        else {
                            String[] arr_s = Easing.NAMED_EASING;
                            this.mTransitionEasing = arr_s[typedArray0.getInteger(v2, 0)];
                        }
                        break;
                    }
                    case 4: {
                        this.mDrawPath = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 5: {
                        this.mAnimateRelativeTo = ConstraintSet.g(typedArray0, v2, this.mAnimateRelativeTo);
                        break;
                    }
                    case 6: {
                        this.mAnimateCircleAngleTo = typedArray0.getInteger(v2, this.mAnimateCircleAngleTo);
                        break;
                    }
                    case 7: {
                        this.mMotionStagger = typedArray0.getFloat(v2, this.mMotionStagger);
                        break;
                    }
                    case 8: {
                        this.mQuantizeMotionSteps = typedArray0.getInteger(v2, this.mQuantizeMotionSteps);
                        break;
                    }
                    case 9: {
                        this.mQuantizeMotionPhase = typedArray0.getFloat(v2, this.mQuantizeMotionPhase);
                        break;
                    }
                    case 10: {
                        int v3 = typedArray0.peekValue(v2).type;
                        if(v3 == 1) {
                            int v4 = typedArray0.getResourceId(v2, -1);
                            this.mQuantizeInterpolatorID = v4;
                            if(v4 != -1) {
                                this.mQuantizeInterpolatorType = -2;
                            }
                        }
                        else if(v3 == 3) {
                            String s = typedArray0.getString(v2);
                            this.mQuantizeInterpolatorString = s;
                            if(s.indexOf("/") > 0) {
                                this.mQuantizeInterpolatorID = typedArray0.getResourceId(v2, -1);
                                this.mQuantizeInterpolatorType = -2;
                            }
                            else {
                                this.mQuantizeInterpolatorType = -1;
                            }
                        }
                        else {
                            this.mQuantizeInterpolatorType = typedArray0.getInteger(v2, this.mQuantizeInterpolatorID);
                        }
                    }
                }
            }
            typedArray0.recycle();
        }

        public void copyFrom(Motion constraintSet$Motion0) {
            this.mApply = constraintSet$Motion0.mApply;
            this.mAnimateRelativeTo = constraintSet$Motion0.mAnimateRelativeTo;
            this.mTransitionEasing = constraintSet$Motion0.mTransitionEasing;
            this.mPathMotionArc = constraintSet$Motion0.mPathMotionArc;
            this.mDrawPath = constraintSet$Motion0.mDrawPath;
            this.mPathRotate = constraintSet$Motion0.mPathRotate;
            this.mMotionStagger = constraintSet$Motion0.mMotionStagger;
            this.mPolarRelativeTo = constraintSet$Motion0.mPolarRelativeTo;
        }
    }

    public static class PropertySet {
        public float alpha;
        public boolean mApply;
        public float mProgress;
        public int mVisibilityMode;
        public int visibility;

        public PropertySet() {
            this.mApply = false;
            this.visibility = 0;
            this.mVisibilityMode = 0;
            this.alpha = 1.0f;
            this.mProgress = NaNf;
        }

        public final void a(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.PropertySet);
            this.mApply = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.PropertySet_android_alpha) {
                    this.alpha = typedArray0.getFloat(v2, this.alpha);
                }
                else if(v2 == styleable.PropertySet_android_visibility) {
                    this.visibility = ConstraintSet.d[typedArray0.getInt(v2, this.visibility)];
                }
                else if(v2 == styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = typedArray0.getInt(v2, this.mVisibilityMode);
                }
                else if(v2 == styleable.PropertySet_motionProgress) {
                    this.mProgress = typedArray0.getFloat(v2, this.mProgress);
                }
            }
            typedArray0.recycle();
        }

        public void copyFrom(PropertySet constraintSet$PropertySet0) {
            this.mApply = constraintSet$PropertySet0.mApply;
            this.visibility = constraintSet$PropertySet0.visibility;
            this.alpha = constraintSet$PropertySet0.alpha;
            this.mProgress = constraintSet$PropertySet0.mProgress;
            this.mVisibilityMode = constraintSet$PropertySet0.mVisibilityMode;
        }
    }

    public static class Transform {
        public static final SparseIntArray a;
        public boolean applyElevation;
        public float elevation;
        public boolean mApply;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public int transformPivotTarget;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Transform.a = sparseIntArray0;
            sparseIntArray0.append(styleable.Transform_android_rotation, 1);
            sparseIntArray0.append(styleable.Transform_android_rotationX, 2);
            sparseIntArray0.append(styleable.Transform_android_rotationY, 3);
            sparseIntArray0.append(styleable.Transform_android_scaleX, 4);
            sparseIntArray0.append(styleable.Transform_android_scaleY, 5);
            sparseIntArray0.append(styleable.Transform_android_transformPivotX, 6);
            sparseIntArray0.append(styleable.Transform_android_transformPivotY, 7);
            sparseIntArray0.append(styleable.Transform_android_translationX, 8);
            sparseIntArray0.append(styleable.Transform_android_translationY, 9);
            sparseIntArray0.append(styleable.Transform_android_translationZ, 10);
            sparseIntArray0.append(styleable.Transform_android_elevation, 11);
            sparseIntArray0.append(styleable.Transform_transformPivotTarget, 12);
        }

        public Transform() {
            this.mApply = false;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = NaNf;
            this.transformPivotY = NaNf;
            this.transformPivotTarget = -1;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
        }

        public final void a(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Transform);
            this.mApply = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Transform.a.get(v2)) {
                    case 1: {
                        this.rotation = typedArray0.getFloat(v2, this.rotation);
                        break;
                    }
                    case 2: {
                        this.rotationX = typedArray0.getFloat(v2, this.rotationX);
                        break;
                    }
                    case 3: {
                        this.rotationY = typedArray0.getFloat(v2, this.rotationY);
                        break;
                    }
                    case 4: {
                        this.scaleX = typedArray0.getFloat(v2, this.scaleX);
                        break;
                    }
                    case 5: {
                        this.scaleY = typedArray0.getFloat(v2, this.scaleY);
                        break;
                    }
                    case 6: {
                        this.transformPivotX = typedArray0.getDimension(v2, this.transformPivotX);
                        break;
                    }
                    case 7: {
                        this.transformPivotY = typedArray0.getDimension(v2, this.transformPivotY);
                        break;
                    }
                    case 8: {
                        this.translationX = typedArray0.getDimension(v2, this.translationX);
                        break;
                    }
                    case 9: {
                        this.translationY = typedArray0.getDimension(v2, this.translationY);
                        break;
                    }
                    case 10: {
                        this.translationZ = typedArray0.getDimension(v2, this.translationZ);
                        break;
                    }
                    case 11: {
                        this.applyElevation = true;
                        this.elevation = typedArray0.getDimension(v2, this.elevation);
                        break;
                    }
                    case 12: {
                        this.transformPivotTarget = ConstraintSet.g(typedArray0, v2, this.transformPivotTarget);
                    }
                }
            }
            typedArray0.recycle();
        }

        public void copyFrom(Transform constraintSet$Transform0) {
            this.mApply = constraintSet$Transform0.mApply;
            this.rotation = constraintSet$Transform0.rotation;
            this.rotationX = constraintSet$Transform0.rotationX;
            this.rotationY = constraintSet$Transform0.rotationY;
            this.scaleX = constraintSet$Transform0.scaleX;
            this.scaleY = constraintSet$Transform0.scaleY;
            this.transformPivotX = constraintSet$Transform0.transformPivotX;
            this.transformPivotY = constraintSet$Transform0.transformPivotY;
            this.transformPivotTarget = constraintSet$Transform0.transformPivotTarget;
            this.translationX = constraintSet$Transform0.translationX;
            this.translationY = constraintSet$Transform0.translationY;
            this.translationZ = constraintSet$Transform0.translationZ;
            this.applyElevation = constraintSet$Transform0.applyElevation;
            this.elevation = constraintSet$Transform0.elevation;
        }
    }

    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int CIRCLE_REFERENCE = 8;
    public static final int END = 7;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_GUIDELINE = 0;
    public static final int INVISIBLE = 4;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GUIDELINE = 1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;
    public final HashMap a;
    public boolean b;
    public final HashMap c;
    public static final int[] d;
    public String derivedState;
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public String mIdString;
    public int mRotate;

    static {
        ConstraintSet.d = new int[]{0, 4, 8};
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        ConstraintSet.e = sparseIntArray0;
        SparseIntArray sparseIntArray1 = new SparseIntArray();
        ConstraintSet.f = sparseIntArray1;
        sparseIntArray0.append(styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray0.append(styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray0.append(styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray0.append(styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray0.append(styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray0.append(styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray0.append(styleable.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray0.append(styleable.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray0.append(styleable.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray0.append(styleable.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray0.append(styleable.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray0.append(styleable.Constraint_guidelineUseRtl, 99);
        sparseIntArray0.append(styleable.Constraint_android_orientation, 27);
        sparseIntArray0.append(styleable.Constraint_layout_constraintStart_toEndOf, 0x20);
        sparseIntArray0.append(styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray0.append(styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray0.append(styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray0.append(styleable.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray0.append(styleable.Constraint_layout_goneMarginTop, 16);
        sparseIntArray0.append(styleable.Constraint_layout_goneMarginRight, 14);
        sparseIntArray0.append(styleable.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray0.append(styleable.Constraint_layout_goneMarginStart, 15);
        sparseIntArray0.append(styleable.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray0.append(styleable.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray0.append(styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray0.append(styleable.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray0.append(styleable.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray0.append(styleable.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray0.append(styleable.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray0.append(styleable.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray0.append(styleable.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray0.append(styleable.Constraint_android_layout_marginLeft, 24);
        sparseIntArray0.append(styleable.Constraint_android_layout_marginRight, 28);
        sparseIntArray0.append(styleable.Constraint_android_layout_marginStart, 0x1F);
        sparseIntArray0.append(styleable.Constraint_android_layout_marginEnd, 8);
        sparseIntArray0.append(styleable.Constraint_android_layout_marginTop, 34);
        sparseIntArray0.append(styleable.Constraint_android_layout_marginBottom, 2);
        sparseIntArray0.append(styleable.Constraint_android_layout_width, 23);
        sparseIntArray0.append(styleable.Constraint_android_layout_height, 21);
        sparseIntArray0.append(styleable.Constraint_layout_constraintWidth, 0x5F);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHeight, 0x60);
        sparseIntArray0.append(styleable.Constraint_android_visibility, 22);
        sparseIntArray0.append(styleable.Constraint_android_alpha, 43);
        sparseIntArray0.append(styleable.Constraint_android_elevation, 44);
        sparseIntArray0.append(styleable.Constraint_android_rotationX, 45);
        sparseIntArray0.append(styleable.Constraint_android_rotationY, 46);
        sparseIntArray0.append(styleable.Constraint_android_rotation, 60);
        sparseIntArray0.append(styleable.Constraint_android_scaleX, 0x2F);
        sparseIntArray0.append(styleable.Constraint_android_scaleY, 0x30);
        sparseIntArray0.append(styleable.Constraint_android_transformPivotX, 49);
        sparseIntArray0.append(styleable.Constraint_android_transformPivotY, 50);
        sparseIntArray0.append(styleable.Constraint_android_translationX, 51);
        sparseIntArray0.append(styleable.Constraint_android_translationY, 52);
        sparseIntArray0.append(styleable.Constraint_android_translationZ, 53);
        sparseIntArray0.append(styleable.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray0.append(styleable.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray0.append(styleable.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray0.append(styleable.Constraint_layout_constraintCircle, 61);
        sparseIntArray0.append(styleable.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray0.append(styleable.Constraint_layout_constraintCircleAngle, 0x3F);
        sparseIntArray0.append(styleable.Constraint_animateRelativeTo, 0x40);
        sparseIntArray0.append(styleable.Constraint_transitionEasing, 65);
        sparseIntArray0.append(styleable.Constraint_drawPath, 66);
        sparseIntArray0.append(styleable.Constraint_transitionPathRotate, 67);
        sparseIntArray0.append(styleable.Constraint_motionStagger, 0x4F);
        sparseIntArray0.append(styleable.Constraint_android_id, 38);
        sparseIntArray0.append(styleable.Constraint_motionProgress, 68);
        sparseIntArray0.append(styleable.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray0.append(styleable.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray0.append(styleable.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray0.append(styleable.Constraint_chainUseRtl, 71);
        sparseIntArray0.append(styleable.Constraint_barrierDirection, 72);
        sparseIntArray0.append(styleable.Constraint_barrierMargin, 73);
        sparseIntArray0.append(styleable.Constraint_constraint_referenced_ids, 74);
        sparseIntArray0.append(styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray0.append(styleable.Constraint_pathMotionArc, 76);
        sparseIntArray0.append(styleable.Constraint_layout_constraintTag, 77);
        sparseIntArray0.append(styleable.Constraint_visibilityMode, 78);
        sparseIntArray0.append(styleable.Constraint_layout_constrainedWidth, 80);
        sparseIntArray0.append(styleable.Constraint_layout_constrainedHeight, 81);
        sparseIntArray0.append(styleable.Constraint_polarRelativeTo, 82);
        sparseIntArray0.append(styleable.Constraint_transformPivotTarget, 83);
        sparseIntArray0.append(styleable.Constraint_quantizeMotionSteps, 84);
        sparseIntArray0.append(styleable.Constraint_quantizeMotionPhase, 85);
        sparseIntArray0.append(styleable.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray1.append(styleable.ConstraintOverride_android_orientation, 27);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_marginStart, 0x1F);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_width, 23);
        sparseIntArray1.append(styleable.ConstraintOverride_android_layout_height, 21);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintWidth, 0x5F);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHeight, 0x60);
        sparseIntArray1.append(styleable.ConstraintOverride_android_visibility, 22);
        sparseIntArray1.append(styleable.ConstraintOverride_android_alpha, 43);
        sparseIntArray1.append(styleable.ConstraintOverride_android_elevation, 44);
        sparseIntArray1.append(styleable.ConstraintOverride_android_rotationX, 45);
        sparseIntArray1.append(styleable.ConstraintOverride_android_rotationY, 46);
        sparseIntArray1.append(styleable.ConstraintOverride_android_rotation, 60);
        sparseIntArray1.append(styleable.ConstraintOverride_android_scaleX, 0x2F);
        sparseIntArray1.append(styleable.ConstraintOverride_android_scaleY, 0x30);
        sparseIntArray1.append(styleable.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray1.append(styleable.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray1.append(styleable.ConstraintOverride_android_translationX, 51);
        sparseIntArray1.append(styleable.ConstraintOverride_android_translationY, 52);
        sparseIntArray1.append(styleable.ConstraintOverride_android_translationZ, 53);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintCircleAngle, 0x3F);
        sparseIntArray1.append(styleable.ConstraintOverride_animateRelativeTo, 0x40);
        sparseIntArray1.append(styleable.ConstraintOverride_transitionEasing, 65);
        sparseIntArray1.append(styleable.ConstraintOverride_drawPath, 66);
        sparseIntArray1.append(styleable.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray1.append(styleable.ConstraintOverride_motionStagger, 0x4F);
        sparseIntArray1.append(styleable.ConstraintOverride_android_id, 38);
        sparseIntArray1.append(styleable.ConstraintOverride_motionTarget, 98);
        sparseIntArray1.append(styleable.ConstraintOverride_motionProgress, 68);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray1.append(styleable.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray1.append(styleable.ConstraintOverride_barrierDirection, 72);
        sparseIntArray1.append(styleable.ConstraintOverride_barrierMargin, 73);
        sparseIntArray1.append(styleable.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray1.append(styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray1.append(styleable.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray1.append(styleable.ConstraintOverride_visibilityMode, 78);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray1.append(styleable.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray1.append(styleable.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray1.append(styleable.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray1.append(styleable.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray1.append(styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray1.append(styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public ConstraintSet() {
        this.derivedState = "";
        this.mRotate = 0;
        this.a = new HashMap();
        this.b = true;
        this.c = new HashMap();
    }

    public final void a(AttributeType constraintAttribute$AttributeType0, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            HashMap hashMap0 = this.a;
            if(hashMap0.containsKey(arr_s[v])) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap0.get(arr_s[v]);
                if(constraintAttribute0 != null && constraintAttribute0.getType() != constraintAttribute$AttributeType0) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute0.getType().name());
                }
            }
            else {
                ConstraintAttribute constraintAttribute1 = new ConstraintAttribute(arr_s[v], constraintAttribute$AttributeType0);
                hashMap0.put(arr_s[v], constraintAttribute1);
            }
        }
    }

    public void addColorAttributes(String[] arr_s) {
        this.a(AttributeType.COLOR_TYPE, arr_s);
    }

    public void addFloatAttributes(String[] arr_s) {
        this.a(AttributeType.FLOAT_TYPE, arr_s);
    }

    public void addIntAttributes(String[] arr_s) {
        this.a(AttributeType.INT_TYPE, arr_s);
    }

    public void addStringAttributes(String[] arr_s) {
        this.a(AttributeType.STRING_TYPE, arr_s);
    }

    public void addToHorizontalChain(int v, int v1, int v2) {
        this.connect(v, 1, v1, (v1 == 0 ? 1 : 2), 0);
        this.connect(v, 2, v2, (v2 == 0 ? 2 : 1), 0);
        if(v1 != 0) {
            this.connect(v1, 2, v, 1, 0);
        }
        if(v2 != 0) {
            this.connect(v2, 1, v, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int v, int v1, int v2) {
        this.connect(v, 6, v1, (v1 == 0 ? 6 : 7), 0);
        this.connect(v, 7, v2, (v2 == 0 ? 7 : 6), 0);
        if(v1 != 0) {
            this.connect(v1, 7, v, 6, 0);
        }
        if(v2 != 0) {
            this.connect(v2, 6, v, 7, 0);
        }
    }

    public void addToVerticalChain(int v, int v1, int v2) {
        this.connect(v, 3, v1, (v1 == 0 ? 3 : 4), 0);
        this.connect(v, 4, v2, (v2 == 0 ? 4 : 3), 0);
        if(v1 != 0) {
            this.connect(v1, 4, v, 3, 0);
        }
        if(v2 != 0) {
            this.connect(v2, 3, v, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            int v2 = view0.getId();
            HashMap hashMap0 = this.c;
            if(hashMap0.containsKey(v2)) {
                if(this.b && v2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if(hashMap0.containsKey(v2)) {
                    Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v2);
                    if(constraintSet$Constraint0 != null) {
                        ConstraintAttribute.setAttributes(view0, constraintSet$Constraint0.mCustomConstraints);
                    }
                }
            }
            else {
                Log.w("ConstraintSet", "id unknown " + Debug.getName(view0));
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet0) {
        for(Object object0: constraintSet0.c.values()) {
            Constraint constraintSet$Constraint0 = (Constraint)object0;
            if(constraintSet$Constraint0.c == null) {
            }
            else if(constraintSet$Constraint0.b == null) {
                Constraint constraintSet$Constraint2 = this.getConstraint(constraintSet$Constraint0.a);
                constraintSet$Constraint0.c.e(constraintSet$Constraint2);
            }
            else {
                for(Object object1: this.c.keySet()) {
                    Constraint constraintSet$Constraint1 = this.getConstraint(((int)(((Integer)object1))));
                    String s = constraintSet$Constraint1.layout.mConstraintTag;
                    if(s != null && constraintSet$Constraint0.b.matches(s)) {
                        constraintSet$Constraint0.c.e(constraintSet$Constraint1);
                        constraintSet$Constraint1.mCustomConstraints.putAll(((HashMap)constraintSet$Constraint0.mCustomConstraints.clone()));
                    }
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout0) {
        this.b(constraintLayout0, true);
        constraintLayout0.setConstraintSet(null);
        constraintLayout0.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper0, ConstraintWidget constraintWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        int v = constraintHelper0.getId();
        HashMap hashMap0 = this.c;
        if(hashMap0.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
            if(constraintSet$Constraint0 != null && constraintWidget0 instanceof HelperWidget) {
                constraintHelper0.loadParameters(constraintSet$Constraint0, ((HelperWidget)constraintWidget0), constraintLayout$LayoutParams0, sparseArray0);
            }
        }
    }

    public void applyToLayoutParams(int v, LayoutParams constraintLayout$LayoutParams0) {
        HashMap hashMap0 = this.c;
        if(hashMap0.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
            if(constraintSet$Constraint0 != null) {
                constraintSet$Constraint0.applyTo(constraintLayout$LayoutParams0);
            }
        }
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout0) {
        this.b(constraintLayout0, false);
        constraintLayout0.setConstraintSet(null);
    }

    public final void b(ConstraintLayout constraintLayout0, boolean z) {
        int v = constraintLayout0.getChildCount();
        HashMap hashMap0 = this.c;
        HashSet hashSet0 = new HashSet(hashMap0.keySet());
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = constraintLayout0.getChildAt(v2);
            int v3 = view0.getId();
            if(hashMap0.containsKey(v3)) {
                if(this.b && v3 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if(v3 != -1) {
                    if(hashMap0.containsKey(v3)) {
                        hashSet0.remove(v3);
                        Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v3);
                        if(constraintSet$Constraint0 != null) {
                            if(view0 instanceof Barrier) {
                                constraintSet$Constraint0.layout.mHelperType = 1;
                                ((Barrier)view0).setId(v3);
                                ((Barrier)view0).setType(constraintSet$Constraint0.layout.mBarrierDirection);
                                ((Barrier)view0).setMargin(constraintSet$Constraint0.layout.mBarrierMargin);
                                ((Barrier)view0).setAllowsGoneWidget(constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets);
                                Layout constraintSet$Layout0 = constraintSet$Constraint0.layout;
                                int[] arr_v = constraintSet$Layout0.mReferenceIds;
                                if(arr_v == null) {
                                    String s = constraintSet$Layout0.mReferenceIdString;
                                    if(s != null) {
                                        constraintSet$Layout0.mReferenceIds = ConstraintSet.c(((Barrier)view0), s);
                                        ((Barrier)view0).setReferencedIds(constraintSet$Constraint0.layout.mReferenceIds);
                                    }
                                }
                                else {
                                    ((Barrier)view0).setReferencedIds(arr_v);
                                }
                            }
                            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                            constraintLayout$LayoutParams0.validate();
                            constraintSet$Constraint0.applyTo(constraintLayout$LayoutParams0);
                            if(z) {
                                ConstraintAttribute.setAttributes(view0, constraintSet$Constraint0.mCustomConstraints);
                            }
                            view0.setLayoutParams(constraintLayout$LayoutParams0);
                            PropertySet constraintSet$PropertySet0 = constraintSet$Constraint0.propertySet;
                            if(constraintSet$PropertySet0.mVisibilityMode == 0) {
                                view0.setVisibility(constraintSet$PropertySet0.visibility);
                            }
                            view0.setAlpha(constraintSet$Constraint0.propertySet.alpha);
                            view0.setRotation(constraintSet$Constraint0.transform.rotation);
                            view0.setRotationX(constraintSet$Constraint0.transform.rotationX);
                            view0.setRotationY(constraintSet$Constraint0.transform.rotationY);
                            view0.setScaleX(constraintSet$Constraint0.transform.scaleX);
                            view0.setScaleY(constraintSet$Constraint0.transform.scaleY);
                            Transform constraintSet$Transform0 = constraintSet$Constraint0.transform;
                            if(constraintSet$Transform0.transformPivotTarget == -1) {
                                if(!Float.isNaN(constraintSet$Transform0.transformPivotX)) {
                                    view0.setPivotX(constraintSet$Constraint0.transform.transformPivotX);
                                }
                                if(!Float.isNaN(constraintSet$Constraint0.transform.transformPivotY)) {
                                    view0.setPivotY(constraintSet$Constraint0.transform.transformPivotY);
                                }
                            }
                            else {
                                View view1 = ((View)view0.getParent()).findViewById(constraintSet$Constraint0.transform.transformPivotTarget);
                                if(view1 != null) {
                                    int v4 = view1.getTop();
                                    float f = ((float)(view1.getBottom() + v4)) / 2.0f;
                                    int v5 = view1.getLeft();
                                    float f1 = ((float)(view1.getRight() + v5)) / 2.0f;
                                    if(view0.getRight() - view0.getLeft() > 0 && view0.getBottom() - view0.getTop() > 0) {
                                        float f2 = f1 - ((float)view0.getLeft());
                                        float f3 = f - ((float)view0.getTop());
                                        view0.setPivotX(f2);
                                        view0.setPivotY(f3);
                                    }
                                }
                            }
                            view0.setTranslationX(constraintSet$Constraint0.transform.translationX);
                            view0.setTranslationY(constraintSet$Constraint0.transform.translationY);
                            view0.setTranslationZ(constraintSet$Constraint0.transform.translationZ);
                            Transform constraintSet$Transform1 = constraintSet$Constraint0.transform;
                            if(constraintSet$Transform1.applyElevation) {
                                view0.setElevation(constraintSet$Transform1.elevation);
                            }
                        }
                    }
                    else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + v3);
                    }
                }
            }
            else {
                Log.w("ConstraintSet", "id unknown " + Debug.getName(view0));
            }
        }
        for(Object object0: hashSet0) {
            Integer integer0 = (Integer)object0;
            Constraint constraintSet$Constraint1 = (Constraint)hashMap0.get(integer0);
            if(constraintSet$Constraint1 != null) {
                if(constraintSet$Constraint1.layout.mHelperType == 1) {
                    Barrier barrier0 = new Barrier(constraintLayout0.getContext());
                    barrier0.setId(((int)integer0));
                    Layout constraintSet$Layout1 = constraintSet$Constraint1.layout;
                    int[] arr_v1 = constraintSet$Layout1.mReferenceIds;
                    if(arr_v1 == null) {
                        String s1 = constraintSet$Layout1.mReferenceIdString;
                        if(s1 != null) {
                            constraintSet$Layout1.mReferenceIds = ConstraintSet.c(barrier0, s1);
                            barrier0.setReferencedIds(constraintSet$Constraint1.layout.mReferenceIds);
                        }
                    }
                    else {
                        barrier0.setReferencedIds(arr_v1);
                    }
                    barrier0.setType(constraintSet$Constraint1.layout.mBarrierDirection);
                    barrier0.setMargin(constraintSet$Constraint1.layout.mBarrierMargin);
                    LayoutParams constraintLayout$LayoutParams1 = constraintLayout0.generateDefaultLayoutParams();
                    barrier0.validateParams();
                    constraintSet$Constraint1.applyTo(constraintLayout$LayoutParams1);
                    constraintLayout0.addView(barrier0, constraintLayout$LayoutParams1);
                }
                if(constraintSet$Constraint1.layout.mIsGuideline) {
                    Guideline guideline0 = new Guideline(constraintLayout0.getContext());
                    guideline0.setId(((int)integer0));
                    LayoutParams constraintLayout$LayoutParams2 = constraintLayout0.generateDefaultLayoutParams();
                    constraintSet$Constraint1.applyTo(constraintLayout$LayoutParams2);
                    constraintLayout0.addView(guideline0, constraintLayout$LayoutParams2);
                }
            }
        }
        for(int v1 = 0; v1 < v; ++v1) {
            View view2 = constraintLayout0.getChildAt(v1);
            if(view2 instanceof ConstraintHelper) {
                ((ConstraintHelper)view2).applyLayoutFeaturesInConstraintSet(constraintLayout0);
            }
        }
    }

    public static Constraint buildDelta(Context context0, XmlPullParser xmlPullParser0) {
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
        Constraint constraintSet$Constraint0 = new Constraint();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ConstraintOverride);
        ConstraintSet.j(constraintSet$Constraint0, typedArray0);
        typedArray0.recycle();
        return constraintSet$Constraint0;
    }

    public static int[] c(Barrier barrier0, String s) {
        int v2;
        String[] arr_s = s.split(",");
        Context context0 = barrier0.getContext();
        int[] arr_v = new int[arr_s.length];
        int v = 0;
        int v1;
        for(v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v].trim();
            try {
                v2 = 0;
                v2 = id.class.getField(s1).getInt(null);
            }
            catch(Exception unused_ex) {
            }
            if(v2 == 0) {
                v2 = context0.getResources().getIdentifier(s1, "id", "net.daum.android.tistoryapp");
            }
            if(v2 == 0 && barrier0.isInEditMode() && barrier0.getParent() instanceof ConstraintLayout) {
                Object object0 = ((ConstraintLayout)barrier0.getParent()).getDesignInformation(0, s1);
                if(object0 != null && object0 instanceof Integer) {
                    v2 = (int)(((Integer)object0));
                }
            }
            arr_v[v1] = v2;
            ++v;
        }
        return v1 == arr_s.length ? arr_v : Arrays.copyOf(arr_v, v1);
    }

    public void center(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        if(v3 < 0 || v6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if(f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        HashMap hashMap0 = this.c;
        switch(v2) {
            case 1: 
            case 2: {
                this.connect(v, 1, v1, v2, v3);
                this.connect(v, 2, v4, v5, v6);
                Constraint constraintSet$Constraint1 = (Constraint)hashMap0.get(v);
                if(constraintSet$Constraint1 != null) {
                    constraintSet$Constraint1.layout.horizontalBias = f;
                    return;
                }
                break;
            }
            case 6: 
            case 7: {
                this.connect(v, 6, v1, v2, v3);
                this.connect(v, 7, v4, v5, v6);
                Constraint constraintSet$Constraint2 = (Constraint)hashMap0.get(v);
                if(constraintSet$Constraint2 != null) {
                    constraintSet$Constraint2.layout.horizontalBias = f;
                    return;
                }
                break;
            }
            default: {
                this.connect(v, 3, v1, v2, v3);
                this.connect(v, 4, v4, v5, v6);
                Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
                if(constraintSet$Constraint0 != null) {
                    constraintSet$Constraint0.layout.verticalBias = f;
                }
            }
        }
    }

    public void centerHorizontally(int v, int v1) {
        if(v1 == 0) {
            this.center(v, 0, 1, 0, 0, 2, 0, 0.5f);
            return;
        }
        this.center(v, v1, 2, 0, v1, 1, 0, 0.5f);
    }

    public void centerHorizontally(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        this.connect(v, 1, v1, v2, v3);
        this.connect(v, 2, v4, v5, v6);
        Constraint constraintSet$Constraint0 = (Constraint)this.c.get(v);
        if(constraintSet$Constraint0 != null) {
            constraintSet$Constraint0.layout.horizontalBias = f;
        }
    }

    public void centerHorizontallyRtl(int v, int v1) {
        if(v1 == 0) {
            this.center(v, 0, 6, 0, 0, 7, 0, 0.5f);
            return;
        }
        this.center(v, v1, 7, 0, v1, 6, 0, 0.5f);
    }

    public void centerHorizontallyRtl(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        this.connect(v, 6, v1, v2, v3);
        this.connect(v, 7, v4, v5, v6);
        Constraint constraintSet$Constraint0 = (Constraint)this.c.get(v);
        if(constraintSet$Constraint0 != null) {
            constraintSet$Constraint0.layout.horizontalBias = f;
        }
    }

    public void centerVertically(int v, int v1) {
        if(v1 == 0) {
            this.center(v, 0, 3, 0, 0, 4, 0, 0.5f);
            return;
        }
        this.center(v, v1, 4, 0, v1, 3, 0, 0.5f);
    }

    public void centerVertically(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        this.connect(v, 3, v1, v2, v3);
        this.connect(v, 4, v4, v5, v6);
        Constraint constraintSet$Constraint0 = (Constraint)this.c.get(v);
        if(constraintSet$Constraint0 != null) {
            constraintSet$Constraint0.layout.verticalBias = f;
        }
    }

    public void clear(int v) {
        this.c.remove(v);
    }

    public void clear(int v, int v1) {
        HashMap hashMap0 = this.c;
        if(hashMap0.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
            if(constraintSet$Constraint0 == null) {
                return;
            }
            switch(v1) {
                case 1: {
                    constraintSet$Constraint0.layout.leftToRight = -1;
                    constraintSet$Constraint0.layout.leftToLeft = -1;
                    constraintSet$Constraint0.layout.leftMargin = -1;
                    constraintSet$Constraint0.layout.goneLeftMargin = 0x80000000;
                    break;
                }
                case 2: {
                    constraintSet$Constraint0.layout.rightToRight = -1;
                    constraintSet$Constraint0.layout.rightToLeft = -1;
                    constraintSet$Constraint0.layout.rightMargin = -1;
                    constraintSet$Constraint0.layout.goneRightMargin = 0x80000000;
                    return;
                }
                case 3: {
                    constraintSet$Constraint0.layout.topToBottom = -1;
                    constraintSet$Constraint0.layout.topToTop = -1;
                    constraintSet$Constraint0.layout.topMargin = 0;
                    constraintSet$Constraint0.layout.goneTopMargin = 0x80000000;
                    return;
                }
                case 4: {
                    constraintSet$Constraint0.layout.bottomToTop = -1;
                    constraintSet$Constraint0.layout.bottomToBottom = -1;
                    constraintSet$Constraint0.layout.bottomMargin = 0;
                    constraintSet$Constraint0.layout.goneBottomMargin = 0x80000000;
                    return;
                }
                case 5: {
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                    constraintSet$Constraint0.layout.baselineMargin = 0;
                    constraintSet$Constraint0.layout.goneBaselineMargin = 0x80000000;
                    return;
                }
                case 6: {
                    constraintSet$Constraint0.layout.startToEnd = -1;
                    constraintSet$Constraint0.layout.startToStart = -1;
                    constraintSet$Constraint0.layout.startMargin = 0;
                    constraintSet$Constraint0.layout.goneStartMargin = 0x80000000;
                    return;
                }
                case 7: {
                    constraintSet$Constraint0.layout.endToStart = -1;
                    constraintSet$Constraint0.layout.endToEnd = -1;
                    constraintSet$Constraint0.layout.endMargin = 0;
                    constraintSet$Constraint0.layout.goneEndMargin = 0x80000000;
                    return;
                }
                case 8: {
                    constraintSet$Constraint0.layout.circleAngle = -1.0f;
                    constraintSet$Constraint0.layout.circleRadius = -1;
                    constraintSet$Constraint0.layout.circleConstraint = -1;
                    return;
                }
                default: {
                    throw new IllegalArgumentException("unknown constraint");
                }
            }
        }
    }

    public void clone(Context context0, int v) {
        this.clone(((ConstraintLayout)LayoutInflater.from(context0).inflate(v, null)));
    }

    public void clone(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        HashMap hashMap0 = this.c;
        hashMap0.clear();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.b && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if(!hashMap0.containsKey(v2)) {
                hashMap0.put(v2, new Constraint());
            }
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v2);
            if(constraintSet$Constraint0 != null) {
                constraintSet$Constraint0.mCustomConstraints = ConstraintAttribute.extractAttributes(this.a, view0);
                constraintSet$Constraint0.a(v2, constraintLayout$LayoutParams0);
                constraintSet$Constraint0.propertySet.visibility = view0.getVisibility();
                constraintSet$Constraint0.propertySet.alpha = view0.getAlpha();
                constraintSet$Constraint0.transform.rotation = view0.getRotation();
                constraintSet$Constraint0.transform.rotationX = view0.getRotationX();
                constraintSet$Constraint0.transform.rotationY = view0.getRotationY();
                constraintSet$Constraint0.transform.scaleX = view0.getScaleX();
                constraintSet$Constraint0.transform.scaleY = view0.getScaleY();
                float f = view0.getPivotX();
                float f1 = view0.getPivotY();
                if(((double)f) != 0.0 || ((double)f1) != 0.0) {
                    constraintSet$Constraint0.transform.transformPivotX = f;
                    constraintSet$Constraint0.transform.transformPivotY = f1;
                }
                constraintSet$Constraint0.transform.translationX = view0.getTranslationX();
                constraintSet$Constraint0.transform.translationY = view0.getTranslationY();
                constraintSet$Constraint0.transform.translationZ = view0.getTranslationZ();
                Transform constraintSet$Transform0 = constraintSet$Constraint0.transform;
                if(constraintSet$Transform0.applyElevation) {
                    constraintSet$Transform0.elevation = view0.getElevation();
                }
                if(view0 instanceof Barrier) {
                    constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets = ((Barrier)view0).getAllowsGoneWidget();
                    constraintSet$Constraint0.layout.mReferenceIds = ((Barrier)view0).getReferencedIds();
                    constraintSet$Constraint0.layout.mBarrierDirection = ((Barrier)view0).getType();
                    constraintSet$Constraint0.layout.mBarrierMargin = ((Barrier)view0).getMargin();
                }
            }
        }
    }

    public void clone(ConstraintSet constraintSet0) {
        HashMap hashMap0 = this.c;
        hashMap0.clear();
        for(Object object0: constraintSet0.c.keySet()) {
            Integer integer0 = (Integer)object0;
            Constraint constraintSet$Constraint0 = (Constraint)constraintSet0.c.get(integer0);
            if(constraintSet$Constraint0 != null) {
                hashMap0.put(integer0, constraintSet$Constraint0.clone());
            }
        }
    }

    public void clone(Constraints constraints0) {
        int v = constraints0.getChildCount();
        HashMap hashMap0 = this.c;
        hashMap0.clear();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraints0.getChildAt(v1);
            androidx.constraintlayout.widget.Constraints.LayoutParams constraints$LayoutParams0 = (androidx.constraintlayout.widget.Constraints.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.b && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if(!hashMap0.containsKey(v2)) {
                hashMap0.put(v2, new Constraint());
            }
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v2);
            if(constraintSet$Constraint0 != null) {
                if(view0 instanceof ConstraintHelper) {
                    constraintSet$Constraint0.b(v2, constraints$LayoutParams0);
                    if(((ConstraintHelper)view0) instanceof Barrier) {
                        constraintSet$Constraint0.layout.mHelperType = 1;
                        constraintSet$Constraint0.layout.mBarrierDirection = ((Barrier)(((ConstraintHelper)view0))).getType();
                        constraintSet$Constraint0.layout.mReferenceIds = ((Barrier)(((ConstraintHelper)view0))).getReferencedIds();
                        constraintSet$Constraint0.layout.mBarrierMargin = ((Barrier)(((ConstraintHelper)view0))).getMargin();
                    }
                }
                constraintSet$Constraint0.b(v2, constraints$LayoutParams0);
            }
        }
    }

    public void connect(int v, int v1, int v2, int v3) {
        HashMap hashMap0 = this.c;
        if(!hashMap0.containsKey(v)) {
            hashMap0.put(v, new Constraint());
        }
        Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
        if(constraintSet$Constraint0 == null) {
            return;
        }
        switch(v1) {
            case 1: {
                if(v3 == 1) {
                    constraintSet$Constraint0.layout.leftToLeft = v2;
                    constraintSet$Constraint0.layout.leftToRight = -1;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException("left to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.leftToRight = v2;
                constraintSet$Constraint0.layout.leftToLeft = -1;
                return;
            }
            case 2: {
                if(v3 == 1) {
                    constraintSet$Constraint0.layout.rightToLeft = v2;
                    constraintSet$Constraint0.layout.rightToRight = -1;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.rightToRight = v2;
                constraintSet$Constraint0.layout.rightToLeft = -1;
                return;
            }
            case 3: {
                if(v3 == 3) {
                    constraintSet$Constraint0.layout.topToTop = v2;
                    constraintSet$Constraint0.layout.topToBottom = -1;
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                    return;
                }
                if(v3 != 4) {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.topToBottom = v2;
                constraintSet$Constraint0.layout.topToTop = -1;
                constraintSet$Constraint0.layout.baselineToBaseline = -1;
                constraintSet$Constraint0.layout.baselineToTop = -1;
                constraintSet$Constraint0.layout.baselineToBottom = -1;
                return;
            }
            case 4: {
                if(v3 == 4) {
                    constraintSet$Constraint0.layout.bottomToBottom = v2;
                    constraintSet$Constraint0.layout.bottomToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                    return;
                }
                if(v3 != 3) {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.bottomToTop = v2;
                constraintSet$Constraint0.layout.bottomToBottom = -1;
                constraintSet$Constraint0.layout.baselineToBaseline = -1;
                constraintSet$Constraint0.layout.baselineToTop = -1;
                constraintSet$Constraint0.layout.baselineToBottom = -1;
                return;
            }
            case 5: {
                switch(v3) {
                    case 3: {
                        constraintSet$Constraint0.layout.baselineToTop = v2;
                        constraintSet$Constraint0.layout.bottomToBottom = -1;
                        constraintSet$Constraint0.layout.bottomToTop = -1;
                        constraintSet$Constraint0.layout.topToTop = -1;
                        constraintSet$Constraint0.layout.topToBottom = -1;
                        return;
                    }
                    case 4: {
                        constraintSet$Constraint0.layout.baselineToBottom = v2;
                        constraintSet$Constraint0.layout.bottomToBottom = -1;
                        constraintSet$Constraint0.layout.bottomToTop = -1;
                        constraintSet$Constraint0.layout.topToTop = -1;
                        constraintSet$Constraint0.layout.topToBottom = -1;
                        return;
                    }
                    case 5: {
                        constraintSet$Constraint0.layout.baselineToBaseline = v2;
                        constraintSet$Constraint0.layout.bottomToBottom = -1;
                        constraintSet$Constraint0.layout.bottomToTop = -1;
                        constraintSet$Constraint0.layout.topToTop = -1;
                        constraintSet$Constraint0.layout.topToBottom = -1;
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                    }
                }
            }
            case 6: {
                if(v3 == 6) {
                    constraintSet$Constraint0.layout.startToStart = v2;
                    constraintSet$Constraint0.layout.startToEnd = -1;
                    return;
                }
                if(v3 != 7) {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.startToEnd = v2;
                constraintSet$Constraint0.layout.startToStart = -1;
                return;
            }
            case 7: {
                if(v3 == 7) {
                    constraintSet$Constraint0.layout.endToEnd = v2;
                    constraintSet$Constraint0.layout.endToStart = -1;
                    return;
                }
                if(v3 != 6) {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.endToStart = v2;
                constraintSet$Constraint0.layout.endToEnd = -1;
                return;
            }
            default: {
                throw new IllegalArgumentException(ConstraintSet.k(v1) + " to " + ConstraintSet.k(v3) + " unknown");
            }
        }
    }

    public void connect(int v, int v1, int v2, int v3, int v4) {
        HashMap hashMap0 = this.c;
        if(!hashMap0.containsKey(v)) {
            hashMap0.put(v, new Constraint());
        }
        Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
        if(constraintSet$Constraint0 == null) {
            return;
        }
        switch(v1) {
            case 1: {
                if(v3 == 1) {
                    constraintSet$Constraint0.layout.leftToLeft = v2;
                    constraintSet$Constraint0.layout.leftToRight = -1;
                }
                else if(v3 == 2) {
                    constraintSet$Constraint0.layout.leftToRight = v2;
                    constraintSet$Constraint0.layout.leftToLeft = -1;
                }
                else {
                    throw new IllegalArgumentException("Left to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.leftMargin = v4;
                return;
            }
            case 2: {
                if(v3 == 1) {
                    constraintSet$Constraint0.layout.rightToLeft = v2;
                    constraintSet$Constraint0.layout.rightToRight = -1;
                }
                else if(v3 == 2) {
                    constraintSet$Constraint0.layout.rightToRight = v2;
                    constraintSet$Constraint0.layout.rightToLeft = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.rightMargin = v4;
                return;
            }
            case 3: {
                if(v3 == 3) {
                    constraintSet$Constraint0.layout.topToTop = v2;
                    constraintSet$Constraint0.layout.topToBottom = -1;
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                }
                else if(v3 == 4) {
                    constraintSet$Constraint0.layout.topToBottom = v2;
                    constraintSet$Constraint0.layout.topToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.topMargin = v4;
                return;
            }
            case 4: {
                if(v3 == 4) {
                    constraintSet$Constraint0.layout.bottomToBottom = v2;
                    constraintSet$Constraint0.layout.bottomToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                }
                else if(v3 == 3) {
                    constraintSet$Constraint0.layout.bottomToTop = v2;
                    constraintSet$Constraint0.layout.bottomToBottom = -1;
                    constraintSet$Constraint0.layout.baselineToBaseline = -1;
                    constraintSet$Constraint0.layout.baselineToTop = -1;
                    constraintSet$Constraint0.layout.baselineToBottom = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.bottomMargin = v4;
                return;
            }
            case 5: {
                switch(v3) {
                    case 3: {
                        constraintSet$Constraint0.layout.baselineToTop = v2;
                        constraintSet$Constraint0.layout.bottomToBottom = -1;
                        constraintSet$Constraint0.layout.bottomToTop = -1;
                        constraintSet$Constraint0.layout.topToTop = -1;
                        constraintSet$Constraint0.layout.topToBottom = -1;
                        return;
                    }
                    case 4: {
                        constraintSet$Constraint0.layout.baselineToBottom = v2;
                        constraintSet$Constraint0.layout.bottomToBottom = -1;
                        constraintSet$Constraint0.layout.bottomToTop = -1;
                        constraintSet$Constraint0.layout.topToTop = -1;
                        constraintSet$Constraint0.layout.topToBottom = -1;
                        return;
                    }
                    case 5: {
                        constraintSet$Constraint0.layout.baselineToBaseline = v2;
                        constraintSet$Constraint0.layout.bottomToBottom = -1;
                        constraintSet$Constraint0.layout.bottomToTop = -1;
                        constraintSet$Constraint0.layout.topToTop = -1;
                        constraintSet$Constraint0.layout.topToBottom = -1;
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                    }
                }
            }
            case 6: {
                if(v3 == 6) {
                    constraintSet$Constraint0.layout.startToStart = v2;
                    constraintSet$Constraint0.layout.startToEnd = -1;
                }
                else if(v3 == 7) {
                    constraintSet$Constraint0.layout.startToEnd = v2;
                    constraintSet$Constraint0.layout.startToStart = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.startMargin = v4;
                return;
            }
            case 7: {
                if(v3 == 7) {
                    constraintSet$Constraint0.layout.endToEnd = v2;
                    constraintSet$Constraint0.layout.endToStart = -1;
                }
                else if(v3 == 6) {
                    constraintSet$Constraint0.layout.endToStart = v2;
                    constraintSet$Constraint0.layout.endToEnd = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + ConstraintSet.k(v3) + " undefined");
                }
                constraintSet$Constraint0.layout.endMargin = v4;
                return;
            }
            default: {
                throw new IllegalArgumentException(ConstraintSet.k(v1) + " to " + ConstraintSet.k(v3) + " unknown");
            }
        }
    }

    public void constrainCircle(int v, int v1, int v2, float f) {
        Constraint constraintSet$Constraint0 = this.f(v);
        constraintSet$Constraint0.layout.circleConstraint = v1;
        constraintSet$Constraint0.layout.circleRadius = v2;
        constraintSet$Constraint0.layout.circleAngle = f;
    }

    public void constrainDefaultHeight(int v, int v1) {
        this.f(v).layout.heightDefault = v1;
    }

    public void constrainDefaultWidth(int v, int v1) {
        this.f(v).layout.widthDefault = v1;
    }

    public void constrainHeight(int v, int v1) {
        this.f(v).layout.mHeight = v1;
    }

    public void constrainMaxHeight(int v, int v1) {
        this.f(v).layout.heightMax = v1;
    }

    public void constrainMaxWidth(int v, int v1) {
        this.f(v).layout.widthMax = v1;
    }

    public void constrainMinHeight(int v, int v1) {
        this.f(v).layout.heightMin = v1;
    }

    public void constrainMinWidth(int v, int v1) {
        this.f(v).layout.widthMin = v1;
    }

    public void constrainPercentHeight(int v, float f) {
        this.f(v).layout.heightPercent = f;
    }

    public void constrainPercentWidth(int v, float f) {
        this.f(v).layout.widthPercent = f;
    }

    public void constrainWidth(int v, int v1) {
        this.f(v).layout.mWidth = v1;
    }

    public void constrainedHeight(int v, boolean z) {
        this.f(v).layout.constrainedHeight = z;
    }

    public void constrainedWidth(int v, boolean z) {
        this.f(v).layout.constrainedWidth = z;
    }

    public void create(int v, int v1) {
        Constraint constraintSet$Constraint0 = this.f(v);
        constraintSet$Constraint0.layout.mIsGuideline = true;
        constraintSet$Constraint0.layout.orientation = v1;
    }

    public void createBarrier(int v, int v1, int v2, int[] arr_v) {
        Constraint constraintSet$Constraint0 = this.f(v);
        constraintSet$Constraint0.layout.mHelperType = 1;
        constraintSet$Constraint0.layout.mBarrierDirection = v1;
        constraintSet$Constraint0.layout.mBarrierMargin = v2;
        constraintSet$Constraint0.layout.mIsGuideline = false;
        constraintSet$Constraint0.layout.mReferenceIds = arr_v;
    }

    public void createHorizontalChain(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4) {
        this.d(v, v1, v2, v3, arr_v, arr_f, v4, 1, 2);
    }

    public void createHorizontalChainRtl(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4) {
        this.d(v, v1, v2, v3, arr_v, arr_f, v4, 6, 7);
    }

    public void createVerticalChain(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4) {
        if(arr_v.length < 2 || arr_f != null && arr_f.length != arr_v.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if(arr_f != null) {
            Constraint constraintSet$Constraint0 = this.f(arr_v[0]);
            constraintSet$Constraint0.layout.verticalWeight = arr_f[0];
        }
        this.f(arr_v[0]).layout.verticalChainStyle = v4;
        this.connect(arr_v[0], 3, v, v1, 0);
        for(int v5 = 1; v5 < arr_v.length; ++v5) {
            this.connect(arr_v[v5], 3, arr_v[v5 - 1], 4, 0);
            this.connect(arr_v[v5 - 1], 4, arr_v[v5], 3, 0);
            if(arr_f != null) {
                Constraint constraintSet$Constraint1 = this.f(arr_v[v5]);
                constraintSet$Constraint1.layout.verticalWeight = arr_f[v5];
            }
        }
        this.connect(arr_v[arr_v.length - 1], 4, v2, v3, 0);
    }

    public final void d(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4, int v5, int v6) {
        if(arr_v.length < 2 || arr_f != null && arr_f.length != arr_v.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if(arr_f != null) {
            Constraint constraintSet$Constraint0 = this.f(arr_v[0]);
            constraintSet$Constraint0.layout.horizontalWeight = arr_f[0];
        }
        this.f(arr_v[0]).layout.horizontalChainStyle = v4;
        this.connect(arr_v[0], v5, v, v1, -1);
        for(int v7 = 1; v7 < arr_v.length; ++v7) {
            this.connect(arr_v[v7], v5, arr_v[v7 - 1], v6, -1);
            this.connect(arr_v[v7 - 1], v6, arr_v[v7], v5, -1);
            if(arr_f != null) {
                Constraint constraintSet$Constraint1 = this.f(arr_v[v7]);
                constraintSet$Constraint1.layout.horizontalWeight = arr_f[v7];
            }
        }
        this.connect(arr_v[arr_v.length - 1], v6, v2, v3, -1);
    }

    public void dump(MotionScene motionScene0, int[] arr_v) {
        HashSet hashSet0;
        HashMap hashMap0 = this.c;
        Set set0 = hashMap0.keySet();
        if(arr_v.length == 0) {
            hashSet0 = new HashSet(set0);
        }
        else {
            hashSet0 = new HashSet();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                hashSet0.add(((int)arr_v[v1]));
            }
        }
        System.out.println(hashSet0.size() + " constraints");
        StringBuilder stringBuilder0 = new StringBuilder();
        Integer[] arr_integer = (Integer[])hashSet0.toArray(new Integer[0]);
        for(int v = 0; v < arr_integer.length; ++v) {
            Integer integer0 = arr_integer[v];
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(integer0);
            if(constraintSet$Constraint0 != null) {
                stringBuilder0.append("<Constraint id=");
                stringBuilder0.append(integer0);
                stringBuilder0.append(" \n");
                constraintSet$Constraint0.layout.dump(motionScene0, stringBuilder0);
                stringBuilder0.append("/>\n");
            }
        }
        System.out.println(stringBuilder0.toString());
    }

    public static Constraint e(Context context0, AttributeSet attributeSet0, boolean z) {
        Constraint constraintSet$Constraint0 = new Constraint();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, (z ? styleable.ConstraintOverride : styleable.Constraint));
        if(z) {
            ConstraintSet.j(constraintSet$Constraint0, typedArray0);
        }
        else {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 != styleable.Constraint_android_id && styleable.Constraint_android_layout_marginStart != v2 && styleable.Constraint_android_layout_marginEnd != v2) {
                    constraintSet$Constraint0.motion.mApply = true;
                    constraintSet$Constraint0.layout.mApply = true;
                    constraintSet$Constraint0.propertySet.mApply = true;
                    constraintSet$Constraint0.transform.mApply = true;
                }
                SparseIntArray sparseIntArray0 = ConstraintSet.e;
                switch(sparseIntArray0.get(v2)) {
                    case 1: {
                        constraintSet$Constraint0.layout.baselineToBaseline = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.baselineToBaseline);
                        break;
                    }
                    case 2: {
                        constraintSet$Constraint0.layout.bottomMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.bottomMargin);
                        break;
                    }
                    case 3: {
                        constraintSet$Constraint0.layout.bottomToBottom = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.bottomToBottom);
                        break;
                    }
                    case 4: {
                        constraintSet$Constraint0.layout.bottomToTop = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.bottomToTop);
                        break;
                    }
                    case 5: {
                        constraintSet$Constraint0.layout.dimensionRatio = typedArray0.getString(v2);
                        break;
                    }
                    case 6: {
                        constraintSet$Constraint0.layout.editorAbsoluteX = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.editorAbsoluteX);
                        break;
                    }
                    case 7: {
                        constraintSet$Constraint0.layout.editorAbsoluteY = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.editorAbsoluteY);
                        break;
                    }
                    case 8: {
                        constraintSet$Constraint0.layout.endMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.endMargin);
                        break;
                    }
                    case 9: {
                        constraintSet$Constraint0.layout.endToEnd = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.endToEnd);
                        break;
                    }
                    case 10: {
                        constraintSet$Constraint0.layout.endToStart = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.endToStart);
                        break;
                    }
                    case 11: {
                        constraintSet$Constraint0.layout.goneBottomMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneBottomMargin);
                        break;
                    }
                    case 12: {
                        constraintSet$Constraint0.layout.goneEndMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneEndMargin);
                        break;
                    }
                    case 13: {
                        constraintSet$Constraint0.layout.goneLeftMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneLeftMargin);
                        break;
                    }
                    case 14: {
                        constraintSet$Constraint0.layout.goneRightMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneRightMargin);
                        break;
                    }
                    case 15: {
                        constraintSet$Constraint0.layout.goneStartMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneStartMargin);
                        break;
                    }
                    case 16: {
                        constraintSet$Constraint0.layout.goneTopMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneTopMargin);
                        break;
                    }
                    case 17: {
                        constraintSet$Constraint0.layout.guideBegin = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.guideBegin);
                        break;
                    }
                    case 18: {
                        constraintSet$Constraint0.layout.guideEnd = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.guideEnd);
                        break;
                    }
                    case 19: {
                        constraintSet$Constraint0.layout.guidePercent = typedArray0.getFloat(v2, constraintSet$Constraint0.layout.guidePercent);
                        break;
                    }
                    case 20: {
                        constraintSet$Constraint0.layout.horizontalBias = typedArray0.getFloat(v2, constraintSet$Constraint0.layout.horizontalBias);
                        break;
                    }
                    case 21: {
                        constraintSet$Constraint0.layout.mHeight = typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.layout.mHeight);
                        break;
                    }
                    case 22: {
                        constraintSet$Constraint0.propertySet.visibility = typedArray0.getInt(v2, constraintSet$Constraint0.propertySet.visibility);
                        constraintSet$Constraint0.propertySet.visibility = ConstraintSet.d[constraintSet$Constraint0.propertySet.visibility];
                        break;
                    }
                    case 23: {
                        constraintSet$Constraint0.layout.mWidth = typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.layout.mWidth);
                        break;
                    }
                    case 24: {
                        constraintSet$Constraint0.layout.leftMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.leftMargin);
                        break;
                    }
                    case 25: {
                        constraintSet$Constraint0.layout.leftToLeft = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.leftToLeft);
                        break;
                    }
                    case 26: {
                        constraintSet$Constraint0.layout.leftToRight = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.leftToRight);
                        break;
                    }
                    case 27: {
                        constraintSet$Constraint0.layout.orientation = typedArray0.getInt(v2, constraintSet$Constraint0.layout.orientation);
                        break;
                    }
                    case 28: {
                        constraintSet$Constraint0.layout.rightMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.rightMargin);
                        break;
                    }
                    case 29: {
                        constraintSet$Constraint0.layout.rightToLeft = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.rightToLeft);
                        break;
                    }
                    case 30: {
                        constraintSet$Constraint0.layout.rightToRight = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.rightToRight);
                        break;
                    }
                    case 0x1F: {
                        constraintSet$Constraint0.layout.startMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.startMargin);
                        break;
                    }
                    case 0x20: {
                        constraintSet$Constraint0.layout.startToEnd = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.startToEnd);
                        break;
                    }
                    case 33: {
                        constraintSet$Constraint0.layout.startToStart = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.startToStart);
                        break;
                    }
                    case 34: {
                        constraintSet$Constraint0.layout.topMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.topMargin);
                        break;
                    }
                    case 35: {
                        constraintSet$Constraint0.layout.topToBottom = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.topToBottom);
                        break;
                    }
                    case 36: {
                        constraintSet$Constraint0.layout.topToTop = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.topToTop);
                        break;
                    }
                    case 37: {
                        constraintSet$Constraint0.layout.verticalBias = typedArray0.getFloat(v2, constraintSet$Constraint0.layout.verticalBias);
                        break;
                    }
                    case 38: {
                        constraintSet$Constraint0.a = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                        break;
                    }
                    case 39: {
                        constraintSet$Constraint0.layout.horizontalWeight = typedArray0.getFloat(v2, constraintSet$Constraint0.layout.horizontalWeight);
                        break;
                    }
                    case 40: {
                        constraintSet$Constraint0.layout.verticalWeight = typedArray0.getFloat(v2, constraintSet$Constraint0.layout.verticalWeight);
                        break;
                    }
                    case 41: {
                        constraintSet$Constraint0.layout.horizontalChainStyle = typedArray0.getInt(v2, constraintSet$Constraint0.layout.horizontalChainStyle);
                        break;
                    }
                    case 42: {
                        constraintSet$Constraint0.layout.verticalChainStyle = typedArray0.getInt(v2, constraintSet$Constraint0.layout.verticalChainStyle);
                        break;
                    }
                    case 43: {
                        constraintSet$Constraint0.propertySet.alpha = typedArray0.getFloat(v2, constraintSet$Constraint0.propertySet.alpha);
                        break;
                    }
                    case 44: {
                        constraintSet$Constraint0.transform.applyElevation = true;
                        constraintSet$Constraint0.transform.elevation = typedArray0.getDimension(v2, constraintSet$Constraint0.transform.elevation);
                        break;
                    }
                    case 45: {
                        constraintSet$Constraint0.transform.rotationX = typedArray0.getFloat(v2, constraintSet$Constraint0.transform.rotationX);
                        break;
                    }
                    case 46: {
                        constraintSet$Constraint0.transform.rotationY = typedArray0.getFloat(v2, constraintSet$Constraint0.transform.rotationY);
                        break;
                    }
                    case 0x2F: {
                        constraintSet$Constraint0.transform.scaleX = typedArray0.getFloat(v2, constraintSet$Constraint0.transform.scaleX);
                        break;
                    }
                    case 0x30: {
                        constraintSet$Constraint0.transform.scaleY = typedArray0.getFloat(v2, constraintSet$Constraint0.transform.scaleY);
                        break;
                    }
                    case 49: {
                        constraintSet$Constraint0.transform.transformPivotX = typedArray0.getDimension(v2, constraintSet$Constraint0.transform.transformPivotX);
                        break;
                    }
                    case 50: {
                        constraintSet$Constraint0.transform.transformPivotY = typedArray0.getDimension(v2, constraintSet$Constraint0.transform.transformPivotY);
                        break;
                    }
                    case 51: {
                        constraintSet$Constraint0.transform.translationX = typedArray0.getDimension(v2, constraintSet$Constraint0.transform.translationX);
                        break;
                    }
                    case 52: {
                        constraintSet$Constraint0.transform.translationY = typedArray0.getDimension(v2, constraintSet$Constraint0.transform.translationY);
                        break;
                    }
                    case 53: {
                        constraintSet$Constraint0.transform.translationZ = typedArray0.getDimension(v2, constraintSet$Constraint0.transform.translationZ);
                        break;
                    }
                    case 54: {
                        constraintSet$Constraint0.layout.widthDefault = typedArray0.getInt(v2, constraintSet$Constraint0.layout.widthDefault);
                        break;
                    }
                    case 55: {
                        constraintSet$Constraint0.layout.heightDefault = typedArray0.getInt(v2, constraintSet$Constraint0.layout.heightDefault);
                        break;
                    }
                    case 56: {
                        constraintSet$Constraint0.layout.widthMax = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.widthMax);
                        break;
                    }
                    case 57: {
                        constraintSet$Constraint0.layout.heightMax = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.heightMax);
                        break;
                    }
                    case 58: {
                        constraintSet$Constraint0.layout.widthMin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.widthMin);
                        break;
                    }
                    case 59: {
                        constraintSet$Constraint0.layout.heightMin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.heightMin);
                        break;
                    }
                    case 60: {
                        constraintSet$Constraint0.transform.rotation = typedArray0.getFloat(v2, constraintSet$Constraint0.transform.rotation);
                        break;
                    }
                    case 61: {
                        constraintSet$Constraint0.layout.circleConstraint = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.circleConstraint);
                        break;
                    }
                    case 62: {
                        constraintSet$Constraint0.layout.circleRadius = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.circleRadius);
                        break;
                    }
                    case 0x3F: {
                        constraintSet$Constraint0.layout.circleAngle = typedArray0.getFloat(v2, constraintSet$Constraint0.layout.circleAngle);
                        break;
                    }
                    case 0x40: {
                        constraintSet$Constraint0.motion.mAnimateRelativeTo = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.motion.mAnimateRelativeTo);
                        break;
                    }
                    case 65: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            constraintSet$Constraint0.motion.mTransitionEasing = typedArray0.getString(v2);
                        }
                        else {
                            String[] arr_s = Easing.NAMED_EASING;
                            constraintSet$Constraint0.motion.mTransitionEasing = arr_s[typedArray0.getInteger(v2, 0)];
                        }
                        break;
                    }
                    case 66: {
                        constraintSet$Constraint0.motion.mDrawPath = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 67: {
                        constraintSet$Constraint0.motion.mPathRotate = typedArray0.getFloat(v2, constraintSet$Constraint0.motion.mPathRotate);
                        break;
                    }
                    case 68: {
                        constraintSet$Constraint0.propertySet.mProgress = typedArray0.getFloat(v2, constraintSet$Constraint0.propertySet.mProgress);
                        break;
                    }
                    case 69: {
                        constraintSet$Constraint0.layout.widthPercent = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 70: {
                        constraintSet$Constraint0.layout.heightPercent = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 72: {
                        constraintSet$Constraint0.layout.mBarrierDirection = typedArray0.getInt(v2, constraintSet$Constraint0.layout.mBarrierDirection);
                        break;
                    }
                    case 73: {
                        constraintSet$Constraint0.layout.mBarrierMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.mBarrierMargin);
                        break;
                    }
                    case 74: {
                        constraintSet$Constraint0.layout.mReferenceIdString = typedArray0.getString(v2);
                        break;
                    }
                    case 75: {
                        constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets = typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets);
                        break;
                    }
                    case 76: {
                        constraintSet$Constraint0.motion.mPathMotionArc = typedArray0.getInt(v2, constraintSet$Constraint0.motion.mPathMotionArc);
                        break;
                    }
                    case 77: {
                        constraintSet$Constraint0.layout.mConstraintTag = typedArray0.getString(v2);
                        break;
                    }
                    case 78: {
                        constraintSet$Constraint0.propertySet.mVisibilityMode = typedArray0.getInt(v2, constraintSet$Constraint0.propertySet.mVisibilityMode);
                        break;
                    }
                    case 0x4F: {
                        constraintSet$Constraint0.motion.mMotionStagger = typedArray0.getFloat(v2, constraintSet$Constraint0.motion.mMotionStagger);
                        break;
                    }
                    case 80: {
                        constraintSet$Constraint0.layout.constrainedWidth = typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.constrainedWidth);
                        break;
                    }
                    case 81: {
                        constraintSet$Constraint0.layout.constrainedHeight = typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.constrainedHeight);
                        break;
                    }
                    case 82: {
                        constraintSet$Constraint0.motion.mAnimateCircleAngleTo = typedArray0.getInteger(v2, constraintSet$Constraint0.motion.mAnimateCircleAngleTo);
                        break;
                    }
                    case 83: {
                        constraintSet$Constraint0.transform.transformPivotTarget = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.transform.transformPivotTarget);
                        break;
                    }
                    case 84: {
                        constraintSet$Constraint0.motion.mQuantizeMotionSteps = typedArray0.getInteger(v2, constraintSet$Constraint0.motion.mQuantizeMotionSteps);
                        break;
                    }
                    case 85: {
                        constraintSet$Constraint0.motion.mQuantizeMotionPhase = typedArray0.getFloat(v2, constraintSet$Constraint0.motion.mQuantizeMotionPhase);
                        break;
                    }
                    case 86: {
                        int v3 = typedArray0.peekValue(v2).type;
                        if(v3 == 1) {
                            constraintSet$Constraint0.motion.mQuantizeInterpolatorID = typedArray0.getResourceId(v2, -1);
                            Motion constraintSet$Motion0 = constraintSet$Constraint0.motion;
                            if(constraintSet$Motion0.mQuantizeInterpolatorID != -1) {
                                constraintSet$Motion0.mQuantizeInterpolatorType = -2;
                            }
                        }
                        else if(v3 == 3) {
                            constraintSet$Constraint0.motion.mQuantizeInterpolatorString = typedArray0.getString(v2);
                            if(constraintSet$Constraint0.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                                constraintSet$Constraint0.motion.mQuantizeInterpolatorID = typedArray0.getResourceId(v2, -1);
                                constraintSet$Constraint0.motion.mQuantizeInterpolatorType = -2;
                            }
                            else {
                                constraintSet$Constraint0.motion.mQuantizeInterpolatorType = -1;
                            }
                        }
                        else {
                            constraintSet$Constraint0.motion.mQuantizeInterpolatorType = typedArray0.getInteger(v2, constraintSet$Constraint0.motion.mQuantizeInterpolatorID);
                        }
                        break;
                    }
                    case 87: {
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                        break;
                    }
                    case 91: {
                        constraintSet$Constraint0.layout.baselineToTop = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.baselineToTop);
                        break;
                    }
                    case 92: {
                        constraintSet$Constraint0.layout.baselineToBottom = ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.layout.baselineToBottom);
                        break;
                    }
                    case 93: {
                        constraintSet$Constraint0.layout.baselineMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.baselineMargin);
                        break;
                    }
                    case 94: {
                        constraintSet$Constraint0.layout.goneBaselineMargin = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneBaselineMargin);
                        break;
                    }
                    case 0x5F: {
                        ConstraintSet.h(constraintSet$Constraint0.layout, typedArray0, v2, 0);
                        break;
                    }
                    case 0x60: {
                        ConstraintSet.h(constraintSet$Constraint0.layout, typedArray0, v2, 1);
                        break;
                    }
                    case 97: {
                        constraintSet$Constraint0.layout.mWrapBehavior = typedArray0.getInt(v2, constraintSet$Constraint0.layout.mWrapBehavior);
                        break;
                    }
                    default: {
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                    }
                }
            }
            Layout constraintSet$Layout0 = constraintSet$Constraint0.layout;
            if(constraintSet$Layout0.mReferenceIdString != null) {
                constraintSet$Layout0.mReferenceIds = null;
            }
        }
        typedArray0.recycle();
        return constraintSet$Constraint0;
    }

    public final Constraint f(int v) {
        HashMap hashMap0 = this.c;
        if(!hashMap0.containsKey(v)) {
            hashMap0.put(v, new Constraint());
        }
        return (Constraint)hashMap0.get(v);
    }

    public static int g(TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getResourceId(v, v1);
        return v2 == -1 ? typedArray0.getInt(v, -1) : v2;
    }

    public boolean getApplyElevation(int v) {
        return this.f(v).transform.applyElevation;
    }

    // 去混淆评级： 低(20)
    public Constraint getConstraint(int v) {
        return this.c.containsKey(v) ? ((Constraint)this.c.get(v)) : null;
    }

    public HashMap getCustomAttributeSet() {
        return this.a;
    }

    public int getHeight(int v) {
        return this.f(v).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] arr_integer = (Integer[])this.c.keySet().toArray(new Integer[0]);
        int[] arr_v = new int[arr_integer.length];
        for(int v = 0; v < arr_integer.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
        return arr_v;
    }

    public Constraint getParameters(int v) {
        return this.f(v);
    }

    public int[] getReferencedIds(int v) {
        int[] arr_v = this.f(v).layout.mReferenceIds;
        return arr_v == null ? new int[0] : Arrays.copyOf(arr_v, arr_v.length);
    }

    public int getVisibility(int v) {
        return this.f(v).propertySet.visibility;
    }

    public int getVisibilityMode(int v) {
        return this.f(v).propertySet.mVisibilityMode;
    }

    public int getWidth(int v) {
        return this.f(v).layout.mWidth;
    }

    public static void h(Object object0, TypedArray typedArray0, int v, int v1) {
        if(object0 == null) {
            return;
        }
        boolean z = true;
        int v2 = 0;
        switch(typedArray0.peekValue(v).type) {
            case 3: {
                String s = typedArray0.getString(v);
                if(s != null) {
                    int v3 = s.indexOf(61);
                    if(v3 > 0 && v3 < s.length() - 1) {
                        String s1 = s.substring(0, v3);
                        String s2 = s.substring(v3 + 1);
                        if(s2.length() > 0) {
                            String s3 = s1.trim();
                            String s4 = s2.trim();
                            if("ratio".equalsIgnoreCase(s3)) {
                                if(object0 instanceof LayoutParams) {
                                    if(v1 == 0) {
                                        ((LayoutParams)object0).width = 0;
                                    }
                                    else {
                                        ((LayoutParams)object0).height = 0;
                                    }
                                    ConstraintSet.i(((LayoutParams)object0), s4);
                                    return;
                                }
                                if(object0 instanceof Layout) {
                                    ((Layout)object0).dimensionRatio = s4;
                                    return;
                                }
                                if(object0 instanceof g) {
                                    ((g)object0).c(5, s4);
                                    return;
                                }
                            }
                            else if("weight".equalsIgnoreCase(s3)) {
                                try {
                                    float f = Float.parseFloat(s4);
                                    if(object0 instanceof LayoutParams) {
                                        if(v1 == 0) {
                                            ((LayoutParams)object0).width = 0;
                                            ((LayoutParams)object0).horizontalWeight = f;
                                            return;
                                        }
                                        ((LayoutParams)object0).height = 0;
                                        ((LayoutParams)object0).verticalWeight = f;
                                        return;
                                    }
                                    if(object0 instanceof Layout) {
                                        if(v1 == 0) {
                                            ((Layout)object0).mWidth = 0;
                                            ((Layout)object0).horizontalWeight = f;
                                            return;
                                        }
                                        ((Layout)object0).mHeight = 0;
                                        ((Layout)object0).verticalWeight = f;
                                        return;
                                    }
                                    if(object0 instanceof g) {
                                        if(v1 == 0) {
                                            ((g)object0).b(23, 0);
                                            ((g)object0).a(39, f);
                                            return;
                                        }
                                        ((g)object0).b(21, 0);
                                        ((g)object0).a(40, f);
                                        return;
                                    }
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                            else if("parent".equalsIgnoreCase(s3)) {
                                try {
                                    float f1 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(s4)));
                                    if(object0 instanceof LayoutParams) {
                                        if(v1 == 0) {
                                            ((LayoutParams)object0).width = 0;
                                            ((LayoutParams)object0).matchConstraintPercentWidth = f1;
                                            ((LayoutParams)object0).matchConstraintDefaultWidth = 2;
                                            return;
                                        }
                                        ((LayoutParams)object0).height = 0;
                                        ((LayoutParams)object0).matchConstraintPercentHeight = f1;
                                        ((LayoutParams)object0).matchConstraintDefaultHeight = 2;
                                        return;
                                    }
                                    if(object0 instanceof Layout) {
                                        if(v1 == 0) {
                                            ((Layout)object0).mWidth = 0;
                                            ((Layout)object0).widthPercent = f1;
                                            ((Layout)object0).widthDefault = 2;
                                            return;
                                        }
                                        ((Layout)object0).mHeight = 0;
                                        ((Layout)object0).heightPercent = f1;
                                        ((Layout)object0).heightDefault = 2;
                                        return;
                                    }
                                    if(object0 instanceof g) {
                                        if(v1 == 0) {
                                            ((g)object0).b(23, 0);
                                            ((g)object0).b(54, 2);
                                            return;
                                        }
                                        ((g)object0).b(21, 0);
                                        ((g)object0).b(55, 2);
                                    }
                                    return;
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                        }
                    }
                }
                return;
            label_85:
                int v4 = typedArray0.getInt(v, 0);
                if(v4 == -4) {
                    v2 = -2;
                }
                else {
                    switch(v4) {
                        case -3: {
                            z = false;
                            break;
                        }
                        case -2: {
                            z = false;
                            v2 = -2;
                            break;
                        }
                        default: {
                            if(v4 == -1) {
                                z = false;
                                v2 = -1;
                            }
                            else {
                                z = false;
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                z = false;
                v2 = typedArray0.getDimensionPixelSize(v, 0);
                break;
            }
            default: {
                goto label_85;
            }
        }
        if(object0 instanceof LayoutParams) {
            if(v1 == 0) {
                ((LayoutParams)object0).width = v2;
                ((LayoutParams)object0).constrainedWidth = z;
                return;
            }
            ((LayoutParams)object0).height = v2;
            ((LayoutParams)object0).constrainedHeight = z;
            return;
        }
        if(object0 instanceof Layout) {
            if(v1 == 0) {
                ((Layout)object0).mWidth = v2;
                ((Layout)object0).constrainedWidth = z;
                return;
            }
            ((Layout)object0).mHeight = v2;
            ((Layout)object0).constrainedHeight = z;
            return;
        }
        if(object0 instanceof g) {
            if(v1 == 0) {
                ((g)object0).b(23, v2);
                ((g)object0).d(80, z);
                return;
            }
            ((g)object0).b(21, v2);
            ((g)object0).d(81, z);
        }
    }

    public static void i(LayoutParams constraintLayout$LayoutParams0, String s) {
        float f = NaNf;
        int v = -1;
        if(s != null) {
            int v1 = s.length();
            int v2 = s.indexOf(44);
            int v3 = 0;
            if(v2 > 0 && v2 < v1 - 1) {
                String s1 = s.substring(0, v2);
                if(s1.equalsIgnoreCase("W")) {
                    v = 0;
                }
                else if(s1.equalsIgnoreCase("H")) {
                    v = 1;
                }
                v3 = v2 + 1;
            }
            int v4 = s.indexOf(58);
            if(v4 < 0 || v4 >= v1 - 1) {
                String s4 = s.substring(v3);
                if(s4.length() > 0) {
                    try {
                        f = Float.parseFloat(s4);
                        constraintLayout$LayoutParams0.dimensionRatio = s;
                        constraintLayout$LayoutParams0.dimensionRatioValue = f;
                        constraintLayout$LayoutParams0.dimensionRatioSide = v;
                        return;
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
            else {
                String s2 = s.substring(v3, v4);
                String s3 = s.substring(v4 + 1);
                if(s2.length() > 0 && s3.length() > 0) {
                    try {
                        float f1 = Float.parseFloat(s2);
                        float f2 = Float.parseFloat(s3);
                        if(f1 > 0.0f && f2 > 0.0f) {
                            f = v == 1 ? Math.abs(f2 / f1) : Math.abs(f1 / f2);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
        }
        constraintLayout$LayoutParams0.dimensionRatio = s;
        constraintLayout$LayoutParams0.dimensionRatioValue = f;
        constraintLayout$LayoutParams0.dimensionRatioSide = v;
    }

    public boolean isForceId() {
        return this.b;
    }

    public static void j(Constraint constraintSet$Constraint0, TypedArray typedArray0) {
        int v = typedArray0.getIndexCount();
        g g0 = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        g0.a = new int[10];
        g0.b = new int[10];
        g0.c = 0;
        g0.d = new int[10];
        g0.e = new float[10];
        g0.f = 0;
        g0.g = new int[5];
        g0.h = new String[5];
        g0.i = 0;
        g0.j = new int[4];
        g0.k = new boolean[4];
        g0.l = 0;
        constraintSet$Constraint0.c = g0;
        constraintSet$Constraint0.motion.mApply = false;
        constraintSet$Constraint0.layout.mApply = false;
        constraintSet$Constraint0.propertySet.mApply = false;
        constraintSet$Constraint0.transform.mApply = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            int v3 = ConstraintSet.f.get(v2);
            SparseIntArray sparseIntArray0 = ConstraintSet.e;
            switch(v3) {
                case 2: {
                    g0.b(2, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.bottomMargin));
                    break;
                }
                case 5: {
                    g0.c(5, typedArray0.getString(v2));
                    break;
                }
                case 6: {
                    g0.b(6, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.editorAbsoluteX));
                    break;
                }
                case 7: {
                    g0.b(7, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.editorAbsoluteY));
                    break;
                }
                case 8: {
                    g0.b(8, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.endMargin));
                    break;
                }
                case 11: {
                    g0.b(11, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneBottomMargin));
                    break;
                }
                case 12: {
                    g0.b(12, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneEndMargin));
                    break;
                }
                case 13: {
                    g0.b(13, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneLeftMargin));
                    break;
                }
                case 14: {
                    g0.b(14, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneRightMargin));
                    break;
                }
                case 15: {
                    g0.b(15, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneStartMargin));
                    break;
                }
                case 16: {
                    g0.b(16, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneTopMargin));
                    break;
                }
                case 17: {
                    g0.b(17, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.guideBegin));
                    break;
                }
                case 18: {
                    g0.b(18, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.layout.guideEnd));
                    break;
                }
                case 19: {
                    g0.a(19, typedArray0.getFloat(v2, constraintSet$Constraint0.layout.guidePercent));
                    break;
                }
                case 20: {
                    g0.a(20, typedArray0.getFloat(v2, constraintSet$Constraint0.layout.horizontalBias));
                    break;
                }
                case 21: {
                    g0.b(21, typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.layout.mHeight));
                    break;
                }
                case 22: {
                    g0.b(22, ConstraintSet.d[typedArray0.getInt(v2, constraintSet$Constraint0.propertySet.visibility)]);
                    break;
                }
                case 23: {
                    g0.b(23, typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.layout.mWidth));
                    break;
                }
                case 24: {
                    g0.b(24, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.leftMargin));
                    break;
                }
                case 27: {
                    g0.b(27, typedArray0.getInt(v2, constraintSet$Constraint0.layout.orientation));
                    break;
                }
                case 28: {
                    g0.b(28, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.rightMargin));
                    break;
                }
                case 0x1F: {
                    g0.b(0x1F, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.startMargin));
                    break;
                }
                case 34: {
                    g0.b(34, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.topMargin));
                    break;
                }
                case 37: {
                    g0.a(37, typedArray0.getFloat(v2, constraintSet$Constraint0.layout.verticalBias));
                    break;
                }
                case 38: {
                    int v4 = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                    constraintSet$Constraint0.a = v4;
                    g0.b(38, v4);
                    break;
                }
                case 39: {
                    g0.a(39, typedArray0.getFloat(v2, constraintSet$Constraint0.layout.horizontalWeight));
                    break;
                }
                case 40: {
                    g0.a(40, typedArray0.getFloat(v2, constraintSet$Constraint0.layout.verticalWeight));
                    break;
                }
                case 41: {
                    g0.b(41, typedArray0.getInt(v2, constraintSet$Constraint0.layout.horizontalChainStyle));
                    break;
                }
                case 42: {
                    g0.b(42, typedArray0.getInt(v2, constraintSet$Constraint0.layout.verticalChainStyle));
                    break;
                }
                case 43: {
                    g0.a(43, typedArray0.getFloat(v2, constraintSet$Constraint0.propertySet.alpha));
                    break;
                }
                case 44: {
                    g0.d(44, true);
                    g0.a(44, typedArray0.getDimension(v2, constraintSet$Constraint0.transform.elevation));
                    break;
                }
                case 45: {
                    g0.a(45, typedArray0.getFloat(v2, constraintSet$Constraint0.transform.rotationX));
                    break;
                }
                case 46: {
                    g0.a(46, typedArray0.getFloat(v2, constraintSet$Constraint0.transform.rotationY));
                    break;
                }
                case 0x2F: {
                    g0.a(0x2F, typedArray0.getFloat(v2, constraintSet$Constraint0.transform.scaleX));
                    break;
                }
                case 0x30: {
                    g0.a(0x30, typedArray0.getFloat(v2, constraintSet$Constraint0.transform.scaleY));
                    break;
                }
                case 49: {
                    g0.a(49, typedArray0.getDimension(v2, constraintSet$Constraint0.transform.transformPivotX));
                    break;
                }
                case 50: {
                    g0.a(50, typedArray0.getDimension(v2, constraintSet$Constraint0.transform.transformPivotY));
                    break;
                }
                case 51: {
                    g0.a(51, typedArray0.getDimension(v2, constraintSet$Constraint0.transform.translationX));
                    break;
                }
                case 52: {
                    g0.a(52, typedArray0.getDimension(v2, constraintSet$Constraint0.transform.translationY));
                    break;
                }
                case 53: {
                    g0.a(53, typedArray0.getDimension(v2, constraintSet$Constraint0.transform.translationZ));
                    break;
                }
                case 54: {
                    g0.b(54, typedArray0.getInt(v2, constraintSet$Constraint0.layout.widthDefault));
                    break;
                }
                case 55: {
                    g0.b(55, typedArray0.getInt(v2, constraintSet$Constraint0.layout.heightDefault));
                    break;
                }
                case 56: {
                    g0.b(56, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.widthMax));
                    break;
                }
                case 57: {
                    g0.b(57, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.heightMax));
                    break;
                }
                case 58: {
                    g0.b(58, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.widthMin));
                    break;
                }
                case 59: {
                    g0.b(59, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.heightMin));
                    break;
                }
                case 60: {
                    g0.a(60, typedArray0.getFloat(v2, constraintSet$Constraint0.transform.rotation));
                    break;
                }
                case 62: {
                    g0.b(62, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.circleRadius));
                    break;
                }
                case 0x3F: {
                    g0.a(0x3F, typedArray0.getFloat(v2, constraintSet$Constraint0.layout.circleAngle));
                    break;
                }
                case 0x40: {
                    g0.b(0x40, ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.motion.mAnimateRelativeTo));
                    break;
                }
                case 65: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        g0.c(65, typedArray0.getString(v2));
                    }
                    else {
                        String[] arr_s = Easing.NAMED_EASING;
                        g0.c(65, arr_s[typedArray0.getInteger(v2, 0)]);
                    }
                    break;
                }
                case 66: {
                    g0.b(66, typedArray0.getInt(v2, 0));
                    break;
                }
                case 67: {
                    g0.a(67, typedArray0.getFloat(v2, constraintSet$Constraint0.motion.mPathRotate));
                    break;
                }
                case 68: {
                    g0.a(68, typedArray0.getFloat(v2, constraintSet$Constraint0.propertySet.mProgress));
                    break;
                }
                case 69: {
                    g0.a(69, typedArray0.getFloat(v2, 1.0f));
                    break;
                }
                case 70: {
                    g0.a(70, typedArray0.getFloat(v2, 1.0f));
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 72: {
                    g0.b(72, typedArray0.getInt(v2, constraintSet$Constraint0.layout.mBarrierDirection));
                    break;
                }
                case 73: {
                    g0.b(73, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.mBarrierMargin));
                    break;
                }
                case 74: {
                    g0.c(74, typedArray0.getString(v2));
                    break;
                }
                case 75: {
                    g0.d(75, typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets));
                    break;
                }
                case 76: {
                    g0.b(76, typedArray0.getInt(v2, constraintSet$Constraint0.motion.mPathMotionArc));
                    break;
                }
                case 77: {
                    g0.c(77, typedArray0.getString(v2));
                    break;
                }
                case 78: {
                    g0.b(78, typedArray0.getInt(v2, constraintSet$Constraint0.propertySet.mVisibilityMode));
                    break;
                }
                case 0x4F: {
                    g0.a(0x4F, typedArray0.getFloat(v2, constraintSet$Constraint0.motion.mMotionStagger));
                    break;
                }
                case 80: {
                    g0.d(80, typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.constrainedWidth));
                    break;
                }
                case 81: {
                    g0.d(81, typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.constrainedHeight));
                    break;
                }
                case 82: {
                    g0.b(82, typedArray0.getInteger(v2, constraintSet$Constraint0.motion.mAnimateCircleAngleTo));
                    break;
                }
                case 83: {
                    g0.b(83, ConstraintSet.g(typedArray0, v2, constraintSet$Constraint0.transform.transformPivotTarget));
                    break;
                }
                case 84: {
                    g0.b(84, typedArray0.getInteger(v2, constraintSet$Constraint0.motion.mQuantizeMotionSteps));
                    break;
                }
                case 85: {
                    g0.a(85, typedArray0.getFloat(v2, constraintSet$Constraint0.motion.mQuantizeMotionPhase));
                    break;
                }
                case 86: {
                    int v5 = typedArray0.peekValue(v2).type;
                    if(v5 == 1) {
                        constraintSet$Constraint0.motion.mQuantizeInterpolatorID = typedArray0.getResourceId(v2, -1);
                        g0.b(89, constraintSet$Constraint0.motion.mQuantizeInterpolatorID);
                        Motion constraintSet$Motion0 = constraintSet$Constraint0.motion;
                        if(constraintSet$Motion0.mQuantizeInterpolatorID != -1) {
                            constraintSet$Motion0.mQuantizeInterpolatorType = -2;
                            g0.b(88, -2);
                        }
                    }
                    else if(v5 == 3) {
                        constraintSet$Constraint0.motion.mQuantizeInterpolatorString = typedArray0.getString(v2);
                        g0.c(90, constraintSet$Constraint0.motion.mQuantizeInterpolatorString);
                        if(constraintSet$Constraint0.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                            constraintSet$Constraint0.motion.mQuantizeInterpolatorID = typedArray0.getResourceId(v2, -1);
                            g0.b(89, constraintSet$Constraint0.motion.mQuantizeInterpolatorID);
                            constraintSet$Constraint0.motion.mQuantizeInterpolatorType = -2;
                            g0.b(88, -2);
                        }
                        else {
                            constraintSet$Constraint0.motion.mQuantizeInterpolatorType = -1;
                            g0.b(88, -1);
                        }
                    }
                    else {
                        constraintSet$Constraint0.motion.mQuantizeInterpolatorType = typedArray0.getInteger(v2, constraintSet$Constraint0.motion.mQuantizeInterpolatorID);
                        g0.b(88, constraintSet$Constraint0.motion.mQuantizeInterpolatorType);
                    }
                    break;
                }
                case 87: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                    break;
                }
                case 93: {
                    g0.b(93, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.baselineMargin));
                    break;
                }
                case 94: {
                    g0.b(94, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.layout.goneBaselineMargin));
                    break;
                }
                case 0x5F: {
                    ConstraintSet.h(g0, typedArray0, v2, 0);
                    break;
                }
                case 0x60: {
                    ConstraintSet.h(g0, typedArray0, v2, 1);
                    break;
                }
                case 97: {
                    g0.b(97, typedArray0.getInt(v2, constraintSet$Constraint0.layout.mWrapBehavior));
                    break;
                }
                case 98: {
                    if(MotionLayout.IS_IN_EDIT_MODE) {
                        int v6 = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                        constraintSet$Constraint0.a = v6;
                        if(v6 == -1) {
                            constraintSet$Constraint0.b = typedArray0.getString(v2);
                        }
                    }
                    else if(typedArray0.peekValue(v2).type == 3) {
                        constraintSet$Constraint0.b = typedArray0.getString(v2);
                    }
                    else {
                        constraintSet$Constraint0.a = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                    }
                    break;
                }
                case 99: {
                    g0.d(99, typedArray0.getBoolean(v2, constraintSet$Constraint0.layout.guidelineUseRtl));
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
    }

    public static String k(int v) {
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

    public void load(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            while(true) {
                switch(v1) {
                    case 0: {
                        xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    default: {
                        if(v1 == 2) {
                            String s = xmlResourceParser0.getName();
                            Constraint constraintSet$Constraint0 = ConstraintSet.e(context0, Xml.asAttributeSet(xmlResourceParser0), false);
                            if(s.equalsIgnoreCase("Guideline")) {
                                constraintSet$Constraint0.layout.mIsGuideline = true;
                            }
                            this.c.put(constraintSet$Constraint0.a, constraintSet$Constraint0);
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_18;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_18;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_18:
        iOException0.printStackTrace();
    }

    public void load(Context context0, XmlPullParser xmlPullParser0) {
        try {
            int v = xmlPullParser0.getEventType();
            Constraint constraintSet$Constraint0 = null;
            while(true) {
                switch(v) {
                    case 0: {
                        xmlPullParser0.getName();
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlPullParser0.getName()) {
                            case "Barrier": {
                                constraintSet$Constraint0 = ConstraintSet.e(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                constraintSet$Constraint0.layout.mHelperType = 1;
                                break;
                            }
                            case "Constraint": {
                                constraintSet$Constraint0 = ConstraintSet.e(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                break;
                            }
                            case "ConstraintOverride": {
                                constraintSet$Constraint0 = ConstraintSet.e(context0, Xml.asAttributeSet(xmlPullParser0), true);
                                break;
                            }
                            case "CustomAttribute": {
                            label_38:
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                ConstraintAttribute.parse(context0, xmlPullParser0, constraintSet$Constraint0.mCustomConstraints);
                                break;
                            }
                            case "CustomMethod": {
                                goto label_38;
                            }
                            case "Guideline": {
                                constraintSet$Constraint0 = ConstraintSet.e(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                constraintSet$Constraint0.layout.mIsGuideline = true;
                                constraintSet$Constraint0.layout.mApply = true;
                                break;
                            }
                            case "Layout": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.layout.a(context0, attributeSet0);
                                break;
                            }
                            case "Motion": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet1 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.motion.a(context0, attributeSet1);
                                break;
                            }
                            case "PropertySet": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet2 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.propertySet.a(context0, attributeSet2);
                                break;
                            }
                            case "Transform": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet3 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.transform.a(context0, attributeSet3);
                            }
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 3: {
                        switch(xmlPullParser0.getName().toLowerCase(Locale.ROOT)) {
                            case "constraint": 
                            case "constraintoverride": 
                            case "guideline": {
                                this.c.put(constraintSet$Constraint0.a, constraintSet$Constraint0);
                                constraintSet$Constraint0 = null;
                                break;
                            }
                            case "constraintset": {
                                return;
                            }
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    default: {
                        v = xmlPullParser0.next();
                        break;
                    }
                }
            }
            goto label_57;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_57;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_57:
        iOException0.printStackTrace();
    }

    public void parseColorAttributes(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length == 2) {
                String s1 = arr_s1[0];
                int v1 = Color.parseColor(arr_s1[1]);
                constraintSet$Constraint0.c(s1, AttributeType.COLOR_TYPE).setColorValue(v1);
            }
            else {
                Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            }
        }
    }

    public void parseFloatAttributes(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length == 2) {
                String s1 = arr_s1[0];
                float f = Float.parseFloat(arr_s1[1]);
                constraintSet$Constraint0.c(s1, AttributeType.FLOAT_TYPE).setFloatValue(f);
            }
            else {
                Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            }
        }
    }

    public void parseIntAttributes(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length == 2) {
                String s1 = arr_s1[0];
                Integer integer0 = Integer.decode(arr_s1[1]);
                constraintSet$Constraint0.c(s1, AttributeType.FLOAT_TYPE).setFloatValue(((float)(((int)integer0))));
            }
            else {
                Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            }
        }
    }

    public void parseStringAttributes(Constraint constraintSet$Constraint0, String s) {
        char[] arr_c = s.toCharArray();
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        int v2 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            int v3 = arr_c[v];
            if(v3 == 44 && v2 == 0) {
                arrayList0.add(new String(arr_c, v1, v - v1));
                v1 = v + 1;
            }
            else if(v3 == 34) {
                v2 ^= 1;
            }
        }
        arrayList0.add(new String(arr_c, v1, arr_c.length - v1));
        String[] arr_s = (String[])arrayList0.toArray(new String[arrayList0.size()]);
        for(int v4 = 0; v4 < arr_s.length; ++v4) {
            String[] arr_s1 = arr_s[v4].split("=");
            Log.w("ConstraintSet", " Unable to parse " + arr_s[v4]);
            String s1 = arr_s1[0];
            String s2 = arr_s1[1];
            constraintSet$Constraint0.c(s1, AttributeType.STRING_TYPE).setStringValue(s2);
        }
    }

    public void readFallback(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.b && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap hashMap0 = this.c;
            if(!hashMap0.containsKey(v2)) {
                hashMap0.put(v2, new Constraint());
            }
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v2);
            if(constraintSet$Constraint0 != null) {
                if(!constraintSet$Constraint0.layout.mApply) {
                    constraintSet$Constraint0.a(v2, constraintLayout$LayoutParams0);
                    if(view0 instanceof ConstraintHelper) {
                        constraintSet$Constraint0.layout.mReferenceIds = ((ConstraintHelper)view0).getReferencedIds();
                        if(view0 instanceof Barrier) {
                            constraintSet$Constraint0.layout.mBarrierAllowsGoneWidgets = ((Barrier)view0).getAllowsGoneWidget();
                            constraintSet$Constraint0.layout.mBarrierDirection = ((Barrier)view0).getType();
                            constraintSet$Constraint0.layout.mBarrierMargin = ((Barrier)view0).getMargin();
                        }
                    }
                    constraintSet$Constraint0.layout.mApply = true;
                }
                PropertySet constraintSet$PropertySet0 = constraintSet$Constraint0.propertySet;
                if(!constraintSet$PropertySet0.mApply) {
                    constraintSet$PropertySet0.visibility = view0.getVisibility();
                    constraintSet$Constraint0.propertySet.alpha = view0.getAlpha();
                    constraintSet$Constraint0.propertySet.mApply = true;
                }
                Transform constraintSet$Transform0 = constraintSet$Constraint0.transform;
                if(!constraintSet$Transform0.mApply) {
                    constraintSet$Transform0.mApply = true;
                    constraintSet$Transform0.rotation = view0.getRotation();
                    constraintSet$Constraint0.transform.rotationX = view0.getRotationX();
                    constraintSet$Constraint0.transform.rotationY = view0.getRotationY();
                    constraintSet$Constraint0.transform.scaleX = view0.getScaleX();
                    constraintSet$Constraint0.transform.scaleY = view0.getScaleY();
                    float f = view0.getPivotX();
                    float f1 = view0.getPivotY();
                    if(((double)f) != 0.0 || ((double)f1) != 0.0) {
                        constraintSet$Constraint0.transform.transformPivotX = f;
                        constraintSet$Constraint0.transform.transformPivotY = f1;
                    }
                    constraintSet$Constraint0.transform.translationX = view0.getTranslationX();
                    constraintSet$Constraint0.transform.translationY = view0.getTranslationY();
                    constraintSet$Constraint0.transform.translationZ = view0.getTranslationZ();
                    Transform constraintSet$Transform1 = constraintSet$Constraint0.transform;
                    if(constraintSet$Transform1.applyElevation) {
                        constraintSet$Transform1.elevation = view0.getElevation();
                    }
                }
            }
        }
    }

    public void readFallback(ConstraintSet constraintSet0) {
        for(Object object0: constraintSet0.c.keySet()) {
            Integer integer0 = (Integer)object0;
            integer0.intValue();
            Constraint constraintSet$Constraint0 = (Constraint)constraintSet0.c.get(integer0);
            HashMap hashMap0 = this.c;
            if(!hashMap0.containsKey(integer0)) {
                hashMap0.put(integer0, new Constraint());
            }
            Constraint constraintSet$Constraint1 = (Constraint)hashMap0.get(integer0);
            if(constraintSet$Constraint1 != null) {
                Layout constraintSet$Layout0 = constraintSet$Constraint1.layout;
                if(!constraintSet$Layout0.mApply) {
                    constraintSet$Layout0.copyFrom(constraintSet$Constraint0.layout);
                }
                PropertySet constraintSet$PropertySet0 = constraintSet$Constraint1.propertySet;
                if(!constraintSet$PropertySet0.mApply) {
                    constraintSet$PropertySet0.copyFrom(constraintSet$Constraint0.propertySet);
                }
                Transform constraintSet$Transform0 = constraintSet$Constraint1.transform;
                if(!constraintSet$Transform0.mApply) {
                    constraintSet$Transform0.copyFrom(constraintSet$Constraint0.transform);
                }
                Motion constraintSet$Motion0 = constraintSet$Constraint1.motion;
                if(!constraintSet$Motion0.mApply) {
                    constraintSet$Motion0.copyFrom(constraintSet$Constraint0.motion);
                }
                for(Object object1: constraintSet$Constraint0.mCustomConstraints.keySet()) {
                    String s = (String)object1;
                    if(!constraintSet$Constraint1.mCustomConstraints.containsKey(s)) {
                        constraintSet$Constraint1.mCustomConstraints.put(s, ((ConstraintAttribute)constraintSet$Constraint0.mCustomConstraints.get(s)));
                    }
                }
            }
        }
    }

    public void removeAttribute(String s) {
        this.a.remove(s);
    }

    public void removeFromHorizontalChain(int v) {
        HashMap hashMap0 = this.c;
        if(hashMap0.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
            if(constraintSet$Constraint0 == null) {
                return;
            }
            Layout constraintSet$Layout0 = constraintSet$Constraint0.layout;
            int v1 = constraintSet$Layout0.leftToRight;
            int v2 = constraintSet$Layout0.rightToLeft;
            if(v1 == -1 && v2 == -1) {
                int v3 = constraintSet$Layout0.startToEnd;
                int v4 = constraintSet$Layout0.endToStart;
                if(v3 != -1 || v4 != -1) {
                    if(v3 != -1 && v4 != -1) {
                        this.connect(v3, 7, v4, 6, 0);
                        this.connect(v4, 6, -1, 7, 0);
                    }
                    else if(v4 != -1) {
                        int v5 = constraintSet$Layout0.rightToRight;
                        if(v5 == -1) {
                            int v6 = constraintSet$Layout0.leftToLeft;
                            if(v6 != -1) {
                                this.connect(v4, 6, v6, 6, 0);
                            }
                        }
                        else {
                            this.connect(-1, 7, v5, 7, 0);
                        }
                    }
                }
                this.clear(v, 6);
                this.clear(v, 7);
                return;
            }
            if(v1 == -1 || v2 == -1) {
                int v7 = constraintSet$Layout0.rightToRight;
                if(v7 == -1) {
                    int v8 = constraintSet$Layout0.leftToLeft;
                    if(v8 != -1) {
                        this.connect(v2, 1, v8, 1, 0);
                    }
                }
                else {
                    this.connect(v1, 2, v7, 2, 0);
                }
            }
            else {
                this.connect(v1, 2, v2, 1, 0);
                this.connect(v2, 1, v1, 2, 0);
            }
            this.clear(v, 1);
            this.clear(v, 2);
        }
    }

    public void removeFromVerticalChain(int v) {
        HashMap hashMap0 = this.c;
        if(hashMap0.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(v);
            if(constraintSet$Constraint0 == null) {
                return;
            }
            Layout constraintSet$Layout0 = constraintSet$Constraint0.layout;
            int v1 = constraintSet$Layout0.topToBottom;
            int v2 = constraintSet$Layout0.bottomToTop;
            if(v1 != -1 || v2 != -1) {
                if(v1 == -1 || v2 == -1) {
                    int v3 = constraintSet$Layout0.bottomToBottom;
                    if(v3 == -1) {
                        int v4 = constraintSet$Layout0.topToTop;
                        if(v4 != -1) {
                            this.connect(v2, 3, v4, 3, 0);
                        }
                    }
                    else {
                        this.connect(v1, 4, v3, 4, 0);
                    }
                }
                else {
                    this.connect(v1, 4, v2, 3, 0);
                    this.connect(v2, 3, v1, 4, 0);
                }
            }
        }
        this.clear(v, 3);
        this.clear(v, 4);
    }

    public void setAlpha(int v, float f) {
        this.f(v).propertySet.alpha = f;
    }

    public void setApplyElevation(int v, boolean z) {
        this.f(v).transform.applyElevation = z;
    }

    public void setBarrierType(int v, int v1) {
        this.f(v).layout.mHelperType = v1;
    }

    public void setColorValue(int v, String s, int v1) {
        this.f(v).c(s, AttributeType.COLOR_TYPE).setColorValue(v1);
    }

    public void setDimensionRatio(int v, String s) {
        this.f(v).layout.dimensionRatio = s;
    }

    public void setEditorAbsoluteX(int v, int v1) {
        this.f(v).layout.editorAbsoluteX = v1;
    }

    public void setEditorAbsoluteY(int v, int v1) {
        this.f(v).layout.editorAbsoluteY = v1;
    }

    public void setElevation(int v, float f) {
        this.f(v).transform.elevation = f;
        this.f(v).transform.applyElevation = true;
    }

    public void setFloatValue(int v, String s, float f) {
        this.f(v).c(s, AttributeType.FLOAT_TYPE).setFloatValue(f);
    }

    public void setForceId(boolean z) {
        this.b = z;
    }

    public void setGoneMargin(int v, int v1, int v2) {
        Constraint constraintSet$Constraint0 = this.f(v);
        switch(v1) {
            case 1: {
                constraintSet$Constraint0.layout.goneLeftMargin = v2;
                return;
            }
            case 2: {
                constraintSet$Constraint0.layout.goneRightMargin = v2;
                return;
            }
            case 3: {
                constraintSet$Constraint0.layout.goneTopMargin = v2;
                return;
            }
            case 4: {
                constraintSet$Constraint0.layout.goneBottomMargin = v2;
                return;
            }
            case 5: {
                constraintSet$Constraint0.layout.goneBaselineMargin = v2;
                return;
            }
            case 6: {
                constraintSet$Constraint0.layout.goneStartMargin = v2;
                return;
            }
            case 7: {
                constraintSet$Constraint0.layout.goneEndMargin = v2;
                return;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void setGuidelineBegin(int v, int v1) {
        this.f(v).layout.guideBegin = v1;
        this.f(v).layout.guideEnd = -1;
        this.f(v).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int v, int v1) {
        this.f(v).layout.guideEnd = v1;
        this.f(v).layout.guideBegin = -1;
        this.f(v).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int v, float f) {
        this.f(v).layout.guidePercent = f;
        this.f(v).layout.guideEnd = -1;
        this.f(v).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int v, float f) {
        this.f(v).layout.horizontalBias = f;
    }

    public void setHorizontalChainStyle(int v, int v1) {
        this.f(v).layout.horizontalChainStyle = v1;
    }

    public void setHorizontalWeight(int v, float f) {
        this.f(v).layout.horizontalWeight = f;
    }

    public void setIntValue(int v, String s, int v1) {
        this.f(v).c(s, AttributeType.INT_TYPE).setIntValue(v1);
    }

    public void setLayoutWrapBehavior(int v, int v1) {
        if(v1 >= 0 && v1 <= 3) {
            this.f(v).layout.mWrapBehavior = v1;
        }
    }

    public void setMargin(int v, int v1, int v2) {
        Constraint constraintSet$Constraint0 = this.f(v);
        switch(v1) {
            case 1: {
                constraintSet$Constraint0.layout.leftMargin = v2;
                return;
            }
            case 2: {
                constraintSet$Constraint0.layout.rightMargin = v2;
                return;
            }
            case 3: {
                constraintSet$Constraint0.layout.topMargin = v2;
                return;
            }
            case 4: {
                constraintSet$Constraint0.layout.bottomMargin = v2;
                return;
            }
            case 5: {
                constraintSet$Constraint0.layout.baselineMargin = v2;
                return;
            }
            case 6: {
                constraintSet$Constraint0.layout.startMargin = v2;
                return;
            }
            case 7: {
                constraintSet$Constraint0.layout.endMargin = v2;
                return;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void setReferencedIds(int v, int[] arr_v) {
        this.f(v).layout.mReferenceIds = arr_v;
    }

    public void setRotation(int v, float f) {
        this.f(v).transform.rotation = f;
    }

    public void setRotationX(int v, float f) {
        this.f(v).transform.rotationX = f;
    }

    public void setRotationY(int v, float f) {
        this.f(v).transform.rotationY = f;
    }

    public void setScaleX(int v, float f) {
        this.f(v).transform.scaleX = f;
    }

    public void setScaleY(int v, float f) {
        this.f(v).transform.scaleY = f;
    }

    public void setStringValue(int v, String s, String s1) {
        this.f(v).c(s, AttributeType.STRING_TYPE).setStringValue(s1);
    }

    public void setTransformPivot(int v, float f, float f1) {
        Constraint constraintSet$Constraint0 = this.f(v);
        constraintSet$Constraint0.transform.transformPivotY = f1;
        constraintSet$Constraint0.transform.transformPivotX = f;
    }

    public void setTransformPivotX(int v, float f) {
        this.f(v).transform.transformPivotX = f;
    }

    public void setTransformPivotY(int v, float f) {
        this.f(v).transform.transformPivotY = f;
    }

    public void setTranslation(int v, float f, float f1) {
        Constraint constraintSet$Constraint0 = this.f(v);
        constraintSet$Constraint0.transform.translationX = f;
        constraintSet$Constraint0.transform.translationY = f1;
    }

    public void setTranslationX(int v, float f) {
        this.f(v).transform.translationX = f;
    }

    public void setTranslationY(int v, float f) {
        this.f(v).transform.translationY = f;
    }

    public void setTranslationZ(int v, float f) {
        this.f(v).transform.translationZ = f;
    }

    public void setValidateOnParse(boolean z) {
    }

    public void setVerticalBias(int v, float f) {
        this.f(v).layout.verticalBias = f;
    }

    public void setVerticalChainStyle(int v, int v1) {
        this.f(v).layout.verticalChainStyle = v1;
    }

    public void setVerticalWeight(int v, float f) {
        this.f(v).layout.verticalWeight = f;
    }

    public void setVisibility(int v, int v1) {
        this.f(v).propertySet.visibility = v1;
    }

    public void setVisibilityMode(int v, int v1) {
        this.f(v).propertySet.mVisibilityMode = v1;
    }

    public void writeState(Writer writer0, ConstraintLayout constraintLayout0, int v) throws IOException {
        writer0.write("\n---------------------------------------------\n");
        HashMap hashMap0 = this.c;
        if((v & 1) == 1) {
            i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
            i0.c = 0;
            i0.d = new HashMap();
            i0.a = writer0;
            i0.b = constraintLayout0.getContext();
            Writer writer1 = i0.a;
            writer1.write("\n<ConstraintSet>\n");
            for(Object object0: hashMap0.keySet()) {
                Constraint constraintSet$Constraint0 = (Constraint)hashMap0.get(((Integer)object0));
                String s = i0.a(((int)(((Integer)object0))));
                writer1.write("  <Constraint");
                writer1.write("\n       android:id=\"" + s + "\"");
                Layout constraintSet$Layout0 = constraintSet$Constraint0.layout;
                i0.b(constraintSet$Layout0.mWidth, "android:layout_width");
                i0.b(constraintSet$Layout0.mHeight, "android:layout_height");
                i0.g("app:layout_constraintGuide_begin", ((float)constraintSet$Layout0.guideBegin), -1.0f);
                i0.g("app:layout_constraintGuide_end", ((float)constraintSet$Layout0.guideEnd), -1.0f);
                i0.g("app:layout_constraintGuide_percent", constraintSet$Layout0.guidePercent, -1.0f);
                i0.g("app:layout_constraintHorizontal_bias", constraintSet$Layout0.horizontalBias, 0.5f);
                i0.g("app:layout_constraintVertical_bias", constraintSet$Layout0.verticalBias, 0.5f);
                i0.h("app:layout_constraintDimensionRatio", constraintSet$Layout0.dimensionRatio);
                i0.i(constraintSet$Layout0.circleConstraint, "app:layout_constraintCircle");
                i0.g("app:layout_constraintCircleRadius", ((float)constraintSet$Layout0.circleRadius), 0.0f);
                i0.g("app:layout_constraintCircleAngle", constraintSet$Layout0.circleAngle, 0.0f);
                i0.g("android:orientation", ((float)constraintSet$Layout0.orientation), -1.0f);
                i0.g("app:layout_constraintVertical_weight", constraintSet$Layout0.verticalWeight, -1.0f);
                i0.g("app:layout_constraintHorizontal_weight", constraintSet$Layout0.horizontalWeight, -1.0f);
                i0.g("app:layout_constraintHorizontal_chainStyle", ((float)constraintSet$Layout0.horizontalChainStyle), 0.0f);
                i0.g("app:layout_constraintVertical_chainStyle", ((float)constraintSet$Layout0.verticalChainStyle), 0.0f);
                i0.g("app:barrierDirection", ((float)constraintSet$Layout0.mBarrierDirection), -1.0f);
                i0.g("app:barrierMargin", ((float)constraintSet$Layout0.mBarrierMargin), 0.0f);
                i0.d(constraintSet$Layout0.leftMargin, 0, "app:layout_marginLeft");
                i0.d(constraintSet$Layout0.goneLeftMargin, 0x80000000, "app:layout_goneMarginLeft");
                i0.d(constraintSet$Layout0.rightMargin, 0, "app:layout_marginRight");
                i0.d(constraintSet$Layout0.goneRightMargin, 0x80000000, "app:layout_goneMarginRight");
                i0.d(constraintSet$Layout0.startMargin, 0, "app:layout_marginStart");
                i0.d(constraintSet$Layout0.goneStartMargin, 0x80000000, "app:layout_goneMarginStart");
                i0.d(constraintSet$Layout0.endMargin, 0, "app:layout_marginEnd");
                i0.d(constraintSet$Layout0.goneEndMargin, 0x80000000, "app:layout_goneMarginEnd");
                i0.d(constraintSet$Layout0.topMargin, 0, "app:layout_marginTop");
                i0.d(constraintSet$Layout0.goneTopMargin, 0x80000000, "app:layout_goneMarginTop");
                i0.d(constraintSet$Layout0.bottomMargin, 0, "app:layout_marginBottom");
                i0.d(constraintSet$Layout0.goneBottomMargin, 0x80000000, "app:layout_goneMarginBottom");
                i0.d(constraintSet$Layout0.goneBaselineMargin, 0x80000000, "app:goneBaselineMargin");
                i0.d(constraintSet$Layout0.baselineMargin, 0, "app:baselineMargin");
                i0.c("app:layout_constrainedWidth", constraintSet$Layout0.constrainedWidth, false);
                i0.c("app:layout_constrainedHeight", constraintSet$Layout0.constrainedHeight, false);
                i0.c("app:barrierAllowsGoneWidgets", constraintSet$Layout0.mBarrierAllowsGoneWidgets, true);
                i0.g("app:layout_wrapBehaviorInParent", ((float)constraintSet$Layout0.mWrapBehavior), 0.0f);
                i0.i(constraintSet$Layout0.baselineToBaseline, "app:baselineToBaseline");
                i0.i(constraintSet$Layout0.baselineToBottom, "app:baselineToBottom");
                i0.i(constraintSet$Layout0.baselineToTop, "app:baselineToTop");
                i0.i(constraintSet$Layout0.bottomToBottom, "app:layout_constraintBottom_toBottomOf");
                i0.i(constraintSet$Layout0.bottomToTop, "app:layout_constraintBottom_toTopOf");
                i0.i(constraintSet$Layout0.endToEnd, "app:layout_constraintEnd_toEndOf");
                i0.i(constraintSet$Layout0.endToStart, "app:layout_constraintEnd_toStartOf");
                i0.i(constraintSet$Layout0.leftToLeft, "app:layout_constraintLeft_toLeftOf");
                i0.i(constraintSet$Layout0.leftToRight, "app:layout_constraintLeft_toRightOf");
                i0.i(constraintSet$Layout0.rightToLeft, "app:layout_constraintRight_toLeftOf");
                i0.i(constraintSet$Layout0.rightToRight, "app:layout_constraintRight_toRightOf");
                i0.i(constraintSet$Layout0.startToEnd, "app:layout_constraintStart_toEndOf");
                i0.i(constraintSet$Layout0.startToStart, "app:layout_constraintStart_toStartOf");
                i0.i(constraintSet$Layout0.topToBottom, "app:layout_constraintTop_toBottomOf");
                i0.i(constraintSet$Layout0.topToTop, "app:layout_constraintTop_toTopOf");
                String[] arr_s = {"spread", "wrap", "percent"};
                i0.e("app:layout_constraintHeight_default", constraintSet$Layout0.heightDefault, arr_s, 0);
                i0.g("app:layout_constraintHeight_percent", constraintSet$Layout0.heightPercent, 1.0f);
                i0.d(constraintSet$Layout0.heightMin, 0, "app:layout_constraintHeight_min");
                i0.d(constraintSet$Layout0.heightMax, 0, "app:layout_constraintHeight_max");
                i0.c("android:layout_constrainedHeight", constraintSet$Layout0.constrainedHeight, false);
                i0.e("app:layout_constraintWidth_default", constraintSet$Layout0.widthDefault, arr_s, 0);
                i0.g("app:layout_constraintWidth_percent", constraintSet$Layout0.widthPercent, 1.0f);
                i0.d(constraintSet$Layout0.widthMin, 0, "app:layout_constraintWidth_min");
                i0.d(constraintSet$Layout0.widthMax, 0, "app:layout_constraintWidth_max");
                i0.c("android:layout_constrainedWidth", constraintSet$Layout0.constrainedWidth, false);
                i0.g("app:layout_constraintVertical_weight", constraintSet$Layout0.verticalWeight, -1.0f);
                i0.g("app:layout_constraintHorizontal_weight", constraintSet$Layout0.horizontalWeight, -1.0f);
                i0.f(constraintSet$Layout0.horizontalChainStyle, "app:layout_constraintHorizontal_chainStyle");
                i0.f(constraintSet$Layout0.verticalChainStyle, "app:layout_constraintVertical_chainStyle");
                i0.e("app:barrierDirection", constraintSet$Layout0.mBarrierDirection, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                i0.h("app:layout_constraintTag", constraintSet$Layout0.mConstraintTag);
                int[] arr_v = constraintSet$Layout0.mReferenceIds;
                if(arr_v != null) {
                    writer1.write("\n       \'ReferenceIds\'");
                    writer1.write(":");
                    for(int v1 = 0; v1 < arr_v.length; ++v1) {
                        writer1.write((v1 == 0 ? "[" : ", ") + i0.a(arr_v[v1]));
                    }
                    writer1.write("],\n");
                }
                writer1.write(" />\n");
            }
            writer1.write("</ConstraintSet>\n");
        }
        else {
            h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
            h0.c = 0;
            h0.d = new HashMap();
            h0.a = writer0;
            h0.b = constraintLayout0.getContext();
            Writer writer2 = h0.a;
            writer2.write("\n\'ConstraintSet\':{\n");
            for(Object object1: hashMap0.keySet()) {
                Constraint constraintSet$Constraint1 = (Constraint)hashMap0.get(((Integer)object1));
                writer2.write(h0.a(((int)(((Integer)object1)))) + ":{\n");
                Layout constraintSet$Layout1 = constraintSet$Constraint1.layout;
                h0.c("height", constraintSet$Layout1.mHeight, constraintSet$Layout1.heightDefault, constraintSet$Layout1.heightPercent, constraintSet$Layout1.heightMin, constraintSet$Layout1.heightMax);
                h0.c("width", constraintSet$Layout1.mWidth, constraintSet$Layout1.widthDefault, constraintSet$Layout1.widthPercent, constraintSet$Layout1.widthMin, constraintSet$Layout1.widthMax);
                h0.b(constraintSet$Layout1.leftToLeft, constraintSet$Layout1.leftMargin, "\'left\'", "\'left\'");
                h0.b(constraintSet$Layout1.leftToRight, constraintSet$Layout1.leftMargin, "\'left\'", "\'right\'");
                h0.b(constraintSet$Layout1.rightToLeft, constraintSet$Layout1.rightMargin, "\'right\'", "\'left\'");
                h0.b(constraintSet$Layout1.rightToRight, constraintSet$Layout1.rightMargin, "\'right\'", "\'right\'");
                h0.b(constraintSet$Layout1.baselineToBaseline, -1, "\'baseline\'", "\'baseline\'");
                h0.b(constraintSet$Layout1.baselineToTop, -1, "\'baseline\'", "\'top\'");
                h0.b(constraintSet$Layout1.baselineToBottom, -1, "\'baseline\'", "\'bottom\'");
                h0.b(constraintSet$Layout1.topToBottom, constraintSet$Layout1.topMargin, "\'top\'", "\'bottom\'");
                h0.b(constraintSet$Layout1.topToTop, constraintSet$Layout1.topMargin, "\'top\'", "\'top\'");
                h0.b(constraintSet$Layout1.bottomToBottom, constraintSet$Layout1.bottomMargin, "\'bottom\'", "\'bottom\'");
                h0.b(constraintSet$Layout1.bottomToTop, constraintSet$Layout1.bottomMargin, "\'bottom\'", "\'top\'");
                h0.b(constraintSet$Layout1.startToStart, constraintSet$Layout1.startMargin, "\'start\'", "\'start\'");
                h0.b(constraintSet$Layout1.startToEnd, constraintSet$Layout1.startMargin, "\'start\'", "\'end\'");
                h0.b(constraintSet$Layout1.endToStart, constraintSet$Layout1.endMargin, "\'end\'", "\'start\'");
                h0.b(constraintSet$Layout1.endToEnd, constraintSet$Layout1.endMargin, "\'end\'", "\'end\'");
                h0.g("\'horizontalBias\'", constraintSet$Layout1.horizontalBias);
                h0.g("\'verticalBias\'", constraintSet$Layout1.verticalBias);
                int v2 = constraintSet$Layout1.circleConstraint;
                float f = constraintSet$Layout1.circleAngle;
                int v3 = constraintSet$Layout1.circleRadius;
                if(v2 != -1) {
                    writer2.write("       circle");
                    writer2.write(":[");
                    writer2.write(h0.a(v2));
                    writer2.write(", " + f);
                    writer2.write(v3 + "]");
                }
                h0.f("\'dimensionRatio\'", constraintSet$Layout1.dimensionRatio);
                h0.d(constraintSet$Layout1.mBarrierMargin, "\'barrierMargin\'");
                h0.d(constraintSet$Layout1.mHelperType, "\'type\'");
                h0.f("\'ReferenceId\'", constraintSet$Layout1.mReferenceIdString);
                if(!constraintSet$Layout1.mBarrierAllowsGoneWidgets) {
                    writer2.write("       \'mBarrierAllowsGoneWidgets\'");
                    writer2.write(": " + false);
                    writer2.write(",\n");
                }
                h0.d(constraintSet$Layout1.mWrapBehavior, "\'WrapBehavior\'");
                h0.e("\'verticalWeight\'", constraintSet$Layout1.verticalWeight);
                h0.e("\'horizontalWeight\'", constraintSet$Layout1.horizontalWeight);
                h0.d(constraintSet$Layout1.horizontalChainStyle, "\'horizontalChainStyle\'");
                h0.d(constraintSet$Layout1.verticalChainStyle, "\'verticalChainStyle\'");
                h0.d(constraintSet$Layout1.mBarrierDirection, "\'barrierDirection\'");
                int[] arr_v1 = constraintSet$Layout1.mReferenceIds;
                if(arr_v1 != null) {
                    writer2.write("       \'ReferenceIds\'");
                    writer2.write(": ");
                    for(int v4 = 0; v4 < arr_v1.length; ++v4) {
                        writer2.write((v4 == 0 ? "[" : ", ") + h0.a(arr_v1[v4]));
                    }
                    writer2.write("],\n");
                }
                writer2.write("}\n");
            }
            writer2.write("}\n");
        }
        writer0.write("\n---------------------------------------------\n");
    }
}

