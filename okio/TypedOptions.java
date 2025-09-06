package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u001B*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u001BB\u001D\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000E\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\t\u001A\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001C"}, d2 = {"Lokio/TypedOptions;", "", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "list", "Lokio/Options;", "options", "<init>", "(Ljava/util/List;Lokio/Options;)V", "", "index", "get", "(I)Ljava/lang/Object;", "a", "Lokio/Options;", "getOptions$okio", "()Lokio/Options;", "b", "Ljava/util/List;", "getList$okio", "()Ljava/util/List;", "getSize", "()I", "size", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TypedOptions extends AbstractList implements RandomAccess {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JE\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000B"}, d2 = {"Lokio/TypedOptions$Companion;", "", "T", "", "values", "Lkotlin/Function1;", "Lokio/ByteString;", "encode", "Lokio/TypedOptions;", "of", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lokio/TypedOptions;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final TypedOptions of(@NotNull Iterable iterable0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(iterable0, "values");
            Intrinsics.checkNotNullParameter(function10, "encode");
            List list0 = CollectionsKt___CollectionsKt.toList(iterable0);
            okio.Options.Companion options$Companion0 = Options.Companion;
            int v = list0.size();
            ByteString[] arr_byteString = new ByteString[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_byteString[v1] = function10.invoke(list0.get(v1));
            }
            return new TypedOptions(list0, options$Companion0.of(arr_byteString));
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Options a;
    public final List b;

    static {
        TypedOptions.Companion = new Companion(null);
    }

    public TypedOptions(@NotNull List list0, @NotNull Options options0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        Intrinsics.checkNotNullParameter(options0, "options");
        super();
        this.a = options0;
        List list1 = CollectionsKt___CollectionsKt.toList(list0);
        this.b = list1;
        if(list1.size() != options0.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override  // kotlin.collections.AbstractList
    @NotNull
    public Object get(int v) {
        return this.b.get(v);
    }

    @NotNull
    public final List getList$okio() {
        return this.b;
    }

    @NotNull
    public final Options getOptions$okio() {
        return this.a;
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.b.size();
    }

    @JvmStatic
    @NotNull
    public static final TypedOptions of(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        return TypedOptions.Companion.of(iterable0, function10);
    }
}

