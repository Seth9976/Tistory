package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import u2.b;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 02\u00020\u0001:\u0003012B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u000E\u0010\rJ>\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0017\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000F\u00A2\u0006\u0002\b\u0011H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u00A2\u0006\u0004\b\u000E\u0010\u0013J\r\u0010\u0014\u001A\u00020\b\u00A2\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001A\u001A\u00020\b2\u001B\u0010\u0019\u001A\u0017\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u000F\u00A2\u0006\u0002\b\u0011H\u0086\b\u00A2\u0006\u0004\b\u001A\u0010\u001BJ-\u0010\u001D\u001A\u00020\b2\u001B\u0010\u001C\u001A\u0017\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u000F\u00A2\u0006\u0002\b\u0011H\u0086\b\u00A2\u0006\u0004\b\u001D\u0010\u001BJ)\u0010$\u001A\u00020\b2\n\u0010\u001F\u001A\u0006\u0012\u0002\b\u00030\u001E2\u0006\u0010!\u001A\u00020 2\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010\'\u001A\u00020&H\u0017\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010*\u001A\u00020&2\u0006\u0010)\u001A\u00020&H\u0016\u00A2\u0006\u0004\b*\u0010+R\u0011\u0010/\u001A\u00020,8F\u00A2\u0006\u0006\u001A\u0004\b-\u0010.\u00A8\u00063"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/changelist/Operation;", "operation", "pushOp", "(Landroidx/compose/runtime/changelist/Operation;)V", "push", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "Lkotlin/ExtensionFunctionType;", "args", "(Landroidx/compose/runtime/changelist/Operation;Lkotlin/jvm/functions/Function1;)V", "pop", "other", "popInto", "(Landroidx/compose/runtime/changelist/Operations;)V", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "sink", "drain", "(Lkotlin/jvm/functions/Function1;)V", "action", "forEach", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingOperations", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "toString", "()Ljava/lang/String;", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "", "getSize", "()I", "size", "Companion", "OpIterator", "WriteScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,475:1\n294#1,7:490\n283#1:497\n294#1,7:498\n284#1,2:505\n294#1,7:507\n33#2,7:476\n50#2,7:483\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n283#1:490,7\n307#1:497\n307#1:498,7\n307#1:505,2\n406#1:507,7\n146#1:476,7\n173#1:483,7\n*E\n"})
public final class Operations extends OperationsDebugStringFormattable {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$Companion;", "", "", "InitialCapacity", "I", "MaxResizeAmount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\u0011\u001A\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0015\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "<init>", "(Landroidx/compose/runtime/changelist/Operations;)V", "", "next", "()Z", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "getInt-w8GmfQM", "(I)I", "getInt", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "getObject", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class OpIterator implements OperationArgContainer {
        public int a;
        public int b;
        public int c;
        public final Operations d;

        @Override  // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt-w8GmfQM(int v) {
            int[] arr_v = Operations.this.c;
            return arr_v[this.b + v];
        }

        @Override  // androidx.compose.runtime.changelist.OperationArgContainer
        public Object getObject-31yXWZQ(int v) {
            Object[] arr_object = Operations.this.e;
            return arr_object[this.c + v];
        }

        @NotNull
        public final Operation getOperation() {
            Operation[] arr_operation = Operations.this.a;
            Operation operation0 = arr_operation[this.a];
            Intrinsics.checkNotNull(operation0);
            return operation0;
        }

