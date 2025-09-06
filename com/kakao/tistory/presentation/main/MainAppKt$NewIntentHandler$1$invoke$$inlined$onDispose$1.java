package com.kakao.tistory.presentation.main;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MainApp.kt\ncom/kakao/tistory/presentation/main/MainAppKt$NewIntentHandler$1\n*L\n1#1,497:1\n180#2,2:498\n*E\n"})
public final class MainAppKt.NewIntentHandler.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final ComponentActivity a;
    public final Function1 b;

    public MainAppKt.NewIntentHandler.1.invoke..inlined.onDispose.1(ComponentActivity componentActivity0, Function1 function10) {
        this.a = componentActivity0;
        this.b = function10;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        ComponentActivity componentActivity0 = this.a;
        if(componentActivity0 != null) {
            componentActivity0.removeOnNewIntentListener(new v(this.b));
        }
    }
}

