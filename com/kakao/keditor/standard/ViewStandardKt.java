package com.kakao.keditor.standard;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.id;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\f\u0010\u0003\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0010\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0002\u001A<\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u00022\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u001A\u0010\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\f0\u0005*\u00020\u0002\u001A<\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005*\u00020\u00022\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u001A/\u0010\r\u001A\u0004\u0018\u00010\u0002*\u00020\u00022!\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\n\u001A\f\u0010\u0013\u001A\u00020\u0012*\u00020\u0002H\u0000\u001A\u0012\u0010\u0014\u001A\u00020\u0012*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0016\u001A\f\u0010\u0017\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\f\u0010\u0018\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0014\u0010\u0019\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u001BH\u0000\u001A\n\u0010\u001C\u001A\u00020\u0001*\u00020\u0002¨\u0006\u001D"}, d2 = {"disableFocusableWithChild", "", "Landroid/view/View;", "disableWithChild", "findAllEditText", "", "Landroid/widget/EditText;", "list", "", "onFound", "Lkotlin/Function1;", "findAllKeditorEditText", "Lcom/kakao/keditor/widget/KeditorEditText;", "findParent", "condition", "Lkotlin/ParameterName;", "name", "view", "", "hasIsEnableState", "isDescendentOf", "viewGroup", "Landroid/view/ViewGroup;", "restoreIsEnableState", "saveIsEnableState", "setScale", "scale", "", "setShadowBlur", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ViewStandardKt {
    public static final void disableFocusableWithChild(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setFocusable(false);
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(view1 instanceof ViewGroup) {
                    ViewStandardKt.disableFocusableWithChild(view1);
                }
                else {
                    view1.setFocusable(false);
                }
            }
        }
    }

    public static final void disableWithChild(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setEnabled(false);
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(view1 instanceof ViewGroup) {
                    ViewStandardKt.disableWithChild(view1);
                }
                else {
                    view1.setEnabled(false);
                }
            }
        }
    }

    @NotNull
    public static final List findAllEditText(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        if(!(view0 instanceof ViewGroup)) {
            return view0 instanceof EditText ? k.listOf(view0) : CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ViewStandardKt.findAllEditText$default(view0, new ArrayList(), null, 2, null);
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Nullable
    public static final List findAllEditText(@NotNull View view0, @Nullable List list0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1 != null) {
                        ViewStandardKt.findAllEditText(view1, list0, function10);
                    }
                    if(v1 == v) {
                        break;
                    }
                }
            }
        }
        else if(view0 instanceof EditText) {
            if(list0 != null) {
                list0.add(view0);
            }
            if(function10 != null) {
                function10.invoke(view0);
            }
        }
        return list0;
    }

    public static List findAllEditText$default(View view0, List list0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        return ViewStandardKt.findAllEditText(view0, list0, function10);
    }

    @NotNull
    public static final List findAllKeditorEditText(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        if(!(view0 instanceof ViewGroup)) {
            return view0 instanceof KeditorEditText ? k.listOf(view0) : CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = ViewStandardKt.findAllKeditorEditText$default(view0, new ArrayList(), null, 2, null);
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Nullable
    public static final List findAllKeditorEditText(@NotNull View view0, @Nullable List list0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1 != null) {
                        ViewStandardKt.findAllKeditorEditText(view1, list0, function10);
                    }
                    if(v1 == v) {
                        break;
                    }
                }
            }
        }
        else if(view0 instanceof KeditorEditText) {
            if(list0 != null) {
                list0.add(view0);
            }
            if(function10 != null) {
                function10.invoke(view0);
            }
        }
        return list0;
    }

    public static List findAllKeditorEditText$default(View view0, List list0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        return ViewStandardKt.findAllKeditorEditText(view0, list0, function10);
    }

    @Nullable
    public static final View findParent(@NotNull View view0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "condition");
        if(view0.getParent() instanceof View) {
            ViewParent viewParent0 = view0.getParent();
            Intrinsics.checkNotNull(viewParent0, "null cannot be cast to non-null type android.view.View");
            if(((Boolean)function10.invoke(((View)viewParent0))).booleanValue()) {
                ViewParent viewParent1 = view0.getParent();
                Intrinsics.checkNotNull(viewParent1, "null cannot be cast to non-null type android.view.View");
                return (View)viewParent1;
            }
            ViewParent viewParent2 = view0.getParent();
            Intrinsics.checkNotNull(viewParent2, "null cannot be cast to non-null type android.view.View");
            return ViewStandardKt.findParent(((View)viewParent2), function10);
        }
        return null;
    }

    public static final boolean hasIsEnableState(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        return view0.getTag(id.is_enabled) != null;
    }

    public static final boolean isDescendentOf(@NotNull View view0, @NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(viewGroup0, "viewGroup");
        return ViewStandardKt.findParent(view0, new Function1(viewGroup0) {
            final ViewGroup $viewGroup;

            {
                this.$viewGroup = viewGroup0;
                super(1);
            }

            @NotNull
            public final Boolean invoke(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "it");
                return Boolean.valueOf(Intrinsics.areEqual(view0, this.$viewGroup));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((View)object0));
            }
        }) != null;
    }

    public static final void restoreIsEnableState(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Object object0 = view0.getTag(id.is_enabled);
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        view0.setEnabled((boolean0 == null ? true : boolean0.booleanValue()));
    }

    public static final void saveIsEnableState(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setTag(id.is_enabled, Boolean.valueOf(view0.isEnabled()));
    }

    public static final void setScale(@NotNull View view0, float f) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setScaleX(f);
        view0.setScaleY(f);
    }

    public static final void setShadowBlur(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        if(Build.VERSION.SDK_INT >= 28) {
            view0.setElevation(UnitConversionKt.dp2px(6.0f));
            a.f(ContextCompat.getColor(view0.getContext(), color.ke_zeplin_color_01_05per_light_only), view0);
        }
    }
}

