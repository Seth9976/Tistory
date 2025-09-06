package androidx.core.view;

import a5.b;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.Px;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u0015\u0010\u0010\u001A\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u0002H\u0086\n\u001A0\u0010\u0013\u001A\u00020\u0014*\u00020\u00032!\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\b\u001AE\u0010\u0019\u001A\u00020\u0014*\u00020\u000326\u0010\u0015\u001A2\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001B\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001AH\u0086\b\u001A\u0015\u0010\u001C\u001A\u00020\u0002*\u00020\u00032\u0006\u0010\u001B\u001A\u00020\rH\u0086\u0002\u001A\r\u0010\u001D\u001A\u00020\u0011*\u00020\u0003H\u0086\b\u001A\r\u0010\u001E\u001A\u00020\u0011*\u00020\u0003H\u0086\b\u001A\u0013\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001A\u0015\u0010!\u001A\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u0002H\u0086\n\u001A\u0015\u0010\"\u001A\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u0002H\u0086\n\u001A\u0017\u0010#\u001A\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001A\u00020\rH\u0086\b\u001A5\u0010%\u001A\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001A\u00020\r2\b\b\u0003\u0010\'\u001A\u00020\r2\b\b\u0003\u0010(\u001A\u00020\r2\b\b\u0003\u0010)\u001A\u00020\rH\u0086\b\u001A5\u0010*\u001A\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001A\u00020\r2\b\b\u0003\u0010\'\u001A\u00020\r2\b\b\u0003\u0010,\u001A\u00020\r2\b\b\u0003\u0010)\u001A\u00020\rH\u0086\b\"\u001B\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\"\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001A\u00020\t*\u00020\u00038\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u000B\"\u0016\u0010\f\u001A\u00020\r*\u00020\u00038\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F\u00A8\u0006-"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", "top", "right", "bottom", "updateMarginsRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ViewGroupKt {
    public static final boolean contains(@NotNull ViewGroup viewGroup0, @NotNull View view0) {
        return viewGroup0.indexOfChild(view0) != -1;
    }

    public static final void forEach(@NotNull ViewGroup viewGroup0, @NotNull Function1 function10) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(viewGroup0.getChildAt(v1));
        }
    }

    public static final void forEachIndexed(@NotNull ViewGroup viewGroup0, @NotNull Function2 function20) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(v1, viewGroup0.getChildAt(v1));
        }
    }

    @NotNull
    public static final View get(@NotNull ViewGroup viewGroup0, int v) {
        View view0 = viewGroup0.getChildAt(v);
        if(view0 != null) {
            return view0;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(viewGroup0.getChildCount());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @NotNull
    public static final Sequence getChildren(@NotNull ViewGroup viewGroup0) {
        return () -> {
            return new Object() {
                public int a;
                public final ViewGroup b;

                {
                    ViewGroup viewGroup0 = viewGroup0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.b = viewGroup0;
                }

                @Override
                public boolean hasNext() {
                    return this.a < this.b.getChildCount();
                }

                @NotNull
                public View next() {
                    int v = this.a;
                    this.a = v + 1;
                    View view0 = this.b.getChildAt(v);
                    if(view0 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    return view0;
                }

                @Override
                public Object next() {
                    return this.next();
                }

                @Override
                public void remove() {
                    int v = this.a - 1;
                    this.a = v;
                    this.b.removeViewAt(v);
                }
            };
        };

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000F\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/ViewGroupKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "iterator", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.core.view.ViewGroupKt.children.1 implements Sequence {
            public final ViewGroup a;

            public androidx.core.view.ViewGroupKt.children.1(ViewGroup viewGroup0) {
                this.a = viewGroup0;
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return ViewGroupKt.iterator(this.a);
            }
        }

    }

    @NotNull
    public static final Sequence getDescendants(@NotNull ViewGroup viewGroup0) {
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup0).iterator(), v0.w);
            }
        };
    }

    @NotNull
    public static final IntRange getIndices(@NotNull ViewGroup viewGroup0) {
        return c.until(0, viewGroup0.getChildCount());
    }

    public static final int getSize(@NotNull ViewGroup viewGroup0) {
        return viewGroup0.getChildCount();
    }

    public static final boolean isEmpty(@NotNull ViewGroup viewGroup0) {
        return viewGroup0.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(@NotNull ViewGroup viewGroup0) {
        return viewGroup0.getChildCount() != 0;
    }

    // 检测为 Lambda 实现
    @NotNull
    public static final Iterator iterator(@NotNull ViewGroup viewGroup0) [...]

    public static final void minusAssign(@NotNull ViewGroup viewGroup0, @NotNull View view0) {
        viewGroup0.removeView(view0);
    }

    public static final void plusAssign(@NotNull ViewGroup viewGroup0, @NotNull View view0) {
        viewGroup0.addView(view0);
    }

    public static final void setMargins(@NotNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, @Px int v) {
        viewGroup$MarginLayoutParams0.setMargins(v, v, v, v);
    }

    public static final void updateMargins(@NotNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        viewGroup$MarginLayoutParams0.setMargins(v, v1, v2, v3);
    }

    public static void updateMargins$default(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = viewGroup$MarginLayoutParams0.leftMargin;
        }
        if((v4 & 2) != 0) {
            v1 = viewGroup$MarginLayoutParams0.topMargin;
        }
        if((v4 & 4) != 0) {
            v2 = viewGroup$MarginLayoutParams0.rightMargin;
        }
        if((v4 & 8) != 0) {
            v3 = viewGroup$MarginLayoutParams0.bottomMargin;
        }
        viewGroup$MarginLayoutParams0.setMargins(v, v1, v2, v3);
    }

    public static final void updateMarginsRelative(@NotNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        viewGroup$MarginLayoutParams0.setMarginStart(v);
        viewGroup$MarginLayoutParams0.topMargin = v1;
        viewGroup$MarginLayoutParams0.setMarginEnd(v2);
        viewGroup$MarginLayoutParams0.bottomMargin = v3;
    }

    public static void updateMarginsRelative$default(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = viewGroup$MarginLayoutParams0.getMarginStart();
        }
        if((v4 & 2) != 0) {
            v1 = viewGroup$MarginLayoutParams0.topMargin;
        }
        if((v4 & 4) != 0) {
            v2 = viewGroup$MarginLayoutParams0.getMarginEnd();
        }
        if((v4 & 8) != 0) {
            v3 = viewGroup$MarginLayoutParams0.bottomMargin;
        }
        viewGroup$MarginLayoutParams0.setMarginStart(v);
        viewGroup$MarginLayoutParams0.topMargin = v1;
        viewGroup$MarginLayoutParams0.setMarginEnd(v2);
        viewGroup$MarginLayoutParams0.bottomMargin = v3;
    }
}

