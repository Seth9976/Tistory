package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015J\u0015\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR#\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000E0\r8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "Lokio/ByteString;", "name", "checkLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "", "Lokhttp3/internal/http2/Header;", "a", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "", "", "b", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Hpack {
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001E\u0010\u0019\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00188\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u0019\u0010\u001AR\u0016\u0010\u001B\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u001B\u0010\u001CR\u0016\u0010\u001D\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u001D\u0010\u001C¨\u0006\u001E"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lokio/Source;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lokio/Source;II)V", "", "Lokhttp3/internal/http2/Header;", "getAndResetHeaderList", "()Ljava/util/List;", "()I", "", "readHeaders", "()V", "firstByte", "prefixMask", "readInt", "(II)I", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", "I", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Reader {
        public final int a;
        public int b;
        public final ArrayList c;
        public final BufferedSource d;
        @JvmField
        @NotNull
        public Header[] dynamicTable;
        @JvmField
        public int dynamicTableByteCount;
        public int e;
        @JvmField
        public int headerCount;

        @JvmOverloads
        public Reader(@NotNull Source source0, int v) {
            Intrinsics.checkNotNullParameter(source0, "source");
            this(source0, v, 0, 4, null);
        }

        @JvmOverloads
        public Reader(@NotNull Source source0, int v, int v1) {
            Intrinsics.checkNotNullParameter(source0, "source");
            super();
            this.a = v;
            this.b = v1;
            this.c = new ArrayList();
            this.d = Okio.buffer(source0);
            this.dynamicTable = new Header[8];
            this.e = 7;
        }

        public Reader(Source source0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 4) != 0) {
                v1 = v;
            }
            this(source0, v, v1);
        }

        public final int a(int v) {
            int v3;
            int v1 = 0;
            if(v > 0) {
                for(int v2 = this.dynamicTable.length - 1; true; --v2) {
                    v3 = this.e;
                    if(v2 < v3 || v <= 0) {
                        break;
                    }
                    Header header0 = this.dynamicTable[v2];
                    Intrinsics.checkNotNull(header0);
                    v -= header0.hpackSize;
                    this.dynamicTableByteCount -= header0.hpackSize;
                    --this.headerCount;
                    ++v1;
                }
                System.arraycopy(this.dynamicTable, v3 + 1, this.dynamicTable, v3 + 1 + v1, this.headerCount);
                this.e += v1;
            }
            return v1;
        }

        public final ByteString b(int v) {
            if(v >= 0) {
                Hpack hpack0 = Hpack.INSTANCE;
                if(v <= hpack0.getSTATIC_HEADER_TABLE().length - 1) {
                    return hpack0.getSTATIC_HEADER_TABLE()[v].name;
                }
            }
            int v1 = this.e + 1 + (v - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if(v1 >= 0) {
                Header[] arr_header = this.dynamicTable;
                if(v1 < arr_header.length) {
                    Header header0 = arr_header[v1];
                    Intrinsics.checkNotNull(header0);
                    return header0.name;
                }
            }
            throw new IOException("Header index too large " + (v + 1));
        }

        public final void c(Header header0) {
            this.c.add(header0);
            int v = header0.hpackSize;
            int v1 = this.b;
            if(v > v1) {
                ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, null, 0, 0, 6, null);
                this.e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            this.a(this.dynamicTableByteCount + v - v1);
            Header[] arr_header = this.dynamicTable;
            if(this.headerCount + 1 > arr_header.length) {
                Header[] arr_header1 = new Header[arr_header.length * 2];
                System.arraycopy(arr_header, 0, arr_header1, arr_header.length, arr_header.length);
                this.e = this.dynamicTable.length - 1;
                this.dynamicTable = arr_header1;
            }
            int v2 = this.e;
            this.e = v2 - 1;
            this.dynamicTable[v2] = header0;
            ++this.headerCount;
            this.dynamicTableByteCount += v;
        }

        @NotNull
        public final List getAndResetHeaderList() {
            List list0 = CollectionsKt___CollectionsKt.toList(this.c);
            this.c.clear();
            return list0;
        }

        public final int maxDynamicTableByteCount() {
            return this.b;
        }

        @NotNull
        public final ByteString readByteString() throws IOException {
            BufferedSource bufferedSource0 = this.d;
            int v = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
            long v1 = (long)this.readInt(v, 0x7F);
            if((v & 0x80) == 0x80) {
                Buffer buffer0 = new Buffer();
                Huffman.INSTANCE.decode(bufferedSource0, v1, buffer0);
                return buffer0.readByteString();
            }
            return bufferedSource0.readByteString(v1);
        }

        public final void readHeaders() throws IOException {
            while(true) {
                BufferedSource bufferedSource0 = this.d;
                if(bufferedSource0.exhausted()) {
                    break;
                }
                int v = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
                if(v == 0x80) {
                    throw new IOException("index == 0");
                }
                ArrayList arrayList0 = this.c;
                if((v & 0x80) == 0x80) {
                    int v1 = this.readInt(v, 0x7F);
                    int v2 = v1 - 1;
                    if(v2 >= 0) {
                        Hpack hpack0 = Hpack.INSTANCE;
                        if(v2 <= hpack0.getSTATIC_HEADER_TABLE().length - 1) {
                            arrayList0.add(hpack0.getSTATIC_HEADER_TABLE()[v2]);
                            continue;
                        }
                    }
                    int v3 = this.e + 1 + (v2 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                    if(v3 >= 0) {
                        Header[] arr_header = this.dynamicTable;
                        if(v3 < arr_header.length) {
                            Header header0 = arr_header[v3];
                            Intrinsics.checkNotNull(header0);
                            arrayList0.add(header0);
                            continue;
                        }
                    }
                    throw new IOException("Header index too large " + v1);
                }
                if(v == 0x40) {
                    ByteString byteString0 = this.readByteString();
                    this.c(new Header(Hpack.INSTANCE.checkLowercase(byteString0), this.readByteString()));
                }
                else if((v & 0x40) == 0x40) {
                    this.c(new Header(this.b(this.readInt(v, 0x3F) - 1), this.readByteString()));
                }
                else if((v & 0x20) == 0x20) {
                    int v4 = this.readInt(v, 0x1F);
                    this.b = v4;
                    if(v4 < 0 || v4 > this.a) {
                        throw new IOException("Invalid dynamic table size update " + this.b);
                    }
                    int v5 = this.dynamicTableByteCount;
                    if(v4 >= v5) {
                        continue;
                    }
                    if(v4 == 0) {
                        ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, null, 0, 0, 6, null);
                        this.e = this.dynamicTable.length - 1;
                        this.headerCount = 0;
                        this.dynamicTableByteCount = 0;
                    }
                    else {
                        this.a(v5 - v4);
                    }
                }
                else if(v != 0 && v != 16) {
                    arrayList0.add(new Header(this.b(this.readInt(v, 15) - 1), this.readByteString()));
                }
                else {
                    ByteString byteString1 = this.readByteString();
                    arrayList0.add(new Header(Hpack.INSTANCE.checkLowercase(byteString1), this.readByteString()));
                }
            }
        }

        public final int readInt(int v, int v1) throws IOException {
            int v4;
            int v2 = v & v1;
            if(v2 < v1) {
                return v2;
            }
            int v3;
            for(v3 = 0; true; v3 += 7) {
                v4 = Util.and(this.d.readByte(), ((byte)0xFF));
                if((v4 & 0x80) == 0) {
                    break;
                }
                v1 += (v4 & 0x7F) << v3;
            }
            return v1 + (v4 << v3);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001B\u0010\u000E\u001A\u00020\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001AR\u0016\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u0003\u0010\u001BR\u0016\u0010\u001C\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u001C\u0010\u001BR\u001E\u0010\u001E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u001D8\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\u001E\u0010\u001FR\u0016\u0010 \u001A\u00020\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b \u0010\u001BR\u0016\u0010!\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b!\u0010\u001B¨\u0006\""}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "headerTableSizeSetting", "", "useCompression", "Lokio/Buffer;", "out", "<init>", "(IZLokio/Buffer;)V", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "Lokio/ByteString;", "data", "writeByteString", "(Lokio/ByteString;)V", "resizeHeaderTable", "(I)V", "I", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Writer {
        public final boolean a;
        public final Buffer b;
        public int c;
        public boolean d;
        @JvmField
        @NotNull
        public Header[] dynamicTable;
        @JvmField
        public int dynamicTableByteCount;
        public int e;
        @JvmField
        public int headerCount;
        @JvmField
        public int headerTableSizeSetting;
        @JvmField
        public int maxDynamicTableByteCount;

        @JvmOverloads
        public Writer(int v, @NotNull Buffer buffer0) {
            Intrinsics.checkNotNullParameter(buffer0, "out");
            this(v, false, buffer0, 2, null);
        }

        @JvmOverloads
        public Writer(int v, boolean z, @NotNull Buffer buffer0) {
            Intrinsics.checkNotNullParameter(buffer0, "out");
            super();
            this.headerTableSizeSetting = v;
            this.a = z;
            this.b = buffer0;
            this.c = 0x7FFFFFFF;
            this.maxDynamicTableByteCount = v;
            this.dynamicTable = new Header[8];
            this.e = 7;
        }

        public Writer(int v, boolean z, Buffer buffer0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 0x1000;
            }
            if((v1 & 2) != 0) {
                z = true;
            }
            this(v, z, buffer0);
        }

        @JvmOverloads
        public Writer(@NotNull Buffer buffer0) {
            Intrinsics.checkNotNullParameter(buffer0, "out");
            this(0, false, buffer0, 3, null);
        }

        public final void a(int v) {
            int v3;
            if(v > 0) {
                int v1 = this.dynamicTable.length - 1;
                int v2 = 0;
                while(true) {
                    v3 = this.e;
                    if(v1 < v3 || v <= 0) {
                        break;
                    }
                    Header header0 = this.dynamicTable[v1];
                    Intrinsics.checkNotNull(header0);
                    v -= header0.hpackSize;
                    int v4 = this.dynamicTableByteCount;
                    Header header1 = this.dynamicTable[v1];
                    Intrinsics.checkNotNull(header1);
                    this.dynamicTableByteCount = v4 - header1.hpackSize;
                    --this.headerCount;
                    ++v2;
                    --v1;
                }
                System.arraycopy(this.dynamicTable, v3 + 1, this.dynamicTable, v3 + 1 + v2, this.headerCount);
                Arrays.fill(this.dynamicTable, this.e + 1, this.e + 1 + v2, null);
                this.e += v2;
            }
        }

        public final void b(Header header0) {
            int v = header0.hpackSize;
            int v1 = this.maxDynamicTableByteCount;
            if(v > v1) {
                ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, null, 0, 0, 6, null);
                this.e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            this.a(this.dynamicTableByteCount + v - v1);
            Header[] arr_header = this.dynamicTable;
            if(this.headerCount + 1 > arr_header.length) {
                Header[] arr_header1 = new Header[arr_header.length * 2];
                System.arraycopy(arr_header, 0, arr_header1, arr_header.length, arr_header.length);
                this.e = this.dynamicTable.length - 1;
                this.dynamicTable = arr_header1;
            }
            int v2 = this.e;
            this.e = v2 - 1;
            this.dynamicTable[v2] = header0;
            ++this.headerCount;
            this.dynamicTableByteCount += v;
        }

        public final void resizeHeaderTable(int v) {
            this.headerTableSizeSetting = v;
            int v1 = Math.min(v, 0x4000);
            int v2 = this.maxDynamicTableByteCount;
            if(v2 == v1) {
                return;
            }
            if(v1 < v2) {
                this.c = Math.min(this.c, v1);
            }
            this.d = true;
            this.maxDynamicTableByteCount = v1;
            int v3 = this.dynamicTableByteCount;
            if(v1 < v3) {
                if(v1 == 0) {
                    ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, null, 0, 0, 6, null);
                    this.e = this.dynamicTable.length - 1;
                    this.headerCount = 0;
                    this.dynamicTableByteCount = 0;
                    return;
                }
                this.a(v3 - v1);
            }
        }

        public final void writeByteString(@NotNull ByteString byteString0) throws IOException {
            Intrinsics.checkNotNullParameter(byteString0, "data");
            Buffer buffer0 = this.b;
            if(this.a) {
                Huffman huffman0 = Huffman.INSTANCE;
                if(huffman0.encodedLength(byteString0) < byteString0.size()) {
                    Buffer buffer1 = new Buffer();
                    huffman0.encode(byteString0, buffer1);
                    ByteString byteString1 = buffer1.readByteString();
                    this.writeInt(byteString1.size(), 0x7F, 0x80);
                    buffer0.write(byteString1);
                    return;
                }
            }
            this.writeInt(byteString0.size(), 0x7F, 0);
            buffer0.write(byteString0);
        }

        public final void writeHeaders(@NotNull List list0) throws IOException {
            int v5;
            int v4;
            Intrinsics.checkNotNullParameter(list0, "headerBlock");
            if(this.d) {
                int v = this.c;
                if(v < this.maxDynamicTableByteCount) {
                    this.writeInt(v, 0x1F, 0x20);
                }
                this.d = false;
                this.c = 0x7FFFFFFF;
                this.writeInt(this.maxDynamicTableByteCount, 0x1F, 0x20);
            }
            int v1 = list0.size();
            int v2 = 0;
            while(v2 < v1) {
                Header header0 = (Header)list0.get(v2);
                ByteString byteString0 = header0.name.toAsciiLowercase();
                ByteString byteString1 = header0.value;
                Hpack hpack0 = Hpack.INSTANCE;
                Integer integer0 = (Integer)hpack0.getNAME_TO_FIRST_INDEX().get(byteString0);
                if(integer0 == null) {
                    v5 = -1;
                }
                else {
                    int v3 = (int)integer0;
                    v4 = v3 + 1;
                    if(2 <= v4 && v4 < 8) {
                        if(Intrinsics.areEqual(hpack0.getSTATIC_HEADER_TABLE()[v3].value, byteString1)) {
                            v5 = v4;
                            goto label_32;
                        }
                        else if(Intrinsics.areEqual(hpack0.getSTATIC_HEADER_TABLE()[v4].value, byteString1)) {
                            v5 = v4;
                            v4 = v3 + 2;
                            goto label_32;
                        }
                    }
                    v5 = v4;
                }
                v4 = -1;
            label_32:
                if(v4 == -1) {
                    for(int v6 = this.e + 1; v6 < this.dynamicTable.length; ++v6) {
                        Header header1 = this.dynamicTable[v6];
                        Intrinsics.checkNotNull(header1);
                        if(Intrinsics.areEqual(header1.name, byteString0)) {
                            Header header2 = this.dynamicTable[v6];
                            Intrinsics.checkNotNull(header2);
                            if(Intrinsics.areEqual(header2.value, byteString1)) {
                                v4 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (v6 - this.e);
                                break;
                            }
                            else if(v5 == -1) {
                                v5 = v6 - this.e + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if(v4 != -1) {
                    this.writeInt(v4, 0x7F, 0x80);
                }
                else if(v5 == -1) {
                    this.b.writeByte(0x40);
                    this.writeByteString(byteString0);
                    this.writeByteString(byteString1);
                    this.b(header0);
                }
                else if(!byteString0.startsWith(Header.PSEUDO_PREFIX) || Intrinsics.areEqual(Header.TARGET_AUTHORITY, byteString0)) {
                    this.writeInt(v5, 0x3F, 0x40);
                    this.writeByteString(byteString1);
                    this.b(header0);
                }
                else {
                    this.writeInt(v5, 15, 0);
                    this.writeByteString(byteString1);
                }
                ++v2;
            }
        }

        public final void writeInt(int v, int v1, int v2) {
            Buffer buffer0 = this.b;
            if(v < v1) {
                buffer0.writeByte(v | v2);
                return;
            }
            buffer0.writeByte(v2 | v1);
            int v3;
            for(v3 = v - v1; v3 >= 0x80; v3 >>>= 7) {
                buffer0.writeByte(0x80 | v3 & 0x7F);
            }
            buffer0.writeByte(v3);
        }
    }

    @NotNull
    public static final Hpack INSTANCE;
    public static final Header[] a;
    public static final Map b;

    static {
        Hpack.INSTANCE = new Hpack();  // 初始化器: Ljava/lang/Object;-><init>()V
        Header[] arr_header = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        Hpack.a = arr_header;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(61);
        for(int v = 0; v < 61; ++v) {
            if(!linkedHashMap0.containsKey(arr_header[v].name)) {
                linkedHashMap0.put(arr_header[v].name, v);
            }
        }
        Map map0 = Collections.unmodifiableMap(linkedHashMap0);
        Intrinsics.checkNotNullExpressionValue(map0, "unmodifiableMap(result)");
        Hpack.b = map0;
    }

    @NotNull
    public final ByteString checkLowercase(@NotNull ByteString byteString0) throws IOException {
        Intrinsics.checkNotNullParameter(byteString0, "name");
        int v = byteString0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = byteString0.getByte(v1);
            if(65 <= v2 && v2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString0.utf8());
            }
        }
        return byteString0;
    }

    @NotNull
    public final Map getNAME_TO_FIRST_INDEX() {
        return Hpack.b;
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
        return Hpack.a;
    }
}

