package androidx.compose.ui.platform;

import aa.d;
import aa.o;
import aa.q;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A*\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0011\u0010\u0005\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000F0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000B\u001A\u0004\b\u0011\u0010\r\" \u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00130\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000B\u001A\u0004\b\u0015\u0010\r\" \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00170\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000B\u001A\u0004\b\u0019\u0010\r\"\u001D\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001B0\b8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u000B\u001A\u0004\b\u001D\u0010\r\"\u001D\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u001F0\b8\u0006¢\u0006\f\n\u0004\b \u0010\u000B\u001A\u0004\b!\u0010\r\" \u0010\'\u001A\b\u0012\u0004\u0012\u00020#0\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001A\u0004\b$\u0010\r¨\u0006)²\u0006\u000E\u0010(\u001A\u00020\t8\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideAndroidCompositionLocals", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/res/Configuration;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalConfiguration", "Landroid/content/Context;", "b", "getLocalContext", "LocalContext", "Landroidx/compose/ui/res/ImageVectorCache;", "c", "getLocalImageVectorCache", "LocalImageVectorCache", "Landroidx/compose/ui/res/ResourceIdCache;", "d", "getLocalResourceIdCache", "LocalResourceIdCache", "Landroidx/savedstate/SavedStateRegistryOwner;", "e", "getLocalSavedStateRegistryOwner", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "f", "getLocalView", "LocalView", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "configuration", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,207:1\n1223#2,6:208\n1223#2,6:214\n1223#2,6:220\n1223#2,6:226\n1223#2,6:232\n1223#2,6:239\n1223#2,6:245\n1223#2,6:251\n1223#2,6:257\n1223#2,3:263\n1226#2,3:267\n1223#2,6:270\n1223#2,6:276\n77#3:238\n1#4:266\n81#5:282\n107#5,2:283\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n97#1:208,6\n101#1:214,6\n103#1:220,6\n108#1:226,6\n111#1:232,6\n143#1:239,6\n144#1:245,6\n159#1:251,6\n174#1:257,6\n175#1:263,3\n175#1:267,3\n178#1:270,6\n195#1:276,6\n120#1:238\n97#1:282\n97#1:283,2\n*E\n"})
public final class AndroidCompositionLocals_androidKt {
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;
    public static final ProvidableCompositionLocal c;
    public static final ProvidableCompositionLocal d;
    public static final ProvidableCompositionLocal e;
    public static final ProvidableCompositionLocal f;

