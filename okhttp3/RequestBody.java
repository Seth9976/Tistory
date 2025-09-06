package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016J\n\u0010\u0005\u001A\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001A\u00020\bH\u0016J\b\u0010\t\u001A\u00020\bH\u0016J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH&¨\u0006\u000F"}, d2 = {"Lokhttp3/RequestBody;", "", "()V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "isDuplex", "", "isOneShot", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class RequestBody {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\b\u001A\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\b\u001A\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ3\u0010\b\u001A\u00020\u0005*\u00020\u000B2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000FJ\u001F\u0010\u0012\u001A\u00020\u0005*\u00020\u00102\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0011J!\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0014J!\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0006\u0010\u0015J5\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\u0016J!\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001A\u00020\u0010H\u0007¢\u0006\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "Lokio/ByteString;", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;Lokio/ByteString;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", "file", "(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull File file0, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(file0, "<this>");
            return new RequestBody() {
                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return this.e.length();
                }

                @Override  // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return file0;
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink bufferedSink0) {
                    Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
                    Source source0 = Okio.source(this.e);
                    try {
                        bufferedSink0.writeAll(source0);
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(source0, throwable0);
                        throw throwable0;
                    }
                    CloseableKt.closeFinally(source0, null);
                }
            };
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull String s, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            Charset charset0 = Charsets.UTF_8;
            if(mediaType0 != null) {
                Charset charset1 = MediaType.charset$default(mediaType0, null, 1, null);
                if(charset1 == null) {
                    mediaType0 = MediaType.Companion.parse(mediaType0 + "; charset=utf-8");
                }
                else {
                    charset0 = charset1;
                }
            }
            byte[] arr_b = s.getBytes(charset0);
            Intrinsics.checkNotNullExpressionValue(arr_b, "this as java.lang.String).getBytes(charset)");
            return this.create(arr_b, mediaType0, 0, arr_b.length);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'file\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType0, @NotNull File file0) {
            Intrinsics.checkNotNullParameter(file0, "file");
            return this.create(file0, mediaType0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "content");
            return this.create(s, mediaType0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(byteString0, "content");
            return this.create(byteString0, mediaType0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b) {
            Intrinsics.checkNotNullParameter(arr_b, "content");
            return Companion.create$default(this, mediaType0, arr_b, 0, 0, 12, null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b, int v) {
            Intrinsics.checkNotNullParameter(arr_b, "content");
            return Companion.create$default(this, mediaType0, arr_b, v, 0, 8, null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b, int v, int v1) {
            Intrinsics.checkNotNullParameter(arr_b, "content");
            return this.create(arr_b, mediaType0, v, v1);
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull ByteString byteString0, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(byteString0, "<this>");
            return new RequestBody() {
                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return (long)this.e.size();
                }

                @Override  // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return byteString0;
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink bufferedSink0) {
                    Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
                    bufferedSink0.write(this.e);
                }
            };
        }

        @JvmName(name = "create")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull byte[] arr_b) {
            Intrinsics.checkNotNullParameter(arr_b, "<this>");
            return Companion.create$default(this, arr_b, null, 0, 0, 7, null);
        }

        @JvmName(name = "create")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(arr_b, "<this>");
            return Companion.create$default(this, arr_b, mediaType0, 0, 0, 6, null);
        }

        @JvmName(name = "create")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0, int v) {
            Intrinsics.checkNotNullParameter(arr_b, "<this>");
            return Companion.create$default(this, arr_b, mediaType0, v, 0, 4, null);
        }

        @JvmName(name = "create")
        @JvmOverloads
        @JvmStatic
        @NotNull
        public final RequestBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0, int v, int v1) {
            Intrinsics.checkNotNullParameter(arr_b, "<this>");
            Util.checkOffsetAndCount(arr_b.length, v, v1);
            return new RequestBody() {
                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return (long)v;
                }

                @Override  // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return arr_b;
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink bufferedSink0) {
                    Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
                    bufferedSink0.write(v1, this.g, v);
                }
            };
        }

        public static RequestBody create$default(Companion requestBody$Companion0, File file0, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return requestBody$Companion0.create(file0, mediaType0);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, String s, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return requestBody$Companion0.create(s, mediaType0);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, MediaType mediaType0, byte[] arr_b, int v, int v1, int v2, Object object0) {
            if((v2 & 4) != 0) {
                v = 0;
            }
            if((v2 & 8) != 0) {
                v1 = arr_b.length;
            }
            return requestBody$Companion0.create(mediaType0, arr_b, v, v1);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, ByteString byteString0, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return requestBody$Companion0.create(byteString0, mediaType0);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, byte[] arr_b, MediaType mediaType0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                mediaType0 = null;
            }
            if((v2 & 2) != 0) {
                v = 0;
            }
            if((v2 & 4) != 0) {
                v1 = arr_b.length;
            }
            return requestBody$Companion0.create(arr_b, mediaType0, v, v1);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        RequestBody.Companion = new Companion(null);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull File file0, @Nullable MediaType mediaType0) {
        return RequestBody.Companion.create(file0, mediaType0);
    }

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull String s, @Nullable MediaType mediaType0) {
        return RequestBody.Companion.create(s, mediaType0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'file\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType0, @NotNull File file0) {
        return RequestBody.Companion.create(mediaType0, file0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType0, @NotNull String s) {
        return RequestBody.Companion.create(mediaType0, s);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType0, @NotNull ByteString byteString0) {
        return RequestBody.Companion.create(mediaType0, byteString0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b) {
        return RequestBody.Companion.create(mediaType0, arr_b);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b, int v) {
        return RequestBody.Companion.create(mediaType0, arr_b, v);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b, int v, int v1) {
        return RequestBody.Companion.create(mediaType0, arr_b, v, v1);
    }

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull ByteString byteString0, @Nullable MediaType mediaType0) {
        return RequestBody.Companion.create(byteString0, mediaType0);
    }

    @JvmName(name = "create")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull byte[] arr_b) {
        return RequestBody.Companion.create(arr_b);
    }

    @JvmName(name = "create")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0) {
        return RequestBody.Companion.create(arr_b, mediaType0);
    }

    @JvmName(name = "create")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0, int v) {
        return RequestBody.Companion.create(arr_b, mediaType0, v);
    }

    @JvmName(name = "create")
    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final RequestBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0, int v, int v1) {
        return RequestBody.Companion.create(arr_b, mediaType0, v, v1);
    }

    public boolean isDuplex() [...] // Inlined contents

    public boolean isOneShot() [...] // Inlined contents

    public abstract void writeTo(@NotNull BufferedSink arg1) throws IOException;
}

