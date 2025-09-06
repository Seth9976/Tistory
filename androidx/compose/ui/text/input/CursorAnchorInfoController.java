package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import j2.c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u001E\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00162\u0012\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000F0\u00182\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001D\u001A\u00020\u001B¢\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010 \u001A\u00020\u000F¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "<init>", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "", "requestUpdate", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "invalidate", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    public final PositionCalculator a;
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
    public Function1 m;
    public Rect n;
    public Rect o;
    public final CursorAnchorInfo.Builder p;
    public final float[] q;
    public final Matrix r;

    public CursorAnchorInfoController(@NotNull PositionCalculator positionCalculator0, @NotNull InputMethodManager inputMethodManager0) {
        this.a = positionCalculator0;
        this.b = inputMethodManager0;
        this.c = new Object();
        this.m = c.y;
        this.p = new CursorAnchorInfo.Builder();
        this.q = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
        this.r = new Matrix();
    }

    public final void a() {
        InputMethodManager inputMethodManager0 = this.b;
        if(!inputMethodManager0.isActive()) {
            return;
        }
        this.m.invoke(androidx.compose.ui.graphics.Matrix.box-impl(this.q));
        this.a.localToScreen-58bKbWc(this.q);
        AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(this.r, this.q);
        TextFieldValue textFieldValue0 = this.j;
        Intrinsics.checkNotNull(textFieldValue0);
        OffsetMapping offsetMapping0 = this.l;
        Intrinsics.checkNotNull(offsetMapping0);
        TextLayoutResult textLayoutResult0 = this.k;
        Intrinsics.checkNotNull(textLayoutResult0);
        Rect rect0 = this.n;
        Intrinsics.checkNotNull(rect0);
        Rect rect1 = this.o;
        Intrinsics.checkNotNull(rect1);
        inputMethodManager0.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(this.p, textFieldValue0, offsetMapping0, textLayoutResult0, this.r, rect0, rect1, this.f, this.g, this.h, this.i));
        this.e = false;
    }

    public final void invalidate() {
        synchronized(this.c) {
            this.j = null;
            this.l = null;
            this.k = null;
            this.m = c.x;
            this.n = null;
            this.o = null;
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

    public final void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Function1 function10, @NotNull Rect rect0, @NotNull Rect rect1) {
        synchronized(this.c) {
            this.j = textFieldValue0;
            this.l = offsetMapping0;
            this.k = textLayoutResult0;
            this.m = function10;
            this.n = rect0;
            this.o = rect1;
            if(this.e || this.d) {
                this.a();
            }
        }
    }
}

