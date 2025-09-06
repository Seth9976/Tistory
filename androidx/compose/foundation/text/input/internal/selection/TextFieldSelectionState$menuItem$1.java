package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n*L\n1#1,1542:1\n*E\n"})
public final class TextFieldSelectionState.menuItem.1 extends Lambda implements Function0 {
    public final Function0 w;
    public final TextFieldSelectionState x;
    public final TextToolbarState y;

    public TextFieldSelectionState.menuItem.1(Function0 function00, TextFieldSelectionState textFieldSelectionState0, TextToolbarState textToolbarState0) {
        this.w = function00;
        this.x = textFieldSelectionState0;
        this.y = textToolbarState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        this.w.invoke();
        this.x.updateTextToolbarState(this.y);
    }
}

