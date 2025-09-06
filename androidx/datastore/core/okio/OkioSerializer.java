package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u001E\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u000EH¦@¢\u0006\u0002\u0010\u000FR\u0012\u0010\u0003\u001A\u00028\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/datastore/core/okio/OkioSerializer;", "T", "", "defaultValue", "getDefaultValue", "()Ljava/lang/Object;", "readFrom", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "sink", "Lokio/BufferedSink;", "(Ljava/lang/Object;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface OkioSerializer {
    Object getDefaultValue();

    @Nullable
    Object readFrom(@NotNull BufferedSource arg1, @NotNull Continuation arg2);

    @Nullable
    Object writeTo(Object arg1, @NotNull BufferedSink arg2, @NotNull Continuation arg3);
}

