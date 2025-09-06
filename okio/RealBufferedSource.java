package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b;
import kotlin.text.q;
import okio.internal.-Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001A\u00020\u0006H\u0016J\b\u0010\u000E\u001A\u00020\u000FH\u0016J\b\u0010\u0010\u001A\u00020\rH\u0016J\u0010\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0016J\u0018\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0012H\u0016J \u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0012H\u0016J\u0010\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u0018H\u0016J\u0018\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u0012H\u0016J\u0010\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u001A\u001A\u00020\u0018H\u0016J\u0018\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u001A\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u0012H\u0016J\b\u0010\u001B\u001A\u00020\u001CH\u0016J\b\u0010\u001D\u001A\u00020\rH\u0016J\b\u0010\u001E\u001A\u00020\u0001H\u0016J\u0018\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u0018H\u0016J(\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010!\u001A\u00020\"2\u0006\u0010#\u001A\u00020\"H\u0016J\u0010\u0010$\u001A\u00020\"2\u0006\u0010%\u001A\u00020&H\u0016J\u0010\u0010$\u001A\u00020\"2\u0006\u0010%\u001A\u00020\'H\u0016J \u0010$\u001A\u00020\"2\u0006\u0010%\u001A\u00020\'2\u0006\u0010 \u001A\u00020\"2\u0006\u0010#\u001A\u00020\"H\u0016J\u0018\u0010$\u001A\u00020\u00122\u0006\u0010%\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0012H\u0016J\u0010\u0010(\u001A\u00020\u00122\u0006\u0010%\u001A\u00020)H\u0016J\b\u0010*\u001A\u00020\u0014H\u0016J\b\u0010+\u001A\u00020\'H\u0016J\u0010\u0010+\u001A\u00020\'2\u0006\u0010#\u001A\u00020\u0012H\u0016J\b\u0010,\u001A\u00020\u0018H\u0016J\u0010\u0010,\u001A\u00020\u00182\u0006\u0010#\u001A\u00020\u0012H\u0016J\b\u0010-\u001A\u00020\u0012H\u0016J\u0010\u0010.\u001A\u00020\u000F2\u0006\u0010%\u001A\u00020\'H\u0016J\u0018\u0010.\u001A\u00020\u000F2\u0006\u0010%\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0012H\u0016J\b\u0010/\u001A\u00020\u0012H\u0016J\b\u00100\u001A\u00020\"H\u0016J\b\u00101\u001A\u00020\"H\u0016J\b\u00102\u001A\u00020\u0012H\u0016J\b\u00103\u001A\u00020\u0012H\u0016J\b\u00104\u001A\u000205H\u0016J\b\u00106\u001A\u000205H\u0016J\u0010\u00107\u001A\u0002082\u0006\u00109\u001A\u00020:H\u0016J\u0018\u00107\u001A\u0002082\u0006\u0010#\u001A\u00020\u00122\u0006\u00109\u001A\u00020:H\u0016J\b\u0010;\u001A\u000208H\u0016J\u0010\u0010;\u001A\u0002082\u0006\u0010#\u001A\u00020\u0012H\u0016J\b\u0010<\u001A\u00020\"H\u0016J\n\u0010=\u001A\u0004\u0018\u000108H\u0016J\b\u0010>\u001A\u000208H\u0016J\u0010\u0010>\u001A\u0002082\u0006\u0010?\u001A\u00020\u0012H\u0016J\u0010\u0010@\u001A\u00020\r2\u0006\u0010#\u001A\u00020\u0012H\u0016J\u0010\u0010A\u001A\u00020\u000F2\u0006\u0010#\u001A\u00020\u0012H\u0016J\u0010\u0010B\u001A\u00020\"2\u0006\u0010C\u001A\u00020DH\u0016J\'\u0010B\u001A\u0004\u0018\u0001HE\"\b\b\u0000\u0010E*\u00020F2\f\u0010C\u001A\b\u0012\u0004\u0012\u0002HE0GH\u0016\u00A2\u0006\u0002\u0010HJ\u0010\u0010I\u001A\u00020\u000F2\u0006\u0010#\u001A\u00020\u0012H\u0016J\b\u0010J\u001A\u00020KH\u0016J\b\u0010L\u001A\u000208H\u0016R\u001B\u0010\u0005\u001A\u00020\u00068\u00D6\u0002X\u0096\u0004\u00A2\u0006\f\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0010\u0010\u000B\u001A\u00020\u00068\u0006X\u0087\u0004\u00A2\u0006\u0002\n\u0000R\u0012\u0010\f\u001A\u00020\r8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006M"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "T", "", "Lokio/TypedOptions;", "(Lokio/TypedOptions;)Ljava/lang/Object;", "skip", "timeout", "Lokio/Timeout;", "toString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BufferedSource.kt\nokio/internal/-BufferedSource\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,186:1\n62#1:192\n62#1:202\n62#1:209\n62#1:215\n62#1:217\n62#1:221\n62#1:226\n62#1:244\n62#1:248\n62#1:255\n62#1:268\n62#1:276\n62#1:277\n62#1:278\n62#1:284\n62#1:292\n62#1:305\n62#1:309\n62#1:310\n62#1:311\n62#1:312\n62#1:317\n62#1:329\n62#1:345\n62#1:355\n62#1:358\n62#1:361\n62#1:364\n62#1:367\n62#1:370\n62#1:376\n62#1:393\n62#1:413\n62#1:428\n62#1:445\n62#1:458\n62#1:479\n62#1:486\n38#2:187\n39#2,3:189\n42#2,6:193\n51#2:199\n52#2:201\n56#2,2:203\n60#2:205\n61#2,2:207\n63#2,3:210\n69#2,2:213\n74#2:216\n75#2:218\n79#2,2:219\n84#2:222\n86#2,2:224\n88#2,13:227\n107#2:243\n108#2:245\n112#2,2:246\n117#2,6:249\n123#2,9:256\n134#2,3:265\n137#2,5:269\n142#2:275\n146#2,5:279\n151#2,5:285\n158#2,2:290\n160#2,11:293\n174#2:304\n175#2:306\n179#2,2:307\n184#2,4:313\n188#2,6:318\n198#2:324\n199#2,3:326\n202#2,8:330\n210#2,3:339\n217#2,3:342\n220#2,7:346\n230#2,2:353\n235#2,2:356\n240#2,2:359\n245#2,2:362\n250#2,2:365\n255#2,2:368\n260#2,5:371\n265#2,11:377\n279#2,5:388\n284#2,14:394\n301#2,2:408\n303#2,2:411\n305#2,7:414\n314#2,2:421\n316#2,4:424\n320#2,11:429\n334#2,2:440\n337#2,2:443\n339#2,7:446\n350#2,2:453\n353#2,2:456\n355#2,7:459\n371#2:466\n373#2,11:468\n385#2:480\n389#2:481\n393#2,4:482\n397#2:487\n399#2:488\n401#2:489\n1#3:188\n1#3:200\n1#3:206\n1#3:223\n1#3:325\n1#3:410\n1#3:423\n1#3:442\n1#3:455\n1#3:467\n26#4,3:240\n89#5:274\n89#5:338\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:192\n67#1:202\n69#1:209\n70#1:215\n71#1:217\n72#1:221\n73#1:226\n75#1:244\n76#1:248\n78#1:255\n80#1:268\n83#1:276\n84#1:277\n88#1:278\n91#1:284\n92#1:292\n93#1:305\n94#1:309\n97#1:310\n98#1:311\n103#1:312\n106#1:317\n108#1:329\n109#1:345\n110#1:355\n111#1:358\n112#1:361\n113#1:364\n114#1:367\n115#1:370\n116#1:376\n117#1:393\n118#1:413\n122#1:428\n125#1:445\n128#1:458\n142#1:479\n182#1:486\n66#1:187\n66#1:189,3\n66#1:193,6\n67#1:199\n67#1:201\n68#1:203,2\n69#1:205\n69#1:207,2\n69#1:210,3\n70#1:213,2\n71#1:216\n71#1:218\n72#1:219,2\n73#1:222\n73#1:224,2\n73#1:227,13\n75#1:243\n75#1:245\n76#1:246,2\n78#1:249,6\n78#1:256,9\n80#1:265,3\n80#1:269,5\n80#1:275\n91#1:279,5\n91#1:285,5\n92#1:290,2\n92#1:293,11\n93#1:304\n93#1:306\n94#1:307,2\n106#1:313,4\n106#1:318,6\n108#1:324\n108#1:326,3\n108#1:330,8\n108#1:339,3\n109#1:342,3\n109#1:346,7\n110#1:353,2\n111#1:356,2\n112#1:359,2\n113#1:362,2\n114#1:365,2\n115#1:368,2\n116#1:371,5\n116#1:377,11\n117#1:388,5\n117#1:394,14\n118#1:408,2\n118#1:411,2\n118#1:414,7\n122#1:421,2\n122#1:424,4\n122#1:429,11\n125#1:440,2\n125#1:443,2\n125#1:446,7\n128#1:453,2\n128#1:456,2\n128#1:459,7\n142#1:466\n142#1:468,11\n142#1:480\n144#1:481\n182#1:482,4\n182#1:487\n183#1:488\n184#1:489\n66#1:188\n67#1:200\n69#1:206\n73#1:223\n108#1:325\n118#1:410\n122#1:423\n125#1:442\n128#1:455\n142#1:467\n74#1:240,3\n80#1:274\n108#1:338\n*E\n"})
public final class RealBufferedSource implements BufferedSource {
    @JvmField
    @NotNull
    public final Buffer bufferField;
    @JvmField
    public boolean closed;
    @JvmField
    @NotNull
    public final Source source;

