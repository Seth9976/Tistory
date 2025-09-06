package kotlin.text;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.a;

public abstract class t extends StringsKt__StringsKt {
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character max(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt___StringsKt.maxOrNull(charSequence0);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character maxBy(CharSequence charSequence0, Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        int v1 = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = charSequence0.charAt(intIterator0.nextInt());
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v2)));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character maxWith(CharSequence charSequence0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return StringsKt___StringsKt.maxWithOrNull(charSequence0, comparator0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character min(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt___StringsKt.minOrNull(charSequence0);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character minBy(CharSequence charSequence0, Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        int v1 = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = charSequence0.charAt(intIterator0.nextInt());
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v2)));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character minWith(CharSequence charSequence0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return StringsKt___StringsKt.minWithOrNull(charSequence0, comparator0);
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return (SortedSet)StringsKt___StringsKt.toCollection(charSequence0, new TreeSet());
    }
}

