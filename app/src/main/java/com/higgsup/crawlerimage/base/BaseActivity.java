package com.higgsup.crawlerimage.base;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.higgsup.crawlerimage.base.event.ChangeScreenEvent;
import crawlerimage.higgsup.com.higgsupcrawlerimage.R;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by trung on 03/12/2016.
 */
public abstract class BaseActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        if (!EventBus.getDefault().isRegistered(this))
        {
            EventBus.getDefault().register(this);
        }
        setDataToView(savedInstanceState);
        BaseFragment defaultFragment = getDefaultFragment();
        if (defaultFragment != null)
        {
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, defaultFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    @Subscribe
    public void onEvent(ChangeScreenEvent event)
    {
        BaseFragment baseFragment = event.getFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.enter, R.anim.exit);
        fragmentTransaction.replace(R.id.container, baseFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    protected abstract int getLayout();

    protected abstract void setDataToView(Bundle savedInstanceState);

    public abstract BaseFragment getDefaultFragment();
}
