package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u0019¢\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010\u001E\u001A\u00020\u0004¢\u0006\u0004\b\u001E\u0010\u001F¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "localToScreen", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "requestUpdate", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "invalidate", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LegacyCursorAnchorInfoController {
    public static final int $stable = 8;
    public final Function1 a;
    public final InputMethodManager b;
    public final Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public TextFieldValue j;
    public TextLayoutResult k;
    public OffsetMapping l;
    public Rect m;
    public Rect n;
    public final CursorAnchorInfo.Builder o;
    public final float[] p;
    public final Matrix q;

    public LegacyCursorAnchorInfoController(@NotNull Function1 function10, @NotNull InputMethodManager inputMethodManager0) {
        this.a = function10;
        this.b = inputMethodManager0;
        this.c = new Object();
        this.o = new CursorAnchorInfo.Builder();
        this.p = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
        this.q = new Matrix();
    }

    public final void a() {
        InputMethodManager inputMethodManager0 = this.b;
        if(!inputMethodManager0.isActive()) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.reset-impl(this.p);
        androidx.compose.ui.graphics.Matrix matrix0 = androidx.compose.ui.graphics.Matrix.box-impl(this.p);
        this.a.invoke(matrix0);
        Rect rect0 = this.n;
        Intrinsics.checkNotNull(rect0);
        Rect rect1 = this.n;
        Intrinsics.checkNotNull(rect1);
        androidx.compose.ui.graphics.Matrix.translate-impl(this.p, -rect0.getLeft(), -rect1.getTop(), 0.0f);
        AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(this.q, this.p);
        TextFieldValue textFieldValue0 = this.j;
        Intrinsics.checkNotNull(textFieldValue0);
        OffsetMapping offsetMapping0 = this.l;
        Intrinsics.checkNotNull(offsetMapping0);
        TextLayoutResult textLayoutResult0 = this.k;
        Intrinsics.checkNotNull(textLayoutResult0);
        Rect rect2 = this.m;
        Intrinsics.checkNotNull(rect2);
        Rect rect3 = this.n;
        Intrinsics.checkNotNull(rect3);
        inputMethodManager0.updateCursorAnchorInfo(LegacyCursorAnchorInfoBuilder_androidKt.build(this.o, textFieldValue0, offsetMapping0, textLayoutResult0, this.q, rect2, rect3, this.f, this.g, this.h, this.i));
        this.e = false;
    }

    public final void invalidate() {
        synchronized(this.c) {
            this.j = null;
            this.l = null;
            this.k = null;
            this.m = null;
            this.n = null;
        }
    }

    public final void requestUpdate(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        synchronized(this.c) {
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = z5;
            if(z) {
                this.e = true;
                if(this.j != null) {
                    this.a();
                }
            }
            this.d = z1;
        }
    }

    public final void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Rect rect0, @NotNull Rect rect1) {
        synchronized(this.c) {
            this.j = textFieldValue0;
            this.l = offsetMapping0;
            this.k = textLayoutResult0;
            this.m = rect0;
            this.n = rect1;
            if(this.e || this.d) {
                this.a();
            }
        }
    }
}

