package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u2.n;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BK\b\u0016\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001A\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R(\u0010\u001F\u001A\u0004\u0018\u00010\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u00198\u0002@BX\u0082\u000E¢\u0006\f\n\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ERB\u0010\'\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u00072\u0012\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u00078\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&RB\u0010+\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u00072\u0012\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u00078\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b(\u0010\"\u001A\u0004\b)\u0010$\"\u0004\b*\u0010&RB\u0010/\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u00072\u0012\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u00078\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b,\u0010\"\u001A\u0004\b-\u0010$\"\u0004\b.\u0010&R\u0014\u00102\u001A\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "factory", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveStateRegistry", "", "compositeKeyHash", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/saveable/SaveableStateRegistry;ILandroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "y", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "value", "A", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "setSavableRegistryEntry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;)V", "savableRegistryEntry", "", "B", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "C", "getResetBlock", "setResetBlock", "resetBlock", "D", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
public final class ViewFactoryHolder extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    public Entry A;
    public Function1 B;
    public Function1 C;
    public Function1 D;
    public final View x;
    public final NestedScrollDispatcher y;
    public final SaveableStateRegistry z;

    public ViewFactoryHolder(@NotNull Context context0, @NotNull Function1 function10, @Nullable CompositionContext compositionContext0, @Nullable SaveableStateRegistry saveableStateRegistry0, int v, @NotNull Owner owner0) {
        View view0 = (View)function10.invoke(context0);
        NestedScrollDispatcher nestedScrollDispatcher0 = new NestedScrollDispatcher();
        super(context0, compositionContext0, v, nestedScrollDispatcher0, view0, owner0);
        this.x = view0;
        this.y = nestedScrollDispatcher0;
        this.z = saveableStateRegistry0;
        this.setClipChildren(false);
        String s = String.valueOf(v);
        SparseArray sparseArray0 = null;
        Object object0 = saveableStateRegistry0 == null ? null : saveableStateRegistry0.consumeRestored(s);
        if(object0 instanceof SparseArray) {
            sparseArray0 = (SparseArray)object0;
        }
        if(sparseArray0 != null) {
            view0.restoreHierarchyState(sparseArray0);
        }
        if(saveableStateRegistry0 != null) {
            this.setSavableRegistryEntry(saveableStateRegistry0.registerProvider(s, new n(this, 0)));
        }
        this.B = AndroidView_androidKt.getNoOpUpdate();
        this.C = AndroidView_androidKt.getNoOpUpdate();
        this.D = AndroidView_androidKt.getNoOpUpdate();
    }

    public ViewFactoryHolder(Context context0, Function1 function10, CompositionContext compositionContext0, SaveableStateRegistry saveableStateRegistry0, int v, Owner owner0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            compositionContext0 = null;
        }
        this(context0, function10, compositionContext0, saveableStateRegistry0, v, owner0);
    }

    public static final void access$unregisterSaveStateProvider(ViewFactoryHolder viewFactoryHolder0) {
        viewFactoryHolder0.setSavableRegistryEntry(null);
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.y;
    }

    @NotNull
    public final Function1 getReleaseBlock() {
        return this.D;
    }

    @NotNull
    public final Function1 getResetBlock() {
        return this.C;
    }

    @NotNull
    public final Function1 getUpdateBlock() {
        return this.B;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull Function1 function10) {
        this.D = function10;
        this.setRelease(new n(this, 1));
    }

    public final void setResetBlock(@NotNull Function1 function10) {
        this.C = function10;
        this.setReset(new n(this, 2));
    }

    private final void setSavableRegistryEntry(Entry saveableStateRegistry$Entry0) {
        Entry saveableStateRegistry$Entry1 = this.A;
        if(saveableStateRegistry$Entry1 != null) {
            saveableStateRegistry$Entry1.unregister();
        }
        this.A = saveableStateRegistry$Entry0;
    }

    public final void setUpdateBlock(@NotNull Function1 function10) {
        this.B = function10;
        this.setUpdate(new n(this, 3));
    }
}

