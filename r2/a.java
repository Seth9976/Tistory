package r2;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceContext;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;

public final class a implements SourceContext {
    public final Function3 a;
    public final Map b;
    public final ArrayDeque c;
    public int d;
    public IntRect e;

    public a(Function3 function30, Map map0) {
        this.a = function30;
        this.b = map0;
        this.c = new ArrayDeque();
        this.e = SlotTreeKt.getEmptyBox();
    }

    public final e a(String s) {
        Map map0 = this.b;
        e e0 = map0.get(s);
        if(e0 == null) {
            e0 = SlotTreeKt.l(s, null);
            map0.put(s, e0);
        }
        return e0 instanceof e ? e0 : null;
    }

    public final IntRect b(CompositionGroup compositionGroup0, int v, ArrayList arrayList0) {
        LayoutInfo layoutInfo0;
        ArrayList arrayList1 = new ArrayList();
        IntRect intRect0 = SlotTreeKt.getEmptyBox();
        ArrayDeque arrayDeque0 = this.c;
        arrayDeque0.addLast(compositionGroup0);
        Iterator iterator0 = compositionGroup0.getCompositionGroups().iterator();
        int v1 = 0;
        while(true) {
            layoutInfo0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            intRect0 = SlotTreeKt.union(intRect0, this.b(((CompositionGroup)object0), v1, arrayList1));
            String s = ((CompositionGroup)object0).getSourceInfo();
            if((s == null ? false : p.startsWith$default(s, "C", false, 2, null))) {
                ++v1;
            }
        }
        Object object1 = compositionGroup0.getNode();
        if(object1 instanceof LayoutInfo) {
            layoutInfo0 = (LayoutInfo)object1;
        }
        if(layoutInfo0 != null) {
            IntRect intRect1 = SlotTreeKt.b(layoutInfo0);
            if(intRect1 != null) {
                intRect0 = intRect1;
            }
        }
        this.d = v;
        this.e = intRect0;
        Object object2 = this.a.invoke(compositionGroup0, this, arrayList1);
        if(object2 != null) {
            arrayList0.add(object2);
        }
        CompositionGroup compositionGroup1 = (CompositionGroup)arrayDeque0.removeLast();
        return intRect0;
    }

    @Override  // androidx.compose.ui.tooling.data.SourceContext
    public final IntRect getBounds() {
        return this.e;
    }

    @Override  // androidx.compose.ui.tooling.data.SourceContext
    public final int getDepth() {
        return this.c.size();
    }

    @Override  // androidx.compose.ui.tooling.data.SourceContext
    public final SourceLocation getLocation() {
        int v6;
        String s3;
        e e2;
        ArrayDeque arrayDeque0 = this.c;
        CompositionGroup compositionGroup0 = arrayDeque0.size() <= 1 ? null : ((CompositionGroup)arrayDeque0.get(arrayDeque0.size() - 2));
        if(compositionGroup0 != null) {
            String s = compositionGroup0.getSourceInfo();
            if(s != null) {
                e e0 = this.a(s);
                if(e0 != null) {
                    e e1 = e0;
                    for(int v = 2; v < arrayDeque0.size() && (e1 == null ? null : e1.b) == null; ++v) {
                        CompositionGroup compositionGroup1 = arrayDeque0.size() <= v ? null : ((CompositionGroup)arrayDeque0.get(arrayDeque0.size() - v - 1));
                        if(compositionGroup1 == null) {
                            e2 = null;
                        }
                        else {
                            String s1 = compositionGroup1.getSourceInfo();
                            if(s1 != null) {
                                e2 = this.a(s1);
                            }
                        }
                        e1 = e2;
                    }
                    int v1 = this.d;
                    ArrayList arrayList0 = e0.d;
                    if(v1 >= arrayList0.size()) {
                        int v2 = e0.e;
                        if(v2 >= 0 && v2 < arrayList0.size()) {
                            v1 = (v1 - v2) % (arrayList0.size() - v2) + v2;
                        }
                    }
                    if(v1 < arrayList0.size()) {
                        f f0 = (f)arrayList0.get(v1);
                        int v3 = (int)f0.a;
                        int v4 = (int)f0.b;
                        int v5 = (int)f0.c;
                        String s2 = e0.b;
                        if(s2 != null) {
                            s3 = s2;
                        }
                        else if(e1 != null) {
                            s3 = e1.b;
                        }
                        else {
                            s3 = null;
                        }
                        if(s2 == null) {
                            if(e1 != null) {
                                v6 = e1.c;
                                goto label_45;
                            }
                            return new SourceLocation(v3, v4, v5, s3, -1);
                        }
                        else {
                            v6 = e0.c;
                        }
                    label_45:
                        SourceLocation sourceLocation0 = v6;
                        return sourceLocation0 == null ? new SourceLocation(v3, v4, v5, s3, -1) : new SourceLocation(v3, v4, v5, s3, ((int)(((Integer)sourceLocation0))));
                    }
                }
            }
        }
        return null;
    }

    @Override  // androidx.compose.ui.tooling.data.SourceContext
    public final String getName() {
        int v;
        String s = ((CompositionGroup)this.c.last()).getSourceInfo();
        String s1 = null;
        if(s == null) {
            return null;
        }
        if(p.startsWith$default(s, "CC(", false, 2, null)) {
            v = 3;
            goto label_9;
        }
        else if(p.startsWith$default(s, "C(", false, 2, null)) {
            v = 2;
        label_9:
            int v1 = StringsKt__StringsKt.indexOf$default(s, ')', 0, false, 6, null);
            if(v1 > 2) {
                s1 = s.substring(v, v1);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        return s1;
    }

    @Override  // androidx.compose.ui.tooling.data.SourceContext
    public final List getParameters() {
        CompositionGroup compositionGroup0 = (CompositionGroup)this.c.last();
        String s = compositionGroup0.getSourceInfo();
        if(s != null) {
            e e0 = this.a(s);
            if(e0 != null) {
                ArrayList arrayList0 = new ArrayList();
                o.addAll(arrayList0, compositionGroup0.getData());
                return SlotTreeKt.c(arrayList0, e0);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // androidx.compose.ui.tooling.data.SourceContext
    public final boolean isInline() {
        String s = ((CompositionGroup)this.c.last()).getSourceInfo();
        return s != null && p.startsWith$default(s, "CC", false, 2, null);
    }
}

