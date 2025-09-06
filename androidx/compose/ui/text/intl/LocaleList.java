package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u001D\b\u0016\u0012\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0016\u001A\u00020\u00122\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0096\u0002¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u00122\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0096\u0002¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u000F\u0010#\u001A\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u001A\u0010,\u001A\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\"¨\u0006."}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList;", "", "Landroidx/compose/ui/text/intl/Locale;", "", "localeList", "<init>", "(Ljava/util/List;)V", "", "languageTags", "(Ljava/lang/String;)V", "", "locales", "([Landroidx/compose/ui/text/intl/Locale;)V", "", "i", "get", "(I)Landroidx/compose/ui/text/intl/Locale;", "element", "", "contains", "(Landroidx/compose/ui/text/intl/Locale;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getLocaleList", "()Ljava/util/List;", "b", "I", "getSize", "size", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,90:1\n151#2,3:91\n33#2,4:94\n154#2,2:98\n38#2:100\n156#2:101\n33#2,4:102\n154#2,2:106\n38#2:108\n156#2:109\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n54#1:91,3\n54#1:94,4\n54#1:98,2\n54#1:100\n54#1:101\n54#1:102,4\n54#1:106,2\n54#1:108\n54#1:109\n*E\n"})
public final class LocaleList implements Collection, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList$Companion;", "", "Landroidx/compose/ui/text/intl/LocaleList;", "Empty", "Landroidx/compose/ui/text/intl/LocaleList;", "getEmpty", "()Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }

        @NotNull
        public final LocaleList getEmpty() {
            return LocaleList.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final List a;
    public final int b;
    public static final LocaleList c;

    static {
        LocaleList.Companion = new Companion(null);
        LocaleList.c = new LocaleList(CollectionsKt__CollectionsKt.emptyList());
    }

    public LocaleList(@NotNull String s) {
        List list0 = StringsKt__StringsKt.split$default(s, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            arrayList0.add(StringsKt__StringsKt.trim(((String)list0.get(v2))).toString());
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            arrayList1.add(new Locale(((String)arrayList0.get(v1))));
        }
        this(arrayList1);
    }

    public LocaleList(@NotNull List list0) {
        this.a = list0;
        this.b = list0.size();
    }

    public LocaleList(@NotNull Locale[] arr_locale) {
        this(ArraysKt___ArraysKt.toList(arr_locale));
    }

    public boolean add(Locale locale0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Locale locale0) {
        return this.a.contains(locale0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Locale ? this.contains(((Locale)object0)) : false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LocaleList ? Intrinsics.areEqual(this.a, ((LocaleList)object0).a) : false;
    }

    @NotNull
    public final Locale get(int v) {
        return (Locale)this.a.get(v);
    }

    @NotNull
    public final List getLocaleList() {
        return this.a;
    }

    public int getSize() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    @NotNull
    public String toString() {
        return "LocaleList(localeList=" + this.a + ')';
    }
}

