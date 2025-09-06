package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002+,B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000E\u001A\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001A\u00020\u00062\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\n\u001A\u00028\u00002\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\'\u00A2\u0006\u0004\b\u000E\u0010\u000FJQ\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001A\u00020\u00102\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001F\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010\"\u001A\u00020\r2\b\u0010!\u001A\u0004\u0018\u00010\u001D\u00A2\u0006\u0004\b\"\u0010 J)\u0010\'\u001A\u00020&2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u00062\b\u0010%\u001A\u0004\u0018\u00010$H\u0007\u00A2\u0006\u0004\b\'\u0010(J%\u0010\'\u001A\u00020&\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010)\u001A\u00028\u0000H\u0007\u00A2\u0006\u0004\b\'\u0010*\u00A8\u0006-"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "I", "O", "", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "", "key", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "register", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "unregister$activity_release", "(Ljava/lang/String;)V", "unregister", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "resultCode", "Landroid/content/Intent;", "data", "", "dispatchResult", "(IILandroid/content/Intent;)Z", "result", "(ILjava/lang/Object;)Z", "androidx/activity/result/c", "androidx/activity/result/d", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,447:1\n123#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n401#1:448,2\n*E\n"})
public abstract class ActivityResultRegistry {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final transient LinkedHashMap e;
    public final LinkedHashMap f;
    public final Bundle g;

