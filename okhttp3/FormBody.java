package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001D2\u00020\u0001:\u0002\u001E\u001DB%\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\u000B\u001A\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\b¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u000F\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\b¢\u0006\u0004\b\u000F\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\b¢\u0006\u0004\b\u0010\u0010\u000EJ\u0015\u0010\u0011\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u000EJ\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u001B\u0010\u001CR\u0011\u0010\u000B\u001A\u00020\b8G¢\u0006\u0006\u001A\u0004\b\u000B\u0010\n¨\u0006\u001F"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "-deprecated_size", "()I", "size", "index", "encodedName", "(I)Ljava/lang/String;", "name", "encodedValue", "value", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FormBody extends RequestBody {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\nJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", "add", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;", "addEncoded", "Lokhttp3/FormBody;", "build", "()Lokhttp3/FormBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public final Charset a;
        public final ArrayList b;
        public final ArrayList c;

        @JvmOverloads
        public Builder() {
            this(null, 1, null);
        }

        @JvmOverloads
        public Builder(@Nullable Charset charset0) {
            this.a = charset0;
            this.b = new ArrayList();
            this.c = new ArrayList();
        }

        public Builder(Charset charset0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                charset0 = null;
            }
            this(charset0);
        }

        @NotNull
        public final Builder add(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            String s2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.a, 91, null);
            this.b.add(s2);
            String s3 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.a, 91, null);
            this.c.add(s3);
            return this;
        }

        @NotNull
        public final Builder addEncoded(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            String s2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.a, 83, null);
            this.b.add(s2);
            String s3 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.a, 83, null);
            this.c.add(s3);
            return this;
        }

        @NotNull
        public final FormBody build() {
            return new FormBody(this.b, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "Lokhttp3/MediaType;", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class okhttp3.FormBody.Companion {
        public okhttp3.FormBody.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final okhttp3.FormBody.Companion Companion;
    public final List d;
    public final List e;
    public static final MediaType f;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    public final int -deprecated_size() {
        return this.size();
    }

    static {
        FormBody.Companion = new okhttp3.FormBody.Companion(null);
        FormBody.f = MediaType.Companion.get("application/x-www-form-urlencoded");
    }

    public FormBody(@NotNull List list0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(list0, "encodedNames");
        Intrinsics.checkNotNullParameter(list1, "encodedValues");
        super();
        this.d = Util.toImmutableList(list0);
        this.e = Util.toImmutableList(list1);
    }

    public final long a(BufferedSink bufferedSink0, boolean z) {
        Buffer buffer0;
        if(z) {
            buffer0 = new Buffer();
        }
        else {
            Intrinsics.checkNotNull(bufferedSink0);
            buffer0 = bufferedSink0.getBuffer();
        }
        List list0 = this.d;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                buffer0.writeByte(38);
            }
            buffer0.writeUtf8(((String)list0.get(v1)));
            buffer0.writeByte(61);
            buffer0.writeUtf8(((String)this.e.get(v1)));
        }
        if(z) {
            buffer0.clear();
            return buffer0.size();
        }
        return 0L;
    }

    @Override  // okhttp3.RequestBody
    public long contentLength() {
        return this.a(null, true);
    }

    @Override  // okhttp3.RequestBody
    @NotNull
    public MediaType contentType() {
        return FormBody.f;
    }

    @NotNull
    public final String encodedName(int v) {
        return (String)this.d.get(v);
    }

    @NotNull
    public final String encodedValue(int v) {
        return (String)this.e.get(v);
    }

    @NotNull
    public final String name(int v) {
        String s = this.encodedName(v);
        return Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, 0, 0, true, 3, null);
    }

    @JvmName(name = "size")
    public final int size() {
        return this.d.size();
    }

    @NotNull
    public final String value(int v) {
        String s = this.encodedValue(v);
        return Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, 0, 0, true, 3, null);
    }

    @Override  // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink bufferedSink0) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        this.a(bufferedSink0, false);
    }
}