    public RealBufferedSource(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        super();
        this.source = source0;
        this.bufferField = new Buffer();
    }

    @Override  // okio.BufferedSource
    @NotNull
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override  // okio.Source
    public void close() {
        if(!this.closed) {
            this.closed = true;
            this.source.close();
            this.bufferField.clear();
        }
    }

    @Override  // okio.BufferedSource
    public boolean exhausted() {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 0x2000L) == -1L;
    }

    @Override  // okio.BufferedSource
    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    public static void getBuffer$annotations() {
    }

    @Override  // okio.BufferedSource
    public long indexOf(byte b) {
        return this.indexOf(b, 0L, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.BufferedSource
    public long indexOf(byte b, long v) {
        return this.indexOf(b, v, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.BufferedSource
    public long indexOf(byte b, long v, long v1) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        if(0L > v || v > v1) {
            throw new IllegalArgumentException(("fromIndex=" + v + " toIndex=" + v1).toString());
        }
        while(Long.compare(v, v1) < 0) {
            long v2 = this.bufferField.indexOf(b, v, v1);
            if(v2 != -1L) {
                return v2;
            }
            long v3 = this.bufferField.size();
            if(v3 >= v1 || this.source.read(this.bufferField, 0x2000L) == -1L) {
                break;
            }
            v = Math.max(v, v3);
        }
        return -1L;
    }

    @Override  // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        return this.indexOf(byteString0, 0L);
    }

    @Override  // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString0, long v) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        long v1;
        while((v1 = this.bufferField.indexOf(byteString0, v)) == -1L) {
            long v2 = this.bufferField.size();
            if(this.source.read(this.bufferField, 0x2000L) == -1L) {
                return -1L;
            }
            v = Math.max(v, v2 - ((long)byteString0.size()) + 1L);
        }
        return v1;
    }

    @Override  // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "targetBytes");
        return this.indexOfElement(byteString0, 0L);
    }

    @Override  // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString0, long v) {
        Intrinsics.checkNotNullParameter(byteString0, "targetBytes");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        long v1;
        while((v1 = this.bufferField.indexOfElement(byteString0, v)) == -1L) {
            long v2 = this.bufferField.size();
            if(this.source.read(this.bufferField, 0x2000L) == -1L) {
                return -1L;
            }
            v = Math.max(v, v2);
        }
        return v1;
    }

    @Override  // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() {
            @Override
            public int available() {
                RealBufferedSource realBufferedSource0 = this.a;
                if(realBufferedSource0.closed) {
                    throw new IOException("closed");
                }
                return (int)Math.min(realBufferedSource0.bufferField.size(), 0x7FFFFFFFL);
            }

            @Override
            public void close() {
                this.a.close();
            }

            @Override
            public int read() {
                RealBufferedSource realBufferedSource0 = this.a;
                if(realBufferedSource0.closed) {
                    throw new IOException("closed");
                }
                return realBufferedSource0.bufferField.size() != 0L || realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) != -1L ? realBufferedSource0.bufferField.readByte() & 0xFF : -1;
            }

            @Override
            public int read(@NotNull byte[] arr_b, int v, int v1) {
                Intrinsics.checkNotNullParameter(arr_b, "data");
                RealBufferedSource realBufferedSource0 = this.a;
                if(realBufferedSource0.closed) {
                    throw new IOException("closed");
                }
                -SegmentedByteString.checkOffsetAndCount(arr_b.length, v, v1);
                return realBufferedSource0.bufferField.size() != 0L || realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) != -1L ? realBufferedSource0.bufferField.read(arr_b, v, v1) : -1;
            }

            @Override
            @NotNull
            public String toString() {
                return this.a + ".inputStream()";
            }
        };
    }

    @Override
    public boolean isOpen() {
        return !this.closed;
    }

    @Override  // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override  // okio.BufferedSource
    public boolean rangeEquals(long v, @NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        return this.rangeEquals(v, byteString0, 0, byteString0.size());
    }

    @Override  // okio.BufferedSource
    public boolean rangeEquals(long v, @NotNull ByteString byteString0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        if(Long.compare(v, 0L) >= 0 && v1 >= 0 && v2 >= 0 && byteString0.size() - v1 >= v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                long v4 = ((long)v3) + v;
                if(!this.request(v4 + 1L) || this.bufferField.getByte(v4) != byteString0.getByte(v1 + v3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int read(@NotNull ByteBuffer byteBuffer0) {
        Intrinsics.checkNotNullParameter(byteBuffer0, "sink");
        return this.bufferField.size() != 0L || this.source.read(this.bufferField, 0x2000L) != -1L ? this.bufferField.read(byteBuffer0) : -1;
    }

    @Override  // okio.BufferedSource
    public int read(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "sink");
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override  // okio.BufferedSource
    public int read(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "sink");
        -SegmentedByteString.checkOffsetAndCount(arr_b.length, v, v1);
        return this.bufferField.size() != 0L || this.source.read(this.bufferField, 0x2000L) != -1L ? this.bufferField.read(arr_b, v, ((int)Math.min(v1, this.bufferField.size()))) : -1;
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.size() == 0L && this.source.read(this.bufferField, 0x2000L) == -1L ? -1L : this.bufferField.read(buffer0, Math.min(v, this.bufferField.size()));
    }

    @Override  // okio.BufferedSource
    public long readAll(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        long v = 0L;
        while(this.source.read(this.bufferField, 0x2000L) != -1L) {
            long v1 = this.bufferField.completeSegmentByteCount();
            if(v1 > 0L) {
                v += v1;
                sink0.write(this.bufferField, v1);
            }
        }
        if(this.bufferField.size() > 0L) {
            v += this.bufferField.size();
            sink0.write(this.bufferField, this.bufferField.size());
        }
        return v;
    }

    @Override  // okio.BufferedSource
    public byte readByte() {
        this.require(1L);
        return this.bufferField.readByte();
    }

    @Override  // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return new byte[0];
    }

    @Override  // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long v) {
        this.require(v);
        return this.bufferField.readByteArray(v);
    }

    @Override  // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override  // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long v) {
        this.require(v);
        return this.bufferField.readByteString(v);
    }

    @Override  // okio.BufferedSource
    public long readDecimalLong() {
        this.require(1L);
        for(long v = 0L; this.request(v + 1L); ++v) {
            int v1 = this.bufferField.getByte(v);
            if(v1 < 0x30 || v1 > 57) {
                int v2 = Long.compare(v, 0L);
                if(v2 != 0 || v1 != 45) {
                    if(v2 != 0) {
                        break;
                    }
                    String s = Integer.toString(v1, b.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                    throw new NumberFormatException("Expected a digit or \'-\' but was 0x" + s);
                }
            }
        }
        return this.bufferField.readDecimalLong();
    }

    @Override  // okio.BufferedSource
    public void readFully(@NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        try {
            this.require(v);
        }
        catch(EOFException eOFException0) {
            buffer0.writeAll(this.bufferField);
            throw eOFException0;
        }
        this.bufferField.readFully(buffer0, v);
    }

    @Override  // okio.BufferedSource
    public void readFully(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "sink");
        try {
            this.require(((long)arr_b.length));
        }
        catch(EOFException eOFException0) {
            for(int v = 0; this.bufferField.size() > 0L; v += v1) {
                int v1 = this.bufferField.read(arr_b, v, ((int)this.bufferField.size()));
                if(v1 == -1) {
                    throw new AssertionError();
                }
            }
            throw eOFException0;
        }
        this.bufferField.readFully(arr_b);
    }

    @Override  // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
        this.require(1L);
        int v = 0;
        while(this.request(((long)(v + 1)))) {
            int v1 = this.bufferField.getByte(((long)v));
            if(v1 >= 0x30 && v1 <= 57 || v1 >= 97 && v1 <= 102 || v1 >= 65 && v1 <= 70) {
                ++v;
                continue;
            }
            if(v != 0) {
                break;
            }
            String s = Integer.toString(v1, b.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + s);
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override  // okio.BufferedSource
    public int readInt() {
        this.require(4L);
        return this.bufferField.readInt();
    }

    @Override  // okio.BufferedSource
    public int readIntLe() {
        this.require(4L);
        return this.bufferField.readIntLe();
    }

    @Override  // okio.BufferedSource
    public long readLong() {
        this.require(8L);
        return this.bufferField.readLong();
    }

    @Override  // okio.BufferedSource
    public long readLongLe() {
        this.require(8L);
        return this.bufferField.readLongLe();
    }

    @Override  // okio.BufferedSource
    public short readShort() {
        this.require(2L);
        return this.bufferField.readShort();
    }

    @Override  // okio.BufferedSource
    public short readShortLe() {
        this.require(2L);
        return this.bufferField.readShortLe();
    }

    @Override  // okio.BufferedSource
    @NotNull
    public String readString(long v, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(charset0, "charset");
        this.require(v);
        return this.bufferField.readString(v, charset0);
    }

    @Override  // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(charset0, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset0);
    }

    @Override  // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        this.bufferField.writeAll(this.source);
        return "";
    }

    @Override  // okio.BufferedSource
    @NotNull
    public String readUtf8(long v) {
        this.require(v);
        return this.bufferField.readUtf8(v);
    }

    @Override  // okio.BufferedSource
    public int readUtf8CodePoint() {
        this.require(1L);
        int v = this.bufferField.getByte(0L);
        if((v & 0xE0) == 0xC0) {
            this.require(2L);
            return this.bufferField.readUtf8CodePoint();
        }
        if((v & 0xF0) == 0xE0) {
            this.require(3L);
            return this.bufferField.readUtf8CodePoint();
        }
        if((v & 0xF8) == 0xF0) {
            this.require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override  // okio.BufferedSource
    @Nullable
    public String readUtf8Line() {
        long v = this.indexOf(10);
        if(v == -1L) {
            return this.bufferField.size() == 0L ? null : this.readUtf8(this.bufferField.size());
        }
        return -Buffer.readUtf8Line(this.bufferField, v);
    }

    @Override  // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() {
        return this.readUtf8LineStrict(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "limit < 0: ").toString());
        }
        long v1 = Long.compare(v, 0x7FFFFFFFFFFFFFFFL) == 0 ? 0x7FFFFFFFFFFFFFFFL : v + 1L;
        long v2 = this.indexOf(10, 0L, v1);
        if(v2 != -1L) {
            return -Buffer.readUtf8Line(this.bufferField, v2);
        }
        if(v1 < 0x7FFFFFFFFFFFFFFFL && this.request(v1) && this.bufferField.getByte(v1 - 1L) == 13 && this.request(v1 + 1L) && this.bufferField.getByte(v1) == 10) {
            return -Buffer.readUtf8Line(this.bufferField, v1);
        }
        Buffer buffer0 = new Buffer();
        this.bufferField.copyTo(buffer0, 0L, Math.min(0x20L, this.bufferField.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), v) + " content=" + buffer0.readByteString().hex() + '…');
    }

    @Override  // okio.BufferedSource
    public boolean request(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        while(this.bufferField.size() < v) {
            if(this.source.read(this.bufferField, 0x2000L) == -1L) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // okio.BufferedSource
    public void require(long v) {
        if(!this.request(v)) {
            throw new EOFException();
        }
    }

    @Override  // okio.BufferedSource
    public int select(@NotNull Options options0) {
        Intrinsics.checkNotNullParameter(options0, "options");
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
    alab1:
        while(true) {
            int v = -Buffer.selectPrefix(this.bufferField, options0, true);
            switch(v) {
                case -2: {
                    if(this.source.read(this.bufferField, 0x2000L) != -1L) {
                        break;
                    }
                    break alab1;
                }
                case -1: {
                    return -1;
                }
                default: {
                    this.bufferField.skip(((long)options0.getByteStrings$okio()[v].size()));
                    return v;
                }
            }
        }
        return -1;
    }

    @Override  // okio.BufferedSource
    @Nullable
    public Object select(@NotNull TypedOptions typedOptions0) {
        Intrinsics.checkNotNullParameter(typedOptions0, "options");
        int v = this.select(typedOptions0.getOptions$okio());
        return v == -1 ? null : typedOptions0.get(v);
    }

    @Override  // okio.BufferedSource
    public void skip(long v) {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        while(v > 0L) {
            if(this.bufferField.size() == 0L && this.source.read(this.bufferField, 0x2000L) == -1L) {
                throw new EOFException();
            }
            long v1 = Math.min(v, this.bufferField.size());
            this.bufferField.skip(v1);
            v -= v1;
        }
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.source.timeout();
    }

    @Override
    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }
}

