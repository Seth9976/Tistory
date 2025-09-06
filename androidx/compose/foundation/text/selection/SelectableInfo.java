package androidx.compose.foundation.text.selection;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001A\u0004\b&\u0010$R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\'\u0010\"\u001A\u0004\b(\u0010$R\u0017\u0010\b\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001A\u0004\b*\u0010$R\u0017\u0010\n\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u0011\u00100\u001A\u00020\u001A8F¢\u0006\u0006\u001A\u0004\b/\u0010\u001CR\u0011\u00102\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b1\u0010$R\u0011\u00106\u001A\u0002038F¢\u0006\u0006\u001A\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "<init>", "(JIIIILandroidx/compose/ui/text/TextLayoutResult;)V", "other", "", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectableInfo;)Z", "offset", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchorForOffset", "(I)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "start", "end", "Landroidx/compose/foundation/text/selection/Selection;", "makeSingleLayoutSelection", "(II)Landroidx/compose/foundation/text/selection/Selection;", "", "toString", "()Ljava/lang/String;", "a", "J", "getSelectableId", "()J", "b", "I", "getSlot", "()I", "c", "getRawStartHandleOffset", "d", "getRawEndHandleOffset", "e", "getRawPreviousHandleOffset", "f", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "getInputText", "inputText", "getTextLength", "textLength", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getRawCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "rawCrossStatus", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectableInfo {
    public static final int $stable;
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final TextLayoutResult f;

    static {
        SelectableInfo.$stable = TextLayoutResult.$stable;
    }

    public SelectableInfo(long v, int v1, int v2, int v3, int v4, @NotNull TextLayoutResult textLayoutResult0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = textLayoutResult0;
    }

    @NotNull
    public final AnchorInfo anchorForOffset(int v) {
        return new AnchorInfo(SelectionLayoutKt.access$getTextDirectionForOffset(this.f, v), v, this.a);
    }

    @NotNull
    public final String getInputText() {
        return this.f.getLayoutInput().getText().getText();
    }

    @NotNull
    public final CrossStatus getRawCrossStatus() {
        int v = this.c;
        int v1 = this.d;
        if(v < v1) {
            return CrossStatus.NOT_CROSSED;
        }
        return v <= v1 ? CrossStatus.COLLAPSED : CrossStatus.CROSSED;
    }

    public final int getRawEndHandleOffset() {
        return this.d;
    }

    public final int getRawPreviousHandleOffset() {
        return this.e;
    }

    public final int getRawStartHandleOffset() {
        return this.c;
    }

    public final long getSelectableId() {
        return this.a;
    }

    public final int getSlot() {
        return this.b;
    }

    @NotNull
    public final TextLayoutResult getTextLayoutResult() {
        return this.f;
    }

    public final int getTextLength() {
        return this.getInputText().length();
    }

    @NotNull
    public final Selection makeSingleLayoutSelection(int v, int v1) {
        AnchorInfo selection$AnchorInfo0 = this.anchorForOffset(v);
        AnchorInfo selection$AnchorInfo1 = this.anchorForOffset(v1);
        return v <= v1 ? new Selection(selection$AnchorInfo0, selection$AnchorInfo1, false) : new Selection(selection$AnchorInfo0, selection$AnchorInfo1, true);
    }

    public final boolean shouldRecomputeSelection(@NotNull SelectableInfo selectableInfo0) {
        return this.a != selectableInfo0.a || this.c != selectableInfo0.c || this.d != selectableInfo0.d;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SelectionInfo(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", range=(");
        stringBuilder0.append(this.c);
        stringBuilder0.append('-');
        stringBuilder0.append(SelectionLayoutKt.access$getTextDirectionForOffset(this.f, this.c));
        stringBuilder0.append(',');
        stringBuilder0.append(this.d);
        stringBuilder0.append('-');
        stringBuilder0.append(SelectionLayoutKt.access$getTextDirectionForOffset(this.f, this.d));
        stringBuilder0.append("), prevOffset=");
        return b.p(stringBuilder0, this.e, ')');
    }
}

