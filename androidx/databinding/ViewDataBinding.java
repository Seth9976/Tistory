package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.library.R.id;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.viewbinding.ViewBinding;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Map;

public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    public static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int v) {
            this.layouts = new String[v][];
            this.indexes = new int[v][];
            this.layoutIds = new int[v][];
        }

        public void setIncludes(int v, String[] arr_s, int[] arr_v, int[] arr_v1) {
            this.layouts[v] = arr_s;
            this.indexes[v] = arr_v;
            this.layoutIds[v] = arr_v1;
        }
    }

    public static abstract class PropertyChangedInverseListener extends OnPropertyChangedCallback implements InverseBindingListener {
        public final int a;

        public PropertyChangedInverseListener(int v) {
            this.a = v;
        }

        @Override  // androidx.databinding.Observable$OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable0, int v) {
            if(v == this.a || v == 0) {
                this.onChange();
            }
        }
    }

    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final CreateWeakListener CREATE_LIST_LISTENER = null;
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = null;
    private static final CreateWeakListener CREATE_MAP_LISTENER = null;
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = null;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final NotifierCallback REBIND_NOTIFIER = null;
    private static final int REBOUND = 3;
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
    static int SDK_INT;
    private static final boolean USE_CHOREOGRAPHER;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private LifecycleOwner mLifecycleOwner;
    private w[] mLocalFieldObservers;
    private n mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    private static final ReferenceQueue sReferenceQueue;

    static {
        ViewDataBinding.SDK_INT = Build.VERSION.SDK_INT;
        ViewDataBinding.USE_CHOREOGRAPHER = true;
        ViewDataBinding.CREATE_PROPERTY_LISTENER = new h(0);
        ViewDataBinding.CREATE_LIST_LISTENER = new h(1);
        ViewDataBinding.CREATE_MAP_LISTENER = new h(2);
        ViewDataBinding.CREATE_LIVE_DATA_LISTENER = new h(3);
        ViewDataBinding.REBIND_NOTIFIER = new i();  // 初始化器: Landroidx/databinding/CallbackRegistry$NotifierCallback;-><init>()V
        ViewDataBinding.sReferenceQueue = new ReferenceQueue();
        ViewDataBinding.ROOT_REATTACHED_LISTENER = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent0, View view0, int v) {
        this.mRebindRunnable = new k(this);
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent0;
        this.mLocalFieldObservers = new w[v];
        this.mRoot = view0;
        if(Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view\'s UI Thread");
        }
        if(ViewDataBinding.USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new l(this);
            return;
        }
        this.mFrameCallback = null;
        this.mUIThreadHandler = new Handler(Looper.myLooper());
    }

    public ViewDataBinding(Object object0, View view0, int v) {
        this(ViewDataBinding.a(object0), view0, v);
    }

    public static DataBindingComponent a(Object object0) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof DataBindingComponent)) {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        return (DataBindingComponent)object0;
    }

    public static void access$300() {
        Reference reference0;
        while((reference0 = ViewDataBinding.sReferenceQueue.poll()) != null) {
            if(reference0 instanceof w) {
                ((w)reference0).b();
            }
        }
    }

    public void addOnRebindCallback(@NonNull OnRebindCallback onRebindCallback0) {
        if(this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry(ViewDataBinding.REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback0);
    }

    public final void b() {
        if(this.mIsExecutingPendingBindings) {
            this.requestRebind();
            return;
        }
        if(!this.hasPendingBindings()) {
            return;
        }
        this.mIsExecutingPendingBindings = true;
        this.mRebindHalted = false;
        CallbackRegistry callbackRegistry0 = this.mRebindCallbacks;
        if(callbackRegistry0 != null) {
            callbackRegistry0.notifyCallbacks(this, 1, null);
            if(this.mRebindHalted) {
                this.mRebindCallbacks.notifyCallbacks(this, 2, null);
            }
        }
        if(!this.mRebindHalted) {
            this.executeBindings();
            CallbackRegistry callbackRegistry1 = this.mRebindCallbacks;
            if(callbackRegistry1 != null) {
                callbackRegistry1.notifyCallbacks(this, 3, null);
            }
        }
        this.mIsExecutingPendingBindings = false;
    }

    public static ViewDataBinding bind(Object object0, View view0, int v) {
        DataBindingComponent dataBindingComponent0 = ViewDataBinding.a(object0);
        return DataBindingUtil.a.getDataBinder(dataBindingComponent0, view0, v);
    }

    // This method was un-flattened
    public static void c(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object, IncludedLayouts viewDataBinding$IncludedLayouts0, SparseIntArray sparseIntArray0, boolean z) {
        ViewGroup viewGroup1;
        int v28;
        int v27;
        int v26;
        String s5;
        int v6;
        boolean z1;
        int v5;
        if(ViewDataBinding.getBinding(view0) != null) {
            return;
        }
        Object object0 = view0.getTag();
        String s = object0 instanceof String ? ((String)object0) : null;
        if(z && s != null && s.startsWith("layout")) {
            int v = s.lastIndexOf(0x5F);
            if(v > 0) {
                int v1 = v + 1;
                int v2 = s.length();
                if(v2 != v1) {
                    int v3 = v1;
                    while(v3 < v2) {
                        if(!Character.isDigit(s.charAt(v3))) {
                            goto label_27;
                        }
                        ++v3;
                    }
                    int v4 = s.length();
                    v5 = 0;
                    while(v1 < v4) {
                        v5 = v5 * 10 + (s.charAt(v1) - 0x30);
                        ++v1;
                    }
                    if(arr_object[v5] == null) {
                        arr_object[v5] = view0;
                    }
                    if(viewDataBinding$IncludedLayouts0 == null) {
                        v5 = -1;
                    }
                    z1 = true;
                }
            }
            else {
            label_27:
                v5 = -1;
                z1 = false;
            }
            v6 = v5;
        }
        else if(s == null || !s.startsWith("binding_")) {
            v6 = -1;
            z1 = false;
        }
        else {
            int v7 = ViewDataBinding.BINDING_NUMBER_START;
            int v8 = s.length();
            int v9 = 0;
            while(v7 < v8) {
                v9 = v9 * 10 + (s.charAt(v7) - 0x30);
                ++v7;
            }
            if(arr_object[v9] == null) {
                arr_object[v9] = view0;
            }
            if(viewDataBinding$IncludedLayouts0 == null) {
                v9 = -1;
            }
            v6 = v9;
            z1 = true;
        }
        if(!z1) {
            int v10 = view0.getId();
            if(v10 > 0 && sparseIntArray0 != null) {
                int v11 = sparseIntArray0.get(v10, -1);
                if(v11 >= 0 && arr_object[v11] == null) {
                    arr_object[v11] = view0;
                }
            }
        }
        if(view0 instanceof ViewGroup) {
            ViewGroup viewGroup0 = (ViewGroup)view0;
            int v12 = viewGroup0.getChildCount();
            int v13 = 0;
            int v14 = 0;
            while(v13 < v12) {
                View view1 = viewGroup0.getChildAt(v13);
                if(v6 < 0 || !(view1.getTag() instanceof String)) {
                    v27 = v13;
                    v26 = v14;
                    v28 = v12;
                    viewGroup1 = viewGroup0;
                    ViewDataBinding.c(dataBindingComponent0, view1, arr_object, viewDataBinding$IncludedLayouts0, sparseIntArray0, false);
                }
                else {
                    String s1 = (String)view1.getTag();
                    if(s1.endsWith("_0") && s1.startsWith("layout") && s1.indexOf(0x2F) > 0) {
                        CharSequence charSequence0 = s1.subSequence(s1.indexOf(0x2F) + 1, s1.length() - 2);
                        String[] arr_s = viewDataBinding$IncludedLayouts0.layouts[v6];
                        int v15 = v14;
                        while(true) {
                            if(v15 < arr_s.length) {
                                if(TextUtils.equals(charSequence0, arr_s[v15])) {
                                    break;
                                }
                                else {
                                    ++v15;
                                    continue;
                                }
                            }
                            v15 = -1;
                            break;
                        }
                        if(v15 >= 0) {
                            int v16 = viewDataBinding$IncludedLayouts0.indexes[v6][v15];
                            int v17 = viewDataBinding$IncludedLayouts0.layoutIds[v6][v15];
                            String s2 = (String)viewGroup0.getChildAt(v13).getTag();
                            String s3 = s2.substring(0, s2.length() - 1);
                            int v18 = s3.length();
                            int v19 = viewGroup0.getChildCount();
                            int v20 = v13 + 1;
                            int v21 = v13;
                            while(v20 < v19) {
                                View view2 = viewGroup0.getChildAt(v20);
                                String s4 = view2.getTag() instanceof String ? ((String)view2.getTag()) : null;
                                if(s4 == null || !s4.startsWith(s3)) {
                                    s5 = s3;
                                }
                                else {
                                    s5 = s3;
                                    if(s4.length() == s2.length() && s4.charAt(s4.length() - 1) == 0x30) {
                                        break;
                                    }
                                    else {
                                        int v22 = s4.length();
                                        if(v22 != v18) {
                                            int v23 = v18;
                                            while(v23 < v22) {
                                                if(!Character.isDigit(s4.charAt(v23))) {
                                                    goto label_98;
                                                }
                                                ++v23;
                                            }
                                            v21 = v20;
                                        }
                                    }
                                }
                            label_98:
                                ++v20;
                                s3 = s5;
                            }
                            if(v21 == v13) {
                                arr_object[v16] = DataBindingUtil.a.getDataBinder(dataBindingComponent0, view1, v17);
                            }
                            else {
                                int v24 = v21 - v13;
                                View[] arr_view = new View[v24 + 1];
                                for(int v25 = 0; v25 < v24 + 1; ++v25) {
                                    arr_view[v25] = viewGroup0.getChildAt(v13 + v25);
                                }
                                arr_object[v16] = DataBindingUtil.a.getDataBinder(dataBindingComponent0, arr_view, v17);
                                v13 += v24;
                            }
                            v26 = v15 + 1;
                            v27 = v13;
                            v28 = v12;
                            viewGroup1 = viewGroup0;
                        }
                    }
                }
                v13 = v27 + 1;
                v14 = v26;
                v12 = v28;
                viewGroup0 = viewGroup1;
            }
        }
    }

    public void ensureBindingComponentIsNotNull(Class class0) {
        if(this.mBindingComponent == null) {
            throw new IllegalStateException("Required DataBindingComponent is null in class " + this.getClass().getSimpleName() + ". A BindingAdapter in " + class0.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don\'t use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
        }
    }

    public abstract void executeBindings();

    public static void executeBindingsOn(ViewDataBinding viewDataBinding0) {
        viewDataBinding0.b();
    }

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding0 = this.mContainingBinding;
        if(viewDataBinding0 == null) {
            this.b();
            return;
        }
        viewDataBinding0.executePendingBindings();
    }

    public void forceExecuteBindings() {
        this.executeBindings();
    }

    public static ViewDataBinding getBinding(View view0) {
        return view0 == null ? null : ((ViewDataBinding)view0.getTag(id.dataBinding));
    }

    public static int getBuildSdkInt() [...] // 潜在的解密器

    public static int getColorFromResource(View view0, int v) {
        return view0.getContext().getColor(v);
    }

    public static ColorStateList getColorStateListFromResource(View view0, int v) {
        return view0.getContext().getColorStateList(v);
    }

    public static Drawable getDrawableFromResource(View view0, int v) {
        return view0.getContext().getDrawable(v);
    }

    public static Object getFrom(Map map0, Object object0) {
        return map0 == null ? null : map0.get(object0);
    }

    public static byte getFromArray(byte[] arr_b, int v) {
        return arr_b == null || v < 0 || v >= arr_b.length ? 0 : arr_b[v];
    }

    public static char getFromArray(char[] arr_c, int v) {
        return arr_c == null || v < 0 || v >= arr_c.length ? '\u0000' : arr_c[v];
    }

    public static double getFromArray(double[] arr_f, int v) {
        return arr_f == null || v < 0 || v >= arr_f.length ? 0.0 : arr_f[v];
    }

    public static float getFromArray(float[] arr_f, int v) {
        return arr_f == null || v < 0 || v >= arr_f.length ? 0.0f : arr_f[v];
    }

    public static int getFromArray(int[] arr_v, int v) {
        return arr_v == null || v < 0 || v >= arr_v.length ? 0 : arr_v[v];
    }

    public static long getFromArray(long[] arr_v, int v) {
        return arr_v == null || v < 0 || v >= arr_v.length ? 0L : arr_v[v];
    }

    public static Object getFromArray(Object[] arr_object, int v) {
        return arr_object == null || v < 0 || v >= arr_object.length ? null : arr_object[v];
    }

    public static short getFromArray(short[] arr_v, int v) {
        return arr_v == null || v < 0 || v >= arr_v.length ? 0 : arr_v[v];
    }

    public static boolean getFromArray(boolean[] arr_z, int v) {
        return arr_z == null || v < 0 || v >= arr_z.length ? false : arr_z[v];
    }

    public static int getFromList(SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0 == null || v < 0 ? 0 : sparseIntArray0.get(v);
    }

    @TargetApi(18)
    public static long getFromList(SparseLongArray sparseLongArray0, int v) {
        return sparseLongArray0 == null || v < 0 ? 0L : sparseLongArray0.get(v);
    }

    @TargetApi(16)
    public static Object getFromList(LongSparseArray longSparseArray0, int v) {
        return longSparseArray0 == null || v < 0 ? null : longSparseArray0.get(((long)v));
    }

    public static Object getFromList(SparseArray sparseArray0, int v) {
        return sparseArray0 == null || v < 0 ? null : sparseArray0.get(v);
    }

    public static Object getFromList(androidx.collection.LongSparseArray longSparseArray0, int v) {
        return longSparseArray0 == null || v < 0 ? null : longSparseArray0.get(((long)v));
    }

    public static Object getFromList(List list0, int v) {
        return list0 == null || v < 0 || v >= list0.size() ? null : list0.get(v);
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray0, int v) {
        return sparseBooleanArray0 == null || v < 0 ? false : sparseBooleanArray0.get(v);
    }

    @Nullable
    public LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int v) {
        w w0 = this.mLocalFieldObservers[v];
        return w0 == null ? null : w0.c;
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.mRoot;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void handleFieldChange(int v, Object object0, int v1) {
        if(!this.mInLiveDataRegisterObserver && !this.mInStateFlowRegisterObserver && this.onFieldChange(v, object0, v1)) {
            this.requestRebind();
        }
    }

    public abstract boolean hasPendingBindings();

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static ViewDataBinding inflateInternal(@NonNull LayoutInflater layoutInflater0, int v, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return DataBindingUtil.inflate(layoutInflater0, v, viewGroup0, z, ViewDataBinding.a(object0));
    }

    public abstract void invalidateAll();

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent0, View view0, int v, IncludedLayouts viewDataBinding$IncludedLayouts0, SparseIntArray sparseIntArray0) {
        Object[] arr_object = new Object[v];
        ViewDataBinding.c(dataBindingComponent0, view0, arr_object, viewDataBinding$IncludedLayouts0, sparseIntArray0, true);
        return arr_object;
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent0, View[] arr_view, int v, IncludedLayouts viewDataBinding$IncludedLayouts0, SparseIntArray sparseIntArray0) {
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < arr_view.length; ++v1) {
            ViewDataBinding.c(dataBindingComponent0, arr_view[v1], arr_object, viewDataBinding$IncludedLayouts0, sparseIntArray0, true);
        }
        return arr_object;
    }

    public abstract boolean onFieldChange(int arg1, Object arg2, int arg3);

    public static byte parse(String s, byte b) {
        try {
            return Byte.parseByte(s);
        }
        catch(NumberFormatException unused_ex) {
            return b;
        }
    }

    public static char parse(String s, char c) {
        return s == null || s.isEmpty() ? c : s.charAt(0);
    }

    public static double parse(String s, double f) {
        try {
            return Double.parseDouble(s);
        }
        catch(NumberFormatException unused_ex) {
            return f;
        }
    }

    public static float parse(String s, float f) {
        try {
            return Float.parseFloat(s);
        }
        catch(NumberFormatException unused_ex) {
            return f;
        }
    }

    public static int parse(String s, int v) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static long parse(String s, long v) {
        try {
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static short parse(String s, short v) {
        try {
            return Short.parseShort(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static boolean parse(String s, boolean z) {
        return s == null ? z : Boolean.parseBoolean(s);
    }

    public void registerTo(int v, Object object0, CreateWeakListener createWeakListener0) {
        if(object0 == null) {
            return;
        }
        w w0 = this.mLocalFieldObservers[v];
        if(w0 == null) {
            w0 = createWeakListener0.create(this, v, ViewDataBinding.sReferenceQueue);
            this.mLocalFieldObservers[v] = w0;
            LifecycleOwner lifecycleOwner0 = this.mLifecycleOwner;
            if(lifecycleOwner0 != null) {
                w0.a.setLifecycleOwner(lifecycleOwner0);
            }
        }
        w0.b();
        w0.c = object0;
        w0.a.addListener(object0);
    }

    public void removeOnRebindCallback(@NonNull OnRebindCallback onRebindCallback0) {
        CallbackRegistry callbackRegistry0 = this.mRebindCallbacks;
        if(callbackRegistry0 != null) {
            callbackRegistry0.remove(onRebindCallback0);
        }
    }

    public void requestRebind() {
        ViewDataBinding viewDataBinding0 = this.mContainingBinding;
        if(viewDataBinding0 != null) {
            viewDataBinding0.requestRebind();
            return;
        }
        if(this.mLifecycleOwner != null && !this.mLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(State.STARTED)) {
            return;
        }
        synchronized(this) {
            if(this.mPendingRebind) {
                return;
            }
            this.mPendingRebind = true;
        }
        if(ViewDataBinding.USE_CHOREOGRAPHER) {
            this.mChoreographer.postFrameCallback(this.mFrameCallback);
            return;
        }
        this.mUIThreadHandler.post(this.mRebindRunnable);
    }

    public static byte safeUnbox(Byte byte0) {
        return byte0 == null ? 0 : ((byte)byte0);
    }

    public static char safeUnbox(Character character0) {
        return character0 == null ? '\u0000' : character0.charValue();
    }

    public static double safeUnbox(Double double0) {
        return double0 == null ? 0.0 : ((double)double0);
    }

    public static float safeUnbox(Float float0) {
        return float0 == null ? 0.0f : ((float)float0);
    }

    public static int safeUnbox(Integer integer0) {
        return integer0 == null ? 0 : ((int)integer0);
    }

    public static long safeUnbox(Long long0) {
        return long0 == null ? 0L : ((long)long0);
    }

    public static short safeUnbox(Short short0) {
        return short0 == null ? 0 : ((short)short0);
    }

    public static boolean safeUnbox(Boolean boolean0) {
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding0, InverseBindingListener inverseBindingListener0, PropertyChangedInverseListener viewDataBinding$PropertyChangedInverseListener0) {
        if(inverseBindingListener0 != viewDataBinding$PropertyChangedInverseListener0) {
            if(inverseBindingListener0 != null) {
                viewDataBinding0.removeOnPropertyChangedCallback(((PropertyChangedInverseListener)inverseBindingListener0));
            }
            if(viewDataBinding$PropertyChangedInverseListener0 != null) {
                viewDataBinding0.addOnPropertyChangedCallback(viewDataBinding$PropertyChangedInverseListener0);
            }
        }
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding0) {
        if(viewDataBinding0 != null) {
            viewDataBinding0.mContainingBinding = this;
        }
    }

    @MainThread
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner0) {
        if(lifecycleOwner0 instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment\'s view lifecycle");
        }
        LifecycleOwner lifecycleOwner1 = this.mLifecycleOwner;
        if(lifecycleOwner1 == lifecycleOwner0) {
            return;
        }
        if(lifecycleOwner1 != null) {
            lifecycleOwner1.getLifecycle().removeObserver(this.mOnStartListener);
        }
        this.mLifecycleOwner = lifecycleOwner0;
        if(lifecycleOwner0 != null) {
            if(this.mOnStartListener == null) {
                this.mOnStartListener = new n(this);
            }
            lifecycleOwner0.getLifecycle().addObserver(this.mOnStartListener);
        }
        w[] arr_w = this.mLocalFieldObservers;
        for(int v = 0; v < arr_w.length; ++v) {
            w w0 = arr_w[v];
            if(w0 != null) {
                w0.a.setLifecycleOwner(lifecycleOwner0);
            }
        }
    }

    public void setRootTag(View view0) {
        view0.setTag(id.dataBinding, this);
    }

    public void setRootTag(View[] arr_view) {
        for(int v = 0; v < arr_view.length; ++v) {
            arr_view[v].setTag(id.dataBinding, this);
        }
    }

    @TargetApi(16)
    public static void setTo(LongSparseArray longSparseArray0, int v, Object object0) {
        if(longSparseArray0 != null && v >= 0 && v < longSparseArray0.size()) {
            longSparseArray0.put(((long)v), object0);
        }
    }

    public static void setTo(SparseArray sparseArray0, int v, Object object0) {
        if(sparseArray0 != null && v >= 0 && v < sparseArray0.size()) {
            sparseArray0.put(v, object0);
        }
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        if(sparseBooleanArray0 != null && v >= 0 && v < sparseBooleanArray0.size()) {
            sparseBooleanArray0.put(v, z);
        }
    }

    public static void setTo(SparseIntArray sparseIntArray0, int v, int v1) {
        if(sparseIntArray0 != null && v >= 0 && v < sparseIntArray0.size()) {
            sparseIntArray0.put(v, v1);
        }
    }

    @TargetApi(18)
    public static void setTo(SparseLongArray sparseLongArray0, int v, long v1) {
        if(sparseLongArray0 != null && v >= 0 && v < sparseLongArray0.size()) {
            sparseLongArray0.put(v, v1);
        }
    }

    public static void setTo(androidx.collection.LongSparseArray longSparseArray0, int v, Object object0) {
        if(longSparseArray0 != null && v >= 0 && v < longSparseArray0.size()) {
            longSparseArray0.put(((long)v), object0);
        }
    }

    public static void setTo(List list0, int v, Object object0) {
        if(list0 != null && v >= 0 && v < list0.size()) {
            list0.set(v, object0);
        }
    }

    public static void setTo(Map map0, Object object0, Object object1) {
        if(map0 == null) {
            return;
        }
        map0.put(object0, object1);
    }

    public static void setTo(byte[] arr_b, int v, byte b) {
        if(arr_b != null && v >= 0 && v < arr_b.length) {
            arr_b[v] = b;
        }
    }

    public static void setTo(char[] arr_c, int v, char c) {
        if(arr_c != null && v >= 0 && v < arr_c.length) {
            arr_c[v] = c;
        }
    }

    public static void setTo(double[] arr_f, int v, double f) {
        if(arr_f != null && v >= 0 && v < arr_f.length) {
            arr_f[v] = f;
        }
    }

    public static void setTo(float[] arr_f, int v, float f) {
        if(arr_f != null && v >= 0 && v < arr_f.length) {
            arr_f[v] = f;
        }
    }

    public static void setTo(int[] arr_v, int v, int v1) {
        if(arr_v != null && v >= 0 && v < arr_v.length) {
            arr_v[v] = v1;
        }
    }

    public static void setTo(long[] arr_v, int v, long v1) {
        if(arr_v != null && v >= 0 && v < arr_v.length) {
            arr_v[v] = v1;
        }
    }

    public static void setTo(Object[] arr_object, int v, Object object0) {
        if(arr_object != null && v >= 0 && v < arr_object.length) {
            arr_object[v] = object0;
        }
    }

    public static void setTo(short[] arr_v, int v, short v1) {
        if(arr_v != null && v >= 0 && v < arr_v.length) {
            arr_v[v] = v1;
        }
    }

    public static void setTo(boolean[] arr_z, int v, boolean z) {
        if(arr_z != null && v >= 0 && v < arr_z.length) {
            arr_z[v] = z;
        }
    }

    public abstract boolean setVariable(int arg1, @Nullable Object arg2);

    public void unbind() {
        w[] arr_w = this.mLocalFieldObservers;
        for(int v = 0; v < arr_w.length; ++v) {
            w w0 = arr_w[v];
            if(w0 != null) {
                w0.b();
            }
        }
    }

    public boolean unregisterFrom(int v) {
        w w0 = this.mLocalFieldObservers[v];
        return w0 == null ? false : w0.b();
    }

    public boolean updateLiveDataRegistration(int v, LiveData liveData0) {
        try {
            this.mInLiveDataRegisterObserver = true;
            boolean z = this.updateRegistration(v, liveData0, ViewDataBinding.CREATE_LIVE_DATA_LISTENER);
            this.mInLiveDataRegisterObserver = false;
            return z;
        }
        catch(Throwable throwable0) {
            this.mInLiveDataRegisterObserver = false;
            throw throwable0;
        }
    }

    public boolean updateRegistration(int v, Observable observable0) {
        return this.updateRegistration(v, observable0, ViewDataBinding.CREATE_PROPERTY_LISTENER);
    }

    public boolean updateRegistration(int v, ObservableList observableList0) {
        return this.updateRegistration(v, observableList0, ViewDataBinding.CREATE_LIST_LISTENER);
    }

    public boolean updateRegistration(int v, ObservableMap observableMap0) {
        return this.updateRegistration(v, observableMap0, ViewDataBinding.CREATE_MAP_LISTENER);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean updateRegistration(int v, Object object0, CreateWeakListener createWeakListener0) {
        if(object0 == null) {
            return this.unregisterFrom(v);
        }
        w w0 = this.mLocalFieldObservers[v];
        if(w0 == null) {
            this.registerTo(v, object0, createWeakListener0);
            return true;
        }
        if(w0.c == object0) {
            return false;
        }
        this.unregisterFrom(v);
        this.registerTo(v, object0, createWeakListener0);
        return true;
    }
}