    static {
        AndroidCompositionLocals_androidKt.a = CompositionLocalKt.compositionLocalOf$default(null, y.A, 1, null);
        AndroidCompositionLocals_androidKt.b = CompositionLocalKt.staticCompositionLocalOf(y.B);
        AndroidCompositionLocals_androidKt.c = CompositionLocalKt.staticCompositionLocalOf(y.C);
        AndroidCompositionLocals_androidKt.d = CompositionLocalKt.staticCompositionLocalOf(y.D);
        AndroidCompositionLocals_androidKt.e = CompositionLocalKt.staticCompositionLocalOf(y.E);
        AndroidCompositionLocals_androidKt.f = CompositionLocalKt.staticCompositionLocalOf(y.F);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideAndroidCompositionLocals(@NotNull AndroidComposeView androidComposeView0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1396852028);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(androidComposeView0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
        }
        else {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1396852028, v1, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context0 = androidComposeView0.getContext();
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(new Configuration(context0.getResources().getConfiguration()), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            q q0 = composer1.rememberedValue();
            if(q0 == composer$Companion0.getEmpty()) {
                q0 = new q(mutableState0, 6);
                composer1.updateRememberedValue(q0);
            }
            androidComposeView0.setConfigurationChangeObserver(q0);
            AndroidUriHandler androidUriHandler0 = composer1.rememberedValue();
            if(androidUriHandler0 == composer$Companion0.getEmpty()) {
                androidUriHandler0 = new AndroidUriHandler(context0);
                composer1.updateRememberedValue(androidUriHandler0);
            }
            ViewTreeOwners androidComposeView$ViewTreeOwners0 = androidComposeView0.getViewTreeOwners();
            if(androidComposeView$ViewTreeOwners0 == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry0 = composer1.rememberedValue();
            if(disposableSaveableStateRegistry0 == composer$Companion0.getEmpty()) {
                disposableSaveableStateRegistry0 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView0, androidComposeView$ViewTreeOwners0.getSavedStateRegistryOwner());
                composer1.updateRememberedValue(disposableSaveableStateRegistry0);
            }
            Unit unit0 = Unit.INSTANCE;
            boolean z = composer1.changedInstance(disposableSaveableStateRegistry0);
            g1 g10 = composer1.rememberedValue();
            if(z || g10 == composer$Companion0.getEmpty()) {
                g10 = new g1(disposableSaveableStateRegistry0, 7);
                composer1.updateRememberedValue(g10);
            }
            EffectsKt.DisposableEffect(unit0, g10, composer1, 6);
            Configuration configuration0 = (Configuration)mutableState0.getValue();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE309A0BA, 0, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
            }
            ImageVectorCache imageVectorCache0 = composer1.rememberedValue();
            if(imageVectorCache0 == composer$Companion0.getEmpty()) {
                imageVectorCache0 = new ImageVectorCache();
                composer1.updateRememberedValue(imageVectorCache0);
            }
            Configuration configuration1 = composer1.rememberedValue();
            if(configuration1 == composer$Companion0.getEmpty()) {
                configuration1 = new Configuration();
                if(configuration0 != null) {
                    configuration1.setTo(configuration0);
                }
                composer1.updateRememberedValue(configuration1);
            }
            AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10 = composer1.rememberedValue();
            if(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10 == composer$Companion0.getEmpty()) {
                androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10 = new AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1(configuration1, imageVectorCache0);
                composer1.updateRememberedValue(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10);
            }
            boolean z1 = composer1.changedInstance(context0);
            o o0 = composer1.rememberedValue();
            if(z1 || o0 == composer$Companion0.getEmpty()) {
                o0 = new o(10, context0, androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10);
                composer1.updateRememberedValue(o0);
            }
            EffectsKt.DisposableEffect(imageVectorCache0, o0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAF9F6992, 0, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
            }
            ResourceIdCache resourceIdCache0 = composer1.rememberedValue();
            if(resourceIdCache0 == composer$Companion0.getEmpty()) {
                resourceIdCache0 = new ResourceIdCache();
                composer1.updateRememberedValue(resourceIdCache0);
            }
            AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10 = composer1.rememberedValue();
            if(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10 == composer$Companion0.getEmpty()) {
                androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10 = new AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1(resourceIdCache0);
                composer1.updateRememberedValue(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10);
            }
            boolean z2 = composer1.changedInstance(context0);
            o o1 = composer1.rememberedValue();
            if(z2 || o1 == composer$Companion0.getEmpty()) {
                o1 = new o(11, context0, androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10);
                composer1.updateRememberedValue(o1);
            }
            EffectsKt.DisposableEffect(resourceIdCache0, o1, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z3 = ((Boolean)composer1.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue();
            boolean z4 = androidComposeView0.getScrollCaptureInProgress$ui_release();
            Configuration configuration2 = (Configuration)mutableState0.getValue();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AndroidCompositionLocals_androidKt.a.provides(configuration2), AndroidCompositionLocals_androidKt.b.provides(context0), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(androidComposeView$ViewTreeOwners0.getLifecycleOwner()), AndroidCompositionLocals_androidKt.e.provides(androidComposeView$ViewTreeOwners0.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry0), AndroidCompositionLocals_androidKt.f.provides(androidComposeView0), AndroidCompositionLocals_androidKt.c.provides(imageVectorCache0), AndroidCompositionLocals_androidKt.d.provides(resourceIdCache0), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(((boolean)(z3 | z4))))}, ComposableLambdaKt.rememberComposableLambda(0x57B729FC, true, new androidx.compose.foundation.text.selection.y(androidComposeView0, androidUriHandler0, 1, function20), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(androidComposeView0, function20, v, 4));
        }
    }

    public static final void access$ProvideAndroidCompositionLocals$lambda$2(MutableState mutableState0, Configuration configuration0) {
        mutableState0.setValue(configuration0);
    }

    public static final Void access$noLocalProvidedFor(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalConfiguration() {
        return AndroidCompositionLocals_androidKt.a;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalContext() {
        return AndroidCompositionLocals_androidKt.b;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalImageVectorCache() {
        return AndroidCompositionLocals_androidKt.c;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.getLocalLifecycleOwner();
    }

    @Deprecated(message = "Moved to lifecycle-runtime-compose library in androidx.lifecycle.compose package.", replaceWith = @ReplaceWith(expression = "androidx.lifecycle.compose.LocalLifecycleOwner", imports = {}))
    public static void getLocalLifecycleOwner$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalResourceIdCache() {
        return AndroidCompositionLocals_androidKt.d;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalSavedStateRegistryOwner() {
        return AndroidCompositionLocals_androidKt.e;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalView() {
        return AndroidCompositionLocals_androidKt.f;
    }
}

