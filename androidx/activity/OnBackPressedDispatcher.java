package androidx.activity;

import android.os.Build.VERSION;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004$%&\'B!\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u000FH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001E\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\u001CH\u0007¢\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010 \u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\u001CH\u0007¢\u0006\u0004\b \u0010\u001FJ\u000F\u0010!\u001A\u00020\fH\u0007¢\u0006\u0004\b!\u0010\"J\u000F\u0010#\u001A\u00020\fH\u0007¢\u0006\u0004\b#\u0010\"¨\u0006("}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/Consumer;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "setOnBackInvokedDispatcher", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "addCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "(Landroidx/activity/OnBackPressedCallback;)Landroidx/activity/Cancellable;", "addCancellableCallback", "Landroidx/lifecycle/LifecycleOwner;", "owner", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V", "hasEnabledCallbacks", "()Z", "Landroidx/activity/BackEventCompat;", "backEvent", "dispatchOnBackStarted", "(Landroidx/activity/BackEventCompat;)V", "dispatchOnBackProgressed", "onBackPressed", "()V", "dispatchOnBackCancelled", "Api33Impl", "Api34Impl", "androidx/activity/a0", "androidx/activity/b0", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1747#2,3:434\n533#2,6:437\n533#2,6:443\n533#2,6:449\n533#2,6:455\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:434,3\n233#1:437,6\n254#1:443,6\n274#1:449,6\n293#1:455,6\n*E\n"})
public final class OnBackPressedDispatcher {
    @RequiresApi(33)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\t\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000E\u001A\u00020\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BH\u0007¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "dispatcher", "", "priority", "callback", "", "registerOnBackInvokedCallback", "(Ljava/lang/Object;ILjava/lang/Object;)V", "unregisterOnBackInvokedCallback", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "createOnBackInvokedCallback", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api33Impl {
        @NotNull
        public static final Api33Impl INSTANCE;

        static {
            Api33Impl.INSTANCE = new Api33Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback createOnBackInvokedCallback(@NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "onBackInvoked");
            return new z(function00, 0);
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(@NotNull Object object0, int v, @NotNull Object object1) {
            Intrinsics.checkNotNullParameter(object0, "dispatcher");
            Intrinsics.checkNotNullParameter(object1, "callback");
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(v, ((OnBackInvokedCallback)object1));
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(@NotNull Object object0, @NotNull Object object1) {
            Intrinsics.checkNotNullParameter(object0, "dispatcher");
            Intrinsics.checkNotNullParameter(object1, "callback");
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    @RequiresApi(34)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001Jq\u0010\u000E\u001A\u00020\r2!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", "name", "backEvent", "", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "createOnBackAnimationCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api34Impl {
        @NotNull
        public static final Api34Impl INSTANCE;

        static {
            Api34Impl.INSTANCE = new Api34Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback createOnBackAnimationCallback(@NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function0 function01) {
            Intrinsics.checkNotNullParameter(function10, "onBackStarted");
            Intrinsics.checkNotNullParameter(function11, "onBackProgressed");
            Intrinsics.checkNotNullParameter(function00, "onBackInvoked");
            Intrinsics.checkNotNullParameter(function01, "onBackCancelled");
            return new OnBackAnimationCallback() {
                public final Function1 a;
                public final Function1 b;
                public final Function0 c;
                public final Function0 d;

                {
                    Function1 function10 = function11;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    Function1 function11 = function00;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    Function0 function00 = function01;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = function10;
                    this.b = function11;
                    this.c = function00;
                    this.d = function01;
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    this.d.invoke();
                }

                @Override  // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    this.c.invoke();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackProgressed(@NotNull BackEvent backEvent0) {
                    Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
                    BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
                    this.b.invoke(backEventCompat0);
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackStarted(@NotNull BackEvent backEvent0) {
                    Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
                    BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
                    this.a.invoke(backEventCompat0);
                }
            };
        }
    }

    public final Runnable a;
    public final Consumer b;
    public final ArrayDeque c;
    public OnBackPressedCallback d;
    public final OnBackInvokedCallback e;
    public OnBackInvokedDispatcher f;
    public boolean g;
    public boolean h;

    @JvmOverloads
    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    @JvmOverloads
    public OnBackPressedDispatcher(@Nullable Runnable runnable0) {
        this(runnable0, null);
    }

    public OnBackPressedDispatcher(Runnable runnable0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            runnable0 = null;
        }
        this(runnable0);
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable0, @Nullable Consumer consumer0) {
        OnBackInvokedCallback onBackInvokedCallback0;
        this.a = runnable0;
        this.b = consumer0;
        this.c = new ArrayDeque();
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            if(v >= 34) {
                x x0 = new x(this, 0);
                x x1 = new x(this, 1);
                y y0 = new y(this, 0);
                y y1 = new y(this, 1);
                onBackInvokedCallback0 = Api34Impl.INSTANCE.createOnBackAnimationCallback(x0, x1, y0, y1);
            }
            else {
                y y2 = new y(this, 2);
                onBackInvokedCallback0 = Api33Impl.INSTANCE.createOnBackInvokedCallback(y2);
            }
            this.e = onBackInvokedCallback0;
        }
    }

    public final void a() {
        OnBackPressedCallback onBackPressedCallback0 = this.d;
        if(onBackPressedCallback0 == null) {
            Object object0 = null;
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((OnBackPressedCallback)object1).isEnabled()) {
                    object0 = object1;
                    break;
                }
            }
            onBackPressedCallback0 = (OnBackPressedCallback)object0;
        }
        this.d = null;
        if(onBackPressedCallback0 != null) {
            onBackPressedCallback0.handleOnBackCancelled();
        }
    }

    @MainThread
    public final void addCallback(@NotNull OnBackPressedCallback onBackPressedCallback0) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback0, "onBackPressedCallback");
        this.addCancellableCallback$activity_release(onBackPressedCallback0);
    }

    @MainThread
    public final void addCallback(@NotNull LifecycleOwner lifecycleOwner0, @NotNull OnBackPressedCallback onBackPressedCallback0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback0, "onBackPressedCallback");
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle0.getCurrentState() == State.DESTROYED) {
            return;
        }
        onBackPressedCallback0.addCancellable(new a0(this, lifecycle0, onBackPressedCallback0));
        this.e();
        onBackPressedCallback0.setEnabledChangedCallback$activity_release(new c0(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0));
    }

    @MainThread
    @NotNull
    public final Cancellable addCancellableCallback$activity_release(@NotNull OnBackPressedCallback onBackPressedCallback0) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback0, "onBackPressedCallback");
        this.c.add(onBackPressedCallback0);
        Cancellable cancellable0 = new b0(this, onBackPressedCallback0);
        onBackPressedCallback0.addCancellable(cancellable0);
        this.e();
        onBackPressedCallback0.setEnabledChangedCallback$activity_release(new c0(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
        return cancellable0;
    }

    public final void b(BackEventCompat backEventCompat0) {
        OnBackPressedCallback onBackPressedCallback0 = this.d;
        if(onBackPressedCallback0 == null) {
            Object object0 = null;
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((OnBackPressedCallback)object1).isEnabled()) {
                    object0 = object1;
                    break;
                }
            }
            onBackPressedCallback0 = (OnBackPressedCallback)object0;
        }
        if(onBackPressedCallback0 != null) {
            onBackPressedCallback0.handleOnBackProgressed(backEventCompat0);
        }
    }

    public final void c(BackEventCompat backEventCompat0) {
        Object object0 = null;
        ListIterator listIterator0 = this.c.listIterator(this.c.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((OnBackPressedCallback)object1).isEnabled()) {
                object0 = object1;
                break;
            }
        }
        if(this.d != null) {
            this.a();
        }
        this.d = (OnBackPressedCallback)object0;
        if(((OnBackPressedCallback)object0) != null) {
            ((OnBackPressedCallback)object0).handleOnBackStarted(backEventCompat0);
        }
    }

    public final void d(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.f;
        OnBackInvokedCallback onBackInvokedCallback0 = this.e;
        if(onBackInvokedDispatcher0 != null && onBackInvokedCallback0 != null) {
            if(z && !this.g) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher0, 0, onBackInvokedCallback0);
                this.g = true;
                return;
            }
            if(!z && this.g) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher0, onBackInvokedCallback0);
                this.g = false;
            }
        }
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        this.a();
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(@NotNull BackEventCompat backEventCompat0) {
        Intrinsics.checkNotNullParameter(backEventCompat0, "backEvent");
        this.b(backEventCompat0);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(@NotNull BackEventCompat backEventCompat0) {
        Intrinsics.checkNotNullParameter(backEventCompat0, "backEvent");
        this.c(backEventCompat0);
    }

    public final void e() {
        boolean z = this.h;
        boolean z1 = false;
        ArrayDeque arrayDeque0 = this.c;
        if(arrayDeque0 == null || !arrayDeque0.isEmpty()) {
            for(Object object0: arrayDeque0) {
                if(((OnBackPressedCallback)object0).isEnabled()) {
                    z1 = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        this.h = z1;
        if(z1 != z) {
            Consumer consumer0 = this.b;
            if(consumer0 != null) {
                consumer0.accept(Boolean.valueOf(z1));
            }
            if(Build.VERSION.SDK_INT >= 33) {
                this.d(z1);
            }
        }
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        return this.h;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback0 = this.d;
        if(onBackPressedCallback0 == null) {
            Object object0 = null;
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((OnBackPressedCallback)object1).isEnabled()) {
                    object0 = object1;
                    break;
                }
            }
            onBackPressedCallback0 = (OnBackPressedCallback)object0;
        }
        this.d = null;
        if(onBackPressedCallback0 != null) {
            onBackPressedCallback0.handleOnBackPressed();
            return;
        }
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@NotNull OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher0, "invoker");
        this.f = onBackInvokedDispatcher0;
        this.d(this.h);
    }
}

