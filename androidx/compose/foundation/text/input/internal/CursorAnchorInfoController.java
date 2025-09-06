package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import m0.r;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "Lkotlinx/coroutines/CoroutineScope;", "monitorScope", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/CoroutineScope;)V", "", "cursorUpdateMode", "", "requestUpdates", "(I)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoController.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    public final TransformedTextFieldState a;
    public final TextLayoutState b;
    public final ComposeInputMethodManager c;
    public final CoroutineScope d;
    public Job e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j;
    public final float[] k;
    public final Matrix l;

    public CursorAnchorInfoController(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull ComposeInputMethodManager composeInputMethodManager0, @NotNull CoroutineScope coroutineScope0) {
        this.a = transformedTextFieldState0;
        this.b = textLayoutState0;
        this.c = composeInputMethodManager0;
        this.d = coroutineScope0;
        this.j = new CursorAnchorInfo.Builder();
        this.k = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
        this.l = new Matrix();
    }

    public final CursorAnchorInfo a() {
        TextLayoutState textLayoutState0 = this.b;
        LayoutCoordinates layoutCoordinates0 = textLayoutState0.getTextLayoutNodeCoordinates();
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.isAttached()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                LayoutCoordinates layoutCoordinates1 = textLayoutState0.getCoreNodeCoordinates();
                if(layoutCoordinates1 != null) {
                    if(!layoutCoordinates1.isAttached()) {
                        layoutCoordinates1 = null;
                    }
                    if(layoutCoordinates1 != null) {
                        LayoutCoordinates layoutCoordinates2 = textLayoutState0.getDecoratorNodeCoordinates();
                        if(layoutCoordinates2 != null) {
                            if(!layoutCoordinates2.isAttached()) {
                                layoutCoordinates2 = null;
                            }
                            if(layoutCoordinates2 != null) {
                                TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
                                if(textLayoutResult0 == null) {
                                    return null;
                                }
                                TextFieldCharSequence textFieldCharSequence0 = this.a.getVisualText();
                                androidx.compose.ui.graphics.Matrix.reset-impl(this.k);
                                layoutCoordinates0.transformToScreen-58bKbWc(this.k);
                                AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(this.l, this.k);
                                Rect rect0 = SelectionManagerKt.visibleBounds(layoutCoordinates1).translate-k-4lQ0M(layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, 0L));
                                Rect rect1 = SelectionManagerKt.visibleBounds(layoutCoordinates2).translate-k-4lQ0M(layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates2, 0L));
                                return CursorAnchorInfoBuilder_androidKt.build-vxqZcH0(this.j, textFieldCharSequence0, textFieldCharSequence0.getSelection-d9O1mEE(), textFieldCharSequence0.getComposition-MzsxiRA(), textLayoutResult0, this.l, rect0, rect1, this.f, this.g, this.h, this.i);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void requestUpdates(int v) {
        boolean z4;
        boolean z2;
        boolean z1;
        boolean z = false;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 33) {
            z1 = (v & 16) != 0;
            z2 = (v & 8) != 0;
            boolean z3 = (v & 4) != 0;
            if(v1 >= 34 && (v & 0x20) != 0) {
                z = true;
            }
            if(z1 || z2 || z3 || z) {
                z4 = z;
                z = z3;
            }
            else if(v1 >= 34) {
                z4 = true;
                z = true;
                z1 = true;
                z2 = true;
            }
            else {
                z1 = true;
                z2 = true;
                z4 = false;
                z = true;
            }
        }
        else {
            z1 = true;
            z2 = true;
            z4 = false;
        }
        this.f = z1;
        this.g = z2;
        this.h = z;
        this.i = z4;
        if((v & 1) != 0) {
            CursorAnchorInfo cursorAnchorInfo0 = this.a();
            if(cursorAnchorInfo0 != null) {
                this.c.updateCursorAnchorInfo(cursorAnchorInfo0);
            }
        }
        if((v & 2) == 0) {
            Job job0 = this.e;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            this.e = null;
        }
        else if(this.e == null || !this.e.isActive()) {
            r r0 = new r(this, null);
            this.e = BuildersKt.launch$default(this.d, null, CoroutineStart.UNDISPATCHED, r0, 1, null);
        }
    }
}

