package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class StringsKt__StringsKt extends p {
    public static final Pair a(CharSequence charSequence0, Collection collection0, int v, boolean z, boolean z1) {
        if(!z && collection0.size() == 1) {
            String s = (String)CollectionsKt___CollectionsKt.single(collection0);
            int v1 = z1 ? StringsKt__StringsKt.lastIndexOf$default(charSequence0, s, v, false, 4, null) : StringsKt__StringsKt.indexOf$default(charSequence0, s, v, false, 4, null);
            return v1 < 0 ? null : TuplesKt.to(v1, s);
        }
        IntProgression intProgression0 = z1 ? c.downTo(c.coerceAtMost(v, StringsKt__StringsKt.getLastIndex(charSequence0)), 0) : new IntRange(c.coerceAtLeast(v, 0), charSequence0.length());
        if(charSequence0 instanceof String) {
            int v2 = intProgression0.getFirst();
            int v3 = intProgression0.getLast();
            int v4 = intProgression0.getStep();
            if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
                while(true) {
                    for(Object object0: collection0) {
                        if(!p.regionMatches(((String)object0), 0, ((String)charSequence0), v2, ((String)object0).length(), z)) {
                            continue;
                        }
                        goto label_19;
                    }
                    object0 = null;
                label_19:
                    if(((String)object0) != null) {
                        return TuplesKt.to(v2, ((String)object0));
                    }
                    if(v2 == v3) {
                        break;
                    }
                    v2 += v4;
                }
            }
        }
        else {
            int v5 = intProgression0.getFirst();
            int v6 = intProgression0.getLast();
            int v7 = intProgression0.getStep();
            if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                while(true) {
                    for(Object object1: collection0) {
                        if(!StringsKt__StringsKt.regionMatchesImpl(((String)object1), 0, charSequence0, v5, ((String)object1).length(), z)) {
                            continue;
                        }
                        goto label_34;
                    }
                    object1 = null;
                label_34:
                    if(((String)object1) != null) {
                        return TuplesKt.to(v5, ((String)object1));
                    }
                    if(v5 == v6) {
                        break;
                    }
                    v5 += v7;
                }
            }
        }
        return null;
    }

    public static final int b(CharSequence charSequence0, CharSequence charSequence1, int v, int v1, boolean z, boolean z1) {
        IntProgression intProgression0 = z1 ? c.downTo(c.coerceAtMost(v, StringsKt__StringsKt.getLastIndex(charSequence0)), c.coerceAtLeast(v1, 0)) : new IntRange(c.coerceAtLeast(v, 0), c.coerceAtMost(v1, charSequence0.length()));
        if(!(charSequence0 instanceof String) || !(charSequence1 instanceof String)) {
            int v5 = intProgression0.getFirst();
            int v6 = intProgression0.getLast();
            int v7 = intProgression0.getStep();
            if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                while(true) {
                    if(StringsKt__StringsKt.regionMatchesImpl(charSequence1, 0, charSequence0, v5, charSequence1.length(), z)) {
                        return v5;
                    }
                    if(v5 == v6) {
                        break;
                    }
                    v5 += v7;
                }
            }
        }
        else {
            int v2 = intProgression0.getFirst();
            int v3 = intProgression0.getLast();
            int v4 = intProgression0.getStep();
            if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
                while(true) {
                    if(p.regionMatches(((String)charSequence1), 0, ((String)charSequence0), v2, ((String)charSequence1).length(), z)) {
                        return v2;
                    }
                    if(v2 == v3) {
                        break;
                    }
                    v2 += v4;
                }
            }
        }
        return -1;
    }

    public static d c(CharSequence charSequence0, char[] arr_c, boolean z, int v) {
        StringsKt__StringsKt.requireNonNegativeLimit(v);
        return new d(charSequence0, 0, v, new r(arr_c, z, 0));
    }

    @NotNull
    public static final String commonPrefixWith(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        int v = Math.min(charSequence0.length(), charSequence1.length());
        int v1;
        for(v1 = 0; v1 < v && kotlin.text.c.equals(charSequence0.charAt(v1), charSequence1.charAt(v1), z); ++v1) {
        }
        if(StringsKt__StringsKt.hasSurrogatePairAt(charSequence0, v1 - 1) || StringsKt__StringsKt.hasSurrogatePairAt(charSequence1, v1 - 1)) {
            --v1;
        }
        return charSequence0.subSequence(0, v1).toString();
    }

    public static String commonPrefixWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.commonPrefixWith(charSequence0, charSequence1, z);
    }

    @NotNull
    public static final String commonSuffixWith(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        int v = charSequence0.length();
        int v1 = charSequence1.length();
        int v2 = Math.min(v, v1);
        int v3;
        for(v3 = 0; v3 < v2 && kotlin.text.c.equals(charSequence0.charAt(v - v3 - 1), charSequence1.charAt(v1 - v3 - 1), z); ++v3) {
        }
        if(StringsKt__StringsKt.hasSurrogatePairAt(charSequence0, v - v3 - 1) || StringsKt__StringsKt.hasSurrogatePairAt(charSequence1, v1 - v3 - 1)) {
            --v3;
        }
        return charSequence0.subSequence(v - v3, v).toString();
    }

    public static String commonSuffixWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.commonSuffixWith(charSequence0, charSequence1, z);
    }

    public static final boolean contains(@NotNull CharSequence charSequence0, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt__StringsKt.indexOf$default(charSequence0, c, 0, z, 2, null) >= 0;
    }

    public static boolean contains(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        return charSequence1 instanceof String ? StringsKt__StringsKt.indexOf$default(charSequence0, ((String)charSequence1), 0, z, 2, null) >= 0 : StringsKt__StringsKt.b(charSequence0, charSequence1, 0, charSequence0.length(), z, false) >= 0;
    }

    public static boolean contains$default(CharSequence charSequence0, char c, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.contains(charSequence0, c, z);
    }

    public static boolean contains$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.contains(charSequence0, charSequence1, z);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(@Nullable CharSequence charSequence0, @Nullable CharSequence charSequence1) {
        if(charSequence0 instanceof String && charSequence1 instanceof String) {
            return p.equals(((String)charSequence0), ((String)charSequence1), true);
        }
        if(charSequence0 == charSequence1) {
            return true;
        }
        if(charSequence0 != null && charSequence1 != null && charSequence0.length() == charSequence1.length()) {
            int v = charSequence0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(!kotlin.text.c.equals(charSequence0.charAt(v1), charSequence1.charAt(v1), true)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean contentEqualsImpl(@Nullable CharSequence charSequence0, @Nullable CharSequence charSequence1) {
        if(charSequence0 instanceof String && charSequence1 instanceof String) {
            return Intrinsics.areEqual(charSequence0, charSequence1);
        }
        if(charSequence0 == charSequence1) {
            return true;
        }
        if(charSequence0 != null && charSequence1 != null && charSequence0.length() == charSequence1.length()) {
            int v = charSequence0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(charSequence0.charAt(v1) != charSequence1.charAt(v1)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static d d(CharSequence charSequence0, String[] arr_s, boolean z, int v) {
        StringsKt__StringsKt.requireNonNegativeLimit(v);
        return new d(charSequence0, 0, v, new r(ArraysKt___ArraysJvmKt.asList(arr_s), z, 1));
    }

    public static final List e(CharSequence charSequence0, String s, int v, boolean z) {
        StringsKt__StringsKt.requireNonNegativeLimit(v);
        int v1 = 0;
        int v2 = StringsKt__StringsKt.indexOf(charSequence0, s, 0, z);
        if(v2 != -1 && v != 1) {
            List list0 = new ArrayList((v <= 0 ? c.coerceAtMost(v, 10) : 10));
            do {
                ((ArrayList)list0).add(charSequence0.subSequence(v1, v2).toString());
                v1 = s.length() + v2;
                if(v > 0 && ((ArrayList)list0).size() == v - 1) {
                    break;
                }
                v2 = StringsKt__StringsKt.indexOf(charSequence0, s, v1, z);
            }
            while(v2 != -1);
            ((ArrayList)list0).add(charSequence0.subSequence(v1, charSequence0.length()).toString());
            return list0;
        }
        return k.listOf(charSequence0.toString());
    }

    public static final boolean endsWith(@NotNull CharSequence charSequence0, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() > 0 && kotlin.text.c.equals(charSequence0.charAt(StringsKt__StringsKt.getLastIndex(charSequence0)), c, z);
    }

    public static final boolean endsWith(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "suffix");
        return z || !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt__StringsKt.regionMatchesImpl(charSequence0, charSequence0.length() - charSequence1.length(), charSequence1, 0, charSequence1.length(), z) : p.endsWith$default(((String)charSequence0), ((String)charSequence1), false, 2, null);
    }

    public static boolean endsWith$default(CharSequence charSequence0, char c, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.endsWith(charSequence0, c, z);
    }

    public static boolean endsWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.endsWith(charSequence0, charSequence1, z);
    }

    @Nullable
    public static final Pair findAnyOf(@NotNull CharSequence charSequence0, @NotNull Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        return StringsKt__StringsKt.a(charSequence0, collection0, v, z, false);
    }

    public static Pair findAnyOf$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.findAnyOf(charSequence0, collection0, v, z);
    }

    @Nullable
    public static final Pair findLastAnyOf(@NotNull CharSequence charSequence0, @NotNull Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        return StringsKt__StringsKt.a(charSequence0, collection0, v, z, true);
    }

    public static Pair findLastAnyOf$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt__StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.findLastAnyOf(charSequence0, collection0, v, z);
    }

    @NotNull
    public static IntRange getIndices(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return new IntRange(0, charSequence0.length() - 1);
    }

    public static int getLastIndex(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return new IntRange(0, charSequence0.length() - 2).contains(v) && Character.isHighSurrogate(charSequence0.charAt(v)) && Character.isLowSurrogate(charSequence0.charAt(v + 1));
    }

    public static int indexOf(@NotNull CharSequence charSequence0, char c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return z || !(charSequence0 instanceof String) ? StringsKt__StringsKt.indexOfAny(charSequence0, new char[]{c}, v, z) : ((String)charSequence0).indexOf(((int)c), v);
    }

    public static int indexOf(@NotNull CharSequence charSequence0, @NotNull String s, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(s, "string");
        return z || !(charSequence0 instanceof String) ? StringsKt__StringsKt.b(charSequence0, s, v, charSequence0.length(), z, false) : ((String)charSequence0).indexOf(s, v);
    }

    public static int indexOf$default(CharSequence charSequence0, char c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.indexOf(charSequence0, c, v, z);
    }

    public static int indexOf$default(CharSequence charSequence0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.indexOf(charSequence0, s, v, z);
    }

    public static final int indexOfAny(@NotNull CharSequence charSequence0, @NotNull Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        Pair pair0 = StringsKt__StringsKt.a(charSequence0, collection0, v, z, false);
        return pair0 == null ? -1 : ((Number)pair0.getFirst()).intValue();
    }

    public static final int indexOfAny(@NotNull CharSequence charSequence0, @NotNull char[] arr_c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        if(!z && arr_c.length == 1 && charSequence0 instanceof String) {
            return ((String)charSequence0).indexOf(ArraysKt___ArraysKt.single(arr_c), v);
        }
        IntIterator intIterator0 = new IntRange(c.coerceAtLeast(v, 0), StringsKt__StringsKt.getLastIndex(charSequence0)).iterator();
        while(intIterator0.hasNext()) {
            int v1 = intIterator0.nextInt();
            int v2 = charSequence0.charAt(v1);
            for(int v3 = 0; v3 < arr_c.length; ++v3) {
                if(kotlin.text.c.equals(arr_c[v3], ((char)v2), z)) {
                    return v1;
                }
            }
        }
        return -1;
    }

    public static int indexOfAny$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.indexOfAny(charSequence0, collection0, v, z);
    }

    public static int indexOfAny$default(CharSequence charSequence0, char[] arr_c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.indexOfAny(charSequence0, arr_c, v, z);
    }

    @NotNull
    public static final CharIterator iterator(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return new CharIterator() {
            public int a;

            @Override
            public boolean hasNext() {
                return this.a < charSequence0.length();
            }

            @Override  // kotlin.collections.CharIterator
            public char nextChar() {
                int v = this.a;
                this.a = v + 1;
                return charSequence0.charAt(v);
            }
        };
    }

    public static int lastIndexOf(@NotNull CharSequence charSequence0, char c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return z || !(charSequence0 instanceof String) ? StringsKt__StringsKt.lastIndexOfAny(charSequence0, new char[]{c}, v, z) : ((String)charSequence0).lastIndexOf(((int)c), v);
    }

    public static final int lastIndexOf(@NotNull CharSequence charSequence0, @NotNull String s, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(s, "string");
        return z || !(charSequence0 instanceof String) ? StringsKt__StringsKt.b(charSequence0, s, v, 0, z, true) : ((String)charSequence0).lastIndexOf(s, v);
    }

    public static int lastIndexOf$default(CharSequence charSequence0, char c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt__StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.lastIndexOf(charSequence0, c, v, z);
    }

    public static int lastIndexOf$default(CharSequence charSequence0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt__StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.lastIndexOf(charSequence0, s, v, z);
    }

    public static final int lastIndexOfAny(@NotNull CharSequence charSequence0, @NotNull Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        Pair pair0 = StringsKt__StringsKt.a(charSequence0, collection0, v, z, true);
        return pair0 == null ? -1 : ((Number)pair0.getFirst()).intValue();
    }

    public static final int lastIndexOfAny(@NotNull CharSequence charSequence0, @NotNull char[] arr_c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        if(!z && arr_c.length == 1 && charSequence0 instanceof String) {
            return ((String)charSequence0).lastIndexOf(ArraysKt___ArraysKt.single(arr_c), v);
        }
        for(int v1 = c.coerceAtMost(v, StringsKt__StringsKt.getLastIndex(charSequence0)); -1 < v1; --v1) {
            int v2 = charSequence0.charAt(v1);
            for(int v3 = 0; v3 < arr_c.length; ++v3) {
                if(kotlin.text.c.equals(arr_c[v3], ((char)v2), z)) {
                    return v1;
                }
            }
        }
        return -1;
    }

    public static int lastIndexOfAny$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt__StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.lastIndexOfAny(charSequence0, collection0, v, z);
    }

    public static int lastIndexOfAny$default(CharSequence charSequence0, char[] arr_c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt__StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.lastIndexOfAny(charSequence0, arr_c, v, z);
    }

    @NotNull
    public static final Sequence lineSequence(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return StringsKt__StringsKt.splitToSequence$default(charSequence0, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @NotNull
    public static final List lines(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return SequencesKt___SequencesKt.toList(StringsKt__StringsKt.lineSequence(charSequence0));
    }

    @NotNull
    public static final CharSequence padEnd(@NotNull CharSequence charSequence0, int v, char c) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException("Desired length " + v + " is less than zero.");
        }
        if(v <= charSequence0.length()) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        CharSequence charSequence1 = new StringBuilder(v);
        ((StringBuilder)charSequence1).append(charSequence0);
        IntIterator intIterator0 = new IntRange(1, v - charSequence0.length()).iterator();
        while(intIterator0.hasNext()) {
            intIterator0.nextInt();
            ((StringBuilder)charSequence1).append(c);
        }
        return charSequence1;
    }

    @NotNull
    public static final String padEnd(@NotNull String s, int v, char c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return StringsKt__StringsKt.padEnd(s, v, c).toString();
    }

    public static CharSequence padEnd$default(CharSequence charSequence0, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt__StringsKt.padEnd(charSequence0, v, c);
    }

    public static String padEnd$default(String s, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt__StringsKt.padEnd(s, v, c);
    }

    @NotNull
    public static final CharSequence padStart(@NotNull CharSequence charSequence0, int v, char c) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException("Desired length " + v + " is less than zero.");
        }
        if(v <= charSequence0.length()) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        CharSequence charSequence1 = new StringBuilder(v);
        IntIterator intIterator0 = new IntRange(1, v - charSequence0.length()).iterator();
        while(intIterator0.hasNext()) {
            intIterator0.nextInt();
            ((StringBuilder)charSequence1).append(c);
        }
        ((StringBuilder)charSequence1).append(charSequence0);
        return charSequence1;
    }

    @NotNull
    public static String padStart(@NotNull String s, int v, char c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return StringsKt__StringsKt.padStart(s, v, c).toString();
    }

    public static CharSequence padStart$default(CharSequence charSequence0, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt__StringsKt.padStart(charSequence0, v, c);
    }

    public static String padStart$default(String s, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt__StringsKt.padStart(s, v, c);
    }

    public static final boolean regionMatchesImpl(@NotNull CharSequence charSequence0, int v, @NotNull CharSequence charSequence1, int v1, int v2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        if(v1 >= 0 && v >= 0 && v <= charSequence0.length() - v2 && v1 <= charSequence1.length() - v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!kotlin.text.c.equals(charSequence0.charAt(v + v3), charSequence1.charAt(v1 + v3), z)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static final CharSequence removePrefix(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return StringsKt__StringsKt.startsWith$default(charSequence0, charSequence1, false, 2, null) ? charSequence0.subSequence(charSequence1.length(), charSequence0.length()) : charSequence0.subSequence(0, charSequence0.length());
    }

    @NotNull
    public static String removePrefix(@NotNull String s, @NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "prefix");
        if(StringsKt__StringsKt.startsWith$default(s, charSequence0, false, 2, null)) {
            s = s.substring(charSequence0.length());
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
        }
        return s;
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(v1 < v) {
            throw new IndexOutOfBoundsException("End index (" + v1 + ") is less than start index (" + v + ").");
        }
        if(v1 == v) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        CharSequence charSequence1 = new StringBuilder(charSequence0.length() - (v1 - v));
        ((StringBuilder)charSequence1).append(charSequence0, 0, v);
        Intrinsics.checkNotNullExpressionValue(charSequence1, "append(...)");
        ((StringBuilder)charSequence1).append(charSequence0, v1, charSequence0.length());
        Intrinsics.checkNotNullExpressionValue(charSequence1, "append(...)");
        return charSequence1;
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence charSequence0, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return StringsKt__StringsKt.removeRange(charSequence0, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final CharSequence removeSuffix(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "suffix");
        return StringsKt__StringsKt.endsWith$default(charSequence0, charSequence1, false, 2, null) ? charSequence0.subSequence(0, charSequence0.length() - charSequence1.length()) : charSequence0.subSequence(0, charSequence0.length());
    }

    @NotNull
    public static String removeSuffix(@NotNull String s, @NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "suffix");
        if(StringsKt__StringsKt.endsWith$default(s, charSequence0, false, 2, null)) {
            s = s.substring(0, s.length() - charSequence0.length());
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
        }
        return s;
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "delimiter");
        return StringsKt__StringsKt.removeSurrounding(charSequence0, charSequence1, charSequence1);
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "suffix");
        int v = charSequence0.length();
        int v1 = charSequence1.length();
        return v < charSequence2.length() + v1 || !StringsKt__StringsKt.startsWith$default(charSequence0, charSequence1, false, 2, null) || !StringsKt__StringsKt.endsWith$default(charSequence0, charSequence2, false, 2, null) ? charSequence0.subSequence(0, charSequence0.length()) : charSequence0.subSequence(charSequence1.length(), charSequence0.length() - charSequence2.length());
    }

    @NotNull
    public static String removeSurrounding(@NotNull String s, @NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "delimiter");
        return StringsKt__StringsKt.removeSurrounding(s, charSequence0, charSequence0);
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String s, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "prefix");
        Intrinsics.checkNotNullParameter(charSequence1, "suffix");
        int v = charSequence0.length();
        if(s.length() >= charSequence1.length() + v && StringsKt__StringsKt.startsWith$default(s, charSequence0, false, 2, null) && StringsKt__StringsKt.endsWith$default(s, charSequence1, false, 2, null)) {
            s = s.substring(charSequence0.length(), s.length() - charSequence1.length());
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
        }
        return s;
    }

    @NotNull
    public static final String replaceAfter(@NotNull String s, char c, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt__StringsKt.replaceRange(s, v + 1, s.length(), s1).toString();
    }

    @NotNull
    public static final String replaceAfter(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt__StringsKt.replaceRange(s, s1.length() + v, s.length(), s2).toString();
    }

    public static String replaceAfter$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.replaceAfter(s, c, s1, s2);
    }

    public static String replaceAfter$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt__StringsKt.replaceAfter(s, s1, s2, s3);
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String s, char c, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt__StringsKt.replaceRange(s, v + 1, s.length(), s1).toString();
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt__StringsKt.replaceRange(s, s1.length() + v, s.length(), s2).toString();
    }

    public static String replaceAfterLast$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.replaceAfterLast(s, c, s1, s2);
    }

    public static String replaceAfterLast$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt__StringsKt.replaceAfterLast(s, s1, s2, s3);
    }

    @NotNull
    public static final String replaceBefore(@NotNull String s, char c, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt__StringsKt.replaceRange(s, 0, v, s1).toString();
    }

    @NotNull
    public static final String replaceBefore(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt__StringsKt.replaceRange(s, 0, v, s2).toString();
    }

    public static String replaceBefore$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.replaceBefore(s, c, s1, s2);
    }

    public static String replaceBefore$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt__StringsKt.replaceBefore(s, s1, s2, s3);
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String s, char c, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt__StringsKt.replaceRange(s, 0, v, s1).toString();
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt__StringsKt.replaceRange(s, 0, v, s2).toString();
    }

    public static String replaceBeforeLast$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.replaceBeforeLast(s, c, s1, s2);
    }

    public static String replaceBeforeLast$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt__StringsKt.replaceBeforeLast(s, s1, s2, s3);
    }

    @NotNull
    public static CharSequence replaceRange(@NotNull CharSequence charSequence0, int v, int v1, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "replacement");
        if(v1 < v) {
            throw new IndexOutOfBoundsException("End index (" + v1 + ") is less than start index (" + v + ").");
        }
        CharSequence charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append(charSequence0, 0, v);
        Intrinsics.checkNotNullExpressionValue(charSequence2, "append(...)");
        ((StringBuilder)charSequence2).append(charSequence1);
        ((StringBuilder)charSequence2).append(charSequence0, v1, charSequence0.length());
        Intrinsics.checkNotNullExpressionValue(charSequence2, "append(...)");
        return charSequence2;
    }

    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence charSequence0, @NotNull IntRange intRange0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        Intrinsics.checkNotNullParameter(charSequence1, "replacement");
        return StringsKt__StringsKt.replaceRange(charSequence0, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1, charSequence1);
    }

    public static final void requireNonNegativeLimit(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + v).toString());
        }
    }

    @NotNull
    public static final List split(@NotNull CharSequence charSequence0, @NotNull char[] arr_c, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "delimiters");
        if(arr_c.length == 1) {
            return StringsKt__StringsKt.e(charSequence0, String.valueOf(arr_c[0]), v, z);
        }
        Iterable iterable0 = SequencesKt___SequencesKt.asIterable(StringsKt__StringsKt.c(charSequence0, arr_c, z, v));
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(StringsKt__StringsKt.substring(charSequence0, ((IntRange)object0)));
        }
        return list0;
    }

    @NotNull
    public static final List split(@NotNull CharSequence charSequence0, @NotNull String[] arr_s, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_s, "delimiters");
        if(arr_s.length == 1) {
            String s = arr_s[0];
            if(s.length() != 0) {
                return StringsKt__StringsKt.e(charSequence0, s, v, z);
            }
        }
        Iterable iterable0 = SequencesKt___SequencesKt.asIterable(StringsKt__StringsKt.d(charSequence0, arr_s, z, v));
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(StringsKt__StringsKt.substring(charSequence0, ((IntRange)object0)));
        }
        return list0;
    }

    public static List split$default(CharSequence charSequence0, char[] arr_c, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt__StringsKt.split(charSequence0, arr_c, z, v);
    }

    public static List split$default(CharSequence charSequence0, String[] arr_s, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt__StringsKt.split(charSequence0, arr_s, z, v);
    }

    @NotNull
    public static final Sequence splitToSequence(@NotNull CharSequence charSequence0, @NotNull char[] arr_c, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "delimiters");
        return SequencesKt___SequencesKt.map(StringsKt__StringsKt.c(charSequence0, arr_c, z, v), new s(charSequence0, 1));
    }

    @NotNull
    public static final Sequence splitToSequence(@NotNull CharSequence charSequence0, @NotNull String[] arr_s, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_s, "delimiters");
        return SequencesKt___SequencesKt.map(StringsKt__StringsKt.d(charSequence0, arr_s, z, v), new s(charSequence0, 0));
    }

    public static Sequence splitToSequence$default(CharSequence charSequence0, char[] arr_c, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt__StringsKt.splitToSequence(charSequence0, arr_c, z, v);
    }

    public static Sequence splitToSequence$default(CharSequence charSequence0, String[] arr_s, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt__StringsKt.splitToSequence(charSequence0, arr_s, z, v);
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence0, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return charSequence0.length() > 0 && kotlin.text.c.equals(charSequence0.charAt(0), c, z);
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return z || !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt__StringsKt.regionMatchesImpl(charSequence0, v, charSequence1, 0, charSequence1.length(), z) : p.startsWith$default(((String)charSequence0), ((String)charSequence1), v, false, 4, null);
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return z || !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt__StringsKt.regionMatchesImpl(charSequence0, 0, charSequence1, 0, charSequence1.length(), z) : p.startsWith$default(((String)charSequence0), ((String)charSequence1), false, 2, null);
    }

    public static boolean startsWith$default(CharSequence charSequence0, char c, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.startsWith(charSequence0, c, z);
    }

    public static boolean startsWith$default(CharSequence charSequence0, CharSequence charSequence1, int v, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.startsWith(charSequence0, charSequence1, v, z);
    }

    public static boolean startsWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.startsWith(charSequence0, charSequence1, z);
    }

    @NotNull
    public static final CharSequence subSequence(@NotNull CharSequence charSequence0, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return charSequence0.subSequence(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @NotNull
    public static final String substring(@NotNull CharSequence charSequence0, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return charSequence0.subSequence(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1).toString();
    }

    @NotNull
    public static String substring(@NotNull String s, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        String s1 = s.substring(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        return s1;
    }

    @NotNull
    public static String substringAfter(@NotNull String s, char c, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(v + 1, s.length());
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        }
        return s1;
    }

    @NotNull
    public static String substringAfter(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(s1.length() + v, s.length());
            Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        }
        return s2;
    }

    public static String substringAfter$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt__StringsKt.substringAfter(s, c, s1);
    }

    public static String substringAfter$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.substringAfter(s, s1, s2);
    }

    @NotNull
    public static String substringAfterLast(@NotNull String s, char c, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(v + 1, s.length());
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        }
        return s1;
    }

    @NotNull
    public static String substringAfterLast(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(s1.length() + v, s.length());
            Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        }
        return s2;
    }

    public static String substringAfterLast$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt__StringsKt.substringAfterLast(s, c, s1);
    }

    public static String substringAfterLast$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.substringAfterLast(s, s1, s2);
    }

    @NotNull
    public static final String substringBefore(@NotNull String s, char c, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        }
        return s1;
    }

    @NotNull
    public static final String substringBefore(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        }
        return s2;
    }

    public static String substringBefore$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt__StringsKt.substringBefore(s, c, s1);
    }

    public static String substringBefore$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.substringBefore(s, s1, s2);
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String s, char c, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        }
        return s1;
    }

    @NotNull
    public static String substringBeforeLast(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt__StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        }
        return s2;
    }

    public static String substringBeforeLast$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt__StringsKt.substringBeforeLast(s, c, s1);
    }

    public static String substringBeforeLast$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt__StringsKt.substringBeforeLast(s, s1, s2);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean toBooleanStrict(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(Intrinsics.areEqual(s, "true")) {
            return true;
        }
        if(!Intrinsics.areEqual(s, "false")) {
            throw new IllegalArgumentException("The string doesn\'t represent a boolean value: " + s);
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static Boolean toBooleanStrictOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(Intrinsics.areEqual(s, "true")) {
            return true;
        }
        return Intrinsics.areEqual(s, "false") ? false : null;
    }

    @NotNull
    public static CharSequence trim(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = b.isWhitespace(charSequence0.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ((Boolean)q.k(charSequence0, (z ? v : v1), function10)).booleanValue();
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence0, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ArraysKt___ArraysKt.contains(arr_c, charSequence0.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    @NotNull
    public static final String trim(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ((Boolean)function10.invoke(Character.valueOf(s.charAt((z ? v : v1))))).booleanValue();
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return s.subSequence(v1, v + 1).toString();
    }

    @NotNull
    public static final String trim(@NotNull String s, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = s.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ArraysKt___ArraysKt.contains(arr_c, s.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return s.subSequence(v1, v + 1).toString();
    }

    @NotNull
    public static CharSequence trimEnd(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        int v = charSequence0.length() - 1;
        if(v >= 0) {
            while(true) {
                if(!b.isWhitespace(charSequence0.charAt(v))) {
                    return charSequence0.subSequence(0, v + 1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length() - 1;
        if(v >= 0) {
            while(true) {
                if(!((Boolean)q.k(charSequence0, v, function10)).booleanValue()) {
                    return charSequence0.subSequence(0, v + 1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence0, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = charSequence0.length() - 1;
        if(v >= 0) {
            while(true) {
                if(!ArraysKt___ArraysKt.contains(arr_c, charSequence0.charAt(v))) {
                    return charSequence0.subSequence(0, v + 1);
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return "";
    }

    @NotNull
    public static final String trimEnd(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length() - 1;
        if(v >= 0) {
            while(true) {
                if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v)))).booleanValue()) {
                    return s.subSequence(0, v + 1).toString();
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return "";
    }

    @NotNull
    public static final String trimEnd(@NotNull String s, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = s.length() - 1;
        if(v >= 0) {
            while(true) {
                if(!ArraysKt___ArraysKt.contains(arr_c, s.charAt(v))) {
                    return s.subSequence(0, v + 1).toString();
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return "";
    }

    @NotNull
    public static CharSequence trimStart(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!b.isWhitespace(charSequence0.charAt(v1))) {
                return charSequence0.subSequence(v1, charSequence0.length());
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
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
    public static final CharSequence trimStart(@NotNull CharSequence charSequence0, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!ArraysKt___ArraysKt.contains(arr_c, charSequence0.charAt(v1))) {
                return charSequence0.subSequence(v1, charSequence0.length());
            }
        }
        return "";
    }

    @NotNull
    public static final String trimStart(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v1)))).booleanValue()) {
                return s.subSequence(v1, s.length()).toString();
            }
        }
        return "";
    }

    @NotNull
    public static String trimStart(@NotNull String s, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!ArraysKt___ArraysKt.contains(arr_c, s.charAt(v1))) {
                return s.subSequence(v1, s.length()).toString();
            }
        }
        return "";
    }
}

