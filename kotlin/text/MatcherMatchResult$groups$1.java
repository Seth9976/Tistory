package kotlin.text;

import fg.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u000B\u001A\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\f\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u000F\u001A\u00020\u000EH\u0096\u0002¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/MatchGroup;", "", "name", "(Ljava/lang/String;)Lkotlin/text/MatchGroup;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MatcherMatchResult.groups.1 extends AbstractCollection implements MatchNamedGroupCollection {
    public final e a;

    public MatcherMatchResult.groups.1(e e0) {
        this.a = e0;
        super();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.collections.AbstractCollection
    public final boolean contains(Object object0) {
        return (object0 == null ? true : object0 instanceof MatchGroup) ? this.contains(((MatchGroup)object0)) : false;
    }

    public boolean contains(MatchGroup matchGroup0) {
        return super.contains(matchGroup0);
    }

    @Override  // kotlin.text.MatchGroupCollection
    @Nullable
    public MatchGroup get(int v) {
        e e0 = this.a;
        IntRange intRange0 = RegexKt.access$range(e0.a, v);
        if(((int)intRange0.getStart()) >= 0) {
            String s = e0.a.group(v);
            Intrinsics.checkNotNullExpressionValue(s, "group(...)");
            return new MatchGroup(s, intRange0);
        }
        return null;
    }

    @Override  // kotlin.text.MatchNamedGroupCollection
    @Nullable
    public MatchGroup get(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(this.a.a, s);
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.a.a.groupCount() + 1;
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean isEmpty() {
        return false;
    }

    @Override  // kotlin.collections.AbstractCollection
    @NotNull
    public Iterator iterator() {
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(CollectionsKt__CollectionsKt.getIndices(this)), new c(this, 28)).iterator();
    }
}

