package androidx.lifecycle;

import android.util.LongSparseArray;
import androidx.compose.runtime.MutableState;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.livedata.ChangedEntryLiveData;
import com.kakao.tistory.presentation.view.blog.BlogFollowingFragment;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;
import com.kakao.tistory.presentation.view.editor.EditorSettingFragment;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity;
import com.kakao.tistory.presentation.view.home.RefererLogListActivity;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import kotlinx.coroutines.channels.ProducerScope;

public final class q implements Observer {
    public final int a;
    public final Object b;

    public q(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        switch(this.a) {
            case 0: {
                ((ProducerScope)this.b).trySend-JP2dKIU(object0);
                return;
            }
            case 1: {
                ChangedEntryLiveData.a(((ChangedEntryLiveData)this.b), ((LongSparseArray)object0));
                return;
            }
            case 2: {
                ((MutableState)this.b).setValue(object0);
                return;
            }
            case 3: {
                BlogFollowingFragment.a(((BlogFollowingFragment)this.b), ((Long)object0));
                return;
            }
            case 4: {
                ReportDialogFragment.a(((ReportDialogFragment)this.b), ((Boolean)object0));
                return;
            }
            case 5: {
                EntryPasswordDialogFragment.a(((EntryPasswordDialogFragment)this.b), ((Boolean)object0));
                return;
            }
            case 6: {
                EditorSettingFragment.a(((EditorSettingFragment)this.b), ((Boolean)object0));
                return;
            }
            case 7: {
                EntryViewActivity.a(((EntryViewModel)this.b), ((LongSparseArray)object0));
                return;
            }
            case 8: {
                EntryViewActivity.a(((EntryViewActivity)this.b), ((Event)object0));
                return;
            }
            default: {
                RefererLogListActivity.a(((RefererLogListActivity)this.b), ((SortItem)object0));
            }
        }
    }
}

