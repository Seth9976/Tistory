package androidx.constraintlayout.compose;

import a2.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.gd;
import androidx.compose.material3.y3;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.j1;
import r0.a;

@Metadata(d1 = {"\u0000\u00A6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\'\u0010\n\u001A\u00020\b2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u000F\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0004JI\u0010&\u001A\u00020#2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001D2\u0006\u0010 \u001A\u00020\u00052\u0006\u0010\"\u001A\u00020!\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010(\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\'\u0010\u0004J\u001D\u0010+\u001A\u00020\u00102\u0006\u0010\u0018\u001A\u00020\u0017H\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010-\u001A\u00020\u0010*\u00020,2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001D\u00A2\u0006\u0004\b-\u0010.J\u000F\u0010/\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b/\u0010\u0004J\u001B\u00103\u001A\u00020\u0010*\u0002002\u0006\u00102\u001A\u000201H\u0007\u00A2\u0006\u0004\b3\u00104J\u000F\u00105\u001A\u00020\u0010H\u0007\u00A2\u0006\u0004\b5\u00106J\u0015\u00107\u001A\u00020\u00102\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b7\u00108R$\u0010>\u001A\u0004\u0018\u00010\u00128\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010\u0015R\u001A\u0010D\u001A\u00020?8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR&\u0010K\u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020F0E8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR&\u0010O\u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020L0E8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\bM\u0010H\u001A\u0004\bN\u0010JR\"\u0010Q\u001A\u00020P8\u0004@\u0004X\u0084.\u00A2\u0006\u0012\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010\"\u001A\u00020!8\u0004@\u0004X\u0084.\u00A2\u0006\u0012\n\u0004\b\"\u0010W\u001A\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001B\u0010a\u001A\u00020\\8DX\u0084\u0084\u0002\u00A2\u0006\f\n\u0004\b]\u0010^\u001A\u0004\b_\u0010`R\"\u00102\u001A\u0002018\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bb\u0010c\u001A\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010n\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bh\u0010i\u001A\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010r\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bo\u0010i\u001A\u0004\bp\u0010k\"\u0004\bq\u0010m\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006s"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "<init>", "()V", "", "startX", "startY", "", "args", "getDesignInfo", "(IILjava/lang/String;)Ljava/lang/String;", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measure", "", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "layoutReceiver", "addLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "computeLayoutResult", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "optimizationLevel", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J", "performMeasure", "resetMeasureState$compose_release", "resetMeasureState", "applyRootSize-BRTryo0", "(J)V", "applyRootSize", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "performLayout", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Ljava/util/List;)V", "didMeasures", "Landroidx/compose/foundation/layout/BoxScope;", "", "forcedScaleFactor", "drawDebugBounds", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "parseDesignElements", "(Landroidx/constraintlayout/compose/ConstraintSet;)V", "b", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "layoutInformationReceiver", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "c", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "root", "", "Landroidx/compose/ui/layout/Placeable;", "d", "Ljava/util/Map;", "getPlaceables", "()Ljava/util/Map;", "placeables", "Landroidx/constraintlayout/core/state/WidgetFrame;", "f", "getFrameCache", "frameCache", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "setMeasureScope", "(Landroidx/compose/ui/layout/MeasureScope;)V", "Landroidx/constraintlayout/compose/State;", "g", "Lkotlin/Lazy;", "getState", "()Landroidx/constraintlayout/compose/State;", "state", "j", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "k", "I", "getLayoutCurrentWidth", "()I", "setLayoutCurrentWidth", "(I)V", "layoutCurrentWidth", "l", "getLayoutCurrentHeight", "setLayoutCurrentHeight", "layoutCurrentHeight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@PublishedApi
public class Measurer implements DesignInfoProvider, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[DimensionBehaviour.values().length];
            arr_v[DimensionBehaviour.FIXED.ordinal()] = 1;
            arr_v[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            arr_v[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            arr_v[DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public String a;
    public LayoutInformationReceiver b;
    public final ConstraintWidgetContainer c;
    public final LinkedHashMap d;
    protected Density density;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final Lazy g;
    public final int[] h;
    public final int[] i;
    public float j;
    public int k;
    public int l;
    public final ArrayList m;
    protected MeasureScope measureScope;

    public Measurer() {
        this.a = "";
        ConstraintWidgetContainer constraintWidgetContainer0 = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer0.setMeasurer(this);
        this.c = constraintWidgetContainer0;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        b b0 = new b(this, 18);
        this.g = c.lazy(LazyThreadSafetyMode.NONE, b0);
        this.h = new int[2];
        this.i = new int[2];
        this.j = NaNf;
        this.m = new ArrayList();
    }

    public static long a(long v, String s) {
        if(s != null && StringsKt__StringsKt.startsWith$default(s, '#', false, 2, null)) {
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
            if(s1.length() == 6) {
                s1 = "FF" + s1;
            }
            try {
                return ColorKt.Color(((int)Long.parseLong(s1, 16)));
            }
            catch(Exception unused_ex) {
            }
        }
        return v;
    }

    public final void addLayoutInformationReceiver(@Nullable LayoutInformationReceiver layoutInformationReceiver0) {
        this.b = layoutInformationReceiver0;
        if(layoutInformationReceiver0 != null) {
            layoutInformationReceiver0.setLayoutInformation(this.a);
        }
    }

    public final void applyRootSize-BRTryo0(long v) {
        ConstraintWidgetContainer constraintWidgetContainer0 = this.c;
        constraintWidgetContainer0.setWidth(Constraints.getMaxWidth-impl(v));
        constraintWidgetContainer0.setHeight(Constraints.getMaxHeight-impl(v));
        this.j = NaNf;
        LayoutInformationReceiver layoutInformationReceiver0 = this.b;
        float f = 1.0f;
        if(layoutInformationReceiver0 != null) {
            Integer integer0 = layoutInformationReceiver0 == null ? null : layoutInformationReceiver0.getForcedWidth();
            if(integer0 == null || ((int)integer0) != 0x80000000) {
                LayoutInformationReceiver layoutInformationReceiver1 = this.b;
                Intrinsics.checkNotNull(layoutInformationReceiver1);
                int v1 = layoutInformationReceiver1.getForcedWidth();
                this.j = v1 > constraintWidgetContainer0.getWidth() ? ((float)constraintWidgetContainer0.getWidth()) / ((float)v1) : 1.0f;
                constraintWidgetContainer0.setWidth(v1);
            }
        }
        LayoutInformationReceiver layoutInformationReceiver2 = this.b;
        if(layoutInformationReceiver2 != null) {
            Integer integer1 = layoutInformationReceiver2.getForcedHeight();
            if(integer1 == null || ((int)integer1) != 0x80000000) {
                LayoutInformationReceiver layoutInformationReceiver3 = this.b;
                Intrinsics.checkNotNull(layoutInformationReceiver3);
                int v2 = layoutInformationReceiver3.getForcedHeight();
                if(Float.isNaN(this.j)) {
                    this.j = 1.0f;
                }
                if(v2 > constraintWidgetContainer0.getHeight()) {
                    f = ((float)constraintWidgetContainer0.getHeight()) / ((float)v2);
                }
                if(f < this.j) {
                    this.j = f;
                }
                constraintWidgetContainer0.setHeight(v2);
            }
        }
        this.k = constraintWidgetContainer0.getWidth();
        this.l = constraintWidgetContainer0.getHeight();
    }

    public static TextStyle b(HashMap hashMap0) {
        String s = (String)hashMap0.get("size");
        long v = s == null ? 0x7FC00000L : TextUnitKt.getSp(Float.parseFloat(s));
        return new TextStyle(Measurer.a(0xFF00000000000000L, ((String)hashMap0.get("color"))), v, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 0x3FFFC, null);
    }

    public static void c(DimensionBehaviour constraintWidget$DimensionBehaviour0, int v, int v1, int v2, boolean z, boolean z1, int v3, int[] arr_v) {
        switch(WhenMappings.$EnumSwitchMapping$0[constraintWidget$DimensionBehaviour0.ordinal()]) {
            case 1: {
                arr_v[0] = v;
                arr_v[1] = v;
                return;
            }
            case 2: {
                arr_v[0] = 0;
                arr_v[1] = v3;
                return;
            }
            case 3: {
                boolean z2 = z1 || (v2 == Measure.TRY_GIVEN_DIMENSIONS || v2 == Measure.USE_GIVEN_DIMENSIONS) && (v2 == Measure.USE_GIVEN_DIMENSIONS || v1 != 1 || z);
                arr_v[0] = z2 ? v : 0;
                if(!z2) {
                    v = v3;
                }
                arr_v[1] = v;
                return;
            }
            case 4: {
                arr_v[0] = v3;
                arr_v[1] = v3;
                return;
            }
            default: {
                throw new IllegalStateException((constraintWidget$DimensionBehaviour0 + " is not supported").toString());
            }
        }
    }

    public void computeLayoutResult() {
        StringBuilder stringBuilder0 = a5.b.t("{   root: {interpolated: { left:  0,  top:  0,");
        stringBuilder0.append("  right:   " + this.c.getWidth() + " ,");
        stringBuilder0.append("  bottom:  " + this.c.getHeight() + " ,");
        stringBuilder0.append(" } }");
        Iterator iterator0 = this.c.getChildren().iterator();
        while(iterator0.hasNext()) {
            WidgetFrame widgetFrame0 = null;
            Object object0 = iterator0.next();
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            Object object1 = constraintWidget0.getCompanionWidget();
            if(object1 instanceof Measurable) {
                if(constraintWidget0.stringId == null) {
                    Object object2 = LayoutIdKt.getLayoutId(((Measurable)object1));
                    if(object2 == null) {
                        object2 = ConstraintLayoutTagKt.getConstraintLayoutId(((Measurable)object1));
                    }
                    constraintWidget0.stringId = object2 == null ? null : object2.toString();
                }
                WidgetFrame widgetFrame1 = (WidgetFrame)this.f.get(object1);
                if(widgetFrame1 != null) {
                    ConstraintWidget constraintWidget1 = widgetFrame1.widget;
                    if(constraintWidget1 != null) {
                        widgetFrame0 = constraintWidget1.frame;
                    }
                }
                if(widgetFrame0 != null) {
                    stringBuilder0.append(" " + constraintWidget0.stringId + ": {");
                    stringBuilder0.append(" interpolated : ");
                    widgetFrame0.serialize(stringBuilder0, true);
                    stringBuilder0.append("}, ");
                }
            }
            else {
                if(!(constraintWidget0 instanceof Guideline)) {
                    continue;
                }
                stringBuilder0.append(" " + constraintWidget0.stringId + ": {");
                if(((Guideline)constraintWidget0).getOrientation() == 0) {
                    stringBuilder0.append(" type: \'hGuideline\', ");
                }
                else {
                    stringBuilder0.append(" type: \'vGuideline\', ");
                }
                stringBuilder0.append(" interpolated: ");
                stringBuilder0.append(" { left: " + ((Guideline)constraintWidget0).getX() + ", top: " + ((Guideline)constraintWidget0).getY() + ", right: " + (((Guideline)constraintWidget0).getWidth() + ((Guideline)constraintWidget0).getX()) + ", bottom: " + (((Guideline)constraintWidget0).getHeight() + ((Guideline)constraintWidget0).getY()) + " }");
                stringBuilder0.append("}, ");
            }
        }
        stringBuilder0.append(" }");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "json.toString()");
        this.a = s;
        LayoutInformationReceiver layoutInformationReceiver0 = this.b;
        if(layoutInformationReceiver0 != null) {
            layoutInformationReceiver0.setLayoutInformation(s);
        }
    }

    @Composable
    public final void createDesignElements(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF4E11063);
        for(Object object0: this.m) {
            DesignElement designElement0 = (DesignElement)object0;
            String s = designElement0.getId();
            Function4 function40 = (Function4)DesignElements.INSTANCE.getMap().get(designElement0.getType());
            if(function40 == null) {
                composer1.startReplaceableGroup(0xF4E1116A);
                switch(designElement0.getType()) {
                    case "box": {
                        composer1.startReplaceableGroup(-186575900);
                        String s3 = (String)designElement0.getParams().get("text");
                        if(s3 == null) {
                            s3 = "";
                        }
                        long v2 = Measurer.a(0xFFCCCCCC00000000L, ((String)designElement0.getParams().get("backgroundColor")));
                        Companion modifier$Companion0 = Modifier.Companion;
                        Modifier modifier1 = BackgroundKt.background-bw27NRU$default(ConstraintLayoutTagKt.layoutId$default(modifier$Companion0, s, null, 2, null), v2, null, 2, null);
                        composer1.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, 0x520574F7);
                        Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                        Function0 function00 = composeUiNode$Companion0.getConstructor();
                        Function3 function30 = LayoutKt.materializerOf(modifier1);
                        if(composer1.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer1.startReusableNode();
                        if(composer1.getInserting()) {
                            composer1.createNode(function00);
                        }
                        else {
                            composer1.useNode();
                        }
                        composer1.disableReusing();
                        Updater.set-impl(composer1, measurePolicy0, composeUiNode$Companion0.getSetMeasurePolicy());
                        Updater.set-impl(composer1, density0, composeUiNode$Companion0.getSetDensity());
                        Updater.set-impl(composer1, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
                        composer1.enableReusing();
                        a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                        composer1.startReplaceableGroup(-1253629305);
                        BasicTextKt.BasicText-BpD7jsM(s3, PaddingKt.padding-3ABfNKs(modifier$Companion0, 8.0f), Measurer.b(designElement0.getParams()), null, 0, false, 0, composer1, 0x8030, 120);
                        composer1.endReplaceableGroup();
                        composer1.endReplaceableGroup();
                        composer1.endNode();
                        composer1.endReplaceableGroup();
                        composer1.endReplaceableGroup();
                        composer1.endReplaceableGroup();
                        break;
                    }
                    case "button": {
                        composer1.startReplaceableGroup(0xF4E111B2);
                        String s1 = (String)designElement0.getParams().get("text");
                        if(s1 == null) {
                            s1 = "text";
                        }
                        long v1 = Measurer.a(0xFFCCCCCC00000000L, ((String)designElement0.getParams().get("backgroundColor")));
                        BasicTextKt.BasicText-BpD7jsM(s1, PaddingKt.padding-3ABfNKs(BackgroundKt.background-bw27NRU$default(ClipKt.clip(ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, s, null, 2, null), RoundedCornerShapeKt.RoundedCornerShape(20)), v1, null, 2, null), 8.0f), Measurer.b(designElement0.getParams()), null, 0, false, 0, composer1, 0x8000, 120);
                        composer1.endReplaceableGroup();
                        break;
                    }
                    case "image": {
                        composer1.startReplaceableGroup(0xF4E118B5);
                        Modifier modifier2 = ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, s, null, 2, null);
                        ImageKt.Image(PainterResources_androidKt.painterResource(0x108003F, composer1, 0), "Placeholder Image", modifier2, null, null, 0.0f, null, composer1, 56, 120);
                        composer1.endReplaceableGroup();
                        break;
                    }
                    case "text": {
                        composer1.startReplaceableGroup(0xF4E1164F);
                        String s4 = (String)designElement0.getParams().get("text");
                        if(s4 == null) {
                            s4 = "text";
                        }
                        BasicTextKt.BasicText-BpD7jsM(s4, ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, s, null, 2, null), Measurer.b(designElement0.getParams()), null, 0, false, 0, composer1, 0x8000, 120);
                        composer1.endReplaceableGroup();
                        break;
                    }
                    case "textfield": {
                        composer1.startReplaceableGroup(-186575007);
                        String s2 = (String)designElement0.getParams().get("text");
                        if(s2 == null) {
                            s2 = "text";
                        }
                        Modifier modifier0 = ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, s, null, 2, null);
                        BasicTextFieldKt.BasicTextField(s2, d0.w, modifier0, false, false, null, null, null, false, 0, null, null, null, null, null, composer1, 0, 0, 0x7FF8);
                        composer1.endReplaceableGroup();
                        break;
                    }
                    default: {
                        composer1.startReplaceableGroup(0xF4E119FA);
                        composer1.endReplaceableGroup();
                    }
                }
            }
            else {
                composer1.startReplaceableGroup(-186576600);
                function40.invoke(s, designElement0.getParams(), composer1, 0x40);
            }
            composer1.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 3));
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public void didMeasures() {
    }

    @Composable
    public final void drawDebugBounds(@NotNull BoxScope boxScope0, float f, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(boxScope0, "<this>");
        Composer composer1 = composer0.startRestartGroup(-756996390);
        CanvasKt.Canvas(boxScope0.matchParentSize(Modifier.Companion), new y3(this, f, 1), composer1, 0);
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j1(this, boxScope0, f, v, 2));
        }
    }

    @NotNull
    public final Density getDensity() {
        Density density0 = this.density;
        if(density0 != null) {
            return density0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("density");
        throw null;
    }

    @Override  // androidx.constraintlayout.compose.DesignInfoProvider
    @NotNull
    public String getDesignInfo(int v, int v1, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "args");
        State state0 = this.getState();
        return ToolingUtilsKt.parseConstraintsToJson(this.c, state0, v, v1, s);
    }

    public final float getForcedScaleFactor() {
        return this.j;
    }

    @NotNull
    public final Map getFrameCache() {
        return this.f;
    }

    public final int getLayoutCurrentHeight() {
        return this.l;
    }

    public final int getLayoutCurrentWidth() {
        return this.k;
    }

    @Nullable
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.b;
    }

    @NotNull
    public final MeasureScope getMeasureScope() {
        MeasureScope measureScope0 = this.measureScope;
        if(measureScope0 != null) {
            return measureScope0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("measureScope");
        throw null;
    }

    @NotNull
    public final Map getPlaceables() {
        return this.d;
    }

    @NotNull
    public final ConstraintWidgetContainer getRoot() {
        return this.c;
    }

    @NotNull
    public final State getState() {
        return (State)this.g.getValue();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public void measure(@NotNull ConstraintWidget constraintWidget0, @NotNull Measure basicMeasure$Measure0) {
        boolean z1;
        int v7;
        int v3;
        Intrinsics.checkNotNullParameter(constraintWidget0, "constraintWidget");
        Intrinsics.checkNotNullParameter(basicMeasure$Measure0, "measure");
        Object object0 = constraintWidget0.getCompanionWidget();
        if(!(object0 instanceof Measurable)) {
            return;
        }
        LinkedHashMap linkedHashMap0 = this.e;
        Integer[] arr_integer = (Integer[])linkedHashMap0.get(object0);
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = basicMeasure$Measure0.horizontalBehavior;
        Intrinsics.checkNotNullExpressionValue(constraintWidget$DimensionBehaviour0, "measure.horizontalBehavior");
        int v = basicMeasure$Measure0.horizontalDimension;
        int v1 = constraintWidget0.mMatchConstraintDefaultWidth;
        int v2 = basicMeasure$Measure0.measureStrategy;
        if(arr_integer == null) {
            v3 = 0;
        }
        else {
            Integer integer0 = arr_integer[1];
            v3 = integer0 == null ? 0 : ((int)integer0);
        }
        boolean z = false;
        Measurer.c(constraintWidget$DimensionBehaviour0, v, v1, v2, v3 == constraintWidget0.getHeight(), constraintWidget0.isResolvedHorizontally(), Constraints.getMaxWidth-impl(this.getState().getRootIncomingConstraints-msEJaDk()), this.h);
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = basicMeasure$Measure0.verticalBehavior;
        Intrinsics.checkNotNullExpressionValue(constraintWidget$DimensionBehaviour1, "measure.verticalBehavior");
        int v4 = basicMeasure$Measure0.verticalDimension;
        int v5 = constraintWidget0.mMatchConstraintDefaultHeight;
        int v6 = basicMeasure$Measure0.measureStrategy;
        if(arr_integer == null) {
            v7 = 0;
        }
        else {
            Integer integer1 = arr_integer[0];
            v7 = integer1 == null ? 0 : ((int)integer1);
        }
        Measurer.c(constraintWidget$DimensionBehaviour1, v4, v5, v6, v7 == constraintWidget0.getWidth(), constraintWidget0.isResolvedVertically(), Constraints.getMaxHeight-impl(this.getState().getRootIncomingConstraints-msEJaDk()), this.i);
        long v8 = ConstraintsKt.Constraints(this.h[0], this.h[1], this.i[0], this.i[1]);
        Integer integer2 = null;
        if(basicMeasure$Measure0.measureStrategy == Measure.TRY_GIVEN_DIMENSIONS || basicMeasure$Measure0.measureStrategy == Measure.USE_GIVEN_DIMENSIONS || (basicMeasure$Measure0.horizontalBehavior != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget0.mMatchConstraintDefaultWidth != 0 || basicMeasure$Measure0.verticalBehavior != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget0.mMatchConstraintDefaultHeight != 0)) {
            Placeable placeable0 = ((Measurable)object0).measure-BRTryo0(v8);
            this.getPlaceables().put(object0, placeable0);
            constraintWidget0.setMeasureRequested(false);
            int v9 = ((Number)kotlin.ranges.c.coerceIn(placeable0.getWidth(), (constraintWidget0.mMatchConstraintMinWidth > 0 ? constraintWidget0.mMatchConstraintMinWidth : null), (constraintWidget0.mMatchConstraintMaxWidth > 0 ? constraintWidget0.mMatchConstraintMaxWidth : null))).intValue();
            int v10 = ((Number)kotlin.ranges.c.coerceIn(placeable0.getHeight(), (constraintWidget0.mMatchConstraintMinHeight > 0 ? constraintWidget0.mMatchConstraintMinHeight : null), (constraintWidget0.mMatchConstraintMaxHeight <= 0 ? null : constraintWidget0.mMatchConstraintMaxHeight))).intValue();
            if(v9 == placeable0.getWidth()) {
                z1 = false;
            }
            else {
                v8 = ConstraintsKt.Constraints(v9, v9, Constraints.getMinHeight-impl(v8), Constraints.getMaxHeight-impl(v8));
                z1 = true;
            }
            if(v10 != placeable0.getHeight()) {
                v8 = ConstraintsKt.Constraints(Constraints.getMinWidth-impl(v8), Constraints.getMaxWidth-impl(v8), v10, v10);
                z1 = true;
            }
            if(z1) {
                this.getPlaceables().put(object0, ((Measurable)object0).measure-BRTryo0(v8));
                constraintWidget0.setMeasureRequested(false);
            }
        }
        Placeable placeable1 = (Placeable)this.d.get(object0);
        Integer integer3 = placeable1 == null ? null : placeable1.getWidth();
        basicMeasure$Measure0.measuredWidth = integer3 == null ? constraintWidget0.getWidth() : ((int)integer3);
        if(placeable1 != null) {
            integer2 = placeable1.getHeight();
        }
        basicMeasure$Measure0.measuredHeight = integer2 == null ? constraintWidget0.getHeight() : ((int)integer2);
        int v11 = placeable1 == null || !this.getState().isBaselineNeeded$compose_release(constraintWidget0) ? 0x80000000 : placeable1.get(AlignmentLineKt.getFirstBaseline());
        basicMeasure$Measure0.measuredHasBaseline = v11 != 0x80000000;
        basicMeasure$Measure0.measuredBaseline = v11;
        Integer[] arr_integer1 = linkedHashMap0.get(object0);
        if(arr_integer1 == null) {
            arr_integer1 = new Integer[]{0, 0, 0x80000000};
            linkedHashMap0.put(object0, arr_integer1);
        }
        arr_integer1[0] = basicMeasure$Measure0.measuredWidth;
        arr_integer1[1] = basicMeasure$Measure0.measuredHeight;
        arr_integer1[2] = basicMeasure$Measure0.measuredBaseline;
        if(basicMeasure$Measure0.measuredWidth != basicMeasure$Measure0.horizontalDimension || basicMeasure$Measure0.measuredHeight != basicMeasure$Measure0.verticalDimension) {
            z = true;
        }
        basicMeasure$Measure0.measuredNeedsSolverPass = z;
    }

    public final void parseDesignElements(@NotNull ConstraintSet constraintSet0) {
        Intrinsics.checkNotNullParameter(constraintSet0, "constraintSet");
        if(constraintSet0 instanceof JSONConstraintSet) {
            ((JSONConstraintSet)constraintSet0).emitDesignElements(this.m);
        }
    }

    public final void performLayout(@NotNull PlacementScope placeable$PlacementScope0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        LinkedHashMap linkedHashMap0 = this.f;
        if(linkedHashMap0.isEmpty()) {
            for(Object object0: this.c.getChildren()) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
                Object object1 = constraintWidget0.getCompanionWidget();
                if(object1 instanceof Measurable) {
                    linkedHashMap0.put(object1, new WidgetFrame(constraintWidget0.frame.update()));
                }
            }
        }
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Measurable measurable0 = (Measurable)list0.get(v1);
                WidgetFrame widgetFrame0 = (WidgetFrame)this.getFrameCache().get(measurable0);
                if(widgetFrame0 == null) {
                    return;
                }
                if(widgetFrame0.isDefaultTransform()) {
                    WidgetFrame widgetFrame1 = (WidgetFrame)this.getFrameCache().get(measurable0);
                    Intrinsics.checkNotNull(widgetFrame1);
                    int v2 = widgetFrame1.left;
                    WidgetFrame widgetFrame2 = (WidgetFrame)this.getFrameCache().get(measurable0);
                    Intrinsics.checkNotNull(widgetFrame2);
                    int v3 = widgetFrame2.top;
                    Placeable placeable0 = (Placeable)this.getPlaceables().get(measurable0);
                    if(placeable0 != null) {
                        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, placeable0, IntOffsetKt.IntOffset(v2, v3), 0.0f, 2, null);
                    }
                }
                else {
                    g1 g10 = new g1(widgetFrame0, 11);
                    WidgetFrame widgetFrame3 = (WidgetFrame)this.getFrameCache().get(measurable0);
                    Intrinsics.checkNotNull(widgetFrame3);
                    int v4 = widgetFrame3.left;
                    WidgetFrame widgetFrame4 = (WidgetFrame)this.getFrameCache().get(measurable0);
                    Intrinsics.checkNotNull(widgetFrame4);
                    int v5 = widgetFrame4.top;
                    float f = Float.isNaN(widgetFrame0.translationZ) ? 0.0f : widgetFrame0.translationZ;
                    Placeable placeable1 = (Placeable)this.getPlaceables().get(measurable0);
                    if(placeable1 != null) {
                        placeable$PlacementScope0.placeWithLayer(placeable1, v4, v5, f, g10);
                    }
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        if((this.b == null ? null : this.b.getLayoutInformationMode()) == LayoutInfoFlags.BOUNDS) {
            this.computeLayoutResult();
        }
    }

    public final long performMeasure-DjhGOtQ(long v, @NotNull LayoutDirection layoutDirection0, @NotNull ConstraintSet constraintSet0, @NotNull List list0, int v1, @NotNull MeasureScope measureScope0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSet0, "constraintSet");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        Intrinsics.checkNotNullParameter(measureScope0, "measureScope");
        this.setDensity(measureScope0);
        this.setMeasureScope(measureScope0);
        this.getState().width((Constraints.getHasFixedWidth-impl(v) ? Dimension.Fixed(Constraints.getMaxWidth-impl(v)) : Dimension.Wrap().min(Constraints.getMinWidth-impl(v))));
        this.getState().height((Constraints.getHasFixedHeight-impl(v) ? Dimension.Fixed(Constraints.getMaxHeight-impl(v)) : Dimension.Wrap().min(Constraints.getMinHeight-impl(v))));
        this.getState().setRootIncomingConstraints-BRTryo0(v);
        this.getState().setLayoutDirection(layoutDirection0);
        this.resetMeasureState$compose_release();
        boolean z = constraintSet0.isDirty(list0);
        ConstraintWidgetContainer constraintWidgetContainer0 = this.c;
        if(z) {
            this.getState().reset();
            constraintSet0.applyTo(this.getState(), list0);
            ConstraintLayoutKt.buildMapping(this.getState(), list0);
            this.getState().apply(constraintWidgetContainer0);
        }
        else {
            ConstraintLayoutKt.buildMapping(this.getState(), list0);
        }
        this.applyRootSize-BRTryo0(v);
        constraintWidgetContainer0.updateHierarchy();
        constraintWidgetContainer0.setOptimizationLevel(v1);
        constraintWidgetContainer0.measure(constraintWidgetContainer0.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        for(Object object0: constraintWidgetContainer0.getChildren()) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            Object object1 = constraintWidget0.getCompanionWidget();
            if(object1 instanceof Measurable) {
                Placeable placeable0 = (Placeable)this.d.get(object1);
                Integer integer0 = placeable0 == null ? null : placeable0.getWidth();
                Integer integer1 = placeable0 == null ? null : placeable0.getHeight();
                if(integer0 == null || constraintWidget0.getWidth() != ((int)integer0) || (integer1 == null || constraintWidget0.getHeight() != ((int)integer1))) {
                    int v2 = constraintWidget0.getWidth();
                    int v3 = constraintWidget0.getHeight();
                    this.getPlaceables().put(object1, ((Measurable)object1).measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(v2, v3)));
                }
            }
        }
        return IntSizeKt.IntSize(constraintWidgetContainer0.getWidth(), constraintWidgetContainer0.getHeight());
    }

    public final void resetMeasureState$compose_release() {
        this.d.clear();
        this.e.clear();
        this.f.clear();
    }

    public final void setDensity(@NotNull Density density0) {
        Intrinsics.checkNotNullParameter(density0, "<set-?>");
        this.density = density0;
    }

    public final void setForcedScaleFactor(float f) {
        this.j = f;
    }

    public final void setLayoutCurrentHeight(int v) {
        this.l = v;
    }

    public final void setLayoutCurrentWidth(int v) {
        this.k = v;
    }

    public final void setLayoutInformationReceiver(@Nullable LayoutInformationReceiver layoutInformationReceiver0) {
        this.b = layoutInformationReceiver0;
    }

    public final void setMeasureScope(@NotNull MeasureScope measureScope0) {
        Intrinsics.checkNotNullParameter(measureScope0, "<set-?>");
        this.measureScope = measureScope0;
    }
}

