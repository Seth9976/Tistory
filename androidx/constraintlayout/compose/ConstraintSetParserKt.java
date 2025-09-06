package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.State.Chain;
import androidx.constraintlayout.core.state.State.Direction;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\b\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\b\u0010\u0006\u001A\u001F\u0010\n\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\n\u0010\u0006\u001A\u001F\u0010\f\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\f\u0010\u0006\u001A\'\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u001F\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u001F\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\'\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\r2\u0006\u0010\u001C\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u001F\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b\u001F\u0010\u0019\u001A\u001F\u0010 \u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b \u0010\u0019\u001A\'\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020!2\u0006\u0010#\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b\u0011\u0010$\u001A\'\u0010%\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020!2\u0006\u0010#\u001A\u00020\"2\u0006\u0010\u0001\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b%\u0010&\u001A/\u0010+\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\r2\u0016\u0010*\u001A\u0012\u0012\u0004\u0012\u00020(0\'j\b\u0012\u0004\u0012\u00020(`)H\u0000\u00A2\u0006\u0004\b+\u0010,\u001A\'\u0010.\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020!2\u0006\u0010#\u001A\u00020\"2\u0006\u0010-\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b.\u0010&\u001A\'\u0010/\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020!2\u0006\u0010#\u001A\u00020\"2\u0006\u0010\u0001\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b/\u0010&\u001A/\u00104\u001A\u00020\u00042\u0006\u00100\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020!2\u0006\u00101\u001A\u00020\"2\u0006\u00103\u001A\u000202H\u0000\u00A2\u0006\u0004\b4\u00105\u001A\'\u00106\u001A\u00020\u00042\u0006\u00100\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020!2\u0006\u00103\u001A\u000202H\u0000\u00A2\u0006\u0004\b6\u00107\u001A\'\u00109\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020!2\u0006\u00108\u001A\u00020\r2\u0006\u0010-\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b9\u0010:\u001A/\u0010;\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020!2\u0006\u0010#\u001A\u00020\"2\u0006\u00108\u001A\u00020\r2\u0006\u0010-\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b;\u0010<\u001A\u0019\u0010=\u001A\u0004\u0018\u00010\r2\u0006\u0010-\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b=\u0010>\"\u0014\u0010@\u001A\u00020?8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b@\u0010A\u00A8\u0006B"}, d2 = {"Landroidx/constraintlayout/core/parser/CLObject;", "json", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "parseTransition", "(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V", "keyPosition", "parseKeyPosition", "keyAttribute", "parseKeyAttribute", "keyCycleData", "parseKeyCycle", "", "content", "", "state", "parseJSON", "(Ljava/lang/String;Landroidx/constraintlayout/core/state/Transition;I)V", "Landroidx/constraintlayout/compose/MotionScene;", "scene", "parseMotionSceneJSON", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;)V", "", "parseConstraintSets", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/Object;)V", "baseJson", "name", "overrideValue", "override", "(Landroidx/constraintlayout/core/parser/CLObject;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V", "parseTransitions", "parseHeader", "Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/compose/LayoutVariables;", "layoutVariables", "(Ljava/lang/String;Landroidx/constraintlayout/compose/State;Landroidx/constraintlayout/compose/LayoutVariables;)V", "parseVariables", "(Landroidx/constraintlayout/compose/State;Landroidx/constraintlayout/compose/LayoutVariables;Ljava/lang/Object;)V", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "list", "parseDesignElementsJSON", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "element", "parseHelpers", "parseGenerate", "orientation", "margins", "Landroidx/constraintlayout/core/parser/CLArray;", "helper", "parseChain", "(ILandroidx/constraintlayout/compose/State;Landroidx/constraintlayout/compose/LayoutVariables;Landroidx/constraintlayout/core/parser/CLArray;)V", "parseGuideline", "(ILandroidx/constraintlayout/compose/State;Landroidx/constraintlayout/core/parser/CLArray;)V", "elementName", "parseBarrier", "(Landroidx/constraintlayout/compose/State;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V", "parseWidget", "(Landroidx/constraintlayout/compose/State;Landroidx/constraintlayout/compose/LayoutVariables;Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLObject;)V", "lookForType", "(Landroidx/constraintlayout/core/parser/CLObject;)Ljava/lang/String;", "", "PARSER_DEBUG", "Z", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintSetParserKt {
    public static final boolean PARSER_DEBUG = false;

    public static final Integer a(String s) {
        if(StringsKt__StringsKt.startsWith$default(s, '#', false, 2, null)) {
            if(s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
            if(s1.length() == 6) {
                s1 = "FF" + s1;
            }
            return (int)Long.parseLong(s1, 16);
        }
        return null;
    }

    public static final void b(State state0, LayoutVariables layoutVariables0, CLObject cLObject0, ConstraintReference constraintReference0, String s) {
        float f1;
        float f;
        CLArray cLArray0 = cLObject0.getArrayOrNull(s);
        if(cLArray0 != null && cLArray0.size() > 1) {
            String s1 = cLArray0.getString(0);
            String s2 = cLArray0.getStringOrNull(1);
            if(cLArray0.size() > 2) {
                CLElement cLElement0 = cLArray0.getOrNull(2);
                Intrinsics.checkNotNull(cLElement0);
                f = (float)state0.convertDimension(Dp.box-impl(Dp.constructor-impl(layoutVariables0.get(cLElement0))));
            }
            else {
                f = 0.0f;
            }
            if(cLArray0.size() > 3) {
                CLElement cLElement1 = cLArray0.getOrNull(3);
                Intrinsics.checkNotNull(cLElement1);
                f1 = (float)state0.convertDimension(Dp.box-impl(Dp.constructor-impl(layoutVariables0.get(cLElement1))));
            }
            else {
                f1 = 0.0f;
            }
            ConstraintReference constraintReference1 = s1.equals("parent") ? state0.constraints(androidx.constraintlayout.core.state.State.PARENT) : state0.constraints(s1);
            switch(s.hashCode()) {
                case -1720785339: {
                    if(s.equals("baseline") && s2 != null) {
                        switch(s2) {
                            case "baseline": {
                                Object object0 = constraintReference0.getKey();
                                Intrinsics.checkNotNullExpressionValue(object0, "reference.key");
                                state0.baselineNeededFor$compose_release(object0);
                                Object object1 = constraintReference1.getKey();
                                Intrinsics.checkNotNullExpressionValue(object1, "targetReference.key");
                                state0.baselineNeededFor$compose_release(object1);
                                constraintReference0.baselineToBaseline(constraintReference1);
                                break;
                            }
                            case "bottom": {
                                Object object2 = constraintReference0.getKey();
                                Intrinsics.checkNotNullExpressionValue(object2, "reference.key");
                                state0.baselineNeededFor$compose_release(object2);
                                Object object3 = constraintReference1.getKey();
                                Intrinsics.checkNotNullExpressionValue(object3, "targetReference.key");
                                state0.baselineNeededFor$compose_release(object3);
                                constraintReference0.baselineToBottom(constraintReference1);
                                break;
                            }
                            case "top": {
                                Object object4 = constraintReference0.getKey();
                                Intrinsics.checkNotNullExpressionValue(object4, "reference.key");
                                state0.baselineNeededFor$compose_release(object4);
                                Object object5 = constraintReference1.getKey();
                                Intrinsics.checkNotNullExpressionValue(object5, "targetReference.key");
                                state0.baselineNeededFor$compose_release(object5);
                                constraintReference0.baselineToTop(constraintReference1);
                            }
                        }
                    }
                    break;
                }
                case 0xA6B5069F: {
                    if(s.equals("circular")) {
                        CLElement cLElement2 = cLArray0.get(1);
                        Intrinsics.checkNotNullExpressionValue(cLElement2, "constraint.get(1)");
                        constraintReference0.circularConstraint(constraintReference1, layoutVariables0.get(cLElement2), 0.0f);
                    }
                    break;
                }
                case 0xAD8D9A2B: {
                    if(s.equals("bottom")) {
                        if(Intrinsics.areEqual(s2, "top")) {
                            constraintReference0.bottomToTop(constraintReference1);
                        }
                        else if(Intrinsics.areEqual(s2, "bottom")) {
                            constraintReference0.bottomToBottom(constraintReference1);
                        }
                    }
                    break;
                }
                case 100571: {
                    if(s.equals("end")) {
                        if(Intrinsics.areEqual(s2, "start")) {
                            constraintReference0.endToStart(constraintReference1);
                        }
                        else if(Intrinsics.areEqual(s2, "end")) {
                            constraintReference0.endToEnd(constraintReference1);
                        }
                    }
                    break;
                }
                case 115029: {
                    if(s.equals("top")) {
                        if(Intrinsics.areEqual(s2, "top")) {
                            constraintReference0.topToTop(constraintReference1);
                        }
                        else if(Intrinsics.areEqual(s2, "bottom")) {
                            constraintReference0.topToBottom(constraintReference1);
                        }
                    }
                    break;
                }
                case 0x32A007: {
                    if(s.equals("left")) {
                        if(Intrinsics.areEqual(s2, "left")) {
                            constraintReference0.leftToLeft(constraintReference1);
                        }
                        else if(Intrinsics.areEqual(s2, "right")) {
                            constraintReference0.leftToRight(constraintReference1);
                        }
                    }
                    break;
                }
                case 108511772: {
                    if(s.equals("right")) {
                        if(Intrinsics.areEqual(s2, "left")) {
                            constraintReference0.rightToLeft(constraintReference1);
                        }
                        else if(Intrinsics.areEqual(s2, "right")) {
                            constraintReference0.rightToRight(constraintReference1);
                        }
                    }
                    break;
                }
                case 109757538: {
                    if(s.equals("start")) {
                        if(Intrinsics.areEqual(s2, "start")) {
                            constraintReference0.startToStart(constraintReference1);
                        }
                        else if(Intrinsics.areEqual(s2, "end")) {
                            constraintReference0.startToEnd(constraintReference1);
                        }
                    }
                }
            }
            constraintReference0.margin(f).marginGone(((int)f1));
            return;
        }
        String s3 = cLObject0.getStringOrNull(s);
        if(s3 != null) {
            ConstraintReference constraintReference2 = s3.equals("parent") ? state0.constraints(androidx.constraintlayout.core.state.State.PARENT) : state0.constraints(s3);
            switch(s) {
                case "baseline": {
                    Object object6 = constraintReference0.getKey();
                    Intrinsics.checkNotNullExpressionValue(object6, "reference.key");
                    state0.baselineNeededFor$compose_release(object6);
                    Object object7 = constraintReference2.getKey();
                    Intrinsics.checkNotNullExpressionValue(object7, "targetReference.key");
                    state0.baselineNeededFor$compose_release(object7);
                    constraintReference0.baselineToBaseline(constraintReference2);
                    break;
                }
                case "bottom": {
                    constraintReference0.bottomToBottom(constraintReference2);
                    return;
                }
                case "end": {
                    constraintReference0.endToEnd(constraintReference2);
                    return;
                }
                case "start": {
                    constraintReference0.startToStart(constraintReference2);
                    return;
                }
                case "top": {
                    constraintReference0.topToTop(constraintReference2);
                }
            }
        }
    }

    public static final Dimension c(State state0, String s, CLObject cLObject0) {
        CLElement cLElement0 = cLObject0.get(s);
        Dimension dimension0 = Dimension.Fixed(0);
        Intrinsics.checkNotNullExpressionValue(dimension0, "Fixed(0)");
        if(cLElement0 instanceof CLString) {
            String s1 = cLElement0.content();
            Intrinsics.checkNotNullExpressionValue(s1, "dimensionElement.content()");
            return ConstraintSetParserKt.d(s1);
        }
        if(cLElement0 instanceof CLNumber) {
            dimension0 = Dimension.Fixed(state0.convertDimension(Dp.box-impl(Dp.constructor-impl(cLObject0.getFloat(s)))));
            Intrinsics.checkNotNullExpressionValue(dimension0, "Fixed(\n            state.convertDimension(\n                Dp(\n                    element.getFloat(constraintName)\n                )\n            )\n        )");
            return dimension0;
        }
        if(cLElement0 instanceof CLObject) {
            String s2 = ((CLObject)cLElement0).getStringOrNull("value");
            if(s2 != null) {
                dimension0 = ConstraintSetParserKt.d(s2);
            }
            CLElement cLElement1 = ((CLObject)cLElement0).getOrNull("min");
            if(cLElement1 != null) {
                if(cLElement1 instanceof CLNumber) {
                    dimension0.min(state0.convertDimension(Dp.box-impl(Dp.constructor-impl(cLElement1.getFloat()))));
                }
                else if(cLElement1 instanceof CLString) {
                    dimension0.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement cLElement2 = ((CLObject)cLElement0).getOrNull("max");
            if(cLElement2 != null) {
                if(cLElement2 instanceof CLNumber) {
                    dimension0.max(state0.convertDimension(Dp.box-impl(Dp.constructor-impl(cLElement2.getFloat()))));
                    return dimension0;
                }
                if(cLElement2 instanceof CLString) {
                    dimension0.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return dimension0;
    }

    public static final Dimension d(String s) {
        Dimension dimension0 = Dimension.Fixed(0);
        Intrinsics.checkNotNullExpressionValue(dimension0, "Fixed(0)");
        switch(s) {
            case "parent": {
                dimension0 = Dimension.Parent();
                Intrinsics.checkNotNullExpressionValue(dimension0, "Parent()");
                return dimension0;
            }
            case "preferWrap": {
                dimension0 = Dimension.Suggested(Dimension.WRAP_DIMENSION);
                Intrinsics.checkNotNullExpressionValue(dimension0, "Suggested(WRAP_DIMENSION)");
                break;
            }
            case "spread": {
                dimension0 = Dimension.Suggested(Dimension.SPREAD_DIMENSION);
                Intrinsics.checkNotNullExpressionValue(dimension0, "Suggested(SPREAD_DIMENSION)");
                return dimension0;
            }
            case "wrap": {
                dimension0 = Dimension.Wrap();
                Intrinsics.checkNotNullExpressionValue(dimension0, "Wrap()");
                return dimension0;
            label_13:
                if(StringsKt__StringsKt.endsWith$default(s, '%', false, 2, null)) {
                    dimension0 = Dimension.Percent(0, Float.parseFloat(StringsKt__StringsKt.substringBefore$default(s, '%', null, 2, null)) / 100.0f).suggested(0);
                    Intrinsics.checkNotNullExpressionValue(dimension0, "Percent(0, percentValue).suggested(0)");
                    return dimension0;
                }
                if(StringsKt__StringsKt.contains$default(s, ':', false, 2, null)) {
                    dimension0 = Dimension.Ratio(s).suggested(Dimension.SPREAD_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(dimension0, "Ratio(dimensionString).suggested(SPREAD_DIMENSION)");
                    return dimension0;
                }
                break;
            }
            default: {
                goto label_13;
            }
        }
        return dimension0;
    }

    public static final void e(int v, State state0, String s, CLObject cLObject0) {
        ArrayList arrayList0 = cLObject0.names();
        if(arrayList0 == null) {
            return;
        }
        ConstraintReference constraintReference0 = state0.constraints(s);
        if(v == 0) {
            state0.horizontalGuideline(s);
        }
        else {
            state0.verticalGuideline(s);
        }
        Facade facade0 = constraintReference0.getFacade();
        if(facade0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.GuidelineReference");
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s1 = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            if(s1 != null) {
                switch(s1) {
                    case "end": {
                        ((GuidelineReference)facade0).end(state0.convertDimension(Dp.box-impl(Dp.constructor-impl(cLObject0.getFloat(s1)))));
                        break;
                    }
                    case "percent": {
                        ((GuidelineReference)facade0).percent(cLObject0.getFloat(s1));
                        break;
                    }
                    case "start": {
                        ((GuidelineReference)facade0).start(state0.convertDimension(Dp.box-impl(Dp.constructor-impl(cLObject0.getFloat(s1)))));
                    }
                }
            }
        }
    }

    @Nullable
    public static final String lookForType(@NotNull CLObject cLObject0) {
        Intrinsics.checkNotNullParameter(cLObject0, "element");
        ArrayList arrayList0 = cLObject0.names();
        if(arrayList0 == null) {
            return null;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            if(((String)arrayList0.get(((IntIterator)iterator0).nextInt())).equals("type")) {
                return cLObject0.getString("type");
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final void override(@NotNull CLObject cLObject0, @NotNull String s, @NotNull CLObject cLObject1) {
        Intrinsics.checkNotNullParameter(cLObject0, "baseJson");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(cLObject1, "overrideValue");
        if(!cLObject0.has(s)) {
            cLObject0.put(s, cLObject1);
            return;
        }
        CLObject cLObject2 = cLObject0.getObject(s);
        for(Object object0: cLObject1.names()) {
            String s1 = (String)object0;
            if(s1.equals("clear")) {
                CLArray cLArray0 = cLObject1.getArray("clear");
                Iterator iterator1 = c.until(0, cLArray0.size()).iterator();
                while(iterator1.hasNext()) {
                    String s2 = cLArray0.getStringOrNull(((IntIterator)iterator1).nextInt());
                    if(s2 != null) {
                        switch(s2) {
                            case "constraints": {
                                cLObject2.remove("start");
                                cLObject2.remove("end");
                                cLObject2.remove("top");
                                cLObject2.remove("bottom");
                                cLObject2.remove("baseline");
                                cLObject2.remove("center");
                                cLObject2.remove("centerHorizontally");
                                cLObject2.remove("centerVertically");
                                break;
                            }
                            case "dimensions": {
                                cLObject2.remove("width");
                                cLObject2.remove("height");
                                break;
                            }
                            case "transforms": {
                                cLObject2.remove("visibility");
                                cLObject2.remove("alpha");
                                cLObject2.remove("pivotX");
                                cLObject2.remove("pivotY");
                                cLObject2.remove("rotationX");
                                cLObject2.remove("rotationY");
                                cLObject2.remove("rotationZ");
                                cLObject2.remove("scaleX");
                                cLObject2.remove("scaleY");
                                cLObject2.remove("translationX");
                                cLObject2.remove("translationY");
                                break;
                            }
                            default: {
                                cLObject2.remove(s2);
                            }
                        }
                    }
                }
            }
            else {
                cLObject2.put(s1, cLObject1.get(s1));
            }
        }
    }

    public static final void parseBarrier(@NotNull State state0, @NotNull String s, @NotNull CLObject cLObject0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(cLObject0, "element");
        BarrierReference barrierReference0 = state0.barrier(s, Direction.END);
        ArrayList arrayList0 = cLObject0.names();
        if(arrayList0 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s1 = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            if(s1 != null) {
            alab1:
                switch(s1) {
                    case "contains": {
                        CLArray cLArray0 = cLObject0.getArrayOrNull(s1);
                        if(cLArray0 == null) {
                            continue;
                        }
                        int v = cLArray0.size();
                        if(v <= 0) {
                            continue;
                        }
                        for(int v1 = 0; true; ++v1) {
                            barrierReference0.add(new Object[]{state0.constraints(cLArray0.get(v1).content())});
                            if(v1 + 1 >= v) {
                                break alab1;
                            }
                        }
                    }
                    case "direction": {
                        String s2 = cLObject0.getString(s1);
                        if(s2 == null) {
                            continue;
                        }
                        switch(s2) {
                            case "bottom": {
                                barrierReference0.setBarrierDirection(Direction.BOTTOM);
                                break;
                            }
                            case "end": {
                                barrierReference0.setBarrierDirection(Direction.END);
                                break;
                            }
                            case "left": {
                                barrierReference0.setBarrierDirection(Direction.LEFT);
                                break;
                            }
                            case "right": {
                                barrierReference0.setBarrierDirection(Direction.RIGHT);
                                break;
                            }
                            case "start": {
                                barrierReference0.setBarrierDirection(Direction.START);
                                break;
                            }
                            case "top": {
                                barrierReference0.setBarrierDirection(Direction.TOP);
                            }
                        }
                        continue;
                    }
                    case "margin": {
                        float f = cLObject0.getFloatOrNaN(s1);
                        if(Float.isNaN(f)) {
                            continue;
                        }
                        barrierReference0.margin(((int)f));
                    }
                }
            }
        }
    }

    public static final void parseChain(int v, @NotNull State state0, @NotNull LayoutVariables layoutVariables0, @NotNull CLArray cLArray0) {
        String s1;
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(layoutVariables0, "margins");
        Intrinsics.checkNotNullParameter(cLArray0, "helper");
        HorizontalChainReference horizontalChainReference0 = v == 0 ? state0.horizontalChain() : state0.verticalChain();
        CLElement cLElement0 = cLArray0.get(1);
        if(cLElement0 instanceof CLArray && ((CLArray)cLElement0).size() >= 1) {
            Iterator iterator0 = c.until(0, ((CLArray)cLElement0).size()).iterator();
            while(iterator0.hasNext()) {
                horizontalChainReference0.add(new Object[]{((CLArray)cLElement0).getString(((IntIterator)iterator0).nextInt())});
            }
            if(cLArray0.size() > 2) {
                CLElement cLElement1 = cLArray0.get(2);
                if(!(cLElement1 instanceof CLObject)) {
                    return;
                }
                ArrayList arrayList0 = ((CLObject)cLElement1).names();
                if(arrayList0 == null) {
                    return;
                }
                Iterator iterator1 = a.r(arrayList0, 0);
                while(iterator1.hasNext()) {
                    String s = (String)arrayList0.get(((IntIterator)iterator1).nextInt());
                    if(Intrinsics.areEqual(s, "style")) {
                        CLElement cLElement2 = ((CLObject)cLElement1).get(s);
                        if(!(cLElement2 instanceof CLArray) || ((CLArray)cLElement2).size() <= 1) {
                            s1 = cLElement2.content();
                            Intrinsics.checkNotNullExpressionValue(s1, "styleObject.content()");
                        }
                        else {
                            s1 = ((CLArray)cLElement2).getString(0);
                            Intrinsics.checkNotNullExpressionValue(s1, "styleObject.getString(0)");
                            horizontalChainReference0.bias(((CLArray)cLElement2).getFloat(1));
                        }
                        if(Intrinsics.areEqual(s1, "packed")) {
                            horizontalChainReference0.style(Chain.PACKED);
                        }
                        else if(Intrinsics.areEqual(s1, "spread_inside")) {
                            horizontalChainReference0.style(Chain.SPREAD_INSIDE);
                        }
                        else {
                            horizontalChainReference0.style(Chain.SPREAD);
                        }
                    }
                    else {
                        if(horizontalChainReference0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference");
                        }
                        Intrinsics.checkNotNullExpressionValue(s, "constraintName");
                        ConstraintSetParserKt.b(state0, layoutVariables0, ((CLObject)cLElement1), horizontalChainReference0, s);
                    }
                }
            }
        }
    }

    public static final void parseConstraintSets(@NotNull MotionScene motionScene0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(motionScene0, "scene");
        Intrinsics.checkNotNullParameter(object0, "json");
        if(!(object0 instanceof CLObject)) {
            return;
        }
        ArrayList arrayList0 = ((CLObject)object0).names();
        if(arrayList0 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            CLObject cLObject0 = ((CLObject)object0).getObject(s);
            String s1 = cLObject0.getStringOrNull("Extends");
            if(s1 != null && s1.length() > 0) {
                String s2 = motionScene0.getConstraintSet(s1);
                if(s2 != null) {
                    CLObject cLObject1 = CLParser.parse(s2);
                    ArrayList arrayList1 = cLObject0.names();
                    if(arrayList1 != null) {
                        Iterator iterator1 = a.r(arrayList1, 0);
                        while(iterator1.hasNext()) {
                            String s3 = (String)arrayList1.get(((IntIterator)iterator1).nextInt());
                            CLElement cLElement0 = cLObject0.get(s3);
                            if(cLElement0 instanceof CLObject) {
                                Intrinsics.checkNotNullExpressionValue(cLObject1, "baseJson");
                                Intrinsics.checkNotNullExpressionValue(s3, "widgetOverrideName");
                                ConstraintSetParserKt.override(cLObject1, s3, ((CLObject)cLElement0));
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(s, "csName");
                        String s4 = cLObject1.toJSON();
                        Intrinsics.checkNotNullExpressionValue(s4, "baseJson.toJSON()");
                        motionScene0.setConstraintSetContent(s, s4);
                        continue;
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(s, "csName");
            String s5 = cLObject0.toJSON();
            Intrinsics.checkNotNullExpressionValue(s5, "constraintSet.toJSON()");
            motionScene0.setConstraintSetContent(s, s5);
        }
    }

    public static final void parseDesignElementsJSON(@NotNull String s, @NotNull ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(s, "content");
        Intrinsics.checkNotNullParameter(arrayList0, "list");
        CLObject cLObject0 = CLParser.parse(s);
        ArrayList arrayList1 = cLObject0.names();
        if(arrayList1 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList1, 0);
        while(iterator0.hasNext()) {
            String s1 = (String)arrayList1.get(((IntIterator)iterator0).nextInt());
            CLElement cLElement0 = cLObject0.get(s1);
            if(Intrinsics.areEqual(s1, "Design")) {
                if(cLElement0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                }
                CLObject cLObject1 = (CLObject)cLElement0;
                ArrayList arrayList2 = cLObject1.names();
                if(arrayList2 == null) {
                    return;
                }
                Iterator iterator1 = a.r(arrayList2, 0);
                while(iterator1.hasNext()) {
                    String s2 = (String)arrayList2.get(((IntIterator)iterator1).nextInt());
                    CLElement cLElement1 = cLObject1.get(s2);
                    if(cLElement1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                    }
                    CLObject cLObject2 = (CLObject)cLElement1;
                    System.out.printf("element found <" + s2 + '>', new Object[0]);
                    String s3 = cLObject2.getStringOrNull("type");
                    if(s3 != null) {
                        HashMap hashMap0 = new HashMap();
                        int v = cLObject2.size() - 1;
                        if(v >= 0) {
                            for(int v1 = 0; true; ++v1) {
                                CLElement cLElement2 = cLObject2.get(v1);
                                if(cLElement2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                                }
                                String s4 = ((CLKey)cLElement2).content();
                                CLElement cLElement3 = ((CLKey)cLElement2).getValue();
                                String s5 = cLElement3 == null ? null : cLElement3.content();
                                if(s5 != null) {
                                    Intrinsics.checkNotNullExpressionValue(s4, "paramName");
                                    hashMap0.put(s4, s5);
                                }
                                if(v1 == v) {
                                    break;
                                }
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(s2, "elementName");
                        arrayList0.add(new DesignElement(s2, s3, hashMap0));
                    }
                }
            }
        }
    }

    public static final void parseGenerate(@NotNull State state0, @NotNull LayoutVariables layoutVariables0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(layoutVariables0, "layoutVariables");
        Intrinsics.checkNotNullParameter(object0, "json");
        if(!(object0 instanceof CLObject)) {
            return;
        }
        ArrayList arrayList0 = ((CLObject)object0).names();
        if(arrayList0 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            CLElement cLElement0 = ((CLObject)object0).get(s);
            Intrinsics.checkNotNullExpressionValue(s, "elementName");
            ArrayList arrayList1 = layoutVariables0.getList(s);
            if(arrayList1 != null && cLElement0 instanceof CLObject) {
                for(Object object1: arrayList1) {
                    Intrinsics.checkNotNullExpressionValue(((String)object1), "id");
                    ConstraintSetParserKt.parseWidget(state0, layoutVariables0, ((String)object1), ((CLObject)cLElement0));
                }
            }
        }
    }

    public static final void parseGuideline(int v, @NotNull State state0, @NotNull CLArray cLArray0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(cLArray0, "helper");
        CLElement cLElement0 = cLArray0.get(1);
        if(!(cLElement0 instanceof CLObject)) {
            return;
        }
        String s = ((CLObject)cLElement0).getStringOrNull("id");
        if(s == null) {
            return;
        }
        ConstraintSetParserKt.e(v, state0, s, ((CLObject)cLElement0));
    }

    public static final void parseHeader(@NotNull MotionScene motionScene0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(motionScene0, "scene");
        Intrinsics.checkNotNullParameter(object0, "json");
        if(!(object0 instanceof CLObject)) {
            return;
        }
        String s = ((CLObject)object0).getStringOrNull("export");
        if(s != null) {
            motionScene0.setDebugName(s);
        }
    }

    public static final void parseHelpers(@NotNull State state0, @NotNull LayoutVariables layoutVariables0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(layoutVariables0, "layoutVariables");
        Intrinsics.checkNotNullParameter(object0, "element");
        if(!(object0 instanceof CLArray)) {
            return;
        }
        Iterator iterator0 = c.until(0, ((CLArray)object0).size()).iterator();
        while(iterator0.hasNext()) {
            CLElement cLElement0 = ((CLArray)object0).get(((IntIterator)iterator0).nextInt());
            if(cLElement0 instanceof CLArray && ((CLArray)cLElement0).size() > 1) {
                String s = ((CLArray)cLElement0).getString(0);
                if(s != null) {
                    switch(s) {
                        case "hChain": {
                            ConstraintSetParserKt.parseChain(0, state0, layoutVariables0, ((CLArray)cLElement0));
                            break;
                        }
                        case "hGuideline": {
                            ConstraintSetParserKt.parseGuideline(0, state0, ((CLArray)cLElement0));
                            break;
                        }
                        case "vChain": {
                            ConstraintSetParserKt.parseChain(1, state0, layoutVariables0, ((CLArray)cLElement0));
                            break;
                        }
                        case "vGuideline": {
                            ConstraintSetParserKt.parseGuideline(1, state0, ((CLArray)cLElement0));
                        }
                    }
                }
            }
        }
    }

    public static final void parseJSON(@NotNull String s, @NotNull State state0, @NotNull LayoutVariables layoutVariables0) {
        Intrinsics.checkNotNullParameter(s, "content");
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(layoutVariables0, "layoutVariables");
        try {
            CLObject cLObject0 = CLParser.parse(s);
            ArrayList arrayList0 = cLObject0.names();
            if(arrayList0 == null) {
                return;
            }
            Iterator iterator0 = c.until(0, arrayList0.size()).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                String s1 = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
                CLElement cLElement0 = cLObject0.get(s1);
                if(s1 == null) {
                    goto label_13;
                }
                switch(s1) {
                    case "Generate": {
                        Intrinsics.checkNotNullExpressionValue(cLElement0, "element");
                        ConstraintSetParserKt.parseGenerate(state0, layoutVariables0, cLElement0);
                        continue;
                    }
                    case "Helpers": {
                        Intrinsics.checkNotNullExpressionValue(cLElement0, "element");
                        ConstraintSetParserKt.parseHelpers(state0, layoutVariables0, cLElement0);
                        continue;
                    }
                    case "Variables": {
                        break;
                    }
                    default: {
                    label_13:
                        if(cLElement0 instanceof CLObject) {
                            String s2 = ConstraintSetParserKt.lookForType(((CLObject)cLElement0));
                            if(s2 == null) {
                                Intrinsics.checkNotNullExpressionValue(s1, "elementName");
                                ConstraintSetParserKt.parseWidget(state0, layoutVariables0, s1, ((CLObject)cLElement0));
                            }
                            else {
                                switch(s2) {
                                    case "barrier": {
                                        Intrinsics.checkNotNullExpressionValue(s1, "elementName");
                                        ConstraintSetParserKt.parseBarrier(state0, s1, ((CLObject)cLElement0));
                                        break;
                                    }
                                    case "hGuideline": {
                                        Intrinsics.checkNotNullExpressionValue(s1, "elementName");
                                        ConstraintSetParserKt.e(0, state0, s1, ((CLObject)cLElement0));
                                        break;
                                    }
                                    case "vGuideline": {
                                        Intrinsics.checkNotNullExpressionValue(s1, "elementName");
                                        ConstraintSetParserKt.e(1, state0, s1, ((CLObject)cLElement0));
                                    }
                                }
                            }
                        }
                        else {
                            if(!(cLElement0 instanceof CLNumber)) {
                                continue;
                            }
                            Intrinsics.checkNotNullExpressionValue(s1, "elementName");
                            layoutVariables0.put(s1, ((CLNumber)cLElement0).getInt());
                        }
                        continue;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(cLElement0, "element");
                ConstraintSetParserKt.parseVariables(state0, layoutVariables0, cLElement0);
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        System.err.println("Error parsing JSON " + cLParsingException0);
    }

    public static final void parseJSON(@NotNull String s, @NotNull Transition transition0, int v) {
        Intrinsics.checkNotNullParameter(s, "content");
        Intrinsics.checkNotNullParameter(transition0, "transition");
        try {
            CLObject cLObject0 = CLParser.parse(s);
            ArrayList arrayList0 = cLObject0.names();
            if(arrayList0 == null) {
                return;
            }
            Iterator iterator0 = c.until(0, arrayList0.size()).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                String s1 = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
                CLElement cLElement0 = cLObject0.get(s1);
                if(cLElement0 instanceof CLObject) {
                    CLObject cLObject1 = ((CLObject)cLElement0).getObjectOrNull("custom");
                    if(cLObject1 != null) {
                        ArrayList arrayList1 = cLObject1.names();
                        if(arrayList1 == null) {
                            return;
                        }
                        Iterator iterator1 = c.until(0, arrayList1.size()).iterator();
                        while(iterator1.hasNext()) {
                            String s2 = (String)arrayList1.get(((IntIterator)iterator1).nextInt());
                            CLElement cLElement1 = cLObject1.get(s2);
                            if(cLElement1 instanceof CLNumber) {
                                transition0.addCustomFloat(v, s1, s2, cLElement1.getFloat());
                            }
                            else if(cLElement1 instanceof CLString) {
                                String s3 = cLElement1.content();
                                Intrinsics.checkNotNullExpressionValue(s3, "value.content()");
                                Integer integer0 = ConstraintSetParserKt.a(s3);
                                if(integer0 != null) {
                                    transition0.addCustomColor(v, s1, s2, integer0.intValue());
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        System.err.println("Error parsing JSON " + cLParsingException0);
    }

    public static final void parseKeyAttribute(@NotNull CLObject cLObject0, @NotNull Transition transition0) {
        Intrinsics.checkNotNullParameter(cLObject0, "keyAttribute");
        Intrinsics.checkNotNullParameter(transition0, "transition");
        CLArray cLArray0 = cLObject0.getArrayOrNull("target");
        if(cLArray0 == null) {
            return;
        }
        CLArray cLArray1 = cLObject0.getArrayOrNull("frames");
        if(cLArray1 == null) {
            return;
        }
        String s = cLObject0.getStringOrNull("transitionEasing");
        ArrayList arrayList0 = CollectionsKt__CollectionsKt.arrayListOf(new String[]{"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"});
        ArrayList arrayList1 = CollectionsKt__CollectionsKt.arrayListOf(new Integer[]{311, 312, 304, 305, 306, 308, 309, 310, 303});
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator0 = c.until(0, cLArray1.size()).iterator();
        while(iterator0.hasNext()) {
            ((IntIterator)iterator0).nextInt();
            arrayList2.add(new TypedBundle());
        }
        int v = arrayList0.size();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = arrayList0.get(v1);
                Intrinsics.checkNotNullExpressionValue(object0, "attrNames[k]");
                String s1 = (String)object0;
                Object object1 = arrayList1.get(v1);
                Intrinsics.checkNotNullExpressionValue(object1, "attrIds[k]");
                int v2 = ((Number)object1).intValue();
                CLArray cLArray2 = cLObject0.getArrayOrNull(s1);
                if(cLArray2 != null && cLArray2.size() != arrayList2.size()) {
                    throw new CLParsingException("incorrect size for " + s1 + " array, not matching targets array!", cLObject0);
                }
                if(cLArray2 == null) {
                    float f = cLObject0.getFloatOrNaN(s1);
                    if(!Float.isNaN(f)) {
                        Iterator iterator2 = a.r(arrayList2, 0);
                        while(iterator2.hasNext()) {
                            ((TypedBundle)arrayList2.get(((IntIterator)iterator2).nextInt())).add(v2, f);
                        }
                    }
                }
                else {
                    Iterator iterator1 = a.r(arrayList2, 0);
                    while(iterator1.hasNext()) {
                        int v3 = ((IntIterator)iterator1).nextInt();
                        ((TypedBundle)arrayList2.get(v3)).add(v2, cLArray2.getFloat(v3));
                    }
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        String s2 = cLObject0.getStringOrNull("curveFit");
        Iterator iterator3 = c.until(0, cLArray0.size()).iterator();
        while(iterator3.hasNext()) {
            int v4 = ((IntIterator)iterator3).nextInt();
            Iterator iterator4 = a.r(arrayList2, 0);
            while(iterator4.hasNext()) {
                int v5 = ((IntIterator)iterator4).nextInt();
                String s3 = cLArray0.getString(v4);
                Object object2 = arrayList2.get(v5);
                Intrinsics.checkNotNullExpressionValue(object2, "bundles[j]");
                TypedBundle typedBundle0 = (TypedBundle)object2;
                if(s2 != null) {
                    if(Intrinsics.areEqual(s2, "spline")) {
                        typedBundle0.add(508, 0);
                    }
                    else if(Intrinsics.areEqual(s2, "linear")) {
                        typedBundle0.add(508, 1);
                    }
                }
                typedBundle0.addIfNotNull(501, s);
                typedBundle0.add(100, cLArray1.getInt(v5));
                transition0.addKeyAttribute(s3, typedBundle0);
            }
        }
    }

    public static final void parseKeyCycle(@NotNull CLObject cLObject0, @NotNull Transition transition0) {
        Intrinsics.checkNotNullParameter(cLObject0, "keyCycleData");
        Intrinsics.checkNotNullParameter(transition0, "transition");
        CLArray cLArray0 = cLObject0.getArray("target");
        CLArray cLArray1 = cLObject0.getArray("frames");
        String s = cLObject0.getStringOrNull("transitionEasing");
        ArrayList arrayList0 = CollectionsKt__CollectionsKt.arrayListOf(new String[]{"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", "period", "offset", "phase"});
        ArrayList arrayList1 = CollectionsKt__CollectionsKt.arrayListOf(new Integer[]{311, 312, 304, 305, 306, 308, 309, 310, 403, 423, 424, 425});
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator0 = c.until(0, cLArray1.size()).iterator();
        while(iterator0.hasNext()) {
            ((IntIterator)iterator0).nextInt();
            arrayList2.add(new TypedBundle());
        }
        int v = arrayList0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = arrayList0.get(v1);
                Intrinsics.checkNotNullExpressionValue(object0, "attrNames[k]");
                String s1 = (String)object0;
                Object object1 = arrayList1.get(v1);
                Intrinsics.checkNotNullExpressionValue(object1, "attrIds[k]");
                int v2 = ((Number)object1).intValue();
                CLArray cLArray2 = cLObject0.getArrayOrNull(s1);
                if(cLArray2 != null && cLArray2.size() != arrayList2.size()) {
                    throw new CLParsingException("incorrect size for " + s1 + " array, not matching targets array!", cLObject0);
                }
                if(cLArray2 == null) {
                    float f = cLObject0.getFloatOrNaN(s1);
                    if(!Float.isNaN(f)) {
                        Iterator iterator2 = a.r(arrayList2, 0);
                        while(iterator2.hasNext()) {
                            ((TypedBundle)arrayList2.get(((IntIterator)iterator2).nextInt())).add(v2, f);
                        }
                    }
                }
                else {
                    Iterator iterator1 = a.r(arrayList2, 0);
                    while(iterator1.hasNext()) {
                        int v3 = ((IntIterator)iterator1).nextInt();
                        ((TypedBundle)arrayList2.get(v3)).add(v2, cLArray2.getFloat(v3));
                    }
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        String s2 = cLObject0.getStringOrNull("curveFit");
        String s3 = cLObject0.getStringOrNull("easing");
        String s4 = cLObject0.getStringOrNull("waveShape");
        String s5 = cLObject0.getStringOrNull("customWave");
        Iterator iterator3 = c.until(0, cLArray0.size()).iterator();
        while(iterator3.hasNext()) {
            int v4 = ((IntIterator)iterator3).nextInt();
            Iterator iterator4 = a.r(arrayList2, 0);
            while(iterator4.hasNext()) {
                int v5 = ((IntIterator)iterator4).nextInt();
                String s6 = cLArray0.getString(v4);
                Object object2 = arrayList2.get(v5);
                Intrinsics.checkNotNullExpressionValue(object2, "bundles.get(j)");
                TypedBundle typedBundle0 = (TypedBundle)object2;
                if(s2 != null) {
                    if(Intrinsics.areEqual(s2, "spline")) {
                        typedBundle0.add(401, 0);
                    }
                    else if(Intrinsics.areEqual(s2, "linear")) {
                        typedBundle0.add(401, 1);
                    }
                }
                typedBundle0.addIfNotNull(501, s);
                if(s3 != null) {
                    typedBundle0.add(420, s3);
                }
                if(s4 != null) {
                    typedBundle0.add(421, s4);
                }
                if(s5 != null) {
                    typedBundle0.add(422, s5);
                }
                typedBundle0.add(100, cLArray1.getInt(v5));
                transition0.addKeyCycle(s6, typedBundle0);
            }
        }
    }

    public static final void parseKeyPosition(@NotNull CLObject cLObject0, @NotNull Transition transition0) {
        int v;
        Intrinsics.checkNotNullParameter(cLObject0, "keyPosition");
        Intrinsics.checkNotNullParameter(transition0, "transition");
        TypedBundle typedBundle0 = new TypedBundle();
        CLArray cLArray0 = cLObject0.getArray("target");
        CLArray cLArray1 = cLObject0.getArray("frames");
        CLArray cLArray2 = cLObject0.getArrayOrNull("percentX");
        CLArray cLArray3 = cLObject0.getArrayOrNull("percentY");
        CLArray cLArray4 = cLObject0.getArrayOrNull("percentWidth");
        CLArray cLArray5 = cLObject0.getArrayOrNull("percentHeight");
        String s = cLObject0.getStringOrNull("pathMotionArc");
        String s1 = cLObject0.getStringOrNull("transitionEasing");
        String s2 = cLObject0.getStringOrNull("curveFit");
        String s3 = cLObject0.getStringOrNull("type");
        if(s3 == null) {
            s3 = "parentRelative";
        }
        if(cLArray2 != null && cLArray1.size() != cLArray2.size()) {
            return;
        }
        if(cLArray3 != null && cLArray1.size() != cLArray3.size()) {
            return;
        }
        Iterator iterator0 = c.until(0, cLArray0.size()).iterator();
        while(iterator0.hasNext()) {
            String s4 = cLArray0.getString(((IntIterator)iterator0).nextInt());
            typedBundle0.clear();
            switch(s3) {
                case "parentRelative": {
                    v = 2;
                    break;
                }
                case "pathRelative": {
                    v = 1;
                    break;
                }
                default: {
                    v = 0;
                }
            }
            typedBundle0.add(510, v);
            if(s2 != null) {
                if(Intrinsics.areEqual(s2, "spline")) {
                    typedBundle0.add(508, 0);
                }
                else if(Intrinsics.areEqual(s2, "linear")) {
                    typedBundle0.add(508, 1);
                }
            }
            typedBundle0.addIfNotNull(501, s1);
            if(s != null) {
                switch(s) {
                    case "flip": {
                        typedBundle0.add(509, 3);
                        break;
                    }
                    case "none": {
                        typedBundle0.add(509, 0);
                        break;
                    }
                    case "startHorizontal": {
                        typedBundle0.add(509, 2);
                        break;
                    }
                    case "startVertical": {
                        typedBundle0.add(509, 1);
                    }
                }
            }
            Iterator iterator1 = c.until(0, cLArray1.size()).iterator();
            while(iterator1.hasNext()) {
                int v1 = ((IntIterator)iterator1).nextInt();
                typedBundle0.add(100, cLArray1.getInt(v1));
                if(cLArray2 != null) {
                    typedBundle0.add(506, cLArray2.getFloat(v1));
                }
                if(cLArray3 != null) {
                    typedBundle0.add(507, cLArray3.getFloat(v1));
                }
                if(cLArray4 != null) {
                    typedBundle0.add(503, cLArray4.getFloat(v1));
                }
                if(cLArray5 != null) {
                    typedBundle0.add(504, cLArray5.getFloat(v1));
                }
                transition0.addKeyPosition(s4, typedBundle0);
            }
        }
    }

    public static final void parseMotionSceneJSON(@NotNull MotionScene motionScene0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(motionScene0, "scene");
        Intrinsics.checkNotNullParameter(s, "content");
        try {
            CLObject cLObject0 = CLParser.parse(s);
            ArrayList arrayList0 = cLObject0.names();
            if(arrayList0 == null) {
                return;
            }
            Iterator iterator0 = c.until(0, arrayList0.size()).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                String s1 = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
                CLElement cLElement0 = cLObject0.get(s1);
                if(s1 != null) {
                    switch(s1) {
                        case "ConstraintSets": {
                            Intrinsics.checkNotNullExpressionValue(cLElement0, "element");
                            ConstraintSetParserKt.parseConstraintSets(motionScene0, cLElement0);
                            break;
                        }
                        case "Header": {
                            Intrinsics.checkNotNullExpressionValue(cLElement0, "element");
                            ConstraintSetParserKt.parseHeader(motionScene0, cLElement0);
                            break;
                        }
                        case "Transitions": {
                            Intrinsics.checkNotNullExpressionValue(cLElement0, "element");
                            ConstraintSetParserKt.parseTransitions(motionScene0, cLElement0);
                        }
                    }
                }
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        System.err.println("Error parsing JSON " + cLParsingException0);
    }

    public static final void parseTransition(@NotNull CLObject cLObject0, @NotNull Transition transition0) {
        int v1;
        Intrinsics.checkNotNullParameter(cLObject0, "json");
        Intrinsics.checkNotNullParameter(transition0, "transition");
        String s = cLObject0.getStringOrNull("pathMotionArc");
        TypedBundle typedBundle0 = new TypedBundle();
        int v = 1;
        if(s == null) {
            v1 = 0;
        }
        else {
            switch(s) {
                case "flip": {
                    typedBundle0.add(509, 3);
                    break;
                }
                case "none": {
                    typedBundle0.add(509, 0);
                    break;
                }
                case "startHorizontal": {
                    typedBundle0.add(509, 2);
                    break;
                }
                case "startVertical": {
                    typedBundle0.add(509, 1);
                }
            }
            v1 = 1;
        }
        String s1 = cLObject0.getStringOrNull("interpolator");
        if(s1 != null) {
            typedBundle0.add(705, s1);
            v1 = 1;
        }
        float f = cLObject0.getFloatOrNaN("staggered");
        if(Float.isNaN(f)) {
            v = v1;
        }
        else {
            typedBundle0.add(706, f);
        }
        if(v != 0) {
            transition0.setTransitionProperties(typedBundle0);
        }
        CLObject cLObject1 = cLObject0.getObjectOrNull("KeyFrames");
        if(cLObject1 == null) {
            return;
        }
        CLArray cLArray0 = cLObject1.getArrayOrNull("KeyPositions");
        if(cLArray0 != null) {
            Iterator iterator0 = c.until(0, cLArray0.size()).iterator();
            while(iterator0.hasNext()) {
                CLElement cLElement0 = cLArray0.get(((IntIterator)iterator0).nextInt());
                if(cLElement0 instanceof CLObject) {
                    ConstraintSetParserKt.parseKeyPosition(((CLObject)cLElement0), transition0);
                }
            }
        }
        CLArray cLArray1 = cLObject1.getArrayOrNull("KeyAttributes");
        if(cLArray1 != null) {
            Iterator iterator1 = c.until(0, cLArray1.size()).iterator();
            while(iterator1.hasNext()) {
                CLElement cLElement1 = cLArray1.get(((IntIterator)iterator1).nextInt());
                if(cLElement1 instanceof CLObject) {
                    ConstraintSetParserKt.parseKeyAttribute(((CLObject)cLElement1), transition0);
                }
            }
        }
        CLArray cLArray2 = cLObject1.getArrayOrNull("KeyCycles");
        if(cLArray2 != null) {
            Iterator iterator2 = c.until(0, cLArray2.size()).iterator();
            while(iterator2.hasNext()) {
                CLElement cLElement2 = cLArray2.get(((IntIterator)iterator2).nextInt());
                if(cLElement2 instanceof CLObject) {
                    ConstraintSetParserKt.parseKeyCycle(((CLObject)cLElement2), transition0);
                }
            }
        }
    }

    public static final void parseTransitions(@NotNull MotionScene motionScene0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(motionScene0, "scene");
        Intrinsics.checkNotNullParameter(object0, "json");
        if(!(object0 instanceof CLObject)) {
            return;
        }
        ArrayList arrayList0 = ((CLObject)object0).names();
        if(arrayList0 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            CLObject cLObject0 = ((CLObject)object0).getObject(s);
            Intrinsics.checkNotNullExpressionValue(s, "elementName");
            String s1 = cLObject0.toJSON();
            Intrinsics.checkNotNullExpressionValue(s1, "element.toJSON()");
            motionScene0.setTransitionContent(s, s1);
        }
    }

    public static final void parseVariables(@NotNull State state0, @NotNull LayoutVariables layoutVariables0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(layoutVariables0, "layoutVariables");
        Intrinsics.checkNotNullParameter(object0, "json");
        if(!(object0 instanceof CLObject)) {
            return;
        }
        ArrayList arrayList0 = ((CLObject)object0).names();
        if(arrayList0 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            CLElement cLElement0 = ((CLObject)object0).get(s);
            if(cLElement0 instanceof CLNumber) {
                Intrinsics.checkNotNullExpressionValue(s, "elementName");
                layoutVariables0.put(s, ((CLNumber)cLElement0).getInt());
            }
            else if(!(cLElement0 instanceof CLObject)) {
            }
            else if(((CLObject)cLElement0).has("from") && ((CLObject)cLElement0).has("to")) {
                CLElement cLElement1 = ((CLObject)cLElement0).get("from");
                Intrinsics.checkNotNullExpressionValue(cLElement1, "element[\"from\"]");
                float f = layoutVariables0.get(cLElement1);
                CLElement cLElement2 = ((CLObject)cLElement0).get("to");
                Intrinsics.checkNotNullExpressionValue(cLElement2, "element[\"to\"]");
                float f1 = layoutVariables0.get(cLElement2);
                String s1 = ((CLObject)cLElement0).getStringOrNull("prefix");
                String s2 = ((CLObject)cLElement0).getStringOrNull("postfix");
                if(s2 == null) {
                    s2 = "";
                }
                Intrinsics.checkNotNullExpressionValue(s, "elementName");
                layoutVariables0.put(s, f, f1, 1.0f, (s1 == null ? "" : s1), s2);
            }
            else if(((CLObject)cLElement0).has("from") && ((CLObject)cLElement0).has("step")) {
                CLElement cLElement3 = ((CLObject)cLElement0).get("from");
                Intrinsics.checkNotNullExpressionValue(cLElement3, "element[\"from\"]");
                float f2 = layoutVariables0.get(cLElement3);
                CLElement cLElement4 = ((CLObject)cLElement0).get("step");
                Intrinsics.checkNotNullExpressionValue(cLElement4, "element[\"step\"]");
                float f3 = layoutVariables0.get(cLElement4);
                Intrinsics.checkNotNullExpressionValue(s, "elementName");
                layoutVariables0.put(s, f2, f3);
            }
            else if(((CLObject)cLElement0).has("ids")) {
                CLArray cLArray0 = ((CLObject)cLElement0).getArray("ids");
                ArrayList arrayList1 = new ArrayList();
                int v = cLArray0.size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        arrayList1.add(cLArray0.getString(v1));
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(s, "elementName");
                layoutVariables0.put(s, arrayList1);
            }
            else if(((CLObject)cLElement0).has("tag")) {
                ArrayList arrayList2 = state0.getIdsForTag(((CLObject)cLElement0).getString("tag"));
                Intrinsics.checkNotNullExpressionValue(s, "elementName");
                Intrinsics.checkNotNullExpressionValue(arrayList2, "arrayIds");
                layoutVariables0.put(s, arrayList2);
            }
        }
    }

    public static final void parseWidget(@NotNull State state0, @NotNull LayoutVariables layoutVariables0, @NotNull String s, @NotNull CLObject cLObject0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(layoutVariables0, "layoutVariables");
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(cLObject0, "element");
        ConstraintReference constraintReference0 = state0.constraints(s);
        if(constraintReference0.getWidth() == null) {
            constraintReference0.setWidth(Dimension.Wrap());
        }
        if(constraintReference0.getHeight() == null) {
            constraintReference0.setHeight(Dimension.Wrap());
        }
        ArrayList arrayList0 = cLObject0.names();
        if(arrayList0 == null) {
            return;
        }
        Iterator iterator0 = a.r(arrayList0, 0);
        while(iterator0.hasNext()) {
            String s1 = (String)arrayList0.get(((IntIterator)iterator0).nextInt());
            if(s1 != null) {
                switch(s1) {
                    case "alpha": {
                        CLElement cLElement12 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement12, "element[constraintName]");
                        constraintReference0.alpha(layoutVariables0.get(cLElement12));
                        continue;
                    }
                    case "center": {
                        String s3 = cLObject0.getString(s1);
                        ConstraintReference constraintReference2 = s3.equals("parent") ? state0.constraints(androidx.constraintlayout.core.state.State.PARENT) : state0.constraints(s3);
                        constraintReference0.startToStart(constraintReference2);
                        constraintReference0.endToEnd(constraintReference2);
                        constraintReference0.topToTop(constraintReference2);
                        constraintReference0.bottomToBottom(constraintReference2);
                        continue;
                    }
                    case "centerHorizontally": {
                        String s6 = cLObject0.getString(s1);
                        ConstraintReference constraintReference3 = s6.equals("parent") ? state0.constraints(androidx.constraintlayout.core.state.State.PARENT) : state0.constraints(s6);
                        constraintReference0.startToStart(constraintReference3);
                        constraintReference0.endToEnd(constraintReference3);
                        continue;
                    }
                    case "centerVertically": {
                        String s2 = cLObject0.getString(s1);
                        ConstraintReference constraintReference1 = s2.equals("parent") ? state0.constraints(androidx.constraintlayout.core.state.State.PARENT) : state0.constraints(s2);
                        constraintReference0.topToTop(constraintReference1);
                        constraintReference0.bottomToBottom(constraintReference1);
                        continue;
                    }
                    case "custom": {
                        Intrinsics.checkNotNullExpressionValue(constraintReference0, "reference");
                        CLObject cLObject1 = cLObject0.getObjectOrNull(s1);
                        if(cLObject1 == null) {
                            continue;
                        }
                        ArrayList arrayList1 = cLObject1.names();
                        if(arrayList1 == null) {
                            continue;
                        }
                        Iterator iterator1 = a.r(arrayList1, 0);
                        while(iterator1.hasNext()) {
                            String s4 = (String)arrayList1.get(((IntIterator)iterator1).nextInt());
                            CLElement cLElement0 = cLObject1.get(s4);
                            if(cLElement0 instanceof CLNumber) {
                                constraintReference0.addCustomFloat(s4, cLElement0.getFloat());
                            }
                            else if(cLElement0 instanceof CLString) {
                                String s5 = cLElement0.content();
                                Intrinsics.checkNotNullExpressionValue(s5, "value.content()");
                                Integer integer0 = ConstraintSetParserKt.a(s5);
                                if(integer0 != null) {
                                    constraintReference0.addCustomColor(s4, integer0.intValue());
                                }
                            }
                        }
                        continue;
                    }
                    case "hBias": {
                        CLElement cLElement13 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement13, "element[constraintName]");
                        constraintReference0.horizontalBias(layoutVariables0.get(cLElement13));
                        continue;
                    }
                    case "hWeight": {
                        CLElement cLElement15 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement15, "element[constraintName]");
                        constraintReference0.setHorizontalChainWeight(layoutVariables0.get(cLElement15));
                        continue;
                    }
                    case "height": {
                        constraintReference0.setHeight(ConstraintSetParserKt.c(state0, s1, cLObject0));
                        continue;
                    }
                    case "pivotX": {
                        CLElement cLElement7 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement7, "element[constraintName]");
                        constraintReference0.pivotX(layoutVariables0.get(cLElement7));
                        continue;
                    }
                    case "pivotY": {
                        CLElement cLElement8 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement8, "element[constraintName]");
                        constraintReference0.pivotY(layoutVariables0.get(cLElement8));
                        continue;
                    }
                    case "rotationX": {
                        CLElement cLElement1 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement1, "element[constraintName]");
                        constraintReference0.rotationX(layoutVariables0.get(cLElement1));
                        continue;
                    }
                    case "rotationY": {
                        CLElement cLElement2 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement2, "element[constraintName]");
                        constraintReference0.rotationY(layoutVariables0.get(cLElement2));
                        continue;
                    }
                    case "rotationZ": {
                        CLElement cLElement3 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement3, "element[constraintName]");
                        constraintReference0.rotationZ(layoutVariables0.get(cLElement3));
                        continue;
                    }
                    case "scaleX": {
                        CLElement cLElement9 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement9, "element[constraintName]");
                        constraintReference0.scaleX(layoutVariables0.get(cLElement9));
                        continue;
                    }
                    case "scaleY": {
                        CLElement cLElement10 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement10, "element[constraintName]");
                        constraintReference0.scaleY(layoutVariables0.get(cLElement10));
                        continue;
                    }
                    case "translationX": {
                        CLElement cLElement4 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement4, "element[constraintName]");
                        constraintReference0.translationX(layoutVariables0.get(cLElement4));
                        continue;
                    }
                    case "translationY": {
                        CLElement cLElement5 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement5, "element[constraintName]");
                        constraintReference0.translationY(layoutVariables0.get(cLElement5));
                        continue;
                    }
                    case "translationZ": {
                        CLElement cLElement6 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement6, "element[constraintName]");
                        constraintReference0.translationZ(layoutVariables0.get(cLElement6));
                        continue;
                    }
                    case "vBias": {
                        CLElement cLElement14 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement14, "element[constraintName]");
                        constraintReference0.verticalBias(layoutVariables0.get(cLElement14));
                        continue;
                    }
                    case "vWeight": {
                        CLElement cLElement11 = cLObject0.get(s1);
                        Intrinsics.checkNotNullExpressionValue(cLElement11, "element[constraintName]");
                        constraintReference0.setVerticalChainWeight(layoutVariables0.get(cLElement11));
                        continue;
                    }
                    case "visibility": {
                        String s7 = cLObject0.getString(s1);
                        if(s7 == null) {
                            continue;
                        }
                        switch(s7) {
                            case "gone": {
                                constraintReference0.visibility(8);
                                break;
                            }
                            case "invisible": {
                                constraintReference0.visibility(4);
                                break;
                            }
                            case "visible": {
                                constraintReference0.visibility(0);
                            }
                        }
                        continue;
                    }
                    case "width": {
                        constraintReference0.setWidth(ConstraintSetParserKt.c(state0, s1, cLObject0));
                        continue;
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(constraintReference0, "reference");
            Intrinsics.checkNotNullExpressionValue(s1, "constraintName");
            ConstraintSetParserKt.b(state0, layoutVariables0, cLObject0, constraintReference0, s1);
        }
    }
}