    public ActivityResultRegistry() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }

    public final void a(String s) {
        LinkedHashMap linkedHashMap0 = this.b;
        if(((Integer)linkedHashMap0.get(s)) != null) {
            return;
        }
        for(Object object0: SequencesKt__SequencesKt.generateSequence(e.w)) {
            Number number0 = (Number)object0;
            LinkedHashMap linkedHashMap1 = this.a;
            if(!linkedHashMap1.containsKey(number0.intValue())) {
                int v = number0.intValue();
                linkedHashMap1.put(v, s);
                linkedHashMap0.put(s, v);
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @MainThread
    public final boolean dispatchResult(int v, int v1, @Nullable Intent intent0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        c c0 = (c)this.e.get(s);
        if((c0 == null ? null : c0.a) != null) {
            ArrayList arrayList0 = this.d;
            if(arrayList0.contains(s)) {
                Object object0 = c0.b.parseResult(v1, intent0);
                c0.a.onActivityResult(object0);
                arrayList0.remove(s);
                return true;
            }
        }
        this.f.remove(s);
        ActivityResult activityResult0 = new ActivityResult(v1, intent0);
        this.g.putParcelable(s, activityResult0);
        return true;
    }

    @MainThread
    public final boolean dispatchResult(int v, Object object0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        c c0 = (c)this.e.get(s);
        if((c0 == null ? null : c0.a) == null) {
            this.g.remove(s);
            this.f.put(s, object0);
            return true;
        }
        ActivityResultCallback activityResultCallback0 = c0.a;
        Intrinsics.checkNotNull(activityResultCallback0, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if(this.d.remove(s)) {
            activityResultCallback0.onActivityResult(object0);
        }
        return true;
    }

    @MainThread
    public abstract void onLaunch(int arg1, @NotNull ActivityResultContract arg2, Object arg3, @Nullable ActivityOptionsCompat arg4);

    public final void onRestoreInstanceState(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList arrayList1 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if(arrayList1 != null && arrayList0 != null) {
            ArrayList arrayList2 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if(arrayList2 != null) {
                this.d.addAll(arrayList2);
            }
            Bundle bundle1 = bundle0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = this.g;
            if(bundle1 != null) {
                bundle2.putAll(bundle1);
            }
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = (String)arrayList1.get(v1);
                LinkedHashMap linkedHashMap0 = this.b;
                boolean z = linkedHashMap0.containsKey(s);
                LinkedHashMap linkedHashMap1 = this.a;
                if(z) {
                    Integer integer0 = (Integer)linkedHashMap0.remove(s);
                    if(!bundle2.containsKey(s)) {
                        TypeIntrinsics.asMutableMap(linkedHashMap1).remove(integer0);
                    }
                }
                Object object0 = arrayList0.get(v1);
                Intrinsics.checkNotNullExpressionValue(object0, "rcs[i]");
                int v2 = ((Number)object0).intValue();
                Object object1 = arrayList1.get(v1);
                Intrinsics.checkNotNullExpressionValue(object1, "keys[i]");
                linkedHashMap1.put(v2, ((String)object1));
                linkedHashMap0.put(((String)object1), v2);
            }
        }
    }

    public final void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        bundle0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.values()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.keySet()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.d));
        bundle0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.g));
    }

    @NotNull
    public final ActivityResultLauncher register(@NotNull String s, @NotNull ActivityResultContract activityResultContract0, @NotNull ActivityResultCallback activityResultCallback0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(activityResultCallback0, "callback");
        this.a(s);
        c c0 = new c(activityResultContract0, activityResultCallback0);
        this.e.put(s, c0);
        LinkedHashMap linkedHashMap0 = this.f;
        if(linkedHashMap0.containsKey(s)) {
            Object object0 = linkedHashMap0.get(s);
            linkedHashMap0.remove(s);
            activityResultCallback0.onActivityResult(object0);
        }
        Bundle bundle0 = this.g;
        ActivityResult activityResult0 = (ActivityResult)BundleCompat.getParcelable(bundle0, s, ActivityResult.class);
        if(activityResult0 != null) {
            bundle0.remove(s);
            activityResultCallback0.onActivityResult(activityResultContract0.parseResult(activityResult0.getResultCode(), activityResult0.getData()));
        }
        return new ActivityResultLauncher() {
            @Override  // androidx.activity.result.ActivityResultLauncher
            @NotNull
            public ActivityResultContract getContract() {
                return this.c;
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void launch(Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
                ActivityResultRegistry activityResultRegistry0 = s;
                String s = activityResultContract0;
                Object object1 = activityResultRegistry0.b.get(s);
                ActivityResultContract activityResultContract0 = this.c;
                if(object1 != null) {
                    int v = ((Number)object1).intValue();
                    activityResultRegistry0.d.add(s);
                    try {
                        activityResultRegistry0.onLaunch(v, activityResultContract0, object0, activityOptionsCompat0);
                        return;
                    }
                    catch(Exception exception0) {
                        activityResultRegistry0.d.remove(s);
                        throw exception0;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract0 + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                s.unregister$activity_release(activityResultContract0);
            }
        };
    }

    @NotNull
    public final ActivityResultLauncher register(@NotNull String s, @NotNull LifecycleOwner lifecycleOwner0, @NotNull ActivityResultContract activityResultContract0, @NotNull ActivityResultCallback activityResultCallback0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(activityResultCallback0, "callback");
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle0.getCurrentState().isAtLeast(State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner0 + " is attempting to register while current state is " + lifecycle0.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        this.a(s);
        LinkedHashMap linkedHashMap0 = this.c;
        d d0 = (d)linkedHashMap0.get(s);
        if(d0 == null) {
            d0 = new d(lifecycle0);
        }
        b b0 = new b(this, s, activityResultCallback0, activityResultContract0);
        Intrinsics.checkNotNullParameter(b0, "observer");
        d0.a.addObserver(b0);
        d0.b.add(b0);
        linkedHashMap0.put(s, d0);
        return new ActivityResultLauncher() {
            @Override  // androidx.activity.result.ActivityResultLauncher
            @NotNull
            public ActivityResultContract getContract() {
                return this.c;
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void launch(Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
                ActivityResultRegistry activityResultRegistry0 = s;
                String s = activityResultContract0;
                Object object1 = activityResultRegistry0.b.get(s);
                ActivityResultContract activityResultContract0 = this.c;
                if(object1 != null) {
                    int v = ((Number)object1).intValue();
                    activityResultRegistry0.d.add(s);
                    try {
                        activityResultRegistry0.onLaunch(v, activityResultContract0, object0, activityOptionsCompat0);
                        return;
                    }
                    catch(Exception exception0) {
                        activityResultRegistry0.d.remove(s);
                        throw exception0;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract0 + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                s.unregister$activity_release(activityResultContract0);
            }
        };
    }

    @MainThread
    public final void unregister$activity_release(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        if(!this.d.contains(s)) {
            Integer integer0 = (Integer)this.b.remove(s);
            if(integer0 != null) {
                this.a.remove(integer0);
            }
        }
        this.e.remove(s);
        LinkedHashMap linkedHashMap0 = this.f;
        if(linkedHashMap0.containsKey(s)) {
            StringBuilder stringBuilder0 = a5.b.v("Dropping pending result for request ", s, ": ");
            stringBuilder0.append(linkedHashMap0.get(s));
            Log.w("ActivityResultRegistry", stringBuilder0.toString());
            linkedHashMap0.remove(s);
        }
        Bundle bundle0 = this.g;
        if(bundle0.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + ((ActivityResult)BundleCompat.getParcelable(bundle0, s, ActivityResult.class)));
            bundle0.remove(s);
        }
        LinkedHashMap linkedHashMap1 = this.c;
        d d0 = (d)linkedHashMap1.get(s);
        if(d0 != null) {
            ArrayList arrayList0 = d0.b;
            for(Object object0: arrayList0) {
                d0.a.removeObserver(((LifecycleEventObserver)object0));
            }
            arrayList0.clear();
            linkedHashMap1.remove(s);
        }
    }
}

