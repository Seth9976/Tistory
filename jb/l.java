package jb;

import androidx.lifecycle.Observer;
import com.futuremind.fastscroll.FastScroller;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPickerBinding;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.folder.FolderAdapter;
import com.kakao.kphotopicker.picker.selected.SelectedItemAdapter;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class l implements Observer {
    public final int a;
    public final PickerFragment b;

    public l(PickerFragment pickerFragment0, int v) {
        this.a = v;
        this.b = pickerFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        switch(this.a) {
            case 0: {
                Void void0 = (Void)object0;
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                ((SelectedItemAdapter)this.b.D.getValue()).notifyDataSetChanged();
                this.b.h().notifyDataSetChanged();
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                String s = ((Folder)object0).isAllItemsFolder() ? this.b.getResources().getString(string.picker_all_view) : ((Folder)object0).getBucketName();
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding2 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding2);
                kphotopickerFragmentPhotoPickerBinding2.currentFolder.setText(s);
                this.b.k(true);
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding3 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding3);
                Intrinsics.checkNotNull(((Boolean)object0));
                kphotopickerFragmentPhotoPickerBinding3.edit.setEnabled(((Boolean)object0).booleanValue());
                return;
            }
            case 3: {
                List list0 = (List)object0;
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                ((FolderAdapter)this.b.E.getValue()).notifyDataSetChanged();
                return;
            }
            case 4: {
                Void void1 = (Void)object0;
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding4 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding4);
                kphotopickerFragmentPhotoPickerBinding4.keFolderLoading.setVisibility(0);
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding5 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding5);
                kphotopickerFragmentPhotoPickerBinding5.kePickerPhotos.scrollToPosition(0);
                return;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.h().updateData();
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding6 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding6);
                int v = 8;
                kphotopickerFragmentPhotoPickerBinding6.keFolderLoading.setVisibility(8);
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding7 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding7);
                FastScroller fastScroller0 = kphotopickerFragmentPhotoPickerBinding7.fastScroll;
                if(((List)object0).size() > 200) {
                    v = 0;
                }
                fastScroller0.setVisibility(v);
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
                Intrinsics.checkNotNull(((Integer)object0));
                kphotopickerFragmentPhotoPickerBinding0.attachCount.setText((((int)(((Integer)object0))) <= 0 ? "" : String.valueOf(((Integer)object0))));
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
                Intrinsics.checkNotNullExpressionValue(kphotopickerFragmentPhotoPickerBinding1.attachCount, "attachCount");
                ContentDescriptionKt.setContentDescriptionWith(kphotopickerFragmentPhotoPickerBinding1.attachCount, string.cd_selected_count, new Object[]{((Integer)object0)});
            }
        }
    }
}

