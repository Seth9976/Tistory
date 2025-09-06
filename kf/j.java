package kf;

import androidx.room.a;
import fg.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

public abstract class j extends SequencesKt__SequencesKt {
    @NotNull
    public static final Sequence filterIsInstance(@NotNull Sequence sequence0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(class0, "klass");
        Sequence sequence1 = SequencesKt___SequencesKt.filter(sequence0, new c(class0, 19));
        Intrinsics.checkNotNull(sequence1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return sequence1;
    }

    @NotNull
    public static final Collection filterIsInstanceTo(@NotNull Sequence sequence0, @NotNull Collection collection0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(class0, "klass");
        for(Object object0: sequence0) {
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable max(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.maxOrNull(sequence0);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Double max(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.maxOrNull(sequence0);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Float max(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.maxOrNull(sequence0);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object maxBy(Sequence sequence0, Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
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
    public static final Object maxWith(Sequence sequence0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return SequencesKt___SequencesKt.maxWithOrNull(sequence0, comparator0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable min(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.minOrNull(sequence0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Double min(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.minOrNull(sequence0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Float min(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt___SequencesKt.minOrNull(sequence0);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object minBy(Sequence sequence0, Function1 function10) {
        Iterator iterator0 = a.o(sequence0, "<this>", function10, "selector");
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
    public static final Object minWith(Sequence sequence0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return SequencesKt___SequencesKt.minWithOrNull(sequence0, comparator0);
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return (SortedSet)SequencesKt___SequencesKt.toCollection(sequence0, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull Sequence sequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return (SortedSet)SequencesKt___SequencesKt.toCollection(sequence0, new TreeSet(comparator0));
    }
}

