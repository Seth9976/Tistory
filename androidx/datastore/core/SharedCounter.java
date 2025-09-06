package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "", "getValue", "()I", "incrementAndGetValue", "Factory", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SharedCounter {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001D\u0010\u000B\u001A\u00020\b2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\r\u001A\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "", "loadLib", "()V", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/SharedCounter;", "create$datastore_core_release", "(Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/SharedCounter;", "create", "Landroidx/datastore/core/NativeSharedCounter;", "nativeSharedCounter", "Landroidx/datastore/core/NativeSharedCounter;", "getNativeSharedCounter$datastore_core_release", "()Landroidx/datastore/core/NativeSharedCounter;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final SharedCounter a(ParcelFileDescriptor parcelFileDescriptor0) {
            int v = parcelFileDescriptor0.getFd();
            if(this.getNativeSharedCounter$datastore_core_release().nativeTruncateFile(v) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long v1 = this.getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(v);
            if(v1 < 0L) {
                throw new IOException("Failed to mmap counter file");
            }
            return new SharedCounter(v1, null);
        }

        @NotNull
        public final SharedCounter create$datastore_core_release(@NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "produceFile");
            try(ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.open(((File)function00.invoke()), 0x38000000)) {
                return this.a(parcelFileDescriptor0);
            }
        }

        @NotNull
        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return SharedCounter.b;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }
    }

    @NotNull
    public static final Factory Factory;
    public final long a;
    public static final NativeSharedCounter b;

    static {
        SharedCounter.Factory = new Factory(null);
        SharedCounter.b = new NativeSharedCounter();
    }

    public SharedCounter(long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
    }

    public final int getValue() {
        return SharedCounter.b.nativeGetCounterValue(this.a);
    }

    public final int incrementAndGetValue() {
        return SharedCounter.b.nativeIncrementAndGetCounterValue(this.a);
    }
}

