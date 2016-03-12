package com.higgsup.crawlerimage.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.OnClick;
import com.higgsup.crawlerimage.base.BaseActivity;
import com.higgsup.crawlerimage.base.BaseFragment;
import com.higgsup.crawlerimage.base.event.DataEvent;
import crawlerimage.higgsup.com.higgsupcrawlerimage.R;
import org.greenrobot.eventbus.EventBus;

public class MainActivity extends BaseActivity
{
    @Override
    public int getLayout()
    {
        return R.layout.activity_main;
    }

    @Override
    public void setDataToView(Bundle savedInstanceState)
    {
    }

    @Override
    public BaseFragment getDefaultFragment()
    {
        return new Fragment1();
    }
}
