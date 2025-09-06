package androidx.databinding;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({Scope.LIBRARY})
public class MergedDataBinderMapper extends DataBinderMapper {
    public final HashSet b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;

    public MergedDataBinderMapper() {
        this.b = new HashSet();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
    }

    public final boolean a() {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.d;
        boolean z = false;
        for(Object object0: copyOnWriteArrayList0) {
            String s = (String)object0;
            try {
                Class class0 = Class.forName(s);
                if(!DataBinderMapper.class.isAssignableFrom(class0)) {
                    continue;
                }
                this.addMapper(((DataBinderMapper)class0.newInstance()));
                copyOnWriteArrayList0.remove(s);
                z = true;
                continue;
            }
            catch(ClassNotFoundException unused_ex) {
                continue;
            }
            catch(IllegalAccessException illegalAccessException0) {
            }
            catch(InstantiationException instantiationException0) {
                goto label_16;
            }
            Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + s, illegalAccessException0);
            continue;
        label_16:
            Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + s, instantiationException0);
        }
        return z;
    }

    public void addMapper(DataBinderMapper dataBinderMapper0) {
        Class class0 = dataBinderMapper0.getClass();
        if(this.b.add(class0)) {
            this.c.add(dataBinderMapper0);
            for(Object object0: dataBinderMapper0.collectDependencies()) {
                this.addMapper(((DataBinderMapper)object0));
            }
        }
    }

    public void addMapper(String s) {
        this.d.add(s + ".DataBinderMapperImpl");
    }

    @Override  // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int v) {
        for(Object object0: this.c) {
            String s = ((DataBinderMapper)object0).convertBrIdToString(v);
            if(s != null) {
                return s;
            }
            if(false) {
                break;
            }
        }
        return this.a() ? this.convertBrIdToString(v) : null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View view0, int v) {
        for(Object object0: this.c) {
            ViewDataBinding viewDataBinding0 = ((DataBinderMapper)object0).getDataBinder(dataBindingComponent0, view0, v);
            if(viewDataBinding0 != null) {
                return viewDataBinding0;
            }
            if(false) {
                break;
            }
        }
        return this.a() ? this.getDataBinder(dataBindingComponent0, view0, v) : null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View[] arr_view, int v) {
        for(Object object0: this.c) {
            ViewDataBinding viewDataBinding0 = ((DataBinderMapper)object0).getDataBinder(dataBindingComponent0, arr_view, v);
            if(viewDataBinding0 != null) {
                return viewDataBinding0;
            }
            if(false) {
                break;
            }
        }
        return this.a() ? this.getDataBinder(dataBindingComponent0, arr_view, v) : null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public int getLayoutId(String s) {
        for(Object object0: this.c) {
            int v = ((DataBinderMapper)object0).getLayoutId(s);
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return this.a() ? this.getLayoutId(s) : 0;
    }
}

