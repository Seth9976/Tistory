package kotlinx.serialization;

import a5.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001F\b\u0016\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001A\u00020\u0003¢\u0006\u0004\b\b\u0010\u000BB\u0019\b\u0016\u0012\u0006\u0010\f\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003¢\u0006\u0004\b\b\u0010\rB\u0011\b\u0011\u0012\u0006\u0010\f\u001A\u00020\u0003¢\u0006\u0004\b\b\u0010\u000ER\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "missingFields", "message", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "a", "Ljava/util/List;", "getMissingFields", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public final class MissingFieldException extends SerializationException {
    public final List a;

    @PublishedApi
    public MissingFieldException(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "missingField");
        this(k.listOf(s), "Field \'" + s + "\' is required, but it was missing", null);
    }

    public MissingFieldException(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "missingField");
        Intrinsics.checkNotNullParameter(s1, "serialName");
        this(k.listOf(s), "Field \'" + s + "\' is required for type with serial name \'" + s1 + "\', but it was missing", null);
    }

    public MissingFieldException(@NotNull List list0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(list0, "missingFields");
        Intrinsics.checkNotNullParameter(s, "serialName");
        this(list0, (list0.size() == 1 ? b.r(new StringBuilder("Field \'"), ((String)list0.get(0)), "\' is required for type with serial name \'", s, "\', but it was missing") : "Fields " + list0 + " are required for type with serial name \'" + s + "\', but they were missing"), null);
    }

    public MissingFieldException(@NotNull List list0, @Nullable String s, @Nullable Throwable throwable0) {
        Intrinsics.checkNotNullParameter(list0, "missingFields");
        super(s, throwable0);
        this.a = list0;
    }

    @NotNull
    public final List getMissingFields() {
        return this.a;
    }
}

