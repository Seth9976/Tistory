package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001D\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001A\u00020\t2\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000BR\u0018\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "Landroidx/datastore/core/DataStoreImpl;", "instance", "<init>", "(Landroidx/datastore/core/UpdatingDataContextElement;Landroidx/datastore/core/DataStoreImpl;)V", "Landroidx/datastore/core/DataStore;", "candidate", "", "checkNotUpdating", "(Landroidx/datastore/core/DataStore;)V", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UpdatingDataContextElement implements Element {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion;", "", "", "NESTED_UPDATE_ERROR_MESSAGE", "Ljava/lang/String;", "getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release", "()Ljava/lang/String;", "Key", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/datastore/core/UpdatingDataContextElement;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Key implements kotlin.coroutines.CoroutineContext.Key {
            @NotNull
            public static final Key INSTANCE;

            static {
                Key.INSTANCE = new Key();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
        }
    }

    @NotNull
    public static final Companion Companion;
    public final UpdatingDataContextElement a;
    public final DataStoreImpl b;
    public static final String c;

    static {
        UpdatingDataContextElement.Companion = new Companion(null);
        UpdatingDataContextElement.c = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    }

    public UpdatingDataContextElement(@Nullable UpdatingDataContextElement updatingDataContextElement0, @NotNull DataStoreImpl dataStoreImpl0) {
        Intrinsics.checkNotNullParameter(dataStoreImpl0, "instance");
        super();
        this.a = updatingDataContextElement0;
        this.b = dataStoreImpl0;
    }

    // 去混淆评级： 低(20)
    public static final String access$getNESTED_UPDATE_ERROR_MESSAGE$cp() [...] // 潜在的解密器

    public final void checkNotUpdating(@NotNull DataStore dataStore0) {
        Intrinsics.checkNotNullParameter(dataStore0, "candidate");
        if(this.b == dataStore0) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        UpdatingDataContextElement updatingDataContextElement0 = this.a;
        if(updatingDataContextElement0 != null) {
            updatingDataContextElement0.checkNotUpdating(dataStore0);
        }
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, @NotNull Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @Nullable
    public Element get(@NotNull kotlin.coroutines.CoroutineContext.Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public kotlin.coroutines.CoroutineContext.Key getKey() {
        return Key.INSTANCE;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public CoroutineContext minusKey(@NotNull kotlin.coroutines.CoroutineContext.Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }
}

