package androidx.databinding;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000BJ-\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lkotlinx/coroutines/flow/Flow;", "observable", "", "updateStateFlowRegistration", "(Landroidx/databinding/ViewDataBinding;ILkotlinx/coroutines/flow/Flow;)Z", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ViewDataBindingKtx {
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\'\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\r\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ!\u0010\u0011\u001A\u00020\u00102\u0010\u0010\u000F\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001A\u00020\u00102\u0010\u0010\u000F\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001A\u00020\u00102\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "Landroidx/databinding/w;", "getListener", "()Landroidx/databinding/w;", "target", "", "addListener", "(Lkotlinx/coroutines/flow/Flow;)V", "removeListener", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "databindingKtx_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class StateFlowListener implements ObservableReference {
        public WeakReference a;
        public Job b;
        public final w c;

        public StateFlowListener(@Nullable ViewDataBinding viewDataBinding0, int v, @NotNull ReferenceQueue referenceQueue0) {
            Intrinsics.checkNotNullParameter(referenceQueue0, "referenceQueue");
            super();
            this.c = new w(viewDataBinding0, v, this, referenceQueue0);
        }

        @Override  // androidx.databinding.ObservableReference
        public void addListener(Object object0) {
            this.addListener(((Flow)object0));
        }

        public void addListener(@Nullable Flow flow0) {
            WeakReference weakReference0 = this.a;
            if(weakReference0 != null) {
                LifecycleOwner lifecycleOwner0 = (LifecycleOwner)weakReference0.get();
                if(lifecycleOwner0 != null && flow0 != null) {
                    Job job0 = this.b;
                    if(job0 != null) {
                        DefaultImpls.cancel$default(job0, null, 1, null);
                    }
                    this.b = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner0), null, null, new u(lifecycleOwner0, flow0, this, null), 3, null);
                }
            }
        }

        @Override  // androidx.databinding.ObservableReference
        @NotNull
        public w getListener() {
            return this.c;
        }

        @Override  // androidx.databinding.ObservableReference
        public void removeListener(Object object0) {
            this.removeListener(((Flow)object0));
        }

        public void removeListener(@Nullable Flow flow0) {
            Job job0 = this.b;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            this.b = null;
        }

        @Override  // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner0) {
            if((this.a == null ? null : ((LifecycleOwner)this.a.get())) == lifecycleOwner0) {
                return;
            }
            Job job0 = this.b;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            if(lifecycleOwner0 == null) {
                this.a = null;
                return;
            }
            this.a = new WeakReference(lifecycleOwner0);
            Flow flow0 = (Flow)this.c.c;
            if(flow0 != null) {
                Job job1 = this.b;
                if(job1 != null) {
                    DefaultImpls.cancel$default(job1, null, 1, null);
                }
                this.b = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner0), null, null, new u(lifecycleOwner0, flow0, this, null), 3, null);
            }
        }
    }

    @NotNull
    public static final ViewDataBindingKtx INSTANCE;
    public static final r a;

    static {
        ViewDataBindingKtx.INSTANCE = new ViewDataBindingKtx();  // 初始化器: Ljava/lang/Object;-><init>()V
        ViewDataBindingKtx.a = new r();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    public static final boolean updateStateFlowRegistration(@NotNull ViewDataBinding viewDataBinding0, int v, @Nullable Flow flow0) {
        Intrinsics.checkNotNullParameter(viewDataBinding0, "viewDataBinding");
        viewDataBinding0.mInStateFlowRegisterObserver = true;
        try {
            boolean z = viewDataBinding0.updateRegistration(v, flow0, ViewDataBindingKtx.a);
            viewDataBinding0.mInStateFlowRegisterObserver = false;
            return z;
        }
        catch(Throwable throwable0) {
            viewDataBinding0.mInStateFlowRegisterObserver = false;
            throw throwable0;
        }
    }
}

