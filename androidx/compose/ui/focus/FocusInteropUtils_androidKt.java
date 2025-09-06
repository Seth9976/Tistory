package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import o1.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0012\u0010\u0000\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u001A\u0012\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u0003H\u0000\u001A\f\u0010\u0007\u001A\u00020\b*\u00020\tH\u0000\u001A%\u0010\n\u001A\u00020\u000B*\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u00032\b\u0010\r\u001A\u0004\u0018\u00010\u000EH\u0000¢\u0006\u0002\u0010\u000F\u001A\u0018\u0010\u0010\u001A\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"toFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "androidDirection", "", "toLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "androidLayoutDirection", "calculateBoundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/View;", "requestInteropFocus", "", "direction", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "toAndroidFocusDirection", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusInteropUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInteropUtils.android.kt\nandroidx/compose/ui/focus/FocusInteropUtils_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class FocusInteropUtils_androidKt {
    @NotNull
    public static final Rect calculateBoundingRect(@NotNull View view0) {
        int[] arr_v = c.a.getTempCoordinates();
        view0.getLocationInWindow(arr_v);
        int v = arr_v[0];
        return new Rect(((float)v), ((float)arr_v[1]), ((float)v) + ((float)view0.getWidth()), ((float)arr_v[1]) + ((float)view0.getHeight()));
    }

    public static final boolean requestInteropFocus(@NotNull View view0, @Nullable Integer integer0, @Nullable android.graphics.Rect rect0) {
        if(integer0 == null) {
            return view0.requestFocus();
        }
        if(!(view0 instanceof ViewGroup)) {
            return view0.requestFocus(((int)integer0), rect0);
        }
        if(((ViewGroup)view0).isFocused()) {
            return true;
        }
        if(((ViewGroup)view0).isFocusable() && !view0.hasFocus()) {
            return view0.requestFocus(((int)integer0), rect0);
        }
        if(view0 instanceof AndroidComposeView) {
            return view0.requestFocus(((int)integer0), rect0);
        }
        if(rect0 != null) {
            View view1 = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup)view0), rect0, ((int)integer0));
            return view1 == null ? view0.requestFocus(((int)integer0), rect0) : view1.requestFocus(((int)integer0), rect0);
        }
        View view2 = view0.hasFocus() ? view0.findFocus() : null;
        View view3 = FocusFinder.getInstance().findNextFocus(((ViewGroup)view0), view2, ((int)integer0));
        return view3 == null ? view0.requestFocus(((int)integer0)) : view3.requestFocus(((int)integer0));
    }

    @Nullable
    public static final Integer toAndroidFocusDirection-3ESFkO8(int v) {
        if(FocusDirection.equals-impl0(v, 5)) {
            return 33;
        }
        if(FocusDirection.equals-impl0(v, 6)) {
            return 130;
        }
        if(FocusDirection.equals-impl0(v, 3)) {
            return 17;
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return 66;
        }
        if(FocusDirection.equals-impl0(v, 1)) {
            return 2;
        }
        return FocusDirection.equals-impl0(v, 2) ? 1 : null;
    }

    @Nullable
    public static final FocusDirection toFocusDirection(int v) {
        switch(v) {
            case 1: {
                return FocusDirection.box-impl(2);
            }
            case 2: {
                return FocusDirection.box-impl(1);
            }
            case 17: {
                return FocusDirection.box-impl(3);
            }
            case 33: {
                return FocusDirection.box-impl(5);
            }
            case 66: {
                return FocusDirection.box-impl(4);
            }
            case 130: {
                return FocusDirection.box-impl(6);
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    public static final LayoutDirection toLayoutDirection(int v) {
        switch(v) {
            case 0: {
                return LayoutDirection.Ltr;
            }
            case 1: {
                return LayoutDirection.Rtl;
            }
            default: {
                return null;
            }
        }
    }
}

