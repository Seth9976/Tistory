package kotlin.collections;

import androidx.room.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class q extends p {
    @NotNull
    public static List filterIsInstance(@NotNull Iterable iterable0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(class0, "klass");
        return (List)q.filterIsInstanceTo(iterable0, new ArrayList(), class0);
    }

    @NotNull
    public static final Collection filterIsInstanceTo(@NotNull Iterable iterable0, @NotNull Collection collection0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(class0, "klass");
        for(Object object0: iterable0) {
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable max(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.maxOrNull(iterable0);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Double max(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.maxOrNull(iterable0);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Float max(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.maxOrNull(iterable0);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object maxBy(Iterable iterable0, Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) < 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return object0;
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object maxWith(Iterable iterable0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return CollectionsKt___CollectionsKt.maxWithOrNull(iterable0, comparator0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable min(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.minOrNull(iterable0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Double min(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.minOrNull(iterable0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Float min(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return CollectionsKt___CollectionsKt.minOrNull(iterable0);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object minBy(Iterable iterable0, Function1 function10) {
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return object0;
        }
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        do {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)function10.invoke(object1);
            if(comparable0.compareTo(comparable1) > 0) {
                object0 = object1;
                comparable0 = comparable1;
            }
        }
        while(iterator0.hasNext());
        return object0;
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object minWith(Iterable iterable0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return CollectionsKt___CollectionsKt.minWithOrNull(iterable0, comparator0);
    }

    public static void reverse(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Collections.reverse(list0);
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return (SortedSet)CollectionsKt___CollectionsKt.toCollection(iterable0, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull Iterable iterable0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return (SortedSet)CollectionsKt___CollectionsKt.toCollection(iterable0, new TreeSet(comparator0));
    }
}

