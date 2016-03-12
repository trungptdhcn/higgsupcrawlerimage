package com.higgsup.crawlerimage.ui;

import android.os.Bundle;
import butterknife.Bind;
import butterknife.OnClick;
import com.higgsup.crawlerimage.base.BaseFragment;
import com.higgsup.crawlerimage.base.event.ChangeScreenEvent;
import com.higgsup.crawlerimage.base.event.DataEvent;
import crawlerimage.higgsup.com.higgsupcrawlerimage.R;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by trung on 03/12/2016.
 */
public class Fragment1 extends BaseFragment
{
    @Override
    protected int getLayout()
    {
        return R.layout.fragment1;
    }

    @Override
    protected void setDataToView(Bundle savedInstanceState)
    {

    }

    @OnClick(R.id.btclick)
    public void tranfertoFragment2()
    {
        EventBus.getDefault().post(new ChangeScreenEvent(new Fragment2()));
    }
//    public void onEvent(DataEvent event)
//    {
//        String data = event.getData();
//    }
}
