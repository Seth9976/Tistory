package androidx.activity.compose;

import aa.r;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.a;
import j.c;
import j.f;
import j.g;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001AZ\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032A\u0010\u0004\u001A=\b\u0001\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u000F\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005H\u0007¢\u0006\u0002\u0010\u000E¨\u0006\u000F²\u0006E\u0010\u0010\u001A=\b\u0001\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u000F\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005X\u008A\u0084\u0002"}, d2 = {"PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "progress", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release", "currentOnBack"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,172:1\n473#2,4:173\n477#2,2:181\n481#2:187\n25#3:177\n955#4,3:178\n958#4,3:184\n955#4,6:188\n955#4,6:194\n955#4,6:201\n473#5:183\n76#6:200\n89#7:207\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:173,4\n79#1:181,2\n79#1:187\n79#1:177\n79#1:178,3\n79#1:184,3\n81#1:188,6\n127#1:194,6\n137#1:201,6\n79#1:183\n135#1:200\n78#1:207\n*E\n"})
public final class PredictiveBackHandlerKt {
    @Composable
    public static final void PredictiveBackHandler(boolean z, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-642000585);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(function20) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        else {
            z1 = (v1 & 1) == 0 ? z : true;
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v2 >> 3 & 14);
            composer1.startReplaceableGroup(0xD4DFE628);
            composer1.startReplaceableGroup(0xFFC7BCB7);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            composer1.endReplaceableGroup();
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xC02100EA);
            androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.backCallBack.1.1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10 = composer1.rememberedValue();
            if(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10 == composer$Companion0.getEmpty()) {
                predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10 = new OnBackPressedCallback(z1) {
                    public f a;

                    @Nullable
                    public final f getOnBackInstance() {
                        return this.a;
                    }

                    @Override  // androidx.activity.OnBackPressedCallback
                    public void handleOnBackCancelled() {
                        super.handleOnBackCancelled();
                        f f0 = this.a;
                        if(f0 != null) {
                            f0.a();
                        }
                    }

                    @Override  // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        f f0 = this.a;
                        if(f0 != null && !f0.a) {
                            f0.a();
                            this.a = null;
                        }
                        if(this.a == null) {
                            Function2 function20 = PredictiveBackHandlerKt.access$PredictiveBackHandler$lambda$0(state0);
                            this.a = new f(coroutineScope0, false, function20);
                        }
                        f f1 = this.a;
                        if(f1 != null) {
                            DefaultImpls.close$default(f1.b, null, 1, null);
                        }
                    }

                    @Override  // androidx.activity.OnBackPressedCallback
                    public void handleOnBackProgressed(@NotNull BackEventCompat backEventCompat0) {
                        super.handleOnBackProgressed(backEventCompat0);
                        f f0 = this.a;
                        if(f0 != null) {
                            ChannelResult.box-impl(f0.b.trySend-JP2dKIU(backEventCompat0));
                        }
                    }

                    @Override  // androidx.activity.OnBackPressedCallback
                    public void handleOnBackStarted(@NotNull BackEventCompat backEventCompat0) {
                        super.handleOnBackStarted(backEventCompat0);
                        f f0 = this.a;
                        if(f0 != null) {
                            f0.a();
                        }
                        Function2 function20 = PredictiveBackHandlerKt.access$PredictiveBackHandler$lambda$0(state0);
                        this.a = new f(coroutineScope0, true, function20);
                    }

                    public final void setOnBackInstance(@Nullable f f0) {
                        this.a = f0;
                    }
                };
                composer1.updateRememberedValue(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10);
            }
            composer1.endReplaceableGroup();
            Boolean boolean0 = Boolean.valueOf(z1);
            composer1.startReplaceableGroup(0xC02108AA);
            boolean z2 = composer1.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10);
            boolean z3 = composer1.changed(z1);
            g g0 = composer1.rememberedValue();
            if(z2 || z3 || g0 == composer$Companion0.getEmpty()) {
                g0 = new g(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10, z1, null);
                composer1.updateRememberedValue(g0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolean0, g0, composer1, v2 & 14);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composer1, 6);
            if(onBackPressedDispatcherOwner0 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            OnBackPressedDispatcher onBackPressedDispatcher0 = onBackPressedDispatcherOwner0.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner0 = (LifecycleOwner)composer1.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composer1.startReplaceableGroup(0xC0210A1E);
            boolean z4 = composer1.changed(onBackPressedDispatcher0);
            boolean z5 = composer1.changed(lifecycleOwner0);
            boolean z6 = composer1.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10);
            r r0 = composer1.rememberedValue();
            if((z4 | z5 | z6) != 0 || r0 == composer$Companion0.getEmpty()) {
                r0 = new r(onBackPressedDispatcher0, lifecycleOwner0, 11, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner0, onBackPressedDispatcher0, r0, composer1, 0);
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(z1, function20, v, v1, 1));
        }
    }

    public static final Function2 access$PredictiveBackHandler$lambda$0(State state0) {
        return (Function2)state0.getValue();
    }
}

