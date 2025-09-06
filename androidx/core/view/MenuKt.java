package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\u001A\u0015\u0010\n\u001A\u00020\u000B*\u00020\u00032\u0006\u0010\f\u001A\u00020\u0002H\u0086\u0002\u001A0\u0010\r\u001A\u00020\u000E*\u00020\u00032!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000E0\u0010H\u0086\b\u001AE\u0010\u0013\u001A\u00020\u000E*\u00020\u000326\u0010\u000F\u001A2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000E0\u0014H\u0086\b\u001A\u0015\u0010\u0016\u001A\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0007H\u0086\n\u001A\r\u0010\u0017\u001A\u00020\u000B*\u00020\u0003H\u0086\b\u001A\r\u0010\u0018\u001A\u00020\u000B*\u00020\u0003H\u0086\b\u001A\u0013\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u001A*\u00020\u0003H\u0086\u0002\u001A\u0015\u0010\u001B\u001A\u00020\u000E*\u00020\u00032\u0006\u0010\f\u001A\u00020\u0002H\u0086\n\u001A\u0015\u0010\u001C\u001A\u00020\u000E*\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0007H\u0086\b\"\u001B\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001A\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u001D"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class MenuKt {
    public static final boolean contains(@NotNull Menu menu0, @NotNull MenuItem menuItem0) {
        int v = menu0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(Intrinsics.areEqual(menu0.getItem(v1), menuItem0)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@NotNull Menu menu0, @NotNull Function1 function10) {
        int v = menu0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(menu0.getItem(v1));
        }
    }

    public static final void forEachIndexed(@NotNull Menu menu0, @NotNull Function2 function20) {
        int v = menu0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(v1, menu0.getItem(v1));
        }
    }

    @NotNull
    public static final MenuItem get(@NotNull Menu menu0, int v) {
        return menu0.getItem(v);
    }

    @NotNull
    public static final Sequence getChildren(@NotNull Menu menu0) {
        return () -> {
            return new Object() {
                public int a;
                public final Menu b;

                {
                    Menu menu0 = menu0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.b = menu0;
                }

                @Override
                public boolean hasNext() {
                    return this.a < this.b.size();
                }

                @NotNull
                public MenuItem next() {
                    int v = this.a;
                    this.a = v + 1;
                    MenuItem menuItem0 = this.b.getItem(v);
                    if(menuItem0 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    return menuItem0;
                }

                @Override
                public Object next() {
                    return this.next();
                }

                @Override
                public void remove() {
                    Unit unit0;
                    int v = this.a - 1;
                    this.a = v;
                    Menu menu0 = this.b;
                    MenuItem menuItem0 = menu0.getItem(v);
                    if(menuItem0 == null) {
                        unit0 = null;
                    }
                    else {
                        menu0.removeItem(menuItem0.getItemId());
                        unit0 = Unit.INSTANCE;
                    }
                    if(unit0 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                }
            };
        };

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000F\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/MenuKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "iterator", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.core.view.MenuKt.children.1 implements Sequence {
            public final Menu a;

            public androidx.core.view.MenuKt.children.1(Menu menu0) {
                this.a = menu0;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return MenuKt.iterator(this.a);
            }
        }

    }

    public static final int getSize(@NotNull Menu menu0) {
        return menu0.size();
    }

    public static final boolean isEmpty(@NotNull Menu menu0) {
        return menu0.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull Menu menu0) {
        return menu0.size() != 0;
    }

    // 检测为 Lambda 实现
    @NotNull
    public static final Iterator iterator(@NotNull Menu menu0) [...]

    public static final void minusAssign(@NotNull Menu menu0, @NotNull MenuItem menuItem0) {
        menu0.removeItem(menuItem0.getItemId());
    }

    public static final void removeItemAt(@NotNull Menu menu0, int v) {
        Unit unit0;
        MenuItem menuItem0 = menu0.getItem(v);
        if(menuItem0 == null) {
            unit0 = null;
        }
        else {
            menu0.removeItem(menuItem0.getItemId());
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}

