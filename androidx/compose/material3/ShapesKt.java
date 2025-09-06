package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0013\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0013\u0010\u0003\u001A\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0013\u0010\u0004\u001A\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001A\u0013\u0010\u0005\u001A\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001A\u001B\u0010\n\u001A\u00020\t*\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000B\" \u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00060\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0018\u0010\b\u001A\u00020\t*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "top", "(Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/foundation/shape/CornerBasedShape;", "bottom", "start", "end", "Landroidx/compose/material3/Shapes;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "value", "Landroidx/compose/ui/graphics/Shape;", "fromToken", "(Landroidx/compose/material3/Shapes;Landroidx/compose/material3/tokens/ShapeKeyTokens;)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShapes", "getValue", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,196:1\n158#2:197\n158#2:198\n158#2:199\n158#2:200\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n*L\n145#1:197\n152#1:198\n159#1:199\n164#1:200\n*E\n"})
public final class ShapesKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ShapeKeyTokens.values().length];
            try {
                arr_v[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final ProvidableCompositionLocal a;

    static {
        ShapesKt.a = CompositionLocalKt.staticCompositionLocalOf(m4.N);
    }

    @NotNull
    public static final CornerBasedShape bottom(@NotNull CornerBasedShape cornerBasedShape0) {
        return CornerBasedShape.copy$default(cornerBasedShape0, CornerSizeKt.CornerSize-0680j_4(0.0f), CornerSizeKt.CornerSize-0680j_4(0.0f), null, null, 12, null);
    }

    @NotNull
    public static final CornerBasedShape end(@NotNull CornerBasedShape cornerBasedShape0) {
        return CornerBasedShape.copy$default(cornerBasedShape0, CornerSizeKt.CornerSize-0680j_4(0.0f), null, null, CornerSizeKt.CornerSize-0680j_4(0.0f), 6, null);
    }

    @NotNull
    public static final Shape fromToken(@NotNull Shapes shapes0, @NotNull ShapeKeyTokens shapeKeyTokens0) {
        switch(WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens0.ordinal()]) {
            case 1: {
                return shapes0.getExtraLarge();
            }
            case 2: {
                return ShapesKt.top(shapes0.getExtraLarge());
            }
            case 3: {
                return shapes0.getExtraSmall();
            }
            case 4: {
                return ShapesKt.top(shapes0.getExtraSmall());
            }
            case 5: {
                return RoundedCornerShapeKt.getCircleShape();
            }
            case 6: {
                return shapes0.getLarge();
            }
            case 7: {
                return ShapesKt.end(shapes0.getLarge());
            }
            case 8: {
                return ShapesKt.top(shapes0.getLarge());
            }
            case 9: {
                return shapes0.getMedium();
            }
            case 10: {
                return RectangleShapeKt.getRectangleShape();
            }
            case 11: {
                return shapes0.getSmall();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalShapes() {
        return ShapesKt.a;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getValue")
    @NotNull
    public static final Shape getValue(@NotNull ShapeKeyTokens shapeKeyTokens0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x611B333F, v, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        Shape shape0 = ShapesKt.fromToken(MaterialTheme.INSTANCE.getShapes(composer0, 6), shapeKeyTokens0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @NotNull
    public static final CornerBasedShape start(@NotNull CornerBasedShape cornerBasedShape0) {
        return CornerBasedShape.copy$default(cornerBasedShape0, null, CornerSizeKt.CornerSize-0680j_4(0.0f), CornerSizeKt.CornerSize-0680j_4(0.0f), null, 9, null);
    }

    @NotNull
    public static final CornerBasedShape top(@NotNull CornerBasedShape cornerBasedShape0) {
        CornerSize cornerSize0 = CornerSizeKt.CornerSize-0680j_4(0.0f);
        return CornerBasedShape.copy$default(cornerBasedShape0, null, null, CornerSizeKt.CornerSize-0680j_4(0.0f), cornerSize0, 3, null);
    }
}

