package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A.\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"modifierLocalProvider", "Landroidx/compose/ui/Modifier;", "T", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "Lkotlin/Function0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,70:1\n135#2:71\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:71\n*E\n"})
public final class ModifierLocalProviderKt {
    // 去混淆评级： 低(30)
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier modifierLocalProvider(@NotNull Modifier modifier0, @NotNull ProvidableModifierLocal providableModifierLocal0, @NotNull Function0 function00) {
        return modifier0.then(new ModifierLocalProvider(InspectableValueKt.getNoInspectorInfo()) {
            public final ProvidableModifierLocal c;
            public final State d;

            {
                ProvidableModifierLocal providableModifierLocal0 = providableModifierLocal0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function0 function00 = function00;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = InspectableValueKt.getNoInspectorInfo();  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.c = providableModifierLocal0;
                this.d = SnapshotStateKt.derivedStateOf(function00);
            }

            @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
            @NotNull
            public ProvidableModifierLocal getKey() {
                return this.c;
            }

            @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
            public Object getValue() {
                return this.d.getValue();
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n1#1,178:1\n60#2,4:179\n*E\n"})
        public final class androidx.compose.ui.modifier.ModifierLocalProviderKt.modifierLocalProvider..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final ProvidableModifierLocal w;
            public final Function0 x;

            public androidx.compose.ui.modifier.ModifierLocalProviderKt.modifierLocalProvider..inlined.debugInspectorInfo.1(ProvidableModifierLocal providableModifierLocal0, Function0 function00) {
                this.w = providableModifierLocal0;
                this.x = function00;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("modifierLocalProvider");
                inspectorInfo0.getProperties().set("key", this.w);
                inspectorInfo0.getProperties().set("value", this.x);
            }
        }

    }
}

