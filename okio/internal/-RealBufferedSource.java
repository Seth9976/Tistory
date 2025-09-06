package okio.internal;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b;
import kotlin.text.q;
import okio.-SegmentedByteString;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0080\b\u001A\r\u0010\u0003\u001A\u00020\u0004*\u00020\u0002H\u0080\b\u001A%\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u0006H\u0080\b\u001A\u001D\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u0006H\u0080\b\u001A\u001D\u0010\r\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u0006H\u0080\b\u001A\r\u0010\u000F\u001A\u00020\u0010*\u00020\u0002H\u0080\b\u001A-\u0010\u0011\u001A\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014H\u0080\b\u001A%\u0010\u0016\u001A\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0012\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014H\u0080\b\u001A\u001D\u0010\u0016\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u00192\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\u0015\u0010\u001A\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u001BH\u0080\b\u001A\r\u0010\u001C\u001A\u00020\b*\u00020\u0002H\u0080\b\u001A\r\u0010\u001D\u001A\u00020\u0018*\u00020\u0002H\u0080\b\u001A\u0015\u0010\u001D\u001A\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\r\u0010\u001E\u001A\u00020\f*\u00020\u0002H\u0080\b\u001A\u0015\u0010\u001E\u001A\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\r\u0010\u001F\u001A\u00020\u0006*\u00020\u0002H\u0080\b\u001A\u0015\u0010 \u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0018H\u0080\b\u001A\u001D\u0010 \u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u00192\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\r\u0010!\u001A\u00020\u0006*\u00020\u0002H\u0080\b\u001A\r\u0010\"\u001A\u00020\u0014*\u00020\u0002H\u0080\b\u001A\r\u0010#\u001A\u00020\u0014*\u00020\u0002H\u0080\b\u001A\r\u0010$\u001A\u00020\u0006*\u00020\u0002H\u0080\b\u001A\r\u0010%\u001A\u00020\u0006*\u00020\u0002H\u0080\b\u001A\r\u0010&\u001A\u00020\'*\u00020\u0002H\u0080\b\u001A\r\u0010(\u001A\u00020\'*\u00020\u0002H\u0080\b\u001A\r\u0010)\u001A\u00020**\u00020\u0002H\u0080\b\u001A\u0015\u0010)\u001A\u00020**\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\r\u0010+\u001A\u00020\u0014*\u00020\u0002H\u0080\b\u001A\u000F\u0010,\u001A\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001A\u0015\u0010-\u001A\u00020**\u00020\u00022\u0006\u0010.\u001A\u00020\u0006H\u0080\b\u001A\u0015\u0010/\u001A\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\u0015\u00100\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\u0015\u00101\u001A\u00020\u0014*\u00020\u00022\u0006\u00102\u001A\u000203H\u0080\b\u001A\u0015\u00104\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0006H\u0080\b\u001A\r\u00105\u001A\u000206*\u00020\u0002H\u0080\b\u001A\r\u00107\u001A\u00020**\u00020\u0002H\u0080\b\u00A8\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-RealBufferedSource")
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
public final class -RealBufferedSource {
    public static final void commonClose(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(realBufferedSource0.closed) {
            return;
        }
        realBufferedSource0.closed = true;
        realBufferedSource0.source.close();
        realBufferedSource0.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource0.bufferField.exhausted() && realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) == -1L;
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource realBufferedSource0, byte b, long v, long v1) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
        if(0L > v || v > v1) {
            throw new IllegalArgumentException(("fromIndex=" + v + " toIndex=" + v1).toString());
        }
        while(Long.compare(v, v1) < 0) {
            long v2 = realBufferedSource0.bufferField.indexOf(b, v, v1);
            if(v2 != -1L) {
                return v2;
            }
            long v3 = realBufferedSource0.bufferField.size();
            if(v3 >= v1 || realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) == -1L) {
                break;
            }
            v = Math.max(v, v3);
        }
        return -1L;
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource realBufferedSource0, @NotNull ByteString byteString0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        if(!realBufferedSource0.closed) {
            while(true) {
                long v1 = realBufferedSource0.bufferField.indexOf(byteString0, v);
                if(v1 != -1L) {
                    return v1;
                }
                long v2 = realBufferedSource0.bufferField.size();
                if(realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) == -1L) {
                    return -1L;
                }
                v = Math.max(v, v2 - ((long)byteString0.size()) + 1L);
            }
        }
        throw new IllegalStateException("closed");
    }

    public static final long commonIndexOfElement(@NotNull RealBufferedSource realBufferedSource0, @NotNull ByteString byteString0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(byteString0, "targetBytes");
        if(!realBufferedSource0.closed) {
            while(true) {
                long v1 = realBufferedSource0.bufferField.indexOfElement(byteString0, v);
                if(v1 != -1L) {
                    return v1;
                }
                long v2 = realBufferedSource0.bufferField.size();
                if(realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) == -1L) {
                    return -1L;
                }
                v = Math.max(v, v2);
            }
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource0));
    }

    public static final boolean commonRangeEquals(@NotNull RealBufferedSource realBufferedSource0, long v, @NotNull ByteString byteString0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
        if(Long.compare(v, 0L) >= 0 && v1 >= 0 && v2 >= 0 && byteString0.size() - v1 >= v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                long v4 = ((long)v3) + v;
                if(!realBufferedSource0.request(v4 + 1L)) {
                    return false;
                }
                if(realBufferedSource0.bufferField.getByte(v4) != byteString0.getByte(v1 + v3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final int commonRead(@NotNull RealBufferedSource realBufferedSource0, @NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "sink");
        -SegmentedByteString.checkOffsetAndCount(arr_b.length, v, v1);
        return realBufferedSource0.bufferField.size() != 0L || realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) != -1L ? realBufferedSource0.bufferField.read(arr_b, v, ((int)Math.min(v1, realBufferedSource0.bufferField.size()))) : -1;
    }

    public static final long commonRead(@NotNull RealBufferedSource realBufferedSource0, @NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource0.bufferField.size() != 0L || realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) != -1L ? realBufferedSource0.bufferField.read(buffer0, Math.min(v, realBufferedSource0.bufferField.size())) : -1L;
    }

    public static final long commonReadAll(@NotNull RealBufferedSource realBufferedSource0, @NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(sink0, "sink");
        long v = 0L;
        while(realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) != -1L) {
            long v1 = realBufferedSource0.bufferField.completeSegmentByteCount();
            if(v1 > 0L) {
                v += v1;
                sink0.write(realBufferedSource0.bufferField, v1);
            }
        }
        if(realBufferedSource0.bufferField.size() > 0L) {
            v += realBufferedSource0.bufferField.size();
            sink0.write(realBufferedSource0.bufferField, realBufferedSource0.bufferField.size());
        }
        return v;
    }

    public static final byte commonReadByte(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(1L);
        return realBufferedSource0.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.bufferField.writeAll(realBufferedSource0.source);
        return new byte[0];
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(v);
        return realBufferedSource0.bufferField.readByteArray(v);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.bufferField.writeAll(realBufferedSource0.source);
        return realBufferedSource0.bufferField.readByteString();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(v);
        return realBufferedSource0.bufferField.readByteString(v);
    }

    public static final long commonReadDecimalLong(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(1L);
        for(long v = 0L; realBufferedSource0.request(v + 1L); ++v) {
            int v1 = realBufferedSource0.bufferField.getByte(v);
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
        return realBufferedSource0.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull RealBufferedSource realBufferedSource0, @NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        try {
            realBufferedSource0.require(v);
        }
        catch(EOFException eOFException0) {
            buffer0.writeAll(realBufferedSource0.bufferField);
            throw eOFException0;
        }
        realBufferedSource0.bufferField.readFully(buffer0, v);
    }

    public static final void commonReadFully(@NotNull RealBufferedSource realBufferedSource0, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "sink");
        try {
            realBufferedSource0.require(((long)arr_b.length));
        }
        catch(EOFException eOFException0) {
            for(int v = 0; realBufferedSource0.bufferField.size() > 0L; v += v1) {
                int v1 = realBufferedSource0.bufferField.read(arr_b, v, ((int)realBufferedSource0.bufferField.size()));
                if(v1 == -1) {
                    throw new AssertionError();
                }
            }
            throw eOFException0;
        }
        realBufferedSource0.bufferField.readFully(arr_b);
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(1L);
        int v = 0;
        while(realBufferedSource0.request(((long)(v + 1)))) {
            int v1 = realBufferedSource0.bufferField.getByte(((long)v));
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
        return realBufferedSource0.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(4L);
        return realBufferedSource0.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(4L);
        return realBufferedSource0.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(8L);
        return realBufferedSource0.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(8L);
        return realBufferedSource0.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(2L);
        return realBufferedSource0.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(2L);
        return realBufferedSource0.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.bufferField.writeAll(realBufferedSource0.source);
        return "";
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(v);
        return realBufferedSource0.bufferField.readUtf8(v);
    }

    public static final int commonReadUtf8CodePoint(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        realBufferedSource0.require(1L);
        int v = realBufferedSource0.bufferField.getByte(0L);
        if((v & 0xE0) == 0xC0) {
            realBufferedSource0.require(2L);
            return realBufferedSource0.bufferField.readUtf8CodePoint();
        }
        if((v & 0xF0) == 0xE0) {
            realBufferedSource0.require(3L);
            return realBufferedSource0.bufferField.readUtf8CodePoint();
        }
        if((v & 0xF8) == 0xF0) {
            realBufferedSource0.require(4L);
        }
        return realBufferedSource0.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        long v = realBufferedSource0.indexOf(10);
        if(v == -1L) {
            return realBufferedSource0.bufferField.size() == 0L ? null : realBufferedSource0.readUtf8(realBufferedSource0.bufferField.size());
        }
        return -Buffer.readUtf8Line(realBufferedSource0.bufferField, v);
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "limit < 0: ").toString());
        }
        long v1 = Long.compare(v, 0x7FFFFFFFFFFFFFFFL) == 0 ? 0x7FFFFFFFFFFFFFFFL : v + 1L;
        long v2 = realBufferedSource0.indexOf(10, 0L, v1);
        if(v2 != -1L) {
            return -Buffer.readUtf8Line(realBufferedSource0.bufferField, v2);
        }
        if(v1 < 0x7FFFFFFFFFFFFFFFL && realBufferedSource0.request(v1) && realBufferedSource0.bufferField.getByte(v1 - 1L) == 13 && realBufferedSource0.request(v1 + 1L) && realBufferedSource0.bufferField.getByte(v1) == 10) {
            return -Buffer.readUtf8Line(realBufferedSource0.bufferField, v1);
        }
        Buffer buffer0 = new Buffer();
        realBufferedSource0.bufferField.copyTo(buffer0, 0L, Math.min(0x20L, realBufferedSource0.bufferField.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource0.bufferField.size(), v) + " content=" + buffer0.readByteString().hex() + '…');
    }

    public static final boolean commonRequest(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
        while(realBufferedSource0.bufferField.size() < v) {
            if(realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) == -1L) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final void commonRequire(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(!realBufferedSource0.request(v)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull RealBufferedSource realBufferedSource0, @NotNull Options options0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        Intrinsics.checkNotNullParameter(options0, "options");
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
    alab1:
        while(true) {
            int v = -Buffer.selectPrefix(realBufferedSource0.bufferField, options0, true);
            switch(v) {
                case -2: {
                    if(realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) != -1L) {
                        break;
                    }
                    break alab1;
                }
                case -1: {
                    return -1;
                }
                default: {
                    realBufferedSource0.bufferField.skip(((long)options0.getByteStrings$okio()[v].size()));
                    return v;
                }
            }
        }
        return -1;
    }

    public static final void commonSkip(@NotNull RealBufferedSource realBufferedSource0, long v) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        if(realBufferedSource0.closed) {
            throw new IllegalStateException("closed");
        }
        while(v > 0L) {
            if(realBufferedSource0.bufferField.size() == 0L && realBufferedSource0.source.read(realBufferedSource0.bufferField, 0x2000L) == -1L) {
                throw new EOFException();
            }
            long v1 = Math.min(v, realBufferedSource0.bufferField.size());
            realBufferedSource0.bufferField.skip(v1);
            v -= v1;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        return realBufferedSource0.source.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSource realBufferedSource0) {
        Intrinsics.checkNotNullParameter(realBufferedSource0, "<this>");
        return "buffer(" + realBufferedSource0.source + ')';
    }
}

