package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001B2\u00020\u00012\u00020\u0002:\u0001\u001BB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u0006\u0010\rB!\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u001F\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u001A\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001A\u001A\u00020\u000E8G¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0019¨\u0006\u001C"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "Ljava/security/MessageDigest;", "digest", "<init>", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lokio/Sink;Ljava/lang/String;)V", "Ljavax/crypto/Mac;", "mac", "(Lokio/Sink;Ljavax/crypto/Mac;)V", "Lokio/ByteString;", "key", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "-deprecated_hash", "()Lokio/ByteString;", "hash", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"})
public final class HashingSink extends ForwardingSink implements Sink {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u001F\u0010\f\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u000E\u0010\rJ\u001F\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lokio/HashingSink$Companion;", "", "Lokio/Sink;", "sink", "Lokio/HashingSink;", "md5", "(Lokio/Sink;)Lokio/HashingSink;", "sha1", "sha256", "sha512", "Lokio/ByteString;", "key", "hmacSha1", "(Lokio/Sink;Lokio/ByteString;)Lokio/HashingSink;", "hmacSha256", "hmacSha512", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final HashingSink hmacSha1(@NotNull Sink sink0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            Intrinsics.checkNotNullParameter(byteString0, "key");
            return new HashingSink(sink0, byteString0, "HmacSHA1");
        }

        @JvmStatic
        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            Intrinsics.checkNotNullParameter(byteString0, "key");
            return new HashingSink(sink0, byteString0, "HmacSHA256");
        }

        @JvmStatic
        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            Intrinsics.checkNotNullParameter(byteString0, "key");
            return new HashingSink(sink0, byteString0, "HmacSHA512");
        }

        @JvmStatic
        @NotNull
        public final HashingSink md5(@NotNull Sink sink0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            return new HashingSink(sink0, "MD5");
        }

        @JvmStatic
        @NotNull
        public final HashingSink sha1(@NotNull Sink sink0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            return new HashingSink(sink0, "SHA-1");
        }

        @JvmStatic
        @NotNull
        public final HashingSink sha256(@NotNull Sink sink0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            return new HashingSink(sink0, "SHA-256");
        }

        @JvmStatic
        @NotNull
        public final HashingSink sha512(@NotNull Sink sink0) {
            Intrinsics.checkNotNullParameter(sink0, "sink");
            return new HashingSink(sink0, "SHA-512");
        }
    }

    @NotNull
    public static final Companion Companion;
    public final MessageDigest b;
    public final Mac c;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hash", imports = {}))
    @JvmName(name = "-deprecated_hash")
    @NotNull
    public final ByteString -deprecated_hash() {
        return this.hash();
    }

    static {
        HashingSink.Companion = new Companion(null);
    }

    public HashingSink(@NotNull Sink sink0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        Intrinsics.checkNotNullParameter(s, "algorithm");
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        Intrinsics.checkNotNullExpressionValue(messageDigest0, "getInstance(...)");
        this(sink0, messageDigest0);
    }

    public HashingSink(@NotNull Sink sink0, @NotNull MessageDigest messageDigest0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        Intrinsics.checkNotNullParameter(messageDigest0, "digest");
        super(sink0);
        this.b = messageDigest0;
        this.c = null;
    }

    public HashingSink(@NotNull Sink sink0, @NotNull Mac mac0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        Intrinsics.checkNotNullParameter(mac0, "mac");
        super(sink0);
        this.c = mac0;
        this.b = null;
    }

    public HashingSink(@NotNull Sink sink0, @NotNull ByteString byteString0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        Mac mac0;
        Intrinsics.checkNotNullParameter(byteString0, "key");
        Intrinsics.checkNotNullParameter(s, "algorithm");
        try {
            mac0 = Mac.getInstance(s);
            mac0.init(new SecretKeySpec(byteString0.toByteArray(), s));
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new IllegalArgumentException(invalidKeyException0);
        }
        Intrinsics.checkNotNull(mac0);
        this(sink0, mac0);
    }

    @JvmName(name = "hash")
    @NotNull
    public final ByteString hash() {
        byte[] arr_b;
        MessageDigest messageDigest0 = this.b;
        if(messageDigest0 == null) {
            Intrinsics.checkNotNull(this.c);
            arr_b = this.c.doFinal();
        }
        else {
            arr_b = messageDigest0.digest();
        }
        Intrinsics.checkNotNull(arr_b);
        return new ByteString(arr_b);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink0, @NotNull ByteString byteString0) {
        return HashingSink.Companion.hmacSha1(sink0, byteString0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink0, @NotNull ByteString byteString0) {
        return HashingSink.Companion.hmacSha256(sink0, byteString0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink0, @NotNull ByteString byteString0) {
        return HashingSink.Companion.hmacSha512(sink0, byteString0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink md5(@NotNull Sink sink0) {
        return HashingSink.Companion.md5(sink0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink0) {
        return HashingSink.Companion.sha1(sink0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink0) {
        return HashingSink.Companion.sha256(sink0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink0) {
        return HashingSink.Companion.sha512(sink0);
    }

    @Override  // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        -SegmentedByteString.checkOffsetAndCount(buffer0.size(), 0L, v);
        Segment segment0 = buffer0.head;
        Intrinsics.checkNotNull(segment0);
        long v1 = 0L;
        while(v1 < v) {
            int v2 = (int)Math.min(v - v1, segment0.limit - segment0.pos);
            MessageDigest messageDigest0 = this.b;
            if(messageDigest0 == null) {
                Intrinsics.checkNotNull(this.c);
                this.c.update(segment0.data, segment0.pos, v2);
            }
            else {
                messageDigest0.update(segment0.data, segment0.pos, v2);
            }
            v1 += (long)v2;
            segment0 = segment0.next;
            Intrinsics.checkNotNull(segment0);
        }
        super.write(buffer0, v);
    }
}

