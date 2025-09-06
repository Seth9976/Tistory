package androidx.compose.foundation;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A(\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0003\u0010\u0006\u001A\u00020\u0007H\u0007\u001A(\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"background", "Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", "alpha", "", "color", "Landroidx/compose/ui/graphics/Color;", "background-bw27NRU", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,205:1\n135#2:206\n135#2:207\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n58#1:206\n89#1:207\n*E\n"})
public final class BackgroundKt {
    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier background(@NotNull Modifier modifier0, @NotNull Brush brush0, @NotNull Shape shape0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return modifier0.then(new BackgroundElement(0L, brush0, f, shape0, InspectableValueKt.getNoInspectorInfo(), 1));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,178:1\n90#2,5:179\n*E\n"})
        public final class androidx.compose.foundation.BackgroundKt.background..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final Brush x;
            public final Shape y;

            public androidx.compose.foundation.BackgroundKt.background..inlined.debugInspectorInfo.1(float f, Brush brush0, Shape shape0) {
                this.w = f;
                this.x = brush0;
                this.y = shape0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("background");
                inspectorInfo0.getProperties().set("alpha", this.w);
                inspectorInfo0.getProperties().set("brush", this.x);
                inspectorInfo0.getProperties().set("shape", this.y);
            }
        }

    }

    public static Modifier background$default(Modifier modifier0, Brush brush0, Shape shape0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        if((v & 4) != 0) {
            f = 1.0f;
        }
        return BackgroundKt.background(modifier0, brush0, shape0, f);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier background-bw27NRU(@NotNull Modifier modifier0, long v, @NotNull Shape shape0) {
        return modifier0.then(new BackgroundElement(v, null, 1.0f, shape0, InspectableValueKt.getNoInspectorInfo(), 2));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,178:1\n59#2,5:179\n*E\n"})
        public final class androidx.compose.foundation.BackgroundKt.background-bw27NRU..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final long w;
            public final Shape x;

            public androidx.compose.foundation.BackgroundKt.background-bw27NRU..inlined.debugInspectorInfo.1(long v, Shape shape0) {
                this.w = v;
                this.x = shape0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("background");
                inspectorInfo0.setValue(Color.box-impl(this.w));
                inspectorInfo0.getProperties().set("color", Color.box-impl(this.w));
                inspectorInfo0.getProperties().set("shape", this.x);
            }
        }

    }

    public static Modifier background-bw27NRU$default(Modifier modifier0, long v, Shape shape0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        return BackgroundKt.background-bw27NRU(modifier0, v, shape0);
    }
}

