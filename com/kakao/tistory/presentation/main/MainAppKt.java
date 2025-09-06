package com.kakao.tistory.presentation.main;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.main.contract.MainUiState;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\u000F²\u0006\f\u0010\r\u001A\u00020\f8\nX\u008A\u0084\u0002²\u0006\f\u0010\u000E\u001A\u00020\u00068\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/main/MainAppViewModel;", "mainAppViewModel", "", "MainApp", "(Lcom/kakao/tistory/presentation/main/MainAppViewModel;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOnlineState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalOnlineState", "Lcom/kakao/tistory/presentation/main/contract/MainUiState;", "uiState", "isOnline", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainApp.kt\ncom/kakao/tistory/presentation/main/MainAppKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,183:1\n46#2,7:184\n86#3,6:191\n1223#4,6:197\n1223#4,6:204\n1223#4,6:210\n77#5:203\n77#5:216\n81#6:217\n81#6:218\n*S KotlinDebug\n*F\n+ 1 MainApp.kt\ncom/kakao/tistory/presentation/main/MainAppKt\n*L\n44#1:184,7\n44#1:191,6\n48#1:197,6\n154#1:204,6\n159#1:210,6\n113#1:203\n170#1:216\n46#1:217\n50#1:218\n*E\n"})
public final class MainAppKt {
    public static final ProvidableCompositionLocal a;

    static {
        MainAppKt.a = CompositionLocalKt.compositionLocalOf$default(null, i.a, 1, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MainApp(@Nullable MainAppViewModel mainAppViewModel0, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(-165323061);
        int v2 = (v1 & 1) == 0 ? v : v | 2;
        if((v1 & 1) != 1 || (v2 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v2 &= -15;
                }
            }
            else if((v1 & 1) != 0) {
                composer1.startReplaceableGroup(0x70B323C8);
                ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, LocalViewModelStoreOwner.$stable);
                if(viewModelStoreOwner0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner0, composer1, 0);
                composer1.startReplaceableGroup(0x671A9C9B);
                CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                ViewModel viewModel0 = ViewModelKt.viewModel(MainAppViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
                mainAppViewModel0 = (MainAppViewModel)viewModel0;
                v2 &= -15;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-165323061, v2, -1, "com.kakao.tistory.presentation.main.MainApp (MainApp.kt:44)");
            }
            State state0 = SnapshotStateKt.collectAsState(mainAppViewModel0.getUiState(), null, composer1, 8, 1);
            MainAppState mainAppState0 = MainAppStateKt.rememberMainAppState(null, null, composer1, 0, 3);
            composer1.startReplaceGroup(0x10B41D01);
            SnackbarHostState snackbarHostState0 = composer1.rememberedValue();
            if(snackbarHostState0 == Composer.Companion.getEmpty()) {
                snackbarHostState0 = new SnackbarHostState();
                composer1.updateRememberedValue(snackbarHostState0);
            }
            composer1.endReplaceGroup();
            State state1 = LiveDataAdapterKt.observeAsState(mainAppState0.getNetworkChecker(), Boolean.TRUE, composer1, 56);
            Boolean boolean0 = (Boolean)state1.getValue();
            boolean0.getClass();
            CompositionLocalKt.CompositionLocalProvider(MainAppKt.a.provides(boolean0), ComposableLambdaKt.rememberComposableLambda(-1638313077, true, new q(mainAppViewModel0, mainAppState0, snackbarHostState0, state0, state1), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(mainAppViewModel0, v, v1));
        }
    }

    public static final void access$BackPressedHandler(MainDestination mainDestination0, MainUiState mainUiState0, SnackbarHostState snackbarHostState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-412432069);
        int v1 = (v & 14) == 0 ? (composer1.changed(mainDestination0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(mainUiState0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(snackbarHostState0) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412432069, v1, -1, "com.kakao.tistory.presentation.main.BackPressedHandler (MainApp.kt:152)");
            }
            int v2 = 1;
            boolean z = mainDestination0 == MainDestination.HOME;
            composer1.startReplaceGroup(0x539F923);
            c c0 = composer1.rememberedValue();
            if((v1 & 0x70) == 0x20 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(mainUiState0);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            BackHandlerKt.BackHandler(z, c0, composer1, 0, 0);
            String s = StringResources_androidKt.stringResource(string.label_toast_finish_tistory, composer1, 0);
            Boolean boolean0 = Boolean.valueOf(mainUiState0.getShowBackPressedSnackBar());
            composer1.startReplaceGroup(87690930);
            if((v1 & 0x380) != 0x100) {
                v2 = 0;
            }
            boolean z1 = composer1.changed(s);
            d d0 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | v2 | z1) != 0 || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(mainUiState0, snackbarHostState0, s, null);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, d0, composer1, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(mainDestination0, mainUiState0, snackbarHostState0, v));
        }
    }

    public static final void access$ConsumeEvent(MainAppViewModel mainAppViewModel0, MainAppState mainAppState0, SnackbarHostState snackbarHostState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-202667200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202667200, v, -1, "com.kakao.tistory.presentation.main.ConsumeEvent (MainApp.kt:111)");
        }
        EffectsKt.LaunchedEffect(mainAppViewModel0.getEvent(), new g(mainAppViewModel0, mainAppState0, ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null), composer1, 72);
        TistoryComposeDialogKt.DialogHandler(mainAppState0.getDialogEvent(), ComposableSingletons.MainAppKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 56);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(mainAppViewModel0, mainAppState0, snackbarHostState0, v));
        }
    }

    public static final MainUiState access$MainApp$lambda$0(State state0) {
        return (MainUiState)state0.getValue();
    }

    public static final boolean access$MainApp$lambda$2(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final void access$NewIntentHandler(MainUiState mainUiState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1310155645);
        int v1 = (v & 14) == 0 ? (composer1.changed(mainUiState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1310155645, v1, -1, "com.kakao.tistory.presentation.main.NewIntentHandler (MainApp.kt:168)");
            }
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComponentActivity componentActivity0 = context0 instanceof ComponentActivity ? ((ComponentActivity)context0) : null;
            EffectsKt.DisposableEffect(componentActivity0, new t(componentActivity0, mainUiState0), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(mainUiState0, v));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalOnlineState() {
        return MainAppKt.a;
    }
}

