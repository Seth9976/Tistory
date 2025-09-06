package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \'2\u00020\u0001:\u0003(\')B\'\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0015\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0018\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010!\u001A\u00020 2\u0006\u0010\u001F\u001A\u00020\u001EH\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001A\u00020\u00048\u0007¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b\u0005\u0010\u0010R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\b\u0010\u001AR\u0011\u0010\u0015\u001A\u00020\u00128G¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0018\u001A\u00020\u000B8G¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0017¨\u0006*"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/ByteString;", "boundaryByteString", "Lokhttp3/MediaType;", "type", "", "Lokhttp3/MultipartBody$Part;", "parts", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "", "index", "part", "(I)Lokhttp3/MultipartBody$Part;", "contentType", "()Lokhttp3/MediaType;", "-deprecated_type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "-deprecated_parts", "()Ljava/util/List;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "e", "Lokhttp3/MediaType;", "f", "Ljava/util/List;", "Companion", "Builder", "Part", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MultipartBody extends RequestBody {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\f\u001A\u00020\u00002\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\u0010J\u001D\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\'\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00022\b\u0010\u0015\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0017¢\u0006\u0004\b\f\u0010\u0019J\r\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/MediaType;", "type", "setType", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/RequestBody;", "body", "addPart", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "name", "value", "addFormDataPart", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "part", "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "build", "()Lokhttp3/MultipartBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class Builder {
        public final ByteString a;
        public MediaType b;
        public final ArrayList c;

        @JvmOverloads
        public Builder() {
            this(null, 1, null);
        }

        @JvmOverloads
        public Builder(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "boundary");
            super();
            this.a = ByteString.Companion.encodeUtf8(s);
            this.b = MultipartBody.MIXED;
            this.c = new ArrayList();
        }

        public Builder(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "4d8d755b-37e2-4c3f-b659-10e1c0991170";
                Intrinsics.checkNotNullExpressionValue("4d8d755b-37e2-4c3f-b659-10e1c0991170", "randomUUID().toString()");
            }
            this(s);
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            this.addPart(Part.Companion.createFormData(s, s1));
            return this;
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String s, @Nullable String s1, @NotNull RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(requestBody0, "body");
            this.addPart(Part.Companion.createFormData(s, s1, requestBody0));
            return this;
        }

        @NotNull
        public final Builder addPart(@Nullable Headers headers0, @NotNull RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(requestBody0, "body");
            this.addPart(Part.Companion.create(headers0, requestBody0));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull Part multipartBody$Part0) {
            Intrinsics.checkNotNullParameter(multipartBody$Part0, "part");
            this.c.add(multipartBody$Part0);
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(requestBody0, "body");
            this.addPart(Part.Companion.create(requestBody0));
            return this;
        }

        @NotNull
        public final MultipartBody build() {
            ArrayList arrayList0 = this.c;
            if(arrayList0.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            MediaType mediaType0 = this.b;
            List list0 = Util.toImmutableList(arrayList0);
            return new MultipartBody(this.a, mediaType0, list0);
        }

        @NotNull
        public final Builder setType(@NotNull MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(mediaType0, "type");
            if(!Intrinsics.areEqual(mediaType0.type(), "multipart")) {
                throw new IllegalArgumentException(("multipart != " + mediaType0).toString());
            }
            this.b = mediaType0;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\t\u001A\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000FR\u0014\u0010\u0011\u001A\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000FR\u0014\u0010\u0012\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void appendQuotedString$okhttp(@NotNull StringBuilder stringBuilder0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(stringBuilder0, "<this>");
            Intrinsics.checkNotNullParameter(s, "key");
            stringBuilder0.append('\"');
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(v2 == 10) {
                    stringBuilder0.append("%0A");
                }
                else {
                    switch(v2) {
                        case 13: {
                            stringBuilder0.append("%0D");
                            break;
                        }
                        case 34: {
                            stringBuilder0.append("%22");
                            break;
                        }
                        default: {
                            stringBuilder0.append(((char)v2));
                        }
                    }
                }
            }
            stringBuilder0.append('\"');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EJ\u0011\u0010\u0005\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\t\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001A\u00020\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\t\u0010\b¨\u0006\u000F"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "-deprecated_body", "()Lokhttp3/RequestBody;", "body", "a", "Lokhttp3/Headers;", "b", "Lokhttp3/RequestBody;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Part {
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001A\u00020\u00042\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001F\u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000EJ)\u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\u000F\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "Lokhttp3/RequestBody;", "body", "Lokhttp3/MultipartBody$Part;", "create", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "", "name", "value", "createFormData", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class okhttp3.MultipartBody.Part.Companion {
            public okhttp3.MultipartBody.Part.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final Part create(@Nullable Headers headers0, @NotNull RequestBody requestBody0) {
                Intrinsics.checkNotNullParameter(requestBody0, "body");
                if((headers0 == null ? null : headers0.get("Content-Type")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if((headers0 == null ? null : headers0.get("Content-Length")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new Part(headers0, requestBody0, null);
            }

            @JvmStatic
            @NotNull
            public final Part create(@NotNull RequestBody requestBody0) {
                Intrinsics.checkNotNullParameter(requestBody0, "body");
                return this.create(null, requestBody0);
            }

            @JvmStatic
            @NotNull
            public final Part createFormData(@NotNull String s, @NotNull String s1) {
                Intrinsics.checkNotNullParameter(s, "name");
                Intrinsics.checkNotNullParameter(s1, "value");
                return this.createFormData(s, null, okhttp3.RequestBody.Companion.create$default(RequestBody.Companion, s1, null, 1, null));
            }

            @JvmStatic
            @NotNull
            public final Part createFormData(@NotNull String s, @Nullable String s1, @NotNull RequestBody requestBody0) {
                Intrinsics.checkNotNullParameter(s, "name");
                Intrinsics.checkNotNullParameter(requestBody0, "body");
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("form-data; name=");
                Companion multipartBody$Companion0 = MultipartBody.Companion;
                multipartBody$Companion0.appendQuotedString$okhttp(stringBuilder0, s);
                if(s1 != null) {
                    stringBuilder0.append("; filename=");
                    multipartBody$Companion0.appendQuotedString$okhttp(stringBuilder0, s1);
                }
                String s2 = stringBuilder0.toString();
                Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
                return this.create(new okhttp3.Headers.Builder().addUnsafeNonAscii("Content-Disposition", s2).build(), requestBody0);
            }
        }

        @NotNull
        public static final okhttp3.MultipartBody.Part.Companion Companion;
        public final Headers a;
        public final RequestBody b;

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
        @JvmName(name = "-deprecated_body")
        @NotNull
        public final RequestBody -deprecated_body() {
            return this.b;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        @JvmName(name = "-deprecated_headers")
        @Nullable
        public final Headers -deprecated_headers() {
            return this.a;
        }

        static {
            Part.Companion = new okhttp3.MultipartBody.Part.Companion(null);
        }

        public Part(Headers headers0, RequestBody requestBody0, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = headers0;
            this.b = requestBody0;
        }

        @JvmName(name = "body")
        @NotNull
        public final RequestBody body() {
            return this.b;
        }

        @JvmStatic
        @NotNull
        public static final Part create(@Nullable Headers headers0, @NotNull RequestBody requestBody0) {
            return Part.Companion.create(headers0, requestBody0);
        }

        @JvmStatic
        @NotNull
        public static final Part create(@NotNull RequestBody requestBody0) {
            return Part.Companion.create(requestBody0);
        }

        @JvmStatic
        @NotNull
        public static final Part createFormData(@NotNull String s, @NotNull String s1) {
            return Part.Companion.createFormData(s, s1);
        }

        @JvmStatic
        @NotNull
        public static final Part createFormData(@NotNull String s, @Nullable String s1, @NotNull RequestBody requestBody0) {
            return Part.Companion.createFormData(s, s1, requestBody0);
        }

        @JvmName(name = "headers")
        @Nullable
        public final Headers headers() {
            return this.a;
        }
    }

    @JvmField
    @NotNull
    public static final MediaType ALTERNATIVE;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final MediaType DIGEST;
    @JvmField
    @NotNull
    public static final MediaType FORM;
    @JvmField
    @NotNull
    public static final MediaType MIXED;
    @JvmField
    @NotNull
    public static final MediaType PARALLEL;
    public final ByteString d;
    public final MediaType e;
    public final List f;
    public final MediaType g;
    public long h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "boundary", imports = {}))
    @JvmName(name = "-deprecated_boundary")
    @NotNull
    public final String -deprecated_boundary() {
        return this.boundary();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "parts", imports = {}))
    @JvmName(name = "-deprecated_parts")
    @NotNull
    public final List -deprecated_parts() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    public final int -deprecated_size() {
        return this.size();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    public final MediaType -deprecated_type() {
        return this.e;
    }

    static {
        MultipartBody.Companion = new Companion(null);
        MultipartBody.MIXED = MediaType.Companion.get("multipart/mixed");
        MultipartBody.ALTERNATIVE = MediaType.Companion.get("multipart/alternative");
        MultipartBody.DIGEST = MediaType.Companion.get("multipart/digest");
        MultipartBody.PARALLEL = MediaType.Companion.get("multipart/parallel");
        MultipartBody.FORM = MediaType.Companion.get("multipart/form-data");
        MultipartBody.i = new byte[]{58, 0x20};
        MultipartBody.j = new byte[]{13, 10};
        MultipartBody.k = new byte[]{45, 45};
    }

    public MultipartBody(@NotNull ByteString byteString0, @NotNull MediaType mediaType0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(byteString0, "boundaryByteString");
        Intrinsics.checkNotNullParameter(mediaType0, "type");
        Intrinsics.checkNotNullParameter(list0, "parts");
        super();
        this.d = byteString0;
        this.e = mediaType0;
        this.f = list0;
        this.g = MediaType.Companion.get(mediaType0 + "; boundary=" + this.boundary());
        this.h = -1L;
    }

    public final long a(BufferedSink bufferedSink0, boolean z) {
        byte[] arr_b1;
        byte[] arr_b;
        ByteString byteString0;
        BufferedSink bufferedSink2;
        BufferedSink bufferedSink1;
        if(z) {
            bufferedSink1 = new Buffer();
            bufferedSink2 = bufferedSink1;
        }
        else {
            bufferedSink2 = null;
            bufferedSink1 = bufferedSink0;
        }
        List list0 = this.f;
        int v = list0.size();
        long v1 = 0L;
        for(int v2 = 0; true; ++v2) {
            byteString0 = this.d;
            arr_b = MultipartBody.k;
            arr_b1 = MultipartBody.j;
            if(v2 >= v) {
                break;
            }
            Part multipartBody$Part0 = (Part)list0.get(v2);
            Headers headers0 = multipartBody$Part0.headers();
            RequestBody requestBody0 = multipartBody$Part0.body();
            Intrinsics.checkNotNull(bufferedSink1);
            bufferedSink1.write(arr_b);
            bufferedSink1.write(byteString0);
            bufferedSink1.write(arr_b1);
            if(headers0 != null) {
                int v3 = headers0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    bufferedSink1.writeUtf8(headers0.name(v4)).write(MultipartBody.i).writeUtf8(headers0.value(v4)).write(arr_b1);
                }
            }
            MediaType mediaType0 = requestBody0.contentType();
            if(mediaType0 != null) {
                bufferedSink1.writeUtf8("Content-Type: ").writeUtf8(mediaType0.toString()).write(arr_b1);
            }
            long v5 = requestBody0.contentLength();
            if(v5 != -1L) {
                bufferedSink1.writeUtf8("Content-Length: ").writeDecimalLong(v5).write(arr_b1);
            }
            else if(z) {
                Intrinsics.checkNotNull(bufferedSink2);
                ((Buffer)bufferedSink2).clear();
                return -1L;
            }
            bufferedSink1.write(arr_b1);
            if(z) {
                v1 += v5;
            }
            else {
                requestBody0.writeTo(bufferedSink1);
            }
            bufferedSink1.write(arr_b1);
        }
        Intrinsics.checkNotNull(bufferedSink1);
        bufferedSink1.write(arr_b);
        bufferedSink1.write(byteString0);
        bufferedSink1.write(arr_b);
        bufferedSink1.write(arr_b1);
        if(z) {
            Intrinsics.checkNotNull(bufferedSink2);
            v1 += ((Buffer)bufferedSink2).size();
            ((Buffer)bufferedSink2).clear();
        }
        return v1;
    }

    @JvmName(name = "boundary")
    @NotNull
    public final String boundary() {
        return this.d.utf8();
    }

    @Override  // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long v = this.h;
        if(v == -1L) {
            v = this.a(null, true);
            this.h = v;
        }
        return v;
    }

    @Override  // okhttp3.RequestBody
    @NotNull
    public MediaType contentType() {
        return this.g;
    }

    @NotNull
    public final Part part(int v) {
        return (Part)this.f.get(v);
    }

    @JvmName(name = "parts")
    @NotNull
    public final List parts() {
        return this.f;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f.size();
    }

    @JvmName(name = "type")
    @NotNull
    public final MediaType type() {
        return this.e;
    }

    @Override  // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink bufferedSink0) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        this.a(bufferedSink0, false);
    }
}

