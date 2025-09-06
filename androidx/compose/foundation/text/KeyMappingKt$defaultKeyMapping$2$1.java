package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"androidx/compose/foundation/text/KeyMappingKt$defaultKeyMapping$2$1", "Landroidx/compose/foundation/text/KeyMapping;", "map", "Landroidx/compose/foundation/text/KeyCommand;", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "map-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KeyMappingKt.defaultKeyMapping.2.1 implements KeyMapping {
    public final KeyMapping a;

    public KeyMappingKt.defaultKeyMapping.2.1(KeyMapping keyMapping0) {
        this.a = keyMapping0;
    }

    @Override  // androidx.compose.foundation.text.KeyMapping
    @Nullable
    public KeyCommand map-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        KeyCommand keyCommand0 = null;
        if(KeyEvent_androidKt.isShiftPressed-ZmokQxo(keyEvent0) && KeyEvent_androidKt.isCtrlPressed-ZmokQxo(keyEvent0)) {
            long v = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
            if(Key.equals-impl0(v, 0x1500000000L)) {
                return KeyCommand.SELECT_LEFT_WORD == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.SELECT_LEFT_WORD;
            }
            if(Key.equals-impl0(v, 0x1600000000L)) {
                return KeyCommand.SELECT_RIGHT_WORD == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.SELECT_RIGHT_WORD;
            }
            if(Key.equals-impl0(v, 0x1300000000L)) {
                return KeyCommand.SELECT_PREV_PARAGRAPH == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.SELECT_PREV_PARAGRAPH;
            }
            if(Key.equals-impl0(v, 0x1400000000L)) {
                return KeyCommand.SELECT_NEXT_PARAGRAPH == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.SELECT_NEXT_PARAGRAPH;
            }
        }
        else if(KeyEvent_androidKt.isCtrlPressed-ZmokQxo(keyEvent0)) {
            long v1 = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
            if(Key.equals-impl0(v1, 0x1500000000L)) {
                return KeyCommand.LEFT_WORD == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.LEFT_WORD;
            }
            if(Key.equals-impl0(v1, 0x1600000000L)) {
                return KeyCommand.RIGHT_WORD == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.RIGHT_WORD;
            }
            if(Key.equals-impl0(v1, 0x1300000000L)) {
                return KeyCommand.PREV_PARAGRAPH == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.PREV_PARAGRAPH;
            }
            if(Key.equals-impl0(v1, 0x1400000000L)) {
                return KeyCommand.NEXT_PARAGRAPH == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.NEXT_PARAGRAPH;
            }
            if(Key.equals-impl0(v1, 0x2400000000L)) {
                return KeyCommand.DELETE_PREV_CHAR == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.DELETE_PREV_CHAR;
            }
            if(Key.equals-impl0(v1, 0x7000000000L)) {
                return KeyCommand.DELETE_NEXT_WORD == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.DELETE_NEXT_WORD;
            }
            if(Key.equals-impl0(v1, 0x4300000000L)) {
                return KeyCommand.DELETE_PREV_WORD == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.DELETE_PREV_WORD;
            }
            if(Key.equals-impl0(v1, 0x4900000000L)) {
                return KeyCommand.DESELECT == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.DESELECT;
            }
        }
        else if(KeyEvent_androidKt.isShiftPressed-ZmokQxo(keyEvent0)) {
            long v2 = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
            if(Key.equals-impl0(v2, 0x7A00000000L)) {
                return KeyCommand.SELECT_LINE_LEFT == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.SELECT_LINE_LEFT;
            }
            if(Key.equals-impl0(v2, 0x7B00000000L)) {
                return KeyCommand.SELECT_LINE_RIGHT == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.SELECT_LINE_RIGHT;
            }
        }
        else if(KeyEvent_androidKt.isAltPressed-ZmokQxo(keyEvent0)) {
            long v3 = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
            if(Key.equals-impl0(v3, 0x4300000000L)) {
                return KeyCommand.DELETE_FROM_LINE_START == null ? this.a.map-ZmokQxo(keyEvent0) : KeyCommand.DELETE_FROM_LINE_START;
            }
            if(Key.equals-impl0(v3, 0x7000000000L)) {
                keyCommand0 = KeyCommand.DELETE_TO_LINE_END;
            }
        }
        return keyCommand0 == null ? this.a.map-ZmokQxo(keyEvent0) : keyCommand0;
    }
}

