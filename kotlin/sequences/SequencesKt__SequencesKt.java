package kotlin.sequences;

import aa.a;
import j2.j;
import java.util.ArrayList;
import java.util.Iterator;
import kf.b;
import kf.c;
import kf.e;
import kf.f;
import kf.g;
import kf.h;
import kf.i;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SequencesKt__SequencesKt extends e {
    @NotNull
    public static Sequence asSequence(@NotNull Iterator iterator0) {
        Intrinsics.checkNotNullParameter(iterator0, "<this>");
        return SequencesKt__SequencesKt.constrainOnce(new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return iterator0;
            }
        });
    }

    @NotNull
    public static Sequence constrainOnce(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return !(sequence0 instanceof ConstrainedOnceSequence) ? new ConstrainedOnceSequence(sequence0) : sequence0;
    }

    @NotNull
    public static Sequence emptySequence() {
        return b.a;
    }

    @NotNull
    public static final Sequence flatMapIndexed(@NotNull Sequence sequence0, @NotNull Function2 function20, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "source");
        Intrinsics.checkNotNullParameter(function20, "transform");
        Intrinsics.checkNotNullParameter(function10, "iterator");
        return SequencesKt__SequenceBuilderKt.sequence(new f(sequence0, function20, function10, null));
    }

    @NotNull
    public static final Sequence flatten(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        g g0 = g.x;
        return sequence0 instanceof TransformingSequence ? ((TransformingSequence)sequence0).flatten$kotlin_stdlib(g0) : new FlatteningSequence(sequence0, g.z, g0);
    }

    @JvmName(name = "flattenSequenceOfIterable")
    @NotNull
    public static final Sequence flattenSequenceOfIterable(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        g g0 = g.y;
        return sequence0 instanceof TransformingSequence ? ((TransformingSequence)sequence0).flatten$kotlin_stdlib(g0) : new FlatteningSequence(sequence0, g.z, g0);
    }

    @LowPriorityInOverloadResolution
    @NotNull
    public static Sequence generateSequence(@Nullable Object object0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "nextFunction");
        return object0 == null ? b.a : new c(new j(object0, 6), function10);
    }

    @NotNull
    public static Sequence generateSequence(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "nextFunction");
        return SequencesKt__SequencesKt.constrainOnce(new c(function00, new a(function00, 13)));
    }

    @NotNull
    public static Sequence generateSequence(@NotNull Function0 function00, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function00, "seedFunction");
        Intrinsics.checkNotNullParameter(function10, "nextFunction");
        return new c(function00, function10);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Sequence ifEmpty(@NotNull Sequence sequence0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        return SequencesKt__SequenceBuilderKt.sequence(new h(sequence0, function00, null));
    }

    @NotNull
    public static Sequence sequenceOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return arr_object.length == 0 ? SequencesKt__SequencesKt.emptySequence() : ArraysKt___ArraysKt.asSequence(arr_object);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Sequence shuffled(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return SequencesKt__SequencesKt.shuffled(sequence0, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Sequence shuffled(@NotNull Sequence sequence0, @NotNull Random random0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Intrinsics.checkNotNullParameter(random0, "random");
        return SequencesKt__SequenceBuilderKt.sequence(new i(sequence0, random0, null));
    }

    @NotNull
    public static final Pair unzip(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: sequence0) {
            arrayList0.add(((Pair)object0).getFirst());
            arrayList1.add(((Pair)object0).getSecond());
        }
        return TuplesKt.to(arrayList0, arrayList1);
    }
}

