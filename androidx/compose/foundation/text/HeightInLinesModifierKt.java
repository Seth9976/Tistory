package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import j0.e2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001A\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0000\u001A(\u0010\u0006\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\u0004\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u0001H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000B\u001A\u00020\fX\u008A\u0084\u0002"}, d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:136\n*E\n"})
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier heightInLines(@NotNull Modifier modifier0, @NotNull TextStyle textStyle0, int v, int v1) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new e2(v, v1, textStyle0));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,178:1\n54#2,5:179\n*E\n"})
        public final class androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final int w;
            public final int x;
            public final TextStyle y;

            public androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines..inlined.debugInspectorInfo.1(int v, int v1, TextStyle textStyle0) {
                this.w = v;
                this.x = v1;
                this.y = textStyle0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("heightInLines");
                inspectorInfo0.getProperties().set("minLines", this.w);
                inspectorInfo0.getProperties().set("maxLines", this.x);
                inspectorInfo0.getProperties().set("textStyle", this.y);
            }
        }

    }

    public static Modifier heightInLines$default(Modifier modifier0, TextStyle textStyle0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 1;
        }
        if((v2 & 4) != 0) {
            v1 = 0x7FFFFFFF;
        }
        return HeightInLinesModifierKt.heightInLines(modifier0, textStyle0, v, v1);
    }

    public static final void validateMinMaxLines(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException(("both minLines " + v + " and maxLines " + v1 + " must be greater than zero").toString());
        }
        if(v > v1) {
            throw new IllegalArgumentException(("minLines " + v + " must be less than or equal to maxLines " + v1).toString());
        }
    }
}

