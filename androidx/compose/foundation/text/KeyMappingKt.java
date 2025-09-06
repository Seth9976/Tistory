package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import j0.h2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001A#\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001A\u0010\u000B\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/KeyMapping;", "a", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class KeyMappingKt {
    public static final KeyMappingKt.defaultKeyMapping.2.1 a;

    static {
        KeyMappingKt.a = new KeyMappingKt.defaultKeyMapping.2.1(KeyMappingKt.commonKeyMapping(h2.b));
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull Function1 function10) {
        return new KeyMapping() {
            public final Function1 a;

            {
                Function1 function10 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = function10;
            }

            @Override  // androidx.compose.foundation.text.KeyMapping
            @Nullable
            public KeyCommand map-ZmokQxo(@NotNull KeyEvent keyEvent0) {
                androidx.compose.ui.input.key.KeyEvent keyEvent1 = androidx.compose.ui.input.key.KeyEvent.box-impl(keyEvent0);
                Function1 function10 = this.a;
                if(((Boolean)function10.invoke(keyEvent1)).booleanValue() && KeyEvent_androidKt.isShiftPressed-ZmokQxo(keyEvent0)) {
                    return Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x3600000000L) ? KeyCommand.REDO : null;
                }
                if(((Boolean)function10.invoke(androidx.compose.ui.input.key.KeyEvent.box-impl(keyEvent0))).booleanValue()) {
                    long v = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
                    if((Key.equals-impl0(v, 0x1F00000000L) ? true : Key.equals-impl0(v, 0x7C00000000L))) {
                        return KeyCommand.COPY;
                    }
                    if(Key.equals-impl0(v, 0x3200000000L)) {
                        return KeyCommand.PASTE;
                    }
                    if(Key.equals-impl0(v, 0x3400000000L)) {
                        return KeyCommand.CUT;
                    }
                    if(Key.equals-impl0(v, 0x1D00000000L)) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if(Key.equals-impl0(v, 0x3500000000L)) {
                        return KeyCommand.REDO;
                    }
                    return Key.equals-impl0(v, 0x3600000000L) ? KeyCommand.UNDO : null;
                }
                if(!KeyEvent_androidKt.isCtrlPressed-ZmokQxo(keyEvent0)) {
                    if(KeyEvent_androidKt.isShiftPressed-ZmokQxo(keyEvent0)) {
                        long v1 = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
                        if(Key.equals-impl0(v1, 0x1500000000L)) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if(Key.equals-impl0(v1, 0x1600000000L)) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if(Key.equals-impl0(v1, 0x1300000000L)) {
                            return KeyCommand.SELECT_UP;
                        }
                        if(Key.equals-impl0(v1, 0x1400000000L)) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if(Key.equals-impl0(v1, 0x5C00000000L)) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if(Key.equals-impl0(v1, 0x5D00000000L)) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if(Key.equals-impl0(v1, 0x7A00000000L)) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if(Key.equals-impl0(v1, 0x7B00000000L)) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        return Key.equals-impl0(v1, 0x7C00000000L) ? KeyCommand.PASTE : null;
                    }
                    long v2 = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
                    if(Key.equals-impl0(v2, 0x1500000000L)) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if(Key.equals-impl0(v2, 0x1600000000L)) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if(Key.equals-impl0(v2, 0x1300000000L)) {
                        return KeyCommand.UP;
                    }
                    if(Key.equals-impl0(v2, 0x1400000000L)) {
                        return KeyCommand.DOWN;
                    }
                    if(Key.equals-impl0(v2, 0x5C00000000L)) {
                        return KeyCommand.PAGE_UP;
                    }
                    if(Key.equals-impl0(v2, 0x5D00000000L)) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if(Key.equals-impl0(v2, 0x7A00000000L)) {
                        return KeyCommand.LINE_START;
                    }
                    if(Key.equals-impl0(v2, 0x7B00000000L)) {
                        return KeyCommand.LINE_END;
                    }
                    if(Key.equals-impl0(v2, 0x4200000000L)) {
                        return KeyCommand.NEW_LINE;
                    }
                    if(Key.equals-impl0(v2, 0x4300000000L)) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if(Key.equals-impl0(v2, 0x7000000000L)) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if(Key.equals-impl0(v2, 0x11700000000L)) {
                        return KeyCommand.PASTE;
                    }
                    if(Key.equals-impl0(v2, 0x11500000000L)) {
                        return KeyCommand.CUT;
                    }
                    if(Key.equals-impl0(v2, 0x11600000000L)) {
                        return KeyCommand.COPY;
                    }
                    return Key.equals-impl0(v2, 0x3D00000000L) ? KeyCommand.TAB : null;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return KeyMappingKt.a;
    }
}

