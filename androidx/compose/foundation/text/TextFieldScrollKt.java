package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import j0.g2;
import j0.h3;
import j0.r3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A1\u0010\u0007\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A;\u0010\u0010\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "textFieldScrollable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textLayoutResultProvider", "textFieldScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,371:1\n135#2:372\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n61#1:372\n*E\n"})
public final class TextFieldScrollKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Vertical.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Horizontal.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Rect access$getCursorRectInScroller(Density density0, int v, TransformedText transformedText0, TextLayoutResult textLayoutResult0, boolean z, int v1) {
        Rect rect0;
        if(textLayoutResult0 == null) {
            rect0 = Rect.Companion.getZero();
        }
        else {
            rect0 = textLayoutResult0.getCursorRect(transformedText0.getOffsetMapping().originalToTransformed(v));
            if(rect0 == null) {
                rect0 = Rect.Companion.getZero();
            }
        }
        int v2 = density0.roundToPx-0680j_4(0.0f);
        float f = z ? ((float)v1) - rect0.getLeft() - ((float)v2) : rect0.getLeft();
        return z ? Rect.copy$default(rect0, f, 0.0f, ((float)v1) - rect0.getLeft(), 0.0f, 10, null) : Rect.copy$default(rect0, f, 0.0f, rect0.getLeft() + ((float)v2), 0.0f, 10, null);
    }

    @NotNull
    public static final Modifier textFieldScroll(@NotNull Modifier modifier0, @NotNull TextFieldScrollerPosition textFieldScrollerPosition0, @NotNull TextFieldValue textFieldValue0, @NotNull VisualTransformation visualTransformation0, @NotNull Function0 function00) {
        r3 r30;
        Orientation orientation0 = textFieldScrollerPosition0.getOrientation();
        int v = textFieldScrollerPosition0.getOffsetToFollow-5zc-tL8(textFieldValue0.getSelection-d9O1mEE());
        textFieldScrollerPosition0.setPreviousSelection-5zc-tL8(textFieldValue0.getSelection-d9O1mEE());
        TransformedText transformedText0 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation0, textFieldValue0.getAnnotatedString());
        switch(orientation0) {
            case 1: {
                r30 = new r3(textFieldScrollerPosition0, v, transformedText0, function00);
                return ClipKt.clipToBounds(modifier0).then(r30);
            }
            case 2: {
                r30 = new g2(textFieldScrollerPosition0, v, transformedText0, function00);
                return ClipKt.clipToBounds(modifier0).then(r30);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier textFieldScrollable(@NotNull Modifier modifier0, @NotNull TextFieldScrollerPosition textFieldScrollerPosition0, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new h3(textFieldScrollerPosition0, mutableInteractionSource0, z));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n1#1,178:1\n62#2,5:179\n*E\n"})
        public final class androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final TextFieldScrollerPosition w;
            public final MutableInteractionSource x;
            public final boolean y;

            public androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable..inlined.debugInspectorInfo.1(TextFieldScrollerPosition textFieldScrollerPosition0, MutableInteractionSource mutableInteractionSource0, boolean z) {
                this.w = textFieldScrollerPosition0;
                this.x = mutableInteractionSource0;
                this.y = z;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("textFieldScrollable");
                inspectorInfo0.getProperties().set("scrollerPosition", this.w);
                inspectorInfo0.getProperties().set("interactionSource", this.x);
                inspectorInfo0.getProperties().set("enabled", Boolean.valueOf(this.y));
            }
        }

    }

    public static Modifier textFieldScrollable$default(Modifier modifier0, TextFieldScrollerPosition textFieldScrollerPosition0, MutableInteractionSource mutableInteractionSource0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            mutableInteractionSource0 = null;
        }
        if((v & 4) != 0) {
            z = true;
        }
        return TextFieldScrollKt.textFieldScrollable(modifier0, textFieldScrollerPosition0, mutableInteractionSource0, z);
    }
}

