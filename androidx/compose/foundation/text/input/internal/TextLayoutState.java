package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b\u00A2\u0006\u0004\b\f\u0010\rJ0\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\"\u0010 \u001A\u00020\u001D2\u0006\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0018\u0010$\u001A\u00020\b2\u0006\u0010!\u001A\u00020\u001A\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010\'\u001A\u00020\u001A2\u0006\u0010!\u001A\u00020\u001AH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&RC\u00101\u001A#\u0012\u0004\u0012\u00020\u000E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160)\u0012\u0004\u0012\u00020\u000B\u0018\u00010(\u00A2\u0006\u0002\b*8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\u001D\u00106\u001A\u0004\u0018\u00010\u00168FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R/\u0010?\u001A\u0004\u0018\u0001072\b\u00108\u001A\u0004\u0018\u0001078F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R/\u0010C\u001A\u0004\u0018\u0001072\b\u00108\u001A\u0004\u0018\u0001078F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b@\u0010:\u001A\u0004\bA\u0010<\"\u0004\bB\u0010>R/\u0010G\u001A\u0004\u0018\u0001072\b\u00108\u001A\u0004\u0018\u0001078F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bD\u0010:\u001A\u0004\bE\u0010<\"\u0004\bF\u0010>R1\u0010N\u001A\u00020H2\u0006\u00108\u001A\u00020H8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bI\u0010:\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0017\u0010T\u001A\u00020O8\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010S\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006U"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "", "updateNonMeasureInputs", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs", "Landroidx/compose/ui/geometry/Offset;", "position", "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "getOffsetForPosition", "offset", "isPositionOnText-k-4lQ0M", "(J)Z", "isPositionOnText", "coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release", "(J)J", "coercedInVisibleBoundsOfInputText", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function2;", "getOnTextLayout", "()Lkotlin/jvm/functions/Function2;", "setOnTextLayout", "(Lkotlin/jvm/functions/Function2;)V", "onTextLayout", "c", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getTextLayoutNodeCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setTextLayoutNodeCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "textLayoutNodeCoordinates", "e", "getCoreNodeCoordinates", "setCoreNodeCoordinates", "coreNodeCoordinates", "f", "getDecoratorNodeCoordinates", "setDecoratorNodeCoordinates", "decoratorNodeCoordinates", "Landroidx/compose/ui/unit/Dp;", "g", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "h", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "getBringIntoViewRequester", "()Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,252:1\n148#2:253\n81#3:254\n81#3:255\n107#3,2:256\n81#3:258\n107#3,2:259\n81#3:261\n107#3,2:262\n81#3:264\n107#3,2:265\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n*L\n80#1:253\n46#1:254\n73#1:255\n73#1:256,2\n74#1:258\n74#1:259,2\n75#1:261\n75#1:262,2\n80#1:264\n80#1:265,2\n*E\n"})
public final class TextLayoutState {
    public static final int $stable = 8;
    public final TextFieldLayoutStateCache a;
    public Function2 b;
    public final TextFieldLayoutStateCache c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final BringIntoViewRequester h;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache0 = new TextFieldLayoutStateCache();
        this.a = textFieldLayoutStateCache0;
        this.c = textFieldLayoutStateCache0;
        this.d = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.e = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.f = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.g = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
        this.h = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public final long coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release(long v) {
        Rect rect0;
        LayoutCoordinates layoutCoordinates0 = this.getTextLayoutNodeCoordinates();
        if(layoutCoordinates0 != null) {
            if(layoutCoordinates0.isAttached()) {
                LayoutCoordinates layoutCoordinates1 = this.getDecoratorNodeCoordinates();
                rect0 = null;
                if(layoutCoordinates1 != null) {
                    rect0 = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates1, layoutCoordinates0, false, 2, null);
                    return rect0 == null ? TextLayoutStateKt.coerceIn-3MmeM6k(v, Rect.Companion.getZero()) : TextLayoutStateKt.coerceIn-3MmeM6k(v, rect0);
                }
            }
            else {
                rect0 = Rect.Companion.getZero();
            }
            return rect0 == null ? TextLayoutStateKt.coerceIn-3MmeM6k(v, Rect.Companion.getZero()) : TextLayoutStateKt.coerceIn-3MmeM6k(v, rect0);
        }
        return TextLayoutStateKt.coerceIn-3MmeM6k(v, Rect.Companion.getZero());
    }

    @NotNull
    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.h;
    }

    @Nullable
    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates)this.e.getValue();
    }

    @Nullable
    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates)this.f.getValue();
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return (TextLayoutResult)this.c.getValue();
    }

    public final float getMinHeightForSingleLineField-D9Ej5fM() {
        return ((Dp)this.g.getValue()).unbox-impl();
    }

    public final int getOffsetForPosition-3MmeM6k(long v, boolean z) {
        TextLayoutResult textLayoutResult0 = this.getLayoutResult();
        if(textLayoutResult0 == null) {
            return -1;
        }
        if(z) {
            v = this.coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release(v);
        }
        return textLayoutResult0.getOffsetForPosition-k-4lQ0M(TextLayoutStateKt.fromDecorationToTextLayout-Uv8p0NA(this, v));
    }

    public static int getOffsetForPosition-3MmeM6k$default(TextLayoutState textLayoutState0, long v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = true;
        }
        return textLayoutState0.getOffsetForPosition-3MmeM6k(v, z);
    }

    @Nullable
    public final Function2 getOnTextLayout() {
        return this.b;
    }

    @Nullable
    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates)this.d.getValue();
    }

    public final boolean isPositionOnText-k-4lQ0M(long v) {
        TextLayoutResult textLayoutResult0 = this.getLayoutResult();
        if(textLayoutResult0 == null) {
            return false;
        }
        long v1 = TextLayoutStateKt.fromDecorationToTextLayout-Uv8p0NA(this, this.coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release(v));
        int v2 = textLayoutResult0.getLineForVerticalPosition(Offset.getY-impl(v1));
        return Offset.getX-impl(v1) >= textLayoutResult0.getLineLeft(v2) && Offset.getX-impl(v1) <= textLayoutResult0.getLineRight(v2);
    }

    @NotNull
    public final TextLayoutResult layoutWithNewMeasureInputs--hBUhpc(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Resolver fontFamily$Resolver0, long v) {
        TextLayoutResult textLayoutResult0 = this.a.layoutWithNewMeasureInputs--hBUhpc(density0, layoutDirection0, fontFamily$Resolver0, v);
        Function2 function20 = this.b;
        if(function20 != null) {
            function20.invoke(density0, new e1(this));
        }
        return textLayoutResult0;
    }

    public final void setCoreNodeCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.e.setValue(layoutCoordinates0);
    }

    public final void setDecoratorNodeCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.f.setValue(layoutCoordinates0);
    }

    public final void setMinHeightForSingleLineField-0680j_4(float f) {
        Dp dp0 = Dp.box-impl(f);
        this.g.setValue(dp0);
    }

    public final void setOnTextLayout(@Nullable Function2 function20) {
        this.b = function20;
    }

    public final void setTextLayoutNodeCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.d.setValue(layoutCoordinates0);
    }

    public final void updateNonMeasureInputs(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextStyle textStyle0, boolean z, boolean z1) {
        this.a.updateNonMeasureInputs(transformedTextFieldState0, textStyle0, z, z1);
    }
}