        public final boolean next() {
            Operations operations0 = Operations.this;
            if(this.a >= operations0.b) {
                return false;
            }
            Operation operation0 = this.getOperation();
            this.b = operation0.getInts() + this.b;
            this.c = operation0.getObjects() + this.c;
            int v = this.a + 1;
            this.a = v;
            return v < operations0.b;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\r\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ,\u0010\u0012\u001A\u00020\n\"\u0004\b\u0000\u0010\u000E2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0006\u0010\t\u001A\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001E\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0011\u0010\"\u001A\u00020\u001F8F¢\u0006\u0006\u001A\u0004\b \u0010!\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operations;", "stack", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "value", "", "setInt-A6tL2VI", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInt", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,475:1\n50#2,7:476\n50#2,7:483\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n335#1:476,7\n344#1:483,7\n*E\n"})
    public static final class WriteScope {
        public final Operations a;

        public WriteScope(Operations operations0) {
            this.a = operations0;
        }

        public static final WriteScope box-impl(Operations operations0) {
            return new WriteScope(operations0);
        }

        @NotNull
        public static Operations constructor-impl(@NotNull Operations operations0) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return WriteScope.equals-impl(this.a, object0);
        }

        // 去混淆评级： 低(20)
        public static boolean equals-impl(Operations operations0, Object object0) {
            return object0 instanceof WriteScope ? Intrinsics.areEqual(operations0, ((WriteScope)object0).unbox-impl()) : false;
        }

        public static final boolean equals-impl0(Operations operations0, Operations operations1) {
            return Intrinsics.areEqual(operations0, operations1);
        }

        @NotNull
        public static final Operation getOperation-impl(Operations operations0) {
            return Operations.access$peekOperation(operations0);
        }

        @Override
        public int hashCode() {
            return WriteScope.hashCode-impl(this.a);
        }

        public static int hashCode-impl(Operations operations0) {
            return operations0.hashCode();
        }

        public static final void setInt-A6tL2VI(Operations operations0, int v, int v1) {
            if((operations0.g & 1 << v) != 0) {
                PreconditionsKt.throwIllegalStateException(("Already pushed argument " + WriteScope.getOperation-impl(operations0).intParamName-w8GmfQM(v)));
            }
            operations0.g |= 1 << v;
            operations0.c[Operations.access$topIntIndexOf-w8GmfQM(operations0, v)] = v1;
        }

        public static final void setObject-DKhxnng(Operations operations0, int v, Object object0) {
            if((operations0.h & 1 << v) != 0) {
                PreconditionsKt.throwIllegalStateException(("Already pushed argument " + WriteScope.getOperation-impl(operations0).objectParamName-31yXWZQ(v)));
            }
            operations0.h |= 1 << v;
            operations0.e[Operations.access$topObjectIndexOf-31yXWZQ(operations0, v)] = object0;
        }

        @Override
        public String toString() {
            return "WriteScope(stack=" + this.a + ')';
        }

        public static String toString-impl(Operations operations0) [...] // Inlined contents

        public final Operations unbox-impl() {
            return this.a;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int InitialCapacity = 16;
    public Operation[] a;
    public int b;
    public int[] c;
    public int d;
    public Object[] e;
    public int f;
    public int g;
    public int h;

    static {
        Operations.Companion = new Companion(null);
        Operations.$stable = 8;
    }

    public Operations() {
        this.a = new Operation[16];
        this.c = new int[16];
        this.e = new Object[16];
    }

    public final String a(Object object0, String s) {
        if(object0 == null) {
            return "null";
        }
        if(object0 instanceof Object[]) {
            return this.b(s, ArraysKt___ArraysKt.asIterable(((Object[])object0)));
        }
        if(object0 instanceof int[]) {
            return this.b(s, ArraysKt___ArraysKt.asIterable(((int[])object0)));
        }
        if(object0 instanceof long[]) {
            return this.b(s, ArraysKt___ArraysKt.asIterable(((long[])object0)));
        }
        if(object0 instanceof float[]) {
            return this.b(s, ArraysKt___ArraysKt.asIterable(((float[])object0)));
        }
        if(object0 instanceof double[]) {
            return this.b(s, ArraysKt___ArraysKt.asIterable(((double[])object0)));
        }
        if(object0 instanceof Iterable) {
            return this.b(s, ((Iterable)object0));
        }
        return object0 instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable)object0).toDebugString(s) : object0.toString();
    }

    public static final int access$createExpectedArgMask(Operations operations0, int v) {
        operations0.getClass();
        return v == 0 ? 0 : -1 >>> 0x20 - v;
    }

    public static final Operation access$peekOperation(Operations operations0) {
        Operation operation0 = operations0.a[operations0.b - 1];
        Intrinsics.checkNotNull(operation0);
        return operation0;
    }

    public static final int access$topIntIndexOf-w8GmfQM(Operations operations0, int v) {
        int v1 = operations0.d;
        Operation operation0 = operations0.a[operations0.b - 1];
        Intrinsics.checkNotNull(operation0);
        return v1 - operation0.getInts() + v;
    }

    public static final int access$topObjectIndexOf-31yXWZQ(Operations operations0, int v) {
        int v1 = operations0.f;
        Operation operation0 = operations0.a[operations0.b - 1];
        Intrinsics.checkNotNull(operation0);
        return v1 - operation0.getObjects() + v;
    }

    public final String b(String s, Iterable iterable0) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable0, ", ", "[", "]", 0, null, new b(14, this, s), 24, null);
    }

    public final void clear() {
        this.b = 0;
        this.d = 0;
        ArraysKt___ArraysJvmKt.fill(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void drain(@NotNull Function1 function10) {
        if(this.isNotEmpty()) {
            OpIterator operations$OpIterator0 = new OpIterator(this);
            while(true) {
                function10.invoke(operations$OpIterator0);
                if(!operations$OpIterator0.next()) {
                    break;
                }
            }
        }
        this.clear();
    }

    public final void executeAndFlushAllPendingOperations(@NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
        if(this.isNotEmpty()) {
            OpIterator operations$OpIterator0 = new OpIterator(this);
            while(true) {
                operations$OpIterator0.getOperation().execute(operations$OpIterator0, applier0, slotWriter0, rememberManager0);
                if(!operations$OpIterator0.next()) {
                    break;
                }
            }
        }
        this.clear();
    }

    public final void forEach(@NotNull Function1 function10) {
        if(this.isNotEmpty()) {
            OpIterator operations$OpIterator0 = new OpIterator(this);
            while(true) {
                function10.invoke(operations$OpIterator0);
                if(!operations$OpIterator0.next()) {
                    break;
                }
            }
        }
    }

    public final int getSize() {
        return this.b;
    }

    public final boolean isEmpty() {
        return this.getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return this.getSize() != 0;
    }

    public final void pop() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        int v = this.b - 1;
        this.b = v;
        Operation operation0 = this.a[v];
        Intrinsics.checkNotNull(operation0);
        this.a[this.b] = null;
        int v1 = operation0.getObjects();
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = this.f - 1;
            this.f = v3;
            this.e[v3] = null;
        }
        int v4 = operation0.getInts();
        for(int v5 = 0; v5 < v4; ++v5) {
            int v6 = this.d - 1;
            this.d = v6;
            this.c[v6] = 0;
        }
    }

    public final void popInto(@NotNull Operations operations0) {
        if(this.isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        int v = this.b - 1;
        this.b = v;
        Operation operation0 = this.a[v];
        Intrinsics.checkNotNull(operation0);
        this.a[this.b] = null;
        operations0.pushOp(operation0);
        int v1 = this.f;
        int v2 = operations0.f;
        int v3 = operation0.getObjects();
        for(int v4 = 0; v4 < v3; ++v4) {
            --v2;
            --v1;
            Object[] arr_object = this.e;
            operations0.e[v2] = arr_object[v1];
            arr_object[v1] = null;
        }
        int v5 = this.d;
        int v6 = operations0.d;
        int v7 = operation0.getInts();
        for(int v8 = 0; v8 < v7; ++v8) {
            --v6;
            --v5;
            int[] arr_v = this.c;
            operations0.c[v6] = arr_v[v5];
            arr_v[v5] = 0;
        }
        this.f -= operation0.getObjects();
        this.d -= operation0.getInts();
    }

    public final void push(@NotNull Operation operation0) {
        if(operation0.getInts() != 0 || operation0.getObjects() != 0) {
            PreconditionsKt.throwIllegalArgumentException(("Cannot push " + operation0 + " without arguments because it expects " + operation0.getInts() + " ints and " + operation0.getObjects() + " objects."));
        }
        this.pushOp(operation0);
    }

    public final void push(@NotNull Operation operation0, @NotNull Function1 function10) {
        this.pushOp(operation0);
        function10.invoke(WriteScope.box-impl(this));
        if(this.g != Operations.access$createExpectedArgMask(this, operation0.getInts()) || this.h != Operations.access$createExpectedArgMask(this, operation0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & this.g) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & this.h) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    @InternalComposeApi
    public final void pushOp(@NotNull Operation operation0) {
        this.g = 0;
        this.h = 0;
        int v = this.b;
        if(v == this.a.length) {
            Object[] arr_object = Arrays.copyOf(this.a, this.b + c.coerceAtMost(v, 0x400));
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            this.a = (Operation[])arr_object;
        }
        int v1 = operation0.getInts() + this.d;
        int[] arr_v = this.c;
        if(v1 > arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, c.coerceAtLeast(c.coerceAtMost(arr_v.length, 0x400) + arr_v.length, v1));
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.c = arr_v1;
        }
        int v2 = operation0.getObjects() + this.f;
        Object[] arr_object1 = this.e;
        if(v2 > arr_object1.length) {
            Object[] arr_object2 = Arrays.copyOf(arr_object1, c.coerceAtLeast(c.coerceAtMost(arr_object1.length, 0x400) + arr_object1.length, v2));
            Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(this, newSize)");
            this.e = arr_object2;
        }
        int v3 = this.b;
        this.b = v3 + 1;
        this.a[v3] = operation0;
        this.d = operation0.getInts() + this.d;
        this.f = operation0.getObjects() + this.f;
    }

    @Override  // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String s) {
        int v1;
        String s1;
        Operation operation1;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.isNotEmpty()) {
            OpIterator operations$OpIterator0 = new OpIterator(this);
            for(int v = 1; true; v = v1) {
                stringBuilder0.append(s);
                stringBuilder0.append(v);
                stringBuilder0.append(". ");
                Operation operation0 = operations$OpIterator0.getOperation();
                if(operation0.getInts() != 0 || operation0.getObjects() != 0) {
                    StringBuilder stringBuilder1 = new StringBuilder();
                    stringBuilder1.append(operation0.getName());
                    stringBuilder1.append('(');
                    int v2 = operation0.getInts();
                    boolean z = true;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        String s2 = operation0.intParamName-w8GmfQM(v3);
                        if(z) {
                            z = false;
                        }
                        else {
                            stringBuilder1.append(", ");
                        }
                        stringBuilder1.append('\n');
                        Intrinsics.checkNotNullExpressionValue(stringBuilder1, "append(\'\\n\')");
                        stringBuilder1.append(s + "    ");
                        stringBuilder1.append(s2);
                        stringBuilder1.append(" = ");
                        stringBuilder1.append(operations$OpIterator0.getInt-w8GmfQM(v3));
                    }
                    v1 = v + 1;
                    int v4 = operation0.getObjects();
                    int v5 = 0;
                    while(v5 < v4) {
                        String s3 = operation0.objectParamName-31yXWZQ(v5);
                        if(z) {
                            operation1 = operation0;
                            z = false;
                        }
                        else {
                            stringBuilder1.append(", ");
                            operation1 = operation0;
                        }
                        stringBuilder1.append('\n');
                        Intrinsics.checkNotNullExpressionValue(stringBuilder1, "append(\'\\n\')");
                        stringBuilder1.append(s + "    ");
                        stringBuilder1.append(s3);
                        stringBuilder1.append(" = ");
                        stringBuilder1.append(this.a(operations$OpIterator0.getObject-31yXWZQ(v5), s + "    "));
                        ++v5;
                        operation0 = operation1;
                    }
                    stringBuilder1.append('\n');
                    Intrinsics.checkNotNullExpressionValue(stringBuilder1, "append(\'\\n\')");
                    stringBuilder1.append(s);
                    stringBuilder1.append(")");
                    s1 = stringBuilder1.toString();
                    Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
                }
                else {
                    s1 = operation0.getName();
                    v1 = v + 1;
                }
                stringBuilder0.append(s1);
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
                stringBuilder0.append('\n');
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
                if(!operations$OpIterator0.next()) {
                    break;
                }
            }
        }
        String s4 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s4, "StringBuilder().apply(builderAction).toString()");
        return s4;
    }

    @Override
    @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    @NotNull
    public String toString() {
        return super.toString();
    }
}

