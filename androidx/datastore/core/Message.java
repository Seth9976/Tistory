package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0007\bR\u001C\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000B"}, d2 = {"Landroidx/datastore/core/Message;", "T", "", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "lastState", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Message {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/datastore/core/Message$Read;", "T", "Landroidx/datastore/core/Message;", "Landroidx/datastore/core/State;", "lastState", "<init>", "(Landroidx/datastore/core/State;)V", "a", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Read extends Message {
        public final State a;

        public Read(@Nullable State state0) {
            super(null);
            this.a = state0;
        }

        @Override  // androidx.datastore.core.Message
        @Nullable
        public State getLastState() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B`\u00121\u0010\t\u001A-\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011RB\u0010\t\u001A-\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\"\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\u000F\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/datastore/core/Message$Update;", "T", "Landroidx/datastore/core/Message;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "Lkotlinx/coroutines/CompletableDeferred;", "ack", "Landroidx/datastore/core/State;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "b", "Lkotlinx/coroutines/CompletableDeferred;", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "c", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "d", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Update extends Message {
        public final Function2 a;
        public final CompletableDeferred b;
        public final State c;
        public final CoroutineContext d;

        public Update(@NotNull Function2 function20, @NotNull CompletableDeferred completableDeferred0, @Nullable State state0, @NotNull CoroutineContext coroutineContext0) {
            Intrinsics.checkNotNullParameter(function20, "transform");
            Intrinsics.checkNotNullParameter(completableDeferred0, "ack");
            Intrinsics.checkNotNullParameter(coroutineContext0, "callerContext");
            super(null);
            this.a = function20;
            this.b = completableDeferred0;
            this.c = state0;
            this.d = coroutineContext0;
        }

        @NotNull
        public final CompletableDeferred getAck() {
            return this.b;
        }

        @NotNull
        public final CoroutineContext getCallerContext() {
            return this.d;
        }

        @Override  // androidx.datastore.core.Message
        @Nullable
        public State getLastState() {
            return this.c;
        }

        @NotNull
        public final Function2 getTransform() {
            return this.a;
        }
    }

    public Message(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public abstract State getLastState();
}

