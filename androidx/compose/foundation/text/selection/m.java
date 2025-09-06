package androidx.compose.foundation.text.selection;

import aa.r;
import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;

public final class m implements SelectionLayout {
    public final LongIntMap a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Selection f;

    public m(LongIntMap longIntMap0, ArrayList arrayList0, int v, int v1, boolean z, Selection selection0) {
        this.a = longIntMap0;
        this.b = arrayList0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = selection0;
        if(arrayList0.size() <= 1) {
            throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList0.size() + '.').toString());
        }
    }

    public static void a(MutableLongObjectMap mutableLongObjectMap0, Selection selection0, SelectableInfo selectableInfo0, int v, int v1) {
        Selection selection1 = selection0.getHandlesCrossed() ? selectableInfo0.makeSingleLayoutSelection(v1, v) : selectableInfo0.makeSingleLayoutSelection(v, v1);
        if(v > v1) {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + selection1).toString());
        }
        mutableLongObjectMap0.put(selectableInfo0.getSelectableId(), selection1);
    }

    public final int b(long v) {
        try {
            return this.a.get(v);
        }
        catch(NoSuchElementException noSuchElementException0) {
            throw new IllegalStateException(q.n(v, "Invalid selectableId: "), noSuchElementException0);
        }
    }

    public final int c(int v, boolean z) {
        switch(this.getCrossStatus()) {
            case 1: {
                return v / 2;
            }
            case 2: {
                break;
            }
            case 3: {
                if(!z) {
                    return v / 2;
                }
                z = false;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (v - !z) / 2;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final LongObjectMap createSubSelections(Selection selection0) {
        if(selection0.getStart().getSelectableId() == selection0.getEnd().getSelectableId()) {
            if((!selection0.getHandlesCrossed() || selection0.getStart().getOffset() < selection0.getEnd().getOffset()) && (selection0.getHandlesCrossed() || selection0.getStart().getOffset() > selection0.getEnd().getOffset())) {
                throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection0).toString());
            }
            return LongObjectMapKt.longObjectMapOf(selection0.getStart().getSelectableId(), selection0);
        }
        MutableLongObjectMap mutableLongObjectMap0 = LongObjectMapKt.mutableLongObjectMapOf();
        m.a(mutableLongObjectMap0, selection0, this.getFirstInfo(), (selection0.getHandlesCrossed() ? selection0.getEnd() : selection0.getStart()).getOffset(), this.getFirstInfo().getTextLength());
        this.forEachMiddleInfo(new r(this, mutableLongObjectMap0, 1, selection0));
        m.a(mutableLongObjectMap0, selection0, this.getLastInfo(), 0, (selection0.getHandlesCrossed() ? selection0.getStart() : selection0.getEnd()).getOffset());
        return mutableLongObjectMap0;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final void forEachMiddleInfo(Function1 function10) {
        int v = this.b(this.getFirstInfo().getSelectableId());
        int v1 = this.b(this.getLastInfo().getSelectableId());
        int v2 = v + 1;
        if(v2 >= v1) {
            return;
        }
        while(v2 < v1) {
            function10.invoke(this.b.get(v2));
            ++v2;
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus getCrossStatus() {
        int v = this.c;
        int v1 = this.d;
        if(v < v1) {
            return CrossStatus.NOT_CROSSED;
        }
        return v <= v1 ? ((SelectableInfo)this.b.get(v / 2)).getRawCrossStatus() : CrossStatus.CROSSED;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getCurrentInfo() {
        return this.e ? this.getStartInfo() : this.getEndInfo();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getEndInfo() {
        int v = this.c(this.d, false);
        return (SelectableInfo)this.b.get(v);
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getEndSlot() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getFirstInfo() {
        return this.getCrossStatus() == CrossStatus.CROSSED ? this.getEndInfo() : this.getStartInfo();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getLastInfo() {
        return this.getCrossStatus() == CrossStatus.CROSSED ? this.getStartInfo() : this.getEndInfo();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final Selection getPreviousSelection() {
        return this.f;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return this.b.size();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getStartInfo() {
        int v = this.c(this.c, true);
        return (SelectableInfo)this.b.get(v);
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getStartSlot() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean isStartHandle() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean shouldRecomputeSelection(SelectionLayout selectionLayout0) {
        if(this.f != null && selectionLayout0 != null && selectionLayout0 instanceof m && this.e == ((m)selectionLayout0).e && this.c == ((m)selectionLayout0).c && this.d == ((m)selectionLayout0).d) {
            ArrayList arrayList0 = this.b;
            ArrayList arrayList1 = ((m)selectionLayout0).b;
            if(arrayList0.size() == arrayList1.size()) {
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(((SelectableInfo)arrayList0.get(v1)).shouldRecomputeSelection(((SelectableInfo)arrayList1.get(v1)))) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", startPosition=");
        boolean z = true;
        stringBuilder0.append(((float)(this.c + 1)) / 2.0f);
        stringBuilder0.append(", endPosition=");
        stringBuilder0.append(((float)(this.d + 1)) / 2.0f);
        stringBuilder0.append(", crossed=");
        stringBuilder0.append(this.getCrossStatus());
        stringBuilder0.append(", infos=");
        StringBuilder stringBuilder1 = new StringBuilder("[\n\t");
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            SelectableInfo selectableInfo0 = (SelectableInfo)arrayList0.get(v1);
            if(z) {
                z = false;
            }
            else {
                stringBuilder1.append(",\n\t");
            }
            ++v1;
            stringBuilder1.append(v1 + " -> " + selectableInfo0);
        }
        stringBuilder1.append("\n]");
        String s = stringBuilder1.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        stringBuilder0.append(s);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

