package jb;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.kakao.kphotopicker.PreviewFragment;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPreviewBinding;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class a0 implements Observer {
    public final int a;
    public final PreviewFragment b;

    public a0(PreviewFragment previewFragment0, int v) {
        this.a = v;
        this.b = previewFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        switch(this.a) {
            case 0: {
                PreviewFragment previewFragment1 = this.b;
                Intrinsics.checkNotNullParameter(previewFragment1, "this$0");
                Intrinsics.checkNotNull(((Integer)object0));
                int v = (int)(((Integer)object0));
                if(v > 0) {
                    KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding1 = previewFragment1.A;
                    if(kphotopickerFragmentPhotoPreviewBinding1 != null) {
                        TextView textView0 = kphotopickerFragmentPhotoPreviewBinding1.attachPhotoButton;
                        if(textView0 != null) {
                            textView0.setAlpha(1.0f);
                            textView0.setEnabled(true);
                        }
                    }
                    KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding2 = previewFragment1.A;
                    if(kphotopickerFragmentPhotoPreviewBinding2 != null) {
                        TextView textView1 = kphotopickerFragmentPhotoPreviewBinding2.attachCount;
                        if(textView1 != null) {
                            textView1.setText(String.valueOf(v));
                            ContentDescriptionKt.setContentDescriptionWith(textView1, string.cd_selected_count, new Object[]{((Integer)object0)});
                            return;
                        }
                    }
                }
                else {
                    KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding3 = previewFragment1.A;
                    if(kphotopickerFragmentPhotoPreviewBinding3 != null) {
                        TextView textView2 = kphotopickerFragmentPhotoPreviewBinding3.attachPhotoButton;
                        if(textView2 != null) {
                            textView2.setAlpha(0.3f);
                            TextView textView3 = previewFragment1.A == null ? null : previewFragment1.A.attachPhotoButton;
                            if(textView3 != null) {
                                textView3.setEnabled(false);
                            }
                        }
                    }
                    KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding4 = previewFragment1.A;
                    if(kphotopickerFragmentPhotoPreviewBinding4 != null) {
                        TextView textView4 = kphotopickerFragmentPhotoPreviewBinding4.attachCount;
                        if(textView4 != null) {
                            textView4.setText("");
                            ContentDescriptionKt.setContentDescriptionWith(textView4, string.cd_selected_count, new Object[]{((Integer)object0)});
                        }
                    }
                }
                return;
            }
            case 1: {
                PreviewFragment previewFragment2 = this.b;
                Intrinsics.checkNotNullParameter(previewFragment2, "this$0");
                previewFragment2.E = ((List)object0).size();
                previewFragment2.B.setData(((List)object0));
                if(!previewFragment2.C) {
                    ViewPager viewPager1 = previewFragment2.A == null ? null : previewFragment2.A.previewViewpager;
                    if(viewPager1 != null) {
                        viewPager1.setCurrentItem(previewFragment2.D);
                    }
                    previewFragment2.j(previewFragment2.D);
                    previewFragment2.C = true;
                }
                return;
            }
            default: {
                Void void0 = (Void)object0;
                PreviewFragment previewFragment0 = this.b;
                Intrinsics.checkNotNullParameter(previewFragment0, "this$0");
                previewFragment0.B.notifyDataSetChanged();
                KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = previewFragment0.A;
                if(kphotopickerFragmentPhotoPreviewBinding0 != null) {
                    ViewPager viewPager0 = kphotopickerFragmentPhotoPreviewBinding0.previewViewpager;
                    if(viewPager0 != null) {
                        previewFragment0.j(viewPager0.getCurrentItem());
                    }
                }
            }
        }
    }
}

