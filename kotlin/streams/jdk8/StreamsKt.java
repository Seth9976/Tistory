package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lf.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001A\u0012\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001A\u0012\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001A\u0012\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001A\u001E\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001A\u001E\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001A\u0012\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001A\u0012\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001A\u0012\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001A\u001E\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.streams", xi = 0x30)
@JvmName(name = "StreamsKt")
public final class StreamsKt {
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence asSequence(@NotNull DoubleStream doubleStream0) {
        Intrinsics.checkNotNullParameter(doubleStream0, "<this>");
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                Iterator iterator0 = doubleStream0.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "iterator(...)");
                return iterator0;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence asSequence(@NotNull IntStream intStream0) {
        Intrinsics.checkNotNullParameter(intStream0, "<this>");
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                Iterator iterator0 = intStream0.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "iterator(...)");
                return iterator0;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence asSequence(@NotNull LongStream longStream0) {
        Intrinsics.checkNotNullParameter(longStream0, "<this>");
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                Iterator iterator0 = longStream0.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "iterator(...)");
                return iterator0;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence asSequence(@NotNull Stream stream0) {
        Intrinsics.checkNotNullParameter(stream0, "<this>");
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                Iterator iterator0 = stream0.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "iterator(...)");
                return iterator0;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Stream asStream(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        Stream stream0 = StreamSupport.stream(new a(sequence0), 16, false);
        Intrinsics.checkNotNullExpressionValue(stream0, "stream(...)");
        return stream0;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List toList(@NotNull DoubleStream doubleStream0) {
        Intrinsics.checkNotNullParameter(doubleStream0, "<this>");
        double[] arr_f = doubleStream0.toArray();
        Intrinsics.checkNotNullExpressionValue(arr_f, "toArray(...)");
        return ArraysKt___ArraysJvmKt.asList(arr_f);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List toList(@NotNull IntStream intStream0) {
        Intrinsics.checkNotNullParameter(intStream0, "<this>");
        int[] arr_v = intStream0.toArray();
        Intrinsics.checkNotNullExpressionValue(arr_v, "toArray(...)");
        return ArraysKt___ArraysJvmKt.asList(arr_v);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List toList(@NotNull LongStream longStream0) {
        Intrinsics.checkNotNullParameter(longStream0, "<this>");
        long[] arr_v = longStream0.toArray();
        Intrinsics.checkNotNullExpressionValue(arr_v, "toArray(...)");
        return ArraysKt___ArraysJvmKt.asList(arr_v);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List toList(@NotNull Stream stream0) {
        Intrinsics.checkNotNullParameter(stream0, "<this>");
        Object object0 = stream0.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(object0, "collect(...)");
        return (List)object0;
    }
}

