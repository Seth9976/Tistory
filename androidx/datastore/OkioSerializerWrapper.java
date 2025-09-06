package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\fH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0013\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/datastore/OkioSerializerWrapper;", "T", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/Serializer;", "delegate", "<init>", "(Landroidx/datastore/core/Serializer;)V", "Lokio/BufferedSource;", "source", "readFrom", "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Ljava/lang/Object;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OkioSerializerWrapper implements OkioSerializer {
    public final Serializer a;

    public OkioSerializerWrapper(@NotNull Serializer serializer0) {
        Intrinsics.checkNotNullParameter(serializer0, "delegate");
        super();
        this.a = serializer0;
    }

    @Override  // androidx.datastore.core.okio.OkioSerializer
    public Object getDefaultValue() {
        return this.a.getDefaultValue();
    }

    @Override  // androidx.datastore.core.okio.OkioSerializer
    @Nullable
    public Object readFrom(@NotNull BufferedSource bufferedSource0, @NotNull Continuation continuation0) {
        InputStream inputStream0 = bufferedSource0.inputStream();
        return this.a.readFrom(inputStream0, continuation0);
    }

    @Override  // androidx.datastore.core.okio.OkioSerializer
    @Nullable
    public Object writeTo(Object object0, @NotNull BufferedSink bufferedSink0, @NotNull Continuation continuation0) {
        OutputStream outputStream0 = bufferedSink0.outputStream();
        Object object1 = this.a.writeTo(object0, outputStream0, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

