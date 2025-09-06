package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u000E¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/content/MediaType;", "", "", "representation", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRepresentation", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MediaType {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u0017\u0010\u000B\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/content/MediaType$Companion;", "", "Landroidx/compose/foundation/content/MediaType;", "Text", "Landroidx/compose/foundation/content/MediaType;", "getText", "()Landroidx/compose/foundation/content/MediaType;", "PlainText", "getPlainText", "HtmlText", "getHtmlText", "Image", "getImage", "All", "getAll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MediaType getAll() {
            return MediaType.f;
        }

        @NotNull
        public final MediaType getHtmlText() {
            return MediaType.d;
        }

        @NotNull
        public final MediaType getImage() {
            return MediaType.e;
        }

        @NotNull
        public final MediaType getPlainText() {
            return MediaType.c;
        }

        @NotNull
        public final MediaType getText() {
            return MediaType.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public static final MediaType b;
    public static final MediaType c;
    public static final MediaType d;
    public static final MediaType e;
    public static final MediaType f;

    static {
        MediaType.Companion = new Companion(null);
        MediaType.b = new MediaType("text/*");
        MediaType.c = new MediaType("text/plain");
        MediaType.d = new MediaType("text/html");
        MediaType.e = new MediaType("image/*");
        MediaType.f = new MediaType("*/*");
    }

    public MediaType(@NotNull String s) {
        this.a = s;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MediaType ? Intrinsics.areEqual(this.a, ((MediaType)object0).a) : false;
    }

    @NotNull
    public final String getRepresentation() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return a.o(new StringBuilder("MediaType(representation=\'"), this.a, "\')");
    }
}

