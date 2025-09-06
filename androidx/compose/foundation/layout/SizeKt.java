package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u001E\u0010\u0002\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A\u001E\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0004\u001A\u001E\u0010\u0007\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\b\u0010\u0004\u001A&\u0010\u0007\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\n\u001A\u001E\u0010\u0007\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\r\u001A*\u0010\u0011\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\n\u001A*\u0010\u0013\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\n\u001A>\u0010\u001A\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0015\u001A\u00020\u00012\b\b\u0002\u0010\u0016\u001A\u00020\u00012\b\b\u0002\u0010\u0017\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u001E\u0010\u001C\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0004\u001A\u001E\u0010\u001E\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u0004\u001A\u001E\u0010 \u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u0004\u001A&\u0010 \u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\n\u001A\u001E\u0010 \u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\r\u001A*\u0010$\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010\n\u001A*\u0010&\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010\n\u001A>\u0010(\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0015\u001A\u00020\u00012\b\b\u0002\u0010\u0016\u001A\u00020\u00012\b\b\u0002\u0010\u0017\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010\u0019\u001A\u001D\u0010+\u001A\u00020\u0000*\u00020\u00002\b\b\u0003\u0010*\u001A\u00020)H\u0007\u00A2\u0006\u0004\b+\u0010\u0004\u001A\u001D\u0010,\u001A\u00020\u0000*\u00020\u00002\b\b\u0003\u0010*\u001A\u00020)H\u0007\u00A2\u0006\u0004\b,\u0010\u0004\u001A\u001D\u0010-\u001A\u00020\u0000*\u00020\u00002\b\b\u0003\u0010*\u001A\u00020)H\u0007\u00A2\u0006\u0004\b-\u0010\u0004\u001A\'\u00102\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001A\u00020.2\b\b\u0002\u00101\u001A\u000200H\u0007\u00A2\u0006\u0004\b2\u00103\u001A\'\u00105\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001A\u0002042\b\b\u0002\u00101\u001A\u000200H\u0007\u00A2\u0006\u0004\b5\u00106\u001A\'\u00108\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001A\u0002072\b\b\u0002\u00101\u001A\u000200H\u0007\u00A2\u0006\u0004\b8\u00109\u001A*\u0010;\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0015\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010\n\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006<"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", "size", "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "min", "max", "widthIn-VpY3zN4", "widthIn", "heightIn-VpY3zN4", "heightIn", "minWidth", "minHeight", "maxWidth", "maxHeight", "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "sizeIn", "requiredWidth-3ABfNKs", "requiredWidth", "requiredHeight-3ABfNKs", "requiredHeight", "requiredSize-3ABfNKs", "requiredSize", "requiredSize-VpY3zN4", "requiredSize-6HolHcs", "requiredWidthIn-VpY3zN4", "requiredWidthIn", "requiredHeightIn-VpY3zN4", "requiredHeightIn", "requiredSizeIn-qDBjuR0", "requiredSizeIn", "", "fraction", "fillMaxWidth", "fillMaxHeight", "fillMaxSize", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "wrapContentWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "wrapContentHeight", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "wrapContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/Modifier;", "defaultMinSize-VpY3zN4", "defaultMinSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1112:1\n135#2:1113\n135#2:1114\n135#2:1115\n135#2:1116\n135#2:1117\n135#2:1118\n135#2:1119\n135#2:1120\n135#2:1121\n135#2:1122\n135#2:1123\n135#2:1124\n135#2:1125\n135#2:1126\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1113\n85#1:1114\n111#1:1115\n138#1:1116\n176#1:1117\n199#1:1118\n226#1:1119\n257#1:1120\n285#1:1121\n315#1:1122\n342#1:1123\n381#1:1124\n405#1:1125\n434#1:1126\n*E\n"})
public final class SizeKt {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        SizeKt.a = FillElement.e.width(1.0f);
        SizeKt.b = FillElement.e.height(1.0f);
        SizeKt.c = FillElement.e.size(1.0f);
        SizeKt.d = WrapContentElement.g.width(Alignment.Companion.getCenterHorizontally(), false);
        SizeKt.e = WrapContentElement.g.width(Alignment.Companion.getStart(), false);
        SizeKt.f = WrapContentElement.g.height(Alignment.Companion.getCenterVertically(), false);
        SizeKt.g = WrapContentElement.g.height(Alignment.Companion.getTop(), false);
        SizeKt.h = WrapContentElement.g.size(Alignment.Companion.getCenter(), false);
        SizeKt.i = WrapContentElement.g.size(Alignment.Companion.getTopStart(), false);
    }

    @Stable
    @NotNull
    public static final Modifier defaultMinSize-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new UnspecifiedConstraintsElement(f, f1));
    }

    public static Modifier defaultMinSize-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.defaultMinSize-VpY3zN4(modifier0, f, f1);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxHeight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return f == 1.0f ? modifier0.then(SizeKt.b) : modifier0.then(FillElement.e.height(f));
    }

    public static Modifier fillMaxHeight$default(Modifier modifier0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return SizeKt.fillMaxHeight(modifier0, f);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxSize(@NotNull Modifier modifier0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return f == 1.0f ? modifier0.then(SizeKt.c) : modifier0.then(FillElement.e.size(f));
    }

    public static Modifier fillMaxSize$default(Modifier modifier0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return SizeKt.fillMaxSize(modifier0, f);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxWidth(@NotNull Modifier modifier0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return f == 1.0f ? modifier0.then(SizeKt.a) : modifier0.then(FillElement.e.width(f));
    }

    public static Modifier fillMaxWidth$default(Modifier modifier0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return SizeKt.fillMaxWidth(modifier0, f);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier height-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new SizeElement(0.0f, f, 0.0f, f, true, InspectableValueKt.getNoInspectorInfo(), 5));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n86#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.height-3ABfNKs..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;

            public androidx.compose.foundation.layout.SizeKt.height-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.w = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("height");
                inspectorInfo0.setValue(Dp.box-impl(this.w));
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier heightIn-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new SizeElement(0.0f, f, 0.0f, f1, true, InspectableValueKt.getNoInspectorInfo(), 5));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n200#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.heightIn-VpY3zN4..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;

            public androidx.compose.foundation.layout.SizeKt.heightIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.w = f;
                this.x = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("heightIn");
                a.j(this.w, inspectorInfo0.getProperties(), "min", inspectorInfo0).set("max", Dp.box-impl(this.x));
            }
        }

    }

    public static Modifier heightIn-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.heightIn-VpY3zN4(modifier0, f, f1);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredHeight-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new SizeElement(0.0f, f, 0.0f, f, false, InspectableValueKt.getNoInspectorInfo(), 5));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n286#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredHeight-3ABfNKs..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;

            public androidx.compose.foundation.layout.SizeKt.requiredHeight-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.w = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredHeight");
                inspectorInfo0.setValue(Dp.box-impl(this.w));
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredHeightIn-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new SizeElement(0.0f, f, 0.0f, f1, false, InspectableValueKt.getNoInspectorInfo(), 5));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n406#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredHeightIn-VpY3zN4..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;

            public androidx.compose.foundation.layout.SizeKt.requiredHeightIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.w = f;
                this.x = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredHeightIn");
                a.j(this.w, inspectorInfo0.getProperties(), "min", inspectorInfo0).set("max", Dp.box-impl(this.x));
            }
        }

    }

    public static Modifier requiredHeightIn-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.requiredHeightIn-VpY3zN4(modifier0, f, f1);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredSize-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new SizeElement(f, f, f, f, false, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n316#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredSize-3ABfNKs..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;

            public androidx.compose.foundation.layout.SizeKt.requiredSize-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.w = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredSize");
                inspectorInfo0.setValue(Dp.box-impl(this.w));
            }
        }

    }

    @Stable
    @NotNull
    public static final Modifier requiredSize-6HolHcs(@NotNull Modifier modifier0, long v) {
        return SizeKt.requiredSize-VpY3zN4(modifier0, DpSize.getWidth-D9Ej5fM(v), DpSize.getHeight-D9Ej5fM(v));
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredSize-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new SizeElement(f, f1, f, f1, false, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n343#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredSize-VpY3zN4..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;

            public androidx.compose.foundation.layout.SizeKt.requiredSize-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.w = f;
                this.x = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredSize");
                a.j(this.w, inspectorInfo0.getProperties(), "width", inspectorInfo0).set("height", Dp.box-impl(this.x));
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredSizeIn-qDBjuR0(@NotNull Modifier modifier0, float f, float f1, float f2, float f3) {
        return modifier0.then(new SizeElement(f, f1, f2, f3, false, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n435#2,6:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredSizeIn-qDBjuR0..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;
            public final float y;
            public final float z;

            public androidx.compose.foundation.layout.SizeKt.requiredSizeIn-qDBjuR0..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3) {
                this.w = f;
                this.x = f1;
                this.y = f2;
                this.z = f3;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredSizeIn");
                ValueElementSequence valueElementSequence0 = a.j(this.w, inspectorInfo0.getProperties(), "minWidth", inspectorInfo0);
                ValueElementSequence valueElementSequence1 = a.j(this.x, valueElementSequence0, "minHeight", inspectorInfo0);
                a.j(this.y, valueElementSequence1, "maxWidth", inspectorInfo0).set("maxHeight", Dp.box-impl(this.z));
            }
        }

    }

    public static Modifier requiredSizeIn-qDBjuR0$default(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        if((v & 4) != 0) {
            f2 = NaNf;
        }
        if((v & 8) != 0) {
            f3 = NaNf;
        }
        return SizeKt.requiredSizeIn-qDBjuR0(modifier0, f, f1, f2, f3);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredWidth-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new SizeElement(f, 0.0f, f, 0.0f, false, InspectableValueKt.getNoInspectorInfo(), 10));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n258#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredWidth-3ABfNKs..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;

            public androidx.compose.foundation.layout.SizeKt.requiredWidth-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.w = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredWidth");
                inspectorInfo0.setValue(Dp.box-impl(this.w));
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredWidthIn-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new SizeElement(f, 0.0f, f1, 0.0f, false, InspectableValueKt.getNoInspectorInfo(), 10));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n382#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredWidthIn-VpY3zN4..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;

            public androidx.compose.foundation.layout.SizeKt.requiredWidthIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.w = f;
                this.x = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredWidthIn");
                a.j(this.w, inspectorInfo0.getProperties(), "min", inspectorInfo0).set("max", Dp.box-impl(this.x));
            }
        }

    }

    public static Modifier requiredWidthIn-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.requiredWidthIn-VpY3zN4(modifier0, f, f1);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier size-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new SizeElement(f, f, f, f, true, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n112#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.size-3ABfNKs..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;

            public androidx.compose.foundation.layout.SizeKt.size-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.w = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("size");
                inspectorInfo0.setValue(Dp.box-impl(this.w));
            }
        }

    }

    @Stable
    @NotNull
    public static final Modifier size-6HolHcs(@NotNull Modifier modifier0, long v) {
        return SizeKt.size-VpY3zN4(modifier0, DpSize.getWidth-D9Ej5fM(v), DpSize.getHeight-D9Ej5fM(v));
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier size-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new SizeElement(f, f1, f, f1, true, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n139#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.size-VpY3zN4..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;

            public androidx.compose.foundation.layout.SizeKt.size-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.w = f;
                this.x = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("size");
                a.j(this.w, inspectorInfo0.getProperties(), "width", inspectorInfo0).set("height", Dp.box-impl(this.x));
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier sizeIn-qDBjuR0(@NotNull Modifier modifier0, float f, float f1, float f2, float f3) {
        return modifier0.then(new SizeElement(f, f1, f2, f3, true, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n227#2,6:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.sizeIn-qDBjuR0..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;
            public final float y;
            public final float z;

            public androidx.compose.foundation.layout.SizeKt.sizeIn-qDBjuR0..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3) {
                this.w = f;
                this.x = f1;
                this.y = f2;
                this.z = f3;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("sizeIn");
                ValueElementSequence valueElementSequence0 = a.j(this.w, inspectorInfo0.getProperties(), "minWidth", inspectorInfo0);
                ValueElementSequence valueElementSequence1 = a.j(this.x, valueElementSequence0, "minHeight", inspectorInfo0);
                a.j(this.y, valueElementSequence1, "maxWidth", inspectorInfo0).set("maxHeight", Dp.box-impl(this.z));
            }
        }

    }

    public static Modifier sizeIn-qDBjuR0$default(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        if((v & 4) != 0) {
            f2 = NaNf;
        }
        if((v & 8) != 0) {
            f3 = NaNf;
        }
        return SizeKt.sizeIn-qDBjuR0(modifier0, f, f1, f2, f3);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier width-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new SizeElement(f, 0.0f, f, 0.0f, true, InspectableValueKt.getNoInspectorInfo(), 10));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n62#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.width-3ABfNKs..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;

            public androidx.compose.foundation.layout.SizeKt.width-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.w = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("width");
                inspectorInfo0.setValue(Dp.box-impl(this.w));
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier widthIn-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new SizeElement(f, 0.0f, f1, 0.0f, true, InspectableValueKt.getNoInspectorInfo(), 10));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,178:1\n177#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.widthIn-VpY3zN4..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final float x;

            public androidx.compose.foundation.layout.SizeKt.widthIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.w = f;
                this.x = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("widthIn");
                a.j(this.w, inspectorInfo0.getProperties(), "min", inspectorInfo0).set("max", Dp.box-impl(this.x));
            }
        }

    }

    public static Modifier widthIn-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.widthIn-VpY3zN4(modifier0, f, f1);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentHeight(@NotNull Modifier modifier0, @NotNull Vertical alignment$Vertical0, boolean z) {
        Companion alignment$Companion0 = Alignment.Companion;
        if(Intrinsics.areEqual(alignment$Vertical0, alignment$Companion0.getCenterVertically()) && !z) {
            return modifier0.then(SizeKt.f);
        }
        return !Intrinsics.areEqual(alignment$Vertical0, alignment$Companion0.getTop()) || z ? modifier0.then(WrapContentElement.g.height(alignment$Vertical0, z)) : modifier0.then(SizeKt.g);
    }

    public static Modifier wrapContentHeight$default(Modifier modifier0, Vertical alignment$Vertical0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment$Vertical0 = Alignment.Companion.getCenterVertically();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return SizeKt.wrapContentHeight(modifier0, alignment$Vertical0, z);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentSize(@NotNull Modifier modifier0, @NotNull Alignment alignment0, boolean z) {
        Companion alignment$Companion0 = Alignment.Companion;
        if(Intrinsics.areEqual(alignment0, alignment$Companion0.getCenter()) && !z) {
            return modifier0.then(SizeKt.h);
        }
        return !Intrinsics.areEqual(alignment0, alignment$Companion0.getTopStart()) || z ? modifier0.then(WrapContentElement.g.size(alignment0, z)) : modifier0.then(SizeKt.i);
    }

    public static Modifier wrapContentSize$default(Modifier modifier0, Alignment alignment0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment0 = Alignment.Companion.getCenter();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return SizeKt.wrapContentSize(modifier0, alignment0, z);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentWidth(@NotNull Modifier modifier0, @NotNull Horizontal alignment$Horizontal0, boolean z) {
        Companion alignment$Companion0 = Alignment.Companion;
        if(Intrinsics.areEqual(alignment$Horizontal0, alignment$Companion0.getCenterHorizontally()) && !z) {
            return modifier0.then(SizeKt.d);
        }
        return !Intrinsics.areEqual(alignment$Horizontal0, alignment$Companion0.getStart()) || z ? modifier0.then(WrapContentElement.g.width(alignment$Horizontal0, z)) : modifier0.then(SizeKt.e);
    }

    public static Modifier wrapContentWidth$default(Modifier modifier0, Horizontal alignment$Horizontal0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment$Horizontal0 = Alignment.Companion.getCenterHorizontally();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return SizeKt.wrapContentWidth(modifier0, alignment$Horizontal0, z);
    }
}

