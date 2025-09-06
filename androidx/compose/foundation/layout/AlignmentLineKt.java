package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001A2\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A2\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\t2\b\b\u0002\u0010\u0005\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A*\u0010\u0010\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A*\u0010\u0010\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", "before", "after", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "paddingFrom", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
public final class AlignmentLineKt {
    public static final MeasureResult access$alignmentLineOffsetMeasure-tjqqzMA(MeasureScope measureScope0, AlignmentLine alignmentLine0, float f, float f1, Measurable measurable0, long v) {
        int v7;
        Placeable placeable0 = measurable0.measure-BRTryo0((alignmentLine0 instanceof HorizontalAlignmentLine ? Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 11, null) : Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 14, null)));
        int v1 = placeable0.get(alignmentLine0);
        if(v1 == 0x80000000) {
            v1 = 0;
        }
        int v2 = alignmentLine0 instanceof HorizontalAlignmentLine ? placeable0.getHeight() : placeable0.getWidth();
        int v3 = (alignmentLine0 instanceof HorizontalAlignmentLine ? Constraints.getMaxHeight-impl(v) : Constraints.getMaxWidth-impl(v)) - v2;
        int v4 = c.coerceIn((Dp.equals-impl0(f, NaNf) ? 0 : measureScope0.roundToPx-0680j_4(f)) - v1, 0, v3);
        int v5 = c.coerceIn((Dp.equals-impl0(f1, NaNf) ? 0 : measureScope0.roundToPx-0680j_4(f1)) - v2 + v1, 0, v3 - v4);
        int v6 = alignmentLine0 instanceof HorizontalAlignmentLine ? placeable0.getWidth() : Math.max(placeable0.getWidth() + v4 + v5, Constraints.getMinWidth-impl(v));
        if(alignmentLine0 instanceof HorizontalAlignmentLine) {
            v7 = Math.max(placeable0.getHeight() + v4 + v5, Constraints.getMinHeight-impl(v));
            return MeasureScope.layout$default(measureScope0, v6, v7, null, new b(alignmentLine0, f, v4, v6, v5, placeable0, v7), 4, null);
        }
        v7 = placeable0.getHeight();
        return MeasureScope.layout$default(measureScope0, v6, v7, null, new b(alignmentLine0, f, v4, v6, v5, placeable0, v7), 4, null);
    }

    public static final boolean access$getHorizontal(AlignmentLine alignmentLine0) {
        return alignmentLine0 instanceof HorizontalAlignmentLine;
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier paddingFrom-4j6BHR0(@NotNull Modifier modifier0, @NotNull AlignmentLine alignmentLine0, float f, float f1) {
        return modifier0.then(new AlignmentLineOffsetDpElement(alignmentLine0, f, f1, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,178:1\n76#2,5:179\n*E\n"})
        public final class androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-4j6BHR0..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final AlignmentLine w;
            public final float x;
            public final float y;

            public androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-4j6BHR0..inlined.debugInspectorInfo.1(AlignmentLine alignmentLine0, float f, float f1) {
                this.w = alignmentLine0;
                this.x = f;
                this.y = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("paddingFrom");
                inspectorInfo0.getProperties().set("alignmentLine", this.w);
                a.j(this.x, inspectorInfo0.getProperties(), "before", inspectorInfo0).set("after", Dp.box-impl(this.y));
            }
        }

    }

    public static Modifier paddingFrom-4j6BHR0$default(Modifier modifier0, AlignmentLine alignmentLine0, float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f = NaNf;
        }
        if((v & 4) != 0) {
            f1 = NaNf;
        }
        return AlignmentLineKt.paddingFrom-4j6BHR0(modifier0, alignmentLine0, f, f1);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier paddingFrom-Y_r0B1c(@NotNull Modifier modifier0, @NotNull AlignmentLine alignmentLine0, long v, long v1) {
        return modifier0.then(new AlignmentLineOffsetTextUnitElement(alignmentLine0, v, v1, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,178:1\n122#2,5:179\n*E\n"})
        public final class androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-Y_r0B1c..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final AlignmentLine w;
            public final long x;
            public final long y;

            public androidx.compose.foundation.layout.AlignmentLineKt.paddingFrom-Y_r0B1c..inlined.debugInspectorInfo.1(AlignmentLine alignmentLine0, long v, long v1) {
                this.w = alignmentLine0;
                this.x = v;
                this.y = v1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("paddingFrom");
                inspectorInfo0.getProperties().set("alignmentLine", this.w);
                inspectorInfo0.getProperties().set("before", TextUnit.box-impl(this.x));
                inspectorInfo0.getProperties().set("after", TextUnit.box-impl(this.y));
            }
        }

    }

    public static Modifier paddingFrom-Y_r0B1c$default(Modifier modifier0, AlignmentLine alignmentLine0, long v, long v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0x7FC00000L;
        }
        if((v2 & 4) != 0) {
            v1 = 0x7FC00000L;
        }
        return AlignmentLineKt.paddingFrom-Y_r0B1c(modifier0, alignmentLine0, v, v1);
    }

    @Stable
    @NotNull
    public static final Modifier paddingFromBaseline-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        Modifier modifier1 = Dp.equals-impl0(f, NaNf) ? Modifier.Companion : AlignmentLineKt.paddingFrom-4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        Modifier modifier2 = modifier0.then(modifier1);
        return Dp.equals-impl0(f1, NaNf) ? modifier2.then(Modifier.Companion) : modifier2.then(AlignmentLineKt.paddingFrom-4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f1, 2, null));
    }

    public static Modifier paddingFromBaseline-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return AlignmentLineKt.paddingFromBaseline-VpY3zN4(modifier0, f, f1);
    }

    @Stable
    @NotNull
    public static final Modifier paddingFromBaseline-wCyjxdI(@NotNull Modifier modifier0, long v, long v1) {
        Modifier modifier1 = TextUnitKt.isUnspecified--R2X_6o(v) ? Modifier.Companion : AlignmentLineKt.paddingFrom-Y_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), v, 0L, 4, null);
        Modifier modifier2 = modifier0.then(modifier1);
        return TextUnitKt.isUnspecified--R2X_6o(v1) ? modifier2.then(Modifier.Companion) : modifier2.then(AlignmentLineKt.paddingFrom-Y_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, v1, 2, null));
    }

    public static Modifier paddingFromBaseline-wCyjxdI$default(Modifier modifier0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0x7FC00000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x7FC00000L;
        }
        return AlignmentLineKt.paddingFromBaseline-wCyjxdI(modifier0, v, v1);
    }
}

