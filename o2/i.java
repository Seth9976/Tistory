package o2;

import androidx.compose.ui.tooling.ViewInfo;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;

public final class i {
    public i a;
    public final ViewInfo b;
    public final List c;
    public final Sequence d;

    public i(i i0, ViewInfo viewInfo0) {
        this.a = i0;
        this.b = viewInfo0;
        Iterable iterable0 = viewInfo0.getChildren();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(new i(this, ((ViewInfo)object0)));
        }
        this.c = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
        this.d = SequencesKt__SequenceBuilderKt.sequence(new h(this, null));
    }

    public final i a() {
        i i0 = this.a;
        if(i0 == null) {
            return this;
        }
        Intrinsics.checkNotNull(i0);
        return i0.a();
    }

    public final ViewInfo b() {
        ViewInfo viewInfo0 = this.b;
        String s = viewInfo0.getFileName();
        int v = viewInfo0.getLineNumber();
        IntRect intRect0 = viewInfo0.getBounds();
        SourceLocation sourceLocation0 = viewInfo0.getLocation();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.c, 10));
        for(Object object0: this.c) {
            arrayList0.add(((i)object0).b());
        }
        return new ViewInfo(s, v, intRect0, sourceLocation0, arrayList0, viewInfo0.getLayoutInfo());
    }
}

