package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.n;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018J\u0018\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Lokio/ByteString;", "", "a", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "byteStrings", "", "b", "[I", "getTrie$okio", "()[I", "trie", "getSize", "()I", "size", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Options extends AbstractList implements RandomAccess {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J#\u0010\u0006\u001A\u00020\u00052\u0012\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokio/Options$Companion;", "", "", "Lokio/ByteString;", "byteStrings", "Lokio/Options;", "of", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13374#3,3:240\n74#4:243\n74#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void a(long v, Buffer buffer0, int v1, List list0, int v2, int v3, ArrayList arrayList0) {
            Buffer buffer2;
            int v16;
            int v15;
            int v6;
            int v5;
            if(v2 >= v3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for(int v4 = v2; v4 < v3; ++v4) {
                if(((ByteString)list0.get(v4)).size() < v1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString0 = (ByteString)list0.get(v2);
            ByteString byteString1 = (ByteString)list0.get(v3 - 1);
            if(v1 == byteString0.size()) {
                v5 = v2 + 1;
                v6 = ((Number)arrayList0.get(v2)).intValue();
                byteString0 = (ByteString)list0.get(v2 + 1);
            }
            else {
                v5 = v2;
                v6 = -1;
            }
            if(byteString0.getByte(v1) != byteString1.getByte(v1)) {
                int v7 = v5 + 1;
                int v8 = 1;
                while(v7 < v3) {
                    if(((ByteString)list0.get(v7 - 1)).getByte(v1) != ((ByteString)list0.get(v7)).getByte(v1)) {
                        ++v8;
                    }
                    ++v7;
                }
                long v9 = buffer0.size() / 4L + v + 2L + ((long)(v8 * 2));
                buffer0.writeInt(v8);
                buffer0.writeInt(v6);
                for(int v10 = v5; v10 < v3; ++v10) {
                    int v11 = ((ByteString)list0.get(v10)).getByte(v1);
                    if(v10 == v5 || v11 != ((ByteString)list0.get(v10 - 1)).getByte(v1)) {
                        buffer0.writeInt(v11 & 0xFF);
                    }
                }
                Buffer buffer1 = new Buffer();
                int v12 = v5;
                while(v12 < v3) {
                    int v13 = ((ByteString)list0.get(v12)).getByte(v1);
                    int v14 = v12 + 1;
                    while(true) {
                        if(v14 < v3) {
                            if(v13 == ((ByteString)list0.get(v14)).getByte(v1)) {
                                ++v14;
                                continue;
                            }
                            else {
                                v15 = v14;
                                break;
                            }
                        }
                        v15 = v3;
                        break;
                    }
                    if(v12 + 1 != v15 || v1 + 1 != ((ByteString)list0.get(v12)).size()) {
                        buffer0.writeInt(-((int)(buffer1.size() / 4L + v9)));
                        v16 = v15;
                        buffer2 = buffer1;
                        Companion.a(v9, buffer1, v1 + 1, list0, v12, v15, arrayList0);
                    }
                    else {
                        buffer0.writeInt(((Number)arrayList0.get(v12)).intValue());
                        v16 = v15;
                        buffer2 = buffer1;
                    }
                    buffer1 = buffer2;
                    v12 = v16;
                }
                buffer0.writeAll(buffer1);
                return;
            }
            int v17 = Math.min(byteString0.size(), byteString1.size());
            int v18 = 0;
            for(int v19 = v1; v19 < v17 && byteString0.getByte(v19) == byteString1.getByte(v19); ++v19) {
                ++v18;
            }
            long v20 = buffer0.size() / 4L + v + 2L + ((long)v18) + 1L;
            buffer0.writeInt(-v18);
            buffer0.writeInt(v6);
            int v21 = v18 + v1;
            while(v1 < v21) {
                buffer0.writeInt(byteString0.getByte(v1) & 0xFF);
                ++v1;
            }
            if(v5 + 1 == v3) {
                if(v21 != ((ByteString)list0.get(v5)).size()) {
                    throw new IllegalStateException("Check failed.");
                }
                buffer0.writeInt(((Number)arrayList0.get(v5)).intValue());
                return;
            }
            Buffer buffer3 = new Buffer();
            buffer0.writeInt(-((int)(buffer3.size() / 4L + v20)));
            Companion.a(v20, buffer3, v21, list0, v5, v3, arrayList0);
            buffer0.writeAll(buffer3);
        }

        @JvmStatic
        @NotNull
        public final Options of(@NotNull ByteString[] arr_byteString) {
            Intrinsics.checkNotNullParameter(arr_byteString, "byteStrings");
            if(arr_byteString.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, null);
            }
            List list0 = ArraysKt___ArraysKt.toMutableList(arr_byteString);
            n.sort(list0);
            int v1 = list0.size();
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                arrayList0.add(-1);
            }
            int v3 = 0;
            for(int v4 = 0; v3 < arr_byteString.length; ++v4) {
                arrayList0.set(CollectionsKt__CollectionsKt.binarySearch$default(list0, arr_byteString[v3], 0, 0, 6, null), v4);
                ++v3;
            }
            if(((ByteString)list0.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            for(int v5 = 0; v5 < list0.size(); ++v5) {
                ByteString byteString0 = (ByteString)list0.get(v5);
                int v6 = v5 + 1;
                while(v6 < list0.size()) {
                    ByteString byteString1 = (ByteString)list0.get(v6);
                    if(!byteString1.startsWith(byteString0)) {
                        break;
                    }
                    if(byteString1.size() == byteString0.size()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString1).toString());
                    }
                    if(((Number)arrayList0.get(v6)).intValue() > ((Number)arrayList0.get(v5)).intValue()) {
                        list0.remove(v6);
                        arrayList0.remove(v6);
                    }
                    else {
                        ++v6;
                    }
                }
            }
            Buffer buffer0 = new Buffer();
            Companion.a(0L, buffer0, 0, list0, 0, list0.size(), arrayList0);
            int v7 = (int)(buffer0.size() / 4L);
            int[] arr_v = new int[v7];
            for(int v = 0; v < v7; ++v) {
                arr_v[v] = buffer0.readInt();
            }
            Object[] arr_object = Arrays.copyOf(arr_byteString, arr_byteString.length);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
            return new Options(((ByteString[])arr_object), arr_v, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ByteString[] a;
    public final int[] b;

    static {
        Options.Companion = new Companion(null);
    }

    public Options(ByteString[] arr_byteString, int[] arr_v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = arr_byteString;
        this.b = arr_v;
    }

    @Override  // kotlin.collections.AbstractCollection
    public final boolean contains(Object object0) {
        return object0 instanceof ByteString ? this.contains(((ByteString)object0)) : false;
    }

    public boolean contains(ByteString byteString0) {
        return super.contains(byteString0);
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public ByteString get(int v) {
        return this.a[v];
    }

    @NotNull
    public final ByteString[] getByteStrings$okio() {
        return this.a;
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.a.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.b;
    }

    @Override  // kotlin.collections.AbstractList
    public final int indexOf(Object object0) {
        return object0 instanceof ByteString ? this.indexOf(((ByteString)object0)) : -1;
    }

    public int indexOf(ByteString byteString0) {
        return super.indexOf(byteString0);
    }

    @Override  // kotlin.collections.AbstractList
    public final int lastIndexOf(Object object0) {
        return object0 instanceof ByteString ? this.lastIndexOf(((ByteString)object0)) : -1;
    }

    public int lastIndexOf(ByteString byteString0) {
        return super.lastIndexOf(byteString0);
    }

    @JvmStatic
    @NotNull
    public static final Options of(@NotNull ByteString[] arr_byteString) {
        return Options.Companion.of(arr_byteString);
    }
}

