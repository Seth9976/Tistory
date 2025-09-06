package com.google.android.material.snackbar;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.LanguageAdapter;
import com.kakao.kemoticon.Emoticon;
import com.kakao.kemoticon.EmoticonKeyboard;
import com.kakao.kemoticon.b;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.camera.CameraListAdapter.CameraItemViewHolder;
import com.kakao.kphotopicker.camera.CameraListAdapter;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.picker.folder.FolderItemView;
import com.kakao.kphotopicker.picker.permission.MediaPermissionAction;
import com.kakao.kphotopicker.picker.permission.MediaPermissionActionViewHolder;
import com.kakao.kphotopicker.preview.PreviewPagerAdapter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class p implements View.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;

    public p(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.c;
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                ((Snackbar)object1).getClass();
                ((View.OnClickListener)object0).onClick(view0);
                ((Snackbar)object1).dispatchDismiss(1);
                return;
            }
            case 1: {
                LanguageAdapter.a(((LanguageAdapter)object1), ((String)object0), view0);
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((b)object1), "this$0");
                Intrinsics.checkNotNullParameter(((Emoticon)object0), "$emoticon");
                ((b)object1).c.getClass();
                Intrinsics.checkNotNullParameter(((Emoticon)object0), "emoticon");
                EmoticonKeyboard emoticonKeyboard0 = ((b)object1).c.a;
                Function2 function20 = EmoticonKeyboard.access$get_emoticonClickListener$p(emoticonKeyboard0);
                if(function20 != null) {
                    function20.invoke(emoticonKeyboard0, ((Emoticon)object0));
                }
                return;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((CameraItemViewHolder)object1), "this$0");
                Intrinsics.checkNotNullParameter(((CameraListAdapter)object0), "this$1");
                switch(((CameraItemViewHolder)object1).getAdapterPosition()) {
                    case 0: {
                        CameraListAdapter.access$getOnPhotoClick$p(((CameraListAdapter)object0)).invoke();
                        return;
                    }
                    case 1: {
                        CameraListAdapter.access$getOnVideoClick$p(((CameraListAdapter)object0)).invoke();
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((FolderItemView)object0), "this$0");
                if(((ItemClickListener)object1) != null) {
                    ((ItemClickListener)object1).click(view0.getId(), ((FolderItemView)object0).getAdapterPosition());
                }
                return;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((MediaPermissionAction)object1), "$action");
                Intrinsics.checkNotNullParameter(((MediaPermissionActionViewHolder)object0), "this$0");
                ((MediaPermissionAction)object1).getOnClick().invoke(((MediaPermissionActionViewHolder)object0).e.invoke(), ((MediaPermissionActionViewHolder)object0).d);
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((MediaItem)object1), "$mediaItem");
                Intrinsics.checkNotNullParameter(((PreviewPagerAdapter)object0), "this$0");
                if(((MediaItem)object1) instanceof Video) {
                    ((PreviewPagerAdapter)object0).d.invoke(((MediaItem)object1));
                }
            }
        }
    }
}

