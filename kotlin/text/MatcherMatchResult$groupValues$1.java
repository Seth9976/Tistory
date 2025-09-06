package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "", "index", "get", "(I)Ljava/lang/String;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MatcherMatchResult.groupValues.1 extends AbstractList {
    public final e a;

    public MatcherMatchResult.groupValues.1(e e0) {
        this.a = e0;
        super();
    }

    @Override  // kotlin.collections.AbstractCollection
    public final boolean contains(Object object0) {
        return object0 instanceof String ? this.contains(((String)object0)) : false;
    }

    public boolean contains(String s) {
        return super.contains(s);
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public String get(int v) {
        String s = this.a.a.group(v);
        return s == null ? "" : s;
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.a.a.groupCount() + 1;
    }

    @Override  // kotlin.collections.AbstractList
    public final int indexOf(Object object0) {
        return object0 instanceof String ? this.indexOf(((String)object0)) : -1;
    }

    public int indexOf(String s) {
        return super.indexOf(s);
    }

    @Override  // kotlin.collections.AbstractList
    public final int lastIndexOf(Object object0) {
        return object0 instanceof String ? this.lastIndexOf(((String)object0)) : -1;
    }

    public int lastIndexOf(String s) {
        return super.lastIndexOf(s);
    }
}

