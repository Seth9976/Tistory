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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u001A2\u00020\u00012\u00020\u0002:\u0001\u001AB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u0006\u0010\rB!\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u001F\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0019\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001A\u00020\u000E8G¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0018¨\u0006\u001B"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "source", "Ljava/security/MessageDigest;", "digest", "<init>", "(Lokio/Source;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lokio/Source;Ljava/lang/String;)V", "Ljavax/crypto/Mac;", "mac", "(Lokio/Source;Ljavax/crypto/Mac;)V", "Lokio/ByteString;", "key", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "-deprecated_hash", "()Lokio/ByteString;", "hash", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HashingSource extends ForwardingSource implements Source {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u001F\u0010\f\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u000E\u0010\rJ\u001F\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lokio/HashingSource$Companion;", "", "Lokio/Source;", "source", "Lokio/HashingSource;", "md5", "(Lokio/Source;)Lokio/HashingSource;", "sha1", "sha256", "sha512", "Lokio/ByteString;", "key", "hmacSha1", "(Lokio/Source;Lokio/ByteString;)Lokio/HashingSource;", "hmacSha256", "hmacSha512", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            Intrinsics.checkNotNullParameter(byteString0, "key");
            return new HashingSource(source0, byteString0, "HmacSHA1");
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            Intrinsics.checkNotNullParameter(byteString0, "key");
            return new HashingSource(source0, byteString0, "HmacSHA256");
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            Intrinsics.checkNotNullParameter(byteString0, "key");
            return new HashingSource(source0, byteString0, "HmacSHA512");
        }

        @JvmStatic
        @NotNull
        public final HashingSource md5(@NotNull Source source0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            return new HashingSource(source0, "MD5");
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha1(@NotNull Source source0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            return new HashingSource(source0, "SHA-1");
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha256(@NotNull Source source0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            return new HashingSource(source0, "SHA-256");
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha512(@NotNull Source source0) {
            Intrinsics.checkNotNullParameter(source0, "source");
            return new HashingSource(source0, "SHA-512");
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
        HashingSource.Companion = new Companion(null);
    }

    public HashingSource(@NotNull Source source0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(source0, "source");
        Intrinsics.checkNotNullParameter(s, "algorithm");
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        Intrinsics.checkNotNullExpressionValue(messageDigest0, "getInstance(...)");
        this(source0, messageDigest0);
    }

    public HashingSource(@NotNull Source source0, @NotNull MessageDigest messageDigest0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        Intrinsics.checkNotNullParameter(messageDigest0, "digest");
        super(source0);
        this.b = messageDigest0;
        this.c = null;
    }

    public HashingSource(@NotNull Source source0, @NotNull Mac mac0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        Intrinsics.checkNotNullParameter(mac0, "mac");
        super(source0);
        this.c = mac0;
        this.b = null;
    }

    public HashingSource(@NotNull Source source0, @NotNull ByteString byteString0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(source0, "source");
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
        this(source0, mac0);
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
    public static final HashingSource hmacSha1(@NotNull Source source0, @NotNull ByteString byteString0) {
        return HashingSource.Companion.hmacSha1(source0, byteString0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source0, @NotNull ByteString byteString0) {
        return HashingSource.Companion.hmacSha256(source0, byteString0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source0, @NotNull ByteString byteString0) {
        return HashingSource.Companion.hmacSha512(source0, byteString0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource md5(@NotNull Source source0) {
        return HashingSource.Companion.md5(source0);
    }

    @Override  // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        long v1 = super.read(buffer0, v);
        if(v1 != -1L) {
            long v2 = buffer0.size() - v1;
            long v3 = buffer0.size();
            Segment segment0 = buffer0.head;
            Intrinsics.checkNotNull(segment0);
            while(v3 > v2) {
                segment0 = segment0.prev;
                Intrinsics.checkNotNull(segment0);
                v3 -= (long)(segment0.limit - segment0.pos);
            }
            while(v3 < buffer0.size()) {
                int v4 = (int)(((long)segment0.pos) + v2 - v3);
                MessageDigest messageDigest0 = this.b;
                if(messageDigest0 == null) {
                    Intrinsics.checkNotNull(this.c);
                    this.c.update(segment0.data, v4, segment0.limit - v4);
                }
                else {
                    messageDigest0.update(segment0.data, v4, segment0.limit - v4);
                }
                v3 += (long)(segment0.limit - segment0.pos);
                segment0 = segment0.next;
                Intrinsics.checkNotNull(segment0);
                v2 = v3;
            }
        }
        return v1;
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha1(@NotNull Source source0) {
        return HashingSource.Companion.sha1(source0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha256(@NotNull Source source0) {
        return HashingSource.Companion.sha256(source0);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha512(@NotNull Source source0) {
        return HashingSource.Companion.sha512(source0);
    }
}

