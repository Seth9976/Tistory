package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B^\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\'\u0010\r\u001A#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0011\u001A\u00020\u000B*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u001CH\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u0010 \u001A\u0004\b$\u0010\"R#\u0010\u0007\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R8\u0010\r\u001A#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "create", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "node", "update", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "c", "getKey2", "d", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "e", "Lkotlin/jvm/functions/Function2;", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SuspendPointerInputElement extends ModifierNodeElement {
    public static final int $stable;
    public final Object b;
    public final Object c;
    public final Object[] d;
    public final Function2 e;

    public SuspendPointerInputElement(@Nullable Object object0, @Nullable Object object1, @Nullable Object[] arr_object, @NotNull Function2 function20) {
        this.b = object0;
        this.c = object1;
        this.d = arr_object;
        this.e = function20;
    }

    public SuspendPointerInputElement(Object object0, Object object1, Object[] arr_object, Function2 function20, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        if((v & 4) != 0) {
            arr_object = null;
        }
        this(object0, object1, arr_object, function20);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.b, this.c, this.d, this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SuspendPointerInputElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((SuspendPointerInputElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((SuspendPointerInputElement)object0).c)) {
            return false;
        }
        Object[] arr_object = this.d;
        if(arr_object != null) {
            Object[] arr_object1 = ((SuspendPointerInputElement)object0).d;
            if(arr_object1 == null) {
                return false;
            }
            return Arrays.equals(arr_object, arr_object1) ? this.e == ((SuspendPointerInputElement)object0).e : false;
        }
        return ((SuspendPointerInputElement)object0).d == null ? this.e == ((SuspendPointerInputElement)object0).e : false;
    }

    @Nullable
    public final Object getKey1() {
        return this.b;
    }

    @Nullable
    public final Object getKey2() {
        return this.c;
    }

    @Nullable
    public final Object[] getKeys() {
        return this.d;
    }

    @NotNull
    public final Function2 getPointerInputHandler() {
        return this.e;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.c == null ? 0 : this.c.hashCode();
        Object[] arr_object = this.d;
        if(arr_object != null) {
            v = Arrays.hashCode(arr_object);
        }
        return this.e.hashCode() + ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("pointerInput");
        inspectorInfo0.getProperties().set("key1", this.b);
        inspectorInfo0.getProperties().set("key2", this.c);
        inspectorInfo0.getProperties().set("keys", this.d);
        inspectorInfo0.getProperties().set("pointerInputHandler", this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((SuspendingPointerInputModifierNodeImpl)modifier$Node0));
    }

    public void update(@NotNull SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl0) {
        suspendingPointerInputModifierNodeImpl0.update$ui_release(this.b, this.c, this.d, this.e);
    }
}

