package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.CursorAnchorInfoController;
import androidx.compose.foundation.text.input.internal.InputMethodManager;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.d1;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Final;
import androidx.lifecycle.LiveDataScope;
import androidx.paging.CachedPageEventFlow;
import androidx.paging.CombinedLoadStates;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.m;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;
import s4.l;

public final class d0 implements FlowCollector {
    public final int a;
    public final Object b;

    public d0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    public Object a(IndexedValue indexedValue0, Continuation continuation0) {
        d0 d00;
        l l0;
        if(continuation0 instanceof l) {
            l0 = (l)continuation0;
            int v = l0.s;
            if((v & 0x80000000) == 0) {
                l0 = new l(this, continuation0);
            }
            else {
                l0.s = v ^ 0x80000000;
            }
        }
        else {
            l0 = new l(this, continuation0);
        }
        Object object0 = l0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                MutableSharedFlow mutableSharedFlow0 = ((CachedPageEventFlow)this.b).b;
                l0.o = this;
                l0.p = indexedValue0;
                l0.s = 1;
                if(mutableSharedFlow0.emit(indexedValue0, l0) == object1) {
                    return object1;
                }
                d00 = this;
                break;
            }
            case 1: {
                indexedValue0 = l0.p;
                d00 = l0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        m m0 = ((CachedPageEventFlow)d00.b).a;
        l0.o = null;
        l0.p = null;
        l0.s = 2;
        return m0.b(indexedValue0, l0) == object1 ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        boolean z = true;
        switch(this.a) {
            case 0: {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(((Activity)this.b), ((Rect)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                MutableIntState mutableIntState0 = (MutableIntState)this.b;
                if((((Interaction)object0) instanceof Press ? true : ((Interaction)object0) instanceof Focus)) {
                    mutableIntState0.setIntValue(mutableIntState0.getIntValue() + 1);
                    return Unit.INSTANCE;
                }
                if(!(((Interaction)object0) instanceof Release ? true : ((Interaction)object0) instanceof Unfocus)) {
                    z = ((Interaction)object0) instanceof Cancel;
                }
                if(z) {
                    mutableIntState0.setIntValue(mutableIntState0.getIntValue() - 1);
                }
                return Unit.INSTANCE;
            }
            case 2: {
                ((Function1)((State)this.b).getValue()).invoke(Boxing.boxBoolean(((Boolean)object0).booleanValue()));
                return Unit.INSTANCE;
            }
            case 3: {
                ((d1)this.b).a.setFloatValue(((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 4: {
                Unit unit0 = ((LiveDataScope)this.b).emit(object0, continuation0);
                return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
            }
            case 5: {
                ((Function1)this.b).invoke(Boxing.boxBoolean(((Boolean)object0).booleanValue()));
                return Unit.INSTANCE;
            }
            case 6: {
                Unit unit1 = (Unit)object0;
                ((InputMethodManager)this.b).startStylusHandwriting();
                return Unit.INSTANCE;
            }
            case 7: {
                Unit unit2 = (Unit)object0;
                ((ComposeInputMethodManager)this.b).startStylusHandwriting();
                return Unit.INSTANCE;
            }
            case 8: {
                ((CursorAnchorInfoController)this.b).c.updateCursorAnchorInfo(((CursorAnchorInfo)object0));
                return Unit.INSTANCE;
            }
            case 9: {
                TextFieldCharSequence textFieldCharSequence0 = (TextFieldCharSequence)object0;
                TextFieldSelectionState.access$setShowCursorHandle(((TextFieldSelectionState)this.b), false);
                ((TextFieldSelectionState)this.b).updateTextToolbarState(TextToolbarState.None);
                return Unit.INSTANCE;
            }
            case 10: {
                return this.a(((IndexedValue)object0), continuation0);
            }
            case 11: {
                ((Channel)this.b).trySend-JP2dKIU(((Unit)object0));
                return Unit.INSTANCE;
            }
            case 12: {
                LazyPagingItems.access$setLoadState(((LazyPagingItems)this.b), ((CombinedLoadStates)object0));
                return Unit.INSTANCE;
            }
            case 13: {
                Unit unit3 = (Unit)object0;
                DataStoreImpl dataStoreImpl0 = (DataStoreImpl)this.b;
                if(!(dataStoreImpl0.g.getCurrentState() instanceof Final)) {
                    Unit unit4 = DataStoreImpl.access$readDataAndUpdateCache(dataStoreImpl0, true, continuation0);
                    return unit4 == a.getCOROUTINE_SUSPENDED() ? unit4 : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            default: {
                ((Collection)this.b).add(object0);
                return Unit.INSTANCE;
            }
        }
    }
}

