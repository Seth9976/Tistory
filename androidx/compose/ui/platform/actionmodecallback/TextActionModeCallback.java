package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001B\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ!\u0010\u0012\u001A\u00020\u00112\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001A\u00020\u00112\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0017\u001A\u00020\u00112\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000FH\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010!\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0016\u001A\u00020\u001EH\u0000\u00A2\u0006\u0004\b\u001F\u0010 R\u001F\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b,\u0010#\u001A\u0004\b-\u0010%\"\u0004\b.\u0010/R*\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u0010#\u001A\u0004\b1\u0010%\"\u0004\b2\u0010/R*\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u0010#\u001A\u0004\b4\u0010%\"\u0004\b5\u0010/R*\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u0010#\u001A\u0004\b7\u0010%\"\u0004\b8\u0010/\u00A8\u00069"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Landroidx/compose/ui/geometry/Rect;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "onDestroyActionMode", "()V", "updateMenuItems$ui_release", "(Landroid/view/Menu;)V", "updateMenuItems", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "addMenuItem$ui_release", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "addMenuItem", "a", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "b", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "c", "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "d", "getOnPasteRequested", "setOnPasteRequested", "e", "getOnCutRequested", "setOnCutRequested", "f", "getOnSelectAllRequested", "setOnSelectAllRequested", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class TextActionModeCallback {
    public static final int $stable = 8;
    public final Function0 a;
    public Rect b;
    public Function0 c;
    public Function0 d;
    public Function0 e;
    public Function0 f;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 0x3F, null);
    }

    public TextActionModeCallback(@Nullable Function0 function00, @NotNull Rect rect0, @Nullable Function0 function01, @Nullable Function0 function02, @Nullable Function0 function03, @Nullable Function0 function04) {
        this.a = function00;
        this.b = rect0;
        this.c = function01;
        this.d = function02;
        this.e = function03;
        this.f = function04;
    }

    public TextActionModeCallback(Function0 function00, Rect rect0, Function0 function01, Function0 function02, Function0 function03, Function0 function04, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            rect0 = Rect.Companion.getZero();
        }
        this(((v & 1) == 0 ? function00 : null), rect0, ((v & 4) == 0 ? function01 : null), ((v & 8) == 0 ? function02 : null), ((v & 16) == 0 ? function03 : null), ((v & 0x20) == 0 ? function04 : null));
    }

    public final void a(Menu menu0, MenuItemOption menuItemOption0, Function0 function00) {
        if(function00 != null && menu0.findItem(menuItemOption0.getId()) == null) {
            this.addMenuItem$ui_release(menu0, menuItemOption0);
            return;
        }
        if(function00 == null && menu0.findItem(menuItemOption0.getId()) != null) {
            menu0.removeItem(menuItemOption0.getId());
        }
    }

    public final void addMenuItem$ui_release(@NotNull Menu menu0, @NotNull MenuItemOption menuItemOption0) {
        menu0.add(0, menuItemOption0.getId(), menuItemOption0.getOrder(), menuItemOption0.getTitleResource()).setShowAsAction(1);
    }

    @Nullable
    public final Function0 getOnActionModeDestroy() {
        return this.a;
    }

    @Nullable
    public final Function0 getOnCopyRequested() {
        return this.c;
    }

    @Nullable
    public final Function0 getOnCutRequested() {
        return this.e;
    }

    @Nullable
    public final Function0 getOnPasteRequested() {
        return this.d;
    }

    @Nullable
    public final Function0 getOnSelectAllRequested() {
        return this.f;
    }

    @NotNull
    public final Rect getRect() {
        return this.b;
    }

    public final boolean onActionItemClicked(@Nullable ActionMode actionMode0, @Nullable MenuItem menuItem0) {
        Intrinsics.checkNotNull(menuItem0);
        int v = menuItem0.getItemId();
        if(v == MenuItemOption.Copy.getId()) {
            Function0 function00 = this.c;
            if(function00 == null) {
                goto label_21;
            }
            function00.invoke();
        }
        else {
            if(v == MenuItemOption.Paste.getId()) {
                Function0 function01 = this.d;
                if(function01 == null) {
                    goto label_21;
                }
                function01.invoke();
                goto label_21;
            }
            if(v == MenuItemOption.Cut.getId()) {
                Function0 function02 = this.e;
                if(function02 == null) {
                    goto label_21;
                }
                function02.invoke();
            }
            else if(v == MenuItemOption.SelectAll.getId()) {
                Function0 function03 = this.f;
                if(function03 != null) {
                    function03.invoke();
                }
            }
            else {
                return false;
            }
        }
    label_21:
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        return true;
    }

    public final boolean onCreateActionMode(@Nullable ActionMode actionMode0, @Nullable Menu menu0) {
        if(menu0 == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if(actionMode0 == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if(this.c != null) {
            this.addMenuItem$ui_release(menu0, MenuItemOption.Copy);
        }
        if(this.d != null) {
            this.addMenuItem$ui_release(menu0, MenuItemOption.Paste);
        }
        if(this.e != null) {
            this.addMenuItem$ui_release(menu0, MenuItemOption.Cut);
        }
        if(this.f != null) {
            this.addMenuItem$ui_release(menu0, MenuItemOption.SelectAll);
        }
        return true;
    }

    public final void onDestroyActionMode() {
        Function0 function00 = this.a;
        if(function00 != null) {
            function00.invoke();
        }
    }

    public final boolean onPrepareActionMode(@Nullable ActionMode actionMode0, @Nullable Menu menu0) {
        if(actionMode0 != null && menu0 != null) {
            this.updateMenuItems$ui_release(menu0);
            return true;
        }
        return false;
    }

    public final void setOnCopyRequested(@Nullable Function0 function00) {
        this.c = function00;
    }

    public final void setOnCutRequested(@Nullable Function0 function00) {
        this.e = function00;
    }

    public final void setOnPasteRequested(@Nullable Function0 function00) {
        this.d = function00;
    }

    public final void setOnSelectAllRequested(@Nullable Function0 function00) {
        this.f = function00;
    }

    public final void setRect(@NotNull Rect rect0) {
        this.b = rect0;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@NotNull Menu menu0) {
        this.a(menu0, MenuItemOption.Copy, this.c);
        this.a(menu0, MenuItemOption.Paste, this.d);
        this.a(menu0, MenuItemOption.Cut, this.e);
        this.a(menu0, MenuItemOption.SelectAll, this.f);
    }
}

