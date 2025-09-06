package kotlin.text;

import androidx.room.a;
import ca.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IntIterator;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.collections.w;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class StringsKt___StringsKt extends t {
    public static final boolean all(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < charSequence0.length(); ++v) {
            if(!((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() == 0 ? 0 : 1;
    }

    public static final boolean any(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < charSequence0.length(); ++v) {
            if(((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable asIterable(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0 instanceof String && ((String)charSequence0).length() == 0 ? CollectionsKt__CollectionsKt.emptyList() : new Object() {
            @Override
            @NotNull
            public Iterator iterator() {
                return StringsKt__StringsKt.iterator(charSequence0);
            }
        };
    }

    @NotNull
    public static final Sequence asSequence(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0 instanceof String && ((String)charSequence0).length() == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return StringsKt__StringsKt.iterator(charSequence0);
            }
        };
    }

    @NotNull
    public static final Map associate(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(charSequence0.length()), 16));
        for(int v = 0; v < charSequence0.length(); ++v) {
            Pair pair0 = (Pair)q.k(charSequence0, v, function10);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(charSequence0.length()), 16));
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            map0.put(function10.invoke(Character.valueOf(((char)v1))), Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateBy(@NotNull CharSequence charSequence0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(charSequence0.length()), 16));
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            map0.put(function10.invoke(Character.valueOf(((char)v1))), function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull CharSequence charSequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            map0.put(function10.invoke(Character.valueOf(((char)v1))), Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map associateByTo(@NotNull CharSequence charSequence0, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            map0.put(function10.invoke(Character.valueOf(((char)v1))), function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map associateTo(@NotNull CharSequence charSequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < charSequence0.length(); ++v) {
            Pair pair0 = (Pair)q.k(charSequence0, v, function10);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        return map0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map associateWith(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        Map map0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(c.coerceAtMost(charSequence0.length(), 0x80)), 16));
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            map0.put(Character.valueOf(((char)v1)), function10.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Map associateWithTo(@NotNull CharSequence charSequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "valueSelector");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            map0.put(Character.valueOf(((char)v1)), function10.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static List chunked(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt___StringsKt.windowed(charSequence0, v, v, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List chunked(@NotNull CharSequence charSequence0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return StringsKt___StringsKt.windowed(charSequence0, v, v, true, function10);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence chunkedSequence(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt___StringsKt.chunkedSequence(charSequence0, v, j.y);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence chunkedSequence(@NotNull CharSequence charSequence0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return StringsKt___StringsKt.windowedSequence(charSequence0, v, v, true, function10);
    }

    public static final int count(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v1 = 0;
        for(int v = 0; v < charSequence0.length(); ++v) {
            if(((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                ++v1;
            }
        }
        return v1;
    }

    @NotNull
    public static final CharSequence drop(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested character count " + v + " is less than zero.").toString());
        }
        return charSequence0.subSequence(c.coerceAtMost(v, charSequence0.length()), charSequence0.length());
    }

    @NotNull
    public static String drop(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested character count " + v + " is less than zero.").toString());
        }
        String s1 = s.substring(c.coerceAtMost(v, s.length()));
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        return s1;
    }

    @NotNull
    public static final CharSequence dropLast(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested character count ", " is less than zero.").toString());
        }
        return StringsKt___StringsKt.take(charSequence0, c.coerceAtLeast(charSequence0.length() - v, 0));
    }

    @NotNull
    public static String dropLast(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested character count ", " is less than zero.").toString());
        }
        return StringsKt___StringsKt.take(s, c.coerceAtLeast(s.length() - v, 0));
    }

    @NotNull
    public static final CharSequence dropLastWhile(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = StringsKt__StringsKt.getLastIndex(charSequence0); -1 < v; --v) {
            if(!((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                return charSequence0.subSequence(0, v + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final String dropLastWhile(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = StringsKt__StringsKt.getLastIndex(s); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v)))).booleanValue()) {
                String s1 = s.substring(0, v + 1);
                Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                return s1;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence dropWhile(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)q.k(charSequence0, v1, function10)).booleanValue()) {
                return charSequence0.subSequence(v1, charSequence0.length());
            }
        }
        return "";
    }

    @NotNull
    public static final String dropWhile(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v1)))).booleanValue()) {
                String s1 = s.substring(v1);
                Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                return s1;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence filter(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        CharSequence charSequence1 = new StringBuilder();
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = charSequence0.charAt(v1);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v2)))).booleanValue()) {
                ((Appendable)charSequence1).append(((char)v2));
            }
        }
        return charSequence1;
    }

    @NotNull
    public static final String filter(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v2)))).booleanValue()) {
                stringBuilder0.append(((char)v2));
            }
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        return s1;
    }

    @NotNull
    public static final CharSequence filterIndexed(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        CharSequence charSequence1 = new StringBuilder();
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            int v2 = charSequence0.charAt(v);
            if(((Boolean)function20.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                ((Appendable)charSequence1).append(((char)v2));
            }
            ++v;
        }
        return charSequence1;
    }

    @NotNull
    public static final String filterIndexed(@NotNull String s, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        for(int v1 = 0; v < s.length(); ++v1) {
            int v2 = s.charAt(v);
            if(((Boolean)function20.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                stringBuilder0.append(((char)v2));
            }
            ++v;
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        return s1;
    }

    @NotNull
    public static final Appendable filterIndexedTo(@NotNull CharSequence charSequence0, @NotNull Appendable appendable0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "destination");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            int v2 = charSequence0.charAt(v);
            if(((Boolean)function20.invoke(v1, Character.valueOf(((char)v2)))).booleanValue()) {
                appendable0.append(((char)v2));
            }
            ++v;
        }
        return appendable0;
    }

    @NotNull
    public static final CharSequence filterNot(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        CharSequence charSequence1 = new StringBuilder();
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                ((Appendable)charSequence1).append(((char)v1));
            }
        }
        return charSequence1;
    }

    @NotNull
    public static final String filterNot(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                stringBuilder0.append(((char)v1));
            }
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        return s1;
    }

    @NotNull
    public static final Appendable filterNotTo(@NotNull CharSequence charSequence0, @NotNull Appendable appendable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            if(!((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                appendable0.append(((char)v1));
            }
        }
        return appendable0;
    }

    @NotNull
    public static final Appendable filterTo(@NotNull CharSequence charSequence0, @NotNull Appendable appendable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(appendable0, "destination");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = charSequence0.charAt(v1);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v2)))).booleanValue()) {
                appendable0.append(((char)v2));
            }
        }
        return appendable0;
    }

    public static final char first(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence0.charAt(0);
    }

    public static final char first(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < charSequence0.length(); ++v) {
            char c = charSequence0.charAt(v);
            if(((Boolean)function10.invoke(Character.valueOf(c))).booleanValue()) {
                return c;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() == 0 ? null : Character.valueOf(charSequence0.charAt(0));
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                return Character.valueOf(((char)v1));
            }
        }
        return null;
    }

    @NotNull
    public static final List flatMap(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < charSequence0.length(); ++v) {
            o.addAll(list0, ((Iterable)q.k(charSequence0, v, function10)));
        }
        return list0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull CharSequence charSequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < charSequence0.length(); ++v) {
            o.addAll(collection0, ((Iterable)q.k(charSequence0, v, function10)));
        }
        return collection0;
    }

    public static final Object fold(@NotNull CharSequence charSequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = 0; v < charSequence0.length(); ++v) {
            object0 = function20.invoke(object0, Character.valueOf(charSequence0.charAt(v)));
        }
        return object0;
    }

    public static final Object foldIndexed(@NotNull CharSequence charSequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            object0 = function30.invoke(v1, object0, Character.valueOf(charSequence0.charAt(v)));
            ++v;
        }
        return object0;
    }

    public static final Object foldRight(@NotNull CharSequence charSequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        for(int v = StringsKt__StringsKt.getLastIndex(charSequence0); v >= 0; --v) {
            object0 = function20.invoke(Character.valueOf(charSequence0.charAt(v)), object0);
        }
        return object0;
    }

    public static final Object foldRightIndexed(@NotNull CharSequence charSequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        for(int v = StringsKt__StringsKt.getLastIndex(charSequence0); v >= 0; --v) {
            object0 = function30.invoke(v, Character.valueOf(charSequence0.charAt(v)), object0);
        }
        return object0;
    }

    public static final void forEach(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < charSequence0.length(); ++v) {
            function10.invoke(Character.valueOf(charSequence0.charAt(v)));
        }
    }

    public static final void forEachIndexed(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            function20.invoke(v1, Character.valueOf(charSequence0.charAt(v)));
            ++v;
        }
    }

    @Nullable
    public static Character getOrNull(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return v < 0 || v > StringsKt__StringsKt.getLastIndex(charSequence0) ? null : Character.valueOf(charSequence0.charAt(v));
    }

    @NotNull
    public static final Map groupBy(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupBy(@NotNull CharSequence charSequence0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        Map map0 = new LinkedHashMap();
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = a.m(((LinkedHashMap)map0), object0);
            }
            arrayList0.add(function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull CharSequence charSequence0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(Character.valueOf(((char)v1)));
        }
        return map0;
    }

    @NotNull
    public static final Map groupByTo(@NotNull CharSequence charSequence0, @NotNull Map map0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        Intrinsics.checkNotNullParameter(function11, "valueTransform");
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            Object object0 = function10.invoke(Character.valueOf(((char)v1)));
            ArrayList arrayList0 = map0.get(object0);
            if(arrayList0 == null) {
                arrayList0 = wb.a.g(map0, object0);
            }
            arrayList0.add(function11.invoke(Character.valueOf(((char)v1))));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Grouping groupingBy(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        return new Grouping() {
            public Object keyOf(char c) {
                return function10.invoke(Character.valueOf(c));
            }

            @Override  // kotlin.collections.Grouping
            public Object keyOf(Object object0) {
                return this.keyOf(((Character)object0).charValue());
            }

            @Override  // kotlin.collections.Grouping
            @NotNull
            public Iterator sourceIterator() {
                return StringsKt__StringsKt.iterator(charSequence0);
            }
        };
    }

    public static final int indexOfFirst(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)q.k(charSequence0, v1, function10)).booleanValue()) {
                return v1;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length() - 1;
        if(v >= 0) {
            while(true) {
                if(((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                    return v;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    public static char last(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence0.charAt(StringsKt__StringsKt.getLastIndex(charSequence0));
    }

    public static final char last(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length() - 1;
        if(v >= 0) {
            while(true) {
                char c = charSequence0.charAt(v);
                if(((Boolean)function10.invoke(Character.valueOf(c))).booleanValue()) {
                    return c;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() == 0 ? null : Character.valueOf(charSequence0.charAt(charSequence0.length() - 1));
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length() - 1;
        if(v >= 0) {
            while(true) {
                int v1 = charSequence0.charAt(v);
                if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                    return Character.valueOf(((char)v1));
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @NotNull
    public static final List map(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(charSequence0.length());
        for(int v = 0; v < charSequence0.length(); ++v) {
            list0.add(function10.invoke(Character.valueOf(charSequence0.charAt(v))));
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexed(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList(charSequence0.length());
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            list0.add(function20.invoke(v1, Character.valueOf(charSequence0.charAt(v))));
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final List mapIndexedNotNull(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        List list0 = new ArrayList();
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            Object object0 = function20.invoke(v1, Character.valueOf(charSequence0.charAt(v)));
            if(object0 != null) {
                list0.add(object0);
            }
            ++v;
        }
        return list0;
    }

    @NotNull
    public static final Collection mapIndexedNotNullTo(@NotNull CharSequence charSequence0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            Object object0 = function20.invoke(v1, Character.valueOf(charSequence0.charAt(v)));
            if(object0 != null) {
                collection0.add(object0);
            }
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapIndexedTo(@NotNull CharSequence charSequence0, @NotNull Collection collection0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            collection0.add(function20.invoke(v1, Character.valueOf(charSequence0.charAt(v))));
            ++v;
        }
        return collection0;
    }

    @NotNull
    public static final List mapNotNull(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(int v = 0; v < charSequence0.length(); ++v) {
            Object object0 = q.k(charSequence0, v, function10);
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public static final Collection mapNotNullTo(@NotNull CharSequence charSequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < charSequence0.length(); ++v) {
            Object object0 = q.k(charSequence0, v, function10);
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull CharSequence charSequence0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(int v = 0; v < charSequence0.length(); ++v) {
            collection0.add(function10.invoke(Character.valueOf(charSequence0.charAt(v))));
        }
        return collection0;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxByOrNull(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
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
        IntIterator intIterator0 = r0.a.t(1, v1);
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

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final char maxByOrThrow(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException();
        }
        char c = charSequence0.charAt(0);
        int v = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v == 0) {
            return c;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(c));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            char c1 = charSequence0.charAt(intIterator0.nextInt());
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(c1));
            if(comparable0.compareTo(comparable1) < 0) {
                c = c1;
                comparable0 = comparable1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = charSequence0.charAt(intIterator0.nextInt());
            if(Intrinsics.compare(v, v1) < 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException();
        }
        char c = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = charSequence0.charAt(intIterator0.nextInt());
            if(Intrinsics.compare(c, c1) < 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull CharSequence charSequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = charSequence0.charAt(intIterator0.nextInt());
            if(comparator0.compare(Character.valueOf(((char)v)), Character.valueOf(((char)v1))) < 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull CharSequence charSequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException();
        }
        char c = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = charSequence0.charAt(intIterator0.nextInt());
            if(comparator0.compare(Character.valueOf(c), Character.valueOf(c1)) < 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minByOrNull(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
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
        IntIterator intIterator0 = r0.a.t(1, v1);
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

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final char minByOrThrow(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException();
        }
        char c = charSequence0.charAt(0);
        int v = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v == 0) {
            return c;
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(c));
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            char c1 = charSequence0.charAt(intIterator0.nextInt());
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(c1));
            if(comparable0.compareTo(comparable1) > 0) {
                c = c1;
                comparable0 = comparable1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = charSequence0.charAt(intIterator0.nextInt());
            if(Intrinsics.compare(v, v1) > 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException();
        }
        char c = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = charSequence0.charAt(intIterator0.nextInt());
            if(Intrinsics.compare(c, c1) > 0) {
                c = c1;
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull CharSequence charSequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = charSequence0.charAt(intIterator0.nextInt());
            if(comparator0.compare(Character.valueOf(((char)v)), Character.valueOf(((char)v1))) > 0) {
                v = v1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull CharSequence charSequence0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException();
        }
        char c = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            char c1 = charSequence0.charAt(intIterator0.nextInt());
            if(comparator0.compare(Character.valueOf(c), Character.valueOf(c1)) > 0) {
                c = c1;
            }
        }
        return c;
    }

    public static final boolean none(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() == 0;
    }

    public static final boolean none(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = 0; v < charSequence0.length(); ++v) {
            if(((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final CharSequence onEach(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(int v = 0; v < charSequence0.length(); ++v) {
            function10.invoke(Character.valueOf(charSequence0.charAt(v)));
        }
        return charSequence0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final CharSequence onEachIndexed(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(int v1 = 0; v < charSequence0.length(); ++v1) {
            function20.invoke(v1, Character.valueOf(charSequence0.charAt(v)));
            ++v;
        }
        return charSequence0;
    }

    @NotNull
    public static final Pair partition(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                stringBuilder0.append(((char)v1));
            }
            else {
                stringBuilder1.append(((char)v1));
            }
        }
        return new Pair(stringBuilder0, stringBuilder1);
    }

    @NotNull
    public static final Pair partition(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v2)))).booleanValue()) {
                stringBuilder0.append(((char)v2));
            }
            else {
                stringBuilder1.append(((char)v2));
            }
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        String s2 = stringBuilder1.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "toString(...)");
        return new Pair(s1, s2);
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharSequence charSequence0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence0.charAt(random0.nextInt(charSequence0.length()));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull CharSequence charSequence0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return charSequence0.length() == 0 ? null : Character.valueOf(charSequence0.charAt(random0.nextInt(charSequence0.length())));
    }

    public static final char reduce(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(charSequence0.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
        }
        char c = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            c = ((Character)function20.invoke(Character.valueOf(c), Character.valueOf(charSequence0.charAt(intIterator0.nextInt())))).charValue();
        }
        return c;
    }

    public static final char reduceIndexed(@NotNull CharSequence charSequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(charSequence0.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
        }
        char c = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            c = ((Character)function30.invoke(v, Character.valueOf(c), Character.valueOf(charSequence0.charAt(v)))).charValue();
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull CharSequence charSequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            v = ((Character)function30.invoke(v1, Character.valueOf(((char)v)), Character.valueOf(charSequence0.charAt(v1)))).charValue();
        }
        return Character.valueOf(((char)v));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(charSequence0.length() == 0) {
            return null;
        }
        int v = charSequence0.charAt(0);
        IntIterator intIterator0 = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            v = ((Character)function20.invoke(Character.valueOf(((char)v)), Character.valueOf(charSequence0.charAt(intIterator0.nextInt())))).charValue();
        }
        return Character.valueOf(((char)v));
    }

    public static final char reduceRight(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
        }
        int v1 = v - 1;
        char c = charSequence0.charAt(v);
        while(v1 >= 0) {
            c = ((Character)function20.invoke(Character.valueOf(charSequence0.charAt(v1)), Character.valueOf(c))).charValue();
            --v1;
        }
        return c;
    }

    public static final char reduceRightIndexed(@NotNull CharSequence charSequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v < 0) {
            throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
        }
        int v1 = v - 1;
        char c = charSequence0.charAt(v);
        while(v1 >= 0) {
            c = ((Character)function30.invoke(v1, Character.valueOf(charSequence0.charAt(v1)), Character.valueOf(c))).charValue();
            --v1;
        }
        return c;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull CharSequence charSequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = charSequence0.charAt(v);
        while(v1 >= 0) {
            v2 = ((Character)function30.invoke(v1, Character.valueOf(charSequence0.charAt(v1)), Character.valueOf(((char)v2)))).charValue();
            --v1;
        }
        return Character.valueOf(((char)v2));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = StringsKt__StringsKt.getLastIndex(charSequence0);
        if(v < 0) {
            return null;
        }
        int v1 = v - 1;
        int v2 = charSequence0.charAt(v);
        while(v1 >= 0) {
            v2 = ((Character)function20.invoke(Character.valueOf(charSequence0.charAt(v1)), Character.valueOf(((char)v2)))).charValue();
            --v1;
        }
        return Character.valueOf(((char)v2));
    }

    @NotNull
    public static final CharSequence reversed(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        CharSequence charSequence1 = new StringBuilder(charSequence0).reverse();
        Intrinsics.checkNotNullExpressionValue(charSequence1, "reverse(...)");
        return charSequence1;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningFold(@NotNull CharSequence charSequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(charSequence0.length() == 0) {
            return k.listOf(object0);
        }
        List list0 = new ArrayList(charSequence0.length() + 1);
        ((ArrayList)list0).add(object0);
        for(int v = 0; v < charSequence0.length(); ++v) {
            object0 = function20.invoke(object0, Character.valueOf(charSequence0.charAt(v)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningFoldIndexed(@NotNull CharSequence charSequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(charSequence0.length() == 0) {
            return k.listOf(object0);
        }
        List list0 = new ArrayList(charSequence0.length() + 1);
        ((ArrayList)list0).add(object0);
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function30.invoke(v1, object0, Character.valueOf(charSequence0.charAt(v1)));
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningReduce(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(charSequence0.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v = charSequence0.charAt(0);
        List list0 = new ArrayList(charSequence0.length());
        ((ArrayList)list0).add(Character.valueOf(((char)v)));
        int v1 = charSequence0.length();
        int v2 = 1;
        while(v2 < v1) {
            Character character0 = (Character)function20.invoke(Character.valueOf(((char)v)), Character.valueOf(charSequence0.charAt(v2)));
            ((ArrayList)list0).add(character0);
            ++v2;
            v = character0.charValue();
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List runningReduceIndexed(@NotNull CharSequence charSequence0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(charSequence0.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int v = charSequence0.charAt(0);
        List list0 = new ArrayList(charSequence0.length());
        ((ArrayList)list0).add(Character.valueOf(((char)v)));
        int v1 = charSequence0.length();
        int v2 = 1;
        while(v2 < v1) {
            Character character0 = (Character)function30.invoke(v2, Character.valueOf(((char)v)), Character.valueOf(charSequence0.charAt(v2)));
            ((ArrayList)list0).add(character0);
            ++v2;
            v = character0.charValue();
        }
        return list0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List scan(@NotNull CharSequence charSequence0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(charSequence0.length() == 0) {
            return k.listOf(object0);
        }
        ArrayList arrayList0 = new ArrayList(charSequence0.length() + 1);
        arrayList0.add(object0);
        for(int v = 0; v < charSequence0.length(); ++v) {
            object0 = function20.invoke(object0, Character.valueOf(charSequence0.charAt(v)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List scanIndexed(@NotNull CharSequence charSequence0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        if(charSequence0.length() == 0) {
            return k.listOf(object0);
        }
        ArrayList arrayList0 = new ArrayList(charSequence0.length() + 1);
        arrayList0.add(object0);
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function30.invoke(v1, object0, Character.valueOf(charSequence0.charAt(v1)));
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static char single(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        switch(charSequence0.length()) {
            case 0: {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            case 1: {
                return charSequence0.charAt(0);
            }
            default: {
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
        }
    }

    public static final char single(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Character character0 = null;
        boolean z = false;
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                if(z) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                character0 = Character.valueOf(((char)v1));
                z = true;
                continue;
            }
        }
        if(!z) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        Intrinsics.checkNotNull(character0, "null cannot be cast to non-null type kotlin.Char");
        return character0.charValue();
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() == 1 ? Character.valueOf(charSequence0.charAt(0)) : null;
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Character character0 = null;
        boolean z = false;
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = charSequence0.charAt(v);
            if(((Boolean)function10.invoke(Character.valueOf(((char)v1)))).booleanValue()) {
                if(z) {
                    return null;
                }
                character0 = Character.valueOf(((char)v1));
                z = true;
            }
        }
        return z ? character0 : null;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "indices");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        if(v == 0) {
            return "";
        }
        CharSequence charSequence1 = new StringBuilder(v);
        for(Object object0: iterable0) {
            ((StringBuilder)charSequence1).append(charSequence0.charAt(((Number)object0).intValue()));
        }
        return charSequence1;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence0, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence0, intRange0);
    }

    @NotNull
    public static final String slice(@NotNull String s, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "indices");
        return intRange0.isEmpty() ? "" : StringsKt__StringsKt.substring(s, intRange0);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v1 = 0;
        for(int v = 0; v < charSequence0.length(); ++v) {
            v1 += ((Number)q.k(charSequence0, v, function10)).intValue();
        }
        return v1;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        double f = 0.0;
        for(int v = 0; v < charSequence0.length(); ++v) {
            f += ((Number)q.k(charSequence0, v, function10)).doubleValue();
        }
        return f;
    }

    @NotNull
    public static final CharSequence take(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested character count " + v + " is less than zero.").toString());
        }
        return charSequence0.subSequence(0, c.coerceAtMost(v, charSequence0.length()));
    }

    @NotNull
    public static String take(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested character count " + v + " is less than zero.").toString());
        }
        String s1 = s.substring(0, c.coerceAtMost(v, s.length()));
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        return s1;
    }

    @NotNull
    public static final CharSequence takeLast(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested character count " + v + " is less than zero.").toString());
        }
        int v1 = charSequence0.length();
        return charSequence0.subSequence(v1 - c.coerceAtMost(v, v1), v1);
    }

    @NotNull
    public static final String takeLast(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(q.m(v, "Requested character count ", " is less than zero.").toString());
        }
        int v1 = s.length();
        String s1 = s.substring(v1 - c.coerceAtMost(v, v1));
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        return s1;
    }

    @NotNull
    public static final CharSequence takeLastWhile(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = StringsKt__StringsKt.getLastIndex(charSequence0); -1 < v; --v) {
            if(!((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                return charSequence0.subSequence(v + 1, charSequence0.length());
            }
        }
        return charSequence0.subSequence(0, charSequence0.length());
    }

    @NotNull
    public static final String takeLastWhile(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(int v = StringsKt__StringsKt.getLastIndex(s); -1 < v; --v) {
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v)))).booleanValue()) {
                String s1 = s.substring(v + 1);
                Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                return s1;
            }
        }
        return s;
    }

    @NotNull
    public static final CharSequence takeWhile(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)q.k(charSequence0, v1, function10)).booleanValue()) {
                return charSequence0.subSequence(0, v1);
            }
        }
        return charSequence0.subSequence(0, charSequence0.length());
    }

    @NotNull
    public static final String takeWhile(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v1)))).booleanValue()) {
                String s1 = s.substring(0, v1);
                Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                return s1;
            }
        }
        return s;
    }

    @NotNull
    public static Collection toCollection(@NotNull CharSequence charSequence0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        for(int v = 0; v < charSequence0.length(); ++v) {
            collection0.add(Character.valueOf(charSequence0.charAt(v)));
        }
        return collection0;
    }

    @NotNull
    public static final HashSet toHashSet(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return (HashSet)StringsKt___StringsKt.toCollection(charSequence0, new HashSet(w.mapCapacity(c.coerceAtMost(charSequence0.length(), 0x80))));
    }

    @NotNull
    public static final List toList(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        switch(charSequence0.length()) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(Character.valueOf(charSequence0.charAt(0)));
            }
            default: {
                return StringsKt___StringsKt.toMutableList(charSequence0);
            }
        }
    }

    @NotNull
    public static final List toMutableList(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return (List)StringsKt___StringsKt.toCollection(charSequence0, new ArrayList(charSequence0.length()));
    }

    @NotNull
    public static final Set toSet(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        switch(charSequence0.length()) {
            case 0: {
                return f0.emptySet();
            }
            case 1: {
                return e0.setOf(Character.valueOf(charSequence0.charAt(0)));
            }
            default: {
                return (Set)StringsKt___StringsKt.toCollection(charSequence0, new LinkedHashSet(w.mapCapacity(c.coerceAtMost(charSequence0.length(), 0x80))));
            }
        }
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List windowed(@NotNull CharSequence charSequence0, int v, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt___StringsKt.windowed(charSequence0, v, v1, z, j.z);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List windowed(@NotNull CharSequence charSequence0, int v, int v1, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        SlidingWindowKt.checkWindowSizeStep(v, v1);
        int v2 = charSequence0.length();
        List list0 = new ArrayList(v2 / v1 + (v2 % v1 == 0 ? 0 : 1));
        for(int v3 = 0; v3 >= 0 && v3 < v2; v3 += v1) {
            int v4 = v3 + v;
            if(v4 < 0 || v4 > v2) {
                if(!z) {
                    break;
                }
                v4 = v2;
            }
            ((ArrayList)list0).add(function10.invoke(charSequence0.subSequence(v3, v4)));
        }
        return list0;
    }

    public static List windowed$default(CharSequence charSequence0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return StringsKt___StringsKt.windowed(charSequence0, v, v1, z);
    }

    public static List windowed$default(CharSequence charSequence0, int v, int v1, boolean z, Function1 function10, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return StringsKt___StringsKt.windowed(charSequence0, v, v1, z, function10);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence windowedSequence(@NotNull CharSequence charSequence0, int v, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt___StringsKt.windowedSequence(charSequence0, v, v1, z, j.A);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence windowedSequence(@NotNull CharSequence charSequence0, int v, int v1, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        SlidingWindowKt.checkWindowSizeStep(v, v1);
        return z ? SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(c.step(StringsKt__StringsKt.getIndices(charSequence0), v1)), new f1(charSequence0, v, function10)) : SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(c.step(c.until(0, charSequence0.length() - v + 1), v1)), new f1(charSequence0, v, function10));
    }

    public static Sequence windowedSequence$default(CharSequence charSequence0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return StringsKt___StringsKt.windowedSequence(charSequence0, v, v1, z);
    }

    public static Sequence windowedSequence$default(CharSequence charSequence0, int v, int v1, boolean z, Function1 function10, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 1;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        return StringsKt___StringsKt.windowedSequence(charSequence0, v, v1, z, function10);
    }

    @NotNull
    public static final Iterable withIndex(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return new IndexingIterable(new j2.j(charSequence0, 17));
    }

    @NotNull
    public static final List zip(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        int v = Math.min(charSequence0.length(), charSequence1.length());
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(TuplesKt.to(Character.valueOf(charSequence0.charAt(v1)), Character.valueOf(charSequence1.charAt(v1))));
        }
        return list0;
    }

    @NotNull
    public static final List zip(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(charSequence0.length(), charSequence1.length());
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(function20.invoke(Character.valueOf(charSequence0.charAt(v1)), Character.valueOf(charSequence1.charAt(v1))));
        }
        return list0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List zipWithNext(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        int v = charSequence0.length();
        if(v - 1 < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList0 = new ArrayList(v - 1);
        int v1 = 0;
        while(v1 < v - 1) {
            int v2 = charSequence0.charAt(v1);
            ++v1;
            arrayList0.add(TuplesKt.to(Character.valueOf(((char)v2)), Character.valueOf(charSequence0.charAt(v1))));
        }
        return arrayList0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List zipWithNext(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = charSequence0.length();
        if(v - 1 < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(v - 1);
        int v1 = 0;
        while(v1 < v - 1) {
            Character character0 = Character.valueOf(charSequence0.charAt(v1));
            ++v1;
            ((ArrayList)list0).add(function20.invoke(character0, Character.valueOf(charSequence0.charAt(v1))));
        }
        return list0;
    }
}

