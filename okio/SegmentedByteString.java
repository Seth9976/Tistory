package okio;

import a5.b;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001F\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0001H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0001H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u000BH\u0010\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001F\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u0001H\u0010\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u000FJ\u001F\u0010 \u001A\u00020\u00012\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u001F\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b \u0010!J\u0017\u0010&\u001A\u00020#2\u0006\u0010\"\u001A\u00020\u001DH\u0010\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010)\u001A\u00020\u001DH\u0010\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010*\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0017\u00102\u001A\u0002012\u0006\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b2\u00103J\'\u00102\u001A\u0002012\u0006\u00105\u001A\u0002042\u0006\u00106\u001A\u00020\u001D2\u0006\u00107\u001A\u00020\u001DH\u0010\u00A2\u0006\u0004\b8\u00109J/\u0010=\u001A\u00020<2\u0006\u00106\u001A\u00020\u001D2\u0006\u0010:\u001A\u00020\u00012\u0006\u0010;\u001A\u00020\u001D2\u0006\u00107\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b=\u0010>J/\u0010=\u001A\u00020<2\u0006\u00106\u001A\u00020\u001D2\u0006\u0010:\u001A\u00020\u00032\u0006\u0010;\u001A\u00020\u001D2\u0006\u00107\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b=\u0010?J/\u0010B\u001A\u0002012\u0006\u00106\u001A\u00020\u001D2\u0006\u0010@\u001A\u00020\u00032\u0006\u0010A\u001A\u00020\u001D2\u0006\u00107\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\bB\u0010CJ\u001F\u0010E\u001A\u00020\u001D2\u0006\u0010:\u001A\u00020\u00032\u0006\u0010D\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\bE\u0010FJ\u001F\u0010G\u001A\u00020\u001D2\u0006\u0010:\u001A\u00020\u00032\u0006\u0010D\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\bG\u0010FJ\u000F\u0010I\u001A\u00020\u0003H\u0010\u00A2\u0006\u0004\bH\u0010+J\u001A\u0010K\u001A\u00020<2\b\u0010:\u001A\u0004\u0018\u00010JH\u0096\u0002\u00A2\u0006\u0004\bK\u0010LJ\u000F\u0010M\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\bM\u0010(J\u000F\u0010N\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\bN\u0010\u000FR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010RR\u001A\u0010\u0006\u001A\u00020\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010V\u00A8\u0006W"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "Ljava/nio/charset/Charset;", "charset", "", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "()Ljava/lang/String;", "hex", "toAsciiLowercase", "()Lokio/ByteString;", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "toByteArray", "()[B", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "", "write", "(Ljava/io/OutputStream;)V", "Lokio/Buffer;", "buffer", "offset", "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", "target", "targetOffset", "copyInto", "(I[BII)V", "fromIndex", "indexOf", "([BI)I", "lastIndexOf", "internalArray$okio", "internalArray", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "d", "[[B", "getSegments$okio", "()[[B", "e", "[I", "getDirectory$okio", "()[I", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] d;
    public final transient int[] e;

    public SegmentedByteString(@NotNull byte[][] arr2_b, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr2_b, "segments");
        Intrinsics.checkNotNullParameter(arr_v, "directory");
        super(ByteString.EMPTY.getData$okio());
        this.d = arr2_b;
        this.e = arr_v;
    }

    public final ByteString a() {
        return new ByteString(this.toByteArray());
    }

    @Override  // okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBuffer0, "asReadOnlyBuffer(...)");
        return byteBuffer0;
    }

    @Override  // okio.ByteString
    @NotNull
    public String base64() {
        return this.a().base64();
    }

    @Override  // okio.ByteString
    @NotNull
    public String base64Url() {
        return this.a().base64Url();
    }

    @Override  // okio.ByteString
    public void copyInto(int v, @NotNull byte[] arr_b, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "target");
        -SegmentedByteString.checkOffsetAndCount(this.size(), v, v2);
        -SegmentedByteString.checkOffsetAndCount(arr_b.length, v1, v2);
        int v3 = v2 + v;
        for(int v4 = okio.internal.-SegmentedByteString.segment(this, v); v < v3; ++v4) {
            int v5 = v4 == 0 ? 0 : this.getDirectory$okio()[v4 - 1];
            int v6 = Math.min(v3, this.getDirectory$okio()[v4]) - v;
            int v7 = v - v5 + this.getDirectory$okio()[this.getSegments$okio().length + v4];
            ArraysKt___ArraysJvmKt.copyInto(this.getSegments$okio()[v4], arr_b, v1, v7, v7 + v6);
            v1 += v6;
            v += v6;
        }
    }

    @Override  // okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "algorithm");
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        byte[][] arr2_b = this.getSegments$okio();
        int v = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v3) {
            int v2 = this.getDirectory$okio()[arr2_b.length + v];
            int v3 = this.getDirectory$okio()[v];
            messageDigest0.update(this.getSegments$okio()[v], v2, v3 - v1);
            ++v;
        }
        byte[] arr_b = messageDigest0.digest();
        Intrinsics.checkNotNull(arr_b);
        return new ByteString(arr_b);
    }

    // 去混淆评级： 低(20)
    @Override  // okio.ByteString
    public boolean equals(@Nullable Object object0) {
        return object0 == this || object0 instanceof ByteString && ((ByteString)object0).size() == this.size() && this.rangeEquals(0, ((ByteString)object0), 0, this.size());
    }

    @NotNull
    public final int[] getDirectory$okio() {
        return this.e;
    }

    @NotNull
    public final byte[][] getSegments$okio() {
        return this.d;
    }

    @Override  // okio.ByteString
    public int getSize$okio() {
        return this.getDirectory$okio()[this.getSegments$okio().length - 1];
    }

    @Override  // okio.ByteString
    public int hashCode() {
        int v = this.getHashCode$okio();
        if(v == 0) {
            byte[][] arr2_b = this.getSegments$okio();
            int v1 = 0;
            int v2 = 1;
            for(int v3 = 0; v1 < arr2_b.length; v3 = v5) {
                int v4 = this.getDirectory$okio()[arr2_b.length + v1];
                int v5 = this.getDirectory$okio()[v1];
                byte[] arr_b = this.getSegments$okio()[v1];
                int v6 = v5 - v3 + v4;
                while(v4 < v6) {
                    v2 = v2 * 0x1F + arr_b[v4];
                    ++v4;
                }
                ++v1;
            }
            this.setHashCode$okio(v2);
            return v2;
        }
        return v;
    }

    @Override  // okio.ByteString
    @NotNull
    public String hex() {
        return this.a().hex();
    }

    @Override  // okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String s, @NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(s, "algorithm");
        Intrinsics.checkNotNullParameter(byteString0, "key");
        try {
            Mac mac0 = Mac.getInstance(s);
            mac0.init(new SecretKeySpec(byteString0.toByteArray(), s));
            byte[][] arr2_b = this.getSegments$okio();
            int v = 0;
            for(int v1 = 0; v < arr2_b.length; v1 = v3) {
                int v2 = this.getDirectory$okio()[arr2_b.length + v];
                int v3 = this.getDirectory$okio()[v];
                mac0.update(this.getSegments$okio()[v], v2, v3 - v1);
                ++v;
            }
            byte[] arr_b = mac0.doFinal();
            Intrinsics.checkNotNullExpressionValue(arr_b, "doFinal(...)");
            return new ByteString(arr_b);
        }
        catch(InvalidKeyException invalidKeyException0) {
        }
        throw new IllegalArgumentException(invalidKeyException0);
    }

    @Override  // okio.ByteString
    public int indexOf(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        return this.a().indexOf(arr_b, v);
    }

    @Override  // okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return this.toByteArray();
    }

    @Override  // okio.ByteString
    public byte internalGet$okio(int v) {
        -SegmentedByteString.checkOffsetAndCount(this.getDirectory$okio()[this.getSegments$okio().length - 1], v, 1L);
        int v1 = okio.internal.-SegmentedByteString.segment(this, v);
        return v1 == 0 ? this.getSegments$okio()[0][v + this.getDirectory$okio()[this.getSegments$okio().length]] : this.getSegments$okio()[v1][v - this.getDirectory$okio()[v1 - 1] + this.getDirectory$okio()[this.getSegments$okio().length + v1]];
    }

    @Override  // okio.ByteString
    public int lastIndexOf(@NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        return this.a().lastIndexOf(arr_b, v);
    }

    @Override  // okio.ByteString
    public boolean rangeEquals(int v, @NotNull ByteString byteString0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(byteString0, "other");
        if(v >= 0 && v <= this.size() - v2) {
            int v3 = v2 + v;
            for(int v4 = okio.internal.-SegmentedByteString.segment(this, v); v < v3; ++v4) {
                int v5 = v4 == 0 ? 0 : this.getDirectory$okio()[v4 - 1];
                int v6 = Math.min(v3, this.getDirectory$okio()[v4]) - v;
                if(!byteString0.rangeEquals(v1, this.getSegments$okio()[v4], v - v5 + this.getDirectory$okio()[this.getSegments$okio().length + v4], v6)) {
                    return false;
                }
                v1 += v6;
                v += v6;
            }
            return true;
        }
        return false;
    }

    @Override  // okio.ByteString
    public boolean rangeEquals(int v, @NotNull byte[] arr_b, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        if(v >= 0 && v <= this.size() - v2 && v1 >= 0 && v1 <= arr_b.length - v2) {
            int v3 = v2 + v;
            for(int v4 = okio.internal.-SegmentedByteString.segment(this, v); v < v3; ++v4) {
                int v5 = v4 == 0 ? 0 : this.getDirectory$okio()[v4 - 1];
                int v6 = Math.min(v3, this.getDirectory$okio()[v4]) - v;
                if(!-SegmentedByteString.arrayRangeEquals(this.getSegments$okio()[v4], v - v5 + this.getDirectory$okio()[this.getSegments$okio().length + v4], arr_b, v1, v6)) {
                    return false;
                }
                v1 += v6;
                v += v6;
            }
            return true;
        }
        return false;
    }

    @Override  // okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(charset0, "charset");
        return this.a().string(charset0);
    }

    @Override  // okio.ByteString
    @NotNull
    public ByteString substring(int v, int v1) {
        int v2 = -SegmentedByteString.resolveDefaultParameter(this, v1);
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex=" + v + " < 0").toString());
        }
        if(v2 <= this.size()) {
            int v3 = v2 - v;
            if(v3 < 0) {
                throw new IllegalArgumentException(("endIndex=" + v2 + " < beginIndex=" + v).toString());
            }
            if(v == 0 && v2 == this.size()) {
                return this;
            }
            if(v == v2) {
                return ByteString.EMPTY;
            }
            int v4 = okio.internal.-SegmentedByteString.segment(this, v);
            int v5 = okio.internal.-SegmentedByteString.segment(this, v2 - 1);
            byte[][] arr2_b = (byte[][])ArraysKt___ArraysJvmKt.copyOfRange(this.getSegments$okio(), v4, v5 + 1);
            int[] arr_v = new int[arr2_b.length * 2];
            int v6 = 0;
            if(v4 <= v5) {
                int v7 = v4;
                for(int v8 = 0; true; ++v8) {
                    arr_v[v8] = Math.min(this.getDirectory$okio()[v7] - v, v3);
                    arr_v[v8 + arr2_b.length] = this.getDirectory$okio()[this.getSegments$okio().length + v7];
                    if(v7 == v5) {
                        break;
                    }
                    ++v7;
                }
            }
            if(v4 != 0) {
                v6 = this.getDirectory$okio()[v4 - 1];
            }
            arr_v[arr2_b.length] = v - v6 + arr_v[arr2_b.length];
            return new SegmentedByteString(arr2_b, arr_v);
        }
        StringBuilder stringBuilder0 = b.s(v2, "endIndex=", " > length(");
        stringBuilder0.append(this.size());
        stringBuilder0.append(')');
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return this.a().toAsciiLowercase();
    }

    @Override  // okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return this.a().toAsciiUppercase();
    }

    @Override  // okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] arr_b = new byte[this.size()];
        byte[][] arr2_b = this.getSegments$okio();
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v4) {
            int v3 = this.getDirectory$okio()[arr2_b.length + v];
            int v4 = this.getDirectory$okio()[v];
            int v5 = v4 - v1;
            ArraysKt___ArraysJvmKt.copyInto(this.getSegments$okio()[v], arr_b, v2, v3, v3 + v5);
            v2 += v5;
            ++v;
        }
        return arr_b;
    }

    @Override  // okio.ByteString
    @NotNull
    public String toString() {
        return this.a().toString();
    }

    @Override  // okio.ByteString
    public void write(@NotNull OutputStream outputStream0) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream0, "out");
        byte[][] arr2_b = this.getSegments$okio();
        int v = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v3) {
            int v2 = this.getDirectory$okio()[arr2_b.length + v];
            int v3 = this.getDirectory$okio()[v];
            outputStream0.write(this.getSegments$okio()[v], v2, v3 - v1);
            ++v;
        }
    }

    @Override  // okio.ByteString
    public void write$okio(@NotNull Buffer buffer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(buffer0, "buffer");
        int v2 = v + v1;
        for(int v3 = okio.internal.-SegmentedByteString.segment(this, v); v < v2; ++v3) {
            int v4 = v3 == 0 ? 0 : this.getDirectory$okio()[v3 - 1];
            int v5 = Math.min(v2, this.getDirectory$okio()[v3]) - v;
            int v6 = v - v4 + this.getDirectory$okio()[this.getSegments$okio().length + v3];
            Segment segment0 = new Segment(this.getSegments$okio()[v3], v6, v6 + v5, true, false);
            Segment segment1 = buffer0.head;
            if(segment1 == null) {
                segment0.prev = segment0;
                segment0.next = segment0;
                buffer0.head = segment0;
            }
            else {
                Intrinsics.checkNotNull(segment1);
                Segment segment2 = segment1.prev;
                Intrinsics.checkNotNull(segment2);
                segment2.push(segment0);
            }
            v += v5;
        }
        buffer0.setSize$okio(buffer0.size() + ((long)v1));
    }
}

