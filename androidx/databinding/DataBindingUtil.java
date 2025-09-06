package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DataBindingUtil {
    public static final DataBinderMapperImpl a;
    public static DataBindingComponent b;

    static {
        DataBindingUtil.a = new DataBinderMapperImpl();
        DataBindingUtil.b = null;
    }

    public static ViewDataBinding a(DataBindingComponent dataBindingComponent0, ViewGroup viewGroup0, int v, int v1) {
        int v2 = viewGroup0.getChildCount();
        int v3 = v2 - v;
        DataBinderMapperImpl dataBinderMapperImpl0 = DataBindingUtil.a;
        if(v3 == 1) {
            return dataBinderMapperImpl0.getDataBinder(dataBindingComponent0, viewGroup0.getChildAt(v2 - 1), v1);
        }
        View[] arr_view = new View[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_view[v4] = viewGroup0.getChildAt(v4 + v);
        }
        return dataBinderMapperImpl0.getDataBinder(dataBindingComponent0, arr_view, v1);
    }

    @Nullable
    public static ViewDataBinding bind(@NonNull View view0) {
        return DataBindingUtil.bind(view0, DataBindingUtil.b);
    }

    @Nullable
    public static ViewDataBinding bind(@NonNull View view0, DataBindingComponent dataBindingComponent0) {
        ViewDataBinding viewDataBinding0 = DataBindingUtil.getBinding(view0);
        if(viewDataBinding0 != null) {
            return viewDataBinding0;
        }
        Object object0 = view0.getTag();
        if(!(object0 instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        DataBinderMapperImpl dataBinderMapperImpl0 = DataBindingUtil.a;
        int v = dataBinderMapperImpl0.getLayoutId(((String)object0));
        if(v == 0) {
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + object0);
        }
        return dataBinderMapperImpl0.getDataBinder(dataBindingComponent0, view0, v);
    }

    @Nullable
    public static String convertBrIdToString(int v) {
        return DataBindingUtil.a.convertBrIdToString(v);
    }

    @Nullable
    public static ViewDataBinding findBinding(@NonNull View view0) {
        while(view0 != null) {
            ViewDataBinding viewDataBinding0 = ViewDataBinding.getBinding(view0);
            if(viewDataBinding0 != null) {
                return viewDataBinding0;
            }
            Object object0 = view0.getTag();
            if(object0 instanceof String && ((String)object0).startsWith("layout") && ((String)object0).endsWith("_0")) {
                int v = ((String)object0).charAt(6);
                int v1 = ((String)object0).indexOf(0x2F, 7);
                if(v == 0x2F) {
                    if(v1 == -1) {
                        return null;
                    }
                }
                else if(v == 45 && v1 != -1 && ((String)object0).indexOf(0x2F, v1 + 1) == -1) {
                    return null;
                }
            }
            ViewParent viewParent0 = view0.getParent();
            view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        return null;
    }

    @Nullable
    public static ViewDataBinding getBinding(@NonNull View view0) {
        return ViewDataBinding.getBinding(view0);
    }

    @Nullable
    public static DataBindingComponent getDefaultComponent() {
        return DataBindingUtil.b;
    }

    public static ViewDataBinding inflate(@NonNull LayoutInflater layoutInflater0, int v, @Nullable ViewGroup viewGroup0, boolean z) {
        return DataBindingUtil.inflate(layoutInflater0, v, viewGroup0, z, DataBindingUtil.b);
    }

    public static ViewDataBinding inflate(@NonNull LayoutInflater layoutInflater0, int v, @Nullable ViewGroup viewGroup0, boolean z, @Nullable DataBindingComponent dataBindingComponent0) {
        int v1 = 0;
        boolean z1 = viewGroup0 != null && z;
        if(z1) {
            v1 = viewGroup0.getChildCount();
        }
        View view0 = layoutInflater0.inflate(v, viewGroup0, z);
        return z1 ? DataBindingUtil.a(dataBindingComponent0, viewGroup0, v1, v) : DataBindingUtil.a.getDataBinder(dataBindingComponent0, view0, v);
    }

    public static ViewDataBinding setContentView(@NonNull Activity activity0, int v) {
        return DataBindingUtil.setContentView(activity0, v, DataBindingUtil.b);
    }

    public static ViewDataBinding setContentView(@NonNull Activity activity0, int v, @Nullable DataBindingComponent dataBindingComponent0) {
        activity0.setContentView(v);
        return DataBindingUtil.a(dataBindingComponent0, ((ViewGroup)activity0.getWindow().getDecorView().findViewById(0x1020002)), 0, v);
    }

    public static void setDefaultComponent(@Nullable DataBindingComponent dataBindingComponent0) {
        DataBindingUtil.b = dataBindingComponent0;
    }
}

