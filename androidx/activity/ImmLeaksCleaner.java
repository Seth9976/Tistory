package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0004\u000E\r\u000F\u0010B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Companion", "Cleaner", "FailedInitialization", "ValidCleaner", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\b\u001A\u0004\u0018\u00010\u0001*\u00020\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\f\u001A\u0004\u0018\u00010\t*\u00020\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\u0082\u0001\u0002\r\u000E¨\u0006\u000F"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Cleaner;", "", "Landroid/view/inputmethod/InputMethodManager;", "", "clearNextServedView", "(Landroid/view/inputmethod/InputMethodManager;)Z", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Cleaner {
        public Cleaner(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public abstract boolean clearNextServedView(@NotNull InputMethodManager arg1);

        @Nullable
        public abstract Object getLock(@NotNull InputMethodManager arg1);

        @Nullable
        public abstract View getServedView(@NotNull InputMethodManager arg1);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001R\u001B\u0010\u0007\u001A\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Companion;", "", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "cleaner$delegate", "Lkotlin/Lazy;", "getCleaner", "()Landroidx/activity/ImmLeaksCleaner$Cleaner;", "cleaner", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Cleaner getCleaner() {
            return (Cleaner)ImmLeaksCleaner.b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\t\u001A\u0004\u0018\u00010\u0006*\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u001A\u0010\r\u001A\u0004\u0018\u00010\n*\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "Landroid/view/inputmethod/InputMethodManager;", "", "clearNextServedView", "(Landroid/view/inputmethod/InputMethodManager;)Z", "", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class FailedInitialization extends Cleaner {
        @NotNull
        public static final FailedInitialization INSTANCE;

        static {
            FailedInitialization.INSTANCE = new FailedInitialization(null);  // 初始化器: Landroidx/activity/ImmLeaksCleaner$Cleaner;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        public boolean clearNextServedView(@NotNull InputMethodManager inputMethodManager0) {
            Intrinsics.checkNotNullParameter(inputMethodManager0, "<this>");
            return false;
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @Nullable
        public Object getLock(@NotNull InputMethodManager inputMethodManager0) {
            Intrinsics.checkNotNullParameter(inputMethodManager0, "<this>");
            return null;
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @Nullable
        public View getServedView(@NotNull InputMethodManager inputMethodManager0) {
            Intrinsics.checkNotNullParameter(inputMethodManager0, "<this>");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001A\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BR\u001A\u0010\u000F\u001A\u0004\u0018\u00010\f*\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u001A\u0010\u0013\u001A\u0004\u0018\u00010\u0010*\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "Ljava/lang/reflect/Field;", "hField", "servedViewField", "nextServedViewField", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V", "Landroid/view/inputmethod/InputMethodManager;", "", "clearNextServedView", "(Landroid/view/inputmethod/InputMethodManager;)Z", "", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ValidCleaner extends Cleaner {
        public final Field a;
        public final Field b;
        public final Field c;

        public ValidCleaner(@NotNull Field field0, @NotNull Field field1, @NotNull Field field2) {
            Intrinsics.checkNotNullParameter(field0, "hField");
            Intrinsics.checkNotNullParameter(field1, "servedViewField");
            Intrinsics.checkNotNullParameter(field2, "nextServedViewField");
            super(null);
            this.a = field0;
            this.b = field1;
            this.c = field2;
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        public boolean clearNextServedView(@NotNull InputMethodManager inputMethodManager0) {
            Intrinsics.checkNotNullParameter(inputMethodManager0, "<this>");
            try {
                this.c.set(inputMethodManager0, null);
                return true;
            }
            catch(IllegalAccessException unused_ex) {
                return false;
            }
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @Nullable
        public Object getLock(@NotNull InputMethodManager inputMethodManager0) {
            Intrinsics.checkNotNullParameter(inputMethodManager0, "<this>");
            try {
                return this.a.get(inputMethodManager0);
            }
            catch(IllegalAccessException unused_ex) {
                return null;
            }
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @Nullable
        public View getServedView(@NotNull InputMethodManager inputMethodManager0) {
            Intrinsics.checkNotNullParameter(inputMethodManager0, "<this>");
            try {
                return (View)this.b.get(inputMethodManager0);
            }
            catch(IllegalAccessException | ClassCastException unused_ex) {
                return null;
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Activity a;
    public static final Lazy b;

    static {
        ImmLeaksCleaner.Companion = new Companion(null);
        ImmLeaksCleaner.b = c.lazy(w.w);
    }

    public ImmLeaksCleaner(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.a = activity0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 != Event.ON_DESTROY) {
            return;
        }
        Object object0 = this.a.getSystemService("input_method");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        Cleaner immLeaksCleaner$Cleaner0 = ImmLeaksCleaner.Companion.getCleaner();
        Object object1 = immLeaksCleaner$Cleaner0.getLock(((InputMethodManager)object0));
        if(object1 == null) {
            return;
        }
        synchronized(object1) {
            View view0 = immLeaksCleaner$Cleaner0.getServedView(((InputMethodManager)object0));
            if(view0 == null) {
                return;
            }
            if(view0.isAttachedToWindow()) {
                return;
            }
            boolean z = immLeaksCleaner$Cleaner0.clearNextServedView(((InputMethodManager)object0));
        }
        if(z) {
            ((InputMethodManager)object0).isActive();
        }
    }
}

